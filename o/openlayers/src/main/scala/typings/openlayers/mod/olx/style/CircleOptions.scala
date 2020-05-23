package typings.openlayers.mod.olx.style

import typings.openlayers.mod.style.AtlasManager
import typings.openlayers.mod.style.Fill
import typings.openlayers.mod.style.Stroke
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
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any])
    if (atlasManager != null) __obj.updateDynamic("atlasManager")(atlasManager.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(snapToPixel)) __obj.updateDynamic("snapToPixel")(snapToPixel.get.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleOptions]
  }
}

