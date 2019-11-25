package typings.playcanvas

import typings.playcanvas.pc.Vec3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DistanceModel extends js.Object {
  var distanceModel: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var maxDistance: js.UndefOr[Double] = js.undefined
  var pitch: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[Vec3] = js.undefined
  var refDistance: js.UndefOr[Double] = js.undefined
  var rollOffFactor: js.UndefOr[Double] = js.undefined
  var startTime: js.UndefOr[Double] = js.undefined
  var velocity: js.UndefOr[Vec3] = js.undefined
  var volume: js.UndefOr[Double] = js.undefined
}

object Anon_DistanceModel {
  @scala.inline
  def apply(
    distanceModel: String = null,
    duration: Int | Double = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    maxDistance: Int | Double = null,
    pitch: Int | Double = null,
    position: Vec3 = null,
    refDistance: Int | Double = null,
    rollOffFactor: Int | Double = null,
    startTime: Int | Double = null,
    velocity: Vec3 = null,
    volume: Int | Double = null
  ): Anon_DistanceModel = {
    val __obj = js.Dynamic.literal()
    if (distanceModel != null) __obj.updateDynamic("distanceModel")(distanceModel.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (maxDistance != null) __obj.updateDynamic("maxDistance")(maxDistance.asInstanceOf[js.Any])
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (refDistance != null) __obj.updateDynamic("refDistance")(refDistance.asInstanceOf[js.Any])
    if (rollOffFactor != null) __obj.updateDynamic("rollOffFactor")(rollOffFactor.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DistanceModel]
  }
}

