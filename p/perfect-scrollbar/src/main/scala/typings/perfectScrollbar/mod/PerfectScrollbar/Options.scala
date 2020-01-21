package typings.perfectScrollbar.mod.PerfectScrollbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var handlers: js.UndefOr[js.Array[String]] = js.undefined
  var maxScrollbarLength: js.UndefOr[Double] = js.undefined
  var minScrollbarLength: js.UndefOr[Double] = js.undefined
  var scrollXMarginOffset: js.UndefOr[Double] = js.undefined
  var scrollYMarginOffset: js.UndefOr[Double] = js.undefined
  var scrollingThreshold: js.UndefOr[Double] = js.undefined
  var suppressScrollX: js.UndefOr[Boolean] = js.undefined
  var suppressScrollY: js.UndefOr[Boolean] = js.undefined
  var swipeEasing: js.UndefOr[Boolean] = js.undefined
  var useBothWheelAxes: js.UndefOr[Boolean] = js.undefined
  var wheelPropagation: js.UndefOr[Boolean] = js.undefined
  var wheelSpeed: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    handlers: js.Array[String] = null,
    maxScrollbarLength: Int | Double = null,
    minScrollbarLength: Int | Double = null,
    scrollXMarginOffset: Int | Double = null,
    scrollYMarginOffset: Int | Double = null,
    scrollingThreshold: Int | Double = null,
    suppressScrollX: js.UndefOr[Boolean] = js.undefined,
    suppressScrollY: js.UndefOr[Boolean] = js.undefined,
    swipeEasing: js.UndefOr[Boolean] = js.undefined,
    useBothWheelAxes: js.UndefOr[Boolean] = js.undefined,
    wheelPropagation: js.UndefOr[Boolean] = js.undefined,
    wheelSpeed: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (handlers != null) __obj.updateDynamic("handlers")(handlers.asInstanceOf[js.Any])
    if (maxScrollbarLength != null) __obj.updateDynamic("maxScrollbarLength")(maxScrollbarLength.asInstanceOf[js.Any])
    if (minScrollbarLength != null) __obj.updateDynamic("minScrollbarLength")(minScrollbarLength.asInstanceOf[js.Any])
    if (scrollXMarginOffset != null) __obj.updateDynamic("scrollXMarginOffset")(scrollXMarginOffset.asInstanceOf[js.Any])
    if (scrollYMarginOffset != null) __obj.updateDynamic("scrollYMarginOffset")(scrollYMarginOffset.asInstanceOf[js.Any])
    if (scrollingThreshold != null) __obj.updateDynamic("scrollingThreshold")(scrollingThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressScrollX)) __obj.updateDynamic("suppressScrollX")(suppressScrollX.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressScrollY)) __obj.updateDynamic("suppressScrollY")(suppressScrollY.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeEasing)) __obj.updateDynamic("swipeEasing")(swipeEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(useBothWheelAxes)) __obj.updateDynamic("useBothWheelAxes")(useBothWheelAxes.asInstanceOf[js.Any])
    if (!js.isUndefined(wheelPropagation)) __obj.updateDynamic("wheelPropagation")(wheelPropagation.asInstanceOf[js.Any])
    if (wheelSpeed != null) __obj.updateDynamic("wheelSpeed")(wheelSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

