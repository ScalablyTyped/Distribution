package typings.physijs.PhysijsNs

import typings.three.threeMod.Object3D
import typings.three.threeMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Physijs.HingeConstraint")
@js.native
class HingeConstraint protected () extends Constraint {
  def this(objecta: Object3D, objectb: Object3D, position: Vector3) = this()
  def this(objecta: Object3D, objectb: Object3D, position: Vector3, axis: Vector3) = this()
  def disableMotor(): Unit = js.native
  def enableAngularMotor(velocity: Double, acceleration: Double): Unit = js.native
  /* CompleteClass */
  override def getDefinition(): js.Any = js.native
  def setLimits(low: Double, high: Double, bias_factor: Double, relaxation_factor: Double): Unit = js.native
}

