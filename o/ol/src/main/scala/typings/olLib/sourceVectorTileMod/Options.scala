package typings
package olLib.sourceVectorTileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributions: js.UndefOr[olLib.sourceSourceMod.AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[scala.Double] = js.undefined
  var extent: js.UndefOr[olLib.extentMod.Extent] = js.undefined
  var format: js.UndefOr[olLib.formatFeatureMod.default] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  var overlaps: js.UndefOr[scala.Boolean] = js.undefined
  var projection: js.UndefOr[olLib.projMod.ProjectionLike] = js.undefined
  var state: js.UndefOr[olLib.sourceStateMod.State] = js.undefined
  var tileClass: js.UndefOr[olLib.vectorTileMod.default] = js.undefined
  var tileGrid: js.UndefOr[olLib.tilegridTileGridMod.default] = js.undefined
  var tileLoadFunction: js.UndefOr[olLib.tileMod.LoadFunction] = js.undefined
  var tileSize: js.UndefOr[scala.Double | olLib.sizeMod.Size] = js.undefined
  var tileUrlFunction: js.UndefOr[olLib.tileMod.UrlFunction] = js.undefined
  var transition: js.UndefOr[scala.Double] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var urls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    attributions: olLib.sourceSourceMod.AttributionLike = null,
    cacheSize: scala.Int | scala.Double = null,
    extent: olLib.extentMod.Extent = null,
    format: olLib.formatFeatureMod.default = null,
    maxZoom: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    overlaps: js.UndefOr[scala.Boolean] = js.undefined,
    projection: olLib.projMod.ProjectionLike = null,
    state: olLib.sourceStateMod.State = null,
    tileClass: olLib.vectorTileMod.default = null,
    tileGrid: olLib.tilegridTileGridMod.default = null,
    tileLoadFunction: olLib.tileMod.LoadFunction = null,
    tileSize: scala.Double | olLib.sizeMod.Size = null,
    tileUrlFunction: olLib.tileMod.UrlFunction = null,
    transition: scala.Int | scala.Double = null,
    url: java.lang.String = null,
    urls: js.Array[java.lang.String] = null,
    wrapX: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (format != null) __obj.updateDynamic("format")(format)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(overlaps)) __obj.updateDynamic("overlaps")(overlaps)
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    if (tileClass != null) __obj.updateDynamic("tileClass")(tileClass)
    if (tileGrid != null) __obj.updateDynamic("tileGrid")(tileGrid)
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(tileLoadFunction)
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (tileUrlFunction != null) __obj.updateDynamic("tileUrlFunction")(tileUrlFunction)
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[Options]
  }
}

