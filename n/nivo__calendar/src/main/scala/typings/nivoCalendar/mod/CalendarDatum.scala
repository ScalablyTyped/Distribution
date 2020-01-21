package typings.nivoCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarDatum extends js.Object {
  var day: String
  var value: Double
}

object CalendarDatum {
  @scala.inline
  def apply(day: String, value: Double): CalendarDatum = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CalendarDatum]
  }
}

