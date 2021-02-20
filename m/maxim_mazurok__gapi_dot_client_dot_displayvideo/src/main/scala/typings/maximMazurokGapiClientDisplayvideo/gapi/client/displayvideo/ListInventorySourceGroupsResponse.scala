package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInventorySourceGroupsResponse extends StObject {
  
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
  implicit class ListInventorySourceGroupsResponseMutableBuilder[Self <: ListInventorySourceGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInventorySourceGroups(value: js.Array[InventorySourceGroup]): Self = StObject.set(x, "inventorySourceGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventorySourceGroupsUndefined: Self = StObject.set(x, "inventorySourceGroups", js.undefined)
    
    @scala.inline
    def setInventorySourceGroupsVarargs(value: InventorySourceGroup*): Self = StObject.set(x, "inventorySourceGroups", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
