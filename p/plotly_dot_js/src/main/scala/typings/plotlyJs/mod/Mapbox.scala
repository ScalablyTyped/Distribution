package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialDomain
import typings.plotlyJs.anon.PartialMapboxCenter
import typings.plotlyJs.anon.PartialMapboxLayersCircle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mapbox extends js.Object {
  
  var accesstoken: String = js.native
  
  var bearing: Double = js.native
  
  var center: PartialMapboxCenter = js.native
  
  var domain: PartialDomain = js.native
  
  var layers: js.Array[PartialMapboxLayersCircle] = js.native
  
  var pitch: Double = js.native
  
  var style: Double | String = js.native
  
  var uirevision: Double | String = js.native
  
  var zoom: Double = js.native
}
object Mapbox {
  
  @scala.inline
  def apply(
    accesstoken: String,
    bearing: Double,
    center: PartialMapboxCenter,
    domain: PartialDomain,
    layers: js.Array[PartialMapboxLayersCircle],
    pitch: Double,
    style: Double | String,
    uirevision: Double | String,
    zoom: Double
  ): Mapbox = {
    val __obj = js.Dynamic.literal(accesstoken = accesstoken.asInstanceOf[js.Any], bearing = bearing.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], uirevision = uirevision.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mapbox]
  }
  
  @scala.inline
  implicit class MapboxOps[Self <: Mapbox] (val x: Self) extends AnyVal {
    
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
    def setAccesstoken(value: String): Self = this.set("accesstoken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBearing(value: Double): Self = this.set("bearing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenter(value: PartialMapboxCenter): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: PartialDomain): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersVarargs(value: PartialMapboxLayersCircle*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: js.Array[PartialMapboxLayersCircle]): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitch(value: Double): Self = this.set("pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Double | String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUirevision(value: Double | String): Self = this.set("uirevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
  }
}
