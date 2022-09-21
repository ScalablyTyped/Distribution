package typings.paypalCheckoutServerSdk.ordersLibMod

import typings.paypalCheckoutServerSdk.paymentsLibMod.Capture
import typings.paypalCheckoutServerSdk.paymentsLibMod.Refund
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentCollection extends StObject {
  
  var authorizations: AuthorizationWithAdditionalData
  
  var captures: js.Array[Capture]
  
  var refunds: js.Array[Refund]
}
object PaymentCollection {
  
  inline def apply(
    authorizations: AuthorizationWithAdditionalData,
    captures: js.Array[Capture],
    refunds: js.Array[Refund]
  ): PaymentCollection = {
    val __obj = js.Dynamic.literal(authorizations = authorizations.asInstanceOf[js.Any], captures = captures.asInstanceOf[js.Any], refunds = refunds.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentCollection]
  }
  
  extension [Self <: PaymentCollection](x: Self) {
    
    inline def setAuthorizations(value: AuthorizationWithAdditionalData): Self = StObject.set(x, "authorizations", value.asInstanceOf[js.Any])
    
    inline def setCaptures(value: js.Array[Capture]): Self = StObject.set(x, "captures", value.asInstanceOf[js.Any])
    
    inline def setCapturesVarargs(value: Capture*): Self = StObject.set(x, "captures", js.Array(value*))
    
    inline def setRefunds(value: js.Array[Refund]): Self = StObject.set(x, "refunds", value.asInstanceOf[js.Any])
    
    inline def setRefundsVarargs(value: Refund*): Self = StObject.set(x, "refunds", js.Array(value*))
  }
}
