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

trait StepperOptions extends js.Object {
  var current: js.UndefOr[Double] = js.undefined
  /**
    * PWM Controller frequency for the stepper
    */
  var frequency: js.UndefOr[Double] = js.undefined
  /**
    * number of microsteps per step
    */
  var microsteps: js.UndefOr[`8` | `16`] = js.undefined
  /**
    * Pin definition for the motor
    */
  var pins: W1
  /**
    * Pulses per second
    */
  var pps: js.UndefOr[Double] = js.undefined
  /**
    * PWM Interface Object
    */
  var pwm: js.Object
  /**
    * Revolutions per minute
    */
  var rpm: js.UndefOr[Double] = js.undefined
  /**
    * Steps per second
    */
  var sps: js.UndefOr[Double] = js.undefined
  /**
    * Steps per revolution of the stepper motor
    */
  var steps: js.UndefOr[Double] = js.undefined
  /**
    * Stepping style
    */
  var style: js.UndefOr[single | double | interleaved | microstep] = js.undefined
}

object StepperOptions {
  @scala.inline
  def apply(
    pins: W1,
    pwm: js.Object,
    current: js.UndefOr[Double] = js.undefined,
    frequency: js.UndefOr[Double] = js.undefined,
    microsteps: `8` | `16` = null,
    pps: js.UndefOr[Double] = js.undefined,
    rpm: js.UndefOr[Double] = js.undefined,
    sps: js.UndefOr[Double] = js.undefined,
    steps: js.UndefOr[Double] = js.undefined,
    style: single | double | interleaved | microstep = null
  ): StepperOptions = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any], pwm = pwm.asInstanceOf[js.Any])
    if (!js.isUndefined(current)) __obj.updateDynamic("current")(current.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frequency)) __obj.updateDynamic("frequency")(frequency.get.asInstanceOf[js.Any])
    if (microsteps != null) __obj.updateDynamic("microsteps")(microsteps.asInstanceOf[js.Any])
    if (!js.isUndefined(pps)) __obj.updateDynamic("pps")(pps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rpm)) __obj.updateDynamic("rpm")(rpm.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sps)) __obj.updateDynamic("sps")(sps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(steps)) __obj.updateDynamic("steps")(steps.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperOptions]
  }
}

