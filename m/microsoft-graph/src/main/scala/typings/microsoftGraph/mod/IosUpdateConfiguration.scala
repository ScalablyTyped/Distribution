package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosUpdateConfiguration
  extends StObject
     with DeviceConfiguration {
  
  // Active Hours End (active hours mean the time window when updates install should not happen)
  var activeHoursEnd: js.UndefOr[String] = js.undefined
  
  // Active Hours Start (active hours mean the time window when updates install should not happen)
  var activeHoursStart: js.UndefOr[String] = js.undefined
  
  // Days in week for which active hours are configured. This collection can contain a maximum of 7 elements.
  var scheduledInstallDays: js.UndefOr[js.Array[DayOfWeek]] = js.undefined
  
  // UTC Time Offset indicated in minutes
  var utcTimeOffsetInMinutes: js.UndefOr[NullableOption[Double]] = js.undefined
}
object IosUpdateConfiguration {
  
  inline def apply(): IosUpdateConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosUpdateConfiguration]
  }
  
  extension [Self <: IosUpdateConfiguration](x: Self) {
    
    inline def setActiveHoursEnd(value: String): Self = StObject.set(x, "activeHoursEnd", value.asInstanceOf[js.Any])
    
    inline def setActiveHoursEndUndefined: Self = StObject.set(x, "activeHoursEnd", js.undefined)
    
    inline def setActiveHoursStart(value: String): Self = StObject.set(x, "activeHoursStart", value.asInstanceOf[js.Any])
    
    inline def setActiveHoursStartUndefined: Self = StObject.set(x, "activeHoursStart", js.undefined)
    
    inline def setScheduledInstallDays(value: js.Array[DayOfWeek]): Self = StObject.set(x, "scheduledInstallDays", value.asInstanceOf[js.Any])
    
    inline def setScheduledInstallDaysUndefined: Self = StObject.set(x, "scheduledInstallDays", js.undefined)
    
    inline def setScheduledInstallDaysVarargs(value: DayOfWeek*): Self = StObject.set(x, "scheduledInstallDays", js.Array(value*))
    
    inline def setUtcTimeOffsetInMinutes(value: NullableOption[Double]): Self = StObject.set(x, "utcTimeOffsetInMinutes", value.asInstanceOf[js.Any])
    
    inline def setUtcTimeOffsetInMinutesNull: Self = StObject.set(x, "utcTimeOffsetInMinutes", null)
    
    inline def setUtcTimeOffsetInMinutesUndefined: Self = StObject.set(x, "utcTimeOffsetInMinutes", js.undefined)
  }
}
