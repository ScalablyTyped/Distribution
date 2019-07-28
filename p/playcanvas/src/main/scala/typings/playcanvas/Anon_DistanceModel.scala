package typings.playcanvas

import typings.playcanvas.pcNs.Vec3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DistanceModel extends js.Object {
  var distanceModel: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var maxDistance: Double
  var pitch: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[Vec3] = js.undefined
  var refDistance: Double
  var rollOffFactor: Double
  var startTime: js.UndefOr[Double] = js.undefined
  var velocity: js.UndefOr[Vec3] = js.undefined
  var volume: js.UndefOr[Double] = js.undefined
}

object Anon_DistanceModel {
  @scala.inline
  def apply(
    maxDistance: Double,
    refDistance: Double,
    rollOffFactor: Double,
    distanceModel: String = null,
    duration: Int | Double = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    pitch: Int | Double = null,
    position: Vec3 = null,
    startTime: Int | Double = null,
    velocity: Vec3 = null,
    volume: Int | Double = null
  ): Anon_DistanceModel = {
    val __obj = js.Dynamic.literal(maxDistance = maxDistance, refDistance = refDistance, rollOffFactor = rollOffFactor)
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

