package typings.motorHat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DCOptions extends js.Object {
  var frequency: js.UndefOr[Double] = js.native
  /**
    * Pin definition for the motor
    */
  var pins: PinDefinition = js.native
  /**
    * PWM Interface Object
    */
  var pwm: js.Object = js.native
  var speed: js.UndefOr[Double] = js.native
}

object DCOptions {
  @scala.inline
  def apply(pins: PinDefinition, pwm: js.Object): DCOptions = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any], pwm = pwm.asInstanceOf[js.Any])
    __obj.asInstanceOf[DCOptions]
  }
  @scala.inline
  implicit class DCOptionsOps[Self <: DCOptions] (val x: Self) extends AnyVal {
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
    def setPinsVarargs(value: Double*): Self = this.set("pins", js.Array(value :_*))
    @scala.inline
    def setPins(value: PinDefinition): Self = this.set("pins", value.asInstanceOf[js.Any])
    @scala.inline
    def setPwm(value: js.Object): Self = this.set("pwm", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrequency(value: Double): Self = this.set("frequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrequency: Self = this.set("frequency", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
  }
  
}

