package typings.openlayers.openlayersMod.olxNs.controlNs

import typings.openlayers.openlayersMod.MapEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlOptions extends js.Object {
  var element: js.UndefOr[Element] = js.undefined
  var render: js.UndefOr[js.Function1[/* event */ MapEvent, _]] = js.undefined
  var target: js.UndefOr[Element | String] = js.undefined
}

object ControlOptions {
  @scala.inline
  def apply(element: Element = null, render: /* event */ MapEvent => _ = null, target: Element | String = null): ControlOptions = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element)
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlOptions]
  }
}

