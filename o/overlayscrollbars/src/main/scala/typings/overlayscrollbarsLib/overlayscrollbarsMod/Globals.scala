package typings
package overlayscrollbarsLib.overlayscrollbarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Globals extends js.Object {
  var autoUpdateLoop: scala.Boolean
  var autoUpdateRecommended: scala.Boolean
  var cssCalc: java.lang.String | scala.Null
  var nativeScrollbarIsOverlaid: overlayscrollbarsLib.Anon_XYBoolean
  var nativeScrollbarSize: overlayscrollbarsLib.Anon_XYNumber
  var nativeScrollbarStyling: scala.Boolean
  var overlayScrollbarDummySize: overlayscrollbarsLib.Anon_XYNumber
  var restrictedMeasuring: scala.Boolean
  var rtlScrollBehavior: overlayscrollbarsLib.Anon_I
  var supportMutationObserver: scala.Boolean
  var supportPassiveEvents: scala.Boolean
  var supportResizeObserver: scala.Boolean
  var supportTransform: scala.Boolean
  var supportTransition: scala.Boolean
}

object Globals {
  @scala.inline
  def apply(
    autoUpdateLoop: scala.Boolean,
    autoUpdateRecommended: scala.Boolean,
    nativeScrollbarIsOverlaid: overlayscrollbarsLib.Anon_XYBoolean,
    nativeScrollbarSize: overlayscrollbarsLib.Anon_XYNumber,
    nativeScrollbarStyling: scala.Boolean,
    overlayScrollbarDummySize: overlayscrollbarsLib.Anon_XYNumber,
    restrictedMeasuring: scala.Boolean,
    rtlScrollBehavior: overlayscrollbarsLib.Anon_I,
    supportMutationObserver: scala.Boolean,
    supportPassiveEvents: scala.Boolean,
    supportResizeObserver: scala.Boolean,
    supportTransform: scala.Boolean,
    supportTransition: scala.Boolean,
    cssCalc: java.lang.String = null
  ): Globals = {
    val __obj = js.Dynamic.literal(autoUpdateLoop = autoUpdateLoop, autoUpdateRecommended = autoUpdateRecommended, nativeScrollbarIsOverlaid = nativeScrollbarIsOverlaid, nativeScrollbarSize = nativeScrollbarSize, nativeScrollbarStyling = nativeScrollbarStyling, overlayScrollbarDummySize = overlayScrollbarDummySize, restrictedMeasuring = restrictedMeasuring, rtlScrollBehavior = rtlScrollBehavior, supportMutationObserver = supportMutationObserver, supportPassiveEvents = supportPassiveEvents, supportResizeObserver = supportResizeObserver, supportTransform = supportTransform, supportTransition = supportTransition)
    if (cssCalc != null) __obj.updateDynamic("cssCalc")(cssCalc)
    __obj.asInstanceOf[Globals]
  }
}

