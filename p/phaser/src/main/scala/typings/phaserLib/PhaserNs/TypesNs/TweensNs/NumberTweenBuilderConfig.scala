package typings
package phaserLib.PhaserNs.TypesNs.TweensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberTweenBuilderConfig extends js.Object {
  /**
    * Scope (this) for the callbacks. The default scope is the tween.
    */
  var callbackScope: js.UndefOr[js.Any] = js.undefined
  /**
    * The time the tween will wait before the onComplete event is dispatched once it has completed, in ms.
    */
  var completeDelay: js.UndefOr[scala.Double | js.Function | js.Object | js.Array[_]] = js.undefined
  /**
    * The number of milliseconds to delay before the tween will start.
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * The duration of the tween in milliseconds.
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * The easing equation to use for the tween.
    */
  var ease: js.UndefOr[java.lang.String | js.Function] = js.undefined
  /**
    * Optional easing parameters.
    */
  var easeParams: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The start number.
    */
  var from: js.UndefOr[scala.Double] = js.undefined
  /**
    * The number of milliseconds to hold the tween for before yoyo'ing.
    */
  var hold: js.UndefOr[scala.Double] = js.undefined
  /**
    * The number of times the tween will repeat. (A value of 1 means the tween will play twice, as it repeated once.) The first loop starts after every property tween has completed once.
    */
  var loop: js.UndefOr[scala.Double | js.Function | js.Object | js.Array[_]] = js.undefined
  /**
    * The time the tween will pause before starting either a yoyo or returning to the start for a repeat.
    */
  var loopDelay: js.UndefOr[scala.Double | js.Function | js.Object | js.Array[_]] = js.undefined
  /**
    * Used when the Tween is part of a Timeline.
    */
  var offset: js.UndefOr[scala.Double | js.Function | js.Object | js.Array[_]] = js.undefined
  /**
    * A function to call when the tween completes.
    */
  var onComplete: js.UndefOr[TweenOnCompleteCallback] = js.undefined
  /**
    * Additional parameters to pass to `onComplete`.
    */
  var onCompleteParams: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Scope (this) for `onComplete`.
    */
  var onCompleteScope: js.UndefOr[js.Any] = js.undefined
  /**
    * A function to call each time the tween loops.
    */
  var onLoop: js.UndefOr[TweenOnLoopCallback] = js.undefined
  /**
    * Additional parameters to pass to `onLoop`.
    */
  var onLoopParams: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Scope (this) for `onLoop`.
    */
  var onLoopScope: js.UndefOr[js.Any] = js.undefined
  /**
    * A function to call each time the tween repeats. Called once per property per target.
    */
  var onRepeat: js.UndefOr[TweenOnRepeatCallback] = js.undefined
  /**
    * Additional parameters to pass to `onRepeat`.
    */
  var onRepeatParams: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Scope (this) for `onRepeat`.
    */
  var onRepeatScope: js.UndefOr[js.Any] = js.undefined
  /**
    * A function to call when the tween starts.
    */
  var onStart: js.UndefOr[TweenOnStartCallback] = js.undefined
  /**
    * Additional parameters to pass to `onStart`.
    */
  var onStartParams: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Scope (this) for `onStart`.
    */
  var onStartScope: js.UndefOr[js.Any] = js.undefined
  /**
    * A function to call each time the tween steps. Called once per property per target.
    */
  var onUpdate: js.UndefOr[TweenOnUpdateCallback] = js.undefined
  /**
    * Additional parameters to pass to `onUpdate`.
    */
  var onUpdateParams: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Scope (this) for `onUpdate`.
    */
  var onUpdateScope: js.UndefOr[js.Any] = js.undefined
  /**
    * A function to call each time the tween yoyos. Called once per property per target.
    */
  var onYoyo: js.UndefOr[TweenOnYoyoCallback] = js.undefined
  /**
    * Additional parameters to pass to `onYoyo`.
    */
  var onYoyoParams: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Scope (this) for `onYoyo`.
    */
  var onYoyoScope: js.UndefOr[js.Any] = js.undefined
  /**
    * Does the tween start in a paused state (true) or playing (false)?
    */
  var paused: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The number of times to repeat the tween.
    */
  var repeat: js.UndefOr[scala.Double] = js.undefined
  /**
    * The number of milliseconds to pause before a tween will repeat.
    */
  var repeatDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * The end number.
    */
  var to: js.UndefOr[scala.Double] = js.undefined
  /**
    * Use frames or milliseconds?
    */
  var useFrames: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Should the tween complete, then reverse the values incrementally to get back to the starting tween values? The reverse tweening will also take `duration` milliseconds to complete.
    */
  var yoyo: js.UndefOr[scala.Boolean] = js.undefined
}

