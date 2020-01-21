package typings.motorHat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepperSpeed extends js.Object {
  /**
    * Speed in pulses per second (pulses can be steps, microsteps, etc)
    */
  var pps: js.UndefOr[Double] = js.undefined
  /**
    * Speed in revolutions per minute
    */
  var rpm: js.UndefOr[Double] = js.undefined
  /**
    * Speed in steps per second
    */
  var sps: js.UndefOr[Double] = js.undefined
}

object StepperSpeed {
  @scala.inline
  def apply(pps: Int | Double = null, rpm: Int | Double = null, sps: Int | Double = null): StepperSpeed = {
    val __obj = js.Dynamic.literal()
    if (pps != null) __obj.updateDynamic("pps")(pps.asInstanceOf[js.Any])
    if (rpm != null) __obj.updateDynamic("rpm")(rpm.asInstanceOf[js.Any])
    if (sps != null) __obj.updateDynamic("sps")(sps.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperSpeed]
  }
}

