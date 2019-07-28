package typings.momentDashHoliday.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Holidays extends js.Object {
  var active: HolidaysMapping
  var active_last: HolidaysMapping
}

object Holidays {
  @scala.inline
  def apply(active: HolidaysMapping, active_last: HolidaysMapping): Holidays = {
    val __obj = js.Dynamic.literal(active = active, active_last = active_last)
  
    __obj.asInstanceOf[Holidays]
  }
}

