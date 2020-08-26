package typings.motorHat.mod

import typings.motorHat.anon.W1
import typings.motorHat.motorHatNumbers.`16`
import typings.motorHat.motorHatNumbers.`8`
import typings.motorHat.motorHatStrings.double
import typings.motorHat.motorHatStrings.interleaved
import typings.motorHat.motorHatStrings.microstep
import typings.motorHat.motorHatStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepperOptions extends js.Object {
  var current: js.UndefOr[Double] = js.native
  /**
    * PWM Controller frequency for the stepper
    */
  var frequency: js.UndefOr[Double] = js.native
  /**
    * number of microsteps per step
    */
  var microsteps: js.UndefOr[`8` | `16`] = js.native
  /**
    * Pin definition for the motor
    */
  var pins: W1 = js.native
  /**
    * Pulses per second
    */
  var pps: js.UndefOr[Double] = js.native
  /**
    * PWM Interface Object
    */
  var pwm: js.Object = js.native
  /**
    * Revolutions per minute
    */
  var rpm: js.UndefOr[Double] = js.native
  /**
    * Steps per second
    */
  var sps: js.UndefOr[Double] = js.native
  /**
    * Steps per revolution of the stepper motor
    */
  var steps: js.UndefOr[Double] = js.native
  /**
    * Stepping style
    */
  var style: js.UndefOr[single | double | interleaved | microstep] = js.native
}

object StepperOptions {
  @scala.inline
  def apply(pins: W1, pwm: js.Object): StepperOptions = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any], pwm = pwm.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperOptions]
  }
  @scala.inline
  implicit class StepperOptionsOps[Self <: StepperOptions] (val x: Self) extends AnyVal {
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
    def setPins(value: W1): Self = this.set("pins", value.asInstanceOf[js.Any])
    @scala.inline
    def setPwm(value: js.Object): Self = this.set("pwm", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrent(value: Double): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
    @scala.inline
    def setFrequency(value: Double): Self = this.set("frequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrequency: Self = this.set("frequency", js.undefined)
    @scala.inline
    def setMicrosteps(value: `8` | `16`): Self = this.set("microsteps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMicrosteps: Self = this.set("microsteps", js.undefined)
    @scala.inline
    def setPps(value: Double): Self = this.set("pps", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePps: Self = this.set("pps", js.undefined)
    @scala.inline
    def setRpm(value: Double): Self = this.set("rpm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRpm: Self = this.set("rpm", js.undefined)
    @scala.inline
    def setSps(value: Double): Self = this.set("sps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSps: Self = this.set("sps", js.undefined)
    @scala.inline
    def setSteps(value: Double): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
    @scala.inline
    def setStyle(value: single | double | interleaved | microstep): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

