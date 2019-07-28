package typings.openlayers.openlayersMod.olxNs.interactionNs

import typings.openlayers.openlayersMod.Collection
import typings.openlayers.openlayersMod.EventsConditionType
import typings.openlayers.openlayersMod.Feature
import typings.openlayers.openlayersMod.SelectFilterFunction
import typings.openlayers.openlayersMod.StyleFunction
import typings.openlayers.openlayersMod.layerNs.Layer
import typings.openlayers.openlayersMod.styleNs.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectOptions extends js.Object {
  var addCondition: js.UndefOr[EventsConditionType] = js.undefined
  var condition: js.UndefOr[EventsConditionType] = js.undefined
  var features: js.UndefOr[Collection[Feature]] = js.undefined
  var filter: js.UndefOr[SelectFilterFunction] = js.undefined
  var hitTolerance: js.UndefOr[Double] = js.undefined
  var layers: js.UndefOr[js.Array[Layer] | (js.Function1[/* layer */ Layer, Boolean])] = js.undefined
  var multi: js.UndefOr[Boolean] = js.undefined
  var removeCondition: js.UndefOr[EventsConditionType] = js.undefined
  var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.undefined
  var toggleCondition: js.UndefOr[EventsConditionType] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object SelectOptions {
  @scala.inline
  def apply(
    addCondition: EventsConditionType = null,
    condition: EventsConditionType = null,
    features: Collection[Feature] = null,
    filter: SelectFilterFunction = null,
    hitTolerance: Int | Double = null,
    layers: js.Array[Layer] | (js.Function1[/* layer */ Layer, Boolean]) = null,
    multi: js.UndefOr[Boolean] = js.undefined,
    removeCondition: EventsConditionType = null,
    style: Style | js.Array[Style] | StyleFunction = null,
    toggleCondition: EventsConditionType = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
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

