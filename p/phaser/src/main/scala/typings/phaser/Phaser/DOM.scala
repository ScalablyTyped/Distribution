package typings.phaser.Phaser

import typings.std.FrameRequestCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Phaser.DOM")
@js.native
object DOM extends js.Object {
  
  /**
    * Abstracts away the use of RAF or setTimeOut for the core game update loop.
    * This is invoked automatically by the Phaser.Game instance.
    */
  @js.native
  trait RequestAnimationFrame extends js.Object {
    
    /**
      * The callback to be invoked each step.
      */
    def callback(time: Double): Unit = js.native
    /**
      * The callback to be invoked each step.
      */
    @JSName("callback")
    var callback_Original: FrameRequestCallback = js.native
    
    /**
      * Stops the step from running and clears the callback reference.
      */
    def destroy(): Unit = js.native
    
    /**
      * True if RequestAnimationFrame is running, otherwise false.
      */
    var isRunning: Boolean = js.native
    
    /**
      * True if the step is using setTimeout instead of RAF.
      */
    var isSetTimeOut: Boolean = js.native
    
    /**
      * The previous time the step was called.
      */
    var lastTime: Double = js.native
    
    /**
      * Starts the requestAnimationFrame or setTimeout process running.
      * @param callback The callback to invoke each step.
      * @param forceSetTimeOut Should it use SetTimeout, even if RAF is available?
      * @param targetFPS The target fps rate (in ms). Only used when setTimeout is used.
      */
    def start(callback: FrameRequestCallback, forceSetTimeOut: Boolean, targetFPS: Double): Unit = js.native
    
    /**
      * The RAF step function.
      * Updates the local tick value, invokes the callback and schedules another call to requestAnimationFrame.
      */
    def step(time: Double): Unit = js.native
    
    /**
      * The SetTimeout step function.
      * Updates the local tick value, invokes the callback and schedules another call to setTimeout.
      */
    var stepTimeout: js.Function = js.native
    
    /**
      * The RAF step function.
      * Updates the local tick value, invokes the callback and schedules another call to requestAnimationFrame.
      */
    @JSName("step")
    var step_Original: FrameRequestCallback = js.native
    
    /**
      * Stops the requestAnimationFrame or setTimeout from running.
      */
    def stop(): Unit = js.native
    
    /**
      * The target FPS rate in ms.
      * Only used when setTimeout is used instead of RAF.
      */
    var target: Double = js.native
    
    /**
      * The most recent timestamp. Either a DOMHighResTimeStamp under RAF or `Date.now` under SetTimeout.
      */
    var tick: Double = js.native
    
    /**
      * The setTimeout or RAF callback ID used when canceling them.
      */
    var timeOutID: Double = js.native
  }
}
