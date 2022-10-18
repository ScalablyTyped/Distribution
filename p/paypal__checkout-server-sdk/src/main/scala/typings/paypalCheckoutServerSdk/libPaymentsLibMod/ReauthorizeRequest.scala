package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReauthorizeRequest extends StObject {
  
  var amount: Money
}
object ReauthorizeRequest {
  
  inline def apply(amount: Money): ReauthorizeRequest = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReauthorizeRequest]
  }
  
  extension [Self <: ReauthorizeRequest](x: Self) {
    
    inline def setAmount(value: Money): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
  }
}
