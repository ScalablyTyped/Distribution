package typings
package openlayersLib.openlayersMod.olxNs.sourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileDebugOptions extends js.Object {
  var projection: openlayersLib.openlayersMod.ProjectionLike
  var tileGrid: js.UndefOr[openlayersLib.openlayersMod.tilegridNs.TileGrid] = js.undefined
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

object TileDebugOptions {
  @scala.inline
  def apply(
    projection: openlayersLib.openlayersMod.ProjectionLike,
    tileGrid: openlayersLib.openlayersMod.tilegridNs.TileGrid = null,
    wrapX: js.UndefOr[scala.Boolean] = js.undefined
  ): TileDebugOptions = {
    val __obj = js.Dynamic.literal(projection = projection.asInstanceOf[js.Any])
    if (tileGrid != null) __obj.updateDynamic("tileGrid")(tileGrid)
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[TileDebugOptions]
  }
}

