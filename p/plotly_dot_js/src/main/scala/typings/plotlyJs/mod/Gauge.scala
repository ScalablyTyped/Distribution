package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialAxis
import typings.plotlyJs.anon.PartialGaugeBar
import typings.plotlyJs.anon.PartialThreshold
import typings.plotlyJs.plotlyJsStrings.angular
import typings.plotlyJs.plotlyJsStrings.bullet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gauge extends StObject {
  
  var axis: PartialAxis
  
  var bar: PartialGaugeBar
  
  var bgcolor: Color
  
  var bordercolor: Color
  
  var borderwidth: Double
  
  var shape: angular | bullet
  
  var steps: js.Array[typings.plotlyJs.anon.Color]
  
  var threshold: PartialThreshold
}
object Gauge {
  
  inline def apply(
    axis: PartialAxis,
    bar: PartialGaugeBar,
    bgcolor: Color,
    bordercolor: Color,
    borderwidth: Double,
    shape: angular | bullet,
    steps: js.Array[typings.plotlyJs.anon.Color],
    threshold: PartialThreshold
  ): Gauge = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], bar = bar.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], borderwidth = borderwidth.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gauge]
  }
  
  extension [Self <: Gauge](x: Self) {
    
    inline def setAxis(value: PartialAxis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setBar(value: PartialGaugeBar): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    inline def setBgcolor(value: Color): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    inline def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bgcolor", js.Array(value :_*))
    
    inline def setBordercolor(value: Color): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
    
    inline def setBordercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bordercolor", js.Array(value :_*))
    
    inline def setBorderwidth(value: Double): Self = StObject.set(x, "borderwidth", value.asInstanceOf[js.Any])
    
    inline def setShape(value: angular | bullet): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: js.Array[typings.plotlyJs.anon.Color]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: typings.plotlyJs.anon.Color*): Self = StObject.set(x, "steps", js.Array(value :_*))
    
    inline def setThreshold(value: PartialThreshold): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
  }
}
