package typings.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScatterMarkerLine extends StObject {
  
  var autocolorscale: Boolean
  
  var cauto: Boolean
  
  var cmax: Double
  
  var cmin: Double
  
  var color: Color
  
  var colorscale: ColorScale
  
  var reversescale: Boolean
  
  var width: Double | js.Array[Double]
}
object ScatterMarkerLine {
  
  @scala.inline
  def apply(
    autocolorscale: Boolean,
    cauto: Boolean,
    cmax: Double,
    cmin: Double,
    color: Color,
    colorscale: ColorScale,
    reversescale: Boolean,
    width: Double | js.Array[Double]
  ): ScatterMarkerLine = {
    val __obj = js.Dynamic.literal(autocolorscale = autocolorscale.asInstanceOf[js.Any], cauto = cauto.asInstanceOf[js.Any], cmax = cmax.asInstanceOf[js.Any], cmin = cmin.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], colorscale = colorscale.asInstanceOf[js.Any], reversescale = reversescale.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterMarkerLine]
  }
  
  @scala.inline
  implicit class ScatterMarkerLineMutableBuilder[Self <: ScatterMarkerLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutocolorscale(value: Boolean): Self = StObject.set(x, "autocolorscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCauto(value: Boolean): Self = StObject.set(x, "cauto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmax(value: Double): Self = StObject.set(x, "cmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmin(value: Double): Self = StObject.set(x, "cmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setColorscale(value: ColorScale): Self = StObject.set(x, "colorscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorscaleVarargs(value: (String | (js.Tuple2[Double, String]))*): Self = StObject.set(x, "colorscale", js.Array(value :_*))
    
    @scala.inline
    def setReversescale(value: Boolean): Self = StObject.set(x, "reversescale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double | js.Array[Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthVarargs(value: Double*): Self = StObject.set(x, "width", js.Array(value :_*))
  }
}
