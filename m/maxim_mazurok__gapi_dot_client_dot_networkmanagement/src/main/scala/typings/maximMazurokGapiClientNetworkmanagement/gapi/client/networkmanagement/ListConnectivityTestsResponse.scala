package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConnectivityTestsResponse extends StObject {
  
  /** Page token to fetch the next set of Connectivity Tests. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** List of Connectivity Tests. */
  var resources: js.UndefOr[js.Array[ConnectivityTest]] = js.undefined
  
  /** Locations that could not be reached (when querying all locations with `-`). */
  var unreachable: js.UndefOr[js.Array[String]] = js.undefined
}
object ListConnectivityTestsResponse {
  
  inline def apply(): ListConnectivityTestsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectivityTestsResponse]
  }
  
  extension [Self <: ListConnectivityTestsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResources(value: js.Array[ConnectivityTest]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: ConnectivityTest*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
