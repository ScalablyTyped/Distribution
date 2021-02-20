package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsUpdateScheduledInstall extends WindowsUpdateInstallScheduleType {
  
  /**
    * Scheduled Install Day in week. Possible values are: userDefined, everyday, sunday, monday, tuesday, wednesday,
    * thursday, friday, saturday.
    */
  var scheduledInstallDay: js.UndefOr[WeeklySchedule] = js.native
  
  // Scheduled Install Time during day
  var scheduledInstallTime: js.UndefOr[String] = js.native
}
object WindowsUpdateScheduledInstall {
  
  @scala.inline
  def apply(): WindowsUpdateScheduledInstall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsUpdateScheduledInstall]
  }
  
  @scala.inline
  implicit class WindowsUpdateScheduledInstallMutableBuilder[Self <: WindowsUpdateScheduledInstall] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScheduledInstallDay(value: WeeklySchedule): Self = StObject.set(x, "scheduledInstallDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledInstallDayUndefined: Self = StObject.set(x, "scheduledInstallDay", js.undefined)
    
    @scala.inline
    def setScheduledInstallTime(value: String): Self = StObject.set(x, "scheduledInstallTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledInstallTimeUndefined: Self = StObject.set(x, "scheduledInstallTime", js.undefined)
  }
}
