package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleApiServiceusageV1beta1GetServiceIdentityResponse extends js.Object {
  
  /**
    * Service identity that service producer can use to access consumer resources. If exists is true, it contains email and unique_id. If exists is false, it contains pre-constructed
    * email and empty unique_id.
    */
  var identity: js.UndefOr[GoogleApiServiceusageV1beta1ServiceIdentity] = js.native
  
  /** Service identity state. */
  var state: js.UndefOr[String] = js.native
}
object GoogleApiServiceusageV1beta1GetServiceIdentityResponse {
  
  @scala.inline
  def apply(): GoogleApiServiceusageV1beta1GetServiceIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleApiServiceusageV1beta1GetServiceIdentityResponse]
  }
  
  @scala.inline
  implicit class GoogleApiServiceusageV1beta1GetServiceIdentityResponseOps[Self <: GoogleApiServiceusageV1beta1GetServiceIdentityResponse] (val x: Self) extends AnyVal {
    
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
    def setIdentity(value: GoogleApiServiceusageV1beta1ServiceIdentity): Self = this.set("identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentity: Self = this.set("identity", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
