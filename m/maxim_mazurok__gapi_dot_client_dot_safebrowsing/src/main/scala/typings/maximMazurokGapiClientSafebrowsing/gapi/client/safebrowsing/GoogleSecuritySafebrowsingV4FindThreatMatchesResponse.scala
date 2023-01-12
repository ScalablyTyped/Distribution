package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleSecuritySafebrowsingV4FindThreatMatchesResponse extends StObject {
  
  /** The threat list matches. */
  var matches: js.UndefOr[js.Array[GoogleSecuritySafebrowsingV4ThreatMatch]] = js.undefined
}
object GoogleSecuritySafebrowsingV4FindThreatMatchesResponse {
  
  inline def apply(): GoogleSecuritySafebrowsingV4FindThreatMatchesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleSecuritySafebrowsingV4FindThreatMatchesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleSecuritySafebrowsingV4FindThreatMatchesResponse] (val x: Self) extends AnyVal {
    
    inline def setMatches(value: js.Array[GoogleSecuritySafebrowsingV4ThreatMatch]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    inline def setMatchesVarargs(value: GoogleSecuritySafebrowsingV4ThreatMatch*): Self = StObject.set(x, "matches", js.Array(value*))
  }
}
