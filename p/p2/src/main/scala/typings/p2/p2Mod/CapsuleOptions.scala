package typings.p2.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CapsuleOptions extends SharedShapeOptions {
  var length: js.UndefOr[Double] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
}

object CapsuleOptions {
  @scala.inline
  def apply(
    angle: Int | Double = null,
    collisionGroup: Int | Double = null,
    collisionMask: Int | Double = null,
    collisionResponse: js.UndefOr[Boolean] = js.undefined,
    length: Int | Double = null,
    position: js.Tuple2[Double, Double] = null,
    radius: Int | Double = null,
    sensor: js.UndefOr[Boolean] = js.undefined
  ): CapsuleOptions = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (collisionGroup != null) __obj.updateDynamic("collisionGroup")(collisionGroup.asInstanceOf[js.Any])
    if (collisionMask != null) __obj.updateDynamic("collisionMask")(collisionMask.asInstanceOf[js.Any])
    if (!js.isUndefined(collisionResponse)) __obj.updateDynamic("collisionResponse")(collisionResponse)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (!js.isUndefined(sensor)) __obj.updateDynamic("sensor")(sensor)
    __obj.asInstanceOf[CapsuleOptions]
  }
}

