package typings.maximMazurokGapiClientSmartdevicemanagement.gapi.client.smartdevicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleHomeEnterpriseSdmV1ListDevicesResponse extends js.Object {
  
  /** The list of devices. */
  var devices: js.UndefOr[js.Array[GoogleHomeEnterpriseSdmV1Device]] = js.native
  
  /** The pagination token to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleHomeEnterpriseSdmV1ListDevicesResponse {
  
  @scala.inline
  def apply(): GoogleHomeEnterpriseSdmV1ListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleHomeEnterpriseSdmV1ListDevicesResponse]
  }
  
  @scala.inline
  implicit class GoogleHomeEnterpriseSdmV1ListDevicesResponseOps[Self <: GoogleHomeEnterpriseSdmV1ListDevicesResponse] (val x: Self) extends AnyVal {
    
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
    def setDevicesVarargs(value: GoogleHomeEnterpriseSdmV1Device*): Self = this.set("devices", js.Array(value :_*))
    
    @scala.inline
    def setDevices(value: js.Array[GoogleHomeEnterpriseSdmV1Device]): Self = this.set("devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevices: Self = this.set("devices", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
