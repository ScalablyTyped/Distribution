package typings.overlayscrollbars.mod

import typings.overlayscrollbars.anon.I
import typings.overlayscrollbars.anon.XBoolean
import typings.overlayscrollbars.anon.XNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Globals extends js.Object {
  
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
  implicit class GlobalsOps[Self <: Globals] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoUpdateLoop(value: Boolean): Self = this.set("autoUpdateLoop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUpdateRecommended(value: Boolean): Self = this.set("autoUpdateRecommended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeScrollbarIsOverlaid(value: XBoolean): Self = this.set("nativeScrollbarIsOverlaid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeScrollbarSize(value: XNumber): Self = this.set("nativeScrollbarSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeScrollbarStyling(value: Boolean): Self = this.set("nativeScrollbarStyling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayScrollbarDummySize(value: XNumber): Self = this.set("overlayScrollbarDummySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictedMeasuring(value: Boolean): Self = this.set("restrictedMeasuring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtlScrollBehavior(value: I): Self = this.set("rtlScrollBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportMutationObserver(value: Boolean): Self = this.set("supportMutationObserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportPassiveEvents(value: Boolean): Self = this.set("supportPassiveEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportResizeObserver(value: Boolean): Self = this.set("supportResizeObserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportTransform(value: Boolean): Self = this.set("supportTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportTransition(value: Boolean): Self = this.set("supportTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssCalc(value: String): Self = this.set("cssCalc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssCalcNull: Self = this.set("cssCalc", null)
  }
}
