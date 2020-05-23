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
    maxScrollbarLength: js.UndefOr[Double] = js.undefined,
    minScrollbarLength: js.UndefOr[Double] = js.undefined,
    scrollXMarginOffset: js.UndefOr[Double] = js.undefined,
    scrollYMarginOffset: js.UndefOr[Double] = js.undefined,
    scrollingThreshold: js.UndefOr[Double] = js.undefined,
    suppressScrollX: js.UndefOr[Boolean] = js.undefined,
    suppressScrollY: js.UndefOr[Boolean] = js.undefined,
    swipeEasing: js.UndefOr[Boolean] = js.undefined,
    useBothWheelAxes: js.UndefOr[Boolean] = js.undefined,
    wheelPropagation: js.UndefOr[Boolean] = js.undefined,
    wheelSpeed: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (handlers != null) __obj.updateDynamic("handlers")(handlers.asInstanceOf[js.Any])
    if (!js.isUndefined(maxScrollbarLength)) __obj.updateDynamic("maxScrollbarLength")(maxScrollbarLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minScrollbarLength)) __obj.updateDynamic("minScrollbarLength")(minScrollbarLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollXMarginOffset)) __obj.updateDynamic("scrollXMarginOffset")(scrollXMarginOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollYMarginOffset)) __obj.updateDynamic("scrollYMarginOffset")(scrollYMarginOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollingThreshold)) __obj.updateDynamic("scrollingThreshold")(scrollingThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressScrollX)) __obj.updateDynamic("suppressScrollX")(suppressScrollX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressScrollY)) __obj.updateDynamic("suppressScrollY")(suppressScrollY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeEasing)) __obj.updateDynamic("swipeEasing")(swipeEasing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useBothWheelAxes)) __obj.updateDynamic("useBothWheelAxes")(useBothWheelAxes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wheelPropagation)) __obj.updateDynamic("wheelPropagation")(wheelPropagation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wheelSpeed)) __obj.updateDynamic("wheelSpeed")(wheelSpeed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

