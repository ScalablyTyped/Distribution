package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.angular
import typings.plotlyJs.plotlyJsStrings.bullet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Gauge> */
@js.native
trait PartialGaugeAxis extends js.Object {
  
  var axis: js.UndefOr[PartialAxisCalendar] = js.native
  
  var bar: js.UndefOr[PartialGaugeBarColor] = js.native
  
  var bgcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  
  var bordercolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  
  var borderwidth: js.UndefOr[Double] = js.native
  
  var shape: js.UndefOr[angular | bullet] = js.native
  
  var steps: js.UndefOr[js.Array[Color]] = js.native
  
  var threshold: js.UndefOr[PartialThresholdLine] = js.native
}
object PartialGaugeAxis {
  
  @scala.inline
  def apply(): PartialGaugeAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGaugeAxis]
  }
  
  @scala.inline
  implicit class PartialGaugeAxisOps[Self <: PartialGaugeAxis] (val x: Self) extends AnyVal {
    
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
    def setAxis(value: PartialAxisCalendar): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setBar(value: PartialGaugeBarColor): Self = this.set("bar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBar: Self = this.set("bar", js.undefined)
    
    @scala.inline
    def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("bgcolor", js.Array(value :_*))
    
    @scala.inline
    def setBgcolor(value: typings.plotlyJs.mod.Color): Self = this.set("bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgcolor: Self = this.set("bgcolor", js.undefined)
    
    @scala.inline
    def setBordercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("bordercolor", js.Array(value :_*))
    
    @scala.inline
    def setBordercolor(value: typings.plotlyJs.mod.Color): Self = this.set("bordercolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBordercolor: Self = this.set("bordercolor", js.undefined)
    
    @scala.inline
    def setBorderwidth(value: Double): Self = this.set("borderwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderwidth: Self = this.set("borderwidth", js.undefined)
    
    @scala.inline
    def setShape(value: angular | bullet): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: Color*): Self = this.set("steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: js.Array[Color]): Self = this.set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
    
    @scala.inline
    def setThreshold(value: PartialThresholdLine): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
}
