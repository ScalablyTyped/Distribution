package typings.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  color :plotly.js.plotly.js.Color,   width :number,   outliercolor :plotly.js.plotly.js.Color,   outlierwidth :number}> */
trait PartialcolorColorwidthnum extends StObject {
  
  var color: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var outliercolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var outlierwidth: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object PartialcolorColorwidthnum {
  
  inline def apply(): PartialcolorColorwidthnum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialcolorColorwidthnum]
  }
  
  extension [Self <: PartialcolorColorwidthnum](x: Self) {
    
    inline def setColor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    inline def setOutliercolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "outliercolor", value.asInstanceOf[js.Any])
    
    inline def setOutliercolorUndefined: Self = StObject.set(x, "outliercolor", js.undefined)
    
    inline def setOutliercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "outliercolor", js.Array(value :_*))
    
    inline def setOutlierwidth(value: Double): Self = StObject.set(x, "outlierwidth", value.asInstanceOf[js.Any])
    
    inline def setOutlierwidthUndefined: Self = StObject.set(x, "outlierwidth", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
