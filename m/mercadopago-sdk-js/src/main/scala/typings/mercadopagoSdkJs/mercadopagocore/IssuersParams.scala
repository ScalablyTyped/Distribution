package typings.mercadopagoSdkJs.mercadopagocore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuersParams extends StObject {
  
  var bin: String
  
  var paymentMethodId: js.UndefOr[String] = js.undefined
  
  var payment_method_id: js.UndefOr[String] = js.undefined
}
object IssuersParams {
  
  inline def apply(bin: String): IssuersParams = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuersParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IssuersParams] (val x: Self) extends AnyVal {
    
    inline def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodId(value: String): Self = StObject.set(x, "paymentMethodId", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodIdUndefined: Self = StObject.set(x, "paymentMethodId", js.undefined)
    
    inline def setPayment_method_id(value: String): Self = StObject.set(x, "payment_method_id", value.asInstanceOf[js.Any])
    
    inline def setPayment_method_idUndefined: Self = StObject.set(x, "payment_method_id", js.undefined)
  }
}
