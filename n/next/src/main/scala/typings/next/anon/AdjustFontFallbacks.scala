package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdjustFontFallbacks extends StObject {
  
  var adjustFontFallbacks: js.UndefOr[Boolean] = js.undefined
  
  var adjustFontFallbacksWithSizeAdjust: js.UndefOr[Boolean] = js.undefined
}
object AdjustFontFallbacks {
  
  inline def apply(): AdjustFontFallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdjustFontFallbacks]
  }
  
  extension [Self <: AdjustFontFallbacks](x: Self) {
    
    inline def setAdjustFontFallbacks(value: Boolean): Self = StObject.set(x, "adjustFontFallbacks", value.asInstanceOf[js.Any])
    
    inline def setAdjustFontFallbacksUndefined: Self = StObject.set(x, "adjustFontFallbacks", js.undefined)
    
    inline def setAdjustFontFallbacksWithSizeAdjust(value: Boolean): Self = StObject.set(x, "adjustFontFallbacksWithSizeAdjust", value.asInstanceOf[js.Any])
    
    inline def setAdjustFontFallbacksWithSizeAdjustUndefined: Self = StObject.set(x, "adjustFontFallbacksWithSizeAdjust", js.undefined)
  }
}
