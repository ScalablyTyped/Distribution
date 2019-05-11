package typings
package phaserLib.PhaserNs.TypesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FPSConfig extends js.Object {
  /**
    * Calculate the average frame delta from this many consecutive frame intervals.
    */
  var deltaHistory: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * Use setTimeout instead of requestAnimationFrame to run the game loop.
    */
  var forceSetTimeOut: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The minimum acceptable rendering rate, in frames per second.
    */
  var min: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * The amount of frames the time step counts before we trust the delta values again.
    */
  var panicMax: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * The optimum rendering rate, in frames per second.
    */
  var target: js.UndefOr[phaserLib.integer] = js.undefined
}

object FPSConfig {
  @scala.inline
  def apply(
    deltaHistory: js.UndefOr[phaserLib.integer] = js.undefined,
    forceSetTimeOut: js.UndefOr[scala.Boolean] = js.undefined,
    min: js.UndefOr[phaserLib.integer] = js.undefined,
    panicMax: js.UndefOr[phaserLib.integer] = js.undefined,
    target: js.UndefOr[phaserLib.integer] = js.undefined
  ): FPSConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deltaHistory)) __obj.updateDynamic("deltaHistory")(deltaHistory)
    if (!js.isUndefined(forceSetTimeOut)) __obj.updateDynamic("forceSetTimeOut")(forceSetTimeOut)
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min)
    if (!js.isUndefined(panicMax)) __obj.updateDynamic("panicMax")(panicMax)
    if (!js.isUndefined(target)) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[FPSConfig]
  }
}

