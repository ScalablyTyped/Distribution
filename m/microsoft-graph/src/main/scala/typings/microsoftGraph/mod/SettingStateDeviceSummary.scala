package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettingStateDeviceSummary
  extends StObject
     with Entity {
  
  // Device Compliant count for the setting
  var compliantDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Device conflict error count for the setting
  var conflictDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Device error count for the setting
  var errorDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Name of the InstancePath for the setting
  var instancePath: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Device NonCompliant count for the setting
  var nonCompliantDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Device Not Applicable count for the setting
  var notApplicableDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Device Compliant count for the setting
  var remediatedDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Name of the setting
  var settingName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Device Unkown count for the setting
  var unknownDeviceCount: js.UndefOr[Double] = js.undefined
}
object SettingStateDeviceSummary {
  
  inline def apply(): SettingStateDeviceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingStateDeviceSummary]
  }
  
  extension [Self <: SettingStateDeviceSummary](x: Self) {
    
    inline def setCompliantDeviceCount(value: Double): Self = StObject.set(x, "compliantDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setCompliantDeviceCountUndefined: Self = StObject.set(x, "compliantDeviceCount", js.undefined)
    
    inline def setConflictDeviceCount(value: Double): Self = StObject.set(x, "conflictDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setConflictDeviceCountUndefined: Self = StObject.set(x, "conflictDeviceCount", js.undefined)
    
    inline def setErrorDeviceCount(value: Double): Self = StObject.set(x, "errorDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setErrorDeviceCountUndefined: Self = StObject.set(x, "errorDeviceCount", js.undefined)
    
    inline def setInstancePath(value: NullableOption[String]): Self = StObject.set(x, "instancePath", value.asInstanceOf[js.Any])
    
    inline def setInstancePathNull: Self = StObject.set(x, "instancePath", null)
    
    inline def setInstancePathUndefined: Self = StObject.set(x, "instancePath", js.undefined)
    
    inline def setNonCompliantDeviceCount(value: Double): Self = StObject.set(x, "nonCompliantDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setNonCompliantDeviceCountUndefined: Self = StObject.set(x, "nonCompliantDeviceCount", js.undefined)
    
    inline def setNotApplicableDeviceCount(value: Double): Self = StObject.set(x, "notApplicableDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setNotApplicableDeviceCountUndefined: Self = StObject.set(x, "notApplicableDeviceCount", js.undefined)
    
    inline def setRemediatedDeviceCount(value: Double): Self = StObject.set(x, "remediatedDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setRemediatedDeviceCountUndefined: Self = StObject.set(x, "remediatedDeviceCount", js.undefined)
    
    inline def setSettingName(value: NullableOption[String]): Self = StObject.set(x, "settingName", value.asInstanceOf[js.Any])
    
    inline def setSettingNameNull: Self = StObject.set(x, "settingName", null)
    
    inline def setSettingNameUndefined: Self = StObject.set(x, "settingName", js.undefined)
    
    inline def setUnknownDeviceCount(value: Double): Self = StObject.set(x, "unknownDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setUnknownDeviceCountUndefined: Self = StObject.set(x, "unknownDeviceCount", js.undefined)
  }
}
