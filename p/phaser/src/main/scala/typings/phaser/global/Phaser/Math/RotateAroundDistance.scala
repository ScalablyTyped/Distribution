package typings.phaser.global.Phaser.Math

import typings.phaser.Phaser.Types.Math.Vector2Like
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Phaser.Math.RotateAroundDistance")
@js.native
object RotateAroundDistance extends js.Object {
  
  /**
    * Rotate a `point` around `x` and `y` by the given `angle` and `distance`.
    * 
    * In polar notation, this maps a point from (r, t) to (distance, t + angle), vs. the origin (x, y).
    * @param point The point to be rotated.
    * @param x The horizontal coordinate to rotate around.
    * @param y The vertical coordinate to rotate around.
    * @param angle The angle of rotation in radians.
    * @param distance The distance from (x, y) to place the point at.
    */
  def apply[T /* <: Vector2Like */](point: T, x: Double, y: Double, angle: Double, distance: Double): T = js.native
}
