package typings.motorHat.mod

import typings.motorHat.AnonW1
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
  var pins: AnonW1
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
    pins: AnonW1,
    pwm: js.Object,
    current: Int | Double = null,
    frequency: Int | Double = null,
    microsteps: `8` | `16` = null,
    pps: Int | Double = null,
    rpm: Int | Double = null,
    sps: Int | Double = null,
    steps: Int | Double = null,
    style: single | double | interleaved | microstep = null
  ): StepperOptions = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any], pwm = pwm.asInstanceOf[js.Any])
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    if (microsteps != null) __obj.updateDynamic("microsteps")(microsteps.asInstanceOf[js.Any])
    if (pps != null) __obj.updateDynamic("pps")(pps.asInstanceOf[js.Any])
    if (rpm != null) __obj.updateDynamic("rpm")(rpm.asInstanceOf[js.Any])
    if (sps != null) __obj.updateDynamic("sps")(sps.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperOptions]
  }
}

