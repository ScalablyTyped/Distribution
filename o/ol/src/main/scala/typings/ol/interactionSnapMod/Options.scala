package typings.ol.interactionSnapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var edge: js.UndefOr[Boolean] = js.undefined
  var features: js.UndefOr[typings.ol.collectionMod.default[typings.ol.featureMod.default]] = js.undefined
  var pixelTolerance: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[typings.ol.sourceVectorMod.default] = js.undefined
  var vertex: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    edge: js.UndefOr[Boolean] = js.undefined,
    features: typings.ol.collectionMod.default[typings.ol.featureMod.default] = null,
    pixelTolerance: Int | Double = null,
    source: typings.ol.sourceVectorMod.default = null,
    vertex: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(edge)) __obj.updateDynamic("edge")(edge)
    if (features != null) __obj.updateDynamic("features")(features)
    if (pixelTolerance != null) __obj.updateDynamic("pixelTolerance")(pixelTolerance.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (!js.isUndefined(vertex)) __obj.updateDynamic("vertex")(vertex)
    __obj.asInstanceOf[Options]
  }
}

