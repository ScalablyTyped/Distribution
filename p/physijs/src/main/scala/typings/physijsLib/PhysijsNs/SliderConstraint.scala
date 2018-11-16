package typings
package physijsLib.PhysijsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Physijs.SliderConstraint")
@js.native
class SliderConstraint protected () extends Constraint {
  def this(objecta: threeLib.threeMod.Object3D, objectb: threeLib.threeMod.Object3D, position: threeLib.threeMod.Vector3) = this()
  def this(objecta: threeLib.threeMod.Object3D, objectb: threeLib.threeMod.Object3D, position: threeLib.threeMod.Vector3, axis: threeLib.threeMod.Vector3) = this()
  def disableAngularMotor(): scala.Unit = js.native
  def disableLinearMotor(): scala.Unit = js.native
  def enableAngularMotor(velocity: scala.Double, acceleration: scala.Double): scala.Unit = js.native
  def enableLinearMotor(velocity: scala.Double, acceleration: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def getDefinition(): js.Any = js.native
  def setLimits(lin_lower: scala.Double, lin_upper: scala.Double, ang_lower: scala.Double, ang_upper: scala.Double): scala.Unit = js.native
  def setRestitution(linear: scala.Double, angular: scala.Double): scala.Unit = js.native
}

