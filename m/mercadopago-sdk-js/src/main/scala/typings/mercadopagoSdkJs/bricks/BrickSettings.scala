package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrickSettings extends StObject {
  
  // For a more detailed view of each Brick`s supported settings, please check the documentation at: https://github.com/mercadopago/sdk-js/blob/main/API/bricks/index.md
  var callbacks: js.UndefOr[BrickCallbacks] = js.undefined
  
  var customization: js.UndefOr[BrickCustomization] = js.undefined
  
  var initialization: js.UndefOr[BrickInitialization] = js.undefined
}
object BrickSettings {
  
  inline def apply(): BrickSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrickSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrickSettings] (val x: Self) extends AnyVal {
    
    inline def setCallbacks(value: BrickCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
    
    inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
    
    inline def setCustomization(value: BrickCustomization): Self = StObject.set(x, "customization", value.asInstanceOf[js.Any])
    
    inline def setCustomizationUndefined: Self = StObject.set(x, "customization", js.undefined)
    
    inline def setInitialization(value: BrickInitialization): Self = StObject.set(x, "initialization", value.asInstanceOf[js.Any])
    
    inline def setInitializationUndefined: Self = StObject.set(x, "initialization", js.undefined)
  }
}
