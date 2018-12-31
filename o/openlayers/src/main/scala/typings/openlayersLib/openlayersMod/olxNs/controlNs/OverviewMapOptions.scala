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

