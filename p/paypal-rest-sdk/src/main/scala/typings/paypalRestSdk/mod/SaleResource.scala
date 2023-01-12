package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaleResource
  extends StObject
     with Resource {
  
  val billing_agreement_id: js.UndefOr[String] = js.undefined
  
  val clearing_time: js.UndefOr[String] = js.undefined
  
  val exchange_rate: js.UndefOr[String] = js.undefined
  
  val payment_hold_reasons: js.UndefOr[js.Array[String]] = js.undefined
  
  val payment_hold_status: js.UndefOr[String] = js.undefined
  
  val purchase_unit_reference_id: js.UndefOr[String] = js.undefined
  
  val transaction_fee: js.UndefOr[Currency] = js.undefined
}
object SaleResource {
  
  inline def apply(amount: Amount, id: String): SaleResource = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaleResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SaleResource] (val x: Self) extends AnyVal {
    
    inline def setBilling_agreement_id(value: String): Self = StObject.set(x, "billing_agreement_id", value.asInstanceOf[js.Any])
    
    inline def setBilling_agreement_idUndefined: Self = StObject.set(x, "billing_agreement_id", js.undefined)
    
    inline def setClearing_time(value: String): Self = StObject.set(x, "clearing_time", value.asInstanceOf[js.Any])
    
    inline def setClearing_timeUndefined: Self = StObject.set(x, "clearing_time", js.undefined)
    
    inline def setExchange_rate(value: String): Self = StObject.set(x, "exchange_rate", value.asInstanceOf[js.Any])
    
    inline def setExchange_rateUndefined: Self = StObject.set(x, "exchange_rate", js.undefined)
    
    inline def setPayment_hold_reasons(value: js.Array[String]): Self = StObject.set(x, "payment_hold_reasons", value.asInstanceOf[js.Any])
    
    inline def setPayment_hold_reasonsUndefined: Self = StObject.set(x, "payment_hold_reasons", js.undefined)
    
    inline def setPayment_hold_reasonsVarargs(value: String*): Self = StObject.set(x, "payment_hold_reasons", js.Array(value*))
    
    inline def setPayment_hold_status(value: String): Self = StObject.set(x, "payment_hold_status", value.asInstanceOf[js.Any])
    
    inline def setPayment_hold_statusUndefined: Self = StObject.set(x, "payment_hold_status", js.undefined)
    
    inline def setPurchase_unit_reference_id(value: String): Self = StObject.set(x, "purchase_unit_reference_id", value.asInstanceOf[js.Any])
    
    inline def setPurchase_unit_reference_idUndefined: Self = StObject.set(x, "purchase_unit_reference_id", js.undefined)
    
    inline def setTransaction_fee(value: Currency): Self = StObject.set(x, "transaction_fee", value.asInstanceOf[js.Any])
    
    inline def setTransaction_feeUndefined: Self = StObject.set(x, "transaction_fee", js.undefined)
  }
}
