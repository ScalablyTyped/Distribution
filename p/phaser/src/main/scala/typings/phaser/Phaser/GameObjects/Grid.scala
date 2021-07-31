package typings.phaser.Phaser.GameObjects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait Grid
  extends StObject
     with Shape {
  
  /**
    * The alpha the alternating grid cells will be filled with.
    * You can also set the alpha of the overall Shape using its `alpha` property.
    */
  var altFillAlpha: Double = js.native
  
  /**
    * The color the alternating grid cells will be filled with, i.e. 0xff0000 for red.
    */
  var altFillColor: Double = js.native
  
  /**
    * The height of each grid cell.
    * Must be a positive value.
    */
  var cellHeight: Double = js.native
  
  /**
    * The width of each grid cell.
    * Must be a positive value.
    */
  var cellWidth: Double = js.native
  
  /**
    * The alpha value for the color of the lines between each grid cell.
    */
  var outlineFillAlpha: Double = js.native
  
  /**
    * The color of the lines between each grid cell.
    */
  var outlineFillColor: Double = js.native
  
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
  def setAltFillStyle(fillColor: Double): this.type = js.native
  def setAltFillStyle(fillColor: Double, fillAlpha: Double): this.type = js.native
  def setAltFillStyle(fillColor: Unit, fillAlpha: Double): this.type = js.native
  
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
  def setOutlineStyle(fillColor: Double): this.type = js.native
  def setOutlineStyle(fillColor: Double, fillAlpha: Double): this.type = js.native
  def setOutlineStyle(fillColor: Unit, fillAlpha: Double): this.type = js.native
  
  /**
    * Will the grid render the alternating cells in the `altFillColor`?
    */
  var showAltCells: Boolean = js.native
  
  /**
    * Will the grid render its cells in the `fillColor`?
    */
  var showCells: Boolean = js.native
  
  /**
    * Will the grid display the lines between each cell when it renders?
    */
  var showOutline: Boolean = js.native
}
