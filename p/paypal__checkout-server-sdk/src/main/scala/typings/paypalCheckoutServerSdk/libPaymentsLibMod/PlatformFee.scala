package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlatformFee extends StObject {
  
  var amount: Money
  
  var payee: js.UndefOr[PayeeBase] = js.undefined
}
object PlatformFee {
  
  inline def apply(amount: Money): PlatformFee = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformFee]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlatformFee] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Money): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setPayee(value: PayeeBase): Self = StObject.set(x, "payee", value.asInstanceOf[js.Any])
    
    inline def setPayeeUndefined: Self = StObject.set(x, "payee", js.undefined)
  }
}
