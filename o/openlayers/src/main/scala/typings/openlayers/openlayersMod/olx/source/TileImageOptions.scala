package typings.openlayers.openlayersMod.olx.source

import typings.openlayers.openlayersMod.AttributionLike
import typings.openlayers.openlayersMod.ImageTile
import typings.openlayers.openlayersMod.ProjectionLike
import typings.openlayers.openlayersMod.Tile
import typings.openlayers.openlayersMod.TileCoord
import typings.openlayers.openlayersMod.TileLoadFunctionType
import typings.openlayers.openlayersMod.TileUrlFunctionType
import typings.openlayers.openlayersMod.olx.LogoOptions
import typings.openlayers.openlayersMod.proj.Projection
import typings.openlayers.openlayersMod.source.State
import typings.openlayers.openlayersMod.tilegrid.TileGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileImageOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[Double] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  var opaque: js.UndefOr[Boolean] = js.undefined
  var projection: ProjectionLike
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
  var state: js.UndefOr[State] = js.undefined
  var tileClass: js.UndefOr[
    js.Function6[
      /* n */ ImageTile, 
      /* coords */ TileCoord, 
      /* state */ typings.openlayers.openlayersMod.Tile.State, 
      /* s1 */ String, 
      /* s2 */ String, 
      /* type */ TileLoadFunctionType, 
      _
    ]
  ] = js.undefined
  var tileGrid: js.UndefOr[TileGrid] = js.undefined
  var tileLoadFunction: js.UndefOr[TileLoadFunctionType] = js.undefined
  var tilePixelRatio: js.UndefOr[Double] = js.undefined
  var tileUrlFunction: js.UndefOr[TileUrlFunctionType] = js.undefined
  var transition: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var urls: js.UndefOr[js.Array[String]] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object TileImageOptions {
  @scala.inline
  def apply(
    attributions: AttributionLike = null,
    cacheSize: Int | Double = null,
    crossOrigin: String = null,
    logo: String | LogoOptions = null,
    opaque: js.UndefOr[Boolean] = js.undefined,
    projection: ProjectionLike = null,
    reprojectionErrorThreshold: Int | Double = null,
    state: State = null,
    tileClass: (/* n */ ImageTile, /* coords */ TileCoord, /* state */ typings.openlayers.openlayersMod.Tile.State, /* s1 */ String, /* s2 */ String, /* type */ TileLoadFunctionType) => _ = null,
    tileGrid: TileGrid = null,
    tileLoadFunction: (/* tile */ Tile, /* url */ String) => Unit = null,
    tilePixelRatio: Int | Double = null,
    tileUrlFunction: (/* coords */ TileCoord, /* pixelRatio */ Double, /* proj */ Projection) => String = null,
    transition: Int | Double = null,
    url: String = null,
    urls: js.Array[String] = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): TileImageOptions = {
    val __obj = js.Dynamic.literal()
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (!js.isUndefined(opaque)) __obj.updateDynamic("opaque")(opaque)
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (reprojectionErrorThreshold != null) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    if (tileClass != null) __obj.updateDynamic("tileClass")(js.Any.fromFunction6(tileClass))
    if (tileGrid != null) __obj.updateDynamic("tileGrid")(tileGrid)
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(js.Any.fromFunction2(tileLoadFunction))
    if (tilePixelRatio != null) __obj.updateDynamic("tilePixelRatio")(tilePixelRatio.asInstanceOf[js.Any])
    if (tileUrlFunction != null) __obj.updateDynamic("tileUrlFunction")(js.Any.fromFunction3(tileUrlFunction))
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[TileImageOptions]
  }
}

