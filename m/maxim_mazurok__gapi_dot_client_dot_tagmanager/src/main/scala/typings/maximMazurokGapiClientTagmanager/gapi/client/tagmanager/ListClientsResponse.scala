package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClientsResponse extends StObject {
  
  /** All GTM Clients of a GTM Container. */
  var client: js.UndefOr[js.Array[Client]] = js.undefined
  
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListClientsResponse {
  
  inline def apply(): ListClientsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClientsResponse]
  }
  
  extension [Self <: ListClientsResponse](x: Self) {
    
    inline def setClient(value: js.Array[Client]): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setClientVarargs(value: Client*): Self = StObject.set(x, "client", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
