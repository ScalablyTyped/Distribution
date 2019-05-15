package typings
package motionDashScrollLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Axis extends js.Object {
  var axis: js.UndefOr[
    motionDashScrollLib.motionDashScrollLibStrings.x | motionDashScrollLib.motionDashScrollLibStrings.y
  ] = js.undefined
  var callBack: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var element: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var maxScrollTime: js.UndefOr[scala.Double] = js.undefined
  var minScrollTime: js.UndefOr[scala.Double] = js.undefined
  var scrollTo: js.UndefOr[scala.Double] = js.undefined
  var speed: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Axis {
  @scala.inline
  def apply(
    axis: motionDashScrollLib.motionDashScrollLibStrings.x | motionDashScrollLib.motionDashScrollLibStrings.y = null,
    callBack: () => scala.Unit = null,
    delay: scala.Int | scala.Double = null,
    easing: () => scala.Unit = null,
    element: stdLib.HTMLElement = null,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    maxScrollTime: scala.Int | scala.Double = null,
    minScrollTime: scala.Int | scala.Double = null,
    scrollTo: scala.Int | scala.Double = null,
    speed: scala.Int | scala.Double = null
  ): Anon_Axis = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (callBack != null) __obj.updateDynamic("callBack")(js.Any.fromFunction0(callBack))
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction0(easing))
    if (element != null) __obj.updateDynamic("element")(element)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (maxScrollTime != null) __obj.updateDynamic("maxScrollTime")(maxScrollTime.asInstanceOf[js.Any])
    if (minScrollTime != null) __obj.updateDynamic("minScrollTime")(minScrollTime.asInstanceOf[js.Any])
    if (scrollTo != null) __obj.updateDynamic("scrollTo")(scrollTo.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Axis]
  }
}

