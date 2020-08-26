package typings.phaser.Phaser.Types.Tweens

import typings.phaser.Phaser.Tweens.Timeline
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineBuilderConfig extends js.Object {
  /**
    * The default scope (`this` value) to use for each callback registered by the Timeline Builder. If not specified, the Timeline itself will be used.
    */
  var callbackScope: js.UndefOr[js.Any] = js.native
  /**
    * If specified, the time to wait, usually in milliseconds, before the Timeline completes.
    */
  var completeDelay: js.UndefOr[Double | js.Function | js.Object | js.Array[_]] = js.native
  /**
    * The number of milliseconds to delay before the tween will start. Each individual Tween configuration can override this value.
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * If `totalDuration` is not specified, the default duration, usually in milliseconds, of each Tween which will be created. Each individual Tween configuration can override the Tween's duration.
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * The easing equation to use for each tween. Each individual Tween configuration can override this value.
    */
  var ease: js.UndefOr[String | js.Function] = js.native
  /**
    * Optional easing parameters. Each individual Tween configuration can override this value.
    */
  var easeParams: js.UndefOr[js.Array[_]] = js.native
  /**
    * Horizontally flip the target of the Tween when it completes (before it yoyos, if set to do so). Only works for targets that support the `flipX` property. Each individual Tween configuration can override this value.
    */
  var flipX: js.UndefOr[Boolean] = js.native
  /**
    * Vertically flip the target of the Tween when it completes (before it yoyos, if set to do so). Only works for targets that support the `flipY` property. Each individual Tween configuration can override this value.
    */
  var flipY: js.UndefOr[Boolean] = js.native
  /**
    * The number of milliseconds to hold each tween before yoyo'ing. Each individual Tween configuration can override this value.
    */
  var hold: js.UndefOr[Double] = js.native
  /**
    * How many times the Timeline should loop, or -1 to loop indefinitely.
    */
  var loop: js.UndefOr[Double | js.Function | js.Object | js.Array[_]] = js.native
  /**
    * The time, usually in milliseconds, between each loop.
    */
  var loopDelay: js.UndefOr[Double | js.Function | js.Object | js.Array[_]] = js.native
  /**
    * If specified, the `onComplete` callback for the Timeline, called after it completes.
    */
  var onComplete: js.UndefOr[TimelineOnCompleteCallback] = js.native
  /**
    * Additional arguments to pass to the `onComplete` callback. The Timeline will always be the first argument.
    */
  var onCompleteParams: js.UndefOr[js.Array[_]] = js.native
  /**
    * The scope (`this` value) to use for the `onComplete` callback. If not specified, the `callbackScope` will be used.
    */
  var onCompleteScope: js.UndefOr[js.Any] = js.native
  /**
    * If specified, the `onLoop` callback for the Timeline, called every time it loops.
    */
  var onLoop: js.UndefOr[TimelineOnLoopCallback] = js.native
  /**
    * Additional arguments to pass to the `onLoop` callback. The Timeline will always be the first argument.
    */
  var onLoopParams: js.UndefOr[js.Array[_]] = js.native
  /**
    * The scope (`this` value) to use for the `onLoop` callback. If not specified, the `callbackScope` will be used.
    */
  var onLoopScope: js.UndefOr[js.Any] = js.native
  /**
    * If specified, the `onStart` callback for the Timeline, called every time it starts playing.
    */
  var onStart: js.UndefOr[TimelineOnStartCallback] = js.native
  /**
    * Additional arguments to pass to the `onStart` callback. The Timeline will always be the first argument.
    */
  var onStartParams: js.UndefOr[js.Array[_]] = js.native
  /**
    * The scope (`this` value) to use for the `onStart` callback. If not specified, the `callbackScope` will be used.
    */
  var onStartScope: js.UndefOr[js.Any] = js.native
  /**
    * If specified, the `onUpdate` callback for the Timeline, called every frame it's active, regardless of its Tweens.
    */
  var onUpdate: js.UndefOr[TimelineOnUpdateCallback] = js.native
  /**
    * Additional arguments to pass to the `onUpdate` callback. The Timeline will always be the first argument.
    */
  var onUpdateParams: js.UndefOr[js.Array[_]] = js.native
  /**
    * The scope (`this` value) to use for the `onUpdate` callback. If not specified, the `callbackScope` will be used.
    */
  var onUpdateScope: js.UndefOr[js.Any] = js.native
  /**
    * If specified, the `onYoyo` callback for the Timeline, called every time it yoyos.
    */
  var onYoyo: js.UndefOr[TimelineOnYoyoCallback] = js.native
  /**
    * Additional arguments to pass to the `onYoyo` callback. The first argument will always be `null`, while the Timeline will always be the second argument.
    */
  var onYoyoParams: js.UndefOr[js.Array[_]] = js.native
  /**
    * The scope (`this` value) to use for the `onYoyo` callback. If not specified, the `callbackScope` will be used.
    */
  var onYoyoScope: js.UndefOr[js.Any] = js.native
  /**
    * If `true`, the Timeline will start paused.
    */
  var paused: js.UndefOr[Boolean] = js.native
  /**
    * The number of times to repeat each tween. Each individual Tween configuration can override this value.
    */
  var repeat: js.UndefOr[integer] = js.native
  /**
    * The number of milliseconds to pause before each tween will repeat. Each individual Tween configuration can override this value.
    */
  var repeatDelay: js.UndefOr[Double] = js.native
  /**
    * An array (or function which returns one) of default targets to which to apply the Timeline. Each individual Tween configuration can override this value.
    */
  var targets: js.UndefOr[js.Any] = js.native
  /**
    * If specified, each Tween in the Timeline will get an equal portion of this duration, usually in milliseconds, by default. Each individual Tween configuration can override the Tween's duration.
    */
  var totalDuration: js.UndefOr[Double] = js.native
  /**
    * An array of tween configuration objects to create and add into the new Timeline. If this doesn't exist or is empty, the Timeline will start off paused and none of the other configuration settings will be read. If it's a function, it will be called and its return value will be used as the array.
    */
  var tweens: js.UndefOr[(js.Array[js.Object | TweenBuilderConfig]) | js.Function] = js.native
  /**
    * If `true`, all duration in the Timeline will be in frames instead of milliseconds.
    */
  var useFrames: js.UndefOr[Boolean] = js.native
  /**
    * Should each tween complete, then reverse the values incrementally to get back to the starting tween values? The reverse tweening will also take `duration` milliseconds to complete. Each individual Tween configuration can override this value.
    */
  var yoyo: js.UndefOr[Boolean] = js.native
}

