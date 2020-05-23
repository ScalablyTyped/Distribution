package typings.ol.clusterMod

import typings.ol.sourceSourceMod.AttributionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var geometryFunction: js.UndefOr[
    js.Function1[
      /* p0 */ typings.ol.olFeatureMod.default[typings.ol.geometryMod.default], 
      typings.ol.pointMod.default
    ]
  ] = js.undefined
  var source: js.UndefOr[typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default]] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    attributions: AttributionLike = null,
    distance: js.UndefOr[Double] = js.undefined,
    geometryFunction: /* p0 */ typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] => typings.ol.pointMod.default = null,
    source: typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default] = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (!js.isUndefined(distance)) __obj.updateDynamic("distance")(distance.get.asInstanceOf[js.Any])
    if (geometryFunction != null) __obj.updateDynamic("geometryFunction")(js.Any.fromFunction1(geometryFunction))
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

