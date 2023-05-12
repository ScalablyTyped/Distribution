package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrickCustomization extends StObject {
  
  var backUrls: js.UndefOr[StatusBrickBackUrls] = js.undefined
  
  var checkout: js.UndefOr[Checkout] = js.undefined
  
  var paymentMethods: js.UndefOr[PaymentMethods] = js.undefined
  
  var texts: js.UndefOr[WalletButtonTextCustomization] = js.undefined
  
  var visual: js.UndefOr[BrickVisualCustomization] = js.undefined
}
object BrickCustomization {
  
  inline def apply(): BrickCustomization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrickCustomization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrickCustomization] (val x: Self) extends AnyVal {
    
    inline def setBackUrls(value: StatusBrickBackUrls): Self = StObject.set(x, "backUrls", value.asInstanceOf[js.Any])
    
    inline def setBackUrlsUndefined: Self = StObject.set(x, "backUrls", js.undefined)
    
    inline def setCheckout(value: Checkout): Self = StObject.set(x, "checkout", value.asInstanceOf[js.Any])
    
    inline def setCheckoutUndefined: Self = StObject.set(x, "checkout", js.undefined)
    
    inline def setPaymentMethods(value: PaymentMethods): Self = StObject.set(x, "paymentMethods", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodsUndefined: Self = StObject.set(x, "paymentMethods", js.undefined)
    
    inline def setTexts(value: WalletButtonTextCustomization): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    
    inline def setVisual(value: BrickVisualCustomization): Self = StObject.set(x, "visual", value.asInstanceOf[js.Any])
    
    inline def setVisualUndefined: Self = StObject.set(x, "visual", js.undefined)
  }
}
