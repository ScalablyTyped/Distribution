package typings.momentDashHoliday.momentMod

import org.scalablytyped.runtime.TopLevel
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
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], active_last = active_last.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Holidays]
  }
}

@JSImport("moment", "holidays")
@js.native
object holidays extends TopLevel[Holidays]

