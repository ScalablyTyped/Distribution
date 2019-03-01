package typings
package openlayersLib.openlayersMod.olxNs.sourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorOptions extends js.Object {
  var attributions: js.UndefOr[openlayersLib.openlayersMod.AttributionLike] = js.undefined
  var features: js.UndefOr[
    js.Array[openlayersLib.openlayersMod.Feature] | openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.Feature]
  ] = js.undefined
  var format: js.UndefOr[openlayersLib.openlayersMod.formatNs.Feature] = js.undefined
  var loader: js.UndefOr[openlayersLib.openlayersMod.FeatureLoader] = js.undefined
  var logo: js.UndefOr[java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions] = js.undefined
  var overlaps: js.UndefOr[scala.Boolean] = js.undefined
  var strategy: js.UndefOr[openlayersLib.openlayersMod.LoadingStrategy] = js.undefined
  var url: js.UndefOr[java.lang.String | openlayersLib.openlayersMod.FeatureUrlFunction] = js.undefined
  var useSpatialIndex: js.UndefOr[scala.Boolean] = js.undefined
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

object VectorOptions {
  @scala.inline
  def apply(
    attributions: openlayersLib.openlayersMod.AttributionLike = null,
    features: js.Array[openlayersLib.openlayersMod.Feature] | openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.Feature] = null,
    format: openlayersLib.openlayersMod.formatNs.Feature = null,
    loader: openlayersLib.openlayersMod.FeatureLoader = null,
    logo: java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions = null,
    overlaps: js.UndefOr[scala.Boolean] = js.undefined,
    strategy: openlayersLib.openlayersMod.LoadingStrategy = null,
    url: java.lang.String | openlayersLib.openlayersMod.FeatureUrlFunction = null,
    useSpatialIndex: js.UndefOr[scala.Boolean] = js.undefined,
    wrapX: js.UndefOr[scala.Boolean] = js.undefined
  ): VectorOptions = {
    val __obj = js.Dynamic.literal()
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (loader != null) __obj.updateDynamic("loader")(loader)
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (!js.isUndefined(overlaps)) __obj.updateDynamic("overlaps")(overlaps)
    if (strategy != null) __obj.updateDynamic("strategy")(strategy)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(useSpatialIndex)) __obj.updateDynamic("useSpatialIndex")(useSpatialIndex)
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[VectorOptions]
  }
}

