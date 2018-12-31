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

