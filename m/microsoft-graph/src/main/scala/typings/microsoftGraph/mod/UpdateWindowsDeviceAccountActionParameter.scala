package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWindowsDeviceAccountActionParameter extends StObject {
  
  // Not yet documented
  var calendarSyncEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Not yet documented
  var deviceAccount: js.UndefOr[NullableOption[WindowsDeviceAccount]] = js.undefined
  
  // Not yet documented
  var deviceAccountEmail: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Not yet documented
  var exchangeServer: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Not yet documented
  var passwordRotationEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Not yet documented
  var sessionInitiationProtocalAddress: js.UndefOr[NullableOption[String]] = js.undefined
}
object UpdateWindowsDeviceAccountActionParameter {
  
  inline def apply(): UpdateWindowsDeviceAccountActionParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWindowsDeviceAccountActionParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateWindowsDeviceAccountActionParameter] (val x: Self) extends AnyVal {
    
    inline def setCalendarSyncEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "calendarSyncEnabled", value.asInstanceOf[js.Any])
    
    inline def setCalendarSyncEnabledNull: Self = StObject.set(x, "calendarSyncEnabled", null)
    
    inline def setCalendarSyncEnabledUndefined: Self = StObject.set(x, "calendarSyncEnabled", js.undefined)
    
    inline def setDeviceAccount(value: NullableOption[WindowsDeviceAccount]): Self = StObject.set(x, "deviceAccount", value.asInstanceOf[js.Any])
    
    inline def setDeviceAccountEmail(value: NullableOption[String]): Self = StObject.set(x, "deviceAccountEmail", value.asInstanceOf[js.Any])
    
    inline def setDeviceAccountEmailNull: Self = StObject.set(x, "deviceAccountEmail", null)
    
    inline def setDeviceAccountEmailUndefined: Self = StObject.set(x, "deviceAccountEmail", js.undefined)
    
    inline def setDeviceAccountNull: Self = StObject.set(x, "deviceAccount", null)
    
    inline def setDeviceAccountUndefined: Self = StObject.set(x, "deviceAccount", js.undefined)
    
    inline def setExchangeServer(value: NullableOption[String]): Self = StObject.set(x, "exchangeServer", value.asInstanceOf[js.Any])
    
    inline def setExchangeServerNull: Self = StObject.set(x, "exchangeServer", null)
    
    inline def setExchangeServerUndefined: Self = StObject.set(x, "exchangeServer", js.undefined)
    
    inline def setPasswordRotationEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "passwordRotationEnabled", value.asInstanceOf[js.Any])
    
    inline def setPasswordRotationEnabledNull: Self = StObject.set(x, "passwordRotationEnabled", null)
    
    inline def setPasswordRotationEnabledUndefined: Self = StObject.set(x, "passwordRotationEnabled", js.undefined)
    
    inline def setSessionInitiationProtocalAddress(value: NullableOption[String]): Self = StObject.set(x, "sessionInitiationProtocalAddress", value.asInstanceOf[js.Any])
    
    inline def setSessionInitiationProtocalAddressNull: Self = StObject.set(x, "sessionInitiationProtocalAddress", null)
    
    inline def setSessionInitiationProtocalAddressUndefined: Self = StObject.set(x, "sessionInitiationProtocalAddress", js.undefined)
  }
}
