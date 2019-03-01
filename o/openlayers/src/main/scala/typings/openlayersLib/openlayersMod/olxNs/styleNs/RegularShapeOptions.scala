package typings
package openlayersLib.openlayersMod.olxNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specify radius for regular polygons, or radius1 and radius2 for stars.
  */
trait RegularShapeOptions extends js.Object {
  var angle: js.UndefOr[scala.Double] = js.undefined
  var fill: js.UndefOr[openlayersLib.openlayersMod.styleNs.Fill] = js.undefined
  var points: scala.Double
  var radius: js.UndefOr[scala.Double] = js.undefined
  var radius1: js.UndefOr[scala.Double] = js.undefined
  var radius2: js.UndefOr[scala.Double] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var snapToPixel: js.UndefOr[scala.Boolean] = js.undefined
  var stroke: js.UndefOr[openlayersLib.openlayersMod.styleNs.Stroke] = js.undefined
}

object RegularShapeOptions {
  @scala.inline
  def apply(
    points: scala.Double,
    angle: scala.Int | scala.Double = null,
    fill: openlayersLib.openlayersMod.styleNs.Fill = null,
    radius: scala.Int | scala.Double = null,
    radius1: scala.Int | scala.Double = null,
    radius2: scala.Int | scala.Double = null,
    rotation: scala.Int | scala.Double = null,
    snapToPixel: js.UndefOr[scala.Boolean] = js.undefined,
    stroke: openlayersLib.openlayersMod.styleNs.Stroke = null
  ): RegularShapeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("points")(points)
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

