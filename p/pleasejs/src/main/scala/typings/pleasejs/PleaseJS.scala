package typings.pleasejs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PleaseJS {
  
  trait HSV extends StObject {
    
    var h: Double
    
    var s: Double
    
    var v: Double
  }
  object HSV {
    
    inline def apply(h: Double, s: Double, v: Double): HSV = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSV]
    }
    
    extension [Self <: HSV](x: Self) {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait MakeColorOption extends StObject {
    
    var base_color: js.UndefOr[String] = js.undefined
    
    var colors_returned: js.UndefOr[Double] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var full_random: js.UndefOr[Boolean] = js.undefined
    
    var golden: js.UndefOr[Boolean] = js.undefined
    
    var grayscale: js.UndefOr[Boolean] = js.undefined
    
    var greyscale: js.UndefOr[Boolean] = js.undefined
    
    var hue: js.UndefOr[Double] = js.undefined
    
    var saturation: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object MakeColorOption {
    
    inline def apply(): MakeColorOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MakeColorOption]
    }
    
    extension [Self <: MakeColorOption](x: Self) {
      
      inline def setBase_color(value: String): Self = StObject.set(x, "base_color", value.asInstanceOf[js.Any])
      
      inline def setBase_colorUndefined: Self = StObject.set(x, "base_color", js.undefined)
      
      inline def setColors_returned(value: Double): Self = StObject.set(x, "colors_returned", value.asInstanceOf[js.Any])
      
      inline def setColors_returnedUndefined: Self = StObject.set(x, "colors_returned", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setFull_random(value: Boolean): Self = StObject.set(x, "full_random", value.asInstanceOf[js.Any])
      
      inline def setFull_randomUndefined: Self = StObject.set(x, "full_random", js.undefined)
      
      inline def setGolden(value: Boolean): Self = StObject.set(x, "golden", value.asInstanceOf[js.Any])
      
      inline def setGoldenUndefined: Self = StObject.set(x, "golden", js.undefined)
      
      inline def setGrayscale(value: Boolean): Self = StObject.set(x, "grayscale", value.asInstanceOf[js.Any])
      
      inline def setGrayscaleUndefined: Self = StObject.set(x, "grayscale", js.undefined)
      
      inline def setGreyscale(value: Boolean): Self = StObject.set(x, "greyscale", value.asInstanceOf[js.Any])
      
      inline def setGreyscaleUndefined: Self = StObject.set(x, "greyscale", js.undefined)
      
      inline def setHue(value: Double): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
      
      inline def setHueUndefined: Self = StObject.set(x, "hue", js.undefined)
      
      inline def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
      
      inline def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait MakeSchemeOption extends StObject {
    
    var format: String
    
    var scheme_type: String
  }
  object MakeSchemeOption {
    
    inline def apply(format: String, scheme_type: String): MakeSchemeOption = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], scheme_type = scheme_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[MakeSchemeOption]
    }
    
    extension [Self <: MakeSchemeOption](x: Self) {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setScheme_type(value: String): Self = StObject.set(x, "scheme_type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Please extends StObject {
    
    /***
      * convert HEX into HSV
      * @param {string} hex
      * @returns {HSV}
      */
    def HEX_to_HSV(hex: String): HSV = js.native
    
    /***
      * convert HEX into RGB
      * @param {string} hex
      * @returns {RGB}
      */
    def HEX_to_RGB(hex: String): RGB | Null = js.native
    
    /***
      * convert HSV into HEX
      * @param {HSV} hsv
      * @returns {string}
      */
    def HSV_to_HEX(hsv: HSV): String = js.native
    
    /***
      * convert HSV into RGB
      * @param {HSV} hsv
      * @returns {RGB}
      */
    def HSV_to_RGB(hsv: HSV): RGB = js.native
    
    /***
      * convert color name into hex string
      * @param {string} name
      * @returns {string}
      */
    def NAME_to_HEX(name: String): js.UndefOr[String] = js.native
    
    /***
      * convert color name into RGB
      * @param {string} name
      * @returns {HSV}
      */
    def NAME_to_HSV(name: String): HSV = js.native
    
    /***
      * convert color name into RGB
      * @param {string} name
      * @returns {RGB}
      */
    def NAME_to_RGB(name: String): RGB | Null = js.native
    
    /***
      * convert RGB into HEX
      * @param {RGB} rgb
      * @returns {string}
      */
    def RGB_to_HEX(rgb: RGB): String = js.native
    
    /***
      * convert RGB into HSV
      * @param {RGB} rgb
      * @returns {HSV}
      */
    def RGB_to_HSV(rgb: RGB): HSV = js.native
    
    /***
      * generate and return a random hex string
      * @param {MakeColorOption} options
      * @returns {Array}
      */
    def make_color(): js.Array[String | RGB | HSV] = js.native
    def make_color(options: MakeColorOption): js.Array[String | RGB | HSV] = js.native
    
    /***
      * make a color scheme
      * @param {MakeSchemeOption} options
      * @returns {Array}
      */
    def make_scheme(base_color: HSV): js.Array[String | RGB | HSV] = js.native
    def make_scheme(base_color: HSV, options: MakeSchemeOption): js.Array[String | RGB | HSV] = js.native
  }
  
  trait RGB extends StObject {
    
    var b: Double
    
    var g: Double
    
    var r: Double
  }
  object RGB {
    
    inline def apply(b: Double, g: Double, r: Double): RGB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGB]
    }
    
    extension [Self <: RGB](x: Self) {
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
}
