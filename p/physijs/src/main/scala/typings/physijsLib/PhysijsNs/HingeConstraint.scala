package typings
package physijsLib.PhysijsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Physijs.HingeConstraint")
@js.native
class HingeConstraint protected () extends Constraint {
  def this(objecta: threeLib.threeMod.Object3D, objectb: threeLib.threeMod.Object3D, position: threeLib.threeMod.Vector3) = this()
  def this(objecta: threeLib.threeMod.Object3D, objectb: threeLib.threeMod.Object3D, position: threeLib.threeMod.Vector3, axis: threeLib.threeMod.Vector3) = this()
  def disableMotor(): scala.Unit = js.native
  def enableAngularMotor(velocity: scala.Double, acceleration: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def getDefinition(): js.Any = js.native
  def setLimits(low: scala.Double, high: scala.Double, bias_factor: scala.Double, relaxation_factor: scala.Double): scala.Unit = js.native
}

