package typings.nodeSchedule.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecurrenceSpecObjLit extends js.Object {
  /**
    * Day of the month.
    */
  var date: js.UndefOr[RecurrenceSegment] = js.native
  var dayOfWeek: js.UndefOr[RecurrenceSegment] = js.native
  var hour: js.UndefOr[RecurrenceSegment] = js.native
  var minute: js.UndefOr[RecurrenceSegment] = js.native
  var month: js.UndefOr[RecurrenceSegment] = js.native
  var second: js.UndefOr[RecurrenceSegment] = js.native
  /**
    * Timezone
    */
  var tz: js.UndefOr[Timezone] = js.native
  var year: js.UndefOr[RecurrenceSegment] = js.native
}

object RecurrenceSpecObjLit {
  @scala.inline
  def apply(): RecurrenceSpecObjLit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecurrenceSpecObjLit]
  }
  @scala.inline
  implicit class RecurrenceSpecObjLitOps[Self <: RecurrenceSpecObjLit] (val x: Self) extends AnyVal {
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
    def setDateVarargs(value: Recurrence*): Self = this.set("date", js.Array(value :_*))
    @scala.inline
    def setDate(value: RecurrenceSegment): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDayOfWeekVarargs(value: Recurrence*): Self = this.set("dayOfWeek", js.Array(value :_*))
    @scala.inline
    def setDayOfWeek(value: RecurrenceSegment): Self = this.set("dayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayOfWeek: Self = this.set("dayOfWeek", js.undefined)
    @scala.inline
    def setHourVarargs(value: Recurrence*): Self = this.set("hour", js.Array(value :_*))
    @scala.inline
    def setHour(value: RecurrenceSegment): Self = this.set("hour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHour: Self = this.set("hour", js.undefined)
    @scala.inline
    def setMinuteVarargs(value: Recurrence*): Self = this.set("minute", js.Array(value :_*))
    @scala.inline
    def setMinute(value: RecurrenceSegment): Self = this.set("minute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinute: Self = this.set("minute", js.undefined)
    @scala.inline
    def setMonthVarargs(value: Recurrence*): Self = this.set("month", js.Array(value :_*))
    @scala.inline
    def setMonth(value: RecurrenceSegment): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    @scala.inline
    def setSecondVarargs(value: Recurrence*): Self = this.set("second", js.Array(value :_*))
    @scala.inline
    def setSecond(value: RecurrenceSegment): Self = this.set("second", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecond: Self = this.set("second", js.undefined)
    @scala.inline
    def setTz(value: Timezone): Self = this.set("tz", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTz: Self = this.set("tz", js.undefined)
    @scala.inline
    def setYearVarargs(value: Recurrence*): Self = this.set("year", js.Array(value :_*))
    @scala.inline
    def setYear(value: RecurrenceSegment): Self = this.set("year", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
  }
  
}

