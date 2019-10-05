package typings.phaser.Phaser.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Math.RotateVec3")
@js.native
object RotateVec3 extends js.Object {
  /**
    * Rotates a vector in place by axis angle.
    * 
    * This is the same as transforming a point by an
    * axis-angle quaternion, but it has higher precision.
    * @param vec The vector to be rotated.
    * @param axis The axis to rotate around.
    * @param radians The angle of rotation in radians.
    */
  def apply(vec: Vector3, axis: Vector3, radians: Double): Vector3 = js.native
}

