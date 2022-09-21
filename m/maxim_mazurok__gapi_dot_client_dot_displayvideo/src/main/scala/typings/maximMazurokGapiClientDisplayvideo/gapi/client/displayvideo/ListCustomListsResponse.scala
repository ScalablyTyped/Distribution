package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomListsResponse extends StObject {
  
  /** The list of custom lists. This list will be absent if empty. */
  var customLists: js.UndefOr[js.Array[CustomList]] = js.undefined
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListCustomLists` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListCustomListsResponse {
  
  inline def apply(): ListCustomListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomListsResponse]
  }
  
  extension [Self <: ListCustomListsResponse](x: Self) {
    
    inline def setCustomLists(value: js.Array[CustomList]): Self = StObject.set(x, "customLists", value.asInstanceOf[js.Any])
    
    inline def setCustomListsUndefined: Self = StObject.set(x, "customLists", js.undefined)
    
    inline def setCustomListsVarargs(value: CustomList*): Self = StObject.set(x, "customLists", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
