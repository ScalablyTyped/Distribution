package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIosReopenAttributionRequest extends js.Object {
  
  /** APP bundle ID. */
  var bundleId: js.UndefOr[String] = js.native
  
  /**
    * FDL link to be verified from an app universal link open. The FDL link can be one of: 1) short FDL. e.g. .page.link/, or 2) long FDL. e.g. .page.link/?{query params}, or 3) Invite
    * FDL. e.g. .page.link/i/
    */
  var requestedLink: js.UndefOr[String] = js.native
  
  /** Google SDK version. Version takes the form "$major.$minor.$patch" */
  var sdkVersion: js.UndefOr[String] = js.native
}
object GetIosReopenAttributionRequest {
  
  @scala.inline
  def apply(): GetIosReopenAttributionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIosReopenAttributionRequest]
  }
  
  @scala.inline
  implicit class GetIosReopenAttributionRequestOps[Self <: GetIosReopenAttributionRequest] (val x: Self) extends AnyVal {
    
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
    def setBundleId(value: String): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundleId: Self = this.set("bundleId", js.undefined)
    
    @scala.inline
    def setRequestedLink(value: String): Self = this.set("requestedLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedLink: Self = this.set("requestedLink", js.undefined)
    
    @scala.inline
    def setSdkVersion(value: String): Self = this.set("sdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSdkVersion: Self = this.set("sdkVersion", js.undefined)
  }
}
