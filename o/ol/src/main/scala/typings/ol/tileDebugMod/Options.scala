package typings.ol.tileDebugMod

import typings.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var projection: js.UndefOr[ProjectionLike] = js.undefined
  var tileGrid: js.UndefOr[typings.ol.tilegridTileGridMod.default] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
  var zDirection: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    projection: ProjectionLike = null,
    tileGrid: typings.ol.tilegridTileGridMod.default = null,
    wrapX: js.UndefOr[Boolean] = js.undefined,
    zDirection: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (tileGrid != null) __obj.updateDynamic("tileGrid")(tileGrid.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zDirection)) __obj.updateDynamic("zDirection")(zDirection.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

