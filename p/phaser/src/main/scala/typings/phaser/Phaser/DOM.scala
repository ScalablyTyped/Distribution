package typings.phaser.Phaser

import typings.std.DOMHighResTimeStamp
import typings.std.FrameRequestCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DOM {
  
  /**
    * Abstracts away the use of RAF or setTimeOut for the core game update loop.
    * 
    * This is invoked automatically by the Phaser.Game instance.
    */
  trait RequestAnimationFrame extends StObject {
    
    /**
      * The callback to be invoked each step.
      */
    def callback(time: DOMHighResTimeStamp): Unit
    /**
      * The callback to be invoked each step.
      */
    @JSName("callback")
    var callback_Original: FrameRequestCallback
    
    /**
      * The delay rate in ms for setTimeOut.
      */
    var delay: Double
    
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
      * Starts the requestAnimationFrame or setTimeout process running.
      * @param callback The callback to invoke each step.
      * @param forceSetTimeOut Should it use SetTimeout, even if RAF is available?
      * @param delay The setTimeout delay rate in ms.
      */
    def start(callback: FrameRequestCallback, forceSetTimeOut: Boolean, delay: Double): Unit
    
    /**
      * The RAF step function.
      * 
      * Invokes the callback and schedules another call to requestAnimationFrame.
      */
    def step(time: DOMHighResTimeStamp): Unit
    
    /**
      * The SetTimeout step function.
      * 
      * Invokes the callback and schedules another call to setTimeout.
      */
    var stepTimeout: js.Function
    
    /**
      * The RAF step function.
      * 
      * Invokes the callback and schedules another call to requestAnimationFrame.
      */
    @JSName("step")
    var step_Original: FrameRequestCallback
    
    /**
      * Stops the requestAnimationFrame or setTimeout from running.
      */
    def stop(): Unit
    
    /**
      * The setTimeout or RAF callback ID used when canceling them.
      */
    var timeOutID: Double | Null
  }
  object RequestAnimationFrame {
    
    inline def apply(
      callback: /* time */ DOMHighResTimeStamp => Unit,
      delay: Double,
      destroy: () => Unit,
      isRunning: Boolean,
      isSetTimeOut: Boolean,
      start: (FrameRequestCallback, Boolean, Double) => Unit,
      step: /* time */ DOMHighResTimeStamp => Unit,
      stepTimeout: js.Function,
      stop: () => Unit
    ): RequestAnimationFrame = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), delay = delay.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), isRunning = isRunning.asInstanceOf[js.Any], isSetTimeOut = isSetTimeOut.asInstanceOf[js.Any], start = js.Any.fromFunction3(start), step = js.Any.fromFunction1(step), stepTimeout = stepTimeout.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop), timeOutID = null)
      __obj.asInstanceOf[RequestAnimationFrame]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestAnimationFrame] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: /* time */ DOMHighResTimeStamp => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setIsRunning(value: Boolean): Self = StObject.set(x, "isRunning", value.asInstanceOf[js.Any])
      
      inline def setIsSetTimeOut(value: Boolean): Self = StObject.set(x, "isSetTimeOut", value.asInstanceOf[js.Any])
      
      inline def setStart(value: (FrameRequestCallback, Boolean, Double) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction3(value))
      
      inline def setStep(value: /* time */ DOMHighResTimeStamp => Unit): Self = StObject.set(x, "step", js.Any.fromFunction1(value))
      
      inline def setStepTimeout(value: js.Function): Self = StObject.set(x, "stepTimeout", value.asInstanceOf[js.Any])
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      inline def setTimeOutID(value: Double): Self = StObject.set(x, "timeOutID", value.asInstanceOf[js.Any])
      
      inline def setTimeOutIDNull: Self = StObject.set(x, "timeOutID", null)
    }
  }
}
