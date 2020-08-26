package typings.phaser.Phaser.Types.Physics.Matter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatterRunnerConfig extends js.Object {
  /**
    * A number that specifies the time correction factor to apply to the update. This can help improve the accuracy of the simulation in cases where delta is changing between updates.
    */
  var correction: js.UndefOr[Double] = js.native
  /**
    * A number that specifies the time step between updates in milliseconds. If you set the `fps` property, this value is set based on that. If `isFixed` is set to `true`, then `delta` is fixed. If it is `false`, then `delta` can dynamically change to maintain the correct apparent simulation speed.
    */
  var delta: js.UndefOr[Double] = js.native
  /**
    * A number that specifies the maximum time step between updates in milliseconds.
    */
  var deltaMax: js.UndefOr[Double] = js.native
  /**
    * A number that specifies the minimum time step between updates in milliseconds.
    */
  var deltaMin: js.UndefOr[Double] = js.native
  /**
    * The size of the delta smoothing array when `isFixed` is `false`.
    */
  var deltaSampleSize: js.UndefOr[Double] = js.native
  /**
    * A number that specifies the frame rate in seconds. If you don't specify this, but do specify `delta`, those values set the fps rate.
    */
  var fps: js.UndefOr[Double] = js.native
  /**
    * A boolean that specifies if the runner should use a fixed timestep (otherwise it is variable). If timing is fixed, then the apparent simulation speed will change depending on the frame rate (but behaviour will be deterministic). If the timing is variable, then the apparent simulation speed will be constant (approximately, but at the cost of determininism).
    */
  var isFixed: js.UndefOr[Boolean] = js.native
}

object MatterRunnerConfig {
  @scala.inline
  def apply(): MatterRunnerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterRunnerConfig]
  }
  @scala.inline
  implicit class MatterRunnerConfigOps[Self <: MatterRunnerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCorrection(value: Double): Self = this.set("correction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorrection: Self = this.set("correction", js.undefined)
    @scala.inline
    def setDelta(value: Double): Self = this.set("delta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelta: Self = this.set("delta", js.undefined)
    @scala.inline
    def setDeltaMax(value: Double): Self = this.set("deltaMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeltaMax: Self = this.set("deltaMax", js.undefined)
    @scala.inline
    def setDeltaMin(value: Double): Self = this.set("deltaMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeltaMin: Self = this.set("deltaMin", js.undefined)
    @scala.inline
    def setDeltaSampleSize(value: Double): Self = this.set("deltaSampleSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeltaSampleSize: Self = this.set("deltaSampleSize", js.undefined)
    @scala.inline
    def setFps(value: Double): Self = this.set("fps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFps: Self = this.set("fps", js.undefined)
    @scala.inline
    def setIsFixed(value: Boolean): Self = this.set("isFixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFixed: Self = this.set("isFixed", js.undefined)
  }
  
}

