package typings.phaser.Phaser.Types.Core

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FPSConfig extends js.Object {
  /**
    * Calculate the average frame delta from this many consecutive frame intervals.
    */
  var deltaHistory: js.UndefOr[integer] = js.native
  /**
    * Use setTimeout instead of requestAnimationFrame to run the game loop.
    */
  var forceSetTimeOut: js.UndefOr[Boolean] = js.native
  /**
    * The minimum acceptable rendering rate, in frames per second.
    */
  var min: js.UndefOr[integer] = js.native
  /**
    * The amount of frames the time step counts before we trust the delta values again.
    */
  var panicMax: js.UndefOr[integer] = js.native
  /**
    * Apply delta smoothing during the game update to help avoid spikes?
    */
  var smoothStep: js.UndefOr[Boolean] = js.native
  /**
    * The optimum rendering rate, in frames per second.
    */
  var target: js.UndefOr[integer] = js.native
}

object FPSConfig {
  @scala.inline
  def apply(): FPSConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FPSConfig]
  }
  @scala.inline
  implicit class FPSConfigOps[Self <: FPSConfig] (val x: Self) extends AnyVal {
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
    def setDeltaHistory(value: integer): Self = this.set("deltaHistory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeltaHistory: Self = this.set("deltaHistory", js.undefined)
    @scala.inline
    def setForceSetTimeOut(value: Boolean): Self = this.set("forceSetTimeOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceSetTimeOut: Self = this.set("forceSetTimeOut", js.undefined)
    @scala.inline
    def setMin(value: integer): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setPanicMax(value: integer): Self = this.set("panicMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanicMax: Self = this.set("panicMax", js.undefined)
    @scala.inline
    def setSmoothStep(value: Boolean): Self = this.set("smoothStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmoothStep: Self = this.set("smoothStep", js.undefined)
    @scala.inline
    def setTarget(value: integer): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

