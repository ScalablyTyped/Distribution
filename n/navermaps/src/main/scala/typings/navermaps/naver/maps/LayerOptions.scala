package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerOptions extends StObject {
  
  var hd: Boolean
  
  var overlayMap: js.UndefOr[Boolean] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object LayerOptions {
  
  inline def apply(hd: Boolean): LayerOptions = {
    val __obj = js.Dynamic.literal(hd = hd.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerOptions]
  }
  
  extension [Self <: LayerOptions](x: Self) {
    
    inline def setHd(value: Boolean): Self = StObject.set(x, "hd", value.asInstanceOf[js.Any])
    
    inline def setOverlayMap(value: Boolean): Self = StObject.set(x, "overlayMap", value.asInstanceOf[js.Any])
    
    inline def setOverlayMapUndefined: Self = StObject.set(x, "overlayMap", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
