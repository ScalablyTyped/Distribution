package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomBiddingAlgorithmsResponse extends StObject {
  
  /** The list of custom bidding algorithms. This list will be absent if empty. */
  var customBiddingAlgorithms: js.UndefOr[js.Array[CustomBiddingAlgorithm]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListCustomBiddingAlgorithmsRequest` method to retrieve the next page
    * of results. If this field is null, it means this is the last page.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListCustomBiddingAlgorithmsResponse {
  
  inline def apply(): ListCustomBiddingAlgorithmsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomBiddingAlgorithmsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCustomBiddingAlgorithmsResponse] (val x: Self) extends AnyVal {
    
    inline def setCustomBiddingAlgorithms(value: js.Array[CustomBiddingAlgorithm]): Self = StObject.set(x, "customBiddingAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setCustomBiddingAlgorithmsUndefined: Self = StObject.set(x, "customBiddingAlgorithms", js.undefined)
    
    inline def setCustomBiddingAlgorithmsVarargs(value: CustomBiddingAlgorithm*): Self = StObject.set(x, "customBiddingAlgorithms", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
