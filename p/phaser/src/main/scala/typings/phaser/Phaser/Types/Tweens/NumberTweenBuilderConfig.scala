package typings.phaser.Phaser.Types.Tweens

import typings.phaser.Phaser.Tweens.Tween
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
  var completeDelay: js.UndefOr[String | Double | js.Function | js.Object | js.Array[_]] = js.undefined
  /**
    * The number of milliseconds to delay before the tween will start.
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * The duration of the tween in milliseconds.
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * The easing equation to use for the tween.
    */
  var ease: js.UndefOr[String | js.Function] = js.undefined
  /**
    * Optional easing parameters.
    */
  var easeParams: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The start number.
    */
  var from: js.UndefOr[Double] = js.undefined
  /**
    * The number of milliseconds to hold the tween for before yoyo'ing.
    */
  var hold: js.UndefOr[Double] = js.undefined
  /**
    * The number of times the tween will repeat. (A value of 1 means the tween will play twice, as it repeated once.) The first loop starts after every property tween has completed once.
    */
  var loop: js.UndefOr[String | Double | js.Function | js.Object | js.Array[_]] = js.undefined
  /**
    * The time the tween will pause before starting either a yoyo or returning to the start for a repeat.
    */
  var loopDelay: js.UndefOr[String | Double | js.Function | js.Object | js.Array[_]] = js.undefined
  /**
    * Used when the Tween is part of a Timeline.
    */
  var offset: js.UndefOr[String | Double | js.Function | js.Object | js.Array[_]] = js.undefined
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
  var paused: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of times to repeat the tween.
    */
  var repeat: js.UndefOr[Double] = js.undefined
  /**
    * The number of milliseconds to pause before a tween will repeat.
    */
  var repeatDelay: js.UndefOr[Double] = js.undefined
  /**
    * The end number.
    */
  var to: js.UndefOr[Double] = js.undefined
  /**
    * Use frames or milliseconds?
    */
  var useFrames: js.UndefOr[Boolean] = js.undefined
  /**
    * Should the tween complete, then reverse the values incrementally to get back to the starting tween values? The reverse tweening will also take `duration` milliseconds to complete.
    */
  var yoyo: js.UndefOr[Boolean] = js.undefined
}

object NumberTweenBuilderConfig {
  @scala.inline
  def apply(
    callbackScope: js.Any = null,
    completeDelay: String | Double | js.Function | js.Object | js.Array[_] = null,
    delay: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    ease: String | js.Function = null,
    easeParams: js.Array[_] = null,
    from: js.UndefOr[Double] = js.undefined,
    hold: js.UndefOr[Double] = js.undefined,
    loop: String | Double | js.Function | js.Object | js.Array[_] = null,
    loopDelay: String | Double | js.Function | js.Object | js.Array[_] = null,
    offset: String | Double | js.Function | js.Object | js.Array[_] = null,
    onComplete: (/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any) => Unit = null,
    onCompleteParams: js.Array[_] = null,
    onCompleteScope: js.Any = null,
    onLoop: (/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any) => Unit = null,
    onLoopParams: js.Array[_] = null,
    onLoopScope: js.Any = null,
    onRepeat: (/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any) => Unit = null,
    onRepeatParams: js.Array[_] = null,
    onRepeatScope: js.Any = null,
    onStart: (/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any) => Unit = null,
    onStartParams: js.Array[_] = null,
    onStartScope: js.Any = null,
    onUpdate: (/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any) => Unit = null,
    onUpdateParams: js.Array[_] = null,
    onUpdateScope: js.Any = null,
    onYoyo: (/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any) => Unit = null,
    onYoyoParams: js.Array[_] = null,
    onYoyoScope: js.Any = null,
    paused: js.UndefOr[Boolean] = js.undefined,
    repeat: js.UndefOr[Double] = js.undefined,
    repeatDelay: js.UndefOr[Double] = js.undefined,
    to: js.UndefOr[Double] = js.undefined,
    useFrames: js.UndefOr[Boolean] = js.undefined,
    yoyo: js.UndefOr[Boolean] = js.undefined
  ): NumberTweenBuilderConfig = {
    val __obj = js.Dynamic.literal()
    if (callbackScope != null) __obj.updateDynamic("callbackScope")(callbackScope.asInstanceOf[js.Any])
    if (completeDelay != null) __obj.updateDynamic("completeDelay")(completeDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (easeParams != null) __obj.updateDynamic("easeParams")(easeParams.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hold)) __obj.updateDynamic("hold")(hold.get.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (loopDelay != null) __obj.updateDynamic("loopDelay")(loopDelay.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction3(onComplete))
    if (onCompleteParams != null) __obj.updateDynamic("onCompleteParams")(onCompleteParams.asInstanceOf[js.Any])
    if (onCompleteScope != null) __obj.updateDynamic("onCompleteScope")(onCompleteScope.asInstanceOf[js.Any])
    if (onLoop != null) __obj.updateDynamic("onLoop")(js.Any.fromFunction3(onLoop))
    if (onLoopParams != null) __obj.updateDynamic("onLoopParams")(onLoopParams.asInstanceOf[js.Any])
    if (onLoopScope != null) __obj.updateDynamic("onLoopScope")(onLoopScope.asInstanceOf[js.Any])
    if (onRepeat != null) __obj.updateDynamic("onRepeat")(js.Any.fromFunction3(onRepeat))
    if (onRepeatParams != null) __obj.updateDynamic("onRepeatParams")(onRepeatParams.asInstanceOf[js.Any])
    if (onRepeatScope != null) __obj.updateDynamic("onRepeatScope")(onRepeatScope.asInstanceOf[js.Any])
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction3(onStart))
    if (onStartParams != null) __obj.updateDynamic("onStartParams")(onStartParams.asInstanceOf[js.Any])
    if (onStartScope != null) __obj.updateDynamic("onStartScope")(onStartScope.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction3(onUpdate))
    if (onUpdateParams != null) __obj.updateDynamic("onUpdateParams")(onUpdateParams.asInstanceOf[js.Any])
    if (onUpdateScope != null) __obj.updateDynamic("onUpdateScope")(onUpdateScope.asInstanceOf[js.Any])
    if (onYoyo != null) __obj.updateDynamic("onYoyo")(js.Any.fromFunction3(onYoyo))
    if (onYoyoParams != null) __obj.updateDynamic("onYoyoParams")(onYoyoParams.asInstanceOf[js.Any])
    if (onYoyoScope != null) __obj.updateDynamic("onYoyoScope")(onYoyoScope.asInstanceOf[js.Any])
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused.get.asInstanceOf[js.Any])
    if (!js.isUndefined(repeat)) __obj.updateDynamic("repeat")(repeat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(repeatDelay)) __obj.updateDynamic("repeatDelay")(repeatDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useFrames)) __obj.updateDynamic("useFrames")(useFrames.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yoyo)) __obj.updateDynamic("yoyo")(yoyo.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberTweenBuilderConfig]
  }
}

