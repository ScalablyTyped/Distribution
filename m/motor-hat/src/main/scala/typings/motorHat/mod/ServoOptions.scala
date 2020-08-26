package typings.motorHat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServoOptions extends js.Object {
  /**
    * PWM Controller frequency for the servo
    */
  var freq: js.UndefOr[Double] = js.native
  /**
    * Duration in ms of pulse at position 100
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * Duration in ms of pulse at position 0
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * Servo controller pin. Which pin (0 to 15) is the servo connected to?
    */
  var pin: Double = js.native
  /**
    * PWM Interface Object
    */
  var pwm: js.Object = js.native
}

object ServoOptions {
  @scala.inline
  def apply(pin: Double, pwm: js.Object): ServoOptions = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any], pwm = pwm.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServoOptions]
  }
  @scala.inline
  implicit class ServoOptionsOps[Self <: ServoOptions] (val x: Self) extends AnyVal {
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
    def setPin(value: Double): Self = this.set("pin", value.asInstanceOf[js.Any])
    @scala.inline
    def setPwm(value: js.Object): Self = this.set("pwm", value.asInstanceOf[js.Any])
    @scala.inline
    def setFreq(value: Double): Self = this.set("freq", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreq: Self = this.set("freq", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
  
}

