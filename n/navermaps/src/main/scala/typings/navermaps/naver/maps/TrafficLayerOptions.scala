package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficLayerOptions extends StObject {
  
  var interval: Double
  
  var overlayMap: js.UndefOr[Boolean] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object TrafficLayerOptions {
  
  inline def apply(interval: Double): TrafficLayerOptions = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficLayerOptions]
  }
  
  extension [Self <: TrafficLayerOptions](x: Self) {
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setOverlayMap(value: Boolean): Self = StObject.set(x, "overlayMap", value.asInstanceOf[js.Any])
    
    inline def setOverlayMapUndefined: Self = StObject.set(x, "overlayMap", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
