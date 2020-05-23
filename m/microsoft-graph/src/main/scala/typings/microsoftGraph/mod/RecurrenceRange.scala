package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecurrenceRange extends js.Object {
  /**
    * The date to stop applying the recurrence pattern. Depending on the recurrence pattern of the event, the last occurrence
    * of the meeting may not be this date. Required if type is endDate.
    */
  var endDate: js.UndefOr[String] = js.undefined
  // The number of times to repeat the event. Required and must be positive if type is numbered.
  var numberOfOccurrences: js.UndefOr[Double] = js.undefined
  // Time zone for the startDate and endDate properties. Optional. If not specified, the time zone of the event is used.
  var recurrenceTimeZone: js.UndefOr[String] = js.undefined
  /**
    * The date to start applying the recurrence pattern. The first occurrence of the meeting may be this date or later,
    * depending on the recurrence pattern of the event. Must be the same value as the start property of the recurring event.
    * Required.
    */
  var startDate: js.UndefOr[String] = js.undefined
  // The recurrence range. The possible values are: endDate, noEnd, numbered. Required.
  var `type`: js.UndefOr[RecurrenceRangeType] = js.undefined
}

object RecurrenceRange {
  @scala.inline
  def apply(
    endDate: String = null,
    numberOfOccurrences: js.UndefOr[Double] = js.undefined,
    recurrenceTimeZone: String = null,
    startDate: String = null,
    `type`: RecurrenceRangeType = null
  ): RecurrenceRange = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfOccurrences)) __obj.updateDynamic("numberOfOccurrences")(numberOfOccurrences.get.asInstanceOf[js.Any])
    if (recurrenceTimeZone != null) __obj.updateDynamic("recurrenceTimeZone")(recurrenceTimeZone.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurrenceRange]
  }
}

