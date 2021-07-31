package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyTopicEvidence extends StObject {
  
  /** The creative's destination URL was not crawlable by Google. */
  var destinationNotCrawlable: js.UndefOr[DestinationNotCrawlableEvidence] = js.undefined
  
  /** The creative's destination URL did not function properly or was incorrectly set up. */
  var destinationNotWorking: js.UndefOr[DestinationNotWorkingEvidence] = js.undefined
  
  /** URL of the actual landing page. */
  var destinationUrl: js.UndefOr[DestinationUrlEvidence] = js.undefined
  
  /** Number of HTTP calls made by the creative, broken down by domain. */
  var domainCall: js.UndefOr[DomainCallEvidence] = js.undefined
  
  /** Total download size and URL-level download size breakdown for resources in a creative. */
  var downloadSize: js.UndefOr[DownloadSizeEvidence] = js.undefined
  
  /** HTTP calls made by the creative that resulted in policy violations. */
  var httpCall: js.UndefOr[HttpCallEvidence] = js.undefined
  
  /** Evidence for HTTP cookie-related policy violations. */
  var httpCookie: js.UndefOr[HttpCookieEvidence] = js.undefined
}
object PolicyTopicEvidence {
  
  @scala.inline
  def apply(): PolicyTopicEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyTopicEvidence]
  }
  
  @scala.inline
  implicit class PolicyTopicEvidenceMutableBuilder[Self <: PolicyTopicEvidence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationNotCrawlable(value: DestinationNotCrawlableEvidence): Self = StObject.set(x, "destinationNotCrawlable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationNotCrawlableUndefined: Self = StObject.set(x, "destinationNotCrawlable", js.undefined)
    
    @scala.inline
    def setDestinationNotWorking(value: DestinationNotWorkingEvidence): Self = StObject.set(x, "destinationNotWorking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationNotWorkingUndefined: Self = StObject.set(x, "destinationNotWorking", js.undefined)
    
    @scala.inline
    def setDestinationUrl(value: DestinationUrlEvidence): Self = StObject.set(x, "destinationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUrlUndefined: Self = StObject.set(x, "destinationUrl", js.undefined)
    
    @scala.inline
    def setDomainCall(value: DomainCallEvidence): Self = StObject.set(x, "domainCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainCallUndefined: Self = StObject.set(x, "domainCall", js.undefined)
    
    @scala.inline
    def setDownloadSize(value: DownloadSizeEvidence): Self = StObject.set(x, "downloadSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadSizeUndefined: Self = StObject.set(x, "downloadSize", js.undefined)
    
    @scala.inline
    def setHttpCall(value: HttpCallEvidence): Self = StObject.set(x, "httpCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpCallUndefined: Self = StObject.set(x, "httpCall", js.undefined)
    
    @scala.inline
    def setHttpCookie(value: HttpCookieEvidence): Self = StObject.set(x, "httpCookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpCookieUndefined: Self = StObject.set(x, "httpCookie", js.undefined)
  }
}
