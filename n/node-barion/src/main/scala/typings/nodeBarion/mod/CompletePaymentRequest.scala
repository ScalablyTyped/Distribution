package typings.nodeBarion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletePaymentRequest extends StObject {
  
  var POSKey: String
  
  var PaymentId: String
}
object CompletePaymentRequest {
  
  inline def apply(POSKey: String, PaymentId: String): CompletePaymentRequest = {
    val __obj = js.Dynamic.literal(POSKey = POSKey.asInstanceOf[js.Any], PaymentId = PaymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletePaymentRequest]
  }
  
  extension [Self <: CompletePaymentRequest](x: Self) {
    
    inline def setPOSKey(value: String): Self = StObject.set(x, "POSKey", value.asInstanceOf[js.Any])
    
    inline def setPaymentId(value: String): Self = StObject.set(x, "PaymentId", value.asInstanceOf[js.Any])
  }
}