object NumberTweenBuilderConfig {
  @scala.inline
  def apply(
    callbackScope: js.Any = null,
    completeDelay: scala.Double | js.Function | js.Object | js.Array[_] = null,
    delay: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    ease: java.lang.String | js.Function = null,
    easeParams: js.Array[_] = null,
    from: scala.Int | scala.Double = null,
    hold: scala.Int | scala.Double = null,
    loop: scala.Double | js.Function | js.Object | js.Array[_] = null,
    loopDelay: scala.Double | js.Function | js.Object | js.Array[_] = null,
    offset: scala.Double | js.Function | js.Object | js.Array[_] = null,
    onComplete: TweenOnCompleteCallback = null,
    onCompleteParams: js.Array[_] = null,
    onCompleteScope: js.Any = null,
    onLoop: TweenOnLoopCallback = null,
    onLoopParams: js.Array[_] = null,
    onLoopScope: js.Any = null,
    onRepeat: TweenOnRepeatCallback = null,
    onRepeatParams: js.Array[_] = null,
    onRepeatScope: js.Any = null,
    onStart: TweenOnStartCallback = null,
    onStartParams: js.Array[_] = null,
    onStartScope: js.Any = null,
    onUpdate: TweenOnUpdateCallback = null,
    onUpdateParams: js.Array[_] = null,
    onUpdateScope: js.Any = null,
    onYoyo: TweenOnYoyoCallback = null,
    onYoyoParams: js.Array[_] = null,
    onYoyoScope: js.Any = null,
    paused: js.UndefOr[scala.Boolean] = js.undefined,
    repeat: scala.Int | scala.Double = null,
    repeatDelay: scala.Int | scala.Double = null,
    to: scala.Int | scala.Double = null,
    useFrames: js.UndefOr[scala.Boolean] = js.undefined,
    yoyo: js.UndefOr[scala.Boolean] = js.undefined
  ): NumberTweenBuilderConfig = {
    val __obj = js.Dynamic.literal()
    if (callbackScope != null) __obj.updateDynamic("callbackScope")(callbackScope)
    if (completeDelay != null) __obj.updateDynamic("completeDelay")(completeDelay.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (easeParams != null) __obj.updateDynamic("easeParams")(easeParams)
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (hold != null) __obj.updateDynamic("hold")(hold.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (loopDelay != null) __obj.updateDynamic("loopDelay")(loopDelay.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete)
    if (onCompleteParams != null) __obj.updateDynamic("onCompleteParams")(onCompleteParams)
    if (onCompleteScope != null) __obj.updateDynamic("onCompleteScope")(onCompleteScope)
    if (onLoop != null) __obj.updateDynamic("onLoop")(onLoop)
    if (onLoopParams != null) __obj.updateDynamic("onLoopParams")(onLoopParams)
    if (onLoopScope != null) __obj.updateDynamic("onLoopScope")(onLoopScope)
    if (onRepeat != null) __obj.updateDynamic("onRepeat")(onRepeat)
    if (onRepeatParams != null) __obj.updateDynamic("onRepeatParams")(onRepeatParams)
    if (onRepeatScope != null) __obj.updateDynamic("onRepeatScope")(onRepeatScope)
    if (onStart != null) __obj.updateDynamic("onStart")(onStart)
    if (onStartParams != null) __obj.updateDynamic("onStartParams")(onStartParams)
    if (onStartScope != null) __obj.updateDynamic("onStartScope")(onStartScope)
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate)
    if (onUpdateParams != null) __obj.updateDynamic("onUpdateParams")(onUpdateParams)
    if (onUpdateScope != null) __obj.updateDynamic("onUpdateScope")(onUpdateScope)
    if (onYoyo != null) __obj.updateDynamic("onYoyo")(onYoyo)
    if (onYoyoParams != null) __obj.updateDynamic("onYoyoParams")(onYoyoParams)
    if (onYoyoScope != null) __obj.updateDynamic("onYoyoScope")(onYoyoScope)
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused)
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (repeatDelay != null) __obj.updateDynamic("repeatDelay")(repeatDelay.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (!js.isUndefined(useFrames)) __obj.updateDynamic("useFrames")(useFrames)
    if (!js.isUndefined(yoyo)) __obj.updateDynamic("yoyo")(yoyo)
    __obj.asInstanceOf[NumberTweenBuilderConfig]
  }
}

