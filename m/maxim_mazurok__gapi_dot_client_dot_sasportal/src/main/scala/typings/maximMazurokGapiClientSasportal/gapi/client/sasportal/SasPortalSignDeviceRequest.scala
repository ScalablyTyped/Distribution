package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalSignDeviceRequest extends js.Object {
  
  /** Required. The device to sign. The device fields name, fcc_id and serial_number must be set. The user_id field must be set. */
  var device: js.UndefOr[SasPortalDevice] = js.native
}
object SasPortalSignDeviceRequest {
  
  @scala.inline
  def apply(): SasPortalSignDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalSignDeviceRequest]
  }
  
  @scala.inline
  implicit class SasPortalSignDeviceRequestOps[Self <: SasPortalSignDeviceRequest] (val x: Self) extends AnyVal {
    
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
    def setDevice(value: SasPortalDevice): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
  }
}
