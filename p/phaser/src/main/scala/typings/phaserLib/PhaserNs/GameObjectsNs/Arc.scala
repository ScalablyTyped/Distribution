package typings
package phaserLib.PhaserNs.GameObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Arc Shape is a Game Object that can be added to a Scene, Group or Container. You can
  * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
  * it for input or physics. It provides a quick and easy way for you to render this shape in your
  * game without using a texture, while still taking advantage of being fully batched in WebGL.
  * 
  * This shape supports both fill and stroke colors.
  * 
  * When it renders it displays an arc shape. You can control the start and end angles of the arc,
  * as well as if the angles are winding clockwise or anti-clockwise. With the default settings
  * it renders as a complete circle. By changing the angles you can create other arc shapes,
  * such as half-circles.
  * 
  * Arcs also have an `iterations` property and corresponding `setIterations` method. This allows
  * you to control how smooth the shape renders in WebGL, by controlling the number of iterations
  * that take place during construction.
  */
@JSGlobal("Phaser.GameObjects.Arc")
@js.native
class Arc protected () extends Shape {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param radius The radius of the arc. Default 128.
    * @param startAngle The start angle of the arc, in degrees. Default 0.
    * @param endAngle The end angle of the arc, in degrees. Default 360.
    * @param anticlockwise The winding order of the start and end angles. Default false.
    * @param fillColor The color the arc will be filled with, i.e. 0xff0000 for red.
    * @param fillAlpha The alpha the arc will be filled with. You can also set the alpha of the overall Shape using its `alpha` property.
    */
  def this(scene: phaserLib.PhaserNs.Scene, x: js.UndefOr[scala.Double], y: js.UndefOr[scala.Double], radius: js.UndefOr[scala.Double], startAngle: js.UndefOr[phaserLib.integer], endAngle: js.UndefOr[phaserLib.integer], anticlockwise: js.UndefOr[scala.Boolean], fillColor: js.UndefOr[scala.Double], fillAlpha: js.UndefOr[scala.Double]) = this()
  /**
    * The winding order of the start and end angles.
    */
  var anticlockwise: scala.Boolean = js.native
  /**
    * The end angle of the arc, in degrees.
    */
  var endAngle: phaserLib.integer = js.native
  /**
    * The number of iterations used when drawing the arc.
    * Increase this value for smoother arcs, at the cost of more polygons being rendered.
    * Modify this value by small amounts, such as 0.01.
    */
  var iterations: scala.Double = js.native
  /**
    * The radius of the arc.
    */
  var radius: scala.Double = js.native
  /**
    * The start angle of the arc, in degrees.
    */
  var startAngle: phaserLib.integer = js.native
  /**
    * Sets the ending angle of the arc, in degrees.
    * This call can be chained.
    * @param value The value to set the ending angle to.
    */
  def setEndAngle(value: phaserLib.integer): this.type = js.native
  /**
    * Sets the number of iterations used when drawing the arc.
    * Increase this value for smoother arcs, at the cost of more polygons being rendered.
    * Modify this value by small amounts, such as 0.01.
    * This call can be chained.
    * @param value The value to set the iterations to.
    */
  def setIterations(value: scala.Double): this.type = js.native
  /**
    * Sets the radius of the arc.
    * This call can be chained.
    * @param value The value to set the radius to.
    */
  def setRadius(value: scala.Double): this.type = js.native
  /**
    * Sets the starting angle of the arc, in degrees.
    * This call can be chained.
    * @param value The value to set the starting angle to.
    */
  def setStartAngle(value: phaserLib.integer): this.type = js.native
}

