package typings.physijs.Physijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderConstraint extends Constraint {
  
  def disableAngularMotor(): Unit = js.native
  
  def disableLinearMotor(): Unit = js.native
  
  def enableAngularMotor(velocity: Double, acceleration: Double): Unit = js.native
  
  def enableLinearMotor(velocity: Double, acceleration: Double): Unit = js.native
  
  def setLimits(lin_lower: Double, lin_upper: Double, ang_lower: Double, ang_upper: Double): Unit = js.native
  
  def setRestitution(linear: Double, angular: Double): Unit = js.native
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
  
  @scala.inline
  implicit class SliderConstraintOps[Self <: SliderConstraint] (val x: Self) extends AnyVal {
    
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
    def setDisableAngularMotor(value: () => Unit): Self = this.set("disableAngularMotor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisableLinearMotor(value: () => Unit): Self = this.set("disableLinearMotor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnableAngularMotor(value: (Double, Double) => Unit): Self = this.set("enableAngularMotor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnableLinearMotor(value: (Double, Double) => Unit): Self = this.set("enableLinearMotor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetLimits(value: (Double, Double, Double, Double) => Unit): Self = this.set("setLimits", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSetRestitution(value: (Double, Double) => Unit): Self = this.set("setRestitution", js.Any.fromFunction2(value))
  }
}
