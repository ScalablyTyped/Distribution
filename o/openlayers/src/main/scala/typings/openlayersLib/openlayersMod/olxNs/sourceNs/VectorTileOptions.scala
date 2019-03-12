package typings
package openlayersLib.openlayersMod.olxNs.sourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorTileOptions extends js.Object {
  var attributions: js.UndefOr[openlayersLib.openlayersMod.AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[scala.Double] = js.undefined
  var format: js.UndefOr[openlayersLib.openlayersMod.formatNs.Feature] = js.undefined
  var logo: js.UndefOr[java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions] = js.undefined
  var overlaps: js.UndefOr[scala.Boolean] = js.undefined
  var projection: openlayersLib.openlayersMod.ProjectionLike
  var state: js.UndefOr[openlayersLib.openlayersMod.sourceNs.State] = js.undefined
  var tileClass: js.UndefOr[
    js.Function6[
      /* n */ openlayersLib.openlayersMod.VectorTile, 
      /* coords */ openlayersLib.openlayersMod.TileCoord, 
      /* state */ openlayersLib.openlayersMod.TileNs.State, 
      /* s */ java.lang.String, 
      /* feature */ openlayersLib.openlayersMod.formatNs.Feature, 
      /* type */ openlayersLib.openlayersMod.TileLoadFunctionType, 
      _
    ]
  ] = js.undefined
  var tileGrid: js.UndefOr[openlayersLib.openlayersMod.tilegridNs.TileGrid] = js.undefined
  var tileLoadFunction: js.UndefOr[openlayersLib.openlayersMod.TileLoadFunctionType] = js.undefined
  var tileUrlFunction: js.UndefOr[openlayersLib.openlayersMod.TileUrlFunctionType] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var urls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

object VectorTileOptions {
  @scala.inline
  def apply(
    projection: openlayersLib.openlayersMod.ProjectionLike,
    attributions: openlayersLib.openlayersMod.AttributionLike = null,
    cacheSize: scala.Int | scala.Double = null,
    format: openlayersLib.openlayersMod.formatNs.Feature = null,
    logo: java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions = null,
    overlaps: js.UndefOr[scala.Boolean] = js.undefined,
    state: openlayersLib.openlayersMod.sourceNs.State = null,
    tileClass: (/* n */ openlayersLib.openlayersMod.VectorTile, /* coords */ openlayersLib.openlayersMod.TileCoord, /* state */ openlayersLib.openlayersMod.TileNs.State, /* s */ java.lang.String, /* feature */ openlayersLib.openlayersMod.formatNs.Feature, /* type */ openlayersLib.openlayersMod.TileLoadFunctionType) => _ = null,
    tileGrid: openlayersLib.openlayersMod.tilegridNs.TileGrid = null,
    tileLoadFunction: openlayersLib.openlayersMod.TileLoadFunctionType = null,
    tileUrlFunction: openlayersLib.openlayersMod.TileUrlFunctionType = null,
    url: java.lang.String = null,
    urls: js.Array[java.lang.String] = null,
    wrapX: js.UndefOr[scala.Boolean] = js.undefined
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

