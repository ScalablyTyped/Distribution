package typings.paypalPaypalJs.ordersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlatformFee extends StObject {
  
  var amount: AmountWithCurrencyCodeOptional
  
  var payee: js.UndefOr[Payee] = js.undefined
}
object PlatformFee {
  
  inline def apply(amount: AmountWithCurrencyCodeOptional): PlatformFee = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformFee]
  }
  
  extension [Self <: PlatformFee](x: Self) {
    
    inline def setAmount(value: AmountWithCurrencyCodeOptional): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setPayee(value: Payee): Self = StObject.set(x, "payee", value.asInstanceOf[js.Any])
    
    inline def setPayeeUndefined: Self = StObject.set(x, "payee", js.undefined)
  }
}
