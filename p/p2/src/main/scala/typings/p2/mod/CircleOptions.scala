package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleOptions extends SharedShapeOptions {
  var radius: js.UndefOr[Double] = js.undefined
}

object CircleOptions {
  @scala.inline
  def apply(
    angle: js.UndefOr[Double] = js.undefined,
    collisionGroup: js.UndefOr[Double] = js.undefined,
    collisionMask: js.UndefOr[Double] = js.undefined,
    collisionResponse: js.UndefOr[Boolean] = js.undefined,
    position: js.Tuple2[Double, Double] = null,
    radius: js.UndefOr[Double] = js.undefined,
    sensor: js.UndefOr[Boolean] = js.undefined
  ): CircleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collisionGroup)) __obj.updateDynamic("collisionGroup")(collisionGroup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collisionMask)) __obj.updateDynamic("collisionMask")(collisionMask.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collisionResponse)) __obj.updateDynamic("collisionResponse")(collisionResponse.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sensor)) __obj.updateDynamic("sensor")(sensor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleOptions]
  }
}

