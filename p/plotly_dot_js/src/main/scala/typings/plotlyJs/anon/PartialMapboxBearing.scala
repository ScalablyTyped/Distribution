package typings.plotlyJs.anon

import typings.plotlyJs.mod.Domain
import typings.plotlyJs.mod.MapboxCenter
import typings.plotlyJs.mod.MapboxLayers
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Mapbox> */
trait PartialMapboxBearing extends StObject {
  
  var accesstoken: js.UndefOr[String] = js.undefined
  
  var bearing: js.UndefOr[Double] = js.undefined
  
  var center: js.UndefOr[Partial[MapboxCenter]] = js.undefined
  
  var domain: js.UndefOr[Partial[Domain]] = js.undefined
  
  var layers: js.UndefOr[js.Array[Partial[MapboxLayers]]] = js.undefined
  
  var pitch: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[Double | String] = js.undefined
  
  var uirevision: js.UndefOr[Double | String] = js.undefined
  
  var zoom: js.UndefOr[Double] = js.undefined
}
object PartialMapboxBearing {
  
  inline def apply(): PartialMapboxBearing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMapboxBearing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialMapboxBearing] (val x: Self) extends AnyVal {
    
    inline def setAccesstoken(value: String): Self = StObject.set(x, "accesstoken", value.asInstanceOf[js.Any])
    
    inline def setAccesstokenUndefined: Self = StObject.set(x, "accesstoken", js.undefined)
    
    inline def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
    
    inline def setBearingUndefined: Self = StObject.set(x, "bearing", js.undefined)
    
    inline def setCenter(value: Partial[MapboxCenter]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setDomain(value: Partial[Domain]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setLayers(value: js.Array[Partial[MapboxLayers]]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: Partial[MapboxLayers]*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    inline def setStyle(value: Double | String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUirevision(value: Double | String): Self = StObject.set(x, "uirevision", value.asInstanceOf[js.Any])
    
    inline def setUirevisionUndefined: Self = StObject.set(x, "uirevision", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
