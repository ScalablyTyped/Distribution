package typings.phaser.Phaser.Types

import org.scalablytyped.runtime.StringDictionary
import typings.phaser.Phaser.Tweens.Timeline
import typings.phaser.Phaser.Tweens.Tween
import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tweens {
  
  /**
    * A Tween Event.
    */
  type Event = String
  
  type GetActiveCallback = js.Function6[
    /* target */ js.Any, 
    /* key */ String, 
    /* value */ Double, 
    /* targetIndex */ integer, 
    /* totalTargets */ integer, 
    /* tween */ Tween, 
    Unit
  ]
  
  type GetEndCallback = js.Function6[
    /* target */ js.Any, 
    /* key */ String, 
    /* value */ Double, 
    /* targetIndex */ integer, 
    /* totalTargets */ integer, 
    /* tween */ Tween, 
    Unit
  ]
  
  type GetStartCallback = js.Function6[
    /* target */ js.Any, 
    /* key */ String, 
    /* value */ Double, 
    /* targetIndex */ integer, 
    /* totalTargets */ integer, 
    /* tween */ Tween, 
    Unit
  ]
  
  trait NumberTweenBuilderConfig extends StObject {
    
    /**
      * Scope (this) for the callbacks. The default scope is the tween.
      */
    var callbackScope: js.UndefOr[js.Any] = js.undefined
    
    /**
      * The time the tween will wait before the onComplete event is dispatched once it has completed, in ms.
      */
    var completeDelay: js.UndefOr[String | Double | js.Function | js.Object | js.Array[js.Any]] = js.undefined
    
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
    var easeParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
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
    var loop: js.UndefOr[String | Double | js.Function | js.Object | js.Array[js.Any]] = js.undefined
    
    /**
      * The time the tween will pause before starting either a yoyo or returning to the start for a repeat.
      */
    var loopDelay: js.UndefOr[String | Double | js.Function | js.Object | js.Array[js.Any]] = js.undefined
    
    /**
      * Used when the Tween is part of a Timeline.
      */
    var offset: js.UndefOr[String | Double | js.Function | js.Object | js.Array[js.Any]] = js.undefined
    
    /**
      * A function to call when the tween completes.
      */
    var onComplete: js.UndefOr[TweenOnCompleteCallback] = js.undefined
    
    /**
      * Additional parameters to pass to `onComplete`.
      */
    var onCompleteParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
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
    var onLoopParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
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
    var onRepeatParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
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
    var onStartParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /**
      * Scope (this) for `onStart`.
      */
    var onStartScope: js.UndefOr[js.Any] = js.undefined
    
    /**
      * A function to call when the tween is stopped.
      */
    var onStop: js.UndefOr[TweenOnStopCallback] = js.undefined
    
    /**
      * Additional parameters to pass to `onStop`.
      */
    var onStopParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /**
      * Scope (this) for `onStop`.
      */
    var onStopScope: js.UndefOr[js.Any] = js.undefined
    
    /**
      * A function to call each time the tween steps. Called once per property per target.
      */
    var onUpdate: js.UndefOr[TweenOnUpdateCallback] = js.undefined
    
    /**
      * Additional parameters to pass to `onUpdate`.
      */
    var onUpdateParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
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
    var onYoyoParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
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
    def apply(): NumberTweenBuilderConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberTweenBuilderConfig]
    }
    
    @scala.inline
    implicit class NumberTweenBuilderConfigMutableBuilder[Self <: NumberTweenBuilderConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbackScope(value: js.Any): Self = StObject.set(x, "callbackScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackScopeUndefined: Self = StObject.set(x, "callbackScope", js.undefined)
      
      @scala.inline
      def setCompleteDelay(value: String | Double | js.Function | js.Object | js.Array[js.Any]): Self = StObject.set(x, "completeDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleteDelayUndefined: Self = StObject.set(x, "completeDelay", js.undefined)
      
      @scala.inline
      def setCompleteDelayVarargs(value: js.Any*): Self = StObject.set(x, "completeDelay", js.Array(value :_*))
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEase(value: String | js.Function): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEaseParams(value: js.Array[js.Any]): Self = StObject.set(x, "easeParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEaseParamsUndefined: Self = StObject.set(x, "easeParams", js.undefined)
      
      @scala.inline
      def setEaseParamsVarargs(value: js.Any*): Self = StObject.set(x, "easeParams", js.Array(value :_*))
      
      @scala.inline
      def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setHold(value: Double): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
      
      @scala.inline
      def setLoop(value: String | Double | js.Function | js.Object | js.Array[js.Any]): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopDelay(value: String | Double | js.Function | js.Object | js.Array[js.Any]): Self = StObject.set(x, "loopDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopDelayUndefined: Self = StObject.set(x, "loopDelay", js.undefined)
      
      @scala.inline
      def setLoopDelayVarargs(value: js.Any*): Self = StObject.set(x, "loopDelay", js.Array(value :_*))
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setLoopVarargs(value: js.Any*): Self = StObject.set(x, "loop", js.Array(value :_*))
      
      @scala.inline
      def setOffset(value: String | Double | js.Function | js.Object | js.Array[js.Any]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOffsetVarargs(value: js.Any*): Self = StObject.set(x, "offset", js.Array(value :_*))
      
      @scala.inline
      def setOnComplete(value: TweenOnCompleteCallback): Self = StObject.set(x, "onComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCompleteParams(value: js.Array[js.Any]): Self = StObject.set(x, "onCompleteParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCompleteParamsUndefined: Self = StObject.set(x, "onCompleteParams", js.undefined)
      
      @scala.inline
      def setOnCompleteParamsVarargs(value: js.Any*): Self = StObject.set(x, "onCompleteParams", js.Array(value :_*))
      
      @scala.inline
      def setOnCompleteScope(value: js.Any): Self = StObject.set(x, "onCompleteScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCompleteScopeUndefined: Self = StObject.set(x, "onCompleteScope", js.undefined)
      
      @scala.inline
      def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      @scala.inline
      def setOnLoop(value: TweenOnLoopCallback): Self = StObject.set(x, "onLoop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoopParams(value: js.Array[js.Any]): Self = StObject.set(x, "onLoopParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoopParamsUndefined: Self = StObject.set(x, "onLoopParams", js.undefined)
      
      @scala.inline
      def setOnLoopParamsVarargs(value: js.Any*): Self = StObject.set(x, "onLoopParams", js.Array(value :_*))
      
      @scala.inline
      def setOnLoopScope(value: js.Any): Self = StObject.set(x, "onLoopScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoopScopeUndefined: Self = StObject.set(x, "onLoopScope", js.undefined)
      
      @scala.inline
      def setOnLoopUndefined: Self = StObject.set(x, "onLoop", js.undefined)
      
      @scala.inline
      def setOnRepeat(value: TweenOnRepeatCallback): Self = StObject.set(x, "onRepeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnRepeatParams(value: js.Array[js.Any]): Self = StObject.set(x, "onRepeatParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnRepeatParamsUndefined: Self = StObject.set(x, "onRepeatParams", js.undefined)
      
      @scala.inline
      def setOnRepeatParamsVarargs(value: js.Any*): Self = StObject.set(x, "onRepeatParams", js.Array(value :_*))
      
      @scala.inline
      def setOnRepeatScope(value: js.Any): Self = StObject.set(x, "onRepeatScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnRepeatScopeUndefined: Self = StObject.set(x, "onRepeatScope", js.undefined)
      
      @scala.inline
      def setOnRepeatUndefined: Self = StObject.set(x, "onRepeat", js.undefined)
      
      @scala.inline
      def setOnStart(value: TweenOnStartCallback): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStartParams(value: js.Array[js.Any]): Self = StObject.set(x, "onStartParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStartParamsUndefined: Self = StObject.set(x, "onStartParams", js.undefined)
      
      @scala.inline
      def setOnStartParamsVarargs(value: js.Any*): Self = StObject.set(x, "onStartParams", js.Array(value :_*))
      
      @scala.inline
      def setOnStartScope(value: js.Any): Self = StObject.set(x, "onStartScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStartScopeUndefined: Self = StObject.set(x, "onStartScope", js.undefined)
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      @scala.inline
      def setOnStop(value: TweenOnStopCallback): Self = StObject.set(x, "onStop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStopParams(value: js.Array[js.Any]): Self = StObject.set(x, "onStopParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStopParamsUndefined: Self = StObject.set(x, "onStopParams", js.undefined)
      
      @scala.inline
      def setOnStopParamsVarargs(value: js.Any*): Self = StObject.set(x, "onStopParams", js.Array(value :_*))
      
      @scala.inline
      def setOnStopScope(value: js.Any): Self = StObject.set(x, "onStopScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStopScopeUndefined: Self = StObject.set(x, "onStopScope", js.undefined)
      
      @scala.inline
      def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: TweenOnUpdateCallback): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUpdateParams(value: js.Array[js.Any]): Self = StObject.set(x, "onUpdateParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUpdateParamsUndefined: Self = StObject.set(x, "onUpdateParams", js.undefined)
      
      @scala.inline
      def setOnUpdateParamsVarargs(value: js.Any*): Self = StObject.set(x, "onUpdateParams", js.Array(value :_*))
      
      @scala.inline
      def setOnUpdateScope(value: js.Any): Self = StObject.set(x, "onUpdateScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUpdateScopeUndefined: Self = StObject.set(x, "onUpdateScope", js.undefined)
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setOnYoyo(value: TweenOnYoyoCallback): Self = StObject.set(x, "onYoyo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnYoyoParams(value: js.Array[js.Any]): Self = StObject.set(x, "onYoyoParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnYoyoParamsUndefined: Self = StObject.set(x, "onYoyoParams", js.undefined)
      
      @scala.inline
      def setOnYoyoParamsVarargs(value: js.Any*): Self = StObject.set(x, "onYoyoParams", js.Array(value :_*))
      
      @scala.inline
      def setOnYoyoScope(value: js.Any): Self = StObject.set(x, "onYoyoScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnYoyoScopeUndefined: Self = StObject.set(x, "onYoyoScope", js.undefined)
      
      @scala.inline
      def setOnYoyoUndefined: Self = StObject.set(x, "onYoyo", js.undefined)
      
      @scala.inline
      def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
      
      @scala.inline
      def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatDelay(value: Double): Self = StObject.set(x, "repeatDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatDelayUndefined: Self = StObject.set(x, "repeatDelay", js.undefined)
      
      @scala.inline
      def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      @scala.inline
      def setUseFrames(value: Boolean): Self = StObject.set(x, "useFrames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseFramesUndefined: Self = StObject.set(x, "useFrames", js.undefined)
      
      @scala.inline
      def setYoyo(value: Boolean): Self = StObject.set(x, "yoyo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYoyoUndefined: Self = StObject.set(x, "yoyo", js.undefined)
    }
  }
  
  trait StaggerConfig extends StObject {
    
    /**
      * An ease to apply across the staggered values. Can either be a string, such as 'sine.inout', or a function.
      */
    var ease: js.UndefOr[String | js.Function] = js.undefined
    
    /**
      * The index to start the stagger from. Can be the strings `first`, `last` or `center`, or an integer representing the stagger position.
      */
    var from: js.UndefOr[String | integer] = js.undefined
    
    /**
      * Set the stagger to run across a grid by providing an array where element 0 is the width of the grid and element 1 is the height. Combine with the 'from' property to control direction.
      */
    var grid: js.UndefOr[js.Array[integer]] = js.undefined
    
    /**
      * The value to start the stagger from. Can be used as a way to offset the stagger while still using a range for the value.
      */
    var start: js.UndefOr[Double] = js.undefined
  }
  object StaggerConfig {
    
    @scala.inline
    def apply(): StaggerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StaggerConfig]
    }
    
    @scala.inline
    implicit class StaggerConfigMutableBuilder[Self <: StaggerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEase(value: String | js.Function): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
      
      @scala.inline
      def setFrom(value: String | integer): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setGrid(value: js.Array[integer]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setGridVarargs(value: integer*): Self = StObject.set(x, "grid", js.Array(value :_*))
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait TimelineBuilderConfig extends StObject {
    
    /**
      * The default scope (`this` value) to use for each callback registered by the Timeline Builder. If not specified, the Timeline itself will be used.
      */
    var callbackScope: js.UndefOr[js.Any] = js.undefined
    
    /**
      * If specified, the time to wait, usually in milliseconds, before the Timeline completes.
      */
    var completeDelay: js.UndefOr[Double | js.Function | js.Object | js.Array[js.Any]] = js.undefined
    
    /**
      * The number of milliseconds to delay before the tween will start. Each individual Tween configuration can override this value.
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * If `totalDuration` is not specified, the default duration, usually in milliseconds, of each Tween which will be created. Each individual Tween configuration can override the Tween's duration.
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * The easing equation to use for each tween. Each individual Tween configuration can override this value.
      */
    var ease: js.UndefOr[String | js.Function] = js.undefined
    
    /**
      * Optional easing parameters. Each individual Tween configuration can override this value.
      */
    var easeParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /**
      * Horizontally flip the target of the Tween when it completes (before it yoyos, if set to do so). Only works for targets that support the `flipX` property. Each individual Tween configuration can override this value.
      */
    var flipX: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Vertically flip the target of the Tween when it completes (before it yoyos, if set to do so). Only works for targets that support the `flipY` property. Each individual Tween configuration can override this value.
      */
    var flipY: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of milliseconds to hold each tween before yoyo'ing. Each individual Tween configuration can override this value.
      */
    var hold: js.UndefOr[Double] = js.undefined
    
    /**
      * How many times the Timeline should loop, or -1 to loop indefinitely.
      */
    var loop: js.UndefOr[Double | js.Function | js.Object | js.Array[js.Any]] = js.undefined
    
    /**
      * The time, usually in milliseconds, between each loop.
      */
    var loopDelay: js.UndefOr[Double | js.Function | js.Object | js.Array[js.Any]] = js.undefined
    
    /**
      * If specified, the `onComplete` callback for the Timeline, called after it completes.
      */
    var onComplete: js.UndefOr[TimelineOnCompleteCallback] = js.undefined
    
    /**
      * Additional arguments to pass to the `onComplete` callback. The Timeline will always be the first argument.
      */
    var onCompleteParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
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
    var onLoopParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
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
    var onStartParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
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
    var onUpdateParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
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
    var onYoyoParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /**
      * The scope (`this` value) to use for the `onYoyo` callback. If not specified, the `callbackScope` will be used.
      */
    var onYoyoScope: js.UndefOr[js.Any] = js.undefined
    
    /**
      * If `true`, the Timeline will start paused.
      */
    var paused: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of times to repeat each tween. Each individual Tween configuration can override this value.
      */
    var repeat: js.UndefOr[integer] = js.undefined
    
    /**
      * The number of milliseconds to pause before each tween will repeat. Each individual Tween configuration can override this value.
      */
    var repeatDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * An array (or function which returns one) of default targets to which to apply the Timeline. Each individual Tween configuration can override this value.
      */
    var targets: js.UndefOr[js.Any] = js.undefined
    
    /**
      * If specified, each Tween in the Timeline will get an equal portion of this duration, usually in milliseconds, by default. Each individual Tween configuration can override the Tween's duration.
      */
    var totalDuration: js.UndefOr[Double] = js.undefined
    
    /**
      * An array of tween configuration objects to create and add into the new Timeline. If this doesn't exist or is empty, the Timeline will start off paused and none of the other configuration settings will be read. If it's a function, it will be called and its return value will be used as the array.
      */
    var tweens: js.UndefOr[(js.Array[js.Object | TweenBuilderConfig]) | js.Function] = js.undefined
    
    /**
      * If `true`, all duration in the Timeline will be in frames instead of milliseconds.
      */
    var useFrames: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Should each tween complete, then reverse the values incrementally to get back to the starting tween values? The reverse tweening will also take `duration` milliseconds to complete. Each individual Tween configuration can override this value.
      */
    var yoyo: js.UndefOr[Boolean] = js.undefined
  }
  object TimelineBuilderConfig {
    
    @scala.inline
    def apply(): TimelineBuilderConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineBuilderConfig]
    }
    
    @scala.inline
    implicit class TimelineBuilderConfigMutableBuilder[Self <: TimelineBuilderConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbackScope(value: js.Any): Self = StObject.set(x, "callbackScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackScopeUndefined: Self = StObject.set(x, "callbackScope", js.undefined)
      
      @scala.inline
      def setCompleteDelay(value: Double | js.Function | js.Object | js.Array[js.Any]): Self = StObject.set(x, "completeDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleteDelayUndefined: Self = StObject.set(x, "completeDelay", js.undefined)
      
      @scala.inline
      def setCompleteDelayVarargs(value: js.Any*): Self = StObject.set(x, "completeDelay", js.Array(value :_*))
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEase(value: String | js.Function): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEaseParams(value: js.Array[js.Any]): Self = StObject.set(x, "easeParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEaseParamsUndefined: Self = StObject.set(x, "easeParams", js.undefined)
      
      @scala.inline
      def setEaseParamsVarargs(value: js.Any*): Self = StObject.set(x, "easeParams", js.Array(value :_*))
      
      @scala.inline
      def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
      
      @scala.inline
      def setFlipX(value: Boolean): Self = StObject.set(x, "flipX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipXUndefined: Self = StObject.set(x, "flipX", js.undefined)
      
      @scala.inline
      def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipYUndefined: Self = StObject.set(x, "flipY", js.undefined)
      
      @scala.inline
      def setHold(value: Double): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
      
      @scala.inline
      def setLoop(value: Double | js.Function | js.Object | js.Array[js.Any]): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopDelay(value: Double | js.Function | js.Object | js.Array[js.Any]): Self = StObject.set(x, "loopDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopDelayUndefined: Self = StObject.set(x, "loopDelay", js.undefined)
      
      @scala.inline
      def setLoopDelayVarargs(value: js.Any*): Self = StObject.set(x, "loopDelay", js.Array(value :_*))
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setLoopVarargs(value: js.Any*): Self = StObject.set(x, "loop", js.Array(value :_*))
      
      @scala.inline
      def setOnComplete(value: TimelineOnCompleteCallback): Self = StObject.set(x, "onComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCompleteParams(value: js.Array[js.Any]): Self = StObject.set(x, "onCompleteParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCompleteParamsUndefined: Self = StObject.set(x, "onCompleteParams", js.undefined)
      
      @scala.inline
      def setOnCompleteParamsVarargs(value: js.Any*): Self = StObject.set(x, "onCompleteParams", js.Array(value :_*))
      
      @scala.inline
      def setOnCompleteScope(value: js.Any): Self = StObject.set(x, "onCompleteScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCompleteScopeUndefined: Self = StObject.set(x, "onCompleteScope", js.undefined)
      
      @scala.inline
      def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      @scala.inline
      def setOnLoop(value: TimelineOnLoopCallback): Self = StObject.set(x, "onLoop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoopParams(value: js.Array[js.Any]): Self = StObject.set(x, "onLoopParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoopParamsUndefined: Self = StObject.set(x, "onLoopParams", js.undefined)
      
      @scala.inline
      def setOnLoopParamsVarargs(value: js.Any*): Self = StObject.set(x, "onLoopParams", js.Array(value :_*))
      
      @scala.inline
      def setOnLoopScope(value: js.Any): Self = StObject.set(x, "onLoopScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoopScopeUndefined: Self = StObject.set(x, "onLoopScope", js.undefined)
      
      @scala.inline
      def setOnLoopUndefined: Self = StObject.set(x, "onLoop", js.undefined)
      
      @scala.inline
      def setOnStart(value: TimelineOnStartCallback): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStartParams(value: js.Array[js.Any]): Self = StObject.set(x, "onStartParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStartParamsUndefined: Self = StObject.set(x, "onStartParams", js.undefined)
      
      @scala.inline
      def setOnStartParamsVarargs(value: js.Any*): Self = StObject.set(x, "onStartParams", js.Array(value :_*))
      
      @scala.inline
      def setOnStartScope(value: js.Any): Self = StObject.set(x, "onStartScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStartScopeUndefined: Self = StObject.set(x, "onStartScope", js.undefined)
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: TimelineOnUpdateCallback): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUpdateParams(value: js.Array[js.Any]): Self = StObject.set(x, "onUpdateParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUpdateParamsUndefined: Self = StObject.set(x, "onUpdateParams", js.undefined)
      
      @scala.inline
      def setOnUpdateParamsVarargs(value: js.Any*): Self = StObject.set(x, "onUpdateParams", js.Array(value :_*))
      
      @scala.inline
      def setOnUpdateScope(value: js.Any): Self = StObject.set(x, "onUpdateScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUpdateScopeUndefined: Self = StObject.set(x, "onUpdateScope", js.undefined)
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setOnYoyo(value: TimelineOnYoyoCallback): Self = StObject.set(x, "onYoyo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnYoyoParams(value: js.Array[js.Any]): Self = StObject.set(x, "onYoyoParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnYoyoParamsUndefined: Self = StObject.set(x, "onYoyoParams", js.undefined)
      
      @scala.inline
      def setOnYoyoParamsVarargs(value: js.Any*): Self = StObject.set(x, "onYoyoParams", js.Array(value :_*))
      
      @scala.inline
      def setOnYoyoScope(value: js.Any): Self = StObject.set(x, "onYoyoScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnYoyoScopeUndefined: Self = StObject.set(x, "onYoyoScope", js.undefined)
      
      @scala.inline
      def setOnYoyoUndefined: Self = StObject.set(x, "onYoyo", js.undefined)
      
      @scala.inline
      def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
      
      @scala.inline
      def setRepeat(value: integer): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatDelay(value: Double): Self = StObject.set(x, "repeatDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatDelayUndefined: Self = StObject.set(x, "repeatDelay", js.undefined)
      
      @scala.inline
      def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      @scala.inline
      def setTargets(value: js.Any): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      @scala.inline
      def setTotalDuration(value: Double): Self = StObject.set(x, "totalDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalDurationUndefined: Self = StObject.set(x, "totalDuration", js.undefined)
      
      @scala.inline
      def setTweens(value: (js.Array[js.Object | TweenBuilderConfig]) | js.Function): Self = StObject.set(x, "tweens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTweensUndefined: Self = StObject.set(x, "tweens", js.undefined)
      
      @scala.inline
      def setTweensVarargs(value: (js.Object | TweenBuilderConfig)*): Self = StObject.set(x, "tweens", js.Array(value :_*))
      
      @scala.inline
      def setUseFrames(value: Boolean): Self = StObject.set(x, "useFrames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseFramesUndefined: Self = StObject.set(x, "useFrames", js.undefined)
      
      @scala.inline
      def setYoyo(value: Boolean): Self = StObject.set(x, "yoyo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYoyoUndefined: Self = StObject.set(x, "yoyo", js.undefined)
    }
  }
  
  @js.native
  trait TimelineOnCompleteCallback extends StObject {
    
    def apply(timeline: Timeline, param: js.Any*): Unit = js.native
  }
  
  @js.native
  trait TimelineOnLoopCallback extends StObject {
    
    def apply(timeline: Timeline, param: js.Any*): Unit = js.native
  }
  
  @js.native
  trait TimelineOnStartCallback extends StObject {
    
    def apply(timeline: Timeline, param: js.Any*): Unit = js.native
  }
  
  @js.native
  trait TimelineOnUpdateCallback extends StObject {
    
    def apply(timeline: Timeline, param: js.Any*): Unit = js.native
  }
  
  @js.native
  trait TimelineOnYoyoCallback extends StObject {
    
    def apply(timeline: Timeline, param: js.Any*): Unit = js.native
  }
  
  trait TweenBuilderConfig extends StObject {
    
    /**
      * Scope (this) for the callbacks. The default scope is the tween.
      */
    var callbackScope: js.UndefOr[js.Any] = js.undefined
    
    /**
      * The time the tween will wait before the onComplete event is dispatched once it has completed, in ms.
      */
    var completeDelay: js.UndefOr[String | Double | js.Function | js.Object | js.Array[js.Any]] = js.undefined
    
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
    var easeParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
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
      * The number of times the tween will repeat. (A value of 1 means the tween will play twice, as it repeated once.) The first loop starts after every property tween has completed once.
      */
    var loop: js.UndefOr[String | Double | js.Function | js.Object | js.Array[js.Any]] = js.undefined
    
    /**
      * The time the tween will pause before starting either a yoyo or returning to the start for a repeat.
      */
    var loopDelay: js.UndefOr[String | Double | js.Function | js.Object | js.Array[js.Any]] = js.undefined
    
    /**
      * Used when the Tween is part of a Timeline.
      */
    var offset: js.UndefOr[String | Double | js.Function | js.Object | js.Array[js.Any]] = js.undefined
    
    /**
      * A function to call when the tween becomes active within the Tween Manager.
      */
    var onActive: js.UndefOr[TweenOnActiveCallback] = js.undefined
    
    /**
      * Additional parameters to pass to `onActive`.
      */
    var onActiveParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /**
      * Scope (this) for `onActive`.
      */
    var onActiveScope: js.UndefOr[js.Any] = js.undefined
    
    /**
      * A function to call when the tween completes.
      */
    var onComplete: js.UndefOr[TweenOnCompleteCallback] = js.undefined
    
    /**
      * Additional parameters to pass to `onComplete`.
      */
    var onCompleteParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
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
    var onLoopParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
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
    var onRepeatParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /**
      * Scope (this) for `onRepeat`.
      */
    var onRepeatScope: js.UndefOr[js.Any] = js.undefined
    
    /**
      * A function to call when the tween starts playback, after any delays have expired.
      */
    var onStart: js.UndefOr[TweenOnStartCallback] = js.undefined
    
    /**
      * Additional parameters to pass to `onStart`.
      */
    var onStartParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /**
      * Scope (this) for `onStart`.
      */
    var onStartScope: js.UndefOr[js.Any] = js.undefined
    
    /**
      * A function to call when the tween is stopped.
      */
    var onStop: js.UndefOr[TweenOnStopCallback] = js.undefined
    
    /**
      * Additional parameters to pass to `onStop`.
      */
    var onStopParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /**
      * Scope (this) for `onStop`.
      */
    var onStopScope: js.UndefOr[js.Any] = js.undefined
    
    /**
      * A function to call each time the tween steps. Called once per property per target.
      */
    var onUpdate: js.UndefOr[TweenOnUpdateCallback] = js.undefined
    
    /**
      * Additional parameters to pass to `onUpdate`.
      */
    var onUpdateParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
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
    var onYoyoParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /**
      * Scope (this) for `onYoyo`.
      */
    var onYoyoScope: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Does the tween start in a paused state (true) or playing (false)?
      */
    var paused: js.UndefOr[Boolean] = js.undefined
    
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
    var targets: js.Any
    
    /**
      * Use frames or milliseconds?
      */
    var useFrames: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Should the tween complete, then reverse the values incrementally to get back to the starting tween values? The reverse tweening will also take `duration` milliseconds to complete.
      */
    var yoyo: js.UndefOr[Boolean] = js.undefined
  }
  object TweenBuilderConfig {
    
    @scala.inline
    def apply(targets: js.Any): TweenBuilderConfig = {
      val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
      __obj.asInstanceOf[TweenBuilderConfig]
    }
    
    @scala.inline
    implicit class TweenBuilderConfigMutableBuilder[Self <: TweenBuilderConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbackScope(value: js.Any): Self = StObject.set(x, "callbackScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackScopeUndefined: Self = StObject.set(x, "callbackScope", js.undefined)
      
      @scala.inline
      def setCompleteDelay(value: String | Double | js.Function | js.Object | js.Array[js.Any]): Self = StObject.set(x, "completeDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleteDelayUndefined: Self = StObject.set(x, "completeDelay", js.undefined)
      
      @scala.inline
      def setCompleteDelayVarargs(value: js.Any*): Self = StObject.set(x, "completeDelay", js.Array(value :_*))
      
      @scala.inline
      def setDelay(value: Double | js.Function): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEase(value: String | js.Function): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEaseParams(value: js.Array[js.Any]): Self = StObject.set(x, "easeParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEaseParamsUndefined: Self = StObject.set(x, "easeParams", js.undefined)
      
      @scala.inline
      def setEaseParamsVarargs(value: js.Any*): Self = StObject.set(x, "easeParams", js.Array(value :_*))
      
      @scala.inline
      def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
      
      @scala.inline
      def setFlipX(value: Boolean): Self = StObject.set(x, "flipX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipXUndefined: Self = StObject.set(x, "flipX", js.undefined)
      
      @scala.inline
      def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipYUndefined: Self = StObject.set(x, "flipY", js.undefined)
      
      @scala.inline
      def setHold(value: Double): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
      
      @scala.inline
      def setLoop(value: String | Double | js.Function | js.Object | js.Array[js.Any]): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopDelay(value: String | Double | js.Function | js.Object | js.Array[js.Any]): Self = StObject.set(x, "loopDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopDelayUndefined: Self = StObject.set(x, "loopDelay", js.undefined)
      
      @scala.inline
      def setLoopDelayVarargs(value: js.Any*): Self = StObject.set(x, "loopDelay", js.Array(value :_*))
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setLoopVarargs(value: js.Any*): Self = StObject.set(x, "loop", js.Array(value :_*))
      
      @scala.inline
      def setOffset(value: String | Double | js.Function | js.Object | js.Array[js.Any]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOffsetVarargs(value: js.Any*): Self = StObject.set(x, "offset", js.Array(value :_*))
      
      @scala.inline
      def setOnActive(value: TweenOnActiveCallback): Self = StObject.set(x, "onActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnActiveParams(value: js.Array[js.Any]): Self = StObject.set(x, "onActiveParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnActiveParamsUndefined: Self = StObject.set(x, "onActiveParams", js.undefined)
      
      @scala.inline
      def setOnActiveParamsVarargs(value: js.Any*): Self = StObject.set(x, "onActiveParams", js.Array(value :_*))
      
      @scala.inline
      def setOnActiveScope(value: js.Any): Self = StObject.set(x, "onActiveScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnActiveScopeUndefined: Self = StObject.set(x, "onActiveScope", js.undefined)
      
      @scala.inline
      def setOnActiveUndefined: Self = StObject.set(x, "onActive", js.undefined)
      
      @scala.inline
      def setOnComplete(value: TweenOnCompleteCallback): Self = StObject.set(x, "onComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCompleteParams(value: js.Array[js.Any]): Self = StObject.set(x, "onCompleteParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCompleteParamsUndefined: Self = StObject.set(x, "onCompleteParams", js.undefined)
      
      @scala.inline
      def setOnCompleteParamsVarargs(value: js.Any*): Self = StObject.set(x, "onCompleteParams", js.Array(value :_*))
      
      @scala.inline
      def setOnCompleteScope(value: js.Any): Self = StObject.set(x, "onCompleteScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCompleteScopeUndefined: Self = StObject.set(x, "onCompleteScope", js.undefined)
      
      @scala.inline
      def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      @scala.inline
      def setOnLoop(value: TweenOnLoopCallback): Self = StObject.set(x, "onLoop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoopParams(value: js.Array[js.Any]): Self = StObject.set(x, "onLoopParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoopParamsUndefined: Self = StObject.set(x, "onLoopParams", js.undefined)
      
      @scala.inline
      def setOnLoopParamsVarargs(value: js.Any*): Self = StObject.set(x, "onLoopParams", js.Array(value :_*))
      
      @scala.inline
      def setOnLoopScope(value: js.Any): Self = StObject.set(x, "onLoopScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoopScopeUndefined: Self = StObject.set(x, "onLoopScope", js.undefined)
      
      @scala.inline
      def setOnLoopUndefined: Self = StObject.set(x, "onLoop", js.undefined)
      
      @scala.inline
      def setOnRepeat(value: TweenOnRepeatCallback): Self = StObject.set(x, "onRepeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnRepeatParams(value: js.Array[js.Any]): Self = StObject.set(x, "onRepeatParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnRepeatParamsUndefined: Self = StObject.set(x, "onRepeatParams", js.undefined)
      
      @scala.inline
      def setOnRepeatParamsVarargs(value: js.Any*): Self = StObject.set(x, "onRepeatParams", js.Array(value :_*))
      
      @scala.inline
      def setOnRepeatScope(value: js.Any): Self = StObject.set(x, "onRepeatScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnRepeatScopeUndefined: Self = StObject.set(x, "onRepeatScope", js.undefined)
      
      @scala.inline
      def setOnRepeatUndefined: Self = StObject.set(x, "onRepeat", js.undefined)
      
      @scala.inline
      def setOnStart(value: TweenOnStartCallback): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStartParams(value: js.Array[js.Any]): Self = StObject.set(x, "onStartParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStartParamsUndefined: Self = StObject.set(x, "onStartParams", js.undefined)
      
      @scala.inline
      def setOnStartParamsVarargs(value: js.Any*): Self = StObject.set(x, "onStartParams", js.Array(value :_*))
      
      @scala.inline
      def setOnStartScope(value: js.Any): Self = StObject.set(x, "onStartScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStartScopeUndefined: Self = StObject.set(x, "onStartScope", js.undefined)
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      @scala.inline
      def setOnStop(value: TweenOnStopCallback): Self = StObject.set(x, "onStop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStopParams(value: js.Array[js.Any]): Self = StObject.set(x, "onStopParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStopParamsUndefined: Self = StObject.set(x, "onStopParams", js.undefined)
      
      @scala.inline
      def setOnStopParamsVarargs(value: js.Any*): Self = StObject.set(x, "onStopParams", js.Array(value :_*))
      
      @scala.inline
      def setOnStopScope(value: js.Any): Self = StObject.set(x, "onStopScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStopScopeUndefined: Self = StObject.set(x, "onStopScope", js.undefined)
      
      @scala.inline
      def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: TweenOnUpdateCallback): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUpdateParams(value: js.Array[js.Any]): Self = StObject.set(x, "onUpdateParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUpdateParamsUndefined: Self = StObject.set(x, "onUpdateParams", js.undefined)
      
      @scala.inline
      def setOnUpdateParamsVarargs(value: js.Any*): Self = StObject.set(x, "onUpdateParams", js.Array(value :_*))
      
      @scala.inline
      def setOnUpdateScope(value: js.Any): Self = StObject.set(x, "onUpdateScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUpdateScopeUndefined: Self = StObject.set(x, "onUpdateScope", js.undefined)
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setOnYoyo(value: TweenOnYoyoCallback): Self = StObject.set(x, "onYoyo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnYoyoParams(value: js.Array[js.Any]): Self = StObject.set(x, "onYoyoParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnYoyoParamsUndefined: Self = StObject.set(x, "onYoyoParams", js.undefined)
      
      @scala.inline
      def setOnYoyoParamsVarargs(value: js.Any*): Self = StObject.set(x, "onYoyoParams", js.Array(value :_*))
      
      @scala.inline
      def setOnYoyoScope(value: js.Any): Self = StObject.set(x, "onYoyoScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnYoyoScopeUndefined: Self = StObject.set(x, "onYoyoScope", js.undefined)
      
      @scala.inline
      def setOnYoyoUndefined: Self = StObject.set(x, "onYoyo", js.undefined)
      
      @scala.inline
      def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
      
      @scala.inline
      def setProps(value: StringDictionary[Double | String | GetEndCallback | TweenPropConfig]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatDelay(value: Double): Self = StObject.set(x, "repeatDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatDelayUndefined: Self = StObject.set(x, "repeatDelay", js.undefined)
      
      @scala.inline
      def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      @scala.inline
      def setTargets(value: js.Any): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseFrames(value: Boolean): Self = StObject.set(x, "useFrames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseFramesUndefined: Self = StObject.set(x, "useFrames", js.undefined)
      
      @scala.inline
      def setYoyo(value: Boolean): Self = StObject.set(x, "yoyo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYoyoUndefined: Self = StObject.set(x, "yoyo", js.undefined)
    }
  }
  
  trait TweenConfigDefaults extends StObject {
    
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
    var ease: js.UndefOr[String] = js.undefined
    
    /**
      * Optional easing parameters.
      */
    var easeParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
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
      * The number of times to repeat the tween.
      */
    var repeat: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of milliseconds to pause before a tween will repeat.
      */
    var repeatDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * The object, or an array of objects, to run the tween on.
      */
    var targets: js.Object | js.Array[js.Object]
    
    /**
      * Should the tween complete, then reverse the values incrementally to get back to the starting tween values? The reverse tweening will also take `duration` milliseconds to complete.
      */
    var yoyo: js.UndefOr[Boolean] = js.undefined
  }
  object TweenConfigDefaults {
    
    @scala.inline
    def apply(targets: js.Object | js.Array[js.Object]): TweenConfigDefaults = {
      val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
      __obj.asInstanceOf[TweenConfigDefaults]
    }
    
    @scala.inline
    implicit class TweenConfigDefaultsMutableBuilder[Self <: TweenConfigDefaults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEase(value: String): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEaseParams(value: js.Array[js.Any]): Self = StObject.set(x, "easeParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEaseParamsUndefined: Self = StObject.set(x, "easeParams", js.undefined)
      
      @scala.inline
      def setEaseParamsVarargs(value: js.Any*): Self = StObject.set(x, "easeParams", js.Array(value :_*))
      
      @scala.inline
      def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
      
      @scala.inline
      def setFlipX(value: Boolean): Self = StObject.set(x, "flipX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipXUndefined: Self = StObject.set(x, "flipX", js.undefined)
      
      @scala.inline
      def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipYUndefined: Self = StObject.set(x, "flipY", js.undefined)
      
      @scala.inline
      def setHold(value: Double): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
      
      @scala.inline
      def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatDelay(value: Double): Self = StObject.set(x, "repeatDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatDelayUndefined: Self = StObject.set(x, "repeatDelay", js.undefined)
      
      @scala.inline
      def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      @scala.inline
      def setTargets(value: js.Object | js.Array[js.Object]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetsVarargs(value: js.Object*): Self = StObject.set(x, "targets", js.Array(value :_*))
      
      @scala.inline
      def setYoyo(value: Boolean): Self = StObject.set(x, "yoyo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYoyoUndefined: Self = StObject.set(x, "yoyo", js.undefined)
    }
  }
  
  trait TweenDataConfig extends StObject {
    
    /**
      * The current propety value.
      */
    var current: js.UndefOr[Double] = js.undefined
    
    /**
      * Time in ms/frames before tween will start.
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * Duration of the tween in ms/frames, excludes time for yoyo or repeats.
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * The ease function this tween uses.
      */
    var ease: js.Function
    
    /**
      * Delta counter
      */
    var elapsed: js.UndefOr[Double] = js.undefined
    
    /**
      * The property value at the end of the ease.
      */
    var end: js.UndefOr[Double] = js.undefined
    
    /**
      * Automatically call toggleFlipX when the TweenData yoyos or repeats
      */
    var flipX: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Automatically call toggleFlipY when the TweenData yoyos or repeats
      */
    var flipY: js.UndefOr[Boolean] = js.undefined
    
    /**
      * LoadValue generation functions.
      */
    var gen: js.UndefOr[TweenDataGenConfig] = js.undefined
    
    /**
      * If not null, is invoked _immediately_ as soon as the TweenData is running, and is set on the target property.
      */
    def getActiveValue(
      target: js.Any,
      key: String,
      value: Double,
      targetIndex: integer,
      totalTargets: integer,
      tween: Tween
    ): Unit
    /**
      * If not null, is invoked _immediately_ as soon as the TweenData is running, and is set on the target property.
      */
    @JSName("getActiveValue")
    var getActiveValue_Original: GetActiveCallback
    
    /**
      * The returned value sets what the property will be at the END of the Tween.
      */
    def getEndValue(
      target: js.Any,
      key: String,
      value: Double,
      targetIndex: integer,
      totalTargets: integer,
      tween: Tween
    ): Unit
    /**
      * The returned value sets what the property will be at the END of the Tween.
      */
    @JSName("getEndValue")
    var getEndValue_Original: GetEndCallback
    
    /**
      * The returned value sets what the property will be at the START of the Tween.
      */
    def getStartValue(
      target: js.Any,
      key: String,
      value: Double,
      targetIndex: integer,
      totalTargets: integer,
      tween: Tween
    ): Unit
    /**
      * The returned value sets what the property will be at the START of the Tween.
      */
    @JSName("getStartValue")
    var getStartValue_Original: GetStartCallback
    
    /**
      * Time in ms/frames the tween will pause before running the yoyo or starting a repeat.
      */
    var hold: js.UndefOr[Double] = js.undefined
    
    /**
      * The target index within the Tween targets array.
      */
    var index: integer
    
    /**
      * The property of the target being tweened.
      */
    var key: String
    
    /**
      * The previous property value.
      */
    var previous: js.UndefOr[Double] = js.undefined
    
    /**
      * Between 0 and 1 showing completion of this TweenData.
      */
    var progress: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of times to repeat the tween. The tween will always run once regardless, so a repeat value of '1' will play the tween twice.
      */
    var repeat: js.UndefOr[integer] = js.undefined
    
    /**
      * How many repeats are left to run?
      */
    var repeatCounter: js.UndefOr[integer] = js.undefined
    
    /**
      * Time in ms/frames before the repeat will start.
      */
    var repeatDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * The property value at the start of the ease.
      */
    var start: js.UndefOr[Double] = js.undefined
    
    /**
      * TWEEN_CONST.CREATED
      */
    var state: js.UndefOr[integer] = js.undefined
    
    /**
      * Time duration 1.
      */
    var t1: js.UndefOr[Double] = js.undefined
    
    /**
      * Time duration 2.
      */
    var t2: js.UndefOr[Double] = js.undefined
    
    /**
      * The target to tween.
      */
    var target: js.Any
    
    /**
      * The total calculated duration of this TweenData (based on duration, repeat, delay and yoyo)
      */
    var totalDuration: js.UndefOr[Double] = js.undefined
    
    /**
      * Cause the tween to return back to its start value after hold has expired.
      */
    var yoyo: js.UndefOr[Boolean] = js.undefined
  }
  object TweenDataConfig {
    
    @scala.inline
    def apply(
      ease: js.Function,
      getActiveValue: (/* target */ js.Any, /* key */ String, /* value */ Double, /* targetIndex */ integer, /* totalTargets */ integer, /* tween */ Tween) => Unit,
      getEndValue: (/* target */ js.Any, /* key */ String, /* value */ Double, /* targetIndex */ integer, /* totalTargets */ integer, /* tween */ Tween) => Unit,
      getStartValue: (/* target */ js.Any, /* key */ String, /* value */ Double, /* targetIndex */ integer, /* totalTargets */ integer, /* tween */ Tween) => Unit,
      index: integer,
      key: String,
      target: js.Any
    ): TweenDataConfig = {
      val __obj = js.Dynamic.literal(ease = ease.asInstanceOf[js.Any], getActiveValue = js.Any.fromFunction6(getActiveValue), getEndValue = js.Any.fromFunction6(getEndValue), getStartValue = js.Any.fromFunction6(getStartValue), index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TweenDataConfig]
    }
    
    @scala.inline
    implicit class TweenDataConfigMutableBuilder[Self <: TweenDataConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEase(value: js.Function): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElapsed(value: Double): Self = StObject.set(x, "elapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElapsedUndefined: Self = StObject.set(x, "elapsed", js.undefined)
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setFlipX(value: Boolean): Self = StObject.set(x, "flipX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipXUndefined: Self = StObject.set(x, "flipX", js.undefined)
      
      @scala.inline
      def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipYUndefined: Self = StObject.set(x, "flipY", js.undefined)
      
      @scala.inline
      def setGen(value: TweenDataGenConfig): Self = StObject.set(x, "gen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenUndefined: Self = StObject.set(x, "gen", js.undefined)
      
      @scala.inline
      def setGetActiveValue(
        value: (/* target */ js.Any, /* key */ String, /* value */ Double, /* targetIndex */ integer, /* totalTargets */ integer, /* tween */ Tween) => Unit
      ): Self = StObject.set(x, "getActiveValue", js.Any.fromFunction6(value))
      
      @scala.inline
      def setGetEndValue(
        value: (/* target */ js.Any, /* key */ String, /* value */ Double, /* targetIndex */ integer, /* totalTargets */ integer, /* tween */ Tween) => Unit
      ): Self = StObject.set(x, "getEndValue", js.Any.fromFunction6(value))
      
      @scala.inline
      def setGetStartValue(
        value: (/* target */ js.Any, /* key */ String, /* value */ Double, /* targetIndex */ integer, /* totalTargets */ integer, /* tween */ Tween) => Unit
      ): Self = StObject.set(x, "getStartValue", js.Any.fromFunction6(value))
      
      @scala.inline
      def setHold(value: Double): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
      
      @scala.inline
      def setIndex(value: integer): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevious(value: Double): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setRepeat(value: integer): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatCounter(value: integer): Self = StObject.set(x, "repeatCounter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatCounterUndefined: Self = StObject.set(x, "repeatCounter", js.undefined)
      
      @scala.inline
      def setRepeatDelay(value: Double): Self = StObject.set(x, "repeatDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatDelayUndefined: Self = StObject.set(x, "repeatDelay", js.undefined)
      
      @scala.inline
      def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setState(value: integer): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setT1(value: Double): Self = StObject.set(x, "t1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setT1Undefined: Self = StObject.set(x, "t1", js.undefined)
      
      @scala.inline
      def setT2(value: Double): Self = StObject.set(x, "t2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setT2Undefined: Self = StObject.set(x, "t2", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalDuration(value: Double): Self = StObject.set(x, "totalDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalDurationUndefined: Self = StObject.set(x, "totalDuration", js.undefined)
      
      @scala.inline
      def setYoyo(value: Boolean): Self = StObject.set(x, "yoyo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYoyoUndefined: Self = StObject.set(x, "yoyo", js.undefined)
    }
  }
  
  trait TweenDataGenConfig extends StObject {
    
    /**
      * Time in ms/frames before tween will start.
      */
    var delay: js.Function
    
    /**
      * Duration of the tween in ms/frames, excludes time for yoyo or repeats.
      */
    var duration: js.Function
    
    /**
      * Time in ms/frames the tween will pause before running the yoyo or starting a repeat.
      */
    var hold: js.Function
    
    /**
      * Number of times to repeat the tween. The tween will always run once regardless, so a repeat value of '1' will play the tween twice.
      */
    var repeat: js.Function
    
    /**
      * Time in ms/frames before the repeat will start.
      */
    var repeatDelay: js.Function
  }
  object TweenDataGenConfig {
    
    @scala.inline
    def apply(
      delay: js.Function,
      duration: js.Function,
      hold: js.Function,
      repeat: js.Function,
      repeatDelay: js.Function
    ): TweenDataGenConfig = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], hold = hold.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], repeatDelay = repeatDelay.asInstanceOf[js.Any])
      __obj.asInstanceOf[TweenDataGenConfig]
    }
    
    @scala.inline
    implicit class TweenDataGenConfigMutableBuilder[Self <: TweenDataGenConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: js.Function): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: js.Function): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHold(value: js.Function): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeat(value: js.Function): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatDelay(value: js.Function): Self = StObject.set(x, "repeatDelay", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TweenOnActiveCallback extends StObject {
    
    def apply(tween: Tween, target: js.Any, param: js.Any*): Unit = js.native
  }
  
  @js.native
  trait TweenOnCompleteCallback extends StObject {
    
    def apply(tween: Tween, targets: js.Array[js.Any], param: js.Any*): Unit = js.native
  }
  
  @js.native
  trait TweenOnLoopCallback extends StObject {
    
    def apply(tween: Tween, targets: js.Array[js.Any], param: js.Any*): Unit = js.native
  }
  
  @js.native
  trait TweenOnRepeatCallback extends StObject {
    
    def apply(tween: Tween, target: js.Any, param: js.Any*): Unit = js.native
  }
  
  @js.native
  trait TweenOnStartCallback extends StObject {
    
    def apply(tween: Tween, targets: js.Array[js.Any], param: js.Any*): Unit = js.native
  }
  
  @js.native
  trait TweenOnStopCallback extends StObject {
    
    def apply(tween: Tween, targets: js.Array[js.Any], param: js.Any*): Unit = js.native
  }
  
  @js.native
  trait TweenOnUpdateCallback extends StObject {
    
    def apply(tween: Tween, target: js.Any, param: js.Any*): Unit = js.native
  }
  
  @js.native
  trait TweenOnYoyoCallback extends StObject {
    
    def apply(tween: Tween, target: js.Any, param: js.Any*): Unit = js.native
  }
  
  trait TweenPropConfig extends StObject {
    
    /**
      * Time in ms/frames before tween will start.
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * Duration of the tween in ms/frames.
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * The ease function this tween uses.
      */
    var ease: js.UndefOr[String | js.Function] = js.undefined
    
    /**
      * Should toggleFlipX be called when yoyo or repeat happens?
      */
    var flipX: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Should toggleFlipY be called when yoyo or repeat happens?
      */
    var flipY: js.UndefOr[Boolean] = js.undefined
    
    /**
      * What the property will be set to immediately when this tween becomes active.
      */
    var getActive: js.UndefOr[GetActiveCallback] = js.undefined
    
    /**
      * What the property will be at the END of the Tween.
      */
    var getEnd: js.UndefOr[GetEndCallback] = js.undefined
    
    /**
      * What the property will be at the START of the Tween.
      */
    var getStart: js.UndefOr[GetStartCallback] = js.undefined
    
    /**
      * Time in ms/frames the tween will pause before repeating or returning to its starting value if yoyo is set to true.
      */
    var hold: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of times to repeat the tween. The tween will always run once regardless, so a repeat value of '1' will play the tween twice.
      */
    var repeat: js.UndefOr[Double] = js.undefined
    
    /**
      * Time in ms/frames before the repeat will start.
      */
    var repeatDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * What the property will be at the END of the Tween.
      */
    var value: js.UndefOr[Double | String | GetEndCallback | TweenPropConfig] = js.undefined
    
    /**
      * Determines whether the tween should return back to its start value after hold has expired.
      */
    var yoyo: js.UndefOr[Boolean] = js.undefined
  }
  object TweenPropConfig {
    
    @scala.inline
    def apply(): TweenPropConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TweenPropConfig]
    }
    
    @scala.inline
    implicit class TweenPropConfigMutableBuilder[Self <: TweenPropConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEase(value: String | js.Function): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
      
      @scala.inline
      def setFlipX(value: Boolean): Self = StObject.set(x, "flipX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipXUndefined: Self = StObject.set(x, "flipX", js.undefined)
      
      @scala.inline
      def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipYUndefined: Self = StObject.set(x, "flipY", js.undefined)
      
      @scala.inline
      def setGetActive(
        value: (/* target */ js.Any, /* key */ String, /* value */ Double, /* targetIndex */ integer, /* totalTargets */ integer, /* tween */ Tween) => Unit
      ): Self = StObject.set(x, "getActive", js.Any.fromFunction6(value))
      
      @scala.inline
      def setGetActiveUndefined: Self = StObject.set(x, "getActive", js.undefined)
      
      @scala.inline
      def setGetEnd(
        value: (/* target */ js.Any, /* key */ String, /* value */ Double, /* targetIndex */ integer, /* totalTargets */ integer, /* tween */ Tween) => Unit
      ): Self = StObject.set(x, "getEnd", js.Any.fromFunction6(value))
      
      @scala.inline
      def setGetEndUndefined: Self = StObject.set(x, "getEnd", js.undefined)
      
      @scala.inline
      def setGetStart(
        value: (/* target */ js.Any, /* key */ String, /* value */ Double, /* targetIndex */ integer, /* totalTargets */ integer, /* tween */ Tween) => Unit
      ): Self = StObject.set(x, "getStart", js.Any.fromFunction6(value))
      
      @scala.inline
      def setGetStartUndefined: Self = StObject.set(x, "getStart", js.undefined)
      
      @scala.inline
      def setHold(value: Double): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
      
      @scala.inline
      def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatDelay(value: Double): Self = StObject.set(x, "repeatDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatDelayUndefined: Self = StObject.set(x, "repeatDelay", js.undefined)
      
      @scala.inline
      def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      @scala.inline
      def setValue(value: Double | String | GetEndCallback | TweenPropConfig): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueFunction6(
        value: (/* target */ js.Any, /* key */ String, /* value */ Double, /* targetIndex */ integer, /* totalTargets */ integer, /* tween */ Tween) => Unit
      ): Self = StObject.set(x, "value", js.Any.fromFunction6(value))
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setYoyo(value: Boolean): Self = StObject.set(x, "yoyo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYoyoUndefined: Self = StObject.set(x, "yoyo", js.undefined)
    }
  }
}
