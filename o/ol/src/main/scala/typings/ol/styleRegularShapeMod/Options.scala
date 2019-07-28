package typings.ol.styleRegularShapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
  var atlasManager: js.UndefOr[typings.ol.styleAtlasManagerMod.default] = js.undefined
  var fill: js.UndefOr[typings.ol.styleFillMod.default] = js.undefined
  var points: Double
  var radius: js.UndefOr[Double] = js.undefined
  var radius1: js.UndefOr[Double] = js.undefined
  var radius2: js.UndefOr[Double] = js.undefined
  var rotateWithView: js.UndefOr[Boolean] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var stroke: js.UndefOr[typings.ol.styleStrokeMod.default] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    points: Double,
    angle: Int | Double = null,
    atlasManager: typings.ol.styleAtlasManagerMod.default = null,
    fill: typings.ol.styleFillMod.default = null,
    radius: Int | Double = null,
    radius1: Int | Double = null,
    radius2: Int | Double = null,
    rotateWithView: js.UndefOr[Boolean] = js.undefined,
    rotation: Int | Double = null,
    stroke: typings.ol.styleStrokeMod.default = null
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

