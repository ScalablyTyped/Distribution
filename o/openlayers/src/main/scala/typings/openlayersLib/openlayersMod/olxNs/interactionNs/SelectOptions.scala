package typings
package openlayersLib.openlayersMod.olxNs.interactionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectOptions extends js.Object {
  var addCondition: js.UndefOr[openlayersLib.openlayersMod.EventsConditionType] = js.undefined
  var condition: js.UndefOr[openlayersLib.openlayersMod.EventsConditionType] = js.undefined
  var features: js.UndefOr[openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.Feature]] = js.undefined
  var filter: js.UndefOr[openlayersLib.openlayersMod.SelectFilterFunction] = js.undefined
  var hitTolerance: js.UndefOr[scala.Double] = js.undefined
  var layers: js.UndefOr[
    js.Array[openlayersLib.openlayersMod.layerNs.Layer] | (js.Function1[/* layer */ openlayersLib.openlayersMod.layerNs.Layer, scala.Boolean])
  ] = js.undefined
  var multi: js.UndefOr[scala.Boolean] = js.undefined
  var removeCondition: js.UndefOr[openlayersLib.openlayersMod.EventsConditionType] = js.undefined
  var style: js.UndefOr[
    openlayersLib.openlayersMod.styleNs.Style | js.Array[openlayersLib.openlayersMod.styleNs.Style] | openlayersLib.openlayersMod.StyleFunction
  ] = js.undefined
  var toggleCondition: js.UndefOr[openlayersLib.openlayersMod.EventsConditionType] = js.undefined
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

