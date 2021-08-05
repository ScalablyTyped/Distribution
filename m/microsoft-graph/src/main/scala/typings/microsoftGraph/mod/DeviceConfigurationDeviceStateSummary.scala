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
  
  inline def apply(): DeviceConfigurationDeviceStateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceConfigurationDeviceStateSummary]
  }
  
  extension [Self <: DeviceConfigurationDeviceStateSummary](x: Self) {
    
    inline def setCompliantDeviceCount(value: Double): Self = StObject.set(x, "compliantDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setCompliantDeviceCountUndefined: Self = StObject.set(x, "compliantDeviceCount", js.undefined)
    
    inline def setConflictDeviceCount(value: Double): Self = StObject.set(x, "conflictDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setConflictDeviceCountUndefined: Self = StObject.set(x, "conflictDeviceCount", js.undefined)
    
    inline def setErrorDeviceCount(value: Double): Self = StObject.set(x, "errorDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setErrorDeviceCountUndefined: Self = StObject.set(x, "errorDeviceCount", js.undefined)
    
    inline def setNonCompliantDeviceCount(value: Double): Self = StObject.set(x, "nonCompliantDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setNonCompliantDeviceCountUndefined: Self = StObject.set(x, "nonCompliantDeviceCount", js.undefined)
    
    inline def setNotApplicableDeviceCount(value: Double): Self = StObject.set(x, "notApplicableDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setNotApplicableDeviceCountUndefined: Self = StObject.set(x, "notApplicableDeviceCount", js.undefined)
    
    inline def setRemediatedDeviceCount(value: Double): Self = StObject.set(x, "remediatedDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setRemediatedDeviceCountUndefined: Self = StObject.set(x, "remediatedDeviceCount", js.undefined)
    
    inline def setUnknownDeviceCount(value: Double): Self = StObject.set(x, "unknownDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setUnknownDeviceCountUndefined: Self = StObject.set(x, "unknownDeviceCount", js.undefined)
  }
}
