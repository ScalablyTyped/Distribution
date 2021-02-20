package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLocationListsResponse extends StObject {
  
  /** The list of location lists. This list will be absent if empty. */
  var locationLists: js.UndefOr[js.Array[LocationList]] = js.native
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListLocationLists` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListLocationListsResponse {
  
  @scala.inline
  def apply(): ListLocationListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLocationListsResponse]
  }
  
  @scala.inline
  implicit class ListLocationListsResponseMutableBuilder[Self <: ListLocationListsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocationLists(value: js.Array[LocationList]): Self = StObject.set(x, "locationLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationListsUndefined: Self = StObject.set(x, "locationLists", js.undefined)
    
    @scala.inline
    def setLocationListsVarargs(value: LocationList*): Self = StObject.set(x, "locationLists", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
