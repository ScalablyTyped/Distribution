package typings.preact.jsxCsstypeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFace extends StObject {
  
  var MozFontFeatureSettings: js.UndefOr[FontFaceFontFeatureSettingsProperty] = js.undefined
  
  var fontDisplay: js.UndefOr[FontFaceFontDisplayProperty] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var fontFeatureSettings: js.UndefOr[FontFaceFontFeatureSettingsProperty] = js.undefined
  
  var fontStretch: js.UndefOr[FontFaceFontStretchProperty] = js.undefined
  
  var fontStyle: js.UndefOr[FontFaceFontStyleProperty] = js.undefined
  
  var fontVariant: js.UndefOr[FontFaceFontVariantProperty] = js.undefined
  
  var fontVariationSettings: js.UndefOr[FontFaceFontVariationSettingsProperty] = js.undefined
  
  var fontWeight: js.UndefOr[FontFaceFontWeightProperty] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var unicodeRange: js.UndefOr[String] = js.undefined
}
object FontFace {
  
  @scala.inline
  def apply(): FontFace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFace]
  }
  
  @scala.inline
  implicit class FontFaceMutableBuilder[Self <: FontFace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontDisplay(value: FontFaceFontDisplayProperty): Self = StObject.set(x, "fontDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontDisplayUndefined: Self = StObject.set(x, "fontDisplay", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontFeatureSettings(value: FontFaceFontFeatureSettingsProperty): Self = StObject.set(x, "fontFeatureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFeatureSettingsUndefined: Self = StObject.set(x, "fontFeatureSettings", js.undefined)
    
    @scala.inline
    def setFontStretch(value: FontFaceFontStretchProperty): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
    
    @scala.inline
    def setFontStyle(value: FontFaceFontStyleProperty): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontVariant(value: FontFaceFontVariantProperty): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
    
    @scala.inline
    def setFontVariationSettings(value: FontFaceFontVariationSettingsProperty): Self = StObject.set(x, "fontVariationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontVariationSettingsUndefined: Self = StObject.set(x, "fontVariationSettings", js.undefined)
    
    @scala.inline
    def setFontWeight(value: FontFaceFontWeightProperty): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setMozFontFeatureSettings(value: FontFaceFontFeatureSettingsProperty): Self = StObject.set(x, "MozFontFeatureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozFontFeatureSettingsUndefined: Self = StObject.set(x, "MozFontFeatureSettings", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    @scala.inline
    def setUnicodeRange(value: String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicodeRangeUndefined: Self = StObject.set(x, "unicodeRange", js.undefined)
  }
}
