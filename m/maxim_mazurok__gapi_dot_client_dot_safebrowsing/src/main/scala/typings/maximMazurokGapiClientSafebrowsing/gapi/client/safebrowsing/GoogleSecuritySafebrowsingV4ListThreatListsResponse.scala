package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleSecuritySafebrowsingV4ListThreatListsResponse extends StObject {
  
  /** The lists available for download by the client. */
  var threatLists: js.UndefOr[js.Array[GoogleSecuritySafebrowsingV4ThreatListDescriptor]] = js.undefined
}
object GoogleSecuritySafebrowsingV4ListThreatListsResponse {
  
  inline def apply(): GoogleSecuritySafebrowsingV4ListThreatListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleSecuritySafebrowsingV4ListThreatListsResponse]
  }
  
  extension [Self <: GoogleSecuritySafebrowsingV4ListThreatListsResponse](x: Self) {
    
    inline def setThreatLists(value: js.Array[GoogleSecuritySafebrowsingV4ThreatListDescriptor]): Self = StObject.set(x, "threatLists", value.asInstanceOf[js.Any])
    
    inline def setThreatListsUndefined: Self = StObject.set(x, "threatLists", js.undefined)
    
    inline def setThreatListsVarargs(value: GoogleSecuritySafebrowsingV4ThreatListDescriptor*): Self = StObject.set(x, "threatLists", js.Array(value*))
  }
}
