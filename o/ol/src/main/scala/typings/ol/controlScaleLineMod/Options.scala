package typings.ol.controlScaleLineMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var bar: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var render: js.UndefOr[js.Function1[/* p0 */ typings.ol.mapEventMod.default, Unit]] = js.undefined
  var steps: js.UndefOr[Double] = js.undefined
  var target: js.UndefOr[HTMLElement | String] = js.undefined
  var text: js.UndefOr[Boolean] = js.undefined
  var units: js.UndefOr[Units | String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    bar: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    minWidth: Int | Double = null,
    render: /* p0 */ typings.ol.mapEventMod.default => Unit = null,
    steps: Int | Double = null,
    target: HTMLElement | String = null,
    text: js.UndefOr[Boolean] = js.undefined,
    units: Units | String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bar)) __obj.updateDynamic("bar")(bar.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

