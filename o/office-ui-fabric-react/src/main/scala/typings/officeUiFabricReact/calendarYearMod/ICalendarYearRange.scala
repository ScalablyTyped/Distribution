package typings.officeUiFabricReact.calendarYearMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarYearRange extends js.Object {
  var fromYear: Double
  var toYear: Double
}

object ICalendarYearRange {
  @scala.inline
  def apply(fromYear: Double, toYear: Double): ICalendarYearRange = {
    val __obj = js.Dynamic.literal(fromYear = fromYear.asInstanceOf[js.Any], toYear = toYear.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarYearRange]
  }
}

