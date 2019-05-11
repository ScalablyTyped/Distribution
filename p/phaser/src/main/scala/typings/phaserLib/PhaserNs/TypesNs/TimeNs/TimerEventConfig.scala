package typings
package phaserLib.PhaserNs.TypesNs.TimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimerEventConfig extends js.Object {
  /**
    * Additional arguments to be passed to the `callback`.
    */
  var args: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The callback which will be called when the Timer Event fires.
    */
  var callback: js.UndefOr[js.Function] = js.undefined
  /**
    * The scope (`this` object) with which to invoke the `callback`.
    */
  var callbackScope: js.UndefOr[js.Any] = js.undefined
  /**
    * The delay after which the Timer Event should fire, in milliseconds.
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * `true` if the Timer Event should repeat indefinitely.
    */
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * `true` if the Timer Event should be paused.
    */
  var paused: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The total number of times the Timer Event will repeat before finishing.
    */
  var repeat: js.UndefOr[scala.Double] = js.undefined
  /**
    * The initial elapsed time in milliseconds. Useful if you want a long duration with repeat, but for the first loop to fire quickly.
    */
  var startAt: js.UndefOr[scala.Double] = js.undefined
  /**
    * The scale of the elapsed time.
    */
  var timeScale: js.UndefOr[scala.Double] = js.undefined
}

object TimerEventConfig {
  @scala.inline
  def apply(
    args: js.Array[_] = null,
    callback: js.Function = null,
    callbackScope: js.Any = null,
    delay: scala.Int | scala.Double = null,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    paused: js.UndefOr[scala.Boolean] = js.undefined,
    repeat: scala.Int | scala.Double = null,
    startAt: scala.Int | scala.Double = null,
    timeScale: scala.Int | scala.Double = null
  ): TimerEventConfig = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (callbackScope != null) __obj.updateDynamic("callbackScope")(callbackScope)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused)
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (startAt != null) __obj.updateDynamic("startAt")(startAt.asInstanceOf[js.Any])
    if (timeScale != null) __obj.updateDynamic("timeScale")(timeScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimerEventConfig]
  }
}

