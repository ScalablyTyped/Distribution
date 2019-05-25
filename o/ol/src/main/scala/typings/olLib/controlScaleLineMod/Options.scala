package typings
package olLib.controlScaleLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  var render: js.UndefOr[js.Function1[/* param0 */ olLib.mapEventMod.default, scala.Unit]] = js.undefined
  var target: js.UndefOr[stdLib.HTMLElement | java.lang.String] = js.undefined
  var units: js.UndefOr[Units | java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    minWidth: scala.Int | scala.Double = null,
    render: /* param0 */ olLib.mapEventMod.default => scala.Unit = null,
    target: stdLib.HTMLElement | java.lang.String = null,
    units: Units | java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

