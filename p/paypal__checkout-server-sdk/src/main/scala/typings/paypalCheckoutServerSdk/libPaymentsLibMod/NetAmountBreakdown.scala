package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetAmountBreakdown extends StObject {
  
  var converted_amount: Money
  
  var exchange_rate: ExchangeRate
  
  var payable_amount: Money
}
object NetAmountBreakdown {
  
  inline def apply(converted_amount: Money, exchange_rate: ExchangeRate, payable_amount: Money): NetAmountBreakdown = {
    val __obj = js.Dynamic.literal(converted_amount = converted_amount.asInstanceOf[js.Any], exchange_rate = exchange_rate.asInstanceOf[js.Any], payable_amount = payable_amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetAmountBreakdown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetAmountBreakdown] (val x: Self) extends AnyVal {
    
    inline def setConverted_amount(value: Money): Self = StObject.set(x, "converted_amount", value.asInstanceOf[js.Any])
    
    inline def setExchange_rate(value: ExchangeRate): Self = StObject.set(x, "exchange_rate", value.asInstanceOf[js.Any])
    
    inline def setPayable_amount(value: Money): Self = StObject.set(x, "payable_amount", value.asInstanceOf[js.Any])
  }
}
