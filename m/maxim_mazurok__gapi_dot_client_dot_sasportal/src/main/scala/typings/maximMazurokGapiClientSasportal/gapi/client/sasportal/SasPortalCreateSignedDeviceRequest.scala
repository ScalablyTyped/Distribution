package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalCreateSignedDeviceRequest extends StObject {
  
  /** Required. JSON Web Token signed using a CPI private key. Payload must be the JSON encoding of the device. The user_id field must be set. */
  var encodedDevice: js.UndefOr[String] = js.undefined
  
  /** Required. Unique installer id (CPI ID) from the Certified Professional Installers database. */
  var installerId: js.UndefOr[String] = js.undefined
}
object SasPortalCreateSignedDeviceRequest {
  
  inline def apply(): SasPortalCreateSignedDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalCreateSignedDeviceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SasPortalCreateSignedDeviceRequest] (val x: Self) extends AnyVal {
    
    inline def setEncodedDevice(value: String): Self = StObject.set(x, "encodedDevice", value.asInstanceOf[js.Any])
    
    inline def setEncodedDeviceUndefined: Self = StObject.set(x, "encodedDevice", js.undefined)
    
    inline def setInstallerId(value: String): Self = StObject.set(x, "installerId", value.asInstanceOf[js.Any])
    
    inline def setInstallerIdUndefined: Self = StObject.set(x, "installerId", js.undefined)
  }
}
