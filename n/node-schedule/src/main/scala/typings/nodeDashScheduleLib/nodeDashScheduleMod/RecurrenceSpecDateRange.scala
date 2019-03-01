package typings
package nodeDashScheduleLib.nodeDashScheduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecurrenceSpecDateRange extends js.Object {
  /**
    * Ending date in date range.
    */
  var end: stdLib.Date | java.lang.String | scala.Double
  /**
    * Cron expression string.
    */
  var rule: java.lang.String
  /**
    * Starting date in date range.
    */
  var start: stdLib.Date | java.lang.String | scala.Double
}

object RecurrenceSpecDateRange {
  @scala.inline
  def apply(
    end: stdLib.Date | java.lang.String | scala.Double,
    rule: java.lang.String,
    start: stdLib.Date | java.lang.String | scala.Double
  ): RecurrenceSpecDateRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    __obj.updateDynamic("rule")(rule)
    __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurrenceSpecDateRange]
  }
}

