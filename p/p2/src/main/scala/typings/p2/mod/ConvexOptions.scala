package typings.p2.mod

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
    angle: js.UndefOr[Double] = js.undefined,
    axes: (js.Tuple2[Double, Double]) | js.Array[ArrayLike[Double]] = null,
    collisionGroup: js.UndefOr[Double] = js.undefined,
    collisionMask: js.UndefOr[Double] = js.undefined,
    collisionResponse: js.UndefOr[Boolean] = js.undefined,
    position: js.Tuple2[Double, Double] = null,
    sensor: js.UndefOr[Boolean] = js.undefined,
    vertices: (js.Tuple2[Double, Double]) | js.Array[ArrayLike[Double]] = null
  ): ConvexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (axes != null) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (!js.isUndefined(collisionGroup)) __obj.updateDynamic("collisionGroup")(collisionGroup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collisionMask)) __obj.updateDynamic("collisionMask")(collisionMask.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collisionResponse)) __obj.updateDynamic("collisionResponse")(collisionResponse.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(sensor)) __obj.updateDynamic("sensor")(sensor.get.asInstanceOf[js.Any])
    if (vertices != null) __obj.updateDynamic("vertices")(vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvexOptions]
  }
}

