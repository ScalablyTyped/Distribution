package typings
package openlayersLib.openlayersMod.olxNs.interactionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyOptions extends js.Object {
  var condition: js.UndefOr[openlayersLib.openlayersMod.EventsConditionType] = js.undefined
  var deleteCondition: js.UndefOr[openlayersLib.openlayersMod.EventsConditionType] = js.undefined
  var features: js.UndefOr[openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.Feature]] = js.undefined
  var insertVertexCondition: js.UndefOr[openlayersLib.openlayersMod.EventsConditionType] = js.undefined
  var pixelTolerance: js.UndefOr[scala.Double] = js.undefined
  var source: js.UndefOr[openlayersLib.openlayersMod.sourceNs.Vector] = js.undefined
  var style: js.UndefOr[
    openlayersLib.openlayersMod.styleNs.Style | js.Array[openlayersLib.openlayersMod.styleNs.Style] | openlayersLib.openlayersMod.StyleFunction
  ] = js.undefined
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

object ModifyOptions {
  @scala.inline
  def apply(
    condition: openlayersLib.openlayersMod.EventsConditionType = null,
    deleteCondition: openlayersLib.openlayersMod.EventsConditionType = null,
    features: openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.Feature] = null,
    insertVertexCondition: openlayersLib.openlayersMod.EventsConditionType = null,
    pixelTolerance: scala.Int | scala.Double = null,
    source: openlayersLib.openlayersMod.sourceNs.Vector = null,
    style: openlayersLib.openlayersMod.styleNs.Style | js.Array[openlayersLib.openlayersMod.styleNs.Style] | openlayersLib.openlayersMod.StyleFunction = null,
    wrapX: js.UndefOr[scala.Boolean] = js.undefined
  ): ModifyOptions = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (deleteCondition != null) __obj.updateDynamic("deleteCondition")(deleteCondition)
    if (features != null) __obj.updateDynamic("features")(features)
    if (insertVertexCondition != null) __obj.updateDynamic("insertVertexCondition")(insertVertexCondition)
    if (pixelTolerance != null) __obj.updateDynamic("pixelTolerance")(pixelTolerance.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[ModifyOptions]
  }
}

