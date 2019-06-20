package typings
package phaserLib.PhaserNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [description]
  */
@JSGlobal("Phaser.Core.TimeStep")
@js.native
class TimeStep protected () extends js.Object {
  /**
    * 
    * @param game A reference to the Phaser.Game instance that owns this Time Step.
    */
  def this(game: phaserLib.PhaserNs.Game, config: phaserLib.PhaserNs.TypesNs.CoreNs.FPSConfig) = this()
  /**
    * An exponential moving average of the frames per second.
    */
  val actualFps: phaserLib.integer = js.native
  /**
    * A callback to be invoked each time the Time Step steps.
    */
  @JSName("callback")
  var callback_Original: phaserLib.PhaserNs.TypesNs.CoreNs.TimeStepCallback = js.native
  /**
    * The delta time, in ms, since the last game step. This is a clamped and smoothed average value.
    */
  var delta: phaserLib.integer = js.native
  /**
    * Internal array holding the previous delta values, used for delta smoothing.
    */
  var deltaHistory: js.Array[phaserLib.integer] = js.native
  /**
    * Internal index of the delta history position.
    */
  var deltaIndex: phaserLib.integer = js.native
  /**
    * The maximum number of delta values that are retained in order to calculate a smoothed moving average.
    * 
    * This can be changed in the Game Config via the `fps.deltaHistory` property. The default is 10.
    */
  var deltaSmoothingMax: phaserLib.integer = js.native
  /**
    * You can force the Time Step to use Set Timeout instead of Request Animation Frame by setting
    * the `forceSetTimeOut` property to `true` in the Game Configuration object. It cannot be changed at run-time.
    */
  val forceSetTimeOut: scala.Boolean = js.native
  /**
    * The current frame the game is on. This counter is incremented once every game step, regardless of how much
    * time has passed and is unaffected by delta smoothing.
    */
  val frame: phaserLib.integer = js.native
  /**
    * The number of frames processed this second.
    */
  val framesThisSecond: phaserLib.integer = js.native
  /**
    * A reference to the Phaser.Game instance.
    */
  val game: phaserLib.PhaserNs.Game = js.native
  /**
    * Is the browser currently considered in focus by the Page Visibility API?
    * This value is set in the `blur` method, which is called automatically by the Game instance.
    */
  val inFocus: scala.Boolean = js.native
  /**
    * The time, as returned by `performance.now` of the previous step.
    */
  var lastTime: scala.Double = js.native
  /**
    * The minimum fps rate you want the Time Step to run at.
    */
  var minFps: phaserLib.integer = js.native
  /**
    * [description]
    */
  val nextFpsUpdate: phaserLib.integer = js.native
  /**
    * The time, as returned by `performance.now` at the very start of the current step.
    * This can differ from the `time` value in that it isn't calculated based on the delta value.
    */
  var now: scala.Double = js.native
  /**
    * The number of frames that the cooldown is set to after the browser panics over the FPS rate, usually
    * as a result of switching tabs and regaining focus.
    * 
    * This can be changed in the Game Config via the `fps.panicMax` property. The default is 120.
    */
  var panicMax: phaserLib.integer = js.native
  /**
    * [description]
    */
  val raf: phaserLib.PhaserNs.DOMNs.RequestAnimationFrame = js.native
  /**
    * The actual elapsed time in ms between one update and the next.
    * 
    * Unlike with `delta`, no smoothing, capping, or averaging is applied to this value.
    * So please be careful when using this value in math calculations.
    */
  var rawDelta: scala.Double = js.native
  /**
    * A flag that is set once the TimeStep has started running and toggled when it stops.
    * The difference between this value and `started` is that `running` is toggled when
    * the TimeStep is sent to sleep, where-as `started` remains `true`, only changing if
    * the TimeStep is actually stopped, not just paused.
    */
  val running: scala.Boolean = js.native
  /**
    * The time at which the game started running. This value is adjusted if the game is then
    * paused and resumes.
    */
  var startTime: scala.Double = js.native
  /**
    * A flag that is set once the TimeStep has started running and toggled when it stops.
    */
  val started: scala.Boolean = js.native
  /**
    * The target fps rate for the Time Step to run at.
    * 
    * Setting this value will not actually change the speed at which the browser runs, that is beyond
    * the control of Phaser. Instead, it allows you to determine performance issues and if the Time Step
    * is spiraling out of control.
    */
  var targetFps: phaserLib.integer = js.native
  /**
    * The time, calculated at the start of the current step, as smoothed by the delta value.
    */
  var time: scala.Double = js.native
  /**
    * Called by the Game instance when the DOM window.onBlur event triggers.
    */
  def blur(): scala.Unit = js.native
  /**
    * A callback to be invoked each time the Time Step steps.
    */
  def callback(time: scala.Double, average: scala.Double, interpolation: scala.Double): scala.Unit = js.native
  /**
    * Destroys the TimeStep. This will stop Request Animation Frame, stop the step, clear the callbacks and null
    * any objects.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Called by the Game instance when the DOM window.onFocus event triggers.
    */
  def focus(): scala.Unit = js.native
  /**
    * Gets the duration which the game has been running, in seconds.
    */
  def getDuration(): scala.Double = js.native
  /**
    * Gets the duration which the game has been running, in ms.
    */
  def getDurationMS(): scala.Double = js.native
  /**
    * Called when the visibility API says the game is 'hidden' (tab switch out of view, etc)
    */
  def pause(): scala.Unit = js.native
  /**
    * Resets the time, lastTime, fps averages and delta history.
    * Called automatically when a browser sleeps them resumes.
    */
  def resetDelta(): scala.Unit = js.native
  /**
    * Called when the visibility API says the game is 'visible' again (tab switch back into view, etc)
    */
  def resume(): scala.Unit = js.native
  /**
    * Sends the TimeStep to sleep, stopping Request Animation Frame (or SetTimeout) and toggling the `running` flag to false.
    */
  def sleep(): scala.Unit = js.native
  /**
    * Starts the Time Step running, if it is not already doing so.
    * Called automatically by the Game Boot process.
    * @param callback The callback to be invoked each time the Time Step steps.
    */
  def start(callback: phaserLib.PhaserNs.TypesNs.CoreNs.TimeStepCallback): scala.Unit = js.native
  /**
    * The main step method. This is called each time the browser updates, either by Request Animation Frame,
    * or by Set Timeout. It is responsible for calculating the delta values, frame totals, cool down history and more.
    * You generally should never call this method directly.
    */
  def step(): scala.Unit = js.native
  /**
    * Stops the TimeStep running.
    */
  def stop(): TimeStep = js.native
  /**
    * Manually calls `TimeStep.step`.
    */
  def tick(): scala.Unit = js.native
  /**
    * Wakes-up the TimeStep, restarting Request Animation Frame (or SetTimeout) and toggling the `running` flag to true.
    * The `seamless` argument controls if the wake-up should adjust the start time or not.
    * @param seamless Adjust the startTime based on the lastTime values. Default false.
    */
  def wake(): scala.Unit = js.native
  def wake(seamless: scala.Boolean): scala.Unit = js.native
}

