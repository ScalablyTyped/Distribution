package typings.openlayers.mod.olx

import typings.openlayers.mod.layer.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object literal with options for the {@link ol.Map#forEachFeatureAtPixel} and
  * {@link ol.Map#hasFeatureAtPixel} methods.
  */
@js.native
trait AtPixelOptions extends js.Object {
  
  var hitTolerance: js.UndefOr[Double] = js.native
  
  var layerFilter: js.UndefOr[js.Function1[/* layer */ Layer, Boolean]] = js.native
}
object AtPixelOptions {
  
  @scala.inline
  def apply(): AtPixelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AtPixelOptions]
  }
  
  @scala.inline
  implicit class AtPixelOptionsOps[Self <: AtPixelOptions] (val x: Self) extends AnyVal {
    
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
    def setHitTolerance(value: Double): Self = this.set("hitTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitTolerance: Self = this.set("hitTolerance", js.undefined)
    
    @scala.inline
    def setLayerFilter(value: /* layer */ Layer => Boolean): Self = this.set("layerFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLayerFilter: Self = this.set("layerFilter", js.undefined)
  }
}
