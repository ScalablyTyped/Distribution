package typings
package phaserLib.PhaserNs.GameObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Curve Shape is a Game Object that can be added to a Scene, Group or Container. You can
  * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
  * it for input or physics. It provides a quick and easy way for you to render this shape in your
  * game without using a texture, while still taking advantage of being fully batched in WebGL.
  * 
  * This shape supports both fill and stroke colors.
  * 
  * To render a Curve Shape you must first create a `Phaser.Curves.Curve` object, then pass it to
  * the Curve Shape in the constructor.
  * 
  * The Curve shape also has a `smoothness` property and corresponding `setSmoothness` method.
  * This allows you to control how smooth the shape renders in WebGL, by controlling the number of iterations
  * that take place during construction. Increase and decrease the default value for smoother, or more
  * jagged, shapes.
  */
@JSGlobal("Phaser.GameObjects.Curve")
@js.native
class Curve protected () extends Shape {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param curve The Curve object to use to create the Shape.
    * @param fillColor The color the curve will be filled with, i.e. 0xff0000 for red.
    * @param fillAlpha The alpha the curve will be filled with. You can also set the alpha of the overall Shape using its `alpha` property.
    */
  def this(scene: phaserLib.PhaserNs.Scene) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, curve: phaserLib.PhaserNs.CurvesNs.Curve) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, curve: phaserLib.PhaserNs.CurvesNs.Curve, fillColor: scala.Double) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, curve: phaserLib.PhaserNs.CurvesNs.Curve, fillColor: scala.Double, fillAlpha: scala.Double) = this()
  /**
    * The smoothness of the curve. The number of points used when rendering it.
    * Increase this value for smoother curves, at the cost of more polygons being rendered.
    */
  var smoothness: phaserLib.integer = js.native
  /**
    * Sets the smoothness of the curve. The number of points used when rendering it.
    * Increase this value for smoother curves, at the cost of more polygons being rendered.
    * This call can be chained.
    * @param value The value to set the smoothness to.
    */
  def setSmoothness(value: phaserLib.integer): this.type = js.native
}

