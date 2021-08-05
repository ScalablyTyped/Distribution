package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoftwareUpdateStatusSummary
  extends StObject
     with Entity {
  
  // Number of compliant devices.
  var compliantDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Number of compliant users.
  var compliantUserCount: js.UndefOr[Double] = js.undefined
  
  // Number of conflict devices.
  var conflictDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Number of conflict users.
  var conflictUserCount: js.UndefOr[Double] = js.undefined
  
  // The name of the policy.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Number of devices had error.
  var errorDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Number of users had error.
  var errorUserCount: js.UndefOr[Double] = js.undefined
  
  // Number of non compliant devices.
  var nonCompliantDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Number of non compliant users.
  var nonCompliantUserCount: js.UndefOr[Double] = js.undefined
  
  // Number of not applicable devices.
  var notApplicableDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Number of not applicable users.
  var notApplicableUserCount: js.UndefOr[Double] = js.undefined
  
  // Number of remediated devices.
  var remediatedDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Number of remediated users.
  var remediatedUserCount: js.UndefOr[Double] = js.undefined
  
  // Number of unknown devices.
  var unknownDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Number of unknown users.
  var unknownUserCount: js.UndefOr[Double] = js.undefined
}
object SoftwareUpdateStatusSummary {
  
  inline def apply(): SoftwareUpdateStatusSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftwareUpdateStatusSummary]
  }
  
  extension [Self <: SoftwareUpdateStatusSummary](x: Self) {
    
    inline def setCompliantDeviceCount(value: Double): Self = StObject.set(x, "compliantDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setCompliantDeviceCountUndefined: Self = StObject.set(x, "compliantDeviceCount", js.undefined)
    
    inline def setCompliantUserCount(value: Double): Self = StObject.set(x, "compliantUserCount", value.asInstanceOf[js.Any])
    
    inline def setCompliantUserCountUndefined: Self = StObject.set(x, "compliantUserCount", js.undefined)
    
    inline def setConflictDeviceCount(value: Double): Self = StObject.set(x, "conflictDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setConflictDeviceCountUndefined: Self = StObject.set(x, "conflictDeviceCount", js.undefined)
    
    inline def setConflictUserCount(value: Double): Self = StObject.set(x, "conflictUserCount", value.asInstanceOf[js.Any])
    
    inline def setConflictUserCountUndefined: Self = StObject.set(x, "conflictUserCount", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setErrorDeviceCount(value: Double): Self = StObject.set(x, "errorDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setErrorDeviceCountUndefined: Self = StObject.set(x, "errorDeviceCount", js.undefined)
    
    inline def setErrorUserCount(value: Double): Self = StObject.set(x, "errorUserCount", value.asInstanceOf[js.Any])
    
    inline def setErrorUserCountUndefined: Self = StObject.set(x, "errorUserCount", js.undefined)
    
    inline def setNonCompliantDeviceCount(value: Double): Self = StObject.set(x, "nonCompliantDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setNonCompliantDeviceCountUndefined: Self = StObject.set(x, "nonCompliantDeviceCount", js.undefined)
    
    inline def setNonCompliantUserCount(value: Double): Self = StObject.set(x, "nonCompliantUserCount", value.asInstanceOf[js.Any])
    
    inline def setNonCompliantUserCountUndefined: Self = StObject.set(x, "nonCompliantUserCount", js.undefined)
    
    inline def setNotApplicableDeviceCount(value: Double): Self = StObject.set(x, "notApplicableDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setNotApplicableDeviceCountUndefined: Self = StObject.set(x, "notApplicableDeviceCount", js.undefined)
    
    inline def setNotApplicableUserCount(value: Double): Self = StObject.set(x, "notApplicableUserCount", value.asInstanceOf[js.Any])
    
    inline def setNotApplicableUserCountUndefined: Self = StObject.set(x, "notApplicableUserCount", js.undefined)
    
    inline def setRemediatedDeviceCount(value: Double): Self = StObject.set(x, "remediatedDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setRemediatedDeviceCountUndefined: Self = StObject.set(x, "remediatedDeviceCount", js.undefined)
    
    inline def setRemediatedUserCount(value: Double): Self = StObject.set(x, "remediatedUserCount", value.asInstanceOf[js.Any])
    
    inline def setRemediatedUserCountUndefined: Self = StObject.set(x, "remediatedUserCount", js.undefined)
    
    inline def setUnknownDeviceCount(value: Double): Self = StObject.set(x, "unknownDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setUnknownDeviceCountUndefined: Self = StObject.set(x, "unknownDeviceCount", js.undefined)
    
    inline def setUnknownUserCount(value: Double): Self = StObject.set(x, "unknownUserCount", value.asInstanceOf[js.Any])
    
    inline def setUnknownUserCountUndefined: Self = StObject.set(x, "unknownUserCount", js.undefined)
  }
}
