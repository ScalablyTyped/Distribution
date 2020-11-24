package typings.motorHat.mod

import typings.motorHat.anon.W2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MotorHatOptions extends js.Object {
  
  /**
    * i2c address of the PWM chip on the MotorHat.
    *
    * * 0x6F for knockoff HATs.
    *
    * * 0x60 for official AdaFruit HATs??
    */
  var address: js.UndefOr[Double] = js.native
  
  /**
    * i2c driver devfile number. Varies by RaspBerry version.
    * Should be automatically detected.
    */
  var busnum: js.UndefOr[Double] = js.native
  
  /**
    * Definition of the DC motors connected to the HAT.
    * At most 4 DCs, each should be one of following: 'M1', 'M2', 'M3', 'M4' depending on
    * port the motor is connected to.
    */
  var dcs: js.UndefOr[js.Array[Motor]] = js.native
  
  /**
    * Definition of the servos connected to the HAT.
    * List of the channels that have servos connected to them. 0 to 15.
    */
  var servos: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Definition of the stepper motors connected to the HAT.
    * At most 2 steppers, each motor is represented by either an object of the form
    * { W1: winding, W2: winding }. Each winding should be one of following: 'M1', 'M2', 'M3',
    * 'M4' depending on the port the stepper is connected to. Correct example: { W1: 'M3', W2: 'M1' }
    */
  var steppers: js.UndefOr[js.Array[W2]] = js.native
}
object MotorHatOptions {
  
  @scala.inline
  def apply(): MotorHatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotorHatOptions]
  }
  
  @scala.inline
  implicit class MotorHatOptionsOps[Self <: MotorHatOptions] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: Double): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setBusnum(value: Double): Self = this.set("busnum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBusnum: Self = this.set("busnum", js.undefined)
    
    @scala.inline
    def setDcsVarargs(value: Motor*): Self = this.set("dcs", js.Array(value :_*))
    
    @scala.inline
    def setDcs(value: js.Array[Motor]): Self = this.set("dcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDcs: Self = this.set("dcs", js.undefined)
    
    @scala.inline
    def setServosVarargs(value: Double*): Self = this.set("servos", js.Array(value :_*))
    
    @scala.inline
    def setServos(value: js.Array[Double]): Self = this.set("servos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServos: Self = this.set("servos", js.undefined)
    
    @scala.inline
    def setSteppersVarargs(value: W2*): Self = this.set("steppers", js.Array(value :_*))
    
    @scala.inline
    def setSteppers(value: js.Array[W2]): Self = this.set("steppers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSteppers: Self = this.set("steppers", js.undefined)
  }
}
