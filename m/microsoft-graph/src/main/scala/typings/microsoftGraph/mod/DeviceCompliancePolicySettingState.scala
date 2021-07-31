package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceCompliancePolicySettingState extends StObject {
  
  // Current value of setting on device
  var currentValue: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Error code for the setting
  var errorCode: js.UndefOr[Double] = js.undefined
  
  // Error description
  var errorDescription: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Name of setting instance that is being reported.
  var instanceDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The setting that is being reported
  var setting: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Localized/user friendly setting name that is being reported
  var settingName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Contributing policies
  var sources: js.UndefOr[NullableOption[js.Array[SettingSource]]] = js.undefined
  
  /**
    * The compliance state of the setting. Possible values are: unknown, notApplicable, compliant, remediated, nonCompliant,
    * error, conflict, notAssigned.
    */
  var state: js.UndefOr[ComplianceStatus] = js.undefined
  
  // UserEmail
  var userEmail: js.UndefOr[NullableOption[String]] = js.undefined
  
  // UserId
  var userId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // UserName
  var userName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // UserPrincipalName.
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.undefined
}
object DeviceCompliancePolicySettingState {
  
  @scala.inline
  def apply(): DeviceCompliancePolicySettingState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceCompliancePolicySettingState]
  }
  
  @scala.inline
  implicit class DeviceCompliancePolicySettingStateMutableBuilder[Self <: DeviceCompliancePolicySettingState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentValue(value: NullableOption[String]): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentValueNull: Self = StObject.set(x, "currentValue", null)
    
    @scala.inline
    def setCurrentValueUndefined: Self = StObject.set(x, "currentValue", js.undefined)
    
    @scala.inline
    def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    @scala.inline
    def setErrorDescription(value: NullableOption[String]): Self = StObject.set(x, "errorDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDescriptionNull: Self = StObject.set(x, "errorDescription", null)
    
    @scala.inline
    def setErrorDescriptionUndefined: Self = StObject.set(x, "errorDescription", js.undefined)
    
    @scala.inline
    def setInstanceDisplayName(value: NullableOption[String]): Self = StObject.set(x, "instanceDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceDisplayNameNull: Self = StObject.set(x, "instanceDisplayName", null)
    
    @scala.inline
    def setInstanceDisplayNameUndefined: Self = StObject.set(x, "instanceDisplayName", js.undefined)
    
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
    def setSources(value: NullableOption[js.Array[SettingSource]]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesNull: Self = StObject.set(x, "sources", null)
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: SettingSource*): Self = StObject.set(x, "sources", js.Array(value :_*))
    
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
