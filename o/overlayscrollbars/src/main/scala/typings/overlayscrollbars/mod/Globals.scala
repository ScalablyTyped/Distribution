package typings.overlayscrollbars.mod

import typings.overlayscrollbars.anon.I
import typings.overlayscrollbars.anon.XBoolean
import typings.overlayscrollbars.anon.XNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Globals extends StObject {
  
  var autoUpdateLoop: Boolean = js.native
  
  var autoUpdateRecommended: Boolean = js.native
  
  var cssCalc: String | Null = js.native
  
  var nativeScrollbarIsOverlaid: XBoolean = js.native
  
  var nativeScrollbarSize: XNumber = js.native
  
  var nativeScrollbarStyling: Boolean = js.native
  
  var overlayScrollbarDummySize: XNumber = js.native
  
  var restrictedMeasuring: Boolean = js.native
  
  var rtlScrollBehavior: I = js.native
  
  var supportMutationObserver: Boolean = js.native
  
  var supportPassiveEvents: Boolean = js.native
  
  var supportResizeObserver: Boolean = js.native
  
  var supportTransform: Boolean = js.native
  
  var supportTransition: Boolean = js.native
}
object Globals {
  
  @scala.inline
  def apply(
    autoUpdateLoop: Boolean,
    autoUpdateRecommended: Boolean,
    nativeScrollbarIsOverlaid: XBoolean,
    nativeScrollbarSize: XNumber,
    nativeScrollbarStyling: Boolean,
    overlayScrollbarDummySize: XNumber,
    restrictedMeasuring: Boolean,
    rtlScrollBehavior: I,
    supportMutationObserver: Boolean,
    supportPassiveEvents: Boolean,
    supportResizeObserver: Boolean,
    supportTransform: Boolean,
    supportTransition: Boolean
  ): Globals = {
    val __obj = js.Dynamic.literal(autoUpdateLoop = autoUpdateLoop.asInstanceOf[js.Any], autoUpdateRecommended = autoUpdateRecommended.asInstanceOf[js.Any], nativeScrollbarIsOverlaid = nativeScrollbarIsOverlaid.asInstanceOf[js.Any], nativeScrollbarSize = nativeScrollbarSize.asInstanceOf[js.Any], nativeScrollbarStyling = nativeScrollbarStyling.asInstanceOf[js.Any], overlayScrollbarDummySize = overlayScrollbarDummySize.asInstanceOf[js.Any], restrictedMeasuring = restrictedMeasuring.asInstanceOf[js.Any], rtlScrollBehavior = rtlScrollBehavior.asInstanceOf[js.Any], supportMutationObserver = supportMutationObserver.asInstanceOf[js.Any], supportPassiveEvents = supportPassiveEvents.asInstanceOf[js.Any], supportResizeObserver = supportResizeObserver.asInstanceOf[js.Any], supportTransform = supportTransform.asInstanceOf[js.Any], supportTransition = supportTransition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Globals]
  }
  
  @scala.inline
  implicit class GlobalsMutableBuilder[Self <: Globals] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoUpdateLoop(value: Boolean): Self = StObject.set(x, "autoUpdateLoop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUpdateRecommended(value: Boolean): Self = StObject.set(x, "autoUpdateRecommended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssCalc(value: String): Self = StObject.set(x, "cssCalc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssCalcNull: Self = StObject.set(x, "cssCalc", null)
    
    @scala.inline
    def setNativeScrollbarIsOverlaid(value: XBoolean): Self = StObject.set(x, "nativeScrollbarIsOverlaid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeScrollbarSize(value: XNumber): Self = StObject.set(x, "nativeScrollbarSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeScrollbarStyling(value: Boolean): Self = StObject.set(x, "nativeScrollbarStyling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayScrollbarDummySize(value: XNumber): Self = StObject.set(x, "overlayScrollbarDummySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictedMeasuring(value: Boolean): Self = StObject.set(x, "restrictedMeasuring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtlScrollBehavior(value: I): Self = StObject.set(x, "rtlScrollBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportMutationObserver(value: Boolean): Self = StObject.set(x, "supportMutationObserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportPassiveEvents(value: Boolean): Self = StObject.set(x, "supportPassiveEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportResizeObserver(value: Boolean): Self = StObject.set(x, "supportResizeObserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportTransform(value: Boolean): Self = StObject.set(x, "supportTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportTransition(value: Boolean): Self = StObject.set(x, "supportTransition", value.asInstanceOf[js.Any])
  }
}
