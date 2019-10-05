package typings.phaser.Phaser.Math

import typings.phaser.Phaser.Geom.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Math.RotateAroundDistance")
@js.native
object RotateAroundDistance extends js.Object {
  def apply(point: js.Object, x: Double, y: Double, angle: Double, distance: Double): Point = js.native
  /**
    * Rotate a `point` around `x` and `y` by the given `angle` and `distance`.
    * @param point The point to be rotated.
    * @param x The horizontal coordinate to rotate around.
    * @param y The vertical coordinate to rotate around.
    * @param angle The angle of rotation in radians.
    * @param distance The distance from (x, y) to place the point at.
    */
  def apply(point: Point, x: Double, y: Double, angle: Double, distance: Double): Point = js.native
}

