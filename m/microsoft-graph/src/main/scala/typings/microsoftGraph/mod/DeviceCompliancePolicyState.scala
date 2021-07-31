package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceCompliancePolicyState
  extends StObject
     with Entity {
  
  // The name of the policy for this policyBase
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Platform type that the policy applies to
  var platformType: js.UndefOr[PolicyPlatformType] = js.undefined
  
  // Count of how many setting a policy holds
  var settingCount: js.UndefOr[Double] = js.undefined
  
  var settingStates: js.UndefOr[NullableOption[js.Array[DeviceCompliancePolicySettingState]]] = js.undefined
  
  // The compliance state of the policy
  var state: js.UndefOr[ComplianceStatus] = js.undefined
  
  // The version of the policy
  var version: js.UndefOr[Double] = js.undefined
}
object DeviceCompliancePolicyState {
  
  @scala.inline
  def apply(): DeviceCompliancePolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceCompliancePolicyState]
  }
  
  @scala.inline
  implicit class DeviceCompliancePolicyStateMutableBuilder[Self <: DeviceCompliancePolicyState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setPlatformType(value: PolicyPlatformType): Self = StObject.set(x, "platformType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformTypeUndefined: Self = StObject.set(x, "platformType", js.undefined)
    
    @scala.inline
    def setSettingCount(value: Double): Self = StObject.set(x, "settingCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingCountUndefined: Self = StObject.set(x, "settingCount", js.undefined)
    
    @scala.inline
    def setSettingStates(value: NullableOption[js.Array[DeviceCompliancePolicySettingState]]): Self = StObject.set(x, "settingStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingStatesNull: Self = StObject.set(x, "settingStates", null)
    
    @scala.inline
    def setSettingStatesUndefined: Self = StObject.set(x, "settingStates", js.undefined)
    
    @scala.inline
    def setSettingStatesVarargs(value: DeviceCompliancePolicySettingState*): Self = StObject.set(x, "settingStates", js.Array(value :_*))
    
    @scala.inline
    def setState(value: ComplianceStatus): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
