package typings.phaser.global.Phaser.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(vec: typings.phaser.Phaser.Math.Vector3, axis: typings.phaser.Phaser.Math.Vector3, radians: Double): typings.phaser.Phaser.Math.Vector3 = js.native
}
