package typings.opentypeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlyphOptions extends StObject {
  
  var advanceWidth: js.UndefOr[Double] = js.native
  
  var font: js.UndefOr[Font] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var path: js.UndefOr[Path] = js.native
  
  var unicode: js.UndefOr[Double] = js.native
  
  var unicodes: js.UndefOr[js.Array[Double]] = js.native
  
  var xMax: js.UndefOr[Double] = js.native
  
  var xMin: js.UndefOr[Double] = js.native
  
  var yMax: js.UndefOr[Double] = js.native
  
  var yMin: js.UndefOr[Double] = js.native
}
object GlyphOptions {
  
  @scala.inline
  def apply(): GlyphOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlyphOptions]
  }
  
  @scala.inline
  implicit class GlyphOptionsMutableBuilder[Self <: GlyphOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvanceWidth(value: Double): Self = StObject.set(x, "advanceWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvanceWidthUndefined: Self = StObject.set(x, "advanceWidth", js.undefined)
    
    @scala.inline
    def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setUnicode(value: Double): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
    
    @scala.inline
    def setUnicodes(value: js.Array[Double]): Self = StObject.set(x, "unicodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicodesUndefined: Self = StObject.set(x, "unicodes", js.undefined)
    
    @scala.inline
    def setUnicodesVarargs(value: Double*): Self = StObject.set(x, "unicodes", js.Array(value :_*))
    
    @scala.inline
    def setXMax(value: Double): Self = StObject.set(x, "xMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXMaxUndefined: Self = StObject.set(x, "xMax", js.undefined)
    
    @scala.inline
    def setXMin(value: Double): Self = StObject.set(x, "xMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXMinUndefined: Self = StObject.set(x, "xMin", js.undefined)
    
    @scala.inline
    def setYMax(value: Double): Self = StObject.set(x, "yMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYMaxUndefined: Self = StObject.set(x, "yMax", js.undefined)
    
    @scala.inline
    def setYMin(value: Double): Self = StObject.set(x, "yMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYMinUndefined: Self = StObject.set(x, "yMin", js.undefined)
  }
}
