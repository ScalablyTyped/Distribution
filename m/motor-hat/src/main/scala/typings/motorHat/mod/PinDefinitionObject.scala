package typings.motorHat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PinDefinitionObject extends js.Object {
  
  /**
    * Pin number of the first coil output
    */
  var IN1: Double = js.native
  
  /**
    * Pin number of the second coil output
    */
  var IN2: Double = js.native
  
  /**
    * Pin number of the PWM output
    */
  var PWM: Double = js.native
}
object PinDefinitionObject {
  
  @scala.inline
  def apply(IN1: Double, IN2: Double, PWM: Double): PinDefinitionObject = {
    val __obj = js.Dynamic.literal(IN1 = IN1.asInstanceOf[js.Any], IN2 = IN2.asInstanceOf[js.Any], PWM = PWM.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinDefinitionObject]
  }
  
  @scala.inline
  implicit class PinDefinitionObjectOps[Self <: PinDefinitionObject] (val x: Self) extends AnyVal {
    
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
    def setIN1(value: Double): Self = this.set("IN1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIN2(value: Double): Self = this.set("IN2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPWM(value: Double): Self = this.set("PWM", value.asInstanceOf[js.Any])
  }
}
