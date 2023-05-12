package typings.mercadopagoSdkJs.cardform

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardFormOptions extends StObject {
  
  var amount: Double | String
  
  var autoMount: js.UndefOr[Boolean] = js.undefined
  
  var callbacks: Callbacks
  
  var form: CardFormMap
  
  var iframe: js.UndefOr[Boolean] = js.undefined
  
  var processingMode: AVAILABLE_PROCESSING_MODE
}
object CardFormOptions {
  
  inline def apply(
    amount: Double | String,
    callbacks: Callbacks,
    form: CardFormMap,
    processingMode: AVAILABLE_PROCESSING_MODE
  ): CardFormOptions = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], callbacks = callbacks.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], processingMode = processingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardFormOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardFormOptions] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double | String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAutoMount(value: Boolean): Self = StObject.set(x, "autoMount", value.asInstanceOf[js.Any])
    
    inline def setAutoMountUndefined: Self = StObject.set(x, "autoMount", js.undefined)
    
    inline def setCallbacks(value: Callbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
    
    inline def setForm(value: CardFormMap): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setIframe(value: Boolean): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
    
    inline def setIframeUndefined: Self = StObject.set(x, "iframe", js.undefined)
    
    inline def setProcessingMode(value: AVAILABLE_PROCESSING_MODE): Self = StObject.set(x, "processingMode", value.asInstanceOf[js.Any])
  }
}
