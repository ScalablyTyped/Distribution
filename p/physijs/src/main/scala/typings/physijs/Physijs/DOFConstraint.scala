package typings.physijs.Physijs

import typings.three.mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOFConstraint extends Constraint {
  def configureAngularMotor(which: Double, low_angle: Double, high_angle: Double, velocity: Double, max_force: Double): Unit = js.native
  def disableAngularMotor(which: Double): Unit = js.native
  def enableAngularMotor(which: Double): Unit = js.native
  def setAngularLowerLimit(limit: Vector3): Unit = js.native
  def setAngularUpperLimit(limit: Vector3): Unit = js.native
  def setLinearLowerLimit(limit: Vector3): Unit = js.native
  def setLinearUpperLimit(limit: Vector3): Unit = js.native
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
  @scala.inline
  implicit class DOFConstraintOps[Self <: DOFConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfigureAngularMotor(value: (Double, Double, Double, Double, Double) => Unit): Self = this.set("configureAngularMotor", js.Any.fromFunction5(value))
    @scala.inline
    def setDisableAngularMotor(value: Double => Unit): Self = this.set("disableAngularMotor", js.Any.fromFunction1(value))
    @scala.inline
    def setEnableAngularMotor(value: Double => Unit): Self = this.set("enableAngularMotor", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAngularLowerLimit(value: Vector3 => Unit): Self = this.set("setAngularLowerLimit", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAngularUpperLimit(value: Vector3 => Unit): Self = this.set("setAngularUpperLimit", js.Any.fromFunction1(value))
    @scala.inline
    def setSetLinearLowerLimit(value: Vector3 => Unit): Self = this.set("setLinearLowerLimit", js.Any.fromFunction1(value))
    @scala.inline
    def setSetLinearUpperLimit(value: Vector3 => Unit): Self = this.set("setLinearUpperLimit", js.Any.fromFunction1(value))
  }
  
}

