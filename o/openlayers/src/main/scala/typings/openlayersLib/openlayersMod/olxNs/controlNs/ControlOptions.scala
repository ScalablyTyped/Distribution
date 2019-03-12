package typings
package openlayersLib.openlayersMod.olxNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlOptions extends js.Object {
  var element: js.UndefOr[stdLib.Element] = js.undefined
  var render: js.UndefOr[js.Function1[/* event */ openlayersLib.openlayersMod.MapEvent, _]] = js.undefined
  var target: js.UndefOr[stdLib.Element | java.lang.String] = js.undefined
}

object ControlOptions {
  @scala.inline
  def apply(
    element: stdLib.Element = null,
    render: /* event */ openlayersLib.openlayersMod.MapEvent => _ = null,
    target: stdLib.Element | java.lang.String = null
  ): ControlOptions = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element)
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlOptions]
  }
}

