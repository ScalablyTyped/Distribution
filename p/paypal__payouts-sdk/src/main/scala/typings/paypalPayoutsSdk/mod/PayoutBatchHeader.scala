package typings.paypalPayoutsSdk.mod

import typings.paypalPayoutsSdk.paypalPayoutsSdkStrings.BALANCE
import typings.paypalPayoutsSdk.paypalPayoutsSdkStrings.CANCELED
import typings.paypalPayoutsSdk.paypalPayoutsSdkStrings.DENIED
import typings.paypalPayoutsSdk.paypalPayoutsSdkStrings.PENDING
import typings.paypalPayoutsSdk.paypalPayoutsSdkStrings.PROCESSING
import typings.paypalPayoutsSdk.paypalPayoutsSdkStrings.SUCCESS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayoutBatchHeader
  extends StObject
     with PayoutHeader {
  
  var amount: js.UndefOr[Currency] = js.undefined
  
  var fees: js.UndefOr[Currency] = js.undefined
  
  var funding_source: js.UndefOr[BALANCE] = js.undefined
  
  var time_closed: js.UndefOr[String] = js.undefined
  
  var time_completed: js.UndefOr[String] = js.undefined
}
object PayoutBatchHeader {
  
  @scala.inline
  def apply(
    batch_status: CANCELED | DENIED | PENDING | PROCESSING | SUCCESS,
    payout_batch_id: String,
    sender_batch_header: PayoutSenderBatchHeader
  ): PayoutBatchHeader = {
    val __obj = js.Dynamic.literal(batch_status = batch_status.asInstanceOf[js.Any], payout_batch_id = payout_batch_id.asInstanceOf[js.Any], sender_batch_header = sender_batch_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayoutBatchHeader]
  }
  
  @scala.inline
  implicit class PayoutBatchHeaderMutableBuilder[Self <: PayoutBatchHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Currency): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setFees(value: Currency): Self = StObject.set(x, "fees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeesUndefined: Self = StObject.set(x, "fees", js.undefined)
    
    @scala.inline
    def setFunding_source(value: BALANCE): Self = StObject.set(x, "funding_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunding_sourceUndefined: Self = StObject.set(x, "funding_source", js.undefined)
    
    @scala.inline
    def setTime_closed(value: String): Self = StObject.set(x, "time_closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_closedUndefined: Self = StObject.set(x, "time_closed", js.undefined)
    
    @scala.inline
    def setTime_completed(value: String): Self = StObject.set(x, "time_completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_completedUndefined: Self = StObject.set(x, "time_completed", js.undefined)
  }
}
