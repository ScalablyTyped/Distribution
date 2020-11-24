package typings.physijs.Physijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HingeConstraint extends Constraint {
  
  def disableMotor(): Unit = js.native
  
  def enableAngularMotor(velocity: Double, acceleration: Double): Unit = js.native
  
  def setLimits(low: Double, high: Double, bias_factor: Double, relaxation_factor: Double): Unit = js.native
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
  
  @scala.inline
  implicit class HingeConstraintOps[Self <: HingeConstraint] (val x: Self) extends AnyVal {
    
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
    def setDisableMotor(value: () => Unit): Self = this.set("disableMotor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnableAngularMotor(value: (Double, Double) => Unit): Self = this.set("enableAngularMotor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetLimits(value: (Double, Double, Double, Double) => Unit): Self = this.set("setLimits", js.Any.fromFunction4(value))
  }
}
