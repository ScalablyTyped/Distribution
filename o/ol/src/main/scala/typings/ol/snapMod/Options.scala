package typings.ol.snapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var edge: js.UndefOr[Boolean] = js.undefined
  var features: js.UndefOr[
    typings.ol.collectionMod.default[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]
  ] = js.undefined
  var pixelTolerance: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default]] = js.undefined
  var vertex: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    edge: js.UndefOr[Boolean] = js.undefined,
    features: typings.ol.collectionMod.default[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]] = null,
    pixelTolerance: js.UndefOr[Double] = js.undefined,
    source: typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default] = null,
    vertex: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(edge)) __obj.updateDynamic("edge")(edge.get.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelTolerance)) __obj.updateDynamic("pixelTolerance")(pixelTolerance.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(vertex)) __obj.updateDynamic("vertex")(vertex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

