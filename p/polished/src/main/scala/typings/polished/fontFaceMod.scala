package typings.polished

import typings.polished.fontFaceConfigurationMod.FontFaceConfiguration
import typings.polished.styleMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontFaceMod {
  
  @JSImport("polished/lib/mixins/fontFace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    hasFontFamilyFontFilePathFontStretchFontStyleFontVariantFontWeightFileFormatsFormatHintLocalFontsUnicodeRangeFontDisplayFontVariationSettingsFontFeatureSettings: FontFaceConfiguration
  ): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasFontFamilyFontFilePathFontStretchFontStyleFontVariantFontWeightFileFormatsFormatHintLocalFontsUnicodeRangeFontDisplayFontVariationSettingsFontFeatureSettings.asInstanceOf[js.Any]).asInstanceOf[Styles]
}
