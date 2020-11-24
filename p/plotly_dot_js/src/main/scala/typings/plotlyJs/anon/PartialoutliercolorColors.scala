package typings.plotlyJs.anon

import typings.plotlyJs.mod.MarkerSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  outliercolor :plotly.js.plotly.js.Color,   symbol :plotly.js.plotly.js.MarkerSymbol,   opacity :number,   size :number,   color :plotly.js.plotly.js.Color,   line :std.Partial<{  color :plotly.js.plotly.js.Color,   width :number,   outliercolor :plotly.js.plotly.js.Color,   outlierwidth :number}>}> */
@js.native
trait PartialoutliercolorColors extends js.Object {
  
  var color: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  
  var line: js.UndefOr[PartialcolorColorwidthnum] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var outliercolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var symbol: js.UndefOr[MarkerSymbol] = js.native
}
object PartialoutliercolorColors {
  
  @scala.inline
  def apply(): PartialoutliercolorColors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialoutliercolorColors]
  }
  
  @scala.inline
  implicit class PartialoutliercolorColorsOps[Self <: PartialoutliercolorColors] (val x: Self) extends AnyVal {
    
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
    def setLine(value: PartialcolorColorwidthnum): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setOutliercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("outliercolor", js.Array(value :_*))
    
    @scala.inline
    def setOutliercolor(value: typings.plotlyJs.mod.Color): Self = this.set("outliercolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutliercolor: Self = this.set("outliercolor", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSymbolVarargs(value: (String | Double)*): Self = this.set("symbol", js.Array(value :_*))
    
    @scala.inline
    def setSymbol(value: MarkerSymbol): Self = this.set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
  }
}
