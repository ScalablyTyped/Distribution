package typings.p2.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeightfieldOptions extends SharedShapeOptions {
  var elementWidth: js.UndefOr[Double] = js.undefined
  var heights: js.UndefOr[js.Array[Double]] = js.undefined
  var maxValue: js.UndefOr[Double] = js.undefined
  var minValue: js.UndefOr[Double] = js.undefined
}

object HeightfieldOptions {
  @scala.inline
  def apply(
    angle: Int | Double = null,
    collisionGroup: Int | Double = null,
    collisionMask: Int | Double = null,
    collisionResponse: js.UndefOr[Boolean] = js.undefined,
    elementWidth: Int | Double = null,
    heights: js.Array[Double] = null,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    position: js.Tuple2[Double, Double] = null,
    sensor: js.UndefOr[Boolean] = js.undefined
  ): HeightfieldOptions = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (collisionGroup != null) __obj.updateDynamic("collisionGroup")(collisionGroup.asInstanceOf[js.Any])
    if (collisionMask != null) __obj.updateDynamic("collisionMask")(collisionMask.asInstanceOf[js.Any])
    if (!js.isUndefined(collisionResponse)) __obj.updateDynamic("collisionResponse")(collisionResponse.asInstanceOf[js.Any])
    if (elementWidth != null) __obj.updateDynamic("elementWidth")(elementWidth.asInstanceOf[js.Any])
    if (heights != null) __obj.updateDynamic("heights")(heights.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(sensor)) __obj.updateDynamic("sensor")(sensor.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightfieldOptions]
  }
}

