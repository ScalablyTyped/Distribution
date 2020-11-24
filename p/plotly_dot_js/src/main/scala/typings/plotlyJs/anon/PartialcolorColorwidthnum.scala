package typings.plotlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  color :plotly.js.plotly.js.Color,   width :number,   outliercolor :plotly.js.plotly.js.Color,   outlierwidth :number}> */
@js.native
trait PartialcolorColorwidthnum extends js.Object {
  
  var color: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  
  var outliercolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  
  var outlierwidth: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object PartialcolorColorwidthnum {
  
  @scala.inline
  def apply(): PartialcolorColorwidthnum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialcolorColorwidthnum]
  }
  
  @scala.inline
  implicit class PartialcolorColorwidthnumOps[Self <: PartialcolorColorwidthnum] (val x: Self) extends AnyVal {
    
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
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("color", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: typings.plotlyJs.mod.Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setOutliercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("outliercolor", js.Array(value :_*))
    
    @scala.inline
    def setOutliercolor(value: typings.plotlyJs.mod.Color): Self = this.set("outliercolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutliercolor: Self = this.set("outliercolor", js.undefined)
    
    @scala.inline
    def setOutlierwidth(value: Double): Self = this.set("outlierwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlierwidth: Self = this.set("outlierwidth", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
