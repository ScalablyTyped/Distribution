package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedShapeOptions extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
  var collisionGroup: js.UndefOr[Double] = js.undefined
  var collisionMask: js.UndefOr[Double] = js.undefined
  var collisionResponse: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var sensor: js.UndefOr[Boolean] = js.undefined
}

object SharedShapeOptions {
  @scala.inline
  def apply(
    angle: Int | Double = null,
    collisionGroup: Int | Double = null,
    collisionMask: Int | Double = null,
    collisionResponse: js.UndefOr[Boolean] = js.undefined,
    position: js.Tuple2[Double, Double] = null,
    sensor: js.UndefOr[Boolean] = js.undefined
  ): SharedShapeOptions = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (collisionGroup != null) __obj.updateDynamic("collisionGroup")(collisionGroup.asInstanceOf[js.Any])
    if (collisionMask != null) __obj.updateDynamic("collisionMask")(collisionMask.asInstanceOf[js.Any])
    if (!js.isUndefined(collisionResponse)) __obj.updateDynamic("collisionResponse")(collisionResponse.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(sensor)) __obj.updateDynamic("sensor")(sensor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedShapeOptions]
  }
}

