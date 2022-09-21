package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBiddersResponse extends StObject {
  
  /** List of bidders. */
  var bidders: js.UndefOr[js.Array[Bidder]] = js.undefined
  
  /** A token which can be passed to a subsequent call to the `ListBidders` method to retrieve the next page of results in ListBiddersRequest.pageToken. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListBiddersResponse {
  
  inline def apply(): ListBiddersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBiddersResponse]
  }
  
  extension [Self <: ListBiddersResponse](x: Self) {
    
    inline def setBidders(value: js.Array[Bidder]): Self = StObject.set(x, "bidders", value.asInstanceOf[js.Any])
    
    inline def setBiddersUndefined: Self = StObject.set(x, "bidders", js.undefined)
    
    inline def setBiddersVarargs(value: Bidder*): Self = StObject.set(x, "bidders", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
