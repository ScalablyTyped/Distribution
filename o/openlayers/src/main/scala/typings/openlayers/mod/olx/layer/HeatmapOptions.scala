package typings.openlayers.mod.olx.layer

import typings.openlayers.mod.Extent_
import typings.openlayers.mod.Feature
import typings.openlayers.mod.source.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeatmapOptions extends js.Object {
  
  var blur: js.UndefOr[Double] = js.native
  
  var extent: js.UndefOr[Extent_] = js.native
  
  var gradient: js.UndefOr[js.Array[String]] = js.native
  
  var maxResolution: js.UndefOr[Double] = js.native
  
  var minResolution: js.UndefOr[Double] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  var shadow: js.UndefOr[Double] = js.native
  
  var source: Vector = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var weight: String | (js.Function1[/* feature */ Feature, Double]) = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object HeatmapOptions {
  
  @scala.inline
  def apply(source: Vector, weight: String | (js.Function1[/* feature */ Feature, Double])): HeatmapOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapOptions]
  }
  
  @scala.inline
  implicit class HeatmapOptionsOps[Self <: HeatmapOptions] (val x: Self) extends AnyVal {
    
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
    def setSource(value: Vector): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightFunction1(value: /* feature */ Feature => Double): Self = this.set("weight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWeight(value: String | (js.Function1[/* feature */ Feature, Double])): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlur(value: Double): Self = this.set("blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
    
    @scala.inline
    def setExtent(value: Extent_): Self = this.set("extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    
    @scala.inline
    def setGradientVarargs(value: String*): Self = this.set("gradient", js.Array(value :_*))
    
    @scala.inline
    def setGradient(value: js.Array[String]): Self = this.set("gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradient: Self = this.set("gradient", js.undefined)
    
    @scala.inline
    def setMaxResolution(value: Double): Self = this.set("maxResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResolution: Self = this.set("maxResolution", js.undefined)
    
    @scala.inline
    def setMinResolution(value: Double): Self = this.set("minResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinResolution: Self = this.set("minResolution", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setShadow(value: Double): Self = this.set("shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
