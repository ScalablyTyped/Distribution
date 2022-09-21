package typings.paypalCheckoutServerSdk.paymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SellerReceivableBreakdown extends StObject {
  
  var exchange_rate: js.UndefOr[ExchangeRate] = js.undefined
  
  var gross_amount: Money
  
  var net_amount: js.UndefOr[Money] = js.undefined
  
  var paypal_fee: js.UndefOr[Money] = js.undefined
  
  var paypal_fee_in_receivable_currency: js.UndefOr[Money] = js.undefined
  
  var platform_fees: js.UndefOr[js.Array[PlatformFee]] = js.undefined
  
  var receivable_amount: js.UndefOr[Money] = js.undefined
}
object SellerReceivableBreakdown {
  
  inline def apply(gross_amount: Money): SellerReceivableBreakdown = {
    val __obj = js.Dynamic.literal(gross_amount = gross_amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SellerReceivableBreakdown]
  }
  
  extension [Self <: SellerReceivableBreakdown](x: Self) {
    
    inline def setExchange_rate(value: ExchangeRate): Self = StObject.set(x, "exchange_rate", value.asInstanceOf[js.Any])
    
    inline def setExchange_rateUndefined: Self = StObject.set(x, "exchange_rate", js.undefined)
    
    inline def setGross_amount(value: Money): Self = StObject.set(x, "gross_amount", value.asInstanceOf[js.Any])
    
    inline def setNet_amount(value: Money): Self = StObject.set(x, "net_amount", value.asInstanceOf[js.Any])
    
    inline def setNet_amountUndefined: Self = StObject.set(x, "net_amount", js.undefined)
    
    inline def setPaypal_fee(value: Money): Self = StObject.set(x, "paypal_fee", value.asInstanceOf[js.Any])
    
    inline def setPaypal_feeUndefined: Self = StObject.set(x, "paypal_fee", js.undefined)
    
    inline def setPaypal_fee_in_receivable_currency(value: Money): Self = StObject.set(x, "paypal_fee_in_receivable_currency", value.asInstanceOf[js.Any])
    
    inline def setPaypal_fee_in_receivable_currencyUndefined: Self = StObject.set(x, "paypal_fee_in_receivable_currency", js.undefined)
    
    inline def setPlatform_fees(value: js.Array[PlatformFee]): Self = StObject.set(x, "platform_fees", value.asInstanceOf[js.Any])
    
    inline def setPlatform_feesUndefined: Self = StObject.set(x, "platform_fees", js.undefined)
    
    inline def setPlatform_feesVarargs(value: PlatformFee*): Self = StObject.set(x, "platform_fees", js.Array(value*))
    
    inline def setReceivable_amount(value: Money): Self = StObject.set(x, "receivable_amount", value.asInstanceOf[js.Any])
    
    inline def setReceivable_amountUndefined: Self = StObject.set(x, "receivable_amount", js.undefined)
  }
}
