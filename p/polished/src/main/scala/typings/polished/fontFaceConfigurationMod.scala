package typings.polished

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontFaceConfigurationMod {
  
  trait FontFaceConfiguration extends StObject {
    
    var fileFormats: js.UndefOr[js.Array[String]] = js.undefined
    
    var fontDisplay: js.UndefOr[String] = js.undefined
    
    var fontFamily: String
    
    var fontFeatureSettings: js.UndefOr[String] = js.undefined
    
    var fontFilePath: js.UndefOr[String] = js.undefined
    
    var fontStretch: js.UndefOr[String] = js.undefined
    
    var fontStyle: js.UndefOr[String] = js.undefined
    
    var fontVariant: js.UndefOr[String] = js.undefined
    
    var fontVariationSettings: js.UndefOr[String] = js.undefined
    
    var fontWeight: js.UndefOr[String] = js.undefined
    
    var formatHint: js.UndefOr[Boolean] = js.undefined
    
    var localFonts: js.UndefOr[js.Array[String]] = js.undefined
    
    var unicodeRange: js.UndefOr[String] = js.undefined
  }
  object FontFaceConfiguration {
    
    inline def apply(fontFamily: String): FontFaceConfiguration = {
      val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontFaceConfiguration]
    }
    
    extension [Self <: FontFaceConfiguration](x: Self) {
      
      inline def setFileFormats(value: js.Array[String]): Self = StObject.set(x, "fileFormats", value.asInstanceOf[js.Any])
      
      inline def setFileFormatsUndefined: Self = StObject.set(x, "fileFormats", js.undefined)
      
      inline def setFileFormatsVarargs(value: String*): Self = StObject.set(x, "fileFormats", js.Array(value :_*))
      
      inline def setFontDisplay(value: String): Self = StObject.set(x, "fontDisplay", value.asInstanceOf[js.Any])
      
      inline def setFontDisplayUndefined: Self = StObject.set(x, "fontDisplay", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFeatureSettings(value: String): Self = StObject.set(x, "fontFeatureSettings", value.asInstanceOf[js.Any])
      
      inline def setFontFeatureSettingsUndefined: Self = StObject.set(x, "fontFeatureSettings", js.undefined)
      
      inline def setFontFilePath(value: String): Self = StObject.set(x, "fontFilePath", value.asInstanceOf[js.Any])
      
      inline def setFontFilePathUndefined: Self = StObject.set(x, "fontFilePath", js.undefined)
      
      inline def setFontStretch(value: String): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
      
      inline def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
      
      inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontVariant(value: String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      inline def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      inline def setFontVariationSettings(value: String): Self = StObject.set(x, "fontVariationSettings", value.asInstanceOf[js.Any])
      
      inline def setFontVariationSettingsUndefined: Self = StObject.set(x, "fontVariationSettings", js.undefined)
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setFormatHint(value: Boolean): Self = StObject.set(x, "formatHint", value.asInstanceOf[js.Any])
      
      inline def setFormatHintUndefined: Self = StObject.set(x, "formatHint", js.undefined)
      
      inline def setLocalFonts(value: js.Array[String]): Self = StObject.set(x, "localFonts", value.asInstanceOf[js.Any])
      
      inline def setLocalFontsUndefined: Self = StObject.set(x, "localFonts", js.undefined)
      
      inline def setLocalFontsVarargs(value: String*): Self = StObject.set(x, "localFonts", js.Array(value :_*))
      
      inline def setUnicodeRange(value: String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
      
      inline def setUnicodeRangeUndefined: Self = StObject.set(x, "unicodeRange", js.undefined)
    }
  }
}
