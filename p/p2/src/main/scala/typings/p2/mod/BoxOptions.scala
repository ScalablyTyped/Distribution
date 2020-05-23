package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxOptions extends SharedShapeOptions {
  var height: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object BoxOptions {
  @scala.inline
  def apply(
    angle: js.UndefOr[Double] = js.undefined,
    collisionGroup: js.UndefOr[Double] = js.undefined,
    collisionMask: js.UndefOr[Double] = js.undefined,
    collisionResponse: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    position: js.Tuple2[Double, Double] = null,
    sensor: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): BoxOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collisionGroup)) __obj.updateDynamic("collisionGroup")(collisionGroup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collisionMask)) __obj.updateDynamic("collisionMask")(collisionMask.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collisionResponse)) __obj.updateDynamic("collisionResponse")(collisionResponse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(sensor)) __obj.updateDynamic("sensor")(sensor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxOptions]
  }
}

