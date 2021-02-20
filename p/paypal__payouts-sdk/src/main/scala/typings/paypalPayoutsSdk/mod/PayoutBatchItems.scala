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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayoutBatchItems extends StObject {
  
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
  implicit class PayoutBatchItemsMutableBuilder[Self <: PayoutBatchItems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivity_id(value: String): Self = StObject.set(x, "activity_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivity_idUndefined: Self = StObject.set(x, "activity_id", js.undefined)
    
    @scala.inline
    def setCurrency_conversion(value: PayoutCurrencyConversion): Self = StObject.set(x, "currency_conversion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency_conversionUndefined: Self = StObject.set(x, "currency_conversion", js.undefined)
    
    @scala.inline
    def setErrors(value: js.Any): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setLinks(value: js.Array[LinkDescription]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: LinkDescription*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    @scala.inline
    def setPayout_batch_id(value: String): Self = StObject.set(x, "payout_batch_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayout_item(value: PayoutItemDetail): Self = StObject.set(x, "payout_item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayout_item_fee(value: Currency): Self = StObject.set(x, "payout_item_fee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayout_item_feeUndefined: Self = StObject.set(x, "payout_item_fee", js.undefined)
    
    @scala.inline
    def setPayout_item_id(value: String): Self = StObject.set(x, "payout_item_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_processed(value: String): Self = StObject.set(x, "time_processed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_processedUndefined: Self = StObject.set(x, "time_processed", js.undefined)
    
    @scala.inline
    def setTransaction_id(value: String): Self = StObject.set(x, "transaction_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransaction_idUndefined: Self = StObject.set(x, "transaction_id", js.undefined)
    
    @scala.inline
    def setTransaction_status(value: BLOCKED | FAILED | ONHOLD | PENDING | REFUNDED | RETURNED | REVERSED | SUCCESS | UNCLAIMED): Self = StObject.set(x, "transaction_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransaction_statusUndefined: Self = StObject.set(x, "transaction_status", js.undefined)
  }
}
