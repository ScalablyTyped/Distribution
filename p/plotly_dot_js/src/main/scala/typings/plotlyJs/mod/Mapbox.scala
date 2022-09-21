package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialDomain
import typings.plotlyJs.anon.PartialMapboxCenter
import typings.plotlyJs.anon.PartialMapboxLayersCircle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mapbox extends StObject {
  
  var accesstoken: String
  
  var bearing: Double
  
  var center: PartialMapboxCenter
  
  var domain: PartialDomain
  
  var layers: js.Array[PartialMapboxLayersCircle]
  
  var pitch: Double
  
  var style: Double | String
  
  var uirevision: Double | String
  
  var zoom: Double
}
object Mapbox {
  
  inline def apply(
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
  
  extension [Self <: Mapbox](x: Self) {
    
    inline def setAccesstoken(value: String): Self = StObject.set(x, "accesstoken", value.asInstanceOf[js.Any])
    
    inline def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
    
    inline def setCenter(value: PartialMapboxCenter): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setDomain(value: PartialDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setLayers(value: js.Array[PartialMapboxLayersCircle]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersVarargs(value: PartialMapboxLayersCircle*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Double | String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setUirevision(value: Double | String): Self = StObject.set(x, "uirevision", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
