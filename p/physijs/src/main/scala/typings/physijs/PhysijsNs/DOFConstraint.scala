package typings.physijs.PhysijsNs

import typings.three.threeMod.Object3D
import typings.three.threeMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Physijs.DOFConstraint")
@js.native
class DOFConstraint protected () extends Constraint {
  def this(objecta: Object3D, objectb: Object3D) = this()
  def this(objecta: Object3D, objectb: Object3D, position: Vector3) = this()
  def configureAngularMotor(which: Double, low_angle: Double, high_angle: Double, velocity: Double, max_force: Double): Unit = js.native
  def disableAngularMotor(which: Double): Unit = js.native
  def enableAngularMotor(which: Double): Unit = js.native
  /* CompleteClass */
  override def getDefinition(): js.Any = js.native
  def setAngularLowerLimit(limit: Vector3): Unit = js.native
  def setAngularUpperLimit(limit: Vector3): Unit = js.native
  def setLinearLowerLimit(limit: Vector3): Unit = js.native
  def setLinearUpperLimit(limit: Vector3): Unit = js.native
}

