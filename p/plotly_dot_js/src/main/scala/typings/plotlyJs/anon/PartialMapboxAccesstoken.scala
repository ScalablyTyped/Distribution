package typings.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Mapbox> */
trait PartialMapboxAccesstoken extends StObject {
  
  var accesstoken: js.UndefOr[String] = js.undefined
  
  var bearing: js.UndefOr[Double] = js.undefined
  
  var center: js.UndefOr[PartialMapboxCenter] = js.undefined
  
  var domain: js.UndefOr[PartialDomain] = js.undefined
  
  var layers: js.UndefOr[js.Array[PartialMapboxLayersBelow]] = js.undefined
  
  var pitch: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[Double | String] = js.undefined
  
  var uirevision: js.UndefOr[Double | String] = js.undefined
  
  var zoom: js.UndefOr[Double] = js.undefined
}
object PartialMapboxAccesstoken {
  
  inline def apply(): PartialMapboxAccesstoken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMapboxAccesstoken]
  }
  
  extension [Self <: PartialMapboxAccesstoken](x: Self) {
    
    inline def setAccesstoken(value: String): Self = StObject.set(x, "accesstoken", value.asInstanceOf[js.Any])
    
    inline def setAccesstokenUndefined: Self = StObject.set(x, "accesstoken", js.undefined)
    
    inline def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
    
    inline def setBearingUndefined: Self = StObject.set(x, "bearing", js.undefined)
    
    inline def setCenter(value: PartialMapboxCenter): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setDomain(value: PartialDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setLayers(value: js.Array[PartialMapboxLayersBelow]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: PartialMapboxLayersBelow*): Self = StObject.set(x, "layers", js.Array(value*))
    
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
