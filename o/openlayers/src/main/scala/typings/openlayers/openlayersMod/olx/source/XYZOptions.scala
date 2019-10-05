package typings.openlayers.openlayersMod.olx.source

import typings.openlayers.openlayersMod.AttributionLike
import typings.openlayers.openlayersMod.ProjectionLike
import typings.openlayers.openlayersMod.Size
import typings.openlayers.openlayersMod.Tile
import typings.openlayers.openlayersMod.TileCoord
import typings.openlayers.openlayersMod.TileLoadFunctionType
import typings.openlayers.openlayersMod.TileUrlFunctionType
import typings.openlayers.openlayersMod.olx.LogoOptions
import typings.openlayers.openlayersMod.proj.Projection
import typings.openlayers.openlayersMod.tilegrid.TileGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XYZOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[Double] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var opaque: js.UndefOr[Boolean] = js.undefined
  var projection: js.UndefOr[ProjectionLike] = js.undefined
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
  var tileGrid: js.UndefOr[TileGrid] = js.undefined
  var tileLoadFunction: js.UndefOr[TileLoadFunctionType] = js.undefined
  var tilePixelRatio: js.UndefOr[Double] = js.undefined
  var tileSize: js.UndefOr[Double | Size] = js.undefined
  var tileUrlFunction: js.UndefOr[TileUrlFunctionType] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var urls: js.UndefOr[js.Array[String]] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object XYZOptions {
  @scala.inline
  def apply(
    attributions: AttributionLike = null,
    cacheSize: Int | Double = null,
    crossOrigin: String = null,
    logo: String | LogoOptions = null,
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    opaque: js.UndefOr[Boolean] = js.undefined,
    projection: ProjectionLike = null,
    reprojectionErrorThreshold: Int | Double = null,
    tileGrid: TileGrid = null,
    tileLoadFunction: (/* tile */ Tile, /* url */ String) => Unit = null,
    tilePixelRatio: Int | Double = null,
    tileSize: Double | Size = null,
    tileUrlFunction: (/* coords */ TileCoord, /* pixelRatio */ Double, /* proj */ Projection) => String = null,
    url: String = null,
    urls: js.Array[String] = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
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
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(js.Any.fromFunction2(tileLoadFunction))
    if (tilePixelRatio != null) __obj.updateDynamic("tilePixelRatio")(tilePixelRatio.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (tileUrlFunction != null) __obj.updateDynamic("tileUrlFunction")(js.Any.fromFunction3(tileUrlFunction))
    if (url != null) __obj.updateDynamic("url")(url)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[XYZOptions]
  }
}

