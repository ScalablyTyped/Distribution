package typings
package phaserLib.PhaserNs.TypesNs.TweensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineBuilderConfig extends js.Object {
  /**
    * The default scope (`this` value) to use for each callback registered by the Timeline Builder. If not specified, the Timeline itself will be used.
    */
  var callbackScope: js.UndefOr[js.Any] = js.undefined
  /**
    * If specified, the time to wait, usually in milliseconds, before the Timeline completes.
    */
  var completeDelay: js.UndefOr[scala.Double | js.Function | js.Object | js.Array[_]] = js.undefined
  /**
    * The number of milliseconds to delay before the tween will start. Each individual Tween configuration can override this value.
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * If `totalDuration` is not specified, the default duration, usually in milliseconds, of each Tween which will be created. Each individual Tween configuration can override the Tween's duration.
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * The easing equation to use for each tween. Each individual Tween configuration can override this value.
    */
  var ease: js.UndefOr[java.lang.String | js.Function] = js.undefined
  /**
    * Optional easing parameters. Each individual Tween configuration can override this value.
    */
  var easeParams: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Horizontally flip the target of the Tween when it completes (before it yoyos, if set to do so). Only works for targets that support the `flipX` property. Each individual Tween configuration can override this value.
    */
  var flipX: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Vertically flip the target of the Tween when it completes (before it yoyos, if set to do so). Only works for targets that support the `flipY` property. Each individual Tween configuration can override this value.
    */
  var flipY: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The number of milliseconds to hold each tween before yoyoing. Each individual Tween configuration can override this value.
    */
  var hold: js.UndefOr[scala.Double] = js.undefined
  /**
    * How many times the Timeline should loop, or -1 to loop indefinitely.
    */
  var loop: js.UndefOr[scala.Double | js.Function | js.Object | js.Array[_]] = js.undefined
  /**
    * The time, usually in milliseconds, between each loop.
    */
  var loopDelay: js.UndefOr[scala.Double | js.Function | js.Object | js.Array[_]] = js.undefined
  /**
    * If specified, the `onComplete` callback for the Timeline, called after it completes.
    */
  var onComplete: js.UndefOr[TimelineOnCompleteCallback] = js.undefined
  /**
    * Additional arguments to pass to the `onComplete` callback. The Timeline will always be the first argument.
    */
  var onCompleteParams: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The scope (`this` value) to use for the `onComplete` callback. If not specified, the `callbackScope` will be used.
    */
  var onCompleteScope: js.UndefOr[js.Any] = js.undefined
  /**
    * If specified, the `onLoop` callback for the Timeline, called every time it loops.
    */
  var onLoop: js.UndefOr[TimelineOnLoopCallback] = js.undefined
  /**
    * Additional arguments to pass to the `onLoop` callback. The Timeline will always be the first argument.
    */
  var onLoopParams: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The scope (`this` value) to use for the `onLoop` callback. If not specified, the `callbackScope` will be used.
    */
  var onLoopScope: js.UndefOr[js.Any] = js.undefined
  /**
    * If specified, the `onStart` callback for the Timeline, called every time it starts playing.
    */
  var onStart: js.UndefOr[TimelineOnStartCallback] = js.undefined
  /**
    * Additional arguments to pass to the `onStart` callback. The Timeline will always be the first argument.
    */
  var onStartParams: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The scope (`this` value) to use for the `onStart` callback. If not specified, the `callbackScope` will be used.
    */
  var onStartScope: js.UndefOr[js.Any] = js.undefined
  /**
    * If specified, the `onUpdate` callback for the Timeline, called every frame it's active, regardless of its Tweens.
    */
  var onUpdate: js.UndefOr[TimelineOnUpdateCallback] = js.undefined
  /**
    * Additional arguments to pass to the `onUpdate` callback. The Timeline will always be the first argument.
    */
  var onUpdateParams: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The scope (`this` value) to use for the `onUpdate` callback. If not specified, the `callbackScope` will be used.
    */
  var onUpdateScope: js.UndefOr[js.Any] = js.undefined
  /**
    * If specified, the `onYoyo` callback for the Timeline, called every time it yoyos.
    */
  var onYoyo: js.UndefOr[TimelineOnYoyoCallback] = js.undefined
  /**
    * Additional arguments to pass to the `onYoyo` callback. The first argument will always be `null`, while the Timeline will always be the second argument.
    */
  var onYoyoParams: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The scope (`this` value) to use for the `onYoyo` callback. If not specified, the `callbackScope` will be used.
    */
  var onYoyoScope: js.UndefOr[js.Any] = js.undefined
  /**
    * If `true`, the Timeline will start paused.
    */
  var paused: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The number of times to repeat each tween. Each individual Tween configuration can override this value.
    */
  var repeat: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * The number of milliseconds to pause before each tween will repeat. Each individual Tween configuration can override this value.
    */
  var repeatDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * An array (or function which returns one) of default targets to which to apply the Timeline. Each individual Tween configuration can override this value.
    */
  var targets: js.UndefOr[js.Any] = js.undefined
  /**
    * If specified, each Tween in the Timeline will get an equal portion of this duration, usually in milliseconds, by default. Each individual Tween configuration can override the Tween's duration.
    */
  var totalDuration: js.UndefOr[scala.Double] = js.undefined
  /**
    * An array of tween configuration objects to create and add into the new Timeline. If this doesn't exist or is empty, the Timeline will start off paused and none of the other configuration settings will be read. If it's a function, it will be called and its return value will be used as the array.
    */
  var tweens: js.UndefOr[(js.Array[js.Object | TweenBuilderConfig]) | js.Function] = js.undefined
  /**
    * If `true`, all duration in the Timeline will be in frames instead of milliseconds.
    */
  var useFrames: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Should each tween complete, then reverse the values incrementally to get back to the starting tween values? The reverse tweening will also take `duration` milliseconds to complete. Each individual Tween configuration can override this value.
    */
  var yoyo: js.UndefOr[scala.Boolean] = js.undefined
}

