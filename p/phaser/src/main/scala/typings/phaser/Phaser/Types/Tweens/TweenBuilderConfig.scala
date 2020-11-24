package typings.phaser.Phaser.Types.Tweens

import org.scalablytyped.runtime.StringDictionary
import typings.phaser.Phaser.Tweens.Tween
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TweenBuilderConfig extends js.Object {
  
  /**
    * Scope (this) for the callbacks. The default scope is the tween.
    */
  var callbackScope: js.UndefOr[js.Any] = js.native
  
  /**
    * The time the tween will wait before the onComplete event is dispatched once it has completed, in ms.
    */
  var completeDelay: js.UndefOr[String | Double | js.Function | js.Object | js.Array[_]] = js.native
  
  /**
    * The number of milliseconds to delay before the tween will start.
    */
  var delay: js.UndefOr[Double | js.Function] = js.native
  
  /**
    * The duration of the tween in milliseconds.
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * The easing equation to use for the tween.
    */
  var ease: js.UndefOr[String | js.Function] = js.native
  
  /**
    * Optional easing parameters.
    */
  var easeParams: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Horizontally flip the target of the Tween when it completes (before it yoyos, if set to do so). Only works for targets that support the `flipX` property.
    */
  var flipX: js.UndefOr[Boolean] = js.native
  
  /**
    * Vertically flip the target of the Tween when it completes (before it yoyos, if set to do so). Only works for targets that support the `flipY` property.
    */
  var flipY: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of milliseconds to hold the tween for before yoyo'ing.
    */
  var hold: js.UndefOr[Double] = js.native
  
  /**
    * The number of times the tween will repeat. (A value of 1 means the tween will play twice, as it repeated once.) The first loop starts after every property tween has completed once.
    */
  var loop: js.UndefOr[String | Double | js.Function | js.Object | js.Array[_]] = js.native
  
  /**
    * The time the tween will pause before starting either a yoyo or returning to the start for a repeat.
    */
  var loopDelay: js.UndefOr[String | Double | js.Function | js.Object | js.Array[_]] = js.native
  
  /**
    * Used when the Tween is part of a Timeline.
    */
  var offset: js.UndefOr[String | Double | js.Function | js.Object | js.Array[_]] = js.native
  
  /**
    * A function to call when the tween becomes active within the Tween Manager.
    */
  var onActive: js.UndefOr[TweenOnActiveCallback] = js.native
  
  /**
    * Additional parameters to pass to `onActive`.
    */
  var onActiveParams: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Scope (this) for `onActive`.
    */
  var onActiveScope: js.UndefOr[js.Any] = js.native
  
  /**
    * A function to call when the tween completes.
    */
  var onComplete: js.UndefOr[TweenOnCompleteCallback] = js.native
  
  /**
    * Additional parameters to pass to `onComplete`.
    */
  var onCompleteParams: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Scope (this) for `onComplete`.
    */
  var onCompleteScope: js.UndefOr[js.Any] = js.native
  
  /**
    * A function to call each time the tween loops.
    */
  var onLoop: js.UndefOr[TweenOnLoopCallback] = js.native
  
  /**
    * Additional parameters to pass to `onLoop`.
    */
  var onLoopParams: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Scope (this) for `onLoop`.
    */
  var onLoopScope: js.UndefOr[js.Any] = js.native
  
  /**
    * A function to call each time the tween repeats. Called once per property per target.
    */
  var onRepeat: js.UndefOr[TweenOnRepeatCallback] = js.native
  
  /**
    * Additional parameters to pass to `onRepeat`.
    */
  var onRepeatParams: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Scope (this) for `onRepeat`.
    */
  var onRepeatScope: js.UndefOr[js.Any] = js.native
  
  /**
    * A function to call when the tween starts playback, after any delays have expired.
    */
  var onStart: js.UndefOr[TweenOnStartCallback] = js.native
  
  /**
    * Additional parameters to pass to `onStart`.
    */
  var onStartParams: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Scope (this) for `onStart`.
    */
  var onStartScope: js.UndefOr[js.Any] = js.native
  
  /**
    * A function to call when the tween is stopped.
    */
  var onStop: js.UndefOr[TweenOnStopCallback] = js.native
  
  /**
    * Additional parameters to pass to `onStop`.
    */
  var onStopParams: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Scope (this) for `onStop`.
    */
  var onStopScope: js.UndefOr[js.Any] = js.native
  
  /**
    * A function to call each time the tween steps. Called once per property per target.
    */
  var onUpdate: js.UndefOr[TweenOnUpdateCallback] = js.native
  
  /**
    * Additional parameters to pass to `onUpdate`.
    */
  var onUpdateParams: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Scope (this) for `onUpdate`.
    */
  var onUpdateScope: js.UndefOr[js.Any] = js.native
  
  /**
    * A function to call each time the tween yoyos. Called once per property per target.
    */
  var onYoyo: js.UndefOr[TweenOnYoyoCallback] = js.native
  
  /**
    * Additional parameters to pass to `onYoyo`.
    */
  var onYoyoParams: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Scope (this) for `onYoyo`.
    */
  var onYoyoScope: js.UndefOr[js.Any] = js.native
  
  /**
    * Does the tween start in a paused state (true) or playing (false)?
    */
  var paused: js.UndefOr[Boolean] = js.native
  
  /**
    * The properties to tween.
    */
  var props: js.UndefOr[StringDictionary[Double | String | GetEndCallback | TweenPropConfig]] = js.native
  
  /**
    * The number of times each property tween repeats.
    */
  var repeat: js.UndefOr[Double] = js.native
  
  /**
    * The number of milliseconds to pause before a repeat.
    */
  var repeatDelay: js.UndefOr[Double] = js.native
  
  /**
    * The object, or an array of objects, to run the tween on.
    */
  var targets: js.Any = js.native
  
  /**
    * Use frames or milliseconds?
    */
  var useFrames: js.UndefOr[Boolean] = js.native
  
  /**
    * Should the tween complete, then reverse the values incrementally to get back to the starting tween values? The reverse tweening will also take `duration` milliseconds to complete.
    */
  var yoyo: js.UndefOr[Boolean] = js.native
}
object TweenBuilderConfig {
  
