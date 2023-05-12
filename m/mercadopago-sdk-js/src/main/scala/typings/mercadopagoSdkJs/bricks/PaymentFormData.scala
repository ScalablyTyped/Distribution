package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentFormData extends StObject {
  
  var additionalData: js.UndefOr[
    AdditionalSavedCardFormData | AdditionalCardFormData | AdditionalTicketFormData | Null
  ] = js.undefined
  
  var formData: js.UndefOr[CardFormData | SavedCardFormData | TicketFormData | Null] = js.undefined
  
  var paymentType: PaymentType
  
  var selectedPaymentMethod: PaymentType
}
object PaymentFormData {
  
  inline def apply(paymentType: PaymentType, selectedPaymentMethod: PaymentType): PaymentFormData = {
    val __obj = js.Dynamic.literal(paymentType = paymentType.asInstanceOf[js.Any], selectedPaymentMethod = selectedPaymentMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentFormData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentFormData] (val x: Self) extends AnyVal {
    
    inline def setAdditionalData(value: AdditionalSavedCardFormData | AdditionalCardFormData | AdditionalTicketFormData): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
    
    inline def setAdditionalDataNull: Self = StObject.set(x, "additionalData", null)
    
    inline def setAdditionalDataUndefined: Self = StObject.set(x, "additionalData", js.undefined)
    
    inline def setFormData(value: CardFormData | SavedCardFormData | TicketFormData): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormDataNull: Self = StObject.set(x, "formData", null)
    
    inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    inline def setPaymentType(value: PaymentType): Self = StObject.set(x, "paymentType", value.asInstanceOf[js.Any])
    
    inline def setSelectedPaymentMethod(value: PaymentType): Self = StObject.set(x, "selectedPaymentMethod", value.asInstanceOf[js.Any])
  }
}
