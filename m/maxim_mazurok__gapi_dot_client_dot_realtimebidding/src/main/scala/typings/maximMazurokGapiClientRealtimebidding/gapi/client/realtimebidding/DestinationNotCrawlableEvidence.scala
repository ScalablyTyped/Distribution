package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationNotCrawlableEvidence extends StObject {
  
  /** Approximate time of the crawl. */
  var crawlTime: js.UndefOr[String] = js.undefined
  
  /** Destination URL that was attempted to be crawled. */
  var crawledUrl: js.UndefOr[String] = js.undefined
  
  /** Reason of destination not crawlable. */
  var reason: js.UndefOr[String] = js.undefined
}
object DestinationNotCrawlableEvidence {
  
  inline def apply(): DestinationNotCrawlableEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationNotCrawlableEvidence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DestinationNotCrawlableEvidence] (val x: Self) extends AnyVal {
    
    inline def setCrawlTime(value: String): Self = StObject.set(x, "crawlTime", value.asInstanceOf[js.Any])
    
    inline def setCrawlTimeUndefined: Self = StObject.set(x, "crawlTime", js.undefined)
    
    inline def setCrawledUrl(value: String): Self = StObject.set(x, "crawledUrl", value.asInstanceOf[js.Any])
    
    inline def setCrawledUrlUndefined: Self = StObject.set(x, "crawledUrl", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
