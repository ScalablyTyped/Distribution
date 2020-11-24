package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialAxis
import typings.plotlyJs.anon.PartialGaugeBar
import typings.plotlyJs.anon.PartialThreshold
import typings.plotlyJs.plotlyJsStrings.angular
import typings.plotlyJs.plotlyJsStrings.bullet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gauge extends js.Object {
  
  var axis: PartialAxis = js.native
  
  var bar: PartialGaugeBar = js.native
  
  var bgcolor: Color = js.native
  
  var bordercolor: Color = js.native
  
  var borderwidth: Double = js.native
  
  var shape: angular | bullet = js.native
  
  var steps: js.Array[typings.plotlyJs.anon.Color] = js.native
  
  var threshold: PartialThreshold = js.native
}
object Gauge {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class GaugeOps[Self <: Gauge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAxis(value: PartialAxis): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBar(value: PartialGaugeBar): Self = this.set("bar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("bgcolor", js.Array(value :_*))
    
    @scala.inline
    def setBgcolor(value: Color): Self = this.set("bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("bordercolor", js.Array(value :_*))
    
    @scala.inline
    def setBordercolor(value: Color): Self = this.set("bordercolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderwidth(value: Double): Self = this.set("borderwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape(value: angular | bullet): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsVarargs(value: typings.plotlyJs.anon.Color*): Self = this.set("steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: js.Array[typings.plotlyJs.anon.Color]): Self = this.set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreshold(value: PartialThreshold): Self = this.set("threshold", value.asInstanceOf[js.Any])
  }
}
