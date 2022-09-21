package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceCompliancePolicySettingStateSummary
  extends StObject
     with Entity {
  
  // Number of compliant devices
  var compliantDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Number of conflict devices
  var conflictDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Not yet documented
  var deviceComplianceSettingStates: js.UndefOr[NullableOption[js.Array[DeviceComplianceSettingState]]] = js.undefined
  
  // Number of error devices
  var errorDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Number of NonCompliant devices
  var nonCompliantDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Number of not applicable devices
  var notApplicableDeviceCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Setting platform. Possible values are: android, iOS, macOS, windowsPhone81, windows81AndLater, windows10AndLater,
    * androidWorkProfile, all.
    */
  var platformType: js.UndefOr[PolicyPlatformType] = js.undefined
  
  // Number of remediated devices
  var remediatedDeviceCount: js.UndefOr[Double] = js.undefined
  
  // The setting class name and property name.
  var setting: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Name of the setting.
  var settingName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Number of unknown devices
  var unknownDeviceCount: js.UndefOr[Double] = js.undefined
}
object DeviceCompliancePolicySettingStateSummary {
  
  inline def apply(): DeviceCompliancePolicySettingStateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceCompliancePolicySettingStateSummary]
  }
  
  extension [Self <: DeviceCompliancePolicySettingStateSummary](x: Self) {
    
    inline def setCompliantDeviceCount(value: Double): Self = StObject.set(x, "compliantDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setCompliantDeviceCountUndefined: Self = StObject.set(x, "compliantDeviceCount", js.undefined)
    
    inline def setConflictDeviceCount(value: Double): Self = StObject.set(x, "conflictDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setConflictDeviceCountUndefined: Self = StObject.set(x, "conflictDeviceCount", js.undefined)
    
    inline def setDeviceComplianceSettingStates(value: NullableOption[js.Array[DeviceComplianceSettingState]]): Self = StObject.set(x, "deviceComplianceSettingStates", value.asInstanceOf[js.Any])
    
    inline def setDeviceComplianceSettingStatesNull: Self = StObject.set(x, "deviceComplianceSettingStates", null)
    
    inline def setDeviceComplianceSettingStatesUndefined: Self = StObject.set(x, "deviceComplianceSettingStates", js.undefined)
    
    inline def setDeviceComplianceSettingStatesVarargs(value: DeviceComplianceSettingState*): Self = StObject.set(x, "deviceComplianceSettingStates", js.Array(value*))
    
    inline def setErrorDeviceCount(value: Double): Self = StObject.set(x, "errorDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setErrorDeviceCountUndefined: Self = StObject.set(x, "errorDeviceCount", js.undefined)
    
    inline def setNonCompliantDeviceCount(value: Double): Self = StObject.set(x, "nonCompliantDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setNonCompliantDeviceCountUndefined: Self = StObject.set(x, "nonCompliantDeviceCount", js.undefined)
    
    inline def setNotApplicableDeviceCount(value: Double): Self = StObject.set(x, "notApplicableDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setNotApplicableDeviceCountUndefined: Self = StObject.set(x, "notApplicableDeviceCount", js.undefined)
    
    inline def setPlatformType(value: PolicyPlatformType): Self = StObject.set(x, "platformType", value.asInstanceOf[js.Any])
    
    inline def setPlatformTypeUndefined: Self = StObject.set(x, "platformType", js.undefined)
    
    inline def setRemediatedDeviceCount(value: Double): Self = StObject.set(x, "remediatedDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setRemediatedDeviceCountUndefined: Self = StObject.set(x, "remediatedDeviceCount", js.undefined)
    
    inline def setSetting(value: NullableOption[String]): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
    
    inline def setSettingName(value: NullableOption[String]): Self = StObject.set(x, "settingName", value.asInstanceOf[js.Any])
    
    inline def setSettingNameNull: Self = StObject.set(x, "settingName", null)
    
    inline def setSettingNameUndefined: Self = StObject.set(x, "settingName", js.undefined)
    
    inline def setSettingNull: Self = StObject.set(x, "setting", null)
    
    inline def setSettingUndefined: Self = StObject.set(x, "setting", js.undefined)
    
    inline def setUnknownDeviceCount(value: Double): Self = StObject.set(x, "unknownDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setUnknownDeviceCountUndefined: Self = StObject.set(x, "unknownDeviceCount", js.undefined)
  }
}
