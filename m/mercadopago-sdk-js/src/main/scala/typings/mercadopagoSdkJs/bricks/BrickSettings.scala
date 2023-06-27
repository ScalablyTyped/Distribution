package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrickSettings[BrickType] extends StObject {
  
  // For a more detailed view of each Brick`s supported settings, please check the documentation at: https://github.com/mercadopago/sdk-js/blob/main/API/bricks/index.md
  var callbacks: /* import warning: importer.ImportType#apply Failed type conversion: BrickType extends 'wallet' ? mercadopago-sdk-js.bricks.WalletBrickCallbacks<BrickType> : BrickType extends 'cardPayment' ? mercadopago-sdk-js.bricks.CardPaymentBrickCallbacks<BrickType> : BrickType extends 'payment' ? mercadopago-sdk-js.bricks.PaymentBrickCallbacks<BrickType> : mercadopago-sdk-js.bricks.BrickCallbacks */ js.Any
  
  var customization: js.UndefOr[BrickCustomization] = js.undefined
  
  var initialization: js.UndefOr[BrickInitialization] = js.undefined
}
object BrickSettings {
  
  inline def apply[BrickType](
    callbacks: /* import warning: importer.ImportType#apply Failed type conversion: BrickType extends 'wallet' ? mercadopago-sdk-js.bricks.WalletBrickCallbacks<BrickType> : BrickType extends 'cardPayment' ? mercadopago-sdk-js.bricks.CardPaymentBrickCallbacks<BrickType> : BrickType extends 'payment' ? mercadopago-sdk-js.bricks.PaymentBrickCallbacks<BrickType> : mercadopago-sdk-js.bricks.BrickCallbacks */ js.Any
  ): BrickSettings[BrickType] = {
    val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrickSettings[BrickType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrickSettings[?], BrickType] (val x: Self & BrickSettings[BrickType]) extends AnyVal {
    
    inline def setCallbacks(
      value: /* import warning: importer.ImportType#apply Failed type conversion: BrickType extends 'wallet' ? mercadopago-sdk-js.bricks.WalletBrickCallbacks<BrickType> : BrickType extends 'cardPayment' ? mercadopago-sdk-js.bricks.CardPaymentBrickCallbacks<BrickType> : BrickType extends 'payment' ? mercadopago-sdk-js.bricks.PaymentBrickCallbacks<BrickType> : mercadopago-sdk-js.bricks.BrickCallbacks */ js.Any
    ): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
    
    inline def setCustomization(value: BrickCustomization): Self = StObject.set(x, "customization", value.asInstanceOf[js.Any])
    
    inline def setCustomizationUndefined: Self = StObject.set(x, "customization", js.undefined)
    
    inline def setInitialization(value: BrickInitialization): Self = StObject.set(x, "initialization", value.asInstanceOf[js.Any])
    
    inline def setInitializationUndefined: Self = StObject.set(x, "initialization", js.undefined)
  }
}
