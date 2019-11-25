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
    * The optimum rendering rate, in frames per second.
    */
  var target: js.UndefOr[integer] = js.undefined
}

object FPSConfig {
  @scala.inline
  def apply(
    deltaHistory: Int | Double = null,
    forceSetTimeOut: js.UndefOr[Boolean] = js.undefined,
    min: Int | Double = null,
    panicMax: Int | Double = null,
    target: Int | Double = null
  ): FPSConfig = {
    val __obj = js.Dynamic.literal()
    if (deltaHistory != null) __obj.updateDynamic("deltaHistory")(deltaHistory.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSetTimeOut)) __obj.updateDynamic("forceSetTimeOut")(forceSetTimeOut.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (panicMax != null) __obj.updateDynamic("panicMax")(panicMax.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[FPSConfig]
  }
}

