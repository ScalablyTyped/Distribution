package typings.paypalPayoutsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPayoutsItemResponse
  extends StObject
     with PayoutBatchItems {
  
  var sender_batch_id: js.UndefOr[String] = js.undefined
}
object GetPayoutsItemResponse {
  
  inline def apply(payout_batch_id: String, payout_item: PayoutItemDetail, payout_item_id: String): GetPayoutsItemResponse = {
    val __obj = js.Dynamic.literal(payout_batch_id = payout_batch_id.asInstanceOf[js.Any], payout_item = payout_item.asInstanceOf[js.Any], payout_item_id = payout_item_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPayoutsItemResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPayoutsItemResponse] (val x: Self) extends AnyVal {
    
    inline def setSender_batch_id(value: String): Self = StObject.set(x, "sender_batch_id", value.asInstanceOf[js.Any])
    
    inline def setSender_batch_idUndefined: Self = StObject.set(x, "sender_batch_id", js.undefined)
  }
}
