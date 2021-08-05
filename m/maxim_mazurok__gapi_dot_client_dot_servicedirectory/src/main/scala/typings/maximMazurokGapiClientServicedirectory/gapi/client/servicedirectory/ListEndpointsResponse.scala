package typings.maximMazurokGapiClientServicedirectory.gapi.client.servicedirectory

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEndpointsResponse extends StObject {
  
  /** The list of endpoints. */
  var endpoints: js.UndefOr[js.Array[Endpoint]] = js.undefined
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListEndpointsResponse {
  
  inline def apply(): ListEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEndpointsResponse]
  }
  
  extension [Self <: ListEndpointsResponse](x: Self) {
    
    inline def setEndpoints(value: js.Array[Endpoint]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "endpoints", js.undefined)
    
    inline def setEndpointsVarargs(value: Endpoint*): Self = StObject.set(x, "endpoints", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
