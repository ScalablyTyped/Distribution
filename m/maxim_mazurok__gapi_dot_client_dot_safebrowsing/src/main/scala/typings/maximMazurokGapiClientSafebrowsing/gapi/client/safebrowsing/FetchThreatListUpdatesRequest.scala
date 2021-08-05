package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchThreatListUpdatesRequest extends StObject {
  
  /** The client metadata. */
  var client: js.UndefOr[ClientInfo] = js.undefined
  
  /** The requested threat list updates. */
  var listUpdateRequests: js.UndefOr[js.Array[ListUpdateRequest]] = js.undefined
}
object FetchThreatListUpdatesRequest {
  
  inline def apply(): FetchThreatListUpdatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchThreatListUpdatesRequest]
  }
  
  extension [Self <: FetchThreatListUpdatesRequest](x: Self) {
    
    inline def setClient(value: ClientInfo): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setListUpdateRequests(value: js.Array[ListUpdateRequest]): Self = StObject.set(x, "listUpdateRequests", value.asInstanceOf[js.Any])
    
    inline def setListUpdateRequestsUndefined: Self = StObject.set(x, "listUpdateRequests", js.undefined)
    
    inline def setListUpdateRequestsVarargs(value: ListUpdateRequest*): Self = StObject.set(x, "listUpdateRequests", js.Array(value :_*))
  }
}
