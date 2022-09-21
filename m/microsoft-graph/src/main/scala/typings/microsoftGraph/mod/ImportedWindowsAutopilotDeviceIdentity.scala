package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportedWindowsAutopilotDeviceIdentity
  extends StObject
     with Entity {
  
  // UPN of the user the device will be assigned
  var assignedUserPrincipalName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Group Tag of the Windows autopilot device.
  var groupTag: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Hardware Blob of the Windows autopilot device.
  var hardwareIdentifier: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The Import Id of the Windows autopilot device.
  var importId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Product Key of the Windows autopilot device.
  var productKey: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Serial number of the Windows autopilot device.
  var serialNumber: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Current state of the imported device.
  var state: js.UndefOr[NullableOption[ImportedWindowsAutopilotDeviceIdentityState]] = js.undefined
}
object ImportedWindowsAutopilotDeviceIdentity {
  
  inline def apply(): ImportedWindowsAutopilotDeviceIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportedWindowsAutopilotDeviceIdentity]
  }
  
  extension [Self <: ImportedWindowsAutopilotDeviceIdentity](x: Self) {
    
    inline def setAssignedUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "assignedUserPrincipalName", value.asInstanceOf[js.Any])
    
    inline def setAssignedUserPrincipalNameNull: Self = StObject.set(x, "assignedUserPrincipalName", null)
    
    inline def setAssignedUserPrincipalNameUndefined: Self = StObject.set(x, "assignedUserPrincipalName", js.undefined)
    
    inline def setGroupTag(value: NullableOption[String]): Self = StObject.set(x, "groupTag", value.asInstanceOf[js.Any])
    
    inline def setGroupTagNull: Self = StObject.set(x, "groupTag", null)
    
    inline def setGroupTagUndefined: Self = StObject.set(x, "groupTag", js.undefined)
    
    inline def setHardwareIdentifier(value: NullableOption[String]): Self = StObject.set(x, "hardwareIdentifier", value.asInstanceOf[js.Any])
    
    inline def setHardwareIdentifierNull: Self = StObject.set(x, "hardwareIdentifier", null)
    
    inline def setHardwareIdentifierUndefined: Self = StObject.set(x, "hardwareIdentifier", js.undefined)
    
    inline def setImportId(value: NullableOption[String]): Self = StObject.set(x, "importId", value.asInstanceOf[js.Any])
    
    inline def setImportIdNull: Self = StObject.set(x, "importId", null)
    
    inline def setImportIdUndefined: Self = StObject.set(x, "importId", js.undefined)
    
    inline def setProductKey(value: NullableOption[String]): Self = StObject.set(x, "productKey", value.asInstanceOf[js.Any])
    
    inline def setProductKeyNull: Self = StObject.set(x, "productKey", null)
    
    inline def setProductKeyUndefined: Self = StObject.set(x, "productKey", js.undefined)
    
    inline def setSerialNumber(value: NullableOption[String]): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberNull: Self = StObject.set(x, "serialNumber", null)
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setState(value: NullableOption[ImportedWindowsAutopilotDeviceIdentityState]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
