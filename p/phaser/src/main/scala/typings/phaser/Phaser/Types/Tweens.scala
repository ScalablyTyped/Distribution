package typings.phaser.Phaser.Types

import org.scalablytyped.runtime.StringDictionary
import typings.phaser.Phaser.Tweens.Timeline
import typings.phaser.Phaser.Tweens.Tween
import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait NumberTweenBuilderConfig extends StObject {
    
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
    var delay: js.UndefOr[Double] = js.native
    
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
      * The start number.
      */
    var from: js.UndefOr[Double] = js.native
    
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
      * A function to call when the tween starts.
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
      * The number of times to repeat the tween.
      */
    var repeat: js.UndefOr[Double] = js.native
    
    /**
      * The number of milliseconds to pause before a tween will repeat.
      */
    var repeatDelay: js.UndefOr[Double] = js.native
    
    /**
      * The end number.
      */
    var to: js.UndefOr[Double] = js.native
    
    /**
      * Use frames or milliseconds?
      */
    var useFrames: js.UndefOr[Boolean] = js.native
    
    /**
      * Should the tween complete, then reverse the values incrementally to get back to the starting tween values? The reverse tweening will also take `duration` milliseconds to complete.
      */
    var yoyo: js.UndefOr[Boolean] = js.native
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
      def setCompleteDelay(value: String | Double | js.Function | js.Object | js.Array[_]): Self = StObject.set(x, "completeDelay", value.asInstanceOf[js.Any])
      
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
      def setEaseParams(value: js.Array[_]): Self = StObject.set(x, "easeParams", value.asInstanceOf[js.Any])
      
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
      def setLoop(value: String | Double | js.Function | js.Object | js.Array[_]): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopDelay(value: String | Double | js.Function | js.Object | js.Array[_]): Self = StObject.set(x, "loopDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopDelayUndefined: Self = StObject.set(x, "loopDelay", js.undefined)
      
      @scala.inline
      def setLoopDelayVarargs(value: js.Any*): Self = StObject.set(x, "loopDelay", js.Array(value :_*))
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setLoopVarargs(value: js.Any*): Self = StObject.set(x, "loop", js.Array(value :_*))
      
      @scala.inline
      def setOffset(value: String | Double | js.Function | js.Object | js.Array[_]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOffsetVarargs(value: js.Any*): Self = StObject.set(x, "offset", js.Array(value :_*))
      
      @scala.inline
      def setOnComplete(value: (/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any) => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnCompleteParams(value: js.Array[_]): Self = StObject.set(x, "onCompleteParams", value.asInstanceOf[js.Any])
      
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
      def setOnLoop(value: (/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any) => Unit): Self = StObject.set(x, "onLoop", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnLoopParams(value: js.Array[_]): Self = StObject.set(x, "onLoopParams", value.asInstanceOf[js.Any])
      
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
      def setOnRepeat(value: (/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "onRepeat", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnRepeatParams(value: js.Array[_]): Self = StObject.set(x, "onRepeatParams", value.asInstanceOf[js.Any])
      
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
      def setOnStart(value: (/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any) => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnStartParams(value: js.Array[_]): Self = StObject.set(x, "onStartParams", value.asInstanceOf[js.Any])
      
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
      def setOnStop(value: (/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any) => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnStopParams(value: js.Array[_]): Self = StObject.set(x, "onStopParams", value.asInstanceOf[js.Any])
      
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
      def setOnUpdate(value: (/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnUpdateParams(value: js.Array[_]): Self = StObject.set(x, "onUpdateParams", value.asInstanceOf[js.Any])
      
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
      def setOnYoyo(value: (/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "onYoyo", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnYoyoParams(value: js.Array[_]): Self = StObject.set(x, "onYoyoParams", value.asInstanceOf[js.Any])
      
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
  
  @js.native
  trait StaggerConfig extends StObject {
    
    /**
      * An ease to apply across the staggered values. Can either be a string, such as 'sine.inout', or a function.
      */
    var ease: js.UndefOr[String | js.Function] = js.native
    
    /**
      * The index to start the stagger from. Can be the strings `first`, `last` or `center`, or an integer representing the stagger position.
      */
    var from: js.UndefOr[String | integer] = js.native
    
    /**
      * Set the stagger to run across a grid by providing an array where element 0 is the width of the grid and element 1 is the height. Combine with the 'from' property to control direction.
      */
    var grid: js.UndefOr[js.Array[integer]] = js.native
    
    /**
      * The value to start the stagger from. Can be used as a way to offset the stagger while still using a range for the value.
      */
    var start: js.UndefOr[Double] = js.native
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
  
  @js.native
  trait TimelineBuilderConfig extends StObject {
    
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
    implicit class TimelineBuilderConfigMutableBuilder[Self <: TimelineBuilderConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbackScope(value: js.Any): Self = StObject.set(x, "callbackScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackScopeUndefined: Self = StObject.set(x, "callbackScope", js.undefined)
      
      @scala.inline
      def setCompleteDelay(value: Double | js.Function | js.Object | js.Array[_]): Self = StObject.set(x, "completeDelay", value.asInstanceOf[js.Any])
      
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
      def setEaseParams(value: js.Array[_]): Self = StObject.set(x, "easeParams", value.asInstanceOf[js.Any])
      
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
      def setLoop(value: Double | js.Function | js.Object | js.Array[_]): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopDelay(value: Double | js.Function | js.Object | js.Array[_]): Self = StObject.set(x, "loopDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopDelayUndefined: Self = StObject.set(x, "loopDelay", js.undefined)
      
      @scala.inline
      def setLoopDelayVarargs(value: js.Any*): Self = StObject.set(x, "loopDelay", js.Array(value :_*))
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setLoopVarargs(value: js.Any*): Self = StObject.set(x, "loop", js.Array(value :_*))
      
      @scala.inline
      def setOnComplete(value: (/* timeline */ Timeline, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCompleteParams(value: js.Array[_]): Self = StObject.set(x, "onCompleteParams", value.asInstanceOf[js.Any])
      
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
      def setOnLoop(value: (/* timeline */ Timeline, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "onLoop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnLoopParams(value: js.Array[_]): Self = StObject.set(x, "onLoopParams", value.asInstanceOf[js.Any])
      
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
      def setOnStart(value: (/* timeline */ Timeline, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnStartParams(value: js.Array[_]): Self = StObject.set(x, "onStartParams", value.asInstanceOf[js.Any])
      
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
      def setOnUpdate(value: (/* timeline */ Timeline, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnUpdateParams(value: js.Array[_]): Self = StObject.set(x, "onUpdateParams", value.asInstanceOf[js.Any])
      
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
      def setOnYoyo(value: (/* timeline */ Timeline, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "onYoyo", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnYoyoParams(value: js.Array[_]): Self = StObject.set(x, "onYoyoParams", value.asInstanceOf[js.Any])
      
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
  
  type TimelineOnCompleteCallback = js.Function2[/* timeline */ Timeline, /* repeated */ js.Any, Unit]
  
  type TimelineOnLoopCallback = js.Function2[/* timeline */ Timeline, /* repeated */ js.Any, Unit]
  
  type TimelineOnStartCallback = js.Function2[/* timeline */ Timeline, /* repeated */ js.Any, Unit]
  
  type TimelineOnUpdateCallback = js.Function2[/* timeline */ Timeline, /* repeated */ js.Any, Unit]
  
  type TimelineOnYoyoCallback = js.Function2[/* timeline */ Timeline, /* repeated */ js.Any, Unit]
  
  @js.native
  trait TweenBuilderConfig extends StObject {
    
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
    implicit class TweenBuilderConfigMutableBuilder[Self <: TweenBuilderConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbackScope(value: js.Any): Self = StObject.set(x, "callbackScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackScopeUndefined: Self = StObject.set(x, "callbackScope", js.undefined)
      
      @scala.inline
      def setCompleteDelay(value: String | Double | js.Function | js.Object | js.Array[_]): Self = StObject.set(x, "completeDelay", value.asInstanceOf[js.Any])
      
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
      def setEaseParams(value: js.Array[_]): Self = StObject.set(x, "easeParams", value.asInstanceOf[js.Any])
      
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
      def setLoop(value: String | Double | js.Function | js.Object | js.Array[_]): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopDelay(value: String | Double | js.Function | js.Object | js.Array[_]): Self = StObject.set(x, "loopDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopDelayUndefined: Self = StObject.set(x, "loopDelay", js.undefined)
      
      @scala.inline
      def setLoopDelayVarargs(value: js.Any*): Self = StObject.set(x, "loopDelay", js.Array(value :_*))
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setLoopVarargs(value: js.Any*): Self = StObject.set(x, "loop", js.Array(value :_*))
      
      @scala.inline
      def setOffset(value: String | Double | js.Function | js.Object | js.Array[_]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOffsetVarargs(value: js.Any*): Self = StObject.set(x, "offset", js.Array(value :_*))
      
      @scala.inline
      def setOnActive(value: (/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "onActive", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnActiveParams(value: js.Array[_]): Self = StObject.set(x, "onActiveParams", value.asInstanceOf[js.Any])
      
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
      def setOnComplete(value: (/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any) => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnCompleteParams(value: js.Array[_]): Self = StObject.set(x, "onCompleteParams", value.asInstanceOf[js.Any])
      
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
      def setOnLoop(value: (/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any) => Unit): Self = StObject.set(x, "onLoop", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnLoopParams(value: js.Array[_]): Self = StObject.set(x, "onLoopParams", value.asInstanceOf[js.Any])
      
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
      def setOnRepeat(value: (/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "onRepeat", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnRepeatParams(value: js.Array[_]): Self = StObject.set(x, "onRepeatParams", value.asInstanceOf[js.Any])
      
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
      def setOnStart(value: (/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any) => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnStartParams(value: js.Array[_]): Self = StObject.set(x, "onStartParams", value.asInstanceOf[js.Any])
      
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
      def setOnStop(value: (/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any) => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnStopParams(value: js.Array[_]): Self = StObject.set(x, "onStopParams", value.asInstanceOf[js.Any])
      
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
      def setOnUpdate(value: (/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnUpdateParams(value: js.Array[_]): Self = StObject.set(x, "onUpdateParams", value.asInstanceOf[js.Any])
      
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
      def setOnYoyo(value: (/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "onYoyo", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnYoyoParams(value: js.Array[_]): Self = StObject.set(x, "onYoyoParams", value.asInstanceOf[js.Any])
      
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
  
  @js.native
  trait TweenConfigDefaults extends StObject {
    
    /**
      * The number of milliseconds to delay before the tween will start.
      */
    var delay: js.UndefOr[Double] = js.native
    
    /**
      * The duration of the tween in milliseconds.
      */
    var duration: js.UndefOr[Double] = js.native
    
    /**
      * The easing equation to use for the tween.
      */
    var ease: js.UndefOr[String] = js.native
    
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
      * The number of times to repeat the tween.
      */
    var repeat: js.UndefOr[Double] = js.native
    
    /**
      * The number of milliseconds to pause before a tween will repeat.
      */
    var repeatDelay: js.UndefOr[Double] = js.native
    
    /**
      * The object, or an array of objects, to run the tween on.
      */
    var targets: js.Object | js.Array[js.Object] = js.native
    
    /**
      * Should the tween complete, then reverse the values incrementally to get back to the starting tween values? The reverse tweening will also take `duration` milliseconds to complete.
      */
    var yoyo: js.UndefOr[Boolean] = js.native
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
      def setEaseParams(value: js.Array[_]): Self = StObject.set(x, "easeParams", value.asInstanceOf[js.Any])
      
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
  
  @js.native
  trait TweenDataConfig extends StObject {
    
    /**
      * The current propety value.
      */
    var current: js.UndefOr[Double] = js.native
    
    /**
      * Time in ms/frames before tween will start.
      */
    var delay: js.UndefOr[Double] = js.native
    
    /**
      * Duration of the tween in ms/frames, excludes time for yoyo or repeats.
      */
    var duration: js.UndefOr[Double] = js.native
    
    /**
      * The ease function this tween uses.
      */
    var ease: js.Function = js.native
    
    /**
      * Delta counter
      */
    var elapsed: js.UndefOr[Double] = js.native
    
    /**
      * The property value at the end of the ease.
      */
    var end: js.UndefOr[Double] = js.native
    
    /**
      * Automatically call toggleFlipX when the TweenData yoyos or repeats
      */
    var flipX: js.UndefOr[Boolean] = js.native
    
    /**
      * Automatically call toggleFlipY when the TweenData yoyos or repeats
      */
    var flipY: js.UndefOr[Boolean] = js.native
    
    /**
      * LoadValue generation functions.
      */
    var gen: js.UndefOr[TweenDataGenConfig] = js.native
    
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
    ): Unit = js.native
    /**
      * If not null, is invoked _immediately_ as soon as the TweenData is running, and is set on the target property.
      */
    @JSName("getActiveValue")
    var getActiveValue_Original: GetActiveCallback = js.native
    
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
    ): Unit = js.native
    /**
      * The returned value sets what the property will be at the END of the Tween.
      */
    @JSName("getEndValue")
    var getEndValue_Original: GetEndCallback = js.native
    
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
    ): Unit = js.native
    /**
      * The returned value sets what the property will be at the START of the Tween.
      */
    @JSName("getStartValue")
    var getStartValue_Original: GetStartCallback = js.native
    
    /**
      * Time in ms/frames the tween will pause before running the yoyo or starting a repeat.
      */
    var hold: js.UndefOr[Double] = js.native
    
    /**
      * The target index within the Tween targets array.
      */
    var index: integer = js.native
    
    /**
      * The property of the target being tweened.
      */
    var key: String = js.native
    
    /**
      * The previous property value.
      */
    var previous: js.UndefOr[Double] = js.native
    
    /**
      * Between 0 and 1 showing completion of this TweenData.
      */
    var progress: js.UndefOr[Double] = js.native
    
    /**
      * Number of times to repeat the tween. The tween will always run once regardless, so a repeat value of '1' will play the tween twice.
      */
    var repeat: js.UndefOr[integer] = js.native
    
    /**
      * How many repeats are left to run?
      */
    var repeatCounter: js.UndefOr[integer] = js.native
    
    /**
      * Time in ms/frames before the repeat will start.
      */
    var repeatDelay: js.UndefOr[Double] = js.native
    
    /**
      * The property value at the start of the ease.
      */
    var start: js.UndefOr[Double] = js.native
    
    /**
      * TWEEN_CONST.CREATED
      */
    var state: js.UndefOr[integer] = js.native
    
    /**
      * Time duration 1.
      */
    var t1: js.UndefOr[Double] = js.native
    
    /**
      * Time duration 2.
      */
    var t2: js.UndefOr[Double] = js.native
    
    /**
      * The target to tween.
      */
    var target: js.Any = js.native
    
    /**
      * The total calculated duration of this TweenData (based on duration, repeat, delay and yoyo)
      */
    var totalDuration: js.UndefOr[Double] = js.native
    
    /**
      * Cause the tween to return back to its start value after hold has expired.
      */
    var yoyo: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  trait TweenDataGenConfig extends StObject {
    
    /**
      * Time in ms/frames before tween will start.
      */
    var delay: js.Function = js.native
    
    /**
      * Duration of the tween in ms/frames, excludes time for yoyo or repeats.
      */
    var duration: js.Function = js.native
    
    /**
      * Time in ms/frames the tween will pause before running the yoyo or starting a repeat.
      */
    var hold: js.Function = js.native
    
    /**
      * Number of times to repeat the tween. The tween will always run once regardless, so a repeat value of '1' will play the tween twice.
      */
    var repeat: js.Function = js.native
    
    /**
      * Time in ms/frames before the repeat will start.
      */
    var repeatDelay: js.Function = js.native
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
  
  type TweenOnActiveCallback = js.Function3[/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any, Unit]
  
  type TweenOnCompleteCallback = js.Function3[/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any, Unit]
  
  type TweenOnLoopCallback = js.Function3[/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any, Unit]
  
  type TweenOnRepeatCallback = js.Function3[/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any, Unit]
  
  type TweenOnStartCallback = js.Function3[/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any, Unit]
  
  type TweenOnStopCallback = js.Function3[/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any, Unit]
  
  type TweenOnUpdateCallback = js.Function3[/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any, Unit]
  
  type TweenOnYoyoCallback = js.Function3[/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any, Unit]
  
  @js.native
  trait TweenPropConfig extends StObject {
    
    /**
      * Time in ms/frames before tween will start.
      */
    var delay: js.UndefOr[Double] = js.native
    
    /**
      * Duration of the tween in ms/frames.
      */
    var duration: js.UndefOr[Double] = js.native
    
    /**
      * The ease function this tween uses.
      */
    var ease: js.UndefOr[String | js.Function] = js.native
    
    /**
      * Should toggleFlipX be called when yoyo or repeat happens?
      */
    var flipX: js.UndefOr[Boolean] = js.native
    
    /**
      * Should toggleFlipY be called when yoyo or repeat happens?
      */
    var flipY: js.UndefOr[Boolean] = js.native
    
    /**
      * What the property will be set to immediately when this tween becomes active.
      */
    var getActive: js.UndefOr[GetActiveCallback] = js.native
    
    /**
      * What the property will be at the END of the Tween.
      */
    var getEnd: js.UndefOr[GetEndCallback] = js.native
    
    /**
      * What the property will be at the START of the Tween.
      */
    var getStart: js.UndefOr[GetStartCallback] = js.native
    
    /**
      * Time in ms/frames the tween will pause before repeating or returning to its starting value if yoyo is set to true.
      */
    var hold: js.UndefOr[Double] = js.native
    
    /**
      * Number of times to repeat the tween. The tween will always run once regardless, so a repeat value of '1' will play the tween twice.
      */
    var repeat: js.UndefOr[Double] = js.native
    
    /**
      * Time in ms/frames before the repeat will start.
      */
    var repeatDelay: js.UndefOr[Double] = js.native
    
    /**
      * What the property will be at the END of the Tween.
      */
    var value: js.UndefOr[Double | String | GetEndCallback | TweenPropConfig] = js.native
    
    /**
      * Determines whether the tween should return back to its start value after hold has expired.
      */
    var yoyo: js.UndefOr[Boolean] = js.native
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
