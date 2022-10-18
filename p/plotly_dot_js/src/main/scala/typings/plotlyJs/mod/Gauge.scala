package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialAxisCalendar
import typings.plotlyJs.anon.PartialGaugeBarColor
import typings.plotlyJs.anon.PartialThresholdLine
import typings.plotlyJs.plotlyJsStrings.angular
import typings.plotlyJs.plotlyJsStrings.bullet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gauge extends StObject {
  
  var axis: PartialAxisCalendar
  
  var bar: PartialGaugeBarColor
  
  var bgcolor: Color
  
  var bordercolor: Color
  
  var borderwidth: Double
  
  var shape: angular | bullet
  
  var steps: js.Array[typings.plotlyJs.anon.Color]
  
  var threshold: PartialThresholdLine
}
object Gauge {
  
  inline def apply(
    axis: PartialAxisCalendar,
    bar: PartialGaugeBarColor,
    bgcolor: Color,
    bordercolor: Color,
    borderwidth: Double,
    shape: angular | bullet,
    steps: js.Array[typings.plotlyJs.anon.Color],
    threshold: PartialThresholdLine
  ): Gauge = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], bar = bar.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], borderwidth = borderwidth.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gauge]
  }
  
  extension [Self <: Gauge](x: Self) {
    
    inline def setAxis(value: PartialAxisCalendar): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setBar(value: PartialGaugeBarColor): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    inline def setBgcolor(value: Color): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    inline def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bgcolor", js.Array(value*))
    
    inline def setBordercolor(value: Color): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
    
    inline def setBordercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bordercolor", js.Array(value*))
    
    inline def setBorderwidth(value: Double): Self = StObject.set(x, "borderwidth", value.asInstanceOf[js.Any])
    
    inline def setShape(value: angular | bullet): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: js.Array[typings.plotlyJs.anon.Color]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: typings.plotlyJs.anon.Color*): Self = StObject.set(x, "steps", js.Array(value*))
    
    inline def setThreshold(value: PartialThresholdLine): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
  }
}
