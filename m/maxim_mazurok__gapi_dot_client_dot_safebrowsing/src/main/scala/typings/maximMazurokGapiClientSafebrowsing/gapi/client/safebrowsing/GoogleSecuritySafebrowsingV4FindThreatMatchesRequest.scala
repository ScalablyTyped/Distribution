package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleSecuritySafebrowsingV4FindThreatMatchesRequest extends StObject {
  
  /** The client metadata. */
  var client: js.UndefOr[GoogleSecuritySafebrowsingV4ClientInfo] = js.undefined
  
  /** The lists and entries to be checked for matches. */
  var threatInfo: js.UndefOr[GoogleSecuritySafebrowsingV4ThreatInfo] = js.undefined
}
object GoogleSecuritySafebrowsingV4FindThreatMatchesRequest {
  
  inline def apply(): GoogleSecuritySafebrowsingV4FindThreatMatchesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleSecuritySafebrowsingV4FindThreatMatchesRequest]
  }
  
  extension [Self <: GoogleSecuritySafebrowsingV4FindThreatMatchesRequest](x: Self) {
    
    inline def setClient(value: GoogleSecuritySafebrowsingV4ClientInfo): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setThreatInfo(value: GoogleSecuritySafebrowsingV4ThreatInfo): Self = StObject.set(x, "threatInfo", value.asInstanceOf[js.Any])
    
    inline def setThreatInfoUndefined: Self = StObject.set(x, "threatInfo", js.undefined)
  }
}
