package typings
package openlayersLib.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceTileOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[scala.Double] = js.undefined
  var extent: js.UndefOr[Extent] = js.undefined
  var logo: js.UndefOr[java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions] = js.undefined
  var opaque: js.UndefOr[scala.Boolean] = js.undefined
  var projection: ProjectionLike
  var state: js.UndefOr[openlayersLib.openlayersMod.sourceNs.State] = js.undefined
  var tileGrid: js.UndefOr[openlayersLib.openlayersMod.tilegridNs.TileGrid] = js.undefined
  var tilePixelRatio: js.UndefOr[scala.Double] = js.undefined
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

object SourceTileOptions {
  @scala.inline
  def apply(
    projection: ProjectionLike,
    attributions: AttributionLike = null,
    cacheSize: scala.Int | scala.Double = null,
    extent: Extent = null,
    logo: java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions = null,
    opaque: js.UndefOr[scala.Boolean] = js.undefined,
    state: openlayersLib.openlayersMod.sourceNs.State = null,
    tileGrid: openlayersLib.openlayersMod.tilegridNs.TileGrid = null,
    tilePixelRatio: scala.Int | scala.Double = null,
    wrapX: js.UndefOr[scala.Boolean] = js.undefined
  ): SourceTileOptions = {
    val __obj = js.Dynamic.literal(projection = projection.asInstanceOf[js.Any])
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (!js.isUndefined(opaque)) __obj.updateDynamic("opaque")(opaque)
    if (state != null) __obj.updateDynamic("state")(state)
    if (tileGrid != null) __obj.updateDynamic("tileGrid")(tileGrid)
    if (tilePixelRatio != null) __obj.updateDynamic("tilePixelRatio")(tilePixelRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[SourceTileOptions]
  }
}

