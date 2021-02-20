package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class IosUpdateConfigurationMutableBuilder[Self <: IosUpdateConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveHoursEnd(value: String): Self = StObject.set(x, "activeHoursEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveHoursEndUndefined: Self = StObject.set(x, "activeHoursEnd", js.undefined)
    
    @scala.inline
    def setActiveHoursStart(value: String): Self = StObject.set(x, "activeHoursStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveHoursStartUndefined: Self = StObject.set(x, "activeHoursStart", js.undefined)
    
    @scala.inline
    def setScheduledInstallDays(value: js.Array[DayOfWeek]): Self = StObject.set(x, "scheduledInstallDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledInstallDaysUndefined: Self = StObject.set(x, "scheduledInstallDays", js.undefined)
    
    @scala.inline
    def setScheduledInstallDaysVarargs(value: DayOfWeek*): Self = StObject.set(x, "scheduledInstallDays", js.Array(value :_*))
    
    @scala.inline
    def setUtcTimeOffsetInMinutes(value: NullableOption[Double]): Self = StObject.set(x, "utcTimeOffsetInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtcTimeOffsetInMinutesNull: Self = StObject.set(x, "utcTimeOffsetInMinutes", null)
    
    @scala.inline
    def setUtcTimeOffsetInMinutesUndefined: Self = StObject.set(x, "utcTimeOffsetInMinutes", js.undefined)
  }
}
