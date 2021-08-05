package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsUpdateScheduledInstall
  extends StObject
     with WindowsUpdateInstallScheduleType {
  
  /**
    * Scheduled Install Day in week. Possible values are: userDefined, everyday, sunday, monday, tuesday, wednesday,
    * thursday, friday, saturday.
    */
  var scheduledInstallDay: js.UndefOr[WeeklySchedule] = js.undefined
  
  // Scheduled Install Time during day
  var scheduledInstallTime: js.UndefOr[String] = js.undefined
}
object WindowsUpdateScheduledInstall {
  
  inline def apply(): WindowsUpdateScheduledInstall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsUpdateScheduledInstall]
  }
  
  extension [Self <: WindowsUpdateScheduledInstall](x: Self) {
    
    inline def setScheduledInstallDay(value: WeeklySchedule): Self = StObject.set(x, "scheduledInstallDay", value.asInstanceOf[js.Any])
    
    inline def setScheduledInstallDayUndefined: Self = StObject.set(x, "scheduledInstallDay", js.undefined)
    
    inline def setScheduledInstallTime(value: String): Self = StObject.set(x, "scheduledInstallTime", value.asInstanceOf[js.Any])
    
    inline def setScheduledInstallTimeUndefined: Self = StObject.set(x, "scheduledInstallTime", js.undefined)
  }
}
