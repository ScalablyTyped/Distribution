package typings.ol.layerLayerMod

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends js.Object {
  
  var extent: js.UndefOr[Extent] = js.native
  
  var layer: Layer[typings.ol.sourceSourceMod.default] = js.native
  
  var managed: Boolean = js.native
  
  var maxResolution: Double = js.native
  
  var maxZoom: Double = js.native
  
  var minResolution: Double = js.native
  
  var minZoom: Double = js.native
  
  var opacity: Double = js.native
  
  var sourceState: typings.ol.stateMod.State = js.native
  
  var visible: Boolean = js.native
  
  var zIndex: Double = js.native
}
object State {
  
  @scala.inline
  def apply(
    layer: Layer[typings.ol.sourceSourceMod.default],
    managed: Boolean,
    maxResolution: Double,
    maxZoom: Double,
    minResolution: Double,
    minZoom: Double,
    opacity: Double,
    sourceState: typings.ol.stateMod.State,
    visible: Boolean,
    zIndex: Double
  ): State = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], managed = managed.asInstanceOf[js.Any], maxResolution = maxResolution.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], minResolution = minResolution.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], sourceState = sourceState.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    
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
    def setLayer(value: Layer[typings.ol.sourceSourceMod.default]): Self = this.set("layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManaged(value: Boolean): Self = this.set("managed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResolution(value: Double): Self = this.set("maxResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinResolution(value: Double): Self = this.set("minResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceState(value: typings.ol.stateMod.State): Self = this.set("sourceState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtent(value: Extent): Self = this.set("extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
  }
}
