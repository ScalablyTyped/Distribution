package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConvexOptions extends SharedShapeOptions {
  var axes: js.UndefOr[
    (js.Tuple2[scala.Double, scala.Double]) | js.Array[stdLib.ArrayLike[scala.Double]]
  ] = js.undefined
  var vertices: js.UndefOr[
    (js.Tuple2[scala.Double, scala.Double]) | js.Array[stdLib.ArrayLike[scala.Double]]
  ] = js.undefined
}

object ConvexOptions {
  @scala.inline
  def apply(
    angle: scala.Int | scala.Double = null,
    axes: (js.Tuple2[scala.Double, scala.Double]) | js.Array[stdLib.ArrayLike[scala.Double]] = null,
    collisionGroup: scala.Int | scala.Double = null,
    collisionMask: scala.Int | scala.Double = null,
    collisionResponse: js.UndefOr[scala.Boolean] = js.undefined,
    position: js.Tuple2[scala.Double, scala.Double] = null,
    sensor: js.UndefOr[scala.Boolean] = js.undefined,
    vertices: (js.Tuple2[scala.Double, scala.Double]) | js.Array[stdLib.ArrayLike[scala.Double]] = null
  ): ConvexOptions = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (axes != null) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (collisionGroup != null) __obj.updateDynamic("collisionGroup")(collisionGroup.asInstanceOf[js.Any])
    if (collisionMask != null) __obj.updateDynamic("collisionMask")(collisionMask.asInstanceOf[js.Any])
    if (!js.isUndefined(collisionResponse)) __obj.updateDynamic("collisionResponse")(collisionResponse)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(sensor)) __obj.updateDynamic("sensor")(sensor)
    if (vertices != null) __obj.updateDynamic("vertices")(vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvexOptions]
  }
}

