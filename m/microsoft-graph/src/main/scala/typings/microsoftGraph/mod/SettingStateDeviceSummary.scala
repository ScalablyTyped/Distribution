package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettingStateDeviceSummary extends Entity {
  
  // Device Compliant count for the setting
  var compliantDeviceCount: js.UndefOr[Double] = js.native
  
  // Device conflict error count for the setting
  var conflictDeviceCount: js.UndefOr[Double] = js.native
  
  // Device error count for the setting
  var errorDeviceCount: js.UndefOr[Double] = js.native
  
  // Name of the InstancePath for the setting
  var instancePath: js.UndefOr[NullableOption[String]] = js.native
  
  // Device NonCompliant count for the setting
  var nonCompliantDeviceCount: js.UndefOr[Double] = js.native
  
  // Device Not Applicable count for the setting
  var notApplicableDeviceCount: js.UndefOr[Double] = js.native
  
  // Device Compliant count for the setting
  var remediatedDeviceCount: js.UndefOr[Double] = js.native
  
  // Name of the setting
  var settingName: js.UndefOr[NullableOption[String]] = js.native
  
  // Device Unkown count for the setting
  var unknownDeviceCount: js.UndefOr[Double] = js.native
}
object SettingStateDeviceSummary {
  
  @scala.inline
  def apply(): SettingStateDeviceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingStateDeviceSummary]
  }
  
  @scala.inline
  implicit class SettingStateDeviceSummaryMutableBuilder[Self <: SettingStateDeviceSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompliantDeviceCount(value: Double): Self = StObject.set(x, "compliantDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompliantDeviceCountUndefined: Self = StObject.set(x, "compliantDeviceCount", js.undefined)
    
    @scala.inline
    def setConflictDeviceCount(value: Double): Self = StObject.set(x, "conflictDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflictDeviceCountUndefined: Self = StObject.set(x, "conflictDeviceCount", js.undefined)
    
    @scala.inline
    def setErrorDeviceCount(value: Double): Self = StObject.set(x, "errorDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDeviceCountUndefined: Self = StObject.set(x, "errorDeviceCount", js.undefined)
    
    @scala.inline
    def setInstancePath(value: NullableOption[String]): Self = StObject.set(x, "instancePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancePathNull: Self = StObject.set(x, "instancePath", null)
    
    @scala.inline
    def setInstancePathUndefined: Self = StObject.set(x, "instancePath", js.undefined)
    
    @scala.inline
    def setNonCompliantDeviceCount(value: Double): Self = StObject.set(x, "nonCompliantDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonCompliantDeviceCountUndefined: Self = StObject.set(x, "nonCompliantDeviceCount", js.undefined)
    
    @scala.inline
    def setNotApplicableDeviceCount(value: Double): Self = StObject.set(x, "notApplicableDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotApplicableDeviceCountUndefined: Self = StObject.set(x, "notApplicableDeviceCount", js.undefined)
    
    @scala.inline
    def setRemediatedDeviceCount(value: Double): Self = StObject.set(x, "remediatedDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemediatedDeviceCountUndefined: Self = StObject.set(x, "remediatedDeviceCount", js.undefined)
    
    @scala.inline
    def setSettingName(value: NullableOption[String]): Self = StObject.set(x, "settingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingNameNull: Self = StObject.set(x, "settingName", null)
    
    @scala.inline
    def setSettingNameUndefined: Self = StObject.set(x, "settingName", js.undefined)
    
    @scala.inline
    def setUnknownDeviceCount(value: Double): Self = StObject.set(x, "unknownDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownDeviceCountUndefined: Self = StObject.set(x, "unknownDeviceCount", js.undefined)
  }
}
