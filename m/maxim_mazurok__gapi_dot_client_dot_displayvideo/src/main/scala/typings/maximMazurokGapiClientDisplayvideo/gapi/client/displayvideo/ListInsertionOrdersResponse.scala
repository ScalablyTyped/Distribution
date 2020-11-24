package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInsertionOrdersResponse extends js.Object {
  
  /** The list of insertion orders. This list will be absent if empty. */
  var insertionOrders: js.UndefOr[js.Array[InsertionOrder]] = js.native
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListInsertionOrders` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListInsertionOrdersResponse {
  
  @scala.inline
  def apply(): ListInsertionOrdersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInsertionOrdersResponse]
  }
  
  @scala.inline
  implicit class ListInsertionOrdersResponseOps[Self <: ListInsertionOrdersResponse] (val x: Self) extends AnyVal {
    
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
    def setInsertionOrdersVarargs(value: InsertionOrder*): Self = this.set("insertionOrders", js.Array(value :_*))
    
    @scala.inline
    def setInsertionOrders(value: js.Array[InsertionOrder]): Self = this.set("insertionOrders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertionOrders: Self = this.set("insertionOrders", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
