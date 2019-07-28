package typings.openlayers.openlayersMod.olxNs.sourceNs

import typings.openlayers.openlayersMod.AttributionLike
import typings.openlayers.openlayersMod.ProjectionLike
import typings.openlayers.openlayersMod.TileCoord
import typings.openlayers.openlayersMod.TileLoadFunctionType
import typings.openlayers.openlayersMod.TileUrlFunctionType
import typings.openlayers.openlayersMod.VectorTile
import typings.openlayers.openlayersMod.olxNs.LogoOptions
import typings.openlayers.openlayersMod.sourceNs.State
import typings.openlayers.openlayersMod.tilegridNs.TileGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorTileOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[Double] = js.undefined
  var format: js.UndefOr[typings.openlayers.openlayersMod.formatNs.Feature] = js.undefined
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  var overlaps: js.UndefOr[Boolean] = js.undefined
  var projection: ProjectionLike
  var state: js.UndefOr[State] = js.undefined
  var tileClass: js.UndefOr[
    js.Function6[
      /* n */ VectorTile, 
      /* coords */ TileCoord, 
      /* state */ typings.openlayers.openlayersMod.TileNs.State, 
      /* s */ String, 
      /* feature */ typings.openlayers.openlayersMod.formatNs.Feature, 
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
    projection: ProjectionLike,
    attributions: AttributionLike = null,
    cacheSize: Int | Double = null,
    format: typings.openlayers.openlayersMod.formatNs.Feature = null,
    logo: String | LogoOptions = null,
    overlaps: js.UndefOr[Boolean] = js.undefined,
    state: State = null,
    tileClass: (/* n */ VectorTile, /* coords */ TileCoord, /* state */ typings.openlayers.openlayersMod.TileNs.State, /* s */ String, /* feature */ typings.openlayers.openlayersMod.formatNs.Feature, /* type */ TileLoadFunctionType) => _ = null,
    tileGrid: TileGrid = null,
    tileLoadFunction: TileLoadFunctionType = null,
    tileUrlFunction: TileUrlFunctionType = null,
    url: String = null,
    urls: js.Array[String] = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): VectorTileOptions = {
    val __obj = js.Dynamic.literal(projection = projection.asInstanceOf[js.Any])
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (!js.isUndefined(overlaps)) __obj.updateDynamic("overlaps")(overlaps)
    if (state != null) __obj.updateDynamic("state")(state)
    if (tileClass != null) __obj.updateDynamic("tileClass")(js.Any.fromFunction6(tileClass))
    if (tileGrid != null) __obj.updateDynamic("tileGrid")(tileGrid)
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(tileLoadFunction)
    if (tileUrlFunction != null) __obj.updateDynamic("tileUrlFunction")(tileUrlFunction)
    if (url != null) __obj.updateDynamic("url")(url)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[VectorTileOptions]
  }
}

