package typings.openlayers.mod.olx.layer

import typings.openlayers.mod.Extent_
import typings.openlayers.mod.Feature
import typings.openlayers.mod.Map
import typings.openlayers.mod.StyleFunction
import typings.openlayers.mod.source.Vector
import typings.openlayers.mod.style.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorOptions extends js.Object {
  
  var declutter: js.UndefOr[Boolean] = js.native
  
  var extent: js.UndefOr[Extent_] = js.native
  
  var map: js.UndefOr[Map] = js.native
  
  var maxResolution: js.UndefOr[Double] = js.native
  
  var minResolution: js.UndefOr[Double] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var renderBuffer: js.UndefOr[Double] = js.native
  
  var renderMode: js.UndefOr[VectorRenderType | String] = js.native
  
  var renderOrder: js.UndefOr[js.Function2[/* feature1 */ Feature, /* feature2 */ Feature, Double]] = js.native
  
  var source: Vector = js.native
  
  var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.native
  
  var updateWhileAnimating: js.UndefOr[Boolean] = js.native
  
  var updateWhileInteracting: js.UndefOr[Boolean] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object VectorOptions {
  
  @scala.inline
  def apply(source: Vector): VectorOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorOptions]
  }
  
  @scala.inline
  implicit class VectorOptionsOps[Self <: VectorOptions] (val x: Self) extends AnyVal {
    
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
    def setDeclutter(value: Boolean): Self = this.set("declutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeclutter: Self = this.set("declutter", js.undefined)
    
    @scala.inline
    def setExtent(value: Extent_): Self = this.set("extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    
    @scala.inline
    def setMap(value: Map): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
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
    def setRenderBuffer(value: Double): Self = this.set("renderBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderBuffer: Self = this.set("renderBuffer", js.undefined)
    
    @scala.inline
    def setRenderMode(value: VectorRenderType | String): Self = this.set("renderMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderMode: Self = this.set("renderMode", js.undefined)
    
    @scala.inline
    def setRenderOrder(value: (/* feature1 */ Feature, /* feature2 */ Feature) => Double): Self = this.set("renderOrder", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRenderOrder: Self = this.set("renderOrder", js.undefined)
    
    @scala.inline
    def setStyleFunction2(
      value: (/* feature */ Feature | typings.openlayers.mod.render.Feature, /* resolution */ Double) => Style | js.Array[Style] | Null
    ): Self = this.set("style", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStyleVarargs(value: Style*): Self = this.set("style", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: Style | js.Array[Style] | StyleFunction): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setUpdateWhileAnimating(value: Boolean): Self = this.set("updateWhileAnimating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateWhileAnimating: Self = this.set("updateWhileAnimating", js.undefined)
    
    @scala.inline
    def setUpdateWhileInteracting(value: Boolean): Self = this.set("updateWhileInteracting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateWhileInteracting: Self = this.set("updateWhileInteracting", js.undefined)
    
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
