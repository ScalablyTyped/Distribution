package typings
package perfectDashScrollbarLib.perfectDashScrollbarMod.PerfectScrollbarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var handlers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var maxScrollbarLength: js.UndefOr[scala.Double] = js.undefined
  var minScrollbarLength: js.UndefOr[scala.Double] = js.undefined
  var scrollXMarginOffset: js.UndefOr[scala.Double] = js.undefined
  var scrollYMarginOffset: js.UndefOr[scala.Double] = js.undefined
  var scrollingThreshold: js.UndefOr[scala.Double] = js.undefined
  var suppressScrollX: js.UndefOr[scala.Boolean] = js.undefined
  var suppressScrollY: js.UndefOr[scala.Boolean] = js.undefined
  var swipeEasing: js.UndefOr[scala.Boolean] = js.undefined
  var useBothWheelAxes: js.UndefOr[scala.Boolean] = js.undefined
  var wheelPropagation: js.UndefOr[scala.Boolean] = js.undefined
  var wheelSpeed: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    handlers: js.Array[java.lang.String] = null,
    maxScrollbarLength: scala.Int | scala.Double = null,
    minScrollbarLength: scala.Int | scala.Double = null,
    scrollXMarginOffset: scala.Int | scala.Double = null,
    scrollYMarginOffset: scala.Int | scala.Double = null,
    scrollingThreshold: scala.Int | scala.Double = null,
    suppressScrollX: js.UndefOr[scala.Boolean] = js.undefined,
    suppressScrollY: js.UndefOr[scala.Boolean] = js.undefined,
    swipeEasing: js.UndefOr[scala.Boolean] = js.undefined,
    useBothWheelAxes: js.UndefOr[scala.Boolean] = js.undefined,
    wheelPropagation: js.UndefOr[scala.Boolean] = js.undefined,
    wheelSpeed: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (handlers != null) __obj.updateDynamic("handlers")(handlers)
    if (maxScrollbarLength != null) __obj.updateDynamic("maxScrollbarLength")(maxScrollbarLength.asInstanceOf[js.Any])
    if (minScrollbarLength != null) __obj.updateDynamic("minScrollbarLength")(minScrollbarLength.asInstanceOf[js.Any])
    if (scrollXMarginOffset != null) __obj.updateDynamic("scrollXMarginOffset")(scrollXMarginOffset.asInstanceOf[js.Any])
    if (scrollYMarginOffset != null) __obj.updateDynamic("scrollYMarginOffset")(scrollYMarginOffset.asInstanceOf[js.Any])
    if (scrollingThreshold != null) __obj.updateDynamic("scrollingThreshold")(scrollingThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressScrollX)) __obj.updateDynamic("suppressScrollX")(suppressScrollX)
    if (!js.isUndefined(suppressScrollY)) __obj.updateDynamic("suppressScrollY")(suppressScrollY)
    if (!js.isUndefined(swipeEasing)) __obj.updateDynamic("swipeEasing")(swipeEasing)
    if (!js.isUndefined(useBothWheelAxes)) __obj.updateDynamic("useBothWheelAxes")(useBothWheelAxes)
    if (!js.isUndefined(wheelPropagation)) __obj.updateDynamic("wheelPropagation")(wheelPropagation)
    if (wheelSpeed != null) __obj.updateDynamic("wheelSpeed")(wheelSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

