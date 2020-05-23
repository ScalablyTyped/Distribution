package typings.motionScroll.anon

import typings.motionScroll.motionScrollStrings.x
import typings.motionScroll.motionScrollStrings.y
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Axis extends js.Object {
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

object Axis {
  @scala.inline
  def apply(
    axis: x | y = null,
    callBack: () => Unit = null,
    delay: js.UndefOr[Double] = js.undefined,
    easing: () => Unit = null,
    element: HTMLElement = null,
    force: js.UndefOr[Boolean] = js.undefined,
    maxScrollTime: js.UndefOr[Double] = js.undefined,
    minScrollTime: js.UndefOr[Double] = js.undefined,
    scrollTo: js.UndefOr[Double] = js.undefined,
    speed: js.UndefOr[Double] = js.undefined
  ): Axis = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (callBack != null) __obj.updateDynamic("callBack")(js.Any.fromFunction0(callBack))
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction0(easing))
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxScrollTime)) __obj.updateDynamic("maxScrollTime")(maxScrollTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minScrollTime)) __obj.updateDynamic("minScrollTime")(minScrollTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollTo)) __obj.updateDynamic("scrollTo")(scrollTo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis]
  }
}

