package typings
package openlayersLib.openlayersMod.olxNs.sourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XYZOptions extends js.Object {
  var attributions: js.UndefOr[openlayersLib.openlayersMod.AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[scala.Double] = js.undefined
  var crossOrigin: js.UndefOr[java.lang.String] = js.undefined
  var logo: js.UndefOr[java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  var opaque: js.UndefOr[scala.Boolean] = js.undefined
  var projection: js.UndefOr[openlayersLib.openlayersMod.ProjectionLike] = js.undefined
  var reprojectionErrorThreshold: js.UndefOr[scala.Double] = js.undefined
  var tileGrid: js.UndefOr[openlayersLib.openlayersMod.tilegridNs.TileGrid] = js.undefined
  var tileLoadFunction: js.UndefOr[openlayersLib.openlayersMod.TileLoadFunctionType] = js.undefined
  var tilePixelRatio: js.UndefOr[scala.Double] = js.undefined
  var tileSize: js.UndefOr[scala.Double | openlayersLib.openlayersMod.Size] = js.undefined
  var tileUrlFunction: js.UndefOr[openlayersLib.openlayersMod.TileUrlFunctionType] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var urls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

object XYZOptions {
  @scala.inline
  def apply(
    attributions: openlayersLib.openlayersMod.AttributionLike = null,
    cacheSize: scala.Int | scala.Double = null,
    crossOrigin: java.lang.String = null,
    logo: java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions = null,
    maxZoom: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    opaque: js.UndefOr[scala.Boolean] = js.undefined,
    projection: openlayersLib.openlayersMod.ProjectionLike = null,
    reprojectionErrorThreshold: scala.Int | scala.Double = null,
    tileGrid: openlayersLib.openlayersMod.tilegridNs.TileGrid = null,
    tileLoadFunction: openlayersLib.openlayersMod.TileLoadFunctionType = null,
    tilePixelRatio: scala.Int | scala.Double = null,
    tileSize: scala.Double | openlayersLib.openlayersMod.Size = null,
    tileUrlFunction: openlayersLib.openlayersMod.TileUrlFunctionType = null,
    url: java.lang.String = null,
    urls: js.Array[java.lang.String] = null,
    wrapX: js.UndefOr[scala.Boolean] = js.undefined
  ): XYZOptions = {
    val __obj = js.Dynamic.literal()
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(opaque)) __obj.updateDynamic("opaque")(opaque)
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (reprojectionErrorThreshold != null) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.asInstanceOf[js.Any])
    if (tileGrid != null) __obj.updateDynamic("tileGrid")(tileGrid)
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(tileLoadFunction)
    if (tilePixelRatio != null) __obj.updateDynamic("tilePixelRatio")(tilePixelRatio.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (tileUrlFunction != null) __obj.updateDynamic("tileUrlFunction")(tileUrlFunction)
    if (url != null) __obj.updateDynamic("url")(url)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[XYZOptions]
  }
}

