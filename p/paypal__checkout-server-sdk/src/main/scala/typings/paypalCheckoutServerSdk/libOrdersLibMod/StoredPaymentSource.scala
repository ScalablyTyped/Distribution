package typings.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoredPaymentSource extends StObject {
  
  var payment_initiator: PaymentInitiator
  
  var payment_type: PaymentType
  
  var previous_network_transaction_reference: js.UndefOr[js.Object] = js.undefined
  
  var usage: js.UndefOr[Usage] = js.undefined
}
object StoredPaymentSource {
  
  inline def apply(payment_initiator: PaymentInitiator, payment_type: PaymentType): StoredPaymentSource = {
    val __obj = js.Dynamic.literal(payment_initiator = payment_initiator.asInstanceOf[js.Any], payment_type = payment_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoredPaymentSource]
  }
  
  extension [Self <: StoredPaymentSource](x: Self) {
    
    inline def setPayment_initiator(value: PaymentInitiator): Self = StObject.set(x, "payment_initiator", value.asInstanceOf[js.Any])
    
    inline def setPayment_type(value: PaymentType): Self = StObject.set(x, "payment_type", value.asInstanceOf[js.Any])
    
    inline def setPrevious_network_transaction_reference(value: js.Object): Self = StObject.set(x, "previous_network_transaction_reference", value.asInstanceOf[js.Any])
    
    inline def setPrevious_network_transaction_referenceUndefined: Self = StObject.set(x, "previous_network_transaction_reference", js.undefined)
    
    inline def setUsage(value: Usage): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
