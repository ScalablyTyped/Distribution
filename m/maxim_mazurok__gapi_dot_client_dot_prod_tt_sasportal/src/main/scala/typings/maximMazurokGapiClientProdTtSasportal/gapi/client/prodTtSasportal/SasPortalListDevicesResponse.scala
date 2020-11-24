package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalListDevicesResponse extends js.Object {
  
  /** The devices that match the request. */
  var devices: js.UndefOr[js.Array[SasPortalDevice]] = js.native
  
  /**
    * A pagination token returned from a previous call to ListDevices method that indicates from where listing should continue. If the field is missing or empty, it means there is no more
    * devices.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SasPortalListDevicesResponse {
  
  @scala.inline
  def apply(): SasPortalListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalListDevicesResponse]
  }
  
  @scala.inline
  implicit class SasPortalListDevicesResponseOps[Self <: SasPortalListDevicesResponse] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
