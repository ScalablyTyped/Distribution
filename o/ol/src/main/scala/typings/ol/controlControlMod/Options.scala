package typings.ol.controlControlMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var element: js.UndefOr[HTMLElement] = js.undefined
  var render: js.UndefOr[js.Function1[/* p0 */ typings.ol.mapEventMod.default, Unit]] = js.undefined
  var target: js.UndefOr[HTMLElement | String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    element: HTMLElement = null,
    render: /* p0 */ typings.ol.mapEventMod.default => Unit = null,
    target: HTMLElement | String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element)
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

