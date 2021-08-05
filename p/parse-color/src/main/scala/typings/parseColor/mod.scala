package typings.parseColor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(cstr: String): Color = ^.asInstanceOf[js.Dynamic].apply(cstr.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  @JSImport("parse-color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Color extends StObject {
    
    var cmyk: js.Tuple4[Double, Double, Double, Double]
    
    var cmyka: js.Tuple5[Double, Double, Double, Double, Double]
    
    var hex: String
    
    var hsl: js.Tuple3[Double, Double, Double]
    
    var hsla: js.Tuple4[Double, Double, Double, Double]
    
    var hsv: js.Tuple3[Double, Double, Double]
    
    var hsva: js.Tuple4[Double, Double, Double, Double]
    
    var keyword: String
    
    var rgb: js.Tuple3[Double, Double, Double]
    
    var rgba: js.Tuple4[Double, Double, Double, Double]
  }
  object Color {
    
    inline def apply(
      cmyk: js.Tuple4[Double, Double, Double, Double],
      cmyka: js.Tuple5[Double, Double, Double, Double, Double],
      hex: String,
      hsl: js.Tuple3[Double, Double, Double],
      hsla: js.Tuple4[Double, Double, Double, Double],
      hsv: js.Tuple3[Double, Double, Double],
      hsva: js.Tuple4[Double, Double, Double, Double],
      keyword: String,
      rgb: js.Tuple3[Double, Double, Double],
      rgba: js.Tuple4[Double, Double, Double, Double]
    ): Color = {
      val __obj = js.Dynamic.literal(cmyk = cmyk.asInstanceOf[js.Any], cmyka = cmyka.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], hsl = hsl.asInstanceOf[js.Any], hsla = hsla.asInstanceOf[js.Any], hsv = hsv.asInstanceOf[js.Any], hsva = hsva.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any], rgba = rgba.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setCmyk(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "cmyk", value.asInstanceOf[js.Any])
      
      inline def setCmyka(value: js.Tuple5[Double, Double, Double, Double, Double]): Self = StObject.set(x, "cmyka", value.asInstanceOf[js.Any])
      
      inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def setHsl(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "hsl", value.asInstanceOf[js.Any])
      
      inline def setHsla(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "hsla", value.asInstanceOf[js.Any])
      
      inline def setHsv(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "hsv", value.asInstanceOf[js.Any])
      
      inline def setHsva(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "hsva", value.asInstanceOf[js.Any])
      
      inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setRgb(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "rgb", value.asInstanceOf[js.Any])
      
      inline def setRgba(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "rgba", value.asInstanceOf[js.Any])
    }
  }
}
