package typings.nodeBarion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPaymentStateRequest extends StObject {
  
  var POSKey: String
  
  var PaymentId: String
}
object GetPaymentStateRequest {
  
  inline def apply(POSKey: String, PaymentId: String): GetPaymentStateRequest = {
    val __obj = js.Dynamic.literal(POSKey = POSKey.asInstanceOf[js.Any], PaymentId = PaymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPaymentStateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPaymentStateRequest] (val x: Self) extends AnyVal {
    
    inline def setPOSKey(value: String): Self = StObject.set(x, "POSKey", value.asInstanceOf[js.Any])
    
    inline def setPaymentId(value: String): Self = StObject.set(x, "PaymentId", value.asInstanceOf[js.Any])
  }
}
