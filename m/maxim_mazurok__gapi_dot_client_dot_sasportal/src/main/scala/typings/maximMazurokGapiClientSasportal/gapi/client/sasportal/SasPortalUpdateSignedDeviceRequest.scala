package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalUpdateSignedDeviceRequest extends js.Object {
  
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
  implicit class SasPortalUpdateSignedDeviceRequestOps[Self <: SasPortalUpdateSignedDeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEncodedDevice(value: String): Self = this.set("encodedDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncodedDevice: Self = this.set("encodedDevice", js.undefined)
    
    @scala.inline
    def setInstallerId(value: String): Self = this.set("installerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallerId: Self = this.set("installerId", js.undefined)
  }
}
