package typings.openlayers.mod.olx.source

import typings.openlayers.mod.ProjectionLike
import typings.openlayers.mod.tilegrid.TileGrid
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
  def apply(
    projection: ProjectionLike = null,
    tileGrid: TileGrid = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): TileDebugOptions = {
    val __obj = js.Dynamic.literal()
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (tileGrid != null) __obj.updateDynamic("tileGrid")(tileGrid.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileDebugOptions]
  }
}

