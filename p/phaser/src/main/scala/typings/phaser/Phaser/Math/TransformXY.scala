package typings.phaser.Phaser.Math

import typings.phaser.Phaser.Geom.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Math.TransformXY")
@js.native
object TransformXY extends js.Object {
  /**
    * Takes the `x` and `y` coordinates and transforms them into the same space as
    * defined by the position, rotation and scale values.
    * @param x The x coordinate to be transformed.
    * @param y The y coordinate to be transformed.
    * @param positionX Horizontal position of the transform point.
    * @param positionY Vertical position of the transform point.
    * @param rotation Rotation of the transform point, in radians.
    * @param scaleX Horizontal scale of the transform point.
    * @param scaleY Vertical scale of the transform point.
    * @param output The output vector, point or object for the translated coordinates.
    */
  def apply(
    x: Double,
    y: Double,
    positionX: Double,
    positionY: Double,
    rotation: Double,
    scaleX: Double,
    scaleY: Double
  ): Vector2 | Point | js.Object = js.native
  def apply(
    x: Double,
    y: Double,
    positionX: Double,
    positionY: Double,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    output: js.Object
  ): Vector2 | Point | js.Object = js.native
  def apply(
    x: Double,
    y: Double,
    positionX: Double,
    positionY: Double,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    output: Point
  ): Vector2 | Point | js.Object = js.native
  def apply(
    x: Double,
    y: Double,
    positionX: Double,
    positionY: Double,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    output: Vector2
  ): Vector2 | Point | js.Object = js.native
}

