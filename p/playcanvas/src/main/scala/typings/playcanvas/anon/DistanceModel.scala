package typings.playcanvas.anon

import typings.playcanvas.pc.Vec3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceModel extends js.Object {
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

object DistanceModel {
  @scala.inline
  def apply(
    distanceModel: String = null,
    duration: js.UndefOr[Double] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    maxDistance: js.UndefOr[Double] = js.undefined,
    pitch: js.UndefOr[Double] = js.undefined,
    position: Vec3 = null,
    refDistance: js.UndefOr[Double] = js.undefined,
    rollOffFactor: js.UndefOr[Double] = js.undefined,
    startTime: js.UndefOr[Double] = js.undefined,
    velocity: Vec3 = null,
    volume: js.UndefOr[Double] = js.undefined
  ): DistanceModel = {
    val __obj = js.Dynamic.literal()
    if (distanceModel != null) __obj.updateDynamic("distanceModel")(distanceModel.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDistance)) __obj.updateDynamic("maxDistance")(maxDistance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pitch)) __obj.updateDynamic("pitch")(pitch.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(refDistance)) __obj.updateDynamic("refDistance")(refDistance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rollOffFactor)) __obj.updateDynamic("rollOffFactor")(rollOffFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startTime)) __obj.updateDynamic("startTime")(startTime.get.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    if (!js.isUndefined(volume)) __obj.updateDynamic("volume")(volume.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceModel]
  }
}

