package typings.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmOrderRequest extends StObject {
  
  var application_context: js.UndefOr[OrderConfirmApplicationContext] = js.undefined
  
  var payment_source: PaymentSource
}
object ConfirmOrderRequest {
  
  inline def apply(payment_source: PaymentSource): ConfirmOrderRequest = {
    val __obj = js.Dynamic.literal(payment_source = payment_source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmOrderRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfirmOrderRequest] (val x: Self) extends AnyVal {
    
    inline def setApplication_context(value: OrderConfirmApplicationContext): Self = StObject.set(x, "application_context", value.asInstanceOf[js.Any])
    
    inline def setApplication_contextUndefined: Self = StObject.set(x, "application_context", js.undefined)
    
    inline def setPayment_source(value: PaymentSource): Self = StObject.set(x, "payment_source", value.asInstanceOf[js.Any])
  }
}
