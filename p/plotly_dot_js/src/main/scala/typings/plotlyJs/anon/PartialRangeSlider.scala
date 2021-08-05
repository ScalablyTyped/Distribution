package typings.plotlyJs.anon

import typings.plotlyJs.mod.Datum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.RangeSlider> */
trait PartialRangeSlider extends StObject {
  
  var bgcolor: js.UndefOr[String] = js.undefined
  
  var bordercolor: js.UndefOr[String] = js.undefined
  
  var borderwidth: js.UndefOr[Double] = js.undefined
  
  var range: js.UndefOr[js.Tuple2[Datum, Datum]] = js.undefined
  
  var thickness: js.UndefOr[Double] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object PartialRangeSlider {
  
  inline def apply(): PartialRangeSlider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRangeSlider]
  }
  
  extension [Self <: PartialRangeSlider](x: Self) {
    
    inline def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    inline def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    inline def setBordercolor(value: String): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
    
    inline def setBordercolorUndefined: Self = StObject.set(x, "bordercolor", js.undefined)
    
    inline def setBorderwidth(value: Double): Self = StObject.set(x, "borderwidth", value.asInstanceOf[js.Any])
    
    inline def setBorderwidthUndefined: Self = StObject.set(x, "borderwidth", js.undefined)
    
    inline def setRange(value: js.Tuple2[Datum, Datum]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
