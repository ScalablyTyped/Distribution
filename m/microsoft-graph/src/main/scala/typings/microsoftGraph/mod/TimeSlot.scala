package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeSlot extends js.Object {
  // The date, time, and time zone that a period begins.
  var end: js.UndefOr[DateTimeTimeZone] = js.native
  // The date, time, and time zone that a period ends.
  var start: js.UndefOr[DateTimeTimeZone] = js.native
}

object TimeSlot {
  @scala.inline
  def apply(): TimeSlot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSlot]
  }
  @scala.inline
  implicit class TimeSlotOps[Self <: TimeSlot] (val x: Self) extends AnyVal {
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
    def setEnd(value: DateTimeTimeZone): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setStart(value: DateTimeTimeZone): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

