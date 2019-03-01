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

object SelectOptions {
  @scala.inline
  def apply(
    addCondition: openlayersLib.openlayersMod.EventsConditionType = null,
    condition: openlayersLib.openlayersMod.EventsConditionType = null,
    features: openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.Feature] = null,
    filter: openlayersLib.openlayersMod.SelectFilterFunction = null,
    hitTolerance: scala.Int | scala.Double = null,
    layers: js.Array[openlayersLib.openlayersMod.layerNs.Layer] | (js.Function1[/* layer */ openlayersLib.openlayersMod.layerNs.Layer, scala.Boolean]) = null,
    multi: js.UndefOr[scala.Boolean] = js.undefined,
    removeCondition: openlayersLib.openlayersMod.EventsConditionType = null,
    style: openlayersLib.openlayersMod.styleNs.Style | js.Array[openlayersLib.openlayersMod.styleNs.Style] | openlayersLib.openlayersMod.StyleFunction = null,
    toggleCondition: openlayersLib.openlayersMod.EventsConditionType = null,
    wrapX: js.UndefOr[scala.Boolean] = js.undefined
  ): SelectOptions = {
    val __obj = js.Dynamic.literal()
    if (addCondition != null) __obj.updateDynamic("addCondition")(addCondition)
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (features != null) __obj.updateDynamic("features")(features)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (hitTolerance != null) __obj.updateDynamic("hitTolerance")(hitTolerance.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi)
    if (removeCondition != null) __obj.updateDynamic("removeCondition")(removeCondition)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (toggleCondition != null) __obj.updateDynamic("toggleCondition")(toggleCondition)
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[SelectOptions]
  }
}

