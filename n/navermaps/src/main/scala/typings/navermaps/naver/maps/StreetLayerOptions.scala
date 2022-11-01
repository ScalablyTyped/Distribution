package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Deprecated!!
// See https://navermaps.github.io/maps.js.ncp/docs/naver.maps.StreetLayer.html#toc15__anchor
trait StreetLayerOptions extends StObject {
  
  var overlayMap: Boolean
  
  var zIndex: Double
}
object StreetLayerOptions {
  
  inline def apply(overlayMap: Boolean, zIndex: Double): StreetLayerOptions = {
    val __obj = js.Dynamic.literal(overlayMap = overlayMap.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreetLayerOptions]
  }
  
  extension [Self <: StreetLayerOptions](x: Self) {
    
    inline def setOverlayMap(value: Boolean): Self = StObject.set(x, "overlayMap", value.asInstanceOf[js.Any])
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
  }
}
