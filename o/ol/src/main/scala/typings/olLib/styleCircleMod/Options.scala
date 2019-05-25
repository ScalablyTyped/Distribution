package typings
package olLib.styleCircleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var atlasManager: js.UndefOr[olLib.styleAtlasManagerMod.default] = js.undefined
  var fill: js.UndefOr[olLib.styleFillMod.default] = js.undefined
  var radius: scala.Double
  var stroke: js.UndefOr[olLib.styleStrokeMod.default] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    radius: scala.Double,
    atlasManager: olLib.styleAtlasManagerMod.default = null,
    fill: olLib.styleFillMod.default = null,
    stroke: olLib.styleStrokeMod.default = null
  ): Options = {
    val __obj = js.Dynamic.literal(radius = radius)
    if (atlasManager != null) __obj.updateDynamic("atlasManager")(atlasManager)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    __obj.asInstanceOf[Options]
  }
}

