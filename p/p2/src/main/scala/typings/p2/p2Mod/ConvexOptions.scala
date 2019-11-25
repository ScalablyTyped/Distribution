package typings.p2.p2Mod

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConvexOptions extends SharedShapeOptions {
  var axes: js.UndefOr[(js.Tuple2[Double, Double]) | js.Array[ArrayLike[Double]]] = js.undefined
  var vertices: js.UndefOr[(js.Tuple2[Double, Double]) | js.Array[ArrayLike[Double]]] = js.undefined
}

object ConvexOptions {
  @scala.inline
  def apply(
    angle: Int | Double = null,
    axes: (js.Tuple2[Double, Double]) | js.Array[ArrayLike[Double]] = null,
    collisionGroup: Int | Double = null,
    collisionMask: Int | Double = null,
    collisionResponse: js.UndefOr[Boolean] = js.undefined,
    position: js.Tuple2[Double, Double] = null,
    sensor: js.UndefOr[Boolean] = js.undefined,
    vertices: (js.Tuple2[Double, Double]) | js.Array[ArrayLike[Double]] = null
  ): ConvexOptions = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (axes != null) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (collisionGroup != null) __obj.updateDynamic("collisionGroup")(collisionGroup.asInstanceOf[js.Any])
    if (collisionMask != null) __obj.updateDynamic("collisionMask")(collisionMask.asInstanceOf[js.Any])
    if (!js.isUndefined(collisionResponse)) __obj.updateDynamic("collisionResponse")(collisionResponse.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(sensor)) __obj.updateDynamic("sensor")(sensor.asInstanceOf[js.Any])
    if (vertices != null) __obj.updateDynamic("vertices")(vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvexOptions]
  }
}

