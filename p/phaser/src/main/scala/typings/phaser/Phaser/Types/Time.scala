package typings.phaser.Phaser.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Time {
  
  @js.native
  trait TimerEventConfig extends StObject {
    
    /**
      * Additional arguments to be passed to the `callback`.
      */
    var args: js.UndefOr[js.Array[_]] = js.native
    
    /**
      * The callback which will be called when the Timer Event fires.
      */
    var callback: js.UndefOr[js.Function] = js.native
    
    /**
      * The scope (`this` object) with which to invoke the `callback`.
      */
    var callbackScope: js.UndefOr[js.Any] = js.native
    
    /**
      * The delay after which the Timer Event should fire, in milliseconds.
      */
    var delay: js.UndefOr[Double] = js.native
    
    /**
      * `true` if the Timer Event should repeat indefinitely.
      */
    var loop: js.UndefOr[Boolean] = js.native
    
    /**
      * `true` if the Timer Event should be paused.
      */
    var paused: js.UndefOr[Boolean] = js.native
    
    /**
      * The total number of times the Timer Event will repeat before finishing.
      */
    var repeat: js.UndefOr[Double] = js.native
    
    /**
      * The initial elapsed time in milliseconds. Useful if you want a long duration with repeat, but for the first loop to fire quickly.
      */
    var startAt: js.UndefOr[Double] = js.native
    
    /**
      * The scale of the elapsed time.
      */
    var timeScale: js.UndefOr[Double] = js.native
  }
  object TimerEventConfig {
    
    @scala.inline
    def apply(): TimerEventConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimerEventConfig]
    }
    
    @scala.inline
    implicit class TimerEventConfigMutableBuilder[Self <: TimerEventConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackScope(value: js.Any): Self = StObject.set(x, "callbackScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackScopeUndefined: Self = StObject.set(x, "callbackScope", js.undefined)
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
      
      @scala.inline
      def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      @scala.inline
      def setStartAt(value: Double): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
      
      @scala.inline
      def setTimeScale(value: Double): Self = StObject.set(x, "timeScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeScaleUndefined: Self = StObject.set(x, "timeScale", js.undefined)
    }
  }
}
