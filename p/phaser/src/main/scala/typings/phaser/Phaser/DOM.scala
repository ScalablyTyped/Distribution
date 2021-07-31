package typings.phaser.Phaser

import typings.std.FrameRequestCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DOM {
  
  /**
    * Abstracts away the use of RAF or setTimeOut for the core game update loop.
    * This is invoked automatically by the Phaser.Game instance.
    */
  trait RequestAnimationFrame extends StObject {
    
    /**
      * The callback to be invoked each step.
      */
    def callback(time: Double): Unit
    /**
      * The callback to be invoked each step.
      */
    @JSName("callback")
    var callback_Original: FrameRequestCallback
    
    /**
      * Stops the step from running and clears the callback reference.
      */
    def destroy(): Unit
    
    /**
      * True if RequestAnimationFrame is running, otherwise false.
      */
    var isRunning: Boolean
    
    /**
      * True if the step is using setTimeout instead of RAF.
      */
    var isSetTimeOut: Boolean
    
    /**
      * The previous time the step was called.
      */
    var lastTime: Double
    
    /**
      * Starts the requestAnimationFrame or setTimeout process running.
      * @param callback The callback to invoke each step.
      * @param forceSetTimeOut Should it use SetTimeout, even if RAF is available?
      * @param targetFPS The target fps rate (in ms). Only used when setTimeout is used.
      */
    def start(callback: FrameRequestCallback, forceSetTimeOut: Boolean, targetFPS: Double): Unit
    
    /**
      * The RAF step function.
      * Updates the local tick value, invokes the callback and schedules another call to requestAnimationFrame.
      */
    def step(time: Double): Unit
    
    /**
      * The SetTimeout step function.
      * Updates the local tick value, invokes the callback and schedules another call to setTimeout.
      */
    var stepTimeout: js.Function
    
    /**
      * The RAF step function.
      * Updates the local tick value, invokes the callback and schedules another call to requestAnimationFrame.
      */
    @JSName("step")
    var step_Original: FrameRequestCallback
    
    /**
      * Stops the requestAnimationFrame or setTimeout from running.
      */
    def stop(): Unit
    
    /**
      * The target FPS rate in ms.
      * Only used when setTimeout is used instead of RAF.
      */
    var target: Double
    
    /**
      * The most recent timestamp. Either a DOMHighResTimeStamp under RAF or `Date.now` under SetTimeout.
      */
    var tick: Double
    
    /**
      * The setTimeout or RAF callback ID used when canceling them.
      */
    var timeOutID: Double
  }
  object RequestAnimationFrame {
    
    @scala.inline
    def apply(
      callback: /* time */ Double => Unit,
      destroy: () => Unit,
      isRunning: Boolean,
      isSetTimeOut: Boolean,
      lastTime: Double,
      start: (FrameRequestCallback, Boolean, Double) => Unit,
      step: /* time */ Double => Unit,
      stepTimeout: js.Function,
      stop: () => Unit,
      target: Double,
      tick: Double,
      timeOutID: Double
    ): RequestAnimationFrame = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), destroy = js.Any.fromFunction0(destroy), isRunning = isRunning.asInstanceOf[js.Any], isSetTimeOut = isSetTimeOut.asInstanceOf[js.Any], lastTime = lastTime.asInstanceOf[js.Any], start = js.Any.fromFunction3(start), step = js.Any.fromFunction1(step), stepTimeout = stepTimeout.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop), target = target.asInstanceOf[js.Any], tick = tick.asInstanceOf[js.Any], timeOutID = timeOutID.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestAnimationFrame]
    }
    
    @scala.inline
    implicit class RequestAnimationFrameMutableBuilder[Self <: RequestAnimationFrame] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: /* time */ Double => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsRunning(value: Boolean): Self = StObject.set(x, "isRunning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSetTimeOut(value: Boolean): Self = StObject.set(x, "isSetTimeOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastTime(value: Double): Self = StObject.set(x, "lastTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: (FrameRequestCallback, Boolean, Double) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStep(value: /* time */ Double => Unit): Self = StObject.set(x, "step", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStepTimeout(value: js.Function): Self = StObject.set(x, "stepTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTick(value: Double): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeOutID(value: Double): Self = StObject.set(x, "timeOutID", value.asInstanceOf[js.Any])
    }
  }
}
