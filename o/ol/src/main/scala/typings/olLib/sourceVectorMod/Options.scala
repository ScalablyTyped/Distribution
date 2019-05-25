package typings
package olLib.sourceVectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributions: js.UndefOr[olLib.sourceSourceMod.AttributionLike] = js.undefined
  var features: js.UndefOr[
    js.Array[olLib.featureMod.default] | olLib.collectionMod.default[olLib.featureMod.default]
  ] = js.undefined
  var format: js.UndefOr[olLib.formatFeatureMod.default] = js.undefined
  var loader: js.UndefOr[olLib.featureloaderMod.FeatureLoader] = js.undefined
  var overlaps: js.UndefOr[scala.Boolean] = js.undefined
  var strategy: js.UndefOr[LoadingStrategy] = js.undefined
  var url: js.UndefOr[java.lang.String | olLib.featureloaderMod.FeatureUrlFunction] = js.undefined
  var useSpatialIndex: js.UndefOr[scala.Boolean] = js.undefined
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    attributions: olLib.sourceSourceMod.AttributionLike = null,
    features: js.Array[olLib.featureMod.default] | olLib.collectionMod.default[olLib.featureMod.default] = null,
    format: olLib.formatFeatureMod.default = null,
    loader: olLib.featureloaderMod.FeatureLoader = null,
    overlaps: js.UndefOr[scala.Boolean] = js.undefined,
    strategy: LoadingStrategy = null,
    url: java.lang.String | olLib.featureloaderMod.FeatureUrlFunction = null,
    useSpatialIndex: js.UndefOr[scala.Boolean] = js.undefined,
    wrapX: js.UndefOr[scala.Boolean] = js.undefined
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

