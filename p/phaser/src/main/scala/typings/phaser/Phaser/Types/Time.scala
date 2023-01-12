package typings.phaser.Phaser.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Time {
  
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
      * The scope (`this` object) with which to invoke the `callback`.
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
