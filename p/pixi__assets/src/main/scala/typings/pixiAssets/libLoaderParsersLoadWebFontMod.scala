package typings.pixiAssets

import typings.pixiAssets.libLoaderParsersLoaderParserMod.LoaderParser
import typings.std.FontFace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLoaderParsersLoadWebFontMod {
  
  @JSImport("@pixi/assets/lib/loader/parsers/loadWebFont", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFontFamilyName(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontFamilyName")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@pixi/assets/lib/loader/parsers/loadWebFont", "loadWebFont")
  @js.native
  val loadWebFont: LoaderParser[FontFace | js.Array[FontFace], Any] = js.native
  
  trait LoadFontData extends StObject {
    
    var display: String
    
    var family: String
    
    var featureSettings: String
    
    var stretch: String
    
    var style: String
    
    var unicodeRange: String
    
    var variant: String
    
    var weights: js.Array[String]
  }
  object LoadFontData {
    
    inline def apply(
      display: String,
      family: String,
      featureSettings: String,
      stretch: String,
      style: String,
      unicodeRange: String,
      variant: String,
      weights: js.Array[String]
    ): LoadFontData = {
      val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], featureSettings = featureSettings.asInstanceOf[js.Any], stretch = stretch.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], unicodeRange = unicodeRange.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any], weights = weights.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadFontData]
    }
    
    extension [Self <: LoadFontData](x: Self) {
      
      inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFeatureSettings(value: String): Self = StObject.set(x, "featureSettings", value.asInstanceOf[js.Any])
      
      inline def setStretch(value: String): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setUnicodeRange(value: String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
      
      inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setWeights(value: js.Array[String]): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
      
      inline def setWeightsVarargs(value: String*): Self = StObject.set(x, "weights", js.Array(value*))
    }
  }
}
