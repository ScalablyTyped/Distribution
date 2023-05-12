package typings.mercadopagoSdkJs.mercadopagocore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentMethodsParams extends StObject {
  
  var bin: String
  
  var processingMode: js.UndefOr[ProcessingMode] = js.undefined
}
object PaymentMethodsParams {
  
  inline def apply(bin: String): PaymentMethodsParams = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodsParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentMethodsParams] (val x: Self) extends AnyVal {
    
    inline def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
    
    inline def setProcessingMode(value: ProcessingMode): Self = StObject.set(x, "processingMode", value.asInstanceOf[js.Any])
    
    inline def setProcessingModeUndefined: Self = StObject.set(x, "processingMode", js.undefined)
  }
}
