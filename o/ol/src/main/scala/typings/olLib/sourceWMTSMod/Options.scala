package typings
package olLib.sourceWMTSMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributions: js.UndefOr[olLib.sourceSourceMod.AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[scala.Double] = js.undefined
  var crossOrigin: js.UndefOr[java.lang.String] = js.undefined
  var dimensions: js.UndefOr[js.Any] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var layer: java.lang.String
  var matrixSet: java.lang.String
  var projection: js.UndefOr[olLib.projMod.ProjectionLike] = js.undefined
  var reprojectionErrorThreshold: js.UndefOr[scala.Double] = js.undefined
  var requestEncoding: js.UndefOr[olLib.sourceWMTSRequestEncodingMod.WMTSRequestEncoding | java.lang.String] = js.undefined
  var style: java.lang.String
  var tileClass: js.UndefOr[olLib.imageTileMod.default] = js.undefined
  var tileGrid: olLib.tilegridWMTSMod.default
  var tileLoadFunction: js.UndefOr[olLib.tileMod.LoadFunction] = js.undefined
  var tilePixelRatio: js.UndefOr[scala.Double] = js.undefined
  var transition: js.UndefOr[scala.Double] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var urls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    layer: java.lang.String,
    matrixSet: java.lang.String,
    style: java.lang.String,
    tileGrid: olLib.tilegridWMTSMod.default,
    attributions: olLib.sourceSourceMod.AttributionLike = null,
    cacheSize: scala.Int | scala.Double = null,
    crossOrigin: java.lang.String = null,
    dimensions: js.Any = null,
    format: java.lang.String = null,
    projection: olLib.projMod.ProjectionLike = null,
    reprojectionErrorThreshold: scala.Int | scala.Double = null,
    requestEncoding: olLib.sourceWMTSRequestEncodingMod.WMTSRequestEncoding | java.lang.String = null,
    tileClass: olLib.imageTileMod.default = null,
    tileLoadFunction: olLib.tileMod.LoadFunction = null,
    tilePixelRatio: scala.Int | scala.Double = null,
    transition: scala.Int | scala.Double = null,
    url: java.lang.String = null,
    urls: js.Array[java.lang.String] = null,
    version: java.lang.String = null,
    wrapX: js.UndefOr[scala.Boolean] = js.undefined
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
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(tileLoadFunction)
    if (tilePixelRatio != null) __obj.updateDynamic("tilePixelRatio")(tilePixelRatio.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    if (version != null) __obj.updateDynamic("version")(version)
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[Options]
  }
}

