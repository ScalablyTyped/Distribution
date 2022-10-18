package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdjustFontFallbacks extends StObject {
  
  var adjustFontFallbacks: js.UndefOr[Boolean] = js.undefined
  
  var isLikeServerless: Boolean
}
object AdjustFontFallbacks {
  
  inline def apply(isLikeServerless: Boolean): AdjustFontFallbacks = {
    val __obj = js.Dynamic.literal(isLikeServerless = isLikeServerless.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdjustFontFallbacks]
  }
  
  extension [Self <: AdjustFontFallbacks](x: Self) {
    
    inline def setAdjustFontFallbacks(value: Boolean): Self = StObject.set(x, "adjustFontFallbacks", value.asInstanceOf[js.Any])
    
    inline def setAdjustFontFallbacksUndefined: Self = StObject.set(x, "adjustFontFallbacks", js.undefined)
    
    inline def setIsLikeServerless(value: Boolean): Self = StObject.set(x, "isLikeServerless", value.asInstanceOf[js.Any])
  }
}
