package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Win32LobAppRestartSettings extends StObject {
  
  // The number of minutes before the restart time to display the countdown dialog for pending restarts.
  var countdownDisplayBeforeRestartInMinutes: js.UndefOr[Double] = js.undefined
  
  // The number of minutes to wait before restarting the device after an app installation.
  var gracePeriodInMinutes: js.UndefOr[Double] = js.undefined
  
  // The number of minutes to snooze the restart notification dialog when the snooze button is selected.
  var restartNotificationSnoozeDurationInMinutes: js.UndefOr[NullableOption[Double]] = js.undefined
}
object Win32LobAppRestartSettings {
  
  @scala.inline
  def apply(): Win32LobAppRestartSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Win32LobAppRestartSettings]
  }
  
  @scala.inline
  implicit class Win32LobAppRestartSettingsMutableBuilder[Self <: Win32LobAppRestartSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountdownDisplayBeforeRestartInMinutes(value: Double): Self = StObject.set(x, "countdownDisplayBeforeRestartInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountdownDisplayBeforeRestartInMinutesUndefined: Self = StObject.set(x, "countdownDisplayBeforeRestartInMinutes", js.undefined)
    
    @scala.inline
    def setGracePeriodInMinutes(value: Double): Self = StObject.set(x, "gracePeriodInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGracePeriodInMinutesUndefined: Self = StObject.set(x, "gracePeriodInMinutes", js.undefined)
    
    @scala.inline
    def setRestartNotificationSnoozeDurationInMinutes(value: NullableOption[Double]): Self = StObject.set(x, "restartNotificationSnoozeDurationInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestartNotificationSnoozeDurationInMinutesNull: Self = StObject.set(x, "restartNotificationSnoozeDurationInMinutes", null)
    
    @scala.inline
    def setRestartNotificationSnoozeDurationInMinutesUndefined: Self = StObject.set(x, "restartNotificationSnoozeDurationInMinutes", js.undefined)
  }
}
