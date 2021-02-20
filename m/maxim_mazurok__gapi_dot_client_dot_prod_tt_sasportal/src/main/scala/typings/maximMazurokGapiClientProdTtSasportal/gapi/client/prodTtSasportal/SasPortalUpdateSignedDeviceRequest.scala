package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalUpdateSignedDeviceRequest extends StObject {
  
  /** Required. The JSON Web Token signed using a CPI private key. Payload must be the JSON encoding of the device. The user_id field must be set. */
  var encodedDevice: js.UndefOr[String] = js.native
  
  /** Required. Unique installer ID (CPI ID) from the Certified Professional Installers database. */
  var installerId: js.UndefOr[String] = js.native
}
object SasPortalUpdateSignedDeviceRequest {
  
  @scala.inline
  def apply(): SasPortalUpdateSignedDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalUpdateSignedDeviceRequest]
  }
  
  @scala.inline
  implicit class SasPortalUpdateSignedDeviceRequestMutableBuilder[Self <: SasPortalUpdateSignedDeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncodedDevice(value: String): Self = StObject.set(x, "encodedDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedDeviceUndefined: Self = StObject.set(x, "encodedDevice", js.undefined)
    
    @scala.inline
    def setInstallerId(value: String): Self = StObject.set(x, "installerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallerIdUndefined: Self = StObject.set(x, "installerId", js.undefined)
  }
}
