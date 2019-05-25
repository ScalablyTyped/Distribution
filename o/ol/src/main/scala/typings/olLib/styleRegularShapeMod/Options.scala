package typings
package olLib.styleRegularShapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var angle: js.UndefOr[scala.Double] = js.undefined
  var atlasManager: js.UndefOr[olLib.styleAtlasManagerMod.default] = js.undefined
  var fill: js.UndefOr[olLib.styleFillMod.default] = js.undefined
  var points: scala.Double
  var radius: js.UndefOr[scala.Double] = js.undefined
  var radius1: js.UndefOr[scala.Double] = js.undefined
  var radius2: js.UndefOr[scala.Double] = js.undefined
  var rotateWithView: js.UndefOr[scala.Boolean] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var stroke: js.UndefOr[olLib.styleStrokeMod.default] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    points: scala.Double,
    angle: scala.Int | scala.Double = null,
    atlasManager: olLib.styleAtlasManagerMod.default = null,
    fill: olLib.styleFillMod.default = null,
    radius: scala.Int | scala.Double = null,
    radius1: scala.Int | scala.Double = null,
    radius2: scala.Int | scala.Double = null,
    rotateWithView: js.UndefOr[scala.Boolean] = js.undefined,
    rotation: scala.Int | scala.Double = null,
    stroke: olLib.styleStrokeMod.default = null
  ): Options = {
    val __obj = js.Dynamic.literal(points = points)
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (atlasManager != null) __obj.updateDynamic("atlasManager")(atlasManager)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (radius1 != null) __obj.updateDynamic("radius1")(radius1.asInstanceOf[js.Any])
    if (radius2 != null) __obj.updateDynamic("radius2")(radius2.asInstanceOf[js.Any])
    if (!js.isUndefined(rotateWithView)) __obj.updateDynamic("rotateWithView")(rotateWithView)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    __obj.asInstanceOf[Options]
  }
}

