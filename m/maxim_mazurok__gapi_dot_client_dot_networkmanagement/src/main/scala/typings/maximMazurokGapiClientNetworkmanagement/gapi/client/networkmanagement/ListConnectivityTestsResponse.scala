package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListConnectivityTestsResponse extends StObject {
  
  /** Page token to fetch the next set of Connectivity Tests. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** List of Connectivity Tests. */
  var resources: js.UndefOr[js.Array[ConnectivityTest]] = js.native
  
  /** Locations that could not be reached (when querying all locations with `-`). */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
}
object ListConnectivityTestsResponse {
  
  @scala.inline
  def apply(): ListConnectivityTestsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectivityTestsResponse]
  }
  
  @scala.inline
  implicit class ListConnectivityTestsResponseMutableBuilder[Self <: ListConnectivityTestsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setResources(value: js.Array[ConnectivityTest]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: ConnectivityTest*): Self = StObject.set(x, "resources", js.Array(value :_*))
    
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    @scala.inline
    def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value :_*))
  }
}
