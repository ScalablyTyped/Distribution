package typings.phaser.phaserMod.Math

import typings.phaser.Phaser.Types.Math.Vector2Like
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("phaser", "Math.RotateTo")
@js.native
object RotateTo extends js.Object {
  
  /**
    * Position a `point` at the given `angle` and `distance` to (`x`, `y`).
    * @param point The point to be positioned.
    * @param x The horizontal coordinate to position from.
    * @param y The vertical coordinate to position from.
    * @param angle The angle of rotation in radians.
    * @param distance The distance from (x, y) to place the point at.
    */
  def apply[T /* <: Vector2Like */](point: T, x: Double, y: Double, angle: Double, distance: Double): T = js.native
}
