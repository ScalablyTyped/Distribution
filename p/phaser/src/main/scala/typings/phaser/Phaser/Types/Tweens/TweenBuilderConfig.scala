package typings.phaser.Phaser.Types.Tweens

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TweenBuilderConfig
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /**
    * The scope (or context) for all of the callbacks. The default scope is the tween.
    */
  var callbackScope: js.UndefOr[Any] = js.undefined
  
  /**
    * The time the tween will wait before the onComplete event is dispatched once it has completed, in ms.
    */
  var completeDelay: js.UndefOr[String | Double | js.Function | js.Object | js.Array[Any]] = js.undefined
  
  /**
    * The number of milliseconds to delay before the tween will start.
    */
  var delay: js.UndefOr[Double | js.Function] = js.undefined
  
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
  var easeParams: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Horizontally flip the target of the Tween when it completes (before it yoyos, if set to do so). Only works for targets that support the `flipX` property.
    */
  var flipX: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Vertically flip the target of the Tween when it completes (before it yoyos, if set to do so). Only works for targets that support the `flipY` property.
    */
  var flipY: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of milliseconds to hold the tween for before yoyo'ing.
    */
  var hold: js.UndefOr[Double] = js.undefined
  
  /**
    * The interpolation function to use if the `value` given is an array of numbers.
    */
  var interpolation: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * The number of times the tween will repeat. (A value of 1 means the tween will play twice, as it repeated once.) The first loop starts after every property in the tween has completed once.
    */
  var loop: js.UndefOr[String | Double | js.Function | js.Object | js.Array[Any]] = js.undefined
  
  /**
    * The time the tween will pause before starting either a yoyo or returning to the start for a repeat.
    */
  var loopDelay: js.UndefOr[String | Double | js.Function | js.Object | js.Array[Any]] = js.undefined
  
  /**
    * A function to call when the tween becomes active within the Tween Manager.
    */
  var onActive: js.UndefOr[TweenOnActiveCallback] = js.undefined
  
  /**
    * Additional parameters to pass to `onActive`.
    */
  var onActiveParams: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * A function to call when the tween completes.
    */
  var onComplete: js.UndefOr[TweenOnCompleteCallback] = js.undefined
  
  /**
    * Additional parameters to pass to `onComplete`.
    */
  var onCompleteParams: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * A function to call each time the tween loops.
    */
  var onLoop: js.UndefOr[TweenOnLoopCallback] = js.undefined
  
  /**
    * Additional parameters to pass to `onLoop`.
    */
  var onLoopParams: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * A function to call when the tween is paused.
    */
  var onPause: js.UndefOr[TweenOnPauseCallback] = js.undefined
  
  /**
    * Additional parameters to pass to `onPause`.
    */
  var onPauseParams: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * A function to call each time the tween repeats. Called once per property per target.
    */
  var onRepeat: js.UndefOr[TweenOnRepeatCallback] = js.undefined
  
  /**
    * Additional parameters to pass to `onRepeat`.
    */
  var onRepeatParams: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * A function to call when the tween is resumed after being paused.
    */
  var onResume: js.UndefOr[TweenOnResumeCallback] = js.undefined
  
  /**
    * Additional parameters to pass to `onResume`.
    */
  var onResumeParams: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * A function to call when the tween starts playback, after any delays have expired.
    */
  var onStart: js.UndefOr[TweenOnStartCallback] = js.undefined
  
  /**
    * Additional parameters to pass to `onStart`.
    */
  var onStartParams: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * A function to call when the tween is stopped.
    */
  var onStop: js.UndefOr[TweenOnStopCallback] = js.undefined
  
  /**
    * Additional parameters to pass to `onStop`.
    */
  var onStopParams: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * A function to call each time the tween steps. Called once per property per target.
    */
  var onUpdate: js.UndefOr[TweenOnUpdateCallback] = js.undefined
  
  /**
    * Additional parameters to pass to `onUpdate`.
    */
  var onUpdateParams: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * A function to call each time the tween yoyos. Called once per property per target.
    */
  var onYoyo: js.UndefOr[TweenOnYoyoCallback] = js.undefined
  
  /**
    * Additional parameters to pass to `onYoyo`.
    */
  var onYoyoParams: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Does the tween start in a paused state (true) or playing (false)?
    */
  var paused: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Will the Tween be automatically destroyed on completion, or retained for future playback?
    */
  var persist: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The properties to tween.
    */
  var props: js.UndefOr[StringDictionary[Double | String | GetEndCallback | TweenPropConfig]] = js.undefined
  
  /**
    * The number of times each property tween repeats.
    */
  var repeat: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of milliseconds to pause before a repeat.
    */
  var repeatDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * The object, or an array of objects, to run the tween on.
    */
  var targets: Any
  
  /**
    * Should the tween complete, then reverse the values incrementally to get back to the starting tween values? The reverse tweening will also take `duration` milliseconds to complete.
    */
  var yoyo: js.UndefOr[Boolean] = js.undefined
}
object TweenBuilderConfig {
  
