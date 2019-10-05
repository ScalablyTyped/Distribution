package typings.ol.sourceXYZMod

import typings.ol.projMod.ProjectionLike
import typings.ol.sizeMod.Size
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.tileMod.LoadFunction
import typings.ol.tileMod.Tile
import typings.ol.tileMod.UrlFunction
import typings.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var attributionsCollapsible: js.UndefOr[Boolean] = js.undefined
  var cacheSize: js.UndefOr[Double] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var opaque: js.UndefOr[Boolean] = js.undefined
  var projection: js.UndefOr[ProjectionLike] = js.undefined
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
  var tileGrid: js.UndefOr[typings.ol.tilegridTileGridMod.default] = js.undefined
  var tileLoadFunction: js.UndefOr[LoadFunction] = js.undefined
  var tilePixelRatio: js.UndefOr[Double] = js.undefined
  var tileSize: js.UndefOr[Double | Size] = js.undefined
  var tileUrlFunction: js.UndefOr[UrlFunction] = js.undefined
  var transition: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var urls: js.UndefOr[js.Array[String]] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    attributions: AttributionLike = null,
    attributionsCollapsible: js.UndefOr[Boolean] = js.undefined,
    cacheSize: Int | Double = null,
    crossOrigin: String = null,
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    opaque: js.UndefOr[Boolean] = js.undefined,
    projection: ProjectionLike = null,
    reprojectionErrorThreshold: Int | Double = null,
    tileGrid: typings.ol.tilegridTileGridMod.default = null,
    tileLoadFunction: (/* p0 */ Tile, /* p1 */ String) => Unit = null,
    tilePixelRatio: Int | Double = null,
    tileSize: Double | Size = null,
    tileUrlFunction: (/* p0 */ TileCoord, /* p1 */ Double, /* p2 */ typings.ol.projProjectionMod.default) => js.UndefOr[String] = null,
    transition: Int | Double = null,
    url: String = null,
    urls: js.Array[String] = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (!js.isUndefined(attributionsCollapsible)) __obj.updateDynamic("attributionsCollapsible")(attributionsCollapsible)
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(opaque)) __obj.updateDynamic("opaque")(opaque)
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (reprojectionErrorThreshold != null) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.asInstanceOf[js.Any])
    if (tileGrid != null) __obj.updateDynamic("tileGrid")(tileGrid)
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(js.Any.fromFunction2(tileLoadFunction))
    if (tilePixelRatio != null) __obj.updateDynamic("tilePixelRatio")(tilePixelRatio.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (tileUrlFunction != null) __obj.updateDynamic("tileUrlFunction")(js.Any.fromFunction3(tileUrlFunction))
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[Options]
  }
}

