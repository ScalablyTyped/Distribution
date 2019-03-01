package typings
package openlayersLib.openlayersMod.olxNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverviewMapOptions extends js.Object {
  var collapseLabel: js.UndefOr[java.lang.String | stdLib.Node] = js.undefined
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  var collapsible: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[java.lang.String | stdLib.Node] = js.undefined
  var layers: js.UndefOr[
    js.Array[openlayersLib.openlayersMod.layerNs.Layer] | openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.layerNs.Layer]
  ] = js.undefined
  var render: js.UndefOr[js.Function1[/* event */ openlayersLib.openlayersMod.MapEvent, _]] = js.undefined
  var target: js.UndefOr[stdLib.Element] = js.undefined
  var tipLabel: js.UndefOr[java.lang.String] = js.undefined
  var view: js.UndefOr[openlayersLib.openlayersMod.View] = js.undefined
}

object OverviewMapOptions {
  @scala.inline
  def apply(
    collapseLabel: java.lang.String | stdLib.Node = null,
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    collapsible: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String | stdLib.Node = null,
    layers: js.Array[openlayersLib.openlayersMod.layerNs.Layer] | openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.layerNs.Layer] = null,
    render: js.Function1[/* event */ openlayersLib.openlayersMod.MapEvent, _] = null,
    target: stdLib.Element = null,
    tipLabel: java.lang.String = null,
    view: openlayersLib.openlayersMod.View = null
  ): OverviewMapOptions = {
    val __obj = js.Dynamic.literal()
    if (collapseLabel != null) __obj.updateDynamic("collapseLabel")(collapseLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render)
    if (target != null) __obj.updateDynamic("target")(target)
    if (tipLabel != null) __obj.updateDynamic("tipLabel")(tipLabel)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[OverviewMapOptions]
  }
}

