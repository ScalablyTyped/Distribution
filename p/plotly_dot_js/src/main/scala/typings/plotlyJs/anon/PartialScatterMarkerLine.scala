package typings.plotlyJs.anon

import typings.plotlyJs.mod.ColorScale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.ScatterMarkerLine> */
@js.native
trait PartialScatterMarkerLine extends js.Object {
  
  var autocolorscale: js.UndefOr[Boolean] = js.native
  
  var cauto: js.UndefOr[Boolean] = js.native
  
  var cmax: js.UndefOr[Double] = js.native
  
  var cmin: js.UndefOr[Double] = js.native
  
  var color: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  
  var colorscale: js.UndefOr[ColorScale] = js.native
  
  var reversescale: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double | js.Array[Double]] = js.native
}
object PartialScatterMarkerLine {
  
  @scala.inline
  def apply(): PartialScatterMarkerLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScatterMarkerLine]
  }
  
  @scala.inline
  implicit class PartialScatterMarkerLineOps[Self <: PartialScatterMarkerLine] (val x: Self) extends AnyVal {
    
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
    def setAutocolorscale(value: Boolean): Self = this.set("autocolorscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutocolorscale: Self = this.set("autocolorscale", js.undefined)
    
    @scala.inline
    def setCauto(value: Boolean): Self = this.set("cauto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCauto: Self = this.set("cauto", js.undefined)
    
    @scala.inline
    def setCmax(value: Double): Self = this.set("cmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCmax: Self = this.set("cmax", js.undefined)
    
    @scala.inline
    def setCmin(value: Double): Self = this.set("cmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCmin: Self = this.set("cmin", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("color", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: typings.plotlyJs.mod.Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorscaleVarargs(value: (String | (js.Tuple2[Double, String]))*): Self = this.set("colorscale", js.Array(value :_*))
    
    @scala.inline
    def setColorscale(value: ColorScale): Self = this.set("colorscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorscale: Self = this.set("colorscale", js.undefined)
    
    @scala.inline
    def setReversescale(value: Boolean): Self = this.set("reversescale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReversescale: Self = this.set("reversescale", js.undefined)
    
    @scala.inline
    def setWidthVarargs(value: Double*): Self = this.set("width", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: Double | js.Array[Double]): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
