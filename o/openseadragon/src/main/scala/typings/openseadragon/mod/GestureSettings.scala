package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GestureSettings extends StObject {
  
  var clickToZoom: js.UndefOr[Boolean] = js.undefined
  
  var dblClickToZoom: js.UndefOr[Boolean] = js.undefined
  
  var flickEnabled: js.UndefOr[Boolean] = js.undefined
  
  var flickMinSpeed: js.UndefOr[Double] = js.undefined
  
  var flickMomentum: js.UndefOr[Double] = js.undefined
  
  var pinchToZoom: js.UndefOr[Boolean] = js.undefined
  
  var scrollToZoom: js.UndefOr[Boolean] = js.undefined
}
object GestureSettings {
  
  @scala.inline
  def apply(): GestureSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GestureSettings]
  }
  
  @scala.inline
  implicit class GestureSettingsMutableBuilder[Self <: GestureSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClickToZoom(value: Boolean): Self = StObject.set(x, "clickToZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickToZoomUndefined: Self = StObject.set(x, "clickToZoom", js.undefined)
    
    @scala.inline
    def setDblClickToZoom(value: Boolean): Self = StObject.set(x, "dblClickToZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblClickToZoomUndefined: Self = StObject.set(x, "dblClickToZoom", js.undefined)
    
    @scala.inline
    def setFlickEnabled(value: Boolean): Self = StObject.set(x, "flickEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlickEnabledUndefined: Self = StObject.set(x, "flickEnabled", js.undefined)
    
    @scala.inline
    def setFlickMinSpeed(value: Double): Self = StObject.set(x, "flickMinSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlickMinSpeedUndefined: Self = StObject.set(x, "flickMinSpeed", js.undefined)
    
    @scala.inline
    def setFlickMomentum(value: Double): Self = StObject.set(x, "flickMomentum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlickMomentumUndefined: Self = StObject.set(x, "flickMomentum", js.undefined)
    
    @scala.inline
    def setPinchToZoom(value: Boolean): Self = StObject.set(x, "pinchToZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinchToZoomUndefined: Self = StObject.set(x, "pinchToZoom", js.undefined)
    
    @scala.inline
    def setScrollToZoom(value: Boolean): Self = StObject.set(x, "scrollToZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollToZoomUndefined: Self = StObject.set(x, "scrollToZoom", js.undefined)
  }
}
