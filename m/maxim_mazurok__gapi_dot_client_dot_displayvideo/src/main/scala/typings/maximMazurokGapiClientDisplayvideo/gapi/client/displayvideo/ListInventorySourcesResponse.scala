package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInventorySourcesResponse extends js.Object {
  
  /** The list of inventory sources. This list will be absent if empty. */
  var inventorySources: js.UndefOr[js.Array[InventorySource]] = js.native
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListInventorySources` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListInventorySourcesResponse {
  
  @scala.inline
  def apply(): ListInventorySourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInventorySourcesResponse]
  }
  
  @scala.inline
  implicit class ListInventorySourcesResponseOps[Self <: ListInventorySourcesResponse] (val x: Self) extends AnyVal {
    
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
    def setInventorySourcesVarargs(value: InventorySource*): Self = this.set("inventorySources", js.Array(value :_*))
    
    @scala.inline
    def setInventorySources(value: js.Array[InventorySource]): Self = this.set("inventorySources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventorySources: Self = this.set("inventorySources", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
