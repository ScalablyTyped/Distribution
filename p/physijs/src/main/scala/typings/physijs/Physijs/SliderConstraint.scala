package typings.physijs.Physijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderConstraint extends Constraint {
  def disableAngularMotor(): Unit
  def disableLinearMotor(): Unit
  def enableAngularMotor(velocity: Double, acceleration: Double): Unit
  def enableLinearMotor(velocity: Double, acceleration: Double): Unit
  def setLimits(lin_lower: Double, lin_upper: Double, ang_lower: Double, ang_upper: Double): Unit
  def setRestitution(linear: Double, angular: Double): Unit
}

object SliderConstraint {
  @scala.inline
  def apply(
    disableAngularMotor: () => Unit,
    disableLinearMotor: () => Unit,
    enableAngularMotor: (Double, Double) => Unit,
    enableLinearMotor: (Double, Double) => Unit,
    getDefinition: () => js.Any,
    setLimits: (Double, Double, Double, Double) => Unit,
    setRestitution: (Double, Double) => Unit
  ): SliderConstraint = {
    val __obj = js.Dynamic.literal(disableAngularMotor = js.Any.fromFunction0(disableAngularMotor), disableLinearMotor = js.Any.fromFunction0(disableLinearMotor), enableAngularMotor = js.Any.fromFunction2(enableAngularMotor), enableLinearMotor = js.Any.fromFunction2(enableLinearMotor), getDefinition = js.Any.fromFunction0(getDefinition), setLimits = js.Any.fromFunction4(setLimits), setRestitution = js.Any.fromFunction2(setRestitution))
    __obj.asInstanceOf[SliderConstraint]
  }
}

