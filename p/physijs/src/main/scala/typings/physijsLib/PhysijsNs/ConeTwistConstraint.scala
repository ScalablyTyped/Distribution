package typings
package physijsLib.PhysijsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Physijs.ConeTwistConstraint")
@js.native
class ConeTwistConstraint protected () extends Constraint {
  def this(objecta: threeLib.threeMod.Object3D, objectb: threeLib.threeMod.Object3D, position: threeLib.threeMod.Vector3) = this()
  def disableMotor(): scala.Unit = js.native
  def enableMotor(): scala.Unit = js.native
  /* CompleteClass */
  override def getDefinition(): js.Any = js.native
  def setLimit(x: scala.Double, y: scala.Double, z: scala.Double): scala.Unit = js.native
  def setMaxMotorImpulse(max_impulse: scala.Double): scala.Unit = js.native
  def setMotorTarget(target: threeLib.threeMod.Euler): scala.Unit = js.native
  def setMotorTarget(target: threeLib.threeMod.Matrix4): scala.Unit = js.native
  def setMotorTarget(target: threeLib.threeMod.Vector3): scala.Unit = js.native
}

