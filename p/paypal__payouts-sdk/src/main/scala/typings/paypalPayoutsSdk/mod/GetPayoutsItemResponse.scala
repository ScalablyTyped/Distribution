package typings.paypalPayoutsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPayoutsItemResponse extends PayoutBatchItems {
  
  var sender_batch_id: js.UndefOr[String] = js.native
}
object GetPayoutsItemResponse {
  
  @scala.inline
  def apply(payout_batch_id: String, payout_item: PayoutItemDetail, payout_item_id: String): GetPayoutsItemResponse = {
    val __obj = js.Dynamic.literal(payout_batch_id = payout_batch_id.asInstanceOf[js.Any], payout_item = payout_item.asInstanceOf[js.Any], payout_item_id = payout_item_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPayoutsItemResponse]
  }
  
  @scala.inline
  implicit class GetPayoutsItemResponseMutableBuilder[Self <: GetPayoutsItemResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSender_batch_id(value: String): Self = StObject.set(x, "sender_batch_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender_batch_idUndefined: Self = StObject.set(x, "sender_batch_id", js.undefined)
  }
}
