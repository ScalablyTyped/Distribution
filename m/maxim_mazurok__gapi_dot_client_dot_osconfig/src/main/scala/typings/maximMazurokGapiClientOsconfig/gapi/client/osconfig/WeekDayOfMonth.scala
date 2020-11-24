package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeekDayOfMonth extends js.Object {
  
  /** Required. A day of the week. */
  var dayOfWeek: js.UndefOr[String] = js.native
  
  /** Required. Week number in a month. 1-4 indicates the 1st to 4th week of the month. -1 indicates the last week of the month. */
  var weekOrdinal: js.UndefOr[Double] = js.native
}
object WeekDayOfMonth {
  
  @scala.inline
  def apply(): WeekDayOfMonth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeekDayOfMonth]
  }
  
  @scala.inline
  implicit class WeekDayOfMonthOps[Self <: WeekDayOfMonth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDayOfWeek(value: String): Self = this.set("dayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayOfWeek: Self = this.set("dayOfWeek", js.undefined)
    
    @scala.inline
    def setWeekOrdinal(value: Double): Self = this.set("weekOrdinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekOrdinal: Self = this.set("weekOrdinal", js.undefined)
  }
}
