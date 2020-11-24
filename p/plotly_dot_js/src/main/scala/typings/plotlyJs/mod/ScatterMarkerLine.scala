package typings.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScatterMarkerLine extends js.Object {
  
  var autocolorscale: Boolean = js.native
  
  var cauto: Boolean = js.native
  
  var cmax: Double = js.native
  
  var cmin: Double = js.native
  
  var color: Color = js.native
  
  var colorscale: ColorScale = js.native
  
  var reversescale: Boolean = js.native
  
  var width: Double | js.Array[Double] = js.native
}
object ScatterMarkerLine {
  
  @scala.inline
  def apply(
    autocolorscale: Boolean,
    cauto: Boolean,
    cmax: Double,
    cmin: Double,
    color: Color,
    colorscale: ColorScale,
    reversescale: Boolean,
    width: Double | js.Array[Double]
  ): ScatterMarkerLine = {
    val __obj = js.Dynamic.literal(autocolorscale = autocolorscale.asInstanceOf[js.Any], cauto = cauto.asInstanceOf[js.Any], cmax = cmax.asInstanceOf[js.Any], cmin = cmin.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], colorscale = colorscale.asInstanceOf[js.Any], reversescale = reversescale.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterMarkerLine]
  }
  
  @scala.inline
  implicit class ScatterMarkerLineOps[Self <: ScatterMarkerLine] (val x: Self) extends AnyVal {
    
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
    def setCauto(value: Boolean): Self = this.set("cauto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmax(value: Double): Self = this.set("cmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmin(value: Double): Self = this.set("cmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("color", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorscaleVarargs(value: (String | (js.Tuple2[Double, String]))*): Self = this.set("colorscale", js.Array(value :_*))
    
    @scala.inline
    def setColorscale(value: ColorScale): Self = this.set("colorscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversescale(value: Boolean): Self = this.set("reversescale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthVarargs(value: Double*): Self = this.set("width", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: Double | js.Array[Double]): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
