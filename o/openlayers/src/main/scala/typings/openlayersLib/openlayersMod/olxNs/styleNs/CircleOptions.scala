package typings
package openlayersLib.openlayersMod.olxNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleOptions extends js.Object {
  var atlasManager: js.UndefOr[openlayersLib.openlayersMod.styleNs.AtlasManager] = js.undefined
  var fill: js.UndefOr[openlayersLib.openlayersMod.styleNs.Fill] = js.undefined
  var radius: scala.Double
  var snapToPixel: js.UndefOr[scala.Boolean] = js.undefined
  var stroke: js.UndefOr[openlayersLib.openlayersMod.styleNs.Stroke] = js.undefined
}

object CircleOptions {
  @scala.inline
  def apply(
    radius: scala.Double,
    atlasManager: openlayersLib.openlayersMod.styleNs.AtlasManager = null,
    fill: openlayersLib.openlayersMod.styleNs.Fill = null,
    snapToPixel: js.UndefOr[scala.Boolean] = js.undefined,
    stroke: openlayersLib.openlayersMod.styleNs.Stroke = null
  ): CircleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("radius")(radius)
    if (atlasManager != null) __obj.updateDynamic("atlasManager")(atlasManager)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (!js.isUndefined(snapToPixel)) __obj.updateDynamic("snapToPixel")(snapToPixel)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    __obj.asInstanceOf[CircleOptions]
  }
}

