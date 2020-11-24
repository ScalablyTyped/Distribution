package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalBulkCreateDeviceResponse extends js.Object {
  
  /** Required. The devices that were imported. */
  var devices: js.UndefOr[js.Array[SasPortalDevice]] = js.native
}
object SasPortalBulkCreateDeviceResponse {
  
  @scala.inline
  def apply(): SasPortalBulkCreateDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalBulkCreateDeviceResponse]
  }
  
  @scala.inline
  implicit class SasPortalBulkCreateDeviceResponseOps[Self <: SasPortalBulkCreateDeviceResponse] (val x: Self) extends AnyVal {
    
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
    def setDevicesVarargs(value: SasPortalDevice*): Self = this.set("devices", js.Array(value :_*))
    
    @scala.inline
    def setDevices(value: js.Array[SasPortalDevice]): Self = this.set("devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevices: Self = this.set("devices", js.undefined)
  }
}
