package typings
package phaserLib.PhaserNs.DOMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Abstracts away the use of RAF or setTimeOut for the core game update loop.
  * This is invoked automatically by the Phaser.Game instance.
  */
@JSGlobal("Phaser.DOM.RequestAnimationFrame")
@js.native
class RequestAnimationFrame () extends js.Object {
  /**
    * The callback to be invoked each step.
    */
  @JSName("callback")
  var callback_Original: stdLib.FrameRequestCallback = js.native
  /**
    * True if RequestAnimationFrame is running, otherwise false.
    */
  var isRunning: scala.Boolean = js.native
  /**
    * True if the step is using setTimeout instead of RAF.
    */
  var isSetTimeOut: scala.Boolean = js.native
  /**
    * The previous time the step was called.
    */
  var lastTime: scala.Double = js.native
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
  var step_Original: stdLib.FrameRequestCallback = js.native
  /**
    * The most recent timestamp. Either a DOMHighResTimeStamp under RAF or `Date.now` under SetTimeout.
    */
  var tick: scala.Double = js.native
  /**
    * The setTimeout or RAF callback ID used when canceling them.
    */
  var timeOutID: scala.Double = js.native
  /**
    * The callback to be invoked each step.
    */
  def callback(time: scala.Double): scala.Unit = js.native
  /**
    * Stops the step from running and clears the callback reference.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Starts the requestAnimationFrame or setTimeout process running.
    * @param callback The callback to invoke each step.
    * @param forceSetTimeOut Should it use SetTimeout, even if RAF is available?
    */
  def start(callback: stdLib.FrameRequestCallback, forceSetTimeOut: scala.Boolean): scala.Unit = js.native
  /**
    * The RAF step function.
    * Updates the local tick value, invokes the callback and schedules another call to requestAnimationFrame.
    */
  def step(time: scala.Double): scala.Unit = js.native
  /**
    * Stops the requestAnimationFrame or setTimeout from running.
    */
  def stop(): scala.Unit = js.native
}

