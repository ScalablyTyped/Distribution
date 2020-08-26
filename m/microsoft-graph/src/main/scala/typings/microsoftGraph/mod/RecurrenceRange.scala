package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecurrenceRange extends js.Object {
  /**
    * The date to stop applying the recurrence pattern. Depending on the recurrence pattern of the event, the last occurrence
    * of the meeting may not be this date. Required if type is endDate.
    */
  var endDate: js.UndefOr[String] = js.native
  // The number of times to repeat the event. Required and must be positive if type is numbered.
  var numberOfOccurrences: js.UndefOr[Double] = js.native
  // Time zone for the startDate and endDate properties. Optional. If not specified, the time zone of the event is used.
  var recurrenceTimeZone: js.UndefOr[String] = js.native
  /**
    * The date to start applying the recurrence pattern. The first occurrence of the meeting may be this date or later,
    * depending on the recurrence pattern of the event. Must be the same value as the start property of the recurring event.
    * Required.
    */
  var startDate: js.UndefOr[String] = js.native
  // The recurrence range. The possible values are: endDate, noEnd, numbered. Required.
  var `type`: js.UndefOr[RecurrenceRangeType] = js.native
}

object RecurrenceRange {
  @scala.inline
  def apply(): RecurrenceRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecurrenceRange]
  }
  @scala.inline
  implicit class RecurrenceRangeOps[Self <: RecurrenceRange] (val x: Self) extends AnyVal {
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
    def setEndDate(value: String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    @scala.inline
    def setNumberOfOccurrences(value: Double): Self = this.set("numberOfOccurrences", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfOccurrences: Self = this.set("numberOfOccurrences", js.undefined)
    @scala.inline
    def setRecurrenceTimeZone(value: String): Self = this.set("recurrenceTimeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurrenceTimeZone: Self = this.set("recurrenceTimeZone", js.undefined)
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    @scala.inline
    def setType(value: RecurrenceRangeType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