  @scala.inline
  def apply(targets: js.Any): TweenBuilderConfig = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[TweenBuilderConfig]
  }
  
  @scala.inline
  implicit class TweenBuilderConfigOps[Self <: TweenBuilderConfig] (val x: Self) extends AnyVal {
    
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
    def setTargets(value: js.Any): Self = this.set("targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackScope(value: js.Any): Self = this.set("callbackScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbackScope: Self = this.set("callbackScope", js.undefined)
    
    @scala.inline
    def setCompleteDelayVarargs(value: js.Any*): Self = this.set("completeDelay", js.Array(value :_*))
    
    @scala.inline
    def setCompleteDelay(value: String | Double | js.Function | js.Object | js.Array[_]): Self = this.set("completeDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompleteDelay: Self = this.set("completeDelay", js.undefined)
    
    @scala.inline
    def setDelay(value: Double | js.Function): Self = this.set("delay", value.asInstanceOf[js.Any])
    
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
    def setLoop(value: String | Double | js.Function | js.Object | js.Array[_]): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setLoopDelayVarargs(value: js.Any*): Self = this.set("loopDelay", js.Array(value :_*))
    
    @scala.inline
    def setLoopDelay(value: String | Double | js.Function | js.Object | js.Array[_]): Self = this.set("loopDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoopDelay: Self = this.set("loopDelay", js.undefined)
    
    @scala.inline
    def setOffsetVarargs(value: js.Any*): Self = this.set("offset", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: String | Double | js.Function | js.Object | js.Array[_]): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOnActive(value: (/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any) => Unit): Self = this.set("onActive", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnActive: Self = this.set("onActive", js.undefined)
    
    @scala.inline
    def setOnActiveParamsVarargs(value: js.Any*): Self = this.set("onActiveParams", js.Array(value :_*))
    
    @scala.inline
    def setOnActiveParams(value: js.Array[_]): Self = this.set("onActiveParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnActiveParams: Self = this.set("onActiveParams", js.undefined)
    
    @scala.inline
    def setOnActiveScope(value: js.Any): Self = this.set("onActiveScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnActiveScope: Self = this.set("onActiveScope", js.undefined)
    
    @scala.inline
    def setOnComplete(value: (/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any) => Unit): Self = this.set("onComplete", js.Any.fromFunction3(value))
    
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
    def setOnLoop(value: (/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any) => Unit): Self = this.set("onLoop", js.Any.fromFunction3(value))
    
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
    def setOnRepeat(value: (/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any) => Unit): Self = this.set("onRepeat", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnRepeat: Self = this.set("onRepeat", js.undefined)
    
    @scala.inline
    def setOnRepeatParamsVarargs(value: js.Any*): Self = this.set("onRepeatParams", js.Array(value :_*))
    
    @scala.inline
    def setOnRepeatParams(value: js.Array[_]): Self = this.set("onRepeatParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnRepeatParams: Self = this.set("onRepeatParams", js.undefined)
    
    @scala.inline
    def setOnRepeatScope(value: js.Any): Self = this.set("onRepeatScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnRepeatScope: Self = this.set("onRepeatScope", js.undefined)
    
    @scala.inline
    def setOnStart(value: (/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any) => Unit): Self = this.set("onStart", js.Any.fromFunction3(value))
    
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
    def setOnStop(value: (/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any) => Unit): Self = this.set("onStop", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnStop: Self = this.set("onStop", js.undefined)
    
    @scala.inline
    def setOnStopParamsVarargs(value: js.Any*): Self = this.set("onStopParams", js.Array(value :_*))
    
    @scala.inline
    def setOnStopParams(value: js.Array[_]): Self = this.set("onStopParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnStopParams: Self = this.set("onStopParams", js.undefined)
    
    @scala.inline
    def setOnStopScope(value: js.Any): Self = this.set("onStopScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnStopScope: Self = this.set("onStopScope", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: (/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any) => Unit): Self = this.set("onUpdate", js.Any.fromFunction3(value))
    
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
    def setOnYoyo(value: (/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any) => Unit): Self = this.set("onYoyo", js.Any.fromFunction3(value))
    
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
    def setProps(value: StringDictionary[Double | String | GetEndCallback | TweenPropConfig]): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
    
    @scala.inline
    def setRepeat(value: Double): Self = this.set("repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
    
    @scala.inline
    def setRepeatDelay(value: Double): Self = this.set("repeatDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeatDelay: Self = this.set("repeatDelay", js.undefined)
    
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
