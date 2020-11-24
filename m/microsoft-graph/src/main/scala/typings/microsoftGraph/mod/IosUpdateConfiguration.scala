package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosUpdateConfiguration extends DeviceConfiguration {
  
  // Active Hours End (active hours mean the time window when updates install should not happen)
  var activeHoursEnd: js.UndefOr[String] = js.native
  
  // Active Hours Start (active hours mean the time window when updates install should not happen)
  var activeHoursStart: js.UndefOr[String] = js.native
  
  // Days in week for which active hours are configured. This collection can contain a maximum of 7 elements.
  var scheduledInstallDays: js.UndefOr[js.Array[DayOfWeek]] = js.native
  
  // UTC Time Offset indicated in minutes
  var utcTimeOffsetInMinutes: js.UndefOr[NullableOption[Double]] = js.native
}
object IosUpdateConfiguration {
  
  @scala.inline
  def apply(): IosUpdateConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosUpdateConfiguration]
  }
  
  @scala.inline
  implicit class IosUpdateConfigurationOps[Self <: IosUpdateConfiguration] (val x: Self) extends AnyVal {
    
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
    def setActiveHoursEnd(value: String): Self = this.set("activeHoursEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveHoursEnd: Self = this.set("activeHoursEnd", js.undefined)
    
    @scala.inline
    def setActiveHoursStart(value: String): Self = this.set("activeHoursStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveHoursStart: Self = this.set("activeHoursStart", js.undefined)
    
    @scala.inline
    def setScheduledInstallDaysVarargs(value: DayOfWeek*): Self = this.set("scheduledInstallDays", js.Array(value :_*))
    
    @scala.inline
    def setScheduledInstallDays(value: js.Array[DayOfWeek]): Self = this.set("scheduledInstallDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledInstallDays: Self = this.set("scheduledInstallDays", js.undefined)
    
    @scala.inline
    def setUtcTimeOffsetInMinutes(value: NullableOption[Double]): Self = this.set("utcTimeOffsetInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtcTimeOffsetInMinutes: Self = this.set("utcTimeOffsetInMinutes", js.undefined)
    
    @scala.inline
    def setUtcTimeOffsetInMinutesNull: Self = this.set("utcTimeOffsetInMinutes", null)
  }
}
