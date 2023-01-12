package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GestureSettings extends StObject {
  
  var clickToZoom: js.UndefOr[Boolean] = js.undefined
  
  var dblClickToZoom: js.UndefOr[Boolean] = js.undefined
  
  var dragToPan: js.UndefOr[Boolean] = js.undefined
  
  var flickEnabled: js.UndefOr[Boolean] = js.undefined
  
  var flickMinSpeed: js.UndefOr[Double] = js.undefined
  
  var flickMomentum: js.UndefOr[Double] = js.undefined
  
  var pinchToZoom: js.UndefOr[Boolean] = js.undefined
  
  var scrollToZoom: js.UndefOr[Boolean] = js.undefined
}
object GestureSettings {
  
  inline def apply(): GestureSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GestureSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GestureSettings] (val x: Self) extends AnyVal {
    
    inline def setClickToZoom(value: Boolean): Self = StObject.set(x, "clickToZoom", value.asInstanceOf[js.Any])
    
    inline def setClickToZoomUndefined: Self = StObject.set(x, "clickToZoom", js.undefined)
    
    inline def setDblClickToZoom(value: Boolean): Self = StObject.set(x, "dblClickToZoom", value.asInstanceOf[js.Any])
    
    inline def setDblClickToZoomUndefined: Self = StObject.set(x, "dblClickToZoom", js.undefined)
    
    inline def setDragToPan(value: Boolean): Self = StObject.set(x, "dragToPan", value.asInstanceOf[js.Any])
    
    inline def setDragToPanUndefined: Self = StObject.set(x, "dragToPan", js.undefined)
    
    inline def setFlickEnabled(value: Boolean): Self = StObject.set(x, "flickEnabled", value.asInstanceOf[js.Any])
    
    inline def setFlickEnabledUndefined: Self = StObject.set(x, "flickEnabled", js.undefined)
    
    inline def setFlickMinSpeed(value: Double): Self = StObject.set(x, "flickMinSpeed", value.asInstanceOf[js.Any])
    
    inline def setFlickMinSpeedUndefined: Self = StObject.set(x, "flickMinSpeed", js.undefined)
    
    inline def setFlickMomentum(value: Double): Self = StObject.set(x, "flickMomentum", value.asInstanceOf[js.Any])
    
    inline def setFlickMomentumUndefined: Self = StObject.set(x, "flickMomentum", js.undefined)
    
    inline def setPinchToZoom(value: Boolean): Self = StObject.set(x, "pinchToZoom", value.asInstanceOf[js.Any])
    
    inline def setPinchToZoomUndefined: Self = StObject.set(x, "pinchToZoom", js.undefined)
    
    inline def setScrollToZoom(value: Boolean): Self = StObject.set(x, "scrollToZoom", value.asInstanceOf[js.Any])
    
    inline def setScrollToZoomUndefined: Self = StObject.set(x, "scrollToZoom", js.undefined)
  }
}
