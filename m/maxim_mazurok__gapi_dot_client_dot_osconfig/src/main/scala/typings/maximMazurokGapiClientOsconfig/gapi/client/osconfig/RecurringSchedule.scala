package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecurringSchedule extends js.Object {
  
  /** Optional. The end time at which a recurring patch deployment schedule is no longer active. */
  var endTime: js.UndefOr[String] = js.native
  
  /** Required. The frequency unit of this recurring schedule. */
  var frequency: js.UndefOr[String] = js.native
  
  /** Output only. The time the last patch job ran successfully. */
  var lastExecuteTime: js.UndefOr[String] = js.native
  
  /** Required. Schedule with monthly executions. */
  var monthly: js.UndefOr[MonthlySchedule] = js.native
  
  /** Output only. The time the next patch job is scheduled to run. */
  var nextExecuteTime: js.UndefOr[String] = js.native
  
  /** Optional. The time that the recurring schedule becomes effective. Defaults to `create_time` of the patch deployment. */
  var startTime: js.UndefOr[String] = js.native
  
  /** Required. Time of the day to run a recurring deployment. */
  var timeOfDay: js.UndefOr[TimeOfDay] = js.native
  
  /** Required. Defines the time zone that `time_of_day` is relative to. The rules for daylight saving time are determined by the chosen time zone. */
  var timeZone: js.UndefOr[TimeZone] = js.native
  
  /** Required. Schedule with weekly executions. */
  var weekly: js.UndefOr[WeeklySchedule] = js.native
}
object RecurringSchedule {
  
  @scala.inline
  def apply(): RecurringSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecurringSchedule]
  }
  
  @scala.inline
  implicit class RecurringScheduleOps[Self <: RecurringSchedule] (val x: Self) extends AnyVal {
    
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
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setFrequency(value: String): Self = this.set("frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrequency: Self = this.set("frequency", js.undefined)
    
    @scala.inline
    def setLastExecuteTime(value: String): Self = this.set("lastExecuteTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastExecuteTime: Self = this.set("lastExecuteTime", js.undefined)
    
    @scala.inline
    def setMonthly(value: MonthlySchedule): Self = this.set("monthly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthly: Self = this.set("monthly", js.undefined)
    
    @scala.inline
    def setNextExecuteTime(value: String): Self = this.set("nextExecuteTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextExecuteTime: Self = this.set("nextExecuteTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setTimeOfDay(value: TimeOfDay): Self = this.set("timeOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeOfDay: Self = this.set("timeOfDay", js.undefined)
    
    @scala.inline
    def setTimeZone(value: TimeZone): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    
    @scala.inline
    def setWeekly(value: WeeklySchedule): Self = this.set("weekly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekly: Self = this.set("weekly", js.undefined)
  }
}
