package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaleResource extends Resource {
  
  val billing_agreement_id: js.UndefOr[String] = js.native
  
  val clearing_time: js.UndefOr[String] = js.native
  
  val exchange_rate: js.UndefOr[String] = js.native
  
  val payment_hold_reasons: js.UndefOr[js.Array[String]] = js.native
  
  val payment_hold_status: js.UndefOr[String] = js.native
  
  val purchase_unit_reference_id: js.UndefOr[String] = js.native
  
  val transaction_fee: js.UndefOr[Currency] = js.native
}
object SaleResource {
  
  @scala.inline
  def apply(amount: Amount, id: String): SaleResource = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaleResource]
  }
  
  @scala.inline
  implicit class SaleResourceMutableBuilder[Self <: SaleResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBilling_agreement_id(value: String): Self = StObject.set(x, "billing_agreement_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBilling_agreement_idUndefined: Self = StObject.set(x, "billing_agreement_id", js.undefined)
    
    @scala.inline
    def setClearing_time(value: String): Self = StObject.set(x, "clearing_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearing_timeUndefined: Self = StObject.set(x, "clearing_time", js.undefined)
    
    @scala.inline
    def setExchange_rate(value: String): Self = StObject.set(x, "exchange_rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchange_rateUndefined: Self = StObject.set(x, "exchange_rate", js.undefined)
    
    @scala.inline
    def setPayment_hold_reasons(value: js.Array[String]): Self = StObject.set(x, "payment_hold_reasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_hold_reasonsUndefined: Self = StObject.set(x, "payment_hold_reasons", js.undefined)
    
    @scala.inline
    def setPayment_hold_reasonsVarargs(value: String*): Self = StObject.set(x, "payment_hold_reasons", js.Array(value :_*))
    
    @scala.inline
    def setPayment_hold_status(value: String): Self = StObject.set(x, "payment_hold_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_hold_statusUndefined: Self = StObject.set(x, "payment_hold_status", js.undefined)
    
    @scala.inline
    def setPurchase_unit_reference_id(value: String): Self = StObject.set(x, "purchase_unit_reference_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchase_unit_reference_idUndefined: Self = StObject.set(x, "purchase_unit_reference_id", js.undefined)
    
    @scala.inline
    def setTransaction_fee(value: Currency): Self = StObject.set(x, "transaction_fee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransaction_feeUndefined: Self = StObject.set(x, "transaction_fee", js.undefined)
  }
}
