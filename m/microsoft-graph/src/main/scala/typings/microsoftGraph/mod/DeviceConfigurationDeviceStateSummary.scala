package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceConfigurationDeviceStateSummary
  extends StObject
     with Entity {
  
  // Number of compliant devices
  var compliantDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Number of conflict devices
  var conflictDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Number of error devices
  var errorDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Number of NonCompliant devices
  var nonCompliantDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Number of not applicable devices
  var notApplicableDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Number of remediated devices
  var remediatedDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Number of unknown devices
  var unknownDeviceCount: js.UndefOr[Double] = js.undefined
}
object DeviceConfigurationDeviceStateSummary {
  
  @scala.inline
  def apply(): DeviceConfigurationDeviceStateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceConfigurationDeviceStateSummary]
  }
  
  @scala.inline
  implicit class DeviceConfigurationDeviceStateSummaryMutableBuilder[Self <: DeviceConfigurationDeviceStateSummary] (val x: Self) extends AnyVal {
    
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
    def setUnknownDeviceCount(value: Double): Self = StObject.set(x, "unknownDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownDeviceCountUndefined: Self = StObject.set(x, "unknownDeviceCount", js.undefined)
  }
}
