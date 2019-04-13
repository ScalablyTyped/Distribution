package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeightfieldOptions extends SharedShapeOptions {
  var elementWidth: js.UndefOr[scala.Double] = js.undefined
  var heights: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  var minValue: js.UndefOr[scala.Double] = js.undefined
}

object HeightfieldOptions {
  @scala.inline
  def apply(
    angle: scala.Int | scala.Double = null,
    collisionGroup: scala.Int | scala.Double = null,
    collisionMask: scala.Int | scala.Double = null,
    collisionResponse: js.UndefOr[scala.Boolean] = js.undefined,
    elementWidth: scala.Int | scala.Double = null,
    heights: js.Array[scala.Double] = null,
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null,
    position: js.Tuple2[scala.Double, scala.Double] = null,
    sensor: js.UndefOr[scala.Boolean] = js.undefined
  ): HeightfieldOptions = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (collisionGroup != null) __obj.updateDynamic("collisionGroup")(collisionGroup.asInstanceOf[js.Any])
    if (collisionMask != null) __obj.updateDynamic("collisionMask")(collisionMask.asInstanceOf[js.Any])
    if (!js.isUndefined(collisionResponse)) __obj.updateDynamic("collisionResponse")(collisionResponse)
    if (elementWidth != null) __obj.updateDynamic("elementWidth")(elementWidth.asInstanceOf[js.Any])
    if (heights != null) __obj.updateDynamic("heights")(heights)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(sensor)) __obj.updateDynamic("sensor")(sensor)
    __obj.asInstanceOf[HeightfieldOptions]
  }
}

