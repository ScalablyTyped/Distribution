package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLocationListsResponse extends js.Object {
  
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
  implicit class ListLocationListsResponseOps[Self <: ListLocationListsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLocationListsVarargs(value: LocationList*): Self = this.set("locationLists", js.Array(value :_*))
    
    @scala.inline
    def setLocationLists(value: js.Array[LocationList]): Self = this.set("locationLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationLists: Self = this.set("locationLists", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
