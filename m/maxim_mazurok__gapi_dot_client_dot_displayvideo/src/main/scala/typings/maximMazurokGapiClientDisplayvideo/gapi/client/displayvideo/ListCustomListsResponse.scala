package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCustomListsResponse extends js.Object {
  
  /** The list of custom lists. This list will be absent if empty. */
  var customLists: js.UndefOr[js.Array[CustomList]] = js.native
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListCustomLists` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListCustomListsResponse {
  
  @scala.inline
  def apply(): ListCustomListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomListsResponse]
  }
  
  @scala.inline
  implicit class ListCustomListsResponseOps[Self <: ListCustomListsResponse] (val x: Self) extends AnyVal {
    
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
    def setCustomListsVarargs(value: CustomList*): Self = this.set("customLists", js.Array(value :_*))
    
    @scala.inline
    def setCustomLists(value: js.Array[CustomList]): Self = this.set("customLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomLists: Self = this.set("customLists", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
