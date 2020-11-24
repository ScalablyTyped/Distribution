package typings.maximMazurokGapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePageElementsZOrderRequest extends js.Object {
  
  /**
    * The Z-order operation to apply on the page elements. When applying the operation on multiple page elements, the relative Z-orders within these page elements before the operation is
    * maintained.
    */
  var operation: js.UndefOr[String] = js.native
  
  /** The object IDs of the page elements to update. All the page elements must be on the same page and must not be grouped. */
  var pageElementObjectIds: js.UndefOr[js.Array[String]] = js.native
}
object UpdatePageElementsZOrderRequest {
  
  @scala.inline
  def apply(): UpdatePageElementsZOrderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePageElementsZOrderRequest]
  }
  
  @scala.inline
  implicit class UpdatePageElementsZOrderRequestOps[Self <: UpdatePageElementsZOrderRequest] (val x: Self) extends AnyVal {
    
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
    def setOperation(value: String): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    
    @scala.inline
    def setPageElementObjectIdsVarargs(value: String*): Self = this.set("pageElementObjectIds", js.Array(value :_*))
    
    @scala.inline
    def setPageElementObjectIds(value: js.Array[String]): Self = this.set("pageElementObjectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageElementObjectIds: Self = this.set("pageElementObjectIds", js.undefined)
  }
}
