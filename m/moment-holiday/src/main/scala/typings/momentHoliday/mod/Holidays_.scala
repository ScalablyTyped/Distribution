package typings.momentHoliday.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Holidays_ extends js.Object {
  var active: HolidaysMapping
  var active_last: HolidaysMapping
}

object Holidays_ {
  @scala.inline
  def apply(active: HolidaysMapping, active_last: HolidaysMapping): Holidays_ = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], active_last = active_last.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Holidays_]
  }
}

