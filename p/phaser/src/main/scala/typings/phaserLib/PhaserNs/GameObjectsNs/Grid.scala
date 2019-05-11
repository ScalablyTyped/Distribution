package typings
package phaserLib.PhaserNs.GameObjectsNs

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
@JSGlobal("Phaser.GameObjects.Grid")
@js.native
class Grid protected () extends Shape {
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
  def this(scene: phaserLib.PhaserNs.Scene, x: js.UndefOr[scala.Double], y: js.UndefOr[scala.Double], width: js.UndefOr[scala.Double], height: js.UndefOr[scala.Double], cellWidth: js.UndefOr[scala.Double], cellHeight: js.UndefOr[scala.Double], fillColor: js.UndefOr[scala.Double], fillAlpha: js.UndefOr[scala.Double], outlineFillColor: js.UndefOr[scala.Double], outlineFillAlpha: js.UndefOr[scala.Double]) = this()
  /**
    * The alpha the alternating grid cells will be filled with.
    * You can also set the alpha of the overall Shape using its `alpha` property.
    */
  var altFillAlpha: scala.Double = js.native
  /**
    * The color the alternating grid cells will be filled with, i.e. 0xff0000 for red.
    */
  var altFillColor: scala.Double = js.native
  /**
    * The height of each grid cell.
    * Must be a positive value.
    */
  var cellHeight: scala.Double = js.native
  /**
    * The width of each grid cell.
    * Must be a positive value.
    */
  var cellWidth: scala.Double = js.native
  /**
    * The alpha value for the color of the lines between each grid cell.
    */
  var outlineFillAlpha: scala.Double = js.native
  /**
    * The color of the lines between each grid cell.
    */
  var outlineFillColor: scala.Double = js.native
  /**
    * Will the grid render the alternating cells in the `altFillColor`?
    */
  var showAltCells: scala.Boolean = js.native
  /**
    * Will the grid render its cells in the `fillColor`?
    */
  var showCells: scala.Boolean = js.native
  /**
    * Will the grid display the lines between each cell when it renders?
    */
  var showOutline: scala.Boolean = js.native
  /**
    * Sets the fill color and alpha level that the alternating grid cells will use.
    * 
    * If this method is called with no values then alternating grid cells will not be rendered in a different color.
    * 
    * Also see the `setOutlineStyle` and `setFillStyle` methods.
    * 
    * This call can be chained.
    * @param fillColor The color the alternating grid cells will be filled with, i.e. 0xff0000 for red.
    * @param fillAlpha The alpha the alternating grid cells will be filled with. You can also set the alpha of the overall Shape using its `alpha` property. Default 1.
    */
  def setAltFillStyle(): this.type = js.native
  def setAltFillStyle(fillColor: scala.Double): this.type = js.native
  def setAltFillStyle(fillColor: scala.Double, fillAlpha: scala.Double): this.type = js.native
  /**
    * Sets the fill color and alpha level that the lines between each grid cell will use.
    * 
    * If this method is called with no values then the grid lines will not be rendered at all, however
    * the cells themselves may still be if they have colors set.
    * 
    * Also see the `setFillStyle` and `setAltFillStyle` methods.
    * 
    * This call can be chained.
    * @param fillColor The color the lines between the grid cells will be filled with, i.e. 0xff0000 for red.
    * @param fillAlpha The alpha the lines between the grid cells will be filled with. You can also set the alpha of the overall Shape using its `alpha` property. Default 1.
    */
  def setOutlineStyle(): this.type = js.native
  def setOutlineStyle(fillColor: scala.Double): this.type = js.native
  def setOutlineStyle(fillColor: scala.Double, fillAlpha: scala.Double): this.type = js.native
}

