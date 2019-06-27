package typings
package olLib.controlRotateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autoHide: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var label: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
  var render: js.UndefOr[js.Function1[/* p0 */ olLib.mapEventMod.default, scala.Unit]] = js.undefined
  var resetNorth: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var target: js.UndefOr[stdLib.HTMLElement | java.lang.String] = js.undefined
  var tipLabel: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoHide: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    duration: scala.Int | scala.Double = null,
    label: java.lang.String | stdLib.HTMLElement = null,
    render: /* p0 */ olLib.mapEventMod.default => scala.Unit = null,
    resetNorth: () => scala.Unit = null,
    target: stdLib.HTMLElement | java.lang.String = null,
    tipLabel: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide)
    if (className != null) __obj.updateDynamic("className")(className)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (resetNorth != null) __obj.updateDynamic("resetNorth")(js.Any.fromFunction0(resetNorth))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (tipLabel != null) __obj.updateDynamic("tipLabel")(tipLabel)
    __obj.asInstanceOf[Options]
  }
}

