package typings.overlayscrollbars.mod

import typings.overlayscrollbars.anon.I
import typings.overlayscrollbars.anon.X
import typings.overlayscrollbars.anon.XBoolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Globals extends StObject {
  
  var autoUpdateLoop: Boolean
  
  var autoUpdateRecommended: Boolean
  
  var cssCalc: String | Null
  
  var nativeScrollbarIsOverlaid: XBoolean
  
  var nativeScrollbarSize: X
  
  var nativeScrollbarStyling: Boolean
  
  var overlayScrollbarDummySize: X
  
  var restrictedMeasuring: Boolean
  
  var rtlScrollBehavior: I
  
  var supportMutationObserver: Boolean
  
  var supportPassiveEvents: Boolean
  
  var supportResizeObserver: Boolean
  
  var supportTransform: Boolean
  
  var supportTransition: Boolean
}
object Globals {
  
  inline def apply(
    autoUpdateLoop: Boolean,
    autoUpdateRecommended: Boolean,
    nativeScrollbarIsOverlaid: XBoolean,
    nativeScrollbarSize: X,
    nativeScrollbarStyling: Boolean,
    overlayScrollbarDummySize: X,
    restrictedMeasuring: Boolean,
    rtlScrollBehavior: I,
    supportMutationObserver: Boolean,
    supportPassiveEvents: Boolean,
    supportResizeObserver: Boolean,
    supportTransform: Boolean,
    supportTransition: Boolean
  ): Globals = {
    val __obj = js.Dynamic.literal(autoUpdateLoop = autoUpdateLoop.asInstanceOf[js.Any], autoUpdateRecommended = autoUpdateRecommended.asInstanceOf[js.Any], nativeScrollbarIsOverlaid = nativeScrollbarIsOverlaid.asInstanceOf[js.Any], nativeScrollbarSize = nativeScrollbarSize.asInstanceOf[js.Any], nativeScrollbarStyling = nativeScrollbarStyling.asInstanceOf[js.Any], overlayScrollbarDummySize = overlayScrollbarDummySize.asInstanceOf[js.Any], restrictedMeasuring = restrictedMeasuring.asInstanceOf[js.Any], rtlScrollBehavior = rtlScrollBehavior.asInstanceOf[js.Any], supportMutationObserver = supportMutationObserver.asInstanceOf[js.Any], supportPassiveEvents = supportPassiveEvents.asInstanceOf[js.Any], supportResizeObserver = supportResizeObserver.asInstanceOf[js.Any], supportTransform = supportTransform.asInstanceOf[js.Any], supportTransition = supportTransition.asInstanceOf[js.Any], cssCalc = null)
    __obj.asInstanceOf[Globals]
  }
  
  extension [Self <: Globals](x: Self) {
    
    inline def setAutoUpdateLoop(value: Boolean): Self = StObject.set(x, "autoUpdateLoop", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdateRecommended(value: Boolean): Self = StObject.set(x, "autoUpdateRecommended", value.asInstanceOf[js.Any])
    
    inline def setCssCalc(value: String): Self = StObject.set(x, "cssCalc", value.asInstanceOf[js.Any])
    
    inline def setCssCalcNull: Self = StObject.set(x, "cssCalc", null)
    
    inline def setNativeScrollbarIsOverlaid(value: XBoolean): Self = StObject.set(x, "nativeScrollbarIsOverlaid", value.asInstanceOf[js.Any])
    
    inline def setNativeScrollbarSize(value: X): Self = StObject.set(x, "nativeScrollbarSize", value.asInstanceOf[js.Any])
    
    inline def setNativeScrollbarStyling(value: Boolean): Self = StObject.set(x, "nativeScrollbarStyling", value.asInstanceOf[js.Any])
    
    inline def setOverlayScrollbarDummySize(value: X): Self = StObject.set(x, "overlayScrollbarDummySize", value.asInstanceOf[js.Any])
    
    inline def setRestrictedMeasuring(value: Boolean): Self = StObject.set(x, "restrictedMeasuring", value.asInstanceOf[js.Any])
    
    inline def setRtlScrollBehavior(value: I): Self = StObject.set(x, "rtlScrollBehavior", value.asInstanceOf[js.Any])
    
    inline def setSupportMutationObserver(value: Boolean): Self = StObject.set(x, "supportMutationObserver", value.asInstanceOf[js.Any])
    
    inline def setSupportPassiveEvents(value: Boolean): Self = StObject.set(x, "supportPassiveEvents", value.asInstanceOf[js.Any])
    
    inline def setSupportResizeObserver(value: Boolean): Self = StObject.set(x, "supportResizeObserver", value.asInstanceOf[js.Any])
    
    inline def setSupportTransform(value: Boolean): Self = StObject.set(x, "supportTransform", value.asInstanceOf[js.Any])
    
    inline def setSupportTransition(value: Boolean): Self = StObject.set(x, "supportTransition", value.asInstanceOf[js.Any])
  }
}
