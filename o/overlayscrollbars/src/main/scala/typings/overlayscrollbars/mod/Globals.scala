package typings.overlayscrollbars.mod

import typings.overlayscrollbars.AnonI
import typings.overlayscrollbars.AnonXBoolean
import typings.overlayscrollbars.AnonXNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Globals extends js.Object {
  var autoUpdateLoop: Boolean
  var autoUpdateRecommended: Boolean
  var cssCalc: String | Null
  var nativeScrollbarIsOverlaid: AnonXBoolean
  var nativeScrollbarSize: AnonXNumber
  var nativeScrollbarStyling: Boolean
  var overlayScrollbarDummySize: AnonXNumber
  var restrictedMeasuring: Boolean
  var rtlScrollBehavior: AnonI
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
    nativeScrollbarIsOverlaid: AnonXBoolean,
    nativeScrollbarSize: AnonXNumber,
    nativeScrollbarStyling: Boolean,
    overlayScrollbarDummySize: AnonXNumber,
    restrictedMeasuring: Boolean,
    rtlScrollBehavior: AnonI,
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

