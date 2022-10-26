package typings.next

import typings.next.anon.Css
import typings.next.anon.EmitFontFile
import typings.next.anon.FontFamily
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontMod {
  
  trait AdjustFontFallback extends StObject {
    
    var ascentOverride: js.UndefOr[String] = js.undefined
    
    var descentOverride: js.UndefOr[String] = js.undefined
    
    var fallbackFont: String
    
    var lineGapOverride: js.UndefOr[String] = js.undefined
    
    var sizeAdjust: js.UndefOr[String] = js.undefined
  }
  object AdjustFontFallback {
    
    inline def apply(fallbackFont: String): AdjustFontFallback = {
      val __obj = js.Dynamic.literal(fallbackFont = fallbackFont.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdjustFontFallback]
    }
    
    extension [Self <: AdjustFontFallback](x: Self) {
      
      inline def setAscentOverride(value: String): Self = StObject.set(x, "ascentOverride", value.asInstanceOf[js.Any])
      
      inline def setAscentOverrideUndefined: Self = StObject.set(x, "ascentOverride", js.undefined)
      
      inline def setDescentOverride(value: String): Self = StObject.set(x, "descentOverride", value.asInstanceOf[js.Any])
      
      inline def setDescentOverrideUndefined: Self = StObject.set(x, "descentOverride", js.undefined)
      
      inline def setFallbackFont(value: String): Self = StObject.set(x, "fallbackFont", value.asInstanceOf[js.Any])
      
      inline def setLineGapOverride(value: String): Self = StObject.set(x, "lineGapOverride", value.asInstanceOf[js.Any])
      
      inline def setLineGapOverrideUndefined: Self = StObject.set(x, "lineGapOverride", js.undefined)
      
      inline def setSizeAdjust(value: String): Self = StObject.set(x, "sizeAdjust", value.asInstanceOf[js.Any])
      
      inline def setSizeAdjustUndefined: Self = StObject.set(x, "sizeAdjust", js.undefined)
    }
  }
  
  type FontLoader = js.Function1[/* options */ EmitFontFile, js.Promise[Css]]
  
  trait FontModule extends StObject {
    
    var className: String
    
    var style: FontFamily
    
    var variable: js.UndefOr[String] = js.undefined
  }
  object FontModule {
    
    inline def apply(className: String, style: FontFamily): FontModule = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontModule]
    }
    
    extension [Self <: FontModule](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: FontFamily): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
      
      inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
    }
  }
}