object TimelineBuilderConfig {
  @scala.inline
  def apply(
    callbackScope: js.Any = null,
    completeDelay: scala.Double | js.Function | js.Object | js.Array[_] = null,
    delay: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    ease: java.lang.String | js.Function = null,
    easeParams: js.Array[_] = null,
    flipX: js.UndefOr[scala.Boolean] = js.undefined,
    flipY: js.UndefOr[scala.Boolean] = js.undefined,
    hold: scala.Int | scala.Double = null,
    loop: scala.Double | js.Function | js.Object | js.Array[_] = null,
    loopDelay: scala.Double | js.Function | js.Object | js.Array[_] = null,
    onComplete: TimelineOnCompleteCallback = null,
    onCompleteParams: js.Array[_] = null,
    onCompleteScope: js.Any = null,
    onLoop: TimelineOnLoopCallback = null,
    onLoopParams: js.Array[_] = null,
    onLoopScope: js.Any = null,
    onStart: TimelineOnStartCallback = null,
    onStartParams: js.Array[_] = null,
    onStartScope: js.Any = null,
    onUpdate: TimelineOnUpdateCallback = null,
    onUpdateParams: js.Array[_] = null,
    onUpdateScope: js.Any = null,
    onYoyo: TimelineOnYoyoCallback = null,
    onYoyoParams: js.Array[_] = null,
    onYoyoScope: js.Any = null,
    paused: js.UndefOr[scala.Boolean] = js.undefined,
    repeat: js.UndefOr[phaserLib.integer] = js.undefined,
    repeatDelay: scala.Int | scala.Double = null,
    targets: js.Any = null,
    totalDuration: scala.Int | scala.Double = null,
    tweens: (js.Array[js.Object | TweenBuilderConfig]) | js.Function = null,
    useFrames: js.UndefOr[scala.Boolean] = js.undefined,
    yoyo: js.UndefOr[scala.Boolean] = js.undefined
  ): TimelineBuilderConfig = {
    val __obj = js.Dynamic.literal()
    if (callbackScope != null) __obj.updateDynamic("callbackScope")(callbackScope)
    if (completeDelay != null) __obj.updateDynamic("completeDelay")(completeDelay.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (easeParams != null) __obj.updateDynamic("easeParams")(easeParams)
    if (!js.isUndefined(flipX)) __obj.updateDynamic("flipX")(flipX)
    if (!js.isUndefined(flipY)) __obj.updateDynamic("flipY")(flipY)
    if (hold != null) __obj.updateDynamic("hold")(hold.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (loopDelay != null) __obj.updateDynamic("loopDelay")(loopDelay.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete)
    if (onCompleteParams != null) __obj.updateDynamic("onCompleteParams")(onCompleteParams)
    if (onCompleteScope != null) __obj.updateDynamic("onCompleteScope")(onCompleteScope)
    if (onLoop != null) __obj.updateDynamic("onLoop")(onLoop)
    if (onLoopParams != null) __obj.updateDynamic("onLoopParams")(onLoopParams)
    if (onLoopScope != null) __obj.updateDynamic("onLoopScope")(onLoopScope)
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
    if (!js.isUndefined(repeat)) __obj.updateDynamic("repeat")(repeat)
    if (repeatDelay != null) __obj.updateDynamic("repeatDelay")(repeatDelay.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets)
    if (totalDuration != null) __obj.updateDynamic("totalDuration")(totalDuration.asInstanceOf[js.Any])
    if (tweens != null) __obj.updateDynamic("tweens")(tweens.asInstanceOf[js.Any])
    if (!js.isUndefined(useFrames)) __obj.updateDynamic("useFrames")(useFrames)
    if (!js.isUndefined(yoyo)) __obj.updateDynamic("yoyo")(yoyo)
    __obj.asInstanceOf[TimelineBuilderConfig]
  }
}

