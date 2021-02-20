package typings.polished

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontFaceConfigurationMod {
  
  @js.native
  trait FontFaceConfiguration extends StObject {
    
    var fileFormats: js.UndefOr[js.Array[String]] = js.native
    
    var fontDisplay: js.UndefOr[String] = js.native
    
    var fontFamily: String = js.native
    
    var fontFeatureSettings: js.UndefOr[String] = js.native
    
    var fontFilePath: js.UndefOr[String] = js.native
    
    var fontStretch: js.UndefOr[String] = js.native
    
    var fontStyle: js.UndefOr[String] = js.native
    
    var fontVariant: js.UndefOr[String] = js.native
    
    var fontVariationSettings: js.UndefOr[String] = js.native
    
    var fontWeight: js.UndefOr[String] = js.native
    
    var formatHint: js.UndefOr[Boolean] = js.native
    
    var localFonts: js.UndefOr[js.Array[String]] = js.native
    
    var unicodeRange: js.UndefOr[String] = js.native
  }
  object FontFaceConfiguration {
    
    @scala.inline
    def apply(fontFamily: String): FontFaceConfiguration = {
      val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontFaceConfiguration]
    }
    
    @scala.inline
    implicit class FontFaceConfigurationMutableBuilder[Self <: FontFaceConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileFormats(value: js.Array[String]): Self = StObject.set(x, "fileFormats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileFormatsUndefined: Self = StObject.set(x, "fileFormats", js.undefined)
      
      @scala.inline
      def setFileFormatsVarargs(value: String*): Self = StObject.set(x, "fileFormats", js.Array(value :_*))
      
      @scala.inline
      def setFontDisplay(value: String): Self = StObject.set(x, "fontDisplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontDisplayUndefined: Self = StObject.set(x, "fontDisplay", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeatureSettings(value: String): Self = StObject.set(x, "fontFeatureSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeatureSettingsUndefined: Self = StObject.set(x, "fontFeatureSettings", js.undefined)
      
      @scala.inline
      def setFontFilePath(value: String): Self = StObject.set(x, "fontFilePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFilePathUndefined: Self = StObject.set(x, "fontFilePath", js.undefined)
      
      @scala.inline
      def setFontStretch(value: String): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
      
      @scala.inline
      def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontVariant(value: String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      @scala.inline
      def setFontVariationSettings(value: String): Self = StObject.set(x, "fontVariationSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontVariationSettingsUndefined: Self = StObject.set(x, "fontVariationSettings", js.undefined)
      
      @scala.inline
      def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setFormatHint(value: Boolean): Self = StObject.set(x, "formatHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatHintUndefined: Self = StObject.set(x, "formatHint", js.undefined)
      
      @scala.inline
      def setLocalFonts(value: js.Array[String]): Self = StObject.set(x, "localFonts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalFontsUndefined: Self = StObject.set(x, "localFonts", js.undefined)
      
      @scala.inline
      def setLocalFontsVarargs(value: String*): Self = StObject.set(x, "localFonts", js.Array(value :_*))
      
      @scala.inline
      def setUnicodeRange(value: String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeRangeUndefined: Self = StObject.set(x, "unicodeRange", js.undefined)
    }
  }
}
