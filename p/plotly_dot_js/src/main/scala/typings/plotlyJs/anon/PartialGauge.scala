package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.angular
import typings.plotlyJs.plotlyJsStrings.bullet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Gauge> */
trait PartialGauge extends StObject {
  
  var axis: js.UndefOr[PartialAxisAutorange] = js.undefined
  
  var bar: js.UndefOr[PartialGaugeBar] = js.undefined
  
  var bgcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var bordercolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var borderwidth: js.UndefOr[Double] = js.undefined
  
  var shape: js.UndefOr[angular | bullet] = js.undefined
  
  var steps: js.UndefOr[js.Array[Color]] = js.undefined
  
  var threshold: js.UndefOr[PartialThreshold] = js.undefined
}
object PartialGauge {
  
  inline def apply(): PartialGauge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGauge]
  }
  
  extension [Self <: PartialGauge](x: Self) {
    
    inline def setAxis(value: PartialAxisAutorange): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setBar(value: PartialGaugeBar): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    inline def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
    
    inline def setBgcolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    inline def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    inline def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bgcolor", js.Array(value*))
    
    inline def setBordercolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
    
    inline def setBordercolorUndefined: Self = StObject.set(x, "bordercolor", js.undefined)
    
    inline def setBordercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bordercolor", js.Array(value*))
    
    inline def setBorderwidth(value: Double): Self = StObject.set(x, "borderwidth", value.asInstanceOf[js.Any])
    
    inline def setBorderwidthUndefined: Self = StObject.set(x, "borderwidth", js.undefined)
    
    inline def setShape(value: angular | bullet): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSteps(value: js.Array[Color]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    inline def setStepsVarargs(value: Color*): Self = StObject.set(x, "steps", js.Array(value*))
    
    inline def setThreshold(value: PartialThreshold): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
