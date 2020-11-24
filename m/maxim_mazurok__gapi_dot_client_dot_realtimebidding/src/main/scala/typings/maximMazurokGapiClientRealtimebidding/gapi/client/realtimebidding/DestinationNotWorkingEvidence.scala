package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestinationNotWorkingEvidence extends js.Object {
  
  /** DNS lookup errors. */
  var dnsError: js.UndefOr[String] = js.native
  
  /** The full non-working URL. */
  var expandedUrl: js.UndefOr[String] = js.native
  
  /** HTTP error code (e.g. 404 or 5xx) */
  var httpError: js.UndefOr[Double] = js.native
  
  /** Page was crawled successfully, but was detected as either a page with no content or an error page. */
  var invalidPage: js.UndefOr[String] = js.native
  
  /** Approximate time when the ad destination was last checked. */
  var lastCheckTime: js.UndefOr[String] = js.native
  
  /** Platform of the non-working URL. */
  var platform: js.UndefOr[String] = js.native
  
  /** HTTP redirect chain error. */
  var redirectionError: js.UndefOr[String] = js.native
  
  /** Rejected because of malformed URLs or invalid requests. */
  var urlRejected: js.UndefOr[String] = js.native
}
object DestinationNotWorkingEvidence {
  
  @scala.inline
  def apply(): DestinationNotWorkingEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationNotWorkingEvidence]
  }
  
  @scala.inline
  implicit class DestinationNotWorkingEvidenceOps[Self <: DestinationNotWorkingEvidence] (val x: Self) extends AnyVal {
    
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
    def setDnsError(value: String): Self = this.set("dnsError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsError: Self = this.set("dnsError", js.undefined)
    
    @scala.inline
    def setExpandedUrl(value: String): Self = this.set("expandedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandedUrl: Self = this.set("expandedUrl", js.undefined)
    
    @scala.inline
    def setHttpError(value: Double): Self = this.set("httpError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpError: Self = this.set("httpError", js.undefined)
    
    @scala.inline
    def setInvalidPage(value: String): Self = this.set("invalidPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidPage: Self = this.set("invalidPage", js.undefined)
    
    @scala.inline
    def setLastCheckTime(value: String): Self = this.set("lastCheckTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastCheckTime: Self = this.set("lastCheckTime", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setRedirectionError(value: String): Self = this.set("redirectionError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectionError: Self = this.set("redirectionError", js.undefined)
    
    @scala.inline
    def setUrlRejected(value: String): Self = this.set("urlRejected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlRejected: Self = this.set("urlRejected", js.undefined)
  }
}
