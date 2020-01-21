package typings.phaser.Phaser.Types.Physics.Matter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatterRunnerConfig extends js.Object {
  /**
    * A number that specifies the time correction factor to apply to the update. This can help improve the accuracy of the simulation in cases where delta is changing between updates.
    */
  var correction: js.UndefOr[Double] = js.undefined
  /**
    * A number that specifies the time step between updates in milliseconds. If you set the `fps` property, this value is set based on that. If `isFixed` is set to `true`, then `delta` is fixed. If it is `false`, then `delta` can dynamically change to maintain the correct apparent simulation speed.
    */
  var delta: js.UndefOr[Double] = js.undefined
  /**
    * A number that specifies the maximum time step between updates in milliseconds.
    */
  var deltaMax: js.UndefOr[Double] = js.undefined
  /**
    * A number that specifies the minimum time step between updates in milliseconds.
    */
  var deltaMin: js.UndefOr[Double] = js.undefined
  /**
    * The size of the delta smoothing array when `isFixed` is `false`.
    */
  var deltaSampleSize: js.UndefOr[Double] = js.undefined
  /**
    * A number that specifies the frame rate in seconds. If you don't specify this, but do specify `delta`, those values set the fps rate.
    */
  var fps: js.UndefOr[Double] = js.undefined
  /**
    * A boolean that specifies if the runner should use a fixed timestep (otherwise it is variable). If timing is fixed, then the apparent simulation speed will change depending on the frame rate (but behaviour will be deterministic). If the timing is variable, then the apparent simulation speed will be constant (approximately, but at the cost of determininism).
    */
  var isFixed: js.UndefOr[Boolean] = js.undefined
}

object MatterRunnerConfig {
  @scala.inline
  def apply(
    correction: Int | Double = null,
    delta: Int | Double = null,
    deltaMax: Int | Double = null,
    deltaMin: Int | Double = null,
    deltaSampleSize: Int | Double = null,
    fps: Int | Double = null,
    isFixed: js.UndefOr[Boolean] = js.undefined
  ): MatterRunnerConfig = {
    val __obj = js.Dynamic.literal()
    if (correction != null) __obj.updateDynamic("correction")(correction.asInstanceOf[js.Any])
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (deltaMax != null) __obj.updateDynamic("deltaMax")(deltaMax.asInstanceOf[js.Any])
    if (deltaMin != null) __obj.updateDynamic("deltaMin")(deltaMin.asInstanceOf[js.Any])
    if (deltaSampleSize != null) __obj.updateDynamic("deltaSampleSize")(deltaSampleSize.asInstanceOf[js.Any])
    if (fps != null) __obj.updateDynamic("fps")(fps.asInstanceOf[js.Any])
    if (!js.isUndefined(isFixed)) __obj.updateDynamic("isFixed")(isFixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatterRunnerConfig]
  }
}

