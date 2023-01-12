package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SellerPayableBreakdown extends StObject {
  
  var gross_amount: Money
  
  var net_amount: Money
  
  var net_amount_breakdown: js.Array[NetAmountBreakdown]
  
  var net_amount_in_receivable_currency: Money
  
  var paypal_fee: Money
  
  var paypal_fee_in_receivable_currency: Money
  
  var platform_fees: js.Array[PlatformFee]
  
  var total_refunded_amount: Money
}
object SellerPayableBreakdown {
  
  inline def apply(
    gross_amount: Money,
    net_amount: Money,
    net_amount_breakdown: js.Array[NetAmountBreakdown],
    net_amount_in_receivable_currency: Money,
    paypal_fee: Money,
    paypal_fee_in_receivable_currency: Money,
    platform_fees: js.Array[PlatformFee],
    total_refunded_amount: Money
  ): SellerPayableBreakdown = {
    val __obj = js.Dynamic.literal(gross_amount = gross_amount.asInstanceOf[js.Any], net_amount = net_amount.asInstanceOf[js.Any], net_amount_breakdown = net_amount_breakdown.asInstanceOf[js.Any], net_amount_in_receivable_currency = net_amount_in_receivable_currency.asInstanceOf[js.Any], paypal_fee = paypal_fee.asInstanceOf[js.Any], paypal_fee_in_receivable_currency = paypal_fee_in_receivable_currency.asInstanceOf[js.Any], platform_fees = platform_fees.asInstanceOf[js.Any], total_refunded_amount = total_refunded_amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SellerPayableBreakdown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SellerPayableBreakdown] (val x: Self) extends AnyVal {
    
    inline def setGross_amount(value: Money): Self = StObject.set(x, "gross_amount", value.asInstanceOf[js.Any])
    
    inline def setNet_amount(value: Money): Self = StObject.set(x, "net_amount", value.asInstanceOf[js.Any])
    
    inline def setNet_amount_breakdown(value: js.Array[NetAmountBreakdown]): Self = StObject.set(x, "net_amount_breakdown", value.asInstanceOf[js.Any])
    
    inline def setNet_amount_breakdownVarargs(value: NetAmountBreakdown*): Self = StObject.set(x, "net_amount_breakdown", js.Array(value*))
    
    inline def setNet_amount_in_receivable_currency(value: Money): Self = StObject.set(x, "net_amount_in_receivable_currency", value.asInstanceOf[js.Any])
    
    inline def setPaypal_fee(value: Money): Self = StObject.set(x, "paypal_fee", value.asInstanceOf[js.Any])
    
    inline def setPaypal_fee_in_receivable_currency(value: Money): Self = StObject.set(x, "paypal_fee_in_receivable_currency", value.asInstanceOf[js.Any])
    
    inline def setPlatform_fees(value: js.Array[PlatformFee]): Self = StObject.set(x, "platform_fees", value.asInstanceOf[js.Any])
    
    inline def setPlatform_feesVarargs(value: PlatformFee*): Self = StObject.set(x, "platform_fees", js.Array(value*))
    
    inline def setTotal_refunded_amount(value: Money): Self = StObject.set(x, "total_refunded_amount", value.asInstanceOf[js.Any])
  }
}
