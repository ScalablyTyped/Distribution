package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNegativeKeywordListsResponse extends StObject {
  
  /** The list of negative keyword lists. This list will be absent if empty. */
  var negativeKeywordLists: js.UndefOr[js.Array[NegativeKeywordList]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListNegativeKeywordLists` method to retrieve the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListNegativeKeywordListsResponse {
  
  inline def apply(): ListNegativeKeywordListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNegativeKeywordListsResponse]
  }
  
  extension [Self <: ListNegativeKeywordListsResponse](x: Self) {
    
    inline def setNegativeKeywordLists(value: js.Array[NegativeKeywordList]): Self = StObject.set(x, "negativeKeywordLists", value.asInstanceOf[js.Any])
    
    inline def setNegativeKeywordListsUndefined: Self = StObject.set(x, "negativeKeywordLists", js.undefined)
    
    inline def setNegativeKeywordListsVarargs(value: NegativeKeywordList*): Self = StObject.set(x, "negativeKeywordLists", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
