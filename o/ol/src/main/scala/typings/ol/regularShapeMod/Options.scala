package typings.ol.regularShapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
  var displacement: js.UndefOr[js.Array[Double]] = js.undefined
  var fill: js.UndefOr[typings.ol.fillMod.default] = js.undefined
  var points: Double
  var radius: js.UndefOr[Double] = js.undefined
  var radius1: js.UndefOr[Double] = js.undefined
  var radius2: js.UndefOr[Double] = js.undefined
  var rotateWithView: js.UndefOr[Boolean] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var stroke: js.UndefOr[typings.ol.strokeMod.default] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    points: Double,
    angle: js.UndefOr[Double] = js.undefined,
    displacement: js.Array[Double] = null,
    fill: typings.ol.fillMod.default = null,
    radius: js.UndefOr[Double] = js.undefined,
    radius1: js.UndefOr[Double] = js.undefined,
    radius2: js.UndefOr[Double] = js.undefined,
    rotateWithView: js.UndefOr[Boolean] = js.undefined,
    rotation: js.UndefOr[Double] = js.undefined,
    stroke: typings.ol.strokeMod.default = null
  ): Options = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (displacement != null) __obj.updateDynamic("displacement")(displacement.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius1)) __obj.updateDynamic("radius1")(radius1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius2)) __obj.updateDynamic("radius2")(radius2.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotateWithView)) __obj.updateDynamic("rotateWithView")(rotateWithView.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

