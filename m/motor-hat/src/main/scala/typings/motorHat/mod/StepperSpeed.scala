package typings.motorHat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepperSpeed extends js.Object {
  /**
    * Speed in pulses per second (pulses can be steps, microsteps, etc)
    */
  var pps: js.UndefOr[Double] = js.native
  /**
    * Speed in revolutions per minute
    */
  var rpm: js.UndefOr[Double] = js.native
  /**
    * Speed in steps per second
    */
  var sps: js.UndefOr[Double] = js.native
}

object StepperSpeed {
  @scala.inline
  def apply(): StepperSpeed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepperSpeed]
  }
  @scala.inline
  implicit class StepperSpeedOps[Self <: StepperSpeed] (val x: Self) extends AnyVal {
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
  }
  
}

