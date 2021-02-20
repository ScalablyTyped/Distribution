package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanoramaOptions extends StObject {
  
  var aroundControl: Boolean = js.native
  
  var aroundControlOptions: AroundControlOptions = js.native
  
  var logoControl: Boolean = js.native
  
  var logoControlOptions: LogoControlOptions = js.native
  
  var maxScale: Double = js.native
  
  var maxZoom: Double = js.native
  
  var minScale: Double = js.native
  
  var minZoom: Double = js.native
  
  var panoId: String = js.native
  
  var position: LatLng | LatLngLiteral = js.native
  
  var pov: PanoramaPov = js.native
  
  var size: Size | SizeLiteral = js.native
  
  var visible: Boolean = js.native
  
  var zoomControl: Boolean = js.native
  
  var zoomControlOptions: ZoomControlOptions = js.native
}
object PanoramaOptions {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class PanoramaOptionsMutableBuilder[Self <: PanoramaOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAroundControl(value: Boolean): Self = StObject.set(x, "aroundControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAroundControlOptions(value: AroundControlOptions): Self = StObject.set(x, "aroundControlOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoControl(value: Boolean): Self = StObject.set(x, "logoControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoControlOptions(value: LogoControlOptions): Self = StObject.set(x, "logoControlOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanoId(value: String): Self = StObject.set(x, "panoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: LatLng | LatLngLiteral): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPov(value: PanoramaPov): Self = StObject.set(x, "pov", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Size | SizeLiteral): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomControl(value: Boolean): Self = StObject.set(x, "zoomControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomControlOptions(value: ZoomControlOptions): Self = StObject.set(x, "zoomControlOptions", value.asInstanceOf[js.Any])
  }
}
