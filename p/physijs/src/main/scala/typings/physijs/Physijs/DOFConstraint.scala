package typings.physijs.Physijs

import typings.three.mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOFConstraint extends Constraint {
  def configureAngularMotor(which: Double, low_angle: Double, high_angle: Double, velocity: Double, max_force: Double): Unit
  def disableAngularMotor(which: Double): Unit
  def enableAngularMotor(which: Double): Unit
  def setAngularLowerLimit(limit: Vector3): Unit
  def setAngularUpperLimit(limit: Vector3): Unit
  def setLinearLowerLimit(limit: Vector3): Unit
  def setLinearUpperLimit(limit: Vector3): Unit
}

object DOFConstraint {
  @scala.inline
  def apply(
    configureAngularMotor: (Double, Double, Double, Double, Double) => Unit,
    disableAngularMotor: Double => Unit,
    enableAngularMotor: Double => Unit,
    getDefinition: () => js.Any,
    setAngularLowerLimit: Vector3 => Unit,
    setAngularUpperLimit: Vector3 => Unit,
    setLinearLowerLimit: Vector3 => Unit,
    setLinearUpperLimit: Vector3 => Unit
  ): DOFConstraint = {
    val __obj = js.Dynamic.literal(configureAngularMotor = js.Any.fromFunction5(configureAngularMotor), disableAngularMotor = js.Any.fromFunction1(disableAngularMotor), enableAngularMotor = js.Any.fromFunction1(enableAngularMotor), getDefinition = js.Any.fromFunction0(getDefinition), setAngularLowerLimit = js.Any.fromFunction1(setAngularLowerLimit), setAngularUpperLimit = js.Any.fromFunction1(setAngularUpperLimit), setLinearLowerLimit = js.Any.fromFunction1(setLinearLowerLimit), setLinearUpperLimit = js.Any.fromFunction1(setLinearUpperLimit))
    __obj.asInstanceOf[DOFConstraint]
  }
}

