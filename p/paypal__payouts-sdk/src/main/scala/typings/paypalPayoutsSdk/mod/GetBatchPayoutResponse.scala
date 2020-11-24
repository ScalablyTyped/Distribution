package typings.paypalPayoutsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBatchPayoutResponse extends js.Object {
  
  var batch_header: js.UndefOr[PayoutBatchHeader] = js.native
  
  var errors: js.UndefOr[js.Any] = js.native
  
  var items: js.UndefOr[js.Array[PayoutBatchItems]] = js.native
  
  var links: js.UndefOr[js.Array[LinkDescription]] = js.native
  
  var total_items: js.UndefOr[Double] = js.native
  
  var total_pages: js.UndefOr[Double] = js.native
}
object GetBatchPayoutResponse {
  
  @scala.inline
  def apply(): GetBatchPayoutResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBatchPayoutResponse]
  }
  
  @scala.inline
  implicit class GetBatchPayoutResponseOps[Self <: GetBatchPayoutResponse] (val x: Self) extends AnyVal {
    
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
    def setBatch_header(value: PayoutBatchHeader): Self = this.set("batch_header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatch_header: Self = this.set("batch_header", js.undefined)
    
    @scala.inline
    def setErrors(value: js.Any): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: PayoutBatchItems*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[PayoutBatchItems]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: LinkDescription*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[LinkDescription]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    
    @scala.inline
    def setTotal_items(value: Double): Self = this.set("total_items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal_items: Self = this.set("total_items", js.undefined)
    
    @scala.inline
    def setTotal_pages(value: Double): Self = this.set("total_pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal_pages: Self = this.set("total_pages", js.undefined)
  }
}
