package typings.nodeDashSchedule.nodeDashScheduleMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecurrenceSpecDateRange extends js.Object {
  /**
    * Ending date in date range.
    */
  var end: Date | String | Double
  /**
    * Cron expression string.
    */
  var rule: String
  /**
    * Starting date in date range.
    */
  var start: Date | String | Double
}

object RecurrenceSpecDateRange {
  @scala.inline
  def apply(end: Date | String | Double, rule: String, start: Date | String | Double): RecurrenceSpecDateRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RecurrenceSpecDateRange]
  }
}

