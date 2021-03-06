package edu.rpi.phil.legup.puzzles.masyu;

import javax.swing.ImageIcon;

import edu.rpi.phil.legup.BoardState;
import edu.rpi.phil.legup.PuzzleRule;

public class RuleWhiteEdge extends PuzzleRule {
	private static final long serialVersionUID = 823753908L;
	
    public String getImageName()
    {
    	return "images/masyu/Rules/RuleWhiteEdge.png";
    }

	
	public RuleWhiteEdge()
	{
		setName("White Edge");
		description = "White pearls have a straight line going through them with a turn next to them.";
		image = new ImageIcon("images/masyu/Rules/RuleWhiteEdge.png");
	}
}

