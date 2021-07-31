package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.angular
import typings.plotlyJs.plotlyJsStrings.bullet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Gauge> */
trait PartialGaugeAxis extends StObject {
  
  var axis: js.UndefOr[PartialAxisCalendar] = js.undefined
  
  var bar: js.UndefOr[PartialGaugeBarColor] = js.undefined
  
  var bgcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var bordercolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var borderwidth: js.UndefOr[Double] = js.undefined
  
  var shape: js.UndefOr[angular | bullet] = js.undefined
  
  var steps: js.UndefOr[js.Array[Color]] = js.undefined
  
  var threshold: js.UndefOr[PartialThresholdLine] = js.undefined
}
object PartialGaugeAxis {
  
  @scala.inline
  def apply(): PartialGaugeAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGaugeAxis]
  }
  
  @scala.inline
  implicit class PartialGaugeAxisMutableBuilder[Self <: PartialGaugeAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: PartialAxisCalendar): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setBar(value: PartialGaugeBarColor): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
    
    @scala.inline
    def setBgcolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    @scala.inline
    def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bgcolor", js.Array(value :_*))
    
    @scala.inline
    def setBordercolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordercolorUndefined: Self = StObject.set(x, "bordercolor", js.undefined)
    
    @scala.inline
    def setBordercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bordercolor", js.Array(value :_*))
    
    @scala.inline
    def setBorderwidth(value: Double): Self = StObject.set(x, "borderwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderwidthUndefined: Self = StObject.set(x, "borderwidth", js.undefined)
    
    @scala.inline
    def setShape(value: angular | bullet): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setSteps(value: js.Array[Color]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: Color*): Self = StObject.set(x, "steps", js.Array(value :_*))
    
    @scala.inline
    def setThreshold(value: PartialThresholdLine): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
