package typings.physijs.PhysijsNs

import typings.three.threeMod.Euler
import typings.three.threeMod.Matrix4
import typings.three.threeMod.Object3D
import typings.three.threeMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Physijs.ConeTwistConstraint")
@js.native
class ConeTwistConstraint protected () extends Constraint {
  def this(objecta: Object3D, objectb: Object3D, position: Vector3) = this()
  def disableMotor(): Unit = js.native
  def enableMotor(): Unit = js.native
  /* CompleteClass */
  override def getDefinition(): js.Any = js.native
  def setLimit(x: Double, y: Double, z: Double): Unit = js.native
  def setMaxMotorImpulse(max_impulse: Double): Unit = js.native
  def setMotorTarget(target: Euler): Unit = js.native
  def setMotorTarget(target: Matrix4): Unit = js.native
  def setMotorTarget(target: Vector3): Unit = js.native
}

