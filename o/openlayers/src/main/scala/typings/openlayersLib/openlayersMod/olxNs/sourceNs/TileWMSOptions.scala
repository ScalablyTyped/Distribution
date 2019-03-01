package typings
package openlayersLib.openlayersMod.olxNs.sourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileWMSOptions extends js.Object {
  var attributions: js.UndefOr[openlayersLib.openlayersMod.AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[scala.Double] = js.undefined
  var crossOrigin: js.UndefOr[java.lang.String] = js.undefined
  var gutter: js.UndefOr[scala.Double] = js.undefined
  var hidpi: js.UndefOr[scala.Boolean] = js.undefined
  var logo: js.UndefOr[java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions] = js.undefined
  var params: org.scalablytyped.runtime.StringDictionary[js.Any]
  var projection: js.UndefOr[openlayersLib.openlayersMod.ProjectionLike] = js.undefined
  var reprojectionErrorThreshold: js.UndefOr[scala.Double] = js.undefined
  var serverType: js.UndefOr[openlayersLib.openlayersMod.sourceNs.wmsNs.ServerType | java.lang.String] = js.undefined
  var tileGrid: js.UndefOr[openlayersLib.openlayersMod.tilegridNs.TileGrid] = js.undefined
  var tileLoadFunction: js.UndefOr[openlayersLib.openlayersMod.TileLoadFunctionType] = js.undefined
  var transition: js.UndefOr[scala.Double] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var urls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

object TileWMSOptions {
  @scala.inline
  def apply(
    params: org.scalablytyped.runtime.StringDictionary[js.Any],
    attributions: openlayersLib.openlayersMod.AttributionLike = null,
    cacheSize: scala.Int | scala.Double = null,
    crossOrigin: java.lang.String = null,
    gutter: scala.Int | scala.Double = null,
    hidpi: js.UndefOr[scala.Boolean] = js.undefined,
    logo: java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions = null,
    projection: openlayersLib.openlayersMod.ProjectionLike = null,
    reprojectionErrorThreshold: scala.Int | scala.Double = null,
    serverType: openlayersLib.openlayersMod.sourceNs.wmsNs.ServerType | java.lang.String = null,
    tileGrid: openlayersLib.openlayersMod.tilegridNs.TileGrid = null,
    tileLoadFunction: openlayersLib.openlayersMod.TileLoadFunctionType = null,
    transition: scala.Int | scala.Double = null,
    url: java.lang.String = null,
    urls: js.Array[java.lang.String] = null,
    wrapX: js.UndefOr[scala.Boolean] = js.undefined
  ): TileWMSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("params")(params)
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (!js.isUndefined(hidpi)) __obj.updateDynamic("hidpi")(hidpi)
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (reprojectionErrorThreshold != null) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.asInstanceOf[js.Any])
    if (serverType != null) __obj.updateDynamic("serverType")(serverType.asInstanceOf[js.Any])
    if (tileGrid != null) __obj.updateDynamic("tileGrid")(tileGrid)
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(tileLoadFunction)
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[TileWMSOptions]
  }
}

