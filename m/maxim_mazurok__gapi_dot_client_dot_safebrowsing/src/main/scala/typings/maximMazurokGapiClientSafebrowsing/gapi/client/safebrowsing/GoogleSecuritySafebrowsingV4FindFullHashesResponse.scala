package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleSecuritySafebrowsingV4FindFullHashesResponse extends StObject {
  
  /** The full hashes that matched the requested prefixes. */
  var matches: js.UndefOr[js.Array[GoogleSecuritySafebrowsingV4ThreatMatch]] = js.undefined
  
  /** The minimum duration the client must wait before issuing any find hashes request. If this field is not set, clients can issue a request as soon as they want. */
  var minimumWaitDuration: js.UndefOr[String] = js.undefined
  
  /** For requested entities that did not match the threat list, how long to cache the response. */
  var negativeCacheDuration: js.UndefOr[String] = js.undefined
}
object GoogleSecuritySafebrowsingV4FindFullHashesResponse {
  
  inline def apply(): GoogleSecuritySafebrowsingV4FindFullHashesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleSecuritySafebrowsingV4FindFullHashesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleSecuritySafebrowsingV4FindFullHashesResponse] (val x: Self) extends AnyVal {
    
    inline def setMatches(value: js.Array[GoogleSecuritySafebrowsingV4ThreatMatch]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    inline def setMatchesVarargs(value: GoogleSecuritySafebrowsingV4ThreatMatch*): Self = StObject.set(x, "matches", js.Array(value*))
    
    inline def setMinimumWaitDuration(value: String): Self = StObject.set(x, "minimumWaitDuration", value.asInstanceOf[js.Any])
    
    inline def setMinimumWaitDurationUndefined: Self = StObject.set(x, "minimumWaitDuration", js.undefined)
    
    inline def setNegativeCacheDuration(value: String): Self = StObject.set(x, "negativeCacheDuration", value.asInstanceOf[js.Any])
    
    inline def setNegativeCacheDurationUndefined: Self = StObject.set(x, "negativeCacheDuration", js.undefined)
  }
}
