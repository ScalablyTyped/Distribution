package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineOptions extends SharedShapeOptions {
  var length: js.UndefOr[scala.Double] = js.undefined
}

object LineOptions {
  @scala.inline
  def apply(
    angle: scala.Int | scala.Double = null,
    collisionGroup: scala.Int | scala.Double = null,
    collisionMask: scala.Int | scala.Double = null,
    collisionResponse: js.UndefOr[scala.Boolean] = js.undefined,
    length: scala.Int | scala.Double = null,
    position: js.Tuple2[scala.Double, scala.Double] = null,
    sensor: js.UndefOr[scala.Boolean] = js.undefined
  ): LineOptions = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (collisionGroup != null) __obj.updateDynamic("collisionGroup")(collisionGroup.asInstanceOf[js.Any])
    if (collisionMask != null) __obj.updateDynamic("collisionMask")(collisionMask.asInstanceOf[js.Any])
    if (!js.isUndefined(collisionResponse)) __obj.updateDynamic("collisionResponse")(collisionResponse)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(sensor)) __obj.updateDynamic("sensor")(sensor)
    __obj.asInstanceOf[LineOptions]
  }
}

