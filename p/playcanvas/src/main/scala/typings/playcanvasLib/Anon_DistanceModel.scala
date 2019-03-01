package typings
package playcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DistanceModel extends js.Object {
  var distanceModel: js.UndefOr[java.lang.String] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var maxDistance: scala.Double
  var pitch: js.UndefOr[scala.Double] = js.undefined
  var position: js.UndefOr[playcanvasLib.pcNs.Vec3] = js.undefined
  var refDistance: scala.Double
  var rollOffFactor: scala.Double
  var startTime: js.UndefOr[scala.Double] = js.undefined
  var velocity: js.UndefOr[playcanvasLib.pcNs.Vec3] = js.undefined
  var volume: js.UndefOr[scala.Double] = js.undefined
}

object Anon_DistanceModel {
  @scala.inline
  def apply(
    maxDistance: scala.Double,
    refDistance: scala.Double,
    rollOffFactor: scala.Double,
    distanceModel: java.lang.String = null,
    duration: scala.Int | scala.Double = null,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    pitch: scala.Int | scala.Double = null,
    position: playcanvasLib.pcNs.Vec3 = null,
    startTime: scala.Int | scala.Double = null,
    velocity: playcanvasLib.pcNs.Vec3 = null,
    volume: scala.Int | scala.Double = null
  ): Anon_DistanceModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("maxDistance")(maxDistance)
    __obj.updateDynamic("refDistance")(refDistance)
    __obj.updateDynamic("rollOffFactor")(rollOffFactor)
    if (distanceModel != null) __obj.updateDynamic("distanceModel")(distanceModel)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity)
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DistanceModel]
  }
}

