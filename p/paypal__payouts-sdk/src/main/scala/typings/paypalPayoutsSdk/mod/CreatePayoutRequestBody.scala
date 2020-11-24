package typings.paypalPayoutsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePayoutRequestBody extends js.Object {
  
  var items: js.Array[PayoutItem] = js.native
  
  var sender_batch_header: SenderBatchHeader = js.native
}
object CreatePayoutRequestBody {
  
  @scala.inline
  def apply(items: js.Array[PayoutItem], sender_batch_header: SenderBatchHeader): CreatePayoutRequestBody = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], sender_batch_header = sender_batch_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePayoutRequestBody]
  }
  
  @scala.inline
  implicit class CreatePayoutRequestBodyOps[Self <: CreatePayoutRequestBody] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: PayoutItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[PayoutItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender_batch_header(value: SenderBatchHeader): Self = this.set("sender_batch_header", value.asInstanceOf[js.Any])
  }
}
