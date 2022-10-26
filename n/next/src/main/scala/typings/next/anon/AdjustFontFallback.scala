package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdjustFontFallback extends StObject {
  
  var adjustFontFallback: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AdjustFontFallback */ Any
  ] = js.undefined
  
  var exports: js.Array[Name]
  
  var fallbackFonts: js.UndefOr[js.Array[String]] = js.undefined
  
  var fontFamilyHash: String
  
  var style: js.UndefOr[String] = js.undefined
  
  var variable: js.UndefOr[String] = js.undefined
  
  var weight: js.UndefOr[String] = js.undefined
}
object AdjustFontFallback {
  
  inline def apply(exports: js.Array[Name], fontFamilyHash: String): AdjustFontFallback = {
    val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], fontFamilyHash = fontFamilyHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdjustFontFallback]
  }
  
  extension [Self <: AdjustFontFallback](x: Self) {
    
    inline def setAdjustFontFallback(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AdjustFontFallback */ Any
    ): Self = StObject.set(x, "adjustFontFallback", value.asInstanceOf[js.Any])
    
    inline def setAdjustFontFallbackUndefined: Self = StObject.set(x, "adjustFontFallback", js.undefined)
    
    inline def setExports(value: js.Array[Name]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsVarargs(value: Name*): Self = StObject.set(x, "exports", js.Array(value*))
    
    inline def setFallbackFonts(value: js.Array[String]): Self = StObject.set(x, "fallbackFonts", value.asInstanceOf[js.Any])
    
    inline def setFallbackFontsUndefined: Self = StObject.set(x, "fallbackFonts", js.undefined)
    
    inline def setFallbackFontsVarargs(value: String*): Self = StObject.set(x, "fallbackFonts", js.Array(value*))
    
    inline def setFontFamilyHash(value: String): Self = StObject.set(x, "fontFamilyHash", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
    
    inline def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
