package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialDomain
import typings.plotlyJs.anon.PartialMapboxCenter
import typings.plotlyJs.anon.PartialMapboxLayersCircle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mapbox extends StObject {
  
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
  implicit class MapboxMutableBuilder[Self <: Mapbox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccesstoken(value: String): Self = StObject.set(x, "accesstoken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenter(value: PartialMapboxCenter): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: PartialDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayers(value: js.Array[PartialMapboxLayersCircle]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersVarargs(value: PartialMapboxLayersCircle*): Self = StObject.set(x, "layers", js.Array(value :_*))
    
    @scala.inline
    def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Double | String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUirevision(value: Double | String): Self = StObject.set(x, "uirevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
