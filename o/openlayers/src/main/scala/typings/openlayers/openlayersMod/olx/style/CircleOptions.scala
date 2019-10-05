package typings.openlayers.openlayersMod.olx.style

import typings.openlayers.openlayersMod.style.AtlasManager
import typings.openlayers.openlayersMod.style.Fill
import typings.openlayers.openlayersMod.style.Stroke
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleOptions extends js.Object {
  var atlasManager: js.UndefOr[AtlasManager] = js.undefined
  var fill: js.UndefOr[Fill] = js.undefined
  var radius: Double
  var snapToPixel: js.UndefOr[Boolean] = js.undefined
  var stroke: js.UndefOr[Stroke] = js.undefined
}

object CircleOptions {
  @scala.inline
  def apply(
    radius: Double,
    atlasManager: AtlasManager = null,
    fill: Fill = null,
    snapToPixel: js.UndefOr[Boolean] = js.undefined,
    stroke: Stroke = null
  ): CircleOptions = {
    val __obj = js.Dynamic.literal(radius = radius)
    if (atlasManager != null) __obj.updateDynamic("atlasManager")(atlasManager)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (!js.isUndefined(snapToPixel)) __obj.updateDynamic("snapToPixel")(snapToPixel)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    __obj.asInstanceOf[CircleOptions]
  }
}

