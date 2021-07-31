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
  
  @scala.inline
  def apply(): ListNegativeKeywordListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNegativeKeywordListsResponse]
  }
  
  @scala.inline
  implicit class ListNegativeKeywordListsResponseMutableBuilder[Self <: ListNegativeKeywordListsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNegativeKeywordLists(value: js.Array[NegativeKeywordList]): Self = StObject.set(x, "negativeKeywordLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeKeywordListsUndefined: Self = StObject.set(x, "negativeKeywordLists", js.undefined)
    
    @scala.inline
    def setNegativeKeywordListsVarargs(value: NegativeKeywordList*): Self = StObject.set(x, "negativeKeywordLists", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
