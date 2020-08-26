package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkingHours extends js.Object {
  // The days of the week on which the user works.
  var daysOfWeek: js.UndefOr[js.Array[DayOfWeek]] = js.native
  // The time of the day that the user stops working.
  var endTime: js.UndefOr[String] = js.native
  // The time of the day that the user starts working.
  var startTime: js.UndefOr[String] = js.native
  // The time zone to which the working hours apply.
  var timeZone: js.UndefOr[TimeZoneBase] = js.native
}

object WorkingHours {
  @scala.inline
  def apply(): WorkingHours = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkingHours]
  }
  @scala.inline
  implicit class WorkingHoursOps[Self <: WorkingHours] (val x: Self) extends AnyVal {
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
    def setDaysOfWeekVarargs(value: DayOfWeek*): Self = this.set("daysOfWeek", js.Array(value :_*))
    @scala.inline
    def setDaysOfWeek(value: js.Array[DayOfWeek]): Self = this.set("daysOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDaysOfWeek: Self = this.set("daysOfWeek", js.undefined)
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setTimeZone(value: TimeZoneBase): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
  
}

