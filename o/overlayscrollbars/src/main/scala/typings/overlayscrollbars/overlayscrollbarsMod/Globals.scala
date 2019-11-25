package typings.overlayscrollbars.overlayscrollbarsMod

import typings.overlayscrollbars.Anon_I
import typings.overlayscrollbars.Anon_XYBoolean
import typings.overlayscrollbars.Anon_XYNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Globals extends js.Object {
  var autoUpdateLoop: Boolean
  var autoUpdateRecommended: Boolean
  var cssCalc: String | Null
  var nativeScrollbarIsOverlaid: Anon_XYBoolean
  var nativeScrollbarSize: Anon_XYNumber
  var nativeScrollbarStyling: Boolean
  var overlayScrollbarDummySize: Anon_XYNumber
  var restrictedMeasuring: Boolean
  var rtlScrollBehavior: Anon_I
  var supportMutationObserver: Boolean
  var supportPassiveEvents: Boolean
  var supportResizeObserver: Boolean
  var supportTransform: Boolean
  var supportTransition: Boolean
}

object Globals {
  @scala.inline
  def apply(
    autoUpdateLoop: Boolean,
    autoUpdateRecommended: Boolean,
    nativeScrollbarIsOverlaid: Anon_XYBoolean,
    nativeScrollbarSize: Anon_XYNumber,
    nativeScrollbarStyling: Boolean,
    overlayScrollbarDummySize: Anon_XYNumber,
    restrictedMeasuring: Boolean,
    rtlScrollBehavior: Anon_I,
    supportMutationObserver: Boolean,
    supportPassiveEvents: Boolean,
    supportResizeObserver: Boolean,
    supportTransform: Boolean,
    supportTransition: Boolean,
    cssCalc: String = null
  ): Globals = {
    val __obj = js.Dynamic.literal(autoUpdateLoop = autoUpdateLoop.asInstanceOf[js.Any], autoUpdateRecommended = autoUpdateRecommended.asInstanceOf[js.Any], nativeScrollbarIsOverlaid = nativeScrollbarIsOverlaid.asInstanceOf[js.Any], nativeScrollbarSize = nativeScrollbarSize.asInstanceOf[js.Any], nativeScrollbarStyling = nativeScrollbarStyling.asInstanceOf[js.Any], overlayScrollbarDummySize = overlayScrollbarDummySize.asInstanceOf[js.Any], restrictedMeasuring = restrictedMeasuring.asInstanceOf[js.Any], rtlScrollBehavior = rtlScrollBehavior.asInstanceOf[js.Any], supportMutationObserver = supportMutationObserver.asInstanceOf[js.Any], supportPassiveEvents = supportPassiveEvents.asInstanceOf[js.Any], supportResizeObserver = supportResizeObserver.asInstanceOf[js.Any], supportTransform = supportTransform.asInstanceOf[js.Any], supportTransition = supportTransition.asInstanceOf[js.Any])
    if (cssCalc != null) __obj.updateDynamic("cssCalc")(cssCalc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Globals]
  }
}

