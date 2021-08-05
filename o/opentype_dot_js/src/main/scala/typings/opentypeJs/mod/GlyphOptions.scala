package typings.opentypeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlyphOptions extends StObject {
  
  var advanceWidth: js.UndefOr[Double] = js.undefined
  
  var font: js.UndefOr[Font] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[Path] = js.undefined
  
  var unicode: js.UndefOr[Double] = js.undefined
  
  var unicodes: js.UndefOr[js.Array[Double]] = js.undefined
  
  var xMax: js.UndefOr[Double] = js.undefined
  
  var xMin: js.UndefOr[Double] = js.undefined
  
  var yMax: js.UndefOr[Double] = js.undefined
  
  var yMin: js.UndefOr[Double] = js.undefined
}
object GlyphOptions {
  
  inline def apply(): GlyphOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlyphOptions]
  }
  
  extension [Self <: GlyphOptions](x: Self) {
    
    inline def setAdvanceWidth(value: Double): Self = StObject.set(x, "advanceWidth", value.asInstanceOf[js.Any])
    
    inline def setAdvanceWidthUndefined: Self = StObject.set(x, "advanceWidth", js.undefined)
    
    inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setUnicode(value: Double): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
    
    inline def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
    
    inline def setUnicodes(value: js.Array[Double]): Self = StObject.set(x, "unicodes", value.asInstanceOf[js.Any])
    
    inline def setUnicodesUndefined: Self = StObject.set(x, "unicodes", js.undefined)
    
    inline def setUnicodesVarargs(value: Double*): Self = StObject.set(x, "unicodes", js.Array(value :_*))
    
    inline def setXMax(value: Double): Self = StObject.set(x, "xMax", value.asInstanceOf[js.Any])
    
    inline def setXMaxUndefined: Self = StObject.set(x, "xMax", js.undefined)
    
    inline def setXMin(value: Double): Self = StObject.set(x, "xMin", value.asInstanceOf[js.Any])
    
    inline def setXMinUndefined: Self = StObject.set(x, "xMin", js.undefined)
    
    inline def setYMax(value: Double): Self = StObject.set(x, "yMax", value.asInstanceOf[js.Any])
    
    inline def setYMaxUndefined: Self = StObject.set(x, "yMax", js.undefined)
    
    inline def setYMin(value: Double): Self = StObject.set(x, "yMin", value.asInstanceOf[js.Any])
    
    inline def setYMinUndefined: Self = StObject.set(x, "yMin", js.undefined)
  }
}
