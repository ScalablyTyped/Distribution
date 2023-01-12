package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequest extends StObject {
  
  /** The client metadata. */
  var client: js.UndefOr[GoogleSecuritySafebrowsingV4ClientInfo] = js.undefined
  
  /** The requested threat list updates. */
  var listUpdateRequests: js.UndefOr[
    js.Array[GoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequestListUpdateRequest]
  ] = js.undefined
}
object GoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequest {
  
  inline def apply(): GoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequest] (val x: Self) extends AnyVal {
    
    inline def setClient(value: GoogleSecuritySafebrowsingV4ClientInfo): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setListUpdateRequests(value: js.Array[GoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequestListUpdateRequest]): Self = StObject.set(x, "listUpdateRequests", value.asInstanceOf[js.Any])
    
    inline def setListUpdateRequestsUndefined: Self = StObject.set(x, "listUpdateRequests", js.undefined)
    
    inline def setListUpdateRequestsVarargs(value: GoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequestListUpdateRequest*): Self = StObject.set(x, "listUpdateRequests", js.Array(value*))
  }
}
