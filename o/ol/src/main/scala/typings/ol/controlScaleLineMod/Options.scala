package typings.ol.controlScaleLineMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var render: js.UndefOr[js.Function1[/* p0 */ typings.ol.mapEventMod.default, Unit]] = js.undefined
  var target: js.UndefOr[HTMLElement | String] = js.undefined
  var units: js.UndefOr[Units | String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    className: String = null,
    minWidth: Int | Double = null,
    render: /* p0 */ typings.ol.mapEventMod.default => Unit = null,
    target: HTMLElement | String = null,
    units: Units | String = null
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

