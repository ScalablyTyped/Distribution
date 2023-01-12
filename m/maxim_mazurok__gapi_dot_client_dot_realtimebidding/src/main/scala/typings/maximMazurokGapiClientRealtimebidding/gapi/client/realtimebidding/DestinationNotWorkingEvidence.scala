package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationNotWorkingEvidence extends StObject {
  
  /** DNS lookup errors. */
  var dnsError: js.UndefOr[String] = js.undefined
  
  /** The full non-working URL. */
  var expandedUrl: js.UndefOr[String] = js.undefined
  
  /** HTTP error code (e.g. 404 or 5xx) */
  var httpError: js.UndefOr[Double] = js.undefined
  
  /** Page was crawled successfully, but was detected as either a page with no content or an error page. */
  var invalidPage: js.UndefOr[String] = js.undefined
  
  /** Approximate time when the ad destination was last checked. */
  var lastCheckTime: js.UndefOr[String] = js.undefined
  
  /** Platform of the non-working URL. */
  var platform: js.UndefOr[String] = js.undefined
  
  /** HTTP redirect chain error. */
  var redirectionError: js.UndefOr[String] = js.undefined
  
  /** Rejected because of malformed URLs or invalid requests. */
  var urlRejected: js.UndefOr[String] = js.undefined
}
object DestinationNotWorkingEvidence {
  
  inline def apply(): DestinationNotWorkingEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationNotWorkingEvidence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DestinationNotWorkingEvidence] (val x: Self) extends AnyVal {
    
    inline def setDnsError(value: String): Self = StObject.set(x, "dnsError", value.asInstanceOf[js.Any])
    
    inline def setDnsErrorUndefined: Self = StObject.set(x, "dnsError", js.undefined)
    
    inline def setExpandedUrl(value: String): Self = StObject.set(x, "expandedUrl", value.asInstanceOf[js.Any])
    
    inline def setExpandedUrlUndefined: Self = StObject.set(x, "expandedUrl", js.undefined)
    
    inline def setHttpError(value: Double): Self = StObject.set(x, "httpError", value.asInstanceOf[js.Any])
    
    inline def setHttpErrorUndefined: Self = StObject.set(x, "httpError", js.undefined)
    
    inline def setInvalidPage(value: String): Self = StObject.set(x, "invalidPage", value.asInstanceOf[js.Any])
    
    inline def setInvalidPageUndefined: Self = StObject.set(x, "invalidPage", js.undefined)
    
    inline def setLastCheckTime(value: String): Self = StObject.set(x, "lastCheckTime", value.asInstanceOf[js.Any])
    
    inline def setLastCheckTimeUndefined: Self = StObject.set(x, "lastCheckTime", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setRedirectionError(value: String): Self = StObject.set(x, "redirectionError", value.asInstanceOf[js.Any])
    
    inline def setRedirectionErrorUndefined: Self = StObject.set(x, "redirectionError", js.undefined)
    
    inline def setUrlRejected(value: String): Self = StObject.set(x, "urlRejected", value.asInstanceOf[js.Any])
    
    inline def setUrlRejectedUndefined: Self = StObject.set(x, "urlRejected", js.undefined)
  }
}
