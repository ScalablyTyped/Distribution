package typings.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScatterMarkerLine extends StObject {
  
  var autocolorscale: js.UndefOr[Boolean] = js.undefined
  
  var cauto: js.UndefOr[Boolean] = js.undefined
  
  var cmax: js.UndefOr[Double] = js.undefined
  
  var cmid: js.UndefOr[Double] = js.undefined
  
  var cmin: js.UndefOr[Double] = js.undefined
  
  var color: Color
  
  var coloraxis: js.UndefOr[String] = js.undefined
  
  var colorscale: js.UndefOr[ColorScale] = js.undefined
  
  var reversescale: js.UndefOr[Boolean] = js.undefined
  
  var width: Double | js.Array[Double]
}
object ScatterMarkerLine {
  
  inline def apply(color: Color, width: Double | js.Array[Double]): ScatterMarkerLine = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterMarkerLine]
  }
  
  extension [Self <: ScatterMarkerLine](x: Self) {
    
    inline def setAutocolorscale(value: Boolean): Self = StObject.set(x, "autocolorscale", value.asInstanceOf[js.Any])
    
    inline def setAutocolorscaleUndefined: Self = StObject.set(x, "autocolorscale", js.undefined)
    
    inline def setCauto(value: Boolean): Self = StObject.set(x, "cauto", value.asInstanceOf[js.Any])
    
    inline def setCautoUndefined: Self = StObject.set(x, "cauto", js.undefined)
    
    inline def setCmax(value: Double): Self = StObject.set(x, "cmax", value.asInstanceOf[js.Any])
    
    inline def setCmaxUndefined: Self = StObject.set(x, "cmax", js.undefined)
    
    inline def setCmid(value: Double): Self = StObject.set(x, "cmid", value.asInstanceOf[js.Any])
    
    inline def setCmidUndefined: Self = StObject.set(x, "cmid", js.undefined)
    
    inline def setCmin(value: Double): Self = StObject.set(x, "cmin", value.asInstanceOf[js.Any])
    
    inline def setCminUndefined: Self = StObject.set(x, "cmin", js.undefined)
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setColoraxis(value: String): Self = StObject.set(x, "coloraxis", value.asInstanceOf[js.Any])
    
    inline def setColoraxisUndefined: Self = StObject.set(x, "coloraxis", js.undefined)
    
    inline def setColorscale(value: ColorScale): Self = StObject.set(x, "colorscale", value.asInstanceOf[js.Any])
    
    inline def setColorscaleUndefined: Self = StObject.set(x, "colorscale", js.undefined)
    
    inline def setColorscaleVarargs(value: (String | (js.Tuple2[Double, String]))*): Self = StObject.set(x, "colorscale", js.Array(value*))
    
    inline def setReversescale(value: Boolean): Self = StObject.set(x, "reversescale", value.asInstanceOf[js.Any])
    
    inline def setReversescaleUndefined: Self = StObject.set(x, "reversescale", js.undefined)
    
    inline def setWidth(value: Double | js.Array[Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthVarargs(value: Double*): Self = StObject.set(x, "width", js.Array(value*))
  }
}
