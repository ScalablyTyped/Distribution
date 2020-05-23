package typings.phaser.Phaser.Types.Core

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FPSConfig extends js.Object {
  /**
    * Calculate the average frame delta from this many consecutive frame intervals.
    */
  var deltaHistory: js.UndefOr[integer] = js.undefined
  /**
    * Use setTimeout instead of requestAnimationFrame to run the game loop.
    */
  var forceSetTimeOut: js.UndefOr[Boolean] = js.undefined
  /**
    * The minimum acceptable rendering rate, in frames per second.
    */
  var min: js.UndefOr[integer] = js.undefined
  /**
    * The amount of frames the time step counts before we trust the delta values again.
    */
  var panicMax: js.UndefOr[integer] = js.undefined
  /**
    * Apply delta smoothing during the game update to help avoid spikes?
    */
  var smoothStep: js.UndefOr[Boolean] = js.undefined
  /**
    * The optimum rendering rate, in frames per second.
    */
  var target: js.UndefOr[integer] = js.undefined
}

object FPSConfig {
  @scala.inline
  def apply(
    deltaHistory: js.UndefOr[integer] = js.undefined,
    forceSetTimeOut: js.UndefOr[Boolean] = js.undefined,
    min: js.UndefOr[integer] = js.undefined,
    panicMax: js.UndefOr[integer] = js.undefined,
    smoothStep: js.UndefOr[Boolean] = js.undefined,
    target: js.UndefOr[integer] = js.undefined
  ): FPSConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deltaHistory)) __obj.updateDynamic("deltaHistory")(deltaHistory.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSetTimeOut)) __obj.updateDynamic("forceSetTimeOut")(forceSetTimeOut.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(panicMax)) __obj.updateDynamic("panicMax")(panicMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothStep)) __obj.updateDynamic("smoothStep")(smoothStep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(target)) __obj.updateDynamic("target")(target.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FPSConfig]
  }
}

