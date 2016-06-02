package com.balacraft.balapiano.view;

import com.balacraft.balapiano.soundengine.SoundSystem;

import com.badlogic.gdx.math.Rectangle;

public class ChordVariationButton  extends Button {
	//maj, min, etc
	private int chord_variation;
	private SoundSystem ss;
	
	public ChordVariationButton(int chord_variation,SoundSystem ss) {
		this.ss = ss;
		this.chord_variation=chord_variation;
	}

	@Override
	public void fire() {
		ss.setChordVariation(chord_variation);
	}

	@Override
	public boolean isPressed() {
		return ss.isChordVariationPressed(chord_variation);
	}

	@Override
	public void draggedFromTo(int x1, int y1, int x2, int y2) {

	}

}
