package typings.paypalPayoutsSdk.mod

import typings.paypalPayoutsSdk.paypalPayoutsSdkStrings.BLOCKED
import typings.paypalPayoutsSdk.paypalPayoutsSdkStrings.FAILED
import typings.paypalPayoutsSdk.paypalPayoutsSdkStrings.ONHOLD
import typings.paypalPayoutsSdk.paypalPayoutsSdkStrings.PENDING
import typings.paypalPayoutsSdk.paypalPayoutsSdkStrings.REFUNDED
import typings.paypalPayoutsSdk.paypalPayoutsSdkStrings.RETURNED
import typings.paypalPayoutsSdk.paypalPayoutsSdkStrings.REVERSED
import typings.paypalPayoutsSdk.paypalPayoutsSdkStrings.SUCCESS
import typings.paypalPayoutsSdk.paypalPayoutsSdkStrings.UNCLAIMED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayoutBatchItems extends js.Object {
  
  var activity_id: js.UndefOr[String] = js.native
  
  var currency_conversion: js.UndefOr[PayoutCurrencyConversion] = js.native
  
  var errors: js.UndefOr[js.Any] = js.native
  
  var links: js.UndefOr[js.Array[LinkDescription]] = js.native
  
  var payout_batch_id: String = js.native
  
  var payout_item: PayoutItemDetail = js.native
  
  var payout_item_fee: js.UndefOr[Currency] = js.native
  
  var payout_item_id: String = js.native
  
  var time_processed: js.UndefOr[String] = js.native
  
  var transaction_id: js.UndefOr[String] = js.native
  
  var transaction_status: js.UndefOr[
    BLOCKED | FAILED | ONHOLD | PENDING | REFUNDED | RETURNED | REVERSED | SUCCESS | UNCLAIMED
  ] = js.native
}
object PayoutBatchItems {
  
  @scala.inline
  def apply(payout_batch_id: String, payout_item: PayoutItemDetail, payout_item_id: String): PayoutBatchItems = {
    val __obj = js.Dynamic.literal(payout_batch_id = payout_batch_id.asInstanceOf[js.Any], payout_item = payout_item.asInstanceOf[js.Any], payout_item_id = payout_item_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayoutBatchItems]
  }
  
  @scala.inline
  implicit class PayoutBatchItemsOps[Self <: PayoutBatchItems] (val x: Self) extends AnyVal {
    
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
    def setPayout_batch_id(value: String): Self = this.set("payout_batch_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayout_item(value: PayoutItemDetail): Self = this.set("payout_item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayout_item_id(value: String): Self = this.set("payout_item_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivity_id(value: String): Self = this.set("activity_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivity_id: Self = this.set("activity_id", js.undefined)
    
    @scala.inline
    def setCurrency_conversion(value: PayoutCurrencyConversion): Self = this.set("currency_conversion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency_conversion: Self = this.set("currency_conversion", js.undefined)
    
    @scala.inline
    def setErrors(value: js.Any): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: LinkDescription*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[LinkDescription]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    
    @scala.inline
    def setPayout_item_fee(value: Currency): Self = this.set("payout_item_fee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayout_item_fee: Self = this.set("payout_item_fee", js.undefined)
    
    @scala.inline
    def setTime_processed(value: String): Self = this.set("time_processed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime_processed: Self = this.set("time_processed", js.undefined)
    
    @scala.inline
    def setTransaction_id(value: String): Self = this.set("transaction_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransaction_id: Self = this.set("transaction_id", js.undefined)
    
    @scala.inline
    def setTransaction_status(value: BLOCKED | FAILED | ONHOLD | PENDING | REFUNDED | RETURNED | REVERSED | SUCCESS | UNCLAIMED): Self = this.set("transaction_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransaction_status: Self = this.set("transaction_status", js.undefined)
  }
}
