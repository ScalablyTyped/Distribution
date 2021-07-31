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
  
  @scala.inline
  def apply(): UpdateWindowsDeviceAccountActionParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWindowsDeviceAccountActionParameter]
  }
  
  @scala.inline
  implicit class UpdateWindowsDeviceAccountActionParameterMutableBuilder[Self <: UpdateWindowsDeviceAccountActionParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendarSyncEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "calendarSyncEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarSyncEnabledNull: Self = StObject.set(x, "calendarSyncEnabled", null)
    
    @scala.inline
    def setCalendarSyncEnabledUndefined: Self = StObject.set(x, "calendarSyncEnabled", js.undefined)
    
    @scala.inline
    def setDeviceAccount(value: NullableOption[WindowsDeviceAccount]): Self = StObject.set(x, "deviceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceAccountEmail(value: NullableOption[String]): Self = StObject.set(x, "deviceAccountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceAccountEmailNull: Self = StObject.set(x, "deviceAccountEmail", null)
    
    @scala.inline
    def setDeviceAccountEmailUndefined: Self = StObject.set(x, "deviceAccountEmail", js.undefined)
    
    @scala.inline
    def setDeviceAccountNull: Self = StObject.set(x, "deviceAccount", null)
    
    @scala.inline
    def setDeviceAccountUndefined: Self = StObject.set(x, "deviceAccount", js.undefined)
    
    @scala.inline
    def setExchangeServer(value: NullableOption[String]): Self = StObject.set(x, "exchangeServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchangeServerNull: Self = StObject.set(x, "exchangeServer", null)
    
    @scala.inline
    def setExchangeServerUndefined: Self = StObject.set(x, "exchangeServer", js.undefined)
    
    @scala.inline
    def setPasswordRotationEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "passwordRotationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordRotationEnabledNull: Self = StObject.set(x, "passwordRotationEnabled", null)
    
    @scala.inline
    def setPasswordRotationEnabledUndefined: Self = StObject.set(x, "passwordRotationEnabled", js.undefined)
    
    @scala.inline
    def setSessionInitiationProtocalAddress(value: NullableOption[String]): Self = StObject.set(x, "sessionInitiationProtocalAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionInitiationProtocalAddressNull: Self = StObject.set(x, "sessionInitiationProtocalAddress", null)
    
    @scala.inline
    def setSessionInitiationProtocalAddressUndefined: Self = StObject.set(x, "sessionInitiationProtocalAddress", js.undefined)
  }
}
