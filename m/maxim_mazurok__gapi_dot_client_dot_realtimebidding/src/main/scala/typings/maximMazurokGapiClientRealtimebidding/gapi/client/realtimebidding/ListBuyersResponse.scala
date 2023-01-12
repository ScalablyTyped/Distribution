package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBuyersResponse extends StObject {
  
  /** List of buyers. */
  var buyers: js.UndefOr[js.Array[Buyer]] = js.undefined
  
  /** A token which can be passed to a subsequent call to the `ListBuyers` method to retrieve the next page of results in ListBuyersRequest.pageToken. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListBuyersResponse {
  
  inline def apply(): ListBuyersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBuyersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBuyersResponse] (val x: Self) extends AnyVal {
    
    inline def setBuyers(value: js.Array[Buyer]): Self = StObject.set(x, "buyers", value.asInstanceOf[js.Any])
    
    inline def setBuyersUndefined: Self = StObject.set(x, "buyers", js.undefined)
    
    inline def setBuyersVarargs(value: Buyer*): Self = StObject.set(x, "buyers", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
