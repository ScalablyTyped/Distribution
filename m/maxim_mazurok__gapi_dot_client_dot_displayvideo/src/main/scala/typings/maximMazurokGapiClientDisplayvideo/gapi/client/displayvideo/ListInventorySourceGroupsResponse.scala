package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInventorySourceGroupsResponse extends js.Object {
  
  /** The list of inventory source groups. This list will be absent if empty. */
  var inventorySourceGroups: js.UndefOr[js.Array[InventorySourceGroup]] = js.native
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListInventorySourceGroups` method to retrieve the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListInventorySourceGroupsResponse {
  
  @scala.inline
  def apply(): ListInventorySourceGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInventorySourceGroupsResponse]
  }
  
  @scala.inline
  implicit class ListInventorySourceGroupsResponseOps[Self <: ListInventorySourceGroupsResponse] (val x: Self) extends AnyVal {
    
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
    def setInventorySourceGroupsVarargs(value: InventorySourceGroup*): Self = this.set("inventorySourceGroups", js.Array(value :_*))
    
    @scala.inline
    def setInventorySourceGroups(value: js.Array[InventorySourceGroup]): Self = this.set("inventorySourceGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventorySourceGroups: Self = this.set("inventorySourceGroups", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
