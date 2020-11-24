package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyTopicEvidence extends js.Object {
  
  /** The creative's destination URL was not crawlable by Google. */
  var destinationNotCrawlable: js.UndefOr[DestinationNotCrawlableEvidence] = js.native
  
  /** The creative's destination URL did not function properly or was incorrectly set up. */
  var destinationNotWorking: js.UndefOr[DestinationNotWorkingEvidence] = js.native
  
  /** URL of the actual landing page. */
  var destinationUrl: js.UndefOr[DestinationUrlEvidence] = js.native
  
  /** Number of HTTP calls made by the creative, broken down by domain. */
  var domainCall: js.UndefOr[DomainCallEvidence] = js.native
  
  /** Total download size and URL-level download size breakdown for resources in a creative. */
  var downloadSize: js.UndefOr[DownloadSizeEvidence] = js.native
  
  /** HTTP calls made by the creative that resulted in policy violations. */
  var httpCall: js.UndefOr[HttpCallEvidence] = js.native
  
  /** Evidence for HTTP cookie-related policy violations. */
  var httpCookie: js.UndefOr[HttpCookieEvidence] = js.native
}
object PolicyTopicEvidence {
  
  @scala.inline
  def apply(): PolicyTopicEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyTopicEvidence]
  }
  
  @scala.inline
  implicit class PolicyTopicEvidenceOps[Self <: PolicyTopicEvidence] (val x: Self) extends AnyVal {
    
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
    def setDestinationNotCrawlable(value: DestinationNotCrawlableEvidence): Self = this.set("destinationNotCrawlable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationNotCrawlable: Self = this.set("destinationNotCrawlable", js.undefined)
    
    @scala.inline
    def setDestinationNotWorking(value: DestinationNotWorkingEvidence): Self = this.set("destinationNotWorking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationNotWorking: Self = this.set("destinationNotWorking", js.undefined)
    
    @scala.inline
    def setDestinationUrl(value: DestinationUrlEvidence): Self = this.set("destinationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationUrl: Self = this.set("destinationUrl", js.undefined)
    
    @scala.inline
    def setDomainCall(value: DomainCallEvidence): Self = this.set("domainCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainCall: Self = this.set("domainCall", js.undefined)
    
    @scala.inline
    def setDownloadSize(value: DownloadSizeEvidence): Self = this.set("downloadSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadSize: Self = this.set("downloadSize", js.undefined)
    
    @scala.inline
    def setHttpCall(value: HttpCallEvidence): Self = this.set("httpCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpCall: Self = this.set("httpCall", js.undefined)
    
    @scala.inline
    def setHttpCookie(value: HttpCookieEvidence): Self = this.set("httpCookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpCookie: Self = this.set("httpCookie", js.undefined)
  }
}
