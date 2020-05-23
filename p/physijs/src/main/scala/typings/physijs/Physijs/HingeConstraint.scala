package typings.physijs.Physijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HingeConstraint extends Constraint {
  def disableMotor(): Unit
  def enableAngularMotor(velocity: Double, acceleration: Double): Unit
  def setLimits(low: Double, high: Double, bias_factor: Double, relaxation_factor: Double): Unit
}

object HingeConstraint {
  @scala.inline
  def apply(
    disableMotor: () => Unit,
    enableAngularMotor: (Double, Double) => Unit,
    getDefinition: () => js.Any,
    setLimits: (Double, Double, Double, Double) => Unit
  ): HingeConstraint = {
    val __obj = js.Dynamic.literal(disableMotor = js.Any.fromFunction0(disableMotor), enableAngularMotor = js.Any.fromFunction2(enableAngularMotor), getDefinition = js.Any.fromFunction0(getDefinition), setLimits = js.Any.fromFunction4(setLimits))
    __obj.asInstanceOf[HingeConstraint]
  }
}

