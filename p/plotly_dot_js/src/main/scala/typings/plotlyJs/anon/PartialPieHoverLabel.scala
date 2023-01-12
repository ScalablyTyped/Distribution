package typings.plotlyJs.anon

import typings.plotlyJs.libTracesPieMod.PieColor
import typings.plotlyJs.libTracesPieMod.PieColors
import typings.plotlyJs.libTracesPieMod.PieFont
import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js/lib/traces/pie.PieHoverLabel> */
trait PartialPieHoverLabel extends StObject {
  
  var align: js.UndefOr[left | right | auto | (js.Array[left | right | auto])] = js.undefined
  
  var bgcolor: js.UndefOr[PieColor | PieColors] = js.undefined
  
  var bordercolor: js.UndefOr[PieColor | PieColors] = js.undefined
  
  var font: js.UndefOr[PieFont] = js.undefined
  
  var namelength: js.UndefOr[Double | js.Array[Double]] = js.undefined
}
object PartialPieHoverLabel {
  
  inline def apply(): PartialPieHoverLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPieHoverLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialPieHoverLabel] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: left | right | auto | (js.Array[left | right | auto])): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setAlignVarargs(value: (left | right | auto)*): Self = StObject.set(x, "align", js.Array(value*))
    
    inline def setBgcolor(value: PieColor | PieColors): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    inline def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    inline def setBgcolorVarargs(value: (js.UndefOr[PieColor | Null])*): Self = StObject.set(x, "bgcolor", js.Array(value*))
    
    inline def setBordercolor(value: PieColor | PieColors): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
    
    inline def setBordercolorUndefined: Self = StObject.set(x, "bordercolor", js.undefined)
    
    inline def setBordercolorVarargs(value: (js.UndefOr[PieColor | Null])*): Self = StObject.set(x, "bordercolor", js.Array(value*))
    
    inline def setFont(value: PieFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setNamelength(value: Double | js.Array[Double]): Self = StObject.set(x, "namelength", value.asInstanceOf[js.Any])
    
    inline def setNamelengthUndefined: Self = StObject.set(x, "namelength", js.undefined)
    
    inline def setNamelengthVarargs(value: Double*): Self = StObject.set(x, "namelength", js.Array(value*))
  }
}
