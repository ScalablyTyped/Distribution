package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLocationListsResponse extends StObject {
  
  /** The list of location lists. This list will be absent if empty. */
  var locationLists: js.UndefOr[js.Array[LocationList]] = js.undefined
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListLocationLists` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListLocationListsResponse {
  
  inline def apply(): ListLocationListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLocationListsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLocationListsResponse] (val x: Self) extends AnyVal {
    
    inline def setLocationLists(value: js.Array[LocationList]): Self = StObject.set(x, "locationLists", value.asInstanceOf[js.Any])
    
    inline def setLocationListsUndefined: Self = StObject.set(x, "locationLists", js.undefined)
    
    inline def setLocationListsVarargs(value: LocationList*): Self = StObject.set(x, "locationLists", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
