package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CadastralLayerOptions extends StObject {
  
  var overlayMap: js.UndefOr[Boolean] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object CadastralLayerOptions {
  
  inline def apply(): CadastralLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CadastralLayerOptions]
  }
  
  extension [Self <: CadastralLayerOptions](x: Self) {
    
    inline def setOverlayMap(value: Boolean): Self = StObject.set(x, "overlayMap", value.asInstanceOf[js.Any])
    
    inline def setOverlayMapUndefined: Self = StObject.set(x, "overlayMap", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
