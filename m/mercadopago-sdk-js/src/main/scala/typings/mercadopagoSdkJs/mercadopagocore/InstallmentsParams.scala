package typings.mercadopagoSdkJs.mercadopagocore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallmentsParams extends StObject {
  
  var amount: String
  
  var bin: String
  
  var locale: js.UndefOr[Locale] = js.undefined
  
  var paymentMethodId: js.UndefOr[String] = js.undefined
  
  var paymentTypeId: js.UndefOr[String] = js.undefined
  
  var payment_method_id: js.UndefOr[String] = js.undefined
  
  var payment_type_id: js.UndefOr[String] = js.undefined
  
  var processingMode: js.UndefOr[ProcessingMode] = js.undefined
  
  var processing_mode: js.UndefOr[ProcessingMode] = js.undefined
}
object InstallmentsParams {
  
  inline def apply(amount: String, bin: String): InstallmentsParams = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], bin = bin.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallmentsParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstallmentsParams] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setPaymentMethodId(value: String): Self = StObject.set(x, "paymentMethodId", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodIdUndefined: Self = StObject.set(x, "paymentMethodId", js.undefined)
    
    inline def setPaymentTypeId(value: String): Self = StObject.set(x, "paymentTypeId", value.asInstanceOf[js.Any])
    
    inline def setPaymentTypeIdUndefined: Self = StObject.set(x, "paymentTypeId", js.undefined)
    
    inline def setPayment_method_id(value: String): Self = StObject.set(x, "payment_method_id", value.asInstanceOf[js.Any])
    
    inline def setPayment_method_idUndefined: Self = StObject.set(x, "payment_method_id", js.undefined)
    
    inline def setPayment_type_id(value: String): Self = StObject.set(x, "payment_type_id", value.asInstanceOf[js.Any])
    
    inline def setPayment_type_idUndefined: Self = StObject.set(x, "payment_type_id", js.undefined)
    
    inline def setProcessingMode(value: ProcessingMode): Self = StObject.set(x, "processingMode", value.asInstanceOf[js.Any])
    
    inline def setProcessingModeUndefined: Self = StObject.set(x, "processingMode", js.undefined)
    
    inline def setProcessing_mode(value: ProcessingMode): Self = StObject.set(x, "processing_mode", value.asInstanceOf[js.Any])
    
    inline def setProcessing_modeUndefined: Self = StObject.set(x, "processing_mode", js.undefined)
  }
}
