package typings.motionScroll

import typings.motionScroll.motionScrollStrings.x
import typings.motionScroll.motionScrollStrings.y
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAxis extends js.Object {
  var axis: js.UndefOr[x | y] = js.undefined
  var callBack: js.UndefOr[js.Function0[Unit]] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[js.Function0[Unit]] = js.undefined
  var element: js.UndefOr[HTMLElement] = js.undefined
  var force: js.UndefOr[Boolean] = js.undefined
  var maxScrollTime: js.UndefOr[Double] = js.undefined
  var minScrollTime: js.UndefOr[Double] = js.undefined
  var scrollTo: js.UndefOr[Double] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
}

object AnonAxis {
  @scala.inline
  def apply(
    axis: x | y = null,
    callBack: () => Unit = null,
    delay: Int | Double = null,
    easing: () => Unit = null,
    element: HTMLElement = null,
    force: js.UndefOr[Boolean] = js.undefined,
    maxScrollTime: Int | Double = null,
    minScrollTime: Int | Double = null,
    scrollTo: Int | Double = null,
    speed: Int | Double = null
  ): AnonAxis = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (callBack != null) __obj.updateDynamic("callBack")(js.Any.fromFunction0(callBack))
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction0(easing))
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (maxScrollTime != null) __obj.updateDynamic("maxScrollTime")(maxScrollTime.asInstanceOf[js.Any])
    if (minScrollTime != null) __obj.updateDynamic("minScrollTime")(minScrollTime.asInstanceOf[js.Any])
    if (scrollTo != null) __obj.updateDynamic("scrollTo")(scrollTo.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAxis]
  }
}

