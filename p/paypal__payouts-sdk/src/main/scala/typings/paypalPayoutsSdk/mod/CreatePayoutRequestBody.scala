package typings.paypalPayoutsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePayoutRequestBody extends StObject {
  
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
  implicit class CreatePayoutRequestBodyMutableBuilder[Self <: CreatePayoutRequestBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[PayoutItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: PayoutItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setSender_batch_header(value: SenderBatchHeader): Self = StObject.set(x, "sender_batch_header", value.asInstanceOf[js.Any])
  }
}
