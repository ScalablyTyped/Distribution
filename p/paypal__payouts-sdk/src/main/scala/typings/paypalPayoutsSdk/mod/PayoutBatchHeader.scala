package typings.paypalPayoutsSdk.mod

import typings.paypalPayoutsSdk.paypalPayoutsSdkStrings.BALANCE
import typings.paypalPayoutsSdk.paypalPayoutsSdkStrings.CANCELED
import typings.paypalPayoutsSdk.paypalPayoutsSdkStrings.DENIED
import typings.paypalPayoutsSdk.paypalPayoutsSdkStrings.PENDING
import typings.paypalPayoutsSdk.paypalPayoutsSdkStrings.PROCESSING
import typings.paypalPayoutsSdk.paypalPayoutsSdkStrings.SUCCESS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayoutBatchHeader extends PayoutHeader {
  
  var amount: js.UndefOr[Currency] = js.native
  
  var fees: js.UndefOr[Currency] = js.native
  
  var funding_source: js.UndefOr[BALANCE] = js.native
  
  var time_closed: js.UndefOr[String] = js.native
  
  var time_completed: js.UndefOr[String] = js.native
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
  implicit class PayoutBatchHeaderOps[Self <: PayoutBatchHeader] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: Currency): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setFees(value: Currency): Self = this.set("fees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFees: Self = this.set("fees", js.undefined)
    
    @scala.inline
    def setFunding_source(value: BALANCE): Self = this.set("funding_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunding_source: Self = this.set("funding_source", js.undefined)
    
    @scala.inline
    def setTime_closed(value: String): Self = this.set("time_closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime_closed: Self = this.set("time_closed", js.undefined)
    
    @scala.inline
    def setTime_completed(value: String): Self = this.set("time_completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime_completed: Self = this.set("time_completed", js.undefined)
  }
}
