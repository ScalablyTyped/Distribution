package typings.openlayers.mod.olx.style

import typings.openlayers.mod.style.Fill
import typings.openlayers.mod.style.Stroke
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specify radius for regular polygons, or radius1 and radius2 for stars.
  */
trait RegularShapeOptions extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
  var fill: js.UndefOr[Fill] = js.undefined
  var points: Double
  var radius: js.UndefOr[Double] = js.undefined
  var radius1: js.UndefOr[Double] = js.undefined
  var radius2: js.UndefOr[Double] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var snapToPixel: js.UndefOr[Boolean] = js.undefined
  var stroke: js.UndefOr[Stroke] = js.undefined
}

object RegularShapeOptions {
  @scala.inline
  def apply(
    points: Double,
    angle: js.UndefOr[Double] = js.undefined,
    fill: Fill = null,
    radius: js.UndefOr[Double] = js.undefined,
    radius1: js.UndefOr[Double] = js.undefined,
    radius2: js.UndefOr[Double] = js.undefined,
    rotation: js.UndefOr[Double] = js.undefined,
    snapToPixel: js.UndefOr[Boolean] = js.undefined,
    stroke: Stroke = null
  ): RegularShapeOptions = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius1)) __obj.updateDynamic("radius1")(radius1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius2)) __obj.updateDynamic("radius2")(radius2.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snapToPixel)) __obj.updateDynamic("snapToPixel")(snapToPixel.get.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegularShapeOptions]
  }
}

