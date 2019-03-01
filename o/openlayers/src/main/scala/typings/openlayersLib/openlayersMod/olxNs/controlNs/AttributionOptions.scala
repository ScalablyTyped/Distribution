package typings
package openlayersLib.openlayersMod.olxNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributionOptions extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var collapseLabel: js.UndefOr[java.lang.String | stdLib.Node] = js.undefined
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  var collapsible: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[java.lang.String | stdLib.Node] = js.undefined
  var render: js.UndefOr[js.Function1[/* event */ openlayersLib.openlayersMod.MapEvent, _]] = js.undefined
  var target: js.UndefOr[stdLib.Element] = js.undefined
  var tipLabel: js.UndefOr[java.lang.String] = js.undefined
}

object AttributionOptions {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    collapseLabel: java.lang.String | stdLib.Node = null,
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    collapsible: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String | stdLib.Node = null,
    render: js.Function1[/* event */ openlayersLib.openlayersMod.MapEvent, _] = null,
    target: stdLib.Element = null,
    tipLabel: java.lang.String = null
  ): AttributionOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (collapseLabel != null) __obj.updateDynamic("collapseLabel")(collapseLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render)
    if (target != null) __obj.updateDynamic("target")(target)
    if (tipLabel != null) __obj.updateDynamic("tipLabel")(tipLabel)
    __obj.asInstanceOf[AttributionOptions]
  }
}

