package typings.phaser.phaserMod.GameObjects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Grid Shape is a Game Object that can be added to a Scene, Group or Container. You can
  * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
  * it for input or physics. It provides a quick and easy way for you to render this shape in your
  * game without using a texture, while still taking advantage of being fully batched in WebGL.
  * 
  * This shape supports only fill colors and cannot be stroked.
  * 
  * A Grid Shape allows you to display a grid in your game, where you can control the size of the
  * grid as well as the width and height of the grid cells. You can set a fill color for each grid
  * cell as well as an alternate fill color. When the alternate fill color is set then the grid
  * cells will alternate the fill colors as they render, creating a chess-board effect. You can
  * also optionally have an outline fill color. If set, this draws lines between the grid cells
  * in the given color. If you specify an outline color with an alpha of zero, then it will draw
  * the cells spaced out, but without the lines between them.
  */
@JSImport("phaser", "GameObjects.Grid")
@js.native
class Grid protected ()
  extends typings.phaser.Phaser.GameObjects.Grid {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param width The width of the grid. Default 128.
    * @param height The height of the grid. Default 128.
    * @param cellWidth The width of one cell in the grid. Default 32.
    * @param cellHeight The height of one cell in the grid. Default 32.
    * @param fillColor The color the grid cells will be filled with, i.e. 0xff0000 for red.
    * @param fillAlpha The alpha the grid cells will be filled with. You can also set the alpha of the overall Shape using its `alpha` property.
    * @param outlineFillColor The color of the lines between the grid cells. See the `setOutline` method.
    * @param outlineFillAlpha The alpha of the lines between the grid cells.
    */
  def this(
    scene: typings.phaser.Phaser.Scene,
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    width: js.UndefOr[Double],
    height: js.UndefOr[Double],
    cellWidth: js.UndefOr[Double],
    cellHeight: js.UndefOr[Double],
    fillColor: js.UndefOr[Double],
    fillAlpha: js.UndefOr[Double],
    outlineFillColor: js.UndefOr[Double],
    outlineFillAlpha: js.UndefOr[Double]
  ) = this()
}

