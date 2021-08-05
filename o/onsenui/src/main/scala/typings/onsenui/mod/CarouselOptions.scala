package typings.onsenui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CarouselOptions extends StObject {
  
  var animation: js.UndefOr[String] = js.undefined
  
  var animationOptions: js.UndefOr[js.Object] = js.undefined
  
  var callback: js.UndefOr[js.Function] = js.undefined
}
object CarouselOptions {
  
  inline def apply(): CarouselOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarouselOptions]
  }
  
  extension [Self <: CarouselOptions](x: Self) {
    
    inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationOptions(value: js.Object): Self = StObject.set(x, "animationOptions", value.asInstanceOf[js.Any])
    
    inline def setAnimationOptionsUndefined: Self = StObject.set(x, "animationOptions", js.undefined)
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
  }
}
