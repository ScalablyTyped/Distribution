package typings.paypalPayoutsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePayoutRequestBody extends StObject {
  
  var items: js.Array[PayoutItem]
  
  var sender_batch_header: SenderBatchHeader
}
object CreatePayoutRequestBody {
  
  inline def apply(items: js.Array[PayoutItem], sender_batch_header: SenderBatchHeader): CreatePayoutRequestBody = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], sender_batch_header = sender_batch_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePayoutRequestBody]
  }
  
  extension [Self <: CreatePayoutRequestBody](x: Self) {
    
    inline def setItems(value: js.Array[PayoutItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: PayoutItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setSender_batch_header(value: SenderBatchHeader): Self = StObject.set(x, "sender_batch_header", value.asInstanceOf[js.Any])
  }
}
