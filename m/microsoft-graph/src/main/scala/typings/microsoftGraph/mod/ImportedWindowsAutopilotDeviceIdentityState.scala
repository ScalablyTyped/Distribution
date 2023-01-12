package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportedWindowsAutopilotDeviceIdentityState extends StObject {
  
  // Device error code reported by Device Directory Service(DDS).
  var deviceErrorCode: js.UndefOr[Double] = js.undefined
  
  // Device error name reported by Device Directory Service(DDS).
  var deviceErrorName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Device status reported by Device Directory Service(DDS). Possible values are: unknown, pending, partial, complete,
    * error.
    */
  var deviceImportStatus: js.UndefOr[ImportedWindowsAutopilotDeviceIdentityImportStatus] = js.undefined
  
  // Device Registration ID for successfully added device reported by Device Directory Service(DDS).
  var deviceRegistrationId: js.UndefOr[NullableOption[String]] = js.undefined
}
object ImportedWindowsAutopilotDeviceIdentityState {
  
  inline def apply(): ImportedWindowsAutopilotDeviceIdentityState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportedWindowsAutopilotDeviceIdentityState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportedWindowsAutopilotDeviceIdentityState] (val x: Self) extends AnyVal {
    
    inline def setDeviceErrorCode(value: Double): Self = StObject.set(x, "deviceErrorCode", value.asInstanceOf[js.Any])
    
    inline def setDeviceErrorCodeUndefined: Self = StObject.set(x, "deviceErrorCode", js.undefined)
    
    inline def setDeviceErrorName(value: NullableOption[String]): Self = StObject.set(x, "deviceErrorName", value.asInstanceOf[js.Any])
    
    inline def setDeviceErrorNameNull: Self = StObject.set(x, "deviceErrorName", null)
    
    inline def setDeviceErrorNameUndefined: Self = StObject.set(x, "deviceErrorName", js.undefined)
    
    inline def setDeviceImportStatus(value: ImportedWindowsAutopilotDeviceIdentityImportStatus): Self = StObject.set(x, "deviceImportStatus", value.asInstanceOf[js.Any])
    
    inline def setDeviceImportStatusUndefined: Self = StObject.set(x, "deviceImportStatus", js.undefined)
    
    inline def setDeviceRegistrationId(value: NullableOption[String]): Self = StObject.set(x, "deviceRegistrationId", value.asInstanceOf[js.Any])
    
    inline def setDeviceRegistrationIdNull: Self = StObject.set(x, "deviceRegistrationId", null)
    
    inline def setDeviceRegistrationIdUndefined: Self = StObject.set(x, "deviceRegistrationId", js.undefined)
  }
}
