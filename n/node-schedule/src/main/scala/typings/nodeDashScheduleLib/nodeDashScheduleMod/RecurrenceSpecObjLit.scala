package typings
package nodeDashScheduleLib.nodeDashScheduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecurrenceSpecObjLit extends js.Object {
  /**
    * Day of the month.
    */
  var date: js.UndefOr[RecurrenceSegment] = js.undefined
  var dayOfWeek: js.UndefOr[RecurrenceSegment] = js.undefined
  var hour: js.UndefOr[RecurrenceSegment] = js.undefined
  var minute: js.UndefOr[RecurrenceSegment] = js.undefined
  var month: js.UndefOr[RecurrenceSegment] = js.undefined
  var second: js.UndefOr[RecurrenceSegment] = js.undefined
  var year: js.UndefOr[RecurrenceSegment] = js.undefined
}

object RecurrenceSpecObjLit {
  @scala.inline
  def apply(
    date: RecurrenceSegment = null,
    dayOfWeek: RecurrenceSegment = null,
    hour: RecurrenceSegment = null,
    minute: RecurrenceSegment = null,
    month: RecurrenceSegment = null,
    second: RecurrenceSegment = null,
    year: RecurrenceSegment = null
  ): RecurrenceSpecObjLit = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (dayOfWeek != null) __obj.updateDynamic("dayOfWeek")(dayOfWeek.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurrenceSpecObjLit]
  }
}

