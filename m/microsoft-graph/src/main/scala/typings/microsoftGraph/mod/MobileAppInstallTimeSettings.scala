package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileAppInstallTimeSettings extends StObject {
  
  // The time at which the app should be installed.
  var deadlineDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The time at which the app should be available for installation.
  var startDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Whether the local device time or UTC time should be used when determining the available and deadline times.
  var useLocalTime: js.UndefOr[Boolean] = js.undefined
}
object MobileAppInstallTimeSettings {
  
  inline def apply(): MobileAppInstallTimeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileAppInstallTimeSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MobileAppInstallTimeSettings] (val x: Self) extends AnyVal {
    
    inline def setDeadlineDateTime(value: NullableOption[String]): Self = StObject.set(x, "deadlineDateTime", value.asInstanceOf[js.Any])
    
    inline def setDeadlineDateTimeNull: Self = StObject.set(x, "deadlineDateTime", null)
    
    inline def setDeadlineDateTimeUndefined: Self = StObject.set(x, "deadlineDateTime", js.undefined)
    
    inline def setStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    inline def setUseLocalTime(value: Boolean): Self = StObject.set(x, "useLocalTime", value.asInstanceOf[js.Any])
    
    inline def setUseLocalTimeUndefined: Self = StObject.set(x, "useLocalTime", js.undefined)
  }
}
