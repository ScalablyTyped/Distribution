package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAssignedInventorySourcesResponse extends js.Object {
  
  /** The list of assigned inventory sources. This list will be absent if empty. */
  var assignedInventorySources: js.UndefOr[js.Array[AssignedInventorySource]] = js.native
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListAssignedInventorySources` method to retrieve the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListAssignedInventorySourcesResponse {
  
  @scala.inline
  def apply(): ListAssignedInventorySourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssignedInventorySourcesResponse]
  }
  
  @scala.inline
  implicit class ListAssignedInventorySourcesResponseOps[Self <: ListAssignedInventorySourcesResponse] (val x: Self) extends AnyVal {
    
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
    def setAssignedInventorySourcesVarargs(value: AssignedInventorySource*): Self = this.set("assignedInventorySources", js.Array(value :_*))
    
    @scala.inline
    def setAssignedInventorySources(value: js.Array[AssignedInventorySource]): Self = this.set("assignedInventorySources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignedInventorySources: Self = this.set("assignedInventorySources", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
