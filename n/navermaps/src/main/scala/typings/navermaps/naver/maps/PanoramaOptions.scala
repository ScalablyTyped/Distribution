package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanoramaOptions extends StObject {
  
  var aroundControl: js.UndefOr[Boolean] = js.undefined
  
  var aroundControlOptions: js.UndefOr[AroundControlOptions] = js.undefined
  
  var flightSpot: js.UndefOr[Boolean] = js.undefined
  
  var logoControl: js.UndefOr[Boolean] = js.undefined
  
  var logoControlOptions: js.UndefOr[LogoControlOptions] = js.undefined
  
  var maxScale: js.UndefOr[Double] = js.undefined
  
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  var minScale: js.UndefOr[Double] = js.undefined
  
  var minZoom: js.UndefOr[Double] = js.undefined
  
  var panoId: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  
  var pov: js.UndefOr[PanoramaPov] = js.undefined
  
  var size: js.UndefOr[Size | SizeLiteral] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var zoomControl: js.UndefOr[Boolean] = js.undefined
  
  var zoomControlOptions: js.UndefOr[ZoomControlOptions] = js.undefined
}
object PanoramaOptions {
  
  inline def apply(): PanoramaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanoramaOptions]
  }
  
  extension [Self <: PanoramaOptions](x: Self) {
    
    inline def setAroundControl(value: Boolean): Self = StObject.set(x, "aroundControl", value.asInstanceOf[js.Any])
    
    inline def setAroundControlOptions(value: AroundControlOptions): Self = StObject.set(x, "aroundControlOptions", value.asInstanceOf[js.Any])
    
    inline def setAroundControlOptionsUndefined: Self = StObject.set(x, "aroundControlOptions", js.undefined)
    
    inline def setAroundControlUndefined: Self = StObject.set(x, "aroundControl", js.undefined)
    
    inline def setFlightSpot(value: Boolean): Self = StObject.set(x, "flightSpot", value.asInstanceOf[js.Any])
    
    inline def setFlightSpotUndefined: Self = StObject.set(x, "flightSpot", js.undefined)
    
    inline def setLogoControl(value: Boolean): Self = StObject.set(x, "logoControl", value.asInstanceOf[js.Any])
    
    inline def setLogoControlOptions(value: LogoControlOptions): Self = StObject.set(x, "logoControlOptions", value.asInstanceOf[js.Any])
    
    inline def setLogoControlOptionsUndefined: Self = StObject.set(x, "logoControlOptions", js.undefined)
    
    inline def setLogoControlUndefined: Self = StObject.set(x, "logoControl", js.undefined)
    
    inline def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
    
    inline def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
    
    inline def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    inline def setPanoId(value: String): Self = StObject.set(x, "panoId", value.asInstanceOf[js.Any])
    
    inline def setPanoIdUndefined: Self = StObject.set(x, "panoId", js.undefined)
    
    inline def setPosition(value: LatLng | LatLngLiteral): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setPov(value: PanoramaPov): Self = StObject.set(x, "pov", value.asInstanceOf[js.Any])
    
    inline def setPovUndefined: Self = StObject.set(x, "pov", js.undefined)
    
    inline def setSize(value: Size | SizeLiteral): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setZoomControl(value: Boolean): Self = StObject.set(x, "zoomControl", value.asInstanceOf[js.Any])
    
    inline def setZoomControlOptions(value: ZoomControlOptions): Self = StObject.set(x, "zoomControlOptions", value.asInstanceOf[js.Any])
    
    inline def setZoomControlOptionsUndefined: Self = StObject.set(x, "zoomControlOptions", js.undefined)
    
    inline def setZoomControlUndefined: Self = StObject.set(x, "zoomControl", js.undefined)
  }
}
