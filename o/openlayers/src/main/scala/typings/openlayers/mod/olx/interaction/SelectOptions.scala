package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.Collection
import typings.openlayers.mod.EventsConditionType
import typings.openlayers.mod.Feature
import typings.openlayers.mod.MapBrowserEvent
import typings.openlayers.mod.SelectFilterFunction
import typings.openlayers.mod.StyleFunction
import typings.openlayers.mod.layer.Layer
import typings.openlayers.mod.style.Style
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
    addCondition: /* event */ MapBrowserEvent => Boolean = null,
    condition: /* event */ MapBrowserEvent => Boolean = null,
    features: Collection[Feature] = null,
    filter: (/* feature */ Feature | typings.openlayers.mod.render.Feature, /* layer */ Layer) => Boolean = null,
    hitTolerance: Int | Double = null,
    layers: js.Array[Layer] | (js.Function1[/* layer */ Layer, Boolean]) = null,
    multi: js.UndefOr[Boolean] = js.undefined,
    removeCondition: /* event */ MapBrowserEvent => Boolean = null,
    style: Style | js.Array[Style] | StyleFunction = null,
    toggleCondition: /* event */ MapBrowserEvent => Boolean = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): SelectOptions = {
    val __obj = js.Dynamic.literal()
    if (addCondition != null) __obj.updateDynamic("addCondition")(js.Any.fromFunction1(addCondition))
    if (condition != null) __obj.updateDynamic("condition")(js.Any.fromFunction1(condition))
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2(filter))
    if (hitTolerance != null) __obj.updateDynamic("hitTolerance")(hitTolerance.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.asInstanceOf[js.Any])
    if (removeCondition != null) __obj.updateDynamic("removeCondition")(js.Any.fromFunction1(removeCondition))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (toggleCondition != null) __obj.updateDynamic("toggleCondition")(js.Any.fromFunction1(toggleCondition))
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectOptions]
  }
}