object TimelineBuilderConfig {
  @scala.inline
  def apply(): TimelineBuilderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineBuilderConfig]
  }
  @scala.inline
  implicit class TimelineBuilderConfigOps[Self <: TimelineBuilderConfig] (val x: Self) extends AnyVal {
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
    def setCallbackScope(value: js.Any): Self = this.set("callbackScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallbackScope: Self = this.set("callbackScope", js.undefined)
    @scala.inline
    def setCompleteDelayVarargs(value: js.Any*): Self = this.set("completeDelay", js.Array(value :_*))
    @scala.inline
    def setCompleteDelay(value: Double | js.Function | js.Object | js.Array[_]): Self = this.set("completeDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompleteDelay: Self = this.set("completeDelay", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEase(value: String | js.Function): Self = this.set("ease", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEase: Self = this.set("ease", js.undefined)
    @scala.inline
    def setEaseParamsVarargs(value: js.Any*): Self = this.set("easeParams", js.Array(value :_*))
    @scala.inline
    def setEaseParams(value: js.Array[_]): Self = this.set("easeParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEaseParams: Self = this.set("easeParams", js.undefined)
    @scala.inline
    def setFlipX(value: Boolean): Self = this.set("flipX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlipX: Self = this.set("flipX", js.undefined)
    @scala.inline
    def setFlipY(value: Boolean): Self = this.set("flipY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlipY: Self = this.set("flipY", js.undefined)
    @scala.inline
    def setHold(value: Double): Self = this.set("hold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHold: Self = this.set("hold", js.undefined)
    @scala.inline
    def setLoopVarargs(value: js.Any*): Self = this.set("loop", js.Array(value :_*))
    @scala.inline
    def setLoop(value: Double | js.Function | js.Object | js.Array[_]): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setLoopDelayVarargs(value: js.Any*): Self = this.set("loopDelay", js.Array(value :_*))
    @scala.inline
    def setLoopDelay(value: Double | js.Function | js.Object | js.Array[_]): Self = this.set("loopDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoopDelay: Self = this.set("loopDelay", js.undefined)
    @scala.inline
    def setOnComplete(value: (/* timeline */ Timeline, /* repeated */ js.Any) => Unit): Self = this.set("onComplete", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    @scala.inline
    def setOnCompleteParamsVarargs(value: js.Any*): Self = this.set("onCompleteParams", js.Array(value :_*))
    @scala.inline
    def setOnCompleteParams(value: js.Array[_]): Self = this.set("onCompleteParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCompleteParams: Self = this.set("onCompleteParams", js.undefined)
    @scala.inline
    def setOnCompleteScope(value: js.Any): Self = this.set("onCompleteScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCompleteScope: Self = this.set("onCompleteScope", js.undefined)
    @scala.inline
    def setOnLoop(value: (/* timeline */ Timeline, /* repeated */ js.Any) => Unit): Self = this.set("onLoop", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnLoop: Self = this.set("onLoop", js.undefined)
    @scala.inline
    def setOnLoopParamsVarargs(value: js.Any*): Self = this.set("onLoopParams", js.Array(value :_*))
    @scala.inline
    def setOnLoopParams(value: js.Array[_]): Self = this.set("onLoopParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLoopParams: Self = this.set("onLoopParams", js.undefined)
    @scala.inline
    def setOnLoopScope(value: js.Any): Self = this.set("onLoopScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLoopScope: Self = this.set("onLoopScope", js.undefined)
    @scala.inline
    def setOnStart(value: (/* timeline */ Timeline, /* repeated */ js.Any) => Unit): Self = this.set("onStart", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    @scala.inline
    def setOnStartParamsVarargs(value: js.Any*): Self = this.set("onStartParams", js.Array(value :_*))
    @scala.inline
    def setOnStartParams(value: js.Array[_]): Self = this.set("onStartParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnStartParams: Self = this.set("onStartParams", js.undefined)
    @scala.inline
    def setOnStartScope(value: js.Any): Self = this.set("onStartScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnStartScope: Self = this.set("onStartScope", js.undefined)
    @scala.inline
    def setOnUpdate(value: (/* timeline */ Timeline, /* repeated */ js.Any) => Unit): Self = this.set("onUpdate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    @scala.inline
    def setOnUpdateParamsVarargs(value: js.Any*): Self = this.set("onUpdateParams", js.Array(value :_*))
    @scala.inline
    def setOnUpdateParams(value: js.Array[_]): Self = this.set("onUpdateParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnUpdateParams: Self = this.set("onUpdateParams", js.undefined)
    @scala.inline
    def setOnUpdateScope(value: js.Any): Self = this.set("onUpdateScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnUpdateScope: Self = this.set("onUpdateScope", js.undefined)
    @scala.inline
    def setOnYoyo(value: (/* timeline */ Timeline, /* repeated */ js.Any) => Unit): Self = this.set("onYoyo", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnYoyo: Self = this.set("onYoyo", js.undefined)
    @scala.inline
    def setOnYoyoParamsVarargs(value: js.Any*): Self = this.set("onYoyoParams", js.Array(value :_*))
    @scala.inline
    def setOnYoyoParams(value: js.Array[_]): Self = this.set("onYoyoParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnYoyoParams: Self = this.set("onYoyoParams", js.undefined)
    @scala.inline
    def setOnYoyoScope(value: js.Any): Self = this.set("onYoyoScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnYoyoScope: Self = this.set("onYoyoScope", js.undefined)
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaused: Self = this.set("paused", js.undefined)
    @scala.inline
    def setRepeat(value: integer): Self = this.set("repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
    @scala.inline
    def setRepeatDelay(value: Double): Self = this.set("repeatDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeatDelay: Self = this.set("repeatDelay", js.undefined)
    @scala.inline
    def setTargets(value: js.Any): Self = this.set("targets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargets: Self = this.set("targets", js.undefined)
    @scala.inline
    def setTotalDuration(value: Double): Self = this.set("totalDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalDuration: Self = this.set("totalDuration", js.undefined)
    @scala.inline
    def setTweensVarargs(value: (js.Object | TweenBuilderConfig)*): Self = this.set("tweens", js.Array(value :_*))
    @scala.inline
    def setTweens(value: (js.Array[js.Object | TweenBuilderConfig]) | js.Function): Self = this.set("tweens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTweens: Self = this.set("tweens", js.undefined)
    @scala.inline
    def setUseFrames(value: Boolean): Self = this.set("useFrames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseFrames: Self = this.set("useFrames", js.undefined)
    @scala.inline
    def setYoyo(value: Boolean): Self = this.set("yoyo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYoyo: Self = this.set("yoyo", js.undefined)
  }
  
}

