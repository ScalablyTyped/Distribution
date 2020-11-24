package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudSecuritycenterV1beta1RunAssetDiscoveryResponse extends js.Object {
  
  /** The duration between asset discovery run start and end */
  var duration: js.UndefOr[String] = js.native
  
  /** The state of an asset discovery run. */
  var state: js.UndefOr[String] = js.native
}
object GoogleCloudSecuritycenterV1beta1RunAssetDiscoveryResponse {
  
  @scala.inline
  def apply(): GoogleCloudSecuritycenterV1beta1RunAssetDiscoveryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSecuritycenterV1beta1RunAssetDiscoveryResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudSecuritycenterV1beta1RunAssetDiscoveryResponseOps[Self <: GoogleCloudSecuritycenterV1beta1RunAssetDiscoveryResponse] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
