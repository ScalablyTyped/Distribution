package typings
package physijsLib.PhysijsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Physijs.DOFConstraint")
@js.native
class DOFConstraint protected () extends Constraint {
  def this(objecta: threeLib.threeMod.Object3D, objectb: threeLib.threeMod.Object3D) = this()
  def this(objecta: threeLib.threeMod.Object3D, objectb: threeLib.threeMod.Object3D, position: threeLib.threeMod.Vector3) = this()
  def configureAngularMotor(
    which: scala.Double,
    low_angle: scala.Double,
    high_angle: scala.Double,
    velocity: scala.Double,
    max_force: scala.Double
  ): scala.Unit = js.native
  def disableAngularMotor(which: scala.Double): scala.Unit = js.native
  def enableAngularMotor(which: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def getDefinition(): js.Any = js.native
  def setAngularLowerLimit(limit: threeLib.threeMod.Vector3): scala.Unit = js.native
  def setAngularUpperLimit(limit: threeLib.threeMod.Vector3): scala.Unit = js.native
  def setLinearLowerLimit(limit: threeLib.threeMod.Vector3): scala.Unit = js.native
  def setLinearUpperLimit(limit: threeLib.threeMod.Vector3): scala.Unit = js.native
}

