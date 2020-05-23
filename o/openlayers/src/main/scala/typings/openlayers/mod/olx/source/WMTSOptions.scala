package typings.openlayers.mod.olx.source

import typings.openlayers.mod.AttributionLike
import typings.openlayers.mod.GlobalObject
import typings.openlayers.mod.ImageTile
import typings.openlayers.mod.ProjectionLike
import typings.openlayers.mod.Tile
import typings.openlayers.mod.Tile.State
import typings.openlayers.mod.TileCoord
import typings.openlayers.mod.TileLoadFunctionType
import typings.openlayers.mod.olx.LogoOptions
import typings.openlayers.mod.source.WMTSRequestEncoding
import typings.openlayers.mod.tilegrid.WMTS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WMTSOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[Double] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var dimensions: js.UndefOr[GlobalObject] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var layer: String
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  var matrixSet: String
  var projection: ProjectionLike
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
  var requestEncoding: js.UndefOr[WMTSRequestEncoding | String] = js.undefined
  var style: String
  var tileClass: js.UndefOr[
    js.Function6[
      /* n */ ImageTile, 
      /* coords */ TileCoord, 
      /* state */ State, 
      /* s1 */ String, 
      /* s2 */ String, 
      /* type */ TileLoadFunctionType, 
      _
    ]
  ] = js.undefined
  var tileGrid: WMTS
  var tileLoadFunction: js.UndefOr[TileLoadFunctionType] = js.undefined
  var tilePixelRatio: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var urls: js.UndefOr[js.Array[String]] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object WMTSOptions {
  @scala.inline
  def apply(
    layer: String,
    matrixSet: String,
    style: String,
    tileGrid: WMTS,
    attributions: AttributionLike = null,
    cacheSize: js.UndefOr[Double] = js.undefined,
    crossOrigin: String = null,
    dimensions: GlobalObject = null,
    format: String = null,
    logo: String | LogoOptions = null,
    projection: ProjectionLike = null,
    reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined,
    requestEncoding: WMTSRequestEncoding | String = null,
    tileClass: (/* n */ ImageTile, /* coords */ TileCoord, /* state */ State, /* s1 */ String, /* s2 */ String, /* type */ TileLoadFunctionType) => _ = null,
    tileLoadFunction: (/* tile */ Tile, /* url */ String) => Unit = null,
    tilePixelRatio: js.UndefOr[Double] = js.undefined,
    url: String = null,
    urls: js.Array[String] = null,
    version: String = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): WMTSOptions = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], matrixSet = matrixSet.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tileGrid = tileGrid.asInstanceOf[js.Any])
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheSize)) __obj.updateDynamic("cacheSize")(cacheSize.get.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(reprojectionErrorThreshold)) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.get.asInstanceOf[js.Any])
    if (requestEncoding != null) __obj.updateDynamic("requestEncoding")(requestEncoding.asInstanceOf[js.Any])
    if (tileClass != null) __obj.updateDynamic("tileClass")(js.Any.fromFunction6(tileClass))
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(js.Any.fromFunction2(tileLoadFunction))
    if (!js.isUndefined(tilePixelRatio)) __obj.updateDynamic("tilePixelRatio")(tilePixelRatio.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WMTSOptions]
  }
}

