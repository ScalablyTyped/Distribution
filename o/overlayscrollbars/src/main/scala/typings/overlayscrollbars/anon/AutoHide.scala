package typings.overlayscrollbars.anon

import typings.overlayscrollbars.mod.AutoHideBehavior
import typings.overlayscrollbars.mod.VisibilityBehavior
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoHide extends StObject {
  
  var autoHide: js.UndefOr[AutoHideBehavior] = js.undefined
  
  var autoHideDelay: js.UndefOr[Double] = js.undefined
  
  var clickScrolling: js.UndefOr[Boolean] = js.undefined
  
  var dragScrolling: js.UndefOr[Boolean] = js.undefined
  
  var snapHandle: js.UndefOr[Boolean] = js.undefined
  
  var touchSupport: js.UndefOr[Boolean] = js.undefined
  
  var visibility: js.UndefOr[VisibilityBehavior] = js.undefined
}
object AutoHide {
  
  inline def apply(): AutoHide = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoHide]
  }
  
  extension [Self <: AutoHide](x: Self) {
    
    inline def setAutoHide(value: AutoHideBehavior): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    inline def setAutoHideDelay(value: Double): Self = StObject.set(x, "autoHideDelay", value.asInstanceOf[js.Any])
    
    inline def setAutoHideDelayUndefined: Self = StObject.set(x, "autoHideDelay", js.undefined)
    
    inline def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
    
    inline def setClickScrolling(value: Boolean): Self = StObject.set(x, "clickScrolling", value.asInstanceOf[js.Any])
    
    inline def setClickScrollingUndefined: Self = StObject.set(x, "clickScrolling", js.undefined)
    
    inline def setDragScrolling(value: Boolean): Self = StObject.set(x, "dragScrolling", value.asInstanceOf[js.Any])
    
    inline def setDragScrollingUndefined: Self = StObject.set(x, "dragScrolling", js.undefined)
    
    inline def setSnapHandle(value: Boolean): Self = StObject.set(x, "snapHandle", value.asInstanceOf[js.Any])
    
    inline def setSnapHandleUndefined: Self = StObject.set(x, "snapHandle", js.undefined)
    
    inline def setTouchSupport(value: Boolean): Self = StObject.set(x, "touchSupport", value.asInstanceOf[js.Any])
    
    inline def setTouchSupportUndefined: Self = StObject.set(x, "touchSupport", js.undefined)
    
    inline def setVisibility(value: VisibilityBehavior): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
