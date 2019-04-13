package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedShapeOptions extends js.Object {
  var angle: js.UndefOr[scala.Double] = js.undefined
  var collisionGroup: js.UndefOr[scala.Double] = js.undefined
  var collisionMask: js.UndefOr[scala.Double] = js.undefined
  var collisionResponse: js.UndefOr[scala.Boolean] = js.undefined
  var position: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var sensor: js.UndefOr[scala.Boolean] = js.undefined
}

object SharedShapeOptions {
  @scala.inline
  def apply(
    angle: scala.Int | scala.Double = null,
    collisionGroup: scala.Int | scala.Double = null,
    collisionMask: scala.Int | scala.Double = null,
    collisionResponse: js.UndefOr[scala.Boolean] = js.undefined,
    position: js.Tuple2[scala.Double, scala.Double] = null,
    sensor: js.UndefOr[scala.Boolean] = js.undefined
  ): SharedShapeOptions = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (collisionGroup != null) __obj.updateDynamic("collisionGroup")(collisionGroup.asInstanceOf[js.Any])
    if (collisionMask != null) __obj.updateDynamic("collisionMask")(collisionMask.asInstanceOf[js.Any])
    if (!js.isUndefined(collisionResponse)) __obj.updateDynamic("collisionResponse")(collisionResponse)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(sensor)) __obj.updateDynamic("sensor")(sensor)
    __obj.asInstanceOf[SharedShapeOptions]
  }
}

