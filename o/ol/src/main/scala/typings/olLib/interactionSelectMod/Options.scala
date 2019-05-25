package typings
package olLib.interactionSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var addCondition: js.UndefOr[olLib.eventsConditionMod.Condition] = js.undefined
  var condition: js.UndefOr[olLib.eventsConditionMod.Condition] = js.undefined
  var features: js.UndefOr[olLib.collectionMod.default[olLib.featureMod.default]] = js.undefined
  var filter: js.UndefOr[FilterFunction] = js.undefined
  var hitTolerance: js.UndefOr[scala.Double] = js.undefined
  var layers: js.UndefOr[
    js.Array[olLib.layerLayerMod.default] | (js.Function1[/* param0 */ olLib.layerLayerMod.default, scala.Boolean])
  ] = js.undefined
  var multi: js.UndefOr[scala.Boolean] = js.undefined
  var removeCondition: js.UndefOr[olLib.eventsConditionMod.Condition] = js.undefined
  var style: js.UndefOr[olLib.styleStyleMod.StyleLike] = js.undefined
  var toggleCondition: js.UndefOr[olLib.eventsConditionMod.Condition] = js.undefined
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    addCondition: olLib.eventsConditionMod.Condition = null,
    condition: olLib.eventsConditionMod.Condition = null,
    features: olLib.collectionMod.default[olLib.featureMod.default] = null,
    filter: FilterFunction = null,
    hitTolerance: scala.Int | scala.Double = null,
    layers: js.Array[olLib.layerLayerMod.default] | (js.Function1[/* param0 */ olLib.layerLayerMod.default, scala.Boolean]) = null,
    multi: js.UndefOr[scala.Boolean] = js.undefined,
    removeCondition: olLib.eventsConditionMod.Condition = null,
    style: olLib.styleStyleMod.StyleLike = null,
    toggleCondition: olLib.eventsConditionMod.Condition = null,
    wrapX: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
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
    __obj.asInstanceOf[Options]
  }
}

