package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Css extends StObject {
  
  var adjustFontFallback: js.UndefOr[typings.next.fontMod.AdjustFontFallback] = js.undefined
  
  var css: String
  
  var fallbackFonts: js.UndefOr[js.Array[String]] = js.undefined
  
  var style: js.UndefOr[String] = js.undefined
  
  var variable: js.UndefOr[String] = js.undefined
  
  var weight: js.UndefOr[String] = js.undefined
}
object Css {
  
  inline def apply(css: String): Css = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any])
    __obj.asInstanceOf[Css]
  }
  
  extension [Self <: Css](x: Self) {
    
    inline def setAdjustFontFallback(value: typings.next.fontMod.AdjustFontFallback): Self = StObject.set(x, "adjustFontFallback", value.asInstanceOf[js.Any])
    
    inline def setAdjustFontFallbackUndefined: Self = StObject.set(x, "adjustFontFallback", js.undefined)
    
    inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setFallbackFonts(value: js.Array[String]): Self = StObject.set(x, "fallbackFonts", value.asInstanceOf[js.Any])
    
    inline def setFallbackFontsUndefined: Self = StObject.set(x, "fallbackFonts", js.undefined)
    
    inline def setFallbackFontsVarargs(value: String*): Self = StObject.set(x, "fallbackFonts", js.Array(value*))
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
    
    inline def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
