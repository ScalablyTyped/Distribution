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
  var pins: motorDashHatLib.Anon_W2
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

