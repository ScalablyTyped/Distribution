package typings.phaser.Phaser.Types

import typings.phaser.Phaser.Tweens.Tween
import typings.phaser.Phaser.Tweens.TweenChain
import typings.phaser.Phaser.Types.Tweens.TweenBuilderConfig
import typings.phaser.Phaser.Types.Tweens.TweenChainBuilderConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Time {
  
  trait TimelineEvent extends StObject {
    
    /**
      * Has this event completed yet?
      */
    var complete: Boolean
    
    /**
      * Optional event name to emit when the Event fires.
      */
    var event: js.UndefOr[String] = js.undefined
    
    /**
      * Is this a once only event?
      */
    var once: Boolean
    
    /**
      * User-land callback which will be called when the Event fires if set.
      */
    var run: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Object containing properties to set on the `target` when the Event fires if set.
      */
    var set: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Sound configuration object which will be used to create a Sound when the Event fires if set.
      */
    var sound: js.UndefOr[String | js.Object] = js.undefined
    
    /**
      * The scope (`this` object) with which to invoke the run `callback`.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /**
      * The time (in elapsed ms) at which this event will fire.
      */
    var time: Double
    
    /**
      * Tween configuration object which will be used to create a Tween when the Event fires if set.
      */
    var tween: js.UndefOr[TweenBuilderConfig | TweenChainBuilderConfig | Tween | TweenChain] = js.undefined
  }
  object TimelineEvent {
    
    inline def apply(complete: Boolean, once: Boolean, time: Double): TimelineEvent = {
      val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], once = once.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimelineEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimelineEvent] (val x: Self) extends AnyVal {
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setRun(value: js.Function): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
      
      inline def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
      
      inline def setSet(value: js.Object): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
      
      inline def setSound(value: String | js.Object): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      inline def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTween(value: TweenBuilderConfig | TweenChainBuilderConfig | Tween | TweenChain): Self = StObject.set(x, "tween", value.asInstanceOf[js.Any])
      
      inline def setTweenUndefined: Self = StObject.set(x, "tween", js.undefined)
    }
  }
  
  trait TimelineEventConfig extends StObject {
    
    /**
      * The time (in ms) at which the Event will fire. The Timeline starts at 0.
      */
    var at: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional string-based event name to emit when the Event fires. The event is emitted from the Timeline instance.
      */
    var event: js.UndefOr[String] = js.undefined
    
    /**
      * Fire this event 'from' milliseconds after the previous event in the Timeline. If set it overrides the `at` and `in` properties.
      */
    var from: js.UndefOr[Double] = js.undefined
    
    /**
      * If the Timeline is already running, this is the time (in ms) at which the Event will fire based on its current elapsed value. If set, overrides the `at` property.
      */
    var in: js.UndefOr[Double] = js.undefined
    
    /**
      * If set, the Event will be removed from the Timeline when it fires.
      */
    var once: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function which will be called when the Event fires.
      */
    var run: js.UndefOr[js.Function] = js.undefined
    
    /**
      * A key-value object of properties to set on the `target` when the Event fires. Ignored if no `target` is given.
      */
    var set: js.UndefOr[js.Object] = js.undefined
    
    /**
      * A key from the Sound Manager to play, or a config object for a sound to play when the Event fires. If a config object it must provide two properties: `key` and `config`. The `key` is the key of the sound to play, and the `config` is the config is a Phaser.Types.Sound.SoundConfig object.
      */
    var sound: js.UndefOr[String | js.Object] = js.undefined
    
    /**
      * If set, the Timeline will stop and enter a complete state when this Event fires, even if there are other events after it.
      */
    var stop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The scope (`this` object) with which to invoke the run `callback`, if set.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /**
      * A Tween or TweenChain configuration object or instance. If set, the Event will create this Tween when it fires.
      */
    var tween: js.UndefOr[TweenBuilderConfig | TweenChainBuilderConfig | Tween | TweenChain] = js.undefined
  }
  object TimelineEventConfig {
    
    inline def apply(): TimelineEventConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineEventConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimelineEventConfig] (val x: Self) extends AnyVal {
      
      inline def setAt(value: Double): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setIn(value: Double): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      inline def setRun(value: js.Function): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
      
      inline def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
      
      inline def setSet(value: js.Object): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
      
      inline def setSound(value: String | js.Object): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      inline def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
      
      inline def setStop(value: Boolean): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
      
      inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTween(value: TweenBuilderConfig | TweenChainBuilderConfig | Tween | TweenChain): Self = StObject.set(x, "tween", value.asInstanceOf[js.Any])
      
      inline def setTweenUndefined: Self = StObject.set(x, "tween", js.undefined)
    }
  }
  
  trait TimerEventConfig extends StObject {
    
    /**
      * Additional arguments to be passed to the `callback`.
      */
    var args: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * The callback which will be called when the Timer Event fires.
      */
    var callback: js.UndefOr[js.Function] = js.undefined
    
    /**
      * The scope (`this` object) with which to invoke the `callback`. The default is the Timer Event.
      */
    var callbackScope: js.UndefOr[Any] = js.undefined
    
    /**
      * The delay after which the Timer Event should fire, in milliseconds.
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * `true` if the Timer Event should repeat indefinitely.
      */
    var loop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * `true` if the Timer Event should be paused.
      */
    var paused: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The total number of times the Timer Event will repeat before finishing.
      */
    var repeat: js.UndefOr[Double] = js.undefined
    
    /**
      * The initial elapsed time in milliseconds. Useful if you want a long duration with repeat, but for the first loop to fire quickly.
      */
    var startAt: js.UndefOr[Double] = js.undefined
    
    /**
      * The scale of the elapsed time.
      */
    var timeScale: js.UndefOr[Double] = js.undefined
  }
  object TimerEventConfig {
    
    inline def apply(): TimerEventConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimerEventConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimerEventConfig] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackScope(value: Any): Self = StObject.set(x, "callbackScope", value.asInstanceOf[js.Any])
      
      inline def setCallbackScopeUndefined: Self = StObject.set(x, "callbackScope", js.undefined)
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      inline def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
      
      inline def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      inline def setStartAt(value: Double): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
      
      inline def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
      
      inline def setTimeScale(value: Double): Self = StObject.set(x, "timeScale", value.asInstanceOf[js.Any])
      
      inline def setTimeScaleUndefined: Self = StObject.set(x, "timeScale", js.undefined)
    }
  }
}
