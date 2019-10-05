package typings.ol.sourceWMTSMod

import typings.ol.projMod.ProjectionLike
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.sourceWMTSRequestEncodingMod.WMTSRequestEncoding
import typings.ol.tileMod.LoadFunction
import typings.ol.tileMod.Tile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[Double] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var dimensions: js.UndefOr[js.Any] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var layer: String
  var matrixSet: String
  var projection: js.UndefOr[ProjectionLike] = js.undefined
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
  var requestEncoding: js.UndefOr[WMTSRequestEncoding | String] = js.undefined
  var style: String
  var tileClass: js.UndefOr[typings.ol.imageTileMod.default] = js.undefined
  var tileGrid: typings.ol.tilegridWMTSMod.default
  var tileLoadFunction: js.UndefOr[LoadFunction] = js.undefined
  var tilePixelRatio: js.UndefOr[Double] = js.undefined
  var transition: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var urls: js.UndefOr[js.Array[String]] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    layer: String,
    matrixSet: String,
    style: String,
    tileGrid: typings.ol.tilegridWMTSMod.default,
    attributions: AttributionLike = null,
    cacheSize: Int | Double = null,
    crossOrigin: String = null,
    dimensions: js.Any = null,
    format: String = null,
    projection: ProjectionLike = null,
    reprojectionErrorThreshold: Int | Double = null,
    requestEncoding: WMTSRequestEncoding | String = null,
    tileClass: typings.ol.imageTileMod.default = null,
    tileLoadFunction: (/* p0 */ Tile, /* p1 */ String) => Unit = null,
    tilePixelRatio: Int | Double = null,
    transition: Int | Double = null,
    url: String = null,
    urls: js.Array[String] = null,
    version: String = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(layer = layer, matrixSet = matrixSet, style = style, tileGrid = tileGrid)
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (format != null) __obj.updateDynamic("format")(format)
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (reprojectionErrorThreshold != null) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.asInstanceOf[js.Any])
    if (requestEncoding != null) __obj.updateDynamic("requestEncoding")(requestEncoding.asInstanceOf[js.Any])
    if (tileClass != null) __obj.updateDynamic("tileClass")(tileClass)
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(js.Any.fromFunction2(tileLoadFunction))
    if (tilePixelRatio != null) __obj.updateDynamic("tilePixelRatio")(tilePixelRatio.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    if (version != null) __obj.updateDynamic("version")(version)
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[Options]
  }
}

