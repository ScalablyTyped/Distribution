package typings.physijs.PhysijsNs

import typings.three.threeMod.Object3D
import typings.three.threeMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Physijs.SliderConstraint")
@js.native
class SliderConstraint protected () extends Constraint {
  def this(objecta: Object3D, objectb: Object3D, position: Vector3) = this()
  def this(objecta: Object3D, objectb: Object3D, position: Vector3, axis: Vector3) = this()
  def disableAngularMotor(): Unit = js.native
  def disableLinearMotor(): Unit = js.native
  def enableAngularMotor(velocity: Double, acceleration: Double): Unit = js.native
  def enableLinearMotor(velocity: Double, acceleration: Double): Unit = js.native
  /* CompleteClass */
  override def getDefinition(): js.Any = js.native
  def setLimits(lin_lower: Double, lin_upper: Double, ang_lower: Double, ang_upper: Double): Unit = js.native
  def setRestitution(linear: Double, angular: Double): Unit = js.native
}

