package typings
package motorDashHatLib.motorDashHatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepperOptions extends js.Object {
  var current: js.UndefOr[scala.Double] = js.undefined
  /**
    * PWM Controller frequency for the stepper
    */
  var frequency: js.UndefOr[scala.Double] = js.undefined
  /**
    * number of microsteps per step
    */
  var microsteps: js.UndefOr[
    motorDashHatLib.motorDashHatLibNumbers.`8` | motorDashHatLib.motorDashHatLibNumbers.`16`
  ] = js.undefined
  /**
    * Pin definition for the motor
    */
  var pins: motorDashHatLib.Anon_W1
  /**
    * Pulses per second
    */
  var pps: js.UndefOr[scala.Double] = js.undefined
  /**
    * PWM Interface Object
    */
  var pwm: js.Object
  /**
    * Revolutions per minute
    */
  var rpm: js.UndefOr[scala.Double] = js.undefined
  /**
    * Steps per second
    */
  var sps: js.UndefOr[scala.Double] = js.undefined
  /**
    * Steps per revolution of the stepper motor
    */
  var steps: js.UndefOr[scala.Double] = js.undefined
  /**
    * Stepping style
    */
  var style: js.UndefOr[
    motorDashHatLib.motorDashHatLibStrings.single | motorDashHatLib.motorDashHatLibStrings.double | motorDashHatLib.motorDashHatLibStrings.interleaved | motorDashHatLib.motorDashHatLibStrings.microstep
  ] = js.undefined
}

object StepperOptions {
  @scala.inline
  def apply(
    pins: motorDashHatLib.Anon_W1,
    pwm: js.Object,
    current: scala.Int | scala.Double = null,
    frequency: scala.Int | scala.Double = null,
    microsteps: motorDashHatLib.motorDashHatLibNumbers.`8` | motorDashHatLib.motorDashHatLibNumbers.`16` = null,
    pps: scala.Int | scala.Double = null,
    rpm: scala.Int | scala.Double = null,
    sps: scala.Int | scala.Double = null,
    steps: scala.Int | scala.Double = null,
    style: motorDashHatLib.motorDashHatLibStrings.single | motorDashHatLib.motorDashHatLibStrings.double | motorDashHatLib.motorDashHatLibStrings.interleaved | motorDashHatLib.motorDashHatLibStrings.microstep = null
  ): StepperOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pins")(pins)
    __obj.updateDynamic("pwm")(pwm)
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

