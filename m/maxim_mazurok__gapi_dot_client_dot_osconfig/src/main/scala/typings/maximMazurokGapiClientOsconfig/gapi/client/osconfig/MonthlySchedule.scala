package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonthlySchedule extends js.Object {
  
  /**
    * Required. One day of the month. 1-31 indicates the 1st to the 31st day. -1 indicates the last day of the month. Months without the target day will be skipped. For example, a
    * schedule to run "every month on the 31st" will not run in February, April, June, etc.
    */
  var monthDay: js.UndefOr[Double] = js.native
  
  /** Required. Week day in a month. */
  var weekDayOfMonth: js.UndefOr[WeekDayOfMonth] = js.native
}
object MonthlySchedule {
  
  @scala.inline
  def apply(): MonthlySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonthlySchedule]
  }
  
  @scala.inline
  implicit class MonthlyScheduleOps[Self <: MonthlySchedule] (val x: Self) extends AnyVal {
    
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
    def setMonthDay(value: Double): Self = this.set("monthDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthDay: Self = this.set("monthDay", js.undefined)
    
    @scala.inline
    def setWeekDayOfMonth(value: WeekDayOfMonth): Self = this.set("weekDayOfMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekDayOfMonth: Self = this.set("weekDayOfMonth", js.undefined)
  }
}
