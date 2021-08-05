package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanoramaOptions extends StObject {
  
  var aroundControl: Boolean
  
  var aroundControlOptions: AroundControlOptions
  
  var logoControl: Boolean
  
  var logoControlOptions: LogoControlOptions
  
  var maxScale: Double
  
  var maxZoom: Double
  
  var minScale: Double
  
  var minZoom: Double
  
  var panoId: String
  
  var position: LatLng | LatLngLiteral
  
  var pov: PanoramaPov
  
  var size: Size | SizeLiteral
  
  var visible: Boolean
  
  var zoomControl: Boolean
  
  var zoomControlOptions: ZoomControlOptions
}
object PanoramaOptions {
  
  inline def apply(
    aroundControl: Boolean,
    aroundControlOptions: AroundControlOptions,
    logoControl: Boolean,
    logoControlOptions: LogoControlOptions,
    maxScale: Double,
    maxZoom: Double,
    minScale: Double,
    minZoom: Double,
    panoId: String,
    position: LatLng | LatLngLiteral,
    pov: PanoramaPov,
    size: Size | SizeLiteral,
    visible: Boolean,
    zoomControl: Boolean,
    zoomControlOptions: ZoomControlOptions
  ): PanoramaOptions = {
    val __obj = js.Dynamic.literal(aroundControl = aroundControl.asInstanceOf[js.Any], aroundControlOptions = aroundControlOptions.asInstanceOf[js.Any], logoControl = logoControl.asInstanceOf[js.Any], logoControlOptions = logoControlOptions.asInstanceOf[js.Any], maxScale = maxScale.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], minScale = minScale.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], panoId = panoId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], pov = pov.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], zoomControl = zoomControl.asInstanceOf[js.Any], zoomControlOptions = zoomControlOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramaOptions]
  }
  
  extension [Self <: PanoramaOptions](x: Self) {
    
    inline def setAroundControl(value: Boolean): Self = StObject.set(x, "aroundControl", value.asInstanceOf[js.Any])
    
    inline def setAroundControlOptions(value: AroundControlOptions): Self = StObject.set(x, "aroundControlOptions", value.asInstanceOf[js.Any])
    
    inline def setLogoControl(value: Boolean): Self = StObject.set(x, "logoControl", value.asInstanceOf[js.Any])
    
    inline def setLogoControlOptions(value: LogoControlOptions): Self = StObject.set(x, "logoControlOptions", value.asInstanceOf[js.Any])
    
    inline def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setPanoId(value: String): Self = StObject.set(x, "panoId", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: LatLng | LatLngLiteral): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPov(value: PanoramaPov): Self = StObject.set(x, "pov", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Size | SizeLiteral): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setZoomControl(value: Boolean): Self = StObject.set(x, "zoomControl", value.asInstanceOf[js.Any])
    
    inline def setZoomControlOptions(value: ZoomControlOptions): Self = StObject.set(x, "zoomControlOptions", value.asInstanceOf[js.Any])
  }
}
