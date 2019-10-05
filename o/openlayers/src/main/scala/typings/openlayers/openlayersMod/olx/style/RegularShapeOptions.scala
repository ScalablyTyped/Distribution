package typings.openlayers.openlayersMod.olx.style

import typings.openlayers.openlayersMod.style.Fill
import typings.openlayers.openlayersMod.style.Stroke
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
    angle: Int | Double = null,
    fill: Fill = null,
    radius: Int | Double = null,
    radius1: Int | Double = null,
    radius2: Int | Double = null,
    rotation: Int | Double = null,
    snapToPixel: js.UndefOr[Boolean] = js.undefined,
    stroke: Stroke = null
  ): RegularShapeOptions = {
    val __obj = js.Dynamic.literal(points = points)
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (radius1 != null) __obj.updateDynamic("radius1")(radius1.asInstanceOf[js.Any])
    if (radius2 != null) __obj.updateDynamic("radius2")(radius2.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (!js.isUndefined(snapToPixel)) __obj.updateDynamic("snapToPixel")(snapToPixel)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    __obj.asInstanceOf[RegularShapeOptions]
  }
}

