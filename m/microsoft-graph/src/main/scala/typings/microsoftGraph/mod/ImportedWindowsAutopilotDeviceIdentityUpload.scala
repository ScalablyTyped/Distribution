package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportedWindowsAutopilotDeviceIdentityUpload
  extends StObject
     with Entity {
  
  // DateTime when the entity is created.
  var createdDateTimeUtc: js.UndefOr[String] = js.undefined
  
  // Collection of all Autopilot devices as a part of this upload.
  var deviceIdentities: js.UndefOr[NullableOption[js.Array[ImportedWindowsAutopilotDeviceIdentity]]] = js.undefined
  
  // Upload status.
  var status: js.UndefOr[ImportedWindowsAutopilotDeviceIdentityUploadStatus] = js.undefined
}
object ImportedWindowsAutopilotDeviceIdentityUpload {
  
  inline def apply(): ImportedWindowsAutopilotDeviceIdentityUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportedWindowsAutopilotDeviceIdentityUpload]
  }
  
  extension [Self <: ImportedWindowsAutopilotDeviceIdentityUpload](x: Self) {
    
    inline def setCreatedDateTimeUtc(value: String): Self = StObject.set(x, "createdDateTimeUtc", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUtcUndefined: Self = StObject.set(x, "createdDateTimeUtc", js.undefined)
    
    inline def setDeviceIdentities(value: NullableOption[js.Array[ImportedWindowsAutopilotDeviceIdentity]]): Self = StObject.set(x, "deviceIdentities", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdentitiesNull: Self = StObject.set(x, "deviceIdentities", null)
    
    inline def setDeviceIdentitiesUndefined: Self = StObject.set(x, "deviceIdentities", js.undefined)
    
    inline def setDeviceIdentitiesVarargs(value: ImportedWindowsAutopilotDeviceIdentity*): Self = StObject.set(x, "deviceIdentities", js.Array(value*))
    
    inline def setStatus(value: ImportedWindowsAutopilotDeviceIdentityUploadStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
