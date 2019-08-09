package typings.phaser.PhaserNs.TimeNs

import typings.phaser.PhaserNs.TypesNs.TimeNs.TimerEventConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Timer Event represents a delayed function call. It's managed by a Scene's {@link Clock} and will call its function after a set amount of time has passed. The Timer Event can optionally repeat - i.e. call its function multiple times before finishing, or loop indefinitely.
  * 
  * Because it's managed by a Clock, a Timer Event is based on game time, will be affected by its Clock's time scale, and will pause if its Clock pauses.
  */
@JSGlobal("Phaser.Time.TimerEvent")
@js.native
class TimerEvent protected () extends js.Object {
  /**
    * 
    * @param config The configuration for the Timer Event, including its delay and callback.
    */
  def this(config: TimerEventConfig) = this()
  /**
    * Additional arguments to be passed to the callback.
    */
  var args: js.Array[_] = js.native
  /**
    * The callback that will be called when the TimerEvent occurs.
    */
  var callback: js.Function = js.native
  /**
    * The scope in which the callback will be called.
    */
  var callbackScope: js.Object = js.native
  /**
    * The delay in ms at which this TimerEvent fires.
    */
  val delay: Double = js.native
  /**
    * The time in milliseconds which has elapsed since the Timer Event's creation.
    * 
    * This value is local for the Timer Event and is relative to its Clock. As such, it's influenced by the Clock's time scale and paused state, the Timer Event's initial {@link #startAt} property, and the Timer Event's {@link #timeScale} and {@link #paused} state.
    */
  var elapsed: Double = js.native
  /**
    * Whether the Timer Event's function has been called.
    * 
    * When the Timer Event fires, this property will be set to `true` before the callback function is invoked and will be reset immediately afterward if the Timer Event should repeat. The value of this property does not directly influence whether the Timer Event will be removed from its Clock, but can prevent it from firing.
    */
  var hasDispatched: Boolean = js.native
  /**
    * True if this TimerEvent loops, otherwise false.
    */
  val loop: Boolean = js.native
  /**
    * Whether or not this timer is paused.
    */
  var paused: Boolean = js.native
  /**
    * The total number of times this TimerEvent will repeat before finishing.
    */
  val repeat: Double = js.native
  /**
    * If repeating this contains the current repeat count.
    */
  var repeatCount: Double = js.native
  /**
    * Start this many MS into the elapsed (useful if you want a long duration with repeat, but for the first loop to fire quickly)
    */
  var startAt: Double = js.native
  /**
    * Scale the time causing this TimerEvent to update.
    */
  var timeScale: Double = js.native
  /**
    * Destroys all object references in the Timer Event, i.e. its callback, scope, and arguments.
    * 
    * Normally, this method is only called by the Clock when it shuts down. As such, it doesn't stop the Timer Event. If called manually, the Timer Event will still be updated by the Clock, but it won't do anything when it fires.
    */
  def destroy(): Unit = js.native
  /**
    * Returns the local elapsed time for the current iteration of the Timer Event.
    */
  def getElapsed(): Double = js.native
  /**
    * Returns the local elapsed time for the current iteration of the Timer Event in seconds.
    */
  def getElapsedSeconds(): Double = js.native
  /**
    * Gets the progress of the timer overall, factoring in repeats.
    */
  def getOverallProgress(): Double = js.native
  /**
    * Gets the progress of the current iteration, not factoring in repeats.
    */
  def getProgress(): Double = js.native
  /**
    * Returns the number of times this Timer Event will repeat before finishing.
    * 
    * This should not be confused with the number of times the Timer Event will fire before finishing. A return value of 0 doesn't indicate that the Timer Event has finished running - it indicates that it will not repeat after the next time it fires.
    */
  def getRepeatCount(): Double = js.native
  /**
    * Forces the Timer Event to immediately expire, thus scheduling its removal in the next frame.
    * @param dispatchCallback If `true`, the function of the Timer Event will be called before its removal. Default false.
    */
  def remove(): Unit = js.native
  def remove(dispatchCallback: Boolean): Unit = js.native
  /**
    * Completely reinitializes the Timer Event, regardless of its current state, according to a configuration object.
    * @param config The new state for the Timer Event.
    */
  def reset(config: TimerEventConfig): TimerEvent = js.native
}

