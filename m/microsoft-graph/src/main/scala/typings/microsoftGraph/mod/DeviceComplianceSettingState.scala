package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceComplianceSettingState extends Entity {
  
  // The DateTime when device compliance grace period expires
  var complianceGracePeriodExpirationDateTime: js.UndefOr[String] = js.native
  
  // The Device Id that is being reported
  var deviceId: js.UndefOr[NullableOption[String]] = js.native
  
  // The device model that is being reported
  var deviceModel: js.UndefOr[NullableOption[String]] = js.native
  
  // The Device Name that is being reported
  var deviceName: js.UndefOr[NullableOption[String]] = js.native
  
  // The setting class name and property name.
  var setting: js.UndefOr[NullableOption[String]] = js.native
  
  // The Setting Name that is being reported
  var settingName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The compliance state of the setting. Possible values are: unknown, notApplicable, compliant, remediated, nonCompliant,
    * error, conflict, notAssigned.
    */
  var state: js.UndefOr[ComplianceStatus] = js.native
  
  // The User email address that is being reported
  var userEmail: js.UndefOr[NullableOption[String]] = js.native
  
  // The user Id that is being reported
  var userId: js.UndefOr[NullableOption[String]] = js.native
  
  // The User Name that is being reported
  var userName: js.UndefOr[NullableOption[String]] = js.native
  
  // The User PrincipalName that is being reported
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.native
}
object DeviceComplianceSettingState {
  
  @scala.inline
  def apply(): DeviceComplianceSettingState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceComplianceSettingState]
  }
  
  @scala.inline
  implicit class DeviceComplianceSettingStateMutableBuilder[Self <: DeviceComplianceSettingState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplianceGracePeriodExpirationDateTime(value: String): Self = StObject.set(x, "complianceGracePeriodExpirationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceGracePeriodExpirationDateTimeUndefined: Self = StObject.set(x, "complianceGracePeriodExpirationDateTime", js.undefined)
    
    @scala.inline
    def setDeviceId(value: NullableOption[String]): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setDeviceModel(value: NullableOption[String]): Self = StObject.set(x, "deviceModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceModelNull: Self = StObject.set(x, "deviceModel", null)
    
    @scala.inline
    def setDeviceModelUndefined: Self = StObject.set(x, "deviceModel", js.undefined)
    
    @scala.inline
    def setDeviceName(value: NullableOption[String]): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameNull: Self = StObject.set(x, "deviceName", null)
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    @scala.inline
    def setSetting(value: NullableOption[String]): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingName(value: NullableOption[String]): Self = StObject.set(x, "settingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingNameNull: Self = StObject.set(x, "settingName", null)
    
    @scala.inline
    def setSettingNameUndefined: Self = StObject.set(x, "settingName", js.undefined)
    
    @scala.inline
    def setSettingNull: Self = StObject.set(x, "setting", null)
    
    @scala.inline
    def setSettingUndefined: Self = StObject.set(x, "setting", js.undefined)
    
    @scala.inline
    def setState(value: ComplianceStatus): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setUserEmail(value: NullableOption[String]): Self = StObject.set(x, "userEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEmailNull: Self = StObject.set(x, "userEmail", null)
    
    @scala.inline
    def setUserEmailUndefined: Self = StObject.set(x, "userEmail", js.undefined)
    
    @scala.inline
    def setUserId(value: NullableOption[String]): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    @scala.inline
    def setUserName(value: NullableOption[String]): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameNull: Self = StObject.set(x, "userName", null)
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    
    @scala.inline
    def setUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPrincipalNameNull: Self = StObject.set(x, "userPrincipalName", null)
    
    @scala.inline
    def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
  }
}
