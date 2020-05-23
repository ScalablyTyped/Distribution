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
  def apply(
    pps: js.UndefOr[Double] = js.undefined,
    rpm: js.UndefOr[Double] = js.undefined,
    sps: js.UndefOr[Double] = js.undefined
  ): StepperSpeed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pps)) __obj.updateDynamic("pps")(pps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rpm)) __obj.updateDynamic("rpm")(rpm.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sps)) __obj.updateDynamic("sps")(sps.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperSpeed]
  }
}

