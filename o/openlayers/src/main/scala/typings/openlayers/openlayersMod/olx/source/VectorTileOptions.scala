package typings.openlayers.openlayersMod.olx.source

import typings.openlayers.openlayersMod.AttributionLike
import typings.openlayers.openlayersMod.ProjectionLike
import typings.openlayers.openlayersMod.Tile
import typings.openlayers.openlayersMod.TileCoord
import typings.openlayers.openlayersMod.TileLoadFunctionType
import typings.openlayers.openlayersMod.TileUrlFunctionType
import typings.openlayers.openlayersMod.VectorTile
import typings.openlayers.openlayersMod.olx.LogoOptions
import typings.openlayers.openlayersMod.proj.Projection
import typings.openlayers.openlayersMod.source.State
import typings.openlayers.openlayersMod.tilegrid.TileGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorTileOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[Double] = js.undefined
  var format: js.UndefOr[typings.openlayers.openlayersMod.format.Feature] = js.undefined
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  var overlaps: js.UndefOr[Boolean] = js.undefined
  var projection: ProjectionLike
  var state: js.UndefOr[State] = js.undefined
  var tileClass: js.UndefOr[
    js.Function6[
      /* n */ VectorTile, 
      /* coords */ TileCoord, 
      /* state */ typings.openlayers.openlayersMod.Tile.State, 
      /* s */ String, 
      /* feature */ typings.openlayers.openlayersMod.format.Feature, 
      /* type */ TileLoadFunctionType, 
      _
    ]
  ] = js.undefined
  var tileGrid: js.UndefOr[TileGrid] = js.undefined
  var tileLoadFunction: js.UndefOr[TileLoadFunctionType] = js.undefined
  var tileUrlFunction: js.UndefOr[TileUrlFunctionType] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var urls: js.UndefOr[js.Array[String]] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object VectorTileOptions {
  @scala.inline
  def apply(
    attributions: AttributionLike = null,
    cacheSize: Int | Double = null,
    format: typings.openlayers.openlayersMod.format.Feature = null,
    logo: String | LogoOptions = null,
    overlaps: js.UndefOr[Boolean] = js.undefined,
    projection: ProjectionLike = null,
    state: State = null,
    tileClass: (/* n */ VectorTile, /* coords */ TileCoord, /* state */ typings.openlayers.openlayersMod.Tile.State, /* s */ String, /* feature */ typings.openlayers.openlayersMod.format.Feature, /* type */ TileLoadFunctionType) => _ = null,
    tileGrid: TileGrid = null,
    tileLoadFunction: (/* tile */ Tile, /* url */ String) => Unit = null,
    tileUrlFunction: (/* coords */ TileCoord, /* pixelRatio */ Double, /* proj */ Projection) => String = null,
    url: String = null,
    urls: js.Array[String] = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): VectorTileOptions = {
    val __obj = js.Dynamic.literal()
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (!js.isUndefined(overlaps)) __obj.updateDynamic("overlaps")(overlaps)
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    if (tileClass != null) __obj.updateDynamic("tileClass")(js.Any.fromFunction6(tileClass))
    if (tileGrid != null) __obj.updateDynamic("tileGrid")(tileGrid)
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(js.Any.fromFunction2(tileLoadFunction))
    if (tileUrlFunction != null) __obj.updateDynamic("tileUrlFunction")(js.Any.fromFunction3(tileUrlFunction))
    if (url != null) __obj.updateDynamic("url")(url)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[VectorTileOptions]
  }
}

