package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIosReopenAttributionResponse extends js.Object {
  
  /** The deep-link attributed the app universal link open. For both regular FDL links and invite FDL links. */
  var deepLink: js.UndefOr[String] = js.native
  
  /** Optional invitation ID, for only invite typed requested FDL links. */
  var invitationId: js.UndefOr[String] = js.native
  
  /** FDL input value of the "&imv=" parameter, minimum app version to be returned to Google Firebase SDK running on iOS-9. */
  var iosMinAppVersion: js.UndefOr[String] = js.native
  
  /** The entire FDL, expanded from a short link. It is the same as the requested_link, if it is long. */
  var resolvedLink: js.UndefOr[String] = js.native
  
  /** Scion campaign value to be propagated by iSDK to Scion at app-reopen. */
  var utmCampaign: js.UndefOr[String] = js.native
  
  /** Scion content value to be propagated by iSDK to Scion at app-reopen. */
  var utmContent: js.UndefOr[String] = js.native
  
  /** Scion medium value to be propagated by iSDK to Scion at app-reopen. */
  var utmMedium: js.UndefOr[String] = js.native
  
  /** Scion source value to be propagated by iSDK to Scion at app-reopen. */
  var utmSource: js.UndefOr[String] = js.native
  
  /** Scion term value to be propagated by iSDK to Scion at app-reopen. */
  var utmTerm: js.UndefOr[String] = js.native
}
object GetIosReopenAttributionResponse {
  
  @scala.inline
  def apply(): GetIosReopenAttributionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIosReopenAttributionResponse]
  }
  
  @scala.inline
  implicit class GetIosReopenAttributionResponseOps[Self <: GetIosReopenAttributionResponse] (val x: Self) extends AnyVal {
    
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
    def setDeepLink(value: String): Self = this.set("deepLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeepLink: Self = this.set("deepLink", js.undefined)
    
    @scala.inline
    def setInvitationId(value: String): Self = this.set("invitationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvitationId: Self = this.set("invitationId", js.undefined)
    
    @scala.inline
    def setIosMinAppVersion(value: String): Self = this.set("iosMinAppVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosMinAppVersion: Self = this.set("iosMinAppVersion", js.undefined)
    
    @scala.inline
    def setResolvedLink(value: String): Self = this.set("resolvedLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolvedLink: Self = this.set("resolvedLink", js.undefined)
    
    @scala.inline
    def setUtmCampaign(value: String): Self = this.set("utmCampaign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtmCampaign: Self = this.set("utmCampaign", js.undefined)
    
    @scala.inline
    def setUtmContent(value: String): Self = this.set("utmContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtmContent: Self = this.set("utmContent", js.undefined)
    
    @scala.inline
    def setUtmMedium(value: String): Self = this.set("utmMedium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtmMedium: Self = this.set("utmMedium", js.undefined)
    
    @scala.inline
    def setUtmSource(value: String): Self = this.set("utmSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtmSource: Self = this.set("utmSource", js.undefined)
    
    @scala.inline
    def setUtmTerm(value: String): Self = this.set("utmTerm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtmTerm: Self = this.set("utmTerm", js.undefined)
  }
}
