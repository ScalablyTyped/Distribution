package typings.ol.sourceVectorMod

import typings.ol.featureloaderMod.FeatureLoader
import typings.ol.featureloaderMod.FeatureUrlFunction
import typings.ol.sourceSourceMod.AttributionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var features: js.UndefOr[
    js.Array[typings.ol.featureMod.default] | typings.ol.collectionMod.default[typings.ol.featureMod.default]
  ] = js.undefined
  var format: js.UndefOr[typings.ol.formatFeatureMod.default] = js.undefined
  var loader: js.UndefOr[FeatureLoader] = js.undefined
  var overlaps: js.UndefOr[Boolean] = js.undefined
  var strategy: js.UndefOr[LoadingStrategy] = js.undefined
  var url: js.UndefOr[String | FeatureUrlFunction] = js.undefined
  var useSpatialIndex: js.UndefOr[Boolean] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    attributions: AttributionLike = null,
    features: js.Array[typings.ol.featureMod.default] | typings.ol.collectionMod.default[typings.ol.featureMod.default] = null,
    format: typings.ol.formatFeatureMod.default = null,
    loader: FeatureLoader = null,
    overlaps: js.UndefOr[Boolean] = js.undefined,
    strategy: LoadingStrategy = null,
    url: String | FeatureUrlFunction = null,
    useSpatialIndex: js.UndefOr[Boolean] = js.undefined,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (loader != null) __obj.updateDynamic("loader")(loader)
    if (!js.isUndefined(overlaps)) __obj.updateDynamic("overlaps")(overlaps)
    if (strategy != null) __obj.updateDynamic("strategy")(strategy)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(useSpatialIndex)) __obj.updateDynamic("useSpatialIndex")(useSpatialIndex)
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[Options]
  }
}

