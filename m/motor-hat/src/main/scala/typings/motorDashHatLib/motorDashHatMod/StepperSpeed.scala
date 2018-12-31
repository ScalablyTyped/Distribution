package typings
package motorDashHatLib.motorDashHatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepperSpeed extends js.Object {
  /**
    * Speed in pulses per second (pulses can be steps, microsteps, etc)
    */
  var pps: js.UndefOr[scala.Double] = js.undefined
  /**
    * Speed in revolutions per minute
    */
  var rpm: js.UndefOr[scala.Double] = js.undefined
  /**
    * Speed in steps per second
    */
  var sps: js.UndefOr[scala.Double] = js.undefined
}

