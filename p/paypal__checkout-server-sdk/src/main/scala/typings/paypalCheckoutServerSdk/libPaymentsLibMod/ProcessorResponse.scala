package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessorResponse extends StObject {
  
  val avs_code: AVSCode
  
  val cvv_code: CVVCode
  
  val payment_advice_code: PaymentAdviceCode
  
  val response_code: ResponseCode
}
object ProcessorResponse {
  
  inline def apply(
    avs_code: AVSCode,
    cvv_code: CVVCode,
    payment_advice_code: PaymentAdviceCode,
    response_code: ResponseCode
  ): ProcessorResponse = {
    val __obj = js.Dynamic.literal(avs_code = avs_code.asInstanceOf[js.Any], cvv_code = cvv_code.asInstanceOf[js.Any], payment_advice_code = payment_advice_code.asInstanceOf[js.Any], response_code = response_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessorResponse] (val x: Self) extends AnyVal {
    
    inline def setAvs_code(value: AVSCode): Self = StObject.set(x, "avs_code", value.asInstanceOf[js.Any])
    
    inline def setCvv_code(value: CVVCode): Self = StObject.set(x, "cvv_code", value.asInstanceOf[js.Any])
    
    inline def setPayment_advice_code(value: PaymentAdviceCode): Self = StObject.set(x, "payment_advice_code", value.asInstanceOf[js.Any])
    
    inline def setResponse_code(value: ResponseCode): Self = StObject.set(x, "response_code", value.asInstanceOf[js.Any])
  }
}
