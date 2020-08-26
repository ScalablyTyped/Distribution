package typings.phaser.global.Phaser.GameObjects

import typings.phaser.Phaser.Scene
import typings.phaser.integer
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
class Arc protected ()
  extends typings.phaser.Phaser.GameObjects.Arc {
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
  def this(
    scene: Scene,
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    radius: js.UndefOr[Double],
    startAngle: js.UndefOr[integer],
    endAngle: js.UndefOr[integer],
    anticlockwise: js.UndefOr[Boolean],
    fillColor: js.UndefOr[Double],
    fillAlpha: js.UndefOr[Double]
  ) = this()
}

