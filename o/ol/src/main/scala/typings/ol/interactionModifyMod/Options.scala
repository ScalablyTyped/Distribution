package typings.ol.interactionModifyMod

import typings.ol.eventsConditionMod.Condition
import typings.ol.styleStyleMod.StyleLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var condition: js.UndefOr[Condition] = js.undefined
  var deleteCondition: js.UndefOr[Condition] = js.undefined
  var features: js.UndefOr[
    typings.ol.collectionMod.default[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]]
  ] = js.undefined
  var insertVertexCondition: js.UndefOr[Condition] = js.undefined
  var pixelTolerance: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default]] = js.undefined
  var style: js.UndefOr[StyleLike] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    condition: Condition = null,
    deleteCondition: Condition = null,
    features: typings.ol.collectionMod.default[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]] = null,
    insertVertexCondition: Condition = null,
    pixelTolerance: Int | Double = null,
    source: typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default] = null,
    style: StyleLike = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (deleteCondition != null) __obj.updateDynamic("deleteCondition")(deleteCondition.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (insertVertexCondition != null) __obj.updateDynamic("insertVertexCondition")(insertVertexCondition.asInstanceOf[js.Any])
    if (pixelTolerance != null) __obj.updateDynamic("pixelTolerance")(pixelTolerance.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

