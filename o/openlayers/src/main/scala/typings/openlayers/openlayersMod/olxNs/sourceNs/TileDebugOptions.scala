package typings.openlayers.openlayersMod.olxNs.sourceNs

import typings.openlayers.openlayersMod.ProjectionLike
import typings.openlayers.openlayersMod.tilegridNs.TileGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileDebugOptions extends js.Object {
  var projection: ProjectionLike
  var tileGrid: js.UndefOr[TileGrid] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object TileDebugOptions {
  @scala.inline
  def apply(projection: ProjectionLike, tileGrid: TileGrid = null, wrapX: js.UndefOr[Boolean] = js.undefined): TileDebugOptions = {
    val __obj = js.Dynamic.literal(projection = projection.asInstanceOf[js.Any])
    if (tileGrid != null) __obj.updateDynamic("tileGrid")(tileGrid)
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[TileDebugOptions]
  }
}