  inline def apply(targets: Any): TweenBuilderConfig = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[TweenBuilderConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TweenBuilderConfig] (val x: Self) extends AnyVal {
    
    inline def setCallbackScope(value: Any): Self = StObject.set(x, "callbackScope", value.asInstanceOf[js.Any])
    
    inline def setCallbackScopeUndefined: Self = StObject.set(x, "callbackScope", js.undefined)
    
    inline def setCompleteDelay(value: String | Double | js.Function | js.Object | js.Array[Any]): Self = StObject.set(x, "completeDelay", value.asInstanceOf[js.Any])
    
    inline def setCompleteDelayUndefined: Self = StObject.set(x, "completeDelay", js.undefined)
    
    inline def setCompleteDelayVarargs(value: Any*): Self = StObject.set(x, "completeDelay", js.Array(value*))
    
    inline def setDelay(value: Double | js.Function): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEase(value: String | js.Function): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
    
    inline def setEaseParams(value: js.Array[Any]): Self = StObject.set(x, "easeParams", value.asInstanceOf[js.Any])
    
    inline def setEaseParamsUndefined: Self = StObject.set(x, "easeParams", js.undefined)
    
    inline def setEaseParamsVarargs(value: Any*): Self = StObject.set(x, "easeParams", js.Array(value*))
    
    inline def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
    
    inline def setFlipX(value: Boolean): Self = StObject.set(x, "flipX", value.asInstanceOf[js.Any])
    
    inline def setFlipXUndefined: Self = StObject.set(x, "flipX", js.undefined)
    
    inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
    
    inline def setFlipYUndefined: Self = StObject.set(x, "flipY", js.undefined)
    
    inline def setHold(value: Double): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
    
    inline def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
    
    inline def setInterpolation(value: String | js.Function): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    inline def setLoop(value: String | Double | js.Function | js.Object | js.Array[Any]): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopDelay(value: String | Double | js.Function | js.Object | js.Array[Any]): Self = StObject.set(x, "loopDelay", value.asInstanceOf[js.Any])
    
    inline def setLoopDelayUndefined: Self = StObject.set(x, "loopDelay", js.undefined)
    
    inline def setLoopDelayVarargs(value: Any*): Self = StObject.set(x, "loopDelay", js.Array(value*))
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setLoopVarargs(value: Any*): Self = StObject.set(x, "loop", js.Array(value*))
    
    inline def setOnActive(value: TweenOnActiveCallback): Self = StObject.set(x, "onActive", value.asInstanceOf[js.Any])
    
    inline def setOnActiveParams(value: js.Array[Any]): Self = StObject.set(x, "onActiveParams", value.asInstanceOf[js.Any])
    
    inline def setOnActiveParamsUndefined: Self = StObject.set(x, "onActiveParams", js.undefined)
    
    inline def setOnActiveParamsVarargs(value: Any*): Self = StObject.set(x, "onActiveParams", js.Array(value*))
    
    inline def setOnActiveUndefined: Self = StObject.set(x, "onActive", js.undefined)
    
    inline def setOnComplete(value: TweenOnCompleteCallback): Self = StObject.set(x, "onComplete", value.asInstanceOf[js.Any])
    
    inline def setOnCompleteParams(value: js.Array[Any]): Self = StObject.set(x, "onCompleteParams", value.asInstanceOf[js.Any])
    
    inline def setOnCompleteParamsUndefined: Self = StObject.set(x, "onCompleteParams", js.undefined)
    
    inline def setOnCompleteParamsVarargs(value: Any*): Self = StObject.set(x, "onCompleteParams", js.Array(value*))
    
    inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    inline def setOnLoop(value: TweenOnLoopCallback): Self = StObject.set(x, "onLoop", value.asInstanceOf[js.Any])
    
    inline def setOnLoopParams(value: js.Array[Any]): Self = StObject.set(x, "onLoopParams", value.asInstanceOf[js.Any])
    
    inline def setOnLoopParamsUndefined: Self = StObject.set(x, "onLoopParams", js.undefined)
    
    inline def setOnLoopParamsVarargs(value: Any*): Self = StObject.set(x, "onLoopParams", js.Array(value*))
    
    inline def setOnLoopUndefined: Self = StObject.set(x, "onLoop", js.undefined)
    
    inline def setOnPause(value: TweenOnPauseCallback): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
    
    inline def setOnPauseParams(value: js.Array[Any]): Self = StObject.set(x, "onPauseParams", value.asInstanceOf[js.Any])
    
    inline def setOnPauseParamsUndefined: Self = StObject.set(x, "onPauseParams", js.undefined)
    
    inline def setOnPauseParamsVarargs(value: Any*): Self = StObject.set(x, "onPauseParams", js.Array(value*))
    
    inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    inline def setOnRepeat(value: TweenOnRepeatCallback): Self = StObject.set(x, "onRepeat", value.asInstanceOf[js.Any])
    
    inline def setOnRepeatParams(value: js.Array[Any]): Self = StObject.set(x, "onRepeatParams", value.asInstanceOf[js.Any])
    
    inline def setOnRepeatParamsUndefined: Self = StObject.set(x, "onRepeatParams", js.undefined)
    
    inline def setOnRepeatParamsVarargs(value: Any*): Self = StObject.set(x, "onRepeatParams", js.Array(value*))
    
    inline def setOnRepeatUndefined: Self = StObject.set(x, "onRepeat", js.undefined)
    
    inline def setOnResume(value: TweenOnResumeCallback): Self = StObject.set(x, "onResume", value.asInstanceOf[js.Any])
    
    inline def setOnResumeParams(value: js.Array[Any]): Self = StObject.set(x, "onResumeParams", value.asInstanceOf[js.Any])
    
    inline def setOnResumeParamsUndefined: Self = StObject.set(x, "onResumeParams", js.undefined)
    
    inline def setOnResumeParamsVarargs(value: Any*): Self = StObject.set(x, "onResumeParams", js.Array(value*))
    
    inline def setOnResumeUndefined: Self = StObject.set(x, "onResume", js.undefined)
    
    inline def setOnStart(value: TweenOnStartCallback): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
    
    inline def setOnStartParams(value: js.Array[Any]): Self = StObject.set(x, "onStartParams", value.asInstanceOf[js.Any])
    
    inline def setOnStartParamsUndefined: Self = StObject.set(x, "onStartParams", js.undefined)
    
    inline def setOnStartParamsVarargs(value: Any*): Self = StObject.set(x, "onStartParams", js.Array(value*))
    
    inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    
    inline def setOnStop(value: TweenOnStopCallback): Self = StObject.set(x, "onStop", value.asInstanceOf[js.Any])
    
    inline def setOnStopParams(value: js.Array[Any]): Self = StObject.set(x, "onStopParams", value.asInstanceOf[js.Any])
    
    inline def setOnStopParamsUndefined: Self = StObject.set(x, "onStopParams", js.undefined)
    
    inline def setOnStopParamsVarargs(value: Any*): Self = StObject.set(x, "onStopParams", js.Array(value*))
    
    inline def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
    
    inline def setOnUpdate(value: TweenOnUpdateCallback): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
    
    inline def setOnUpdateParams(value: js.Array[Any]): Self = StObject.set(x, "onUpdateParams", value.asInstanceOf[js.Any])
    
    inline def setOnUpdateParamsUndefined: Self = StObject.set(x, "onUpdateParams", js.undefined)
    
    inline def setOnUpdateParamsVarargs(value: Any*): Self = StObject.set(x, "onUpdateParams", js.Array(value*))
    
    inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    
    inline def setOnYoyo(value: TweenOnYoyoCallback): Self = StObject.set(x, "onYoyo", value.asInstanceOf[js.Any])
    
    inline def setOnYoyoParams(value: js.Array[Any]): Self = StObject.set(x, "onYoyoParams", value.asInstanceOf[js.Any])
    
    inline def setOnYoyoParamsUndefined: Self = StObject.set(x, "onYoyoParams", js.undefined)
    
    inline def setOnYoyoParamsVarargs(value: Any*): Self = StObject.set(x, "onYoyoParams", js.Array(value*))
    
    inline def setOnYoyoUndefined: Self = StObject.set(x, "onYoyo", js.undefined)
    
    inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    inline def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
    
    inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    
    inline def setProps(value: StringDictionary[Double | String | GetEndCallback | TweenPropConfig]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    
    inline def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatDelay(value: Double): Self = StObject.set(x, "repeatDelay", value.asInstanceOf[js.Any])
    
    inline def setRepeatDelayUndefined: Self = StObject.set(x, "repeatDelay", js.undefined)
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    inline def setTargets(value: Any): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setYoyo(value: Boolean): Self = StObject.set(x, "yoyo", value.asInstanceOf[js.Any])
    
    inline def setYoyoUndefined: Self = StObject.set(x, "yoyo", js.undefined)
  }
}
