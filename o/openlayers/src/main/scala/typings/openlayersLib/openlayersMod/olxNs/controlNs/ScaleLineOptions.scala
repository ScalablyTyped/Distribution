package typings
package openlayersLib.openlayersMod.olxNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleLineOptions extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  var render: js.UndefOr[js.Function1[/* event */ openlayersLib.openlayersMod.MapEvent, _]] = js.undefined
  var target: js.UndefOr[stdLib.Element] = js.undefined
  var units: js.UndefOr[openlayersLib.openlayersMod.controlNs.ScaleLineNs.Units | java.lang.String] = js.undefined
}

object ScaleLineOptions {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    minWidth: scala.Int | scala.Double = null,
    render: /* event */ openlayersLib.openlayersMod.MapEvent => _ = null,
    target: stdLib.Element = null,
    units: openlayersLib.openlayersMod.controlNs.ScaleLineNs.Units | java.lang.String = null
  ): ScaleLineOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (target != null) __obj.updateDynamic("target")(target)
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleLineOptions]
  }
}

