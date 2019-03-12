package typings
package openlayersLib.openlayersMod.olxNs.sourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WMTSOptions extends js.Object {
  var attributions: js.UndefOr[openlayersLib.openlayersMod.AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[scala.Double] = js.undefined
  var crossOrigin: js.UndefOr[java.lang.String] = js.undefined
  var dimensions: js.UndefOr[openlayersLib.openlayersMod.GlobalObject] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var layer: java.lang.String
  var logo: js.UndefOr[java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions] = js.undefined
  var matrixSet: java.lang.String
  var projection: openlayersLib.openlayersMod.ProjectionLike
  var reprojectionErrorThreshold: js.UndefOr[scala.Double] = js.undefined
  var requestEncoding: js.UndefOr[openlayersLib.openlayersMod.sourceNs.WMTSRequestEncoding | java.lang.String] = js.undefined
  var style: java.lang.String
  var tileClass: js.UndefOr[
    js.Function6[
      /* n */ openlayersLib.openlayersMod.ImageTile, 
      /* coords */ openlayersLib.openlayersMod.TileCoord, 
      /* state */ openlayersLib.openlayersMod.TileNs.State, 
      /* s1 */ java.lang.String, 
      /* s2 */ java.lang.String, 
      /* type */ openlayersLib.openlayersMod.TileLoadFunctionType, 
      _
    ]
  ] = js.undefined
  var tileGrid: openlayersLib.openlayersMod.tilegridNs.WMTS
  var tileLoadFunction: js.UndefOr[openlayersLib.openlayersMod.TileLoadFunctionType] = js.undefined
  var tilePixelRatio: js.UndefOr[scala.Double] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var urls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

object WMTSOptions {
  @scala.inline
  def apply(
    layer: java.lang.String,
    matrixSet: java.lang.String,
    projection: openlayersLib.openlayersMod.ProjectionLike,
    style: java.lang.String,
    tileGrid: openlayersLib.openlayersMod.tilegridNs.WMTS,
    attributions: openlayersLib.openlayersMod.AttributionLike = null,
    cacheSize: scala.Int | scala.Double = null,
    crossOrigin: java.lang.String = null,
    dimensions: openlayersLib.openlayersMod.GlobalObject = null,
    format: java.lang.String = null,
    logo: java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions = null,
    reprojectionErrorThreshold: scala.Int | scala.Double = null,
    requestEncoding: openlayersLib.openlayersMod.sourceNs.WMTSRequestEncoding | java.lang.String = null,
    tileClass: (/* n */ openlayersLib.openlayersMod.ImageTile, /* coords */ openlayersLib.openlayersMod.TileCoord, /* state */ openlayersLib.openlayersMod.TileNs.State, /* s1 */ java.lang.String, /* s2 */ java.lang.String, /* type */ openlayersLib.openlayersMod.TileLoadFunctionType) => _ = null,
    tileLoadFunction: openlayersLib.openlayersMod.TileLoadFunctionType = null,
    tilePixelRatio: scala.Int | scala.Double = null,
    url: java.lang.String = null,
    urls: js.Array[java.lang.String] = null,
    version: java.lang.String = null,
    wrapX: js.UndefOr[scala.Boolean] = js.undefined
  ): WMTSOptions = {
    val __obj = js.Dynamic.literal(layer = layer, matrixSet = matrixSet, projection = projection.asInstanceOf[js.Any], style = style, tileGrid = tileGrid)
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (format != null) __obj.updateDynamic("format")(format)
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (reprojectionErrorThreshold != null) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.asInstanceOf[js.Any])
    if (requestEncoding != null) __obj.updateDynamic("requestEncoding")(requestEncoding.asInstanceOf[js.Any])
    if (tileClass != null) __obj.updateDynamic("tileClass")(js.Any.fromFunction6(tileClass))
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(tileLoadFunction)
    if (tilePixelRatio != null) __obj.updateDynamic("tilePixelRatio")(tilePixelRatio.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    if (version != null) __obj.updateDynamic("version")(version)
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[WMTSOptions]
  }
}

