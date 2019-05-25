package typings
package olLib.interactionModifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var condition: js.UndefOr[olLib.eventsConditionMod.Condition] = js.undefined
  var deleteCondition: js.UndefOr[olLib.eventsConditionMod.Condition] = js.undefined
  var features: js.UndefOr[olLib.collectionMod.default[olLib.featureMod.default]] = js.undefined
  var insertVertexCondition: js.UndefOr[olLib.eventsConditionMod.Condition] = js.undefined
  var pixelTolerance: js.UndefOr[scala.Double] = js.undefined
  var source: js.UndefOr[olLib.sourceVectorMod.default] = js.undefined
  var style: js.UndefOr[olLib.styleStyleMod.StyleLike] = js.undefined
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    condition: olLib.eventsConditionMod.Condition = null,
    deleteCondition: olLib.eventsConditionMod.Condition = null,
    features: olLib.collectionMod.default[olLib.featureMod.default] = null,
    insertVertexCondition: olLib.eventsConditionMod.Condition = null,
    pixelTolerance: scala.Int | scala.Double = null,
    source: olLib.sourceVectorMod.default = null,
    style: olLib.styleStyleMod.StyleLike = null,
    wrapX: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (deleteCondition != null) __obj.updateDynamic("deleteCondition")(deleteCondition)
    if (features != null) __obj.updateDynamic("features")(features)
    if (insertVertexCondition != null) __obj.updateDynamic("insertVertexCondition")(insertVertexCondition)
    if (pixelTolerance != null) __obj.updateDynamic("pixelTolerance")(pixelTolerance.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[Options]
  }
}

