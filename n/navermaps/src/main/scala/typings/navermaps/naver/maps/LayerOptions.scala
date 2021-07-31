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
  
  @scala.inline
  def apply(hd: Boolean): LayerOptions = {
    val __obj = js.Dynamic.literal(hd = hd.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerOptions]
  }
  
  @scala.inline
  implicit class LayerOptionsMutableBuilder[Self <: LayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHd(value: Boolean): Self = StObject.set(x, "hd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayMap(value: Boolean): Self = StObject.set(x, "overlayMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayMapUndefined: Self = StObject.set(x, "overlayMap", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
