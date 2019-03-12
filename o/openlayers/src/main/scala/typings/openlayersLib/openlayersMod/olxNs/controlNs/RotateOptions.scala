package typings
package openlayersLib.openlayersMod.olxNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotateOptions extends js.Object {
  var autoHide: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var label: js.UndefOr[java.lang.String | stdLib.Element] = js.undefined
  var render: js.UndefOr[js.Function1[/* event */ openlayersLib.openlayersMod.MapEvent, _]] = js.undefined
  var resetNorth: js.UndefOr[js.Function0[_]] = js.undefined
  var target: js.UndefOr[stdLib.Element] = js.undefined
  var tipLabel: js.UndefOr[java.lang.String] = js.undefined
}

object RotateOptions {
  @scala.inline
  def apply(
    autoHide: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    duration: scala.Int | scala.Double = null,
    label: java.lang.String | stdLib.Element = null,
    render: /* event */ openlayersLib.openlayersMod.MapEvent => _ = null,
    resetNorth: () => _ = null,
    target: stdLib.Element = null,
    tipLabel: java.lang.String = null
  ): RotateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide)
    if (className != null) __obj.updateDynamic("className")(className)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (resetNorth != null) __obj.updateDynamic("resetNorth")(js.Any.fromFunction0(resetNorth))
    if (target != null) __obj.updateDynamic("target")(target)
    if (tipLabel != null) __obj.updateDynamic("tipLabel")(tipLabel)
    __obj.asInstanceOf[RotateOptions]
  }
}

