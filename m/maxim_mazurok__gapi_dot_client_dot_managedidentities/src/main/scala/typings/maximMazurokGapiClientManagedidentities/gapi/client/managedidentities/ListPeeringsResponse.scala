package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPeeringsResponse extends StObject {
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** A list of Managed Identities Service Peerings in the project. */
  var peerings: js.UndefOr[js.Array[Peering]] = js.undefined
  
  /** Locations that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.undefined
}
object ListPeeringsResponse {
  
  inline def apply(): ListPeeringsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPeeringsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPeeringsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPeerings(value: js.Array[Peering]): Self = StObject.set(x, "peerings", value.asInstanceOf[js.Any])
    
    inline def setPeeringsUndefined: Self = StObject.set(x, "peerings", js.undefined)
    
    inline def setPeeringsVarargs(value: Peering*): Self = StObject.set(x, "peerings", js.Array(value*))
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
