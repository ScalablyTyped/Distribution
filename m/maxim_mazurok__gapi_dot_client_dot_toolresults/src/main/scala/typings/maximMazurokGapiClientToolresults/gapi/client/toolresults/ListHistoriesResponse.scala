package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHistoriesResponse extends StObject {
  
  /** Histories. */
  var histories: js.UndefOr[js.Array[History]] = js.undefined
  
  /**
    * A continuation token to resume the query at the next item. Will only be set if there are more histories to fetch. Tokens are valid for up to one hour from the time of the first list
    * request. For instance, if you make a list request at 1PM and use the token from this first request 10 minutes later, the token from this second response will only be valid for 50
    * minutes.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListHistoriesResponse {
  
  @scala.inline
  def apply(): ListHistoriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHistoriesResponse]
  }
  
  @scala.inline
  implicit class ListHistoriesResponseMutableBuilder[Self <: ListHistoriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHistories(value: js.Array[History]): Self = StObject.set(x, "histories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoriesUndefined: Self = StObject.set(x, "histories", js.undefined)
    
    @scala.inline
    def setHistoriesVarargs(value: History*): Self = StObject.set(x, "histories", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
