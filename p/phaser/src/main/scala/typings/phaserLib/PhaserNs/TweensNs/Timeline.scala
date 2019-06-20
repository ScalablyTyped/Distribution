package typings
package phaserLib.PhaserNs.TweensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Timeline combines multiple Tweens into one. Its overall behavior is otherwise similar to a single Tween.
  * 
  * The Timeline updates all of its Tweens simultaneously. Its methods allow you to easily build a sequence
  * of Tweens (each one starting after the previous one) or run multiple Tweens at once during given parts of the Timeline.
  */
@JSGlobal("Phaser.Tweens.Timeline")
@js.native
class Timeline protected ()
  extends phaserLib.PhaserNs.EventsNs.EventEmitter {
  /**
    * 
    * @param manager The Tween Manager which owns this Timeline.
    */
  def this(manager: TweenManager) = this()
  /**
    * Time in ms/frames before the 'onComplete' event fires. This never fires if loop = true (as it never completes)
    */
  var completeDelay: scala.Double = js.native
  /**
    * Countdown timer value, as used by `loopDelay` and `completeDelay`.
    */
  var countdown: scala.Double = js.native
  /**
    * An array of Tween objects, each containing a unique property and target being tweened.
    */
  var data: js.Array[_] = js.native
  /**
    * Time in ms/frames for the whole Timeline to play through once, excluding loop amounts and loop delays.
    */
  var duration: scala.Double = js.native
  /**
    * Elapsed time in ms/frames of this run through of the Timeline.
    */
  var elapsed: scala.Double = js.native
  /**
    * A constant value which allows this Timeline to be easily identified as one.
    */
  var isTimeline: scala.Boolean = js.native
  /**
    * Loop this Timeline? Can be -1 for an infinite loop, or an integer.
    * When enabled it will play through ALL Tweens again (use Tween.repeat to loop a single tween)
    */
  var loop: scala.Double = js.native
  /**
    * How many loops are left to run?
    */
  var loopCounter: scala.Double = js.native
  /**
    * Time in ms/frames before this Timeline loops.
    */
  var loopDelay: scala.Double = js.native
  /**
    * The Tween Manager which owns this Timeline.
    */
  var manager: TweenManager = js.native
  /**
    * Does the Timeline start off paused? (if so it needs to be started with Timeline.play)
    */
  var paused: scala.Boolean = js.native
  /**
    * Value between 0 and 1. The amount of progress through the Timeline, _excluding loops_.
    */
  var progress: scala.Double = js.native
  /**
    * The current state of the Timeline.
    */
  var state: phaserLib.integer = js.native
  /**
    * Scales the time applied to this Timeline. A value of 1 runs in real-time. A value of 0.5 runs 50% slower, and so on.
    * Value isn't used when calculating total duration of the Timeline, it's a run-time delta adjustment only.
    */
  var timeScale: scala.Double = js.native
  /**
    * The cached size of the data array.
    */
  var totalData: scala.Double = js.native
  /**
    * Time in ms/frames for all Tweens in this Timeline to complete (including looping)
    */
  var totalDuration: scala.Double = js.native
  /**
    * Total elapsed time in ms/frames of the entire Timeline, including looping.
    */
  var totalElapsed: scala.Double = js.native
  /**
    * Value between 0 and 1. The amount through the entire Timeline, including looping.
    */
  var totalProgress: scala.Double = js.native
  /**
    * If true then duration, delay, etc values are all frame totals, rather than ms.
    */
  var useFrames: scala.Boolean = js.native
  def add(config: js.Object): this.type = js.native
  /**
    * Creates a new Tween, based on the given Tween Config, and adds it to this Timeline.
    * @param config The configuration object for the Tween.
    */
  def add(config: phaserLib.PhaserNs.TypesNs.TweensNs.TweenBuilderConfig): this.type = js.native
  /**
    * Calculates the total duration of the timeline.
    * 
    * Computes all tween durations and returns the full duration of the timeline.
    * 
    * The resulting number is stored in the timeline, not as a return value.
    */
  def calcDuration(): scala.Unit = js.native
  /**
    * Parses the relative offset value, returning a positive or negative number.
    * @param value The relative offset, in the format of '-=500', for example. The first character determines whether it will be a positive or negative number. Spacing matters here.
    * @param base The value to use as the offset.
    */
  def getRelativeOffset(value: java.lang.String, base: scala.Double): scala.Double = js.native
  /**
    * Gets the value of the time scale applied to this Timeline. A value of 1 runs in real-time.
    * A value of 0.5 runs 50% slower, and so on.
    */
  def getTimeScale(): scala.Double = js.native
  /**
    * Checks whether a Tween has an offset value.
    * @param tween The Tween to check.
    */
  def hasOffset(tween: Tween): scala.Boolean = js.native
  /**
    * Checks if any of the Tweens in this Timeline as operating on the target object.
    * 
    * Returns `false` if no Tweens operate on the target object.
    * @param target The target to check all Tweens against.
    */
  def hasTarget(target: js.Object): scala.Boolean = js.native
  /**
    * Initializes the timeline, which means all Tweens get their init() called, and the total duration will be computed.
    * Returns a boolean indicating whether the timeline is auto-started or not.
    */
  def init(): scala.Boolean = js.native
  /**
    * Checks whether the offset value is a number or a directive that is relative to previous tweens.
    * @param value The offset value to be evaluated.
    */
  def isOffsetAbsolute(value: scala.Double): scala.Boolean = js.native
  /**
    * Checks if the offset is a relative value rather than an absolute one.
    * If the value is just a number, this returns false.
    * @param value The offset value to be evaluated.
    */
  def isOffsetRelative(value: java.lang.String): scala.Boolean = js.native
  /**
    * Check whether or not the Timeline is playing.
    */
  def isPlaying(): scala.Boolean = js.native
  /**
    * Passed a Tween to the Tween Manager and requests it be made active.
    * @param tween The tween object to make active.
    */
  def makeActive(tween: Tween): TweenManager = js.native
  /**
    * Updates the Timeline's `state` and fires callbacks and events.
    */
  def nextState(): scala.Unit = js.native
  /**
    * Pauses the Timeline, retaining its internal state.
    * 
    * Calling this on a Timeline that is already paused has no effect and fires no event.
    */
  def pause(): this.type = js.native
  /**
    * Starts playing the Timeline.
    */
  def play(): scala.Unit = js.native
  /**
    * Adds an existing Tween to this Timeline.
    * @param tween The Tween to be added to this Timeline.
    */
  def queue(tween: Tween): this.type = js.native
  /**
    * Resets all of the timeline's tweens back to their initial states.
    * The boolean parameter indicates whether tweens that are looping should reset as well, or not.
    * @param resetFromLoop If `true`, resets all looping tweens to their initial values.
    */
  def resetTweens(resetFromLoop: scala.Boolean): scala.Unit = js.native
  /**
    * Resumes a paused Timeline from where it was when it was paused.
    * 
    * Calling this on a Timeline that isn't paused has no effect and fires no event.
    */
  def resume(): this.type = js.native
  /**
    * Sets a callback for the Timeline.
    * @param type The internal type of callback to set.
    * @param callback Timeline allows multiple tweens to be linked together to create a streaming sequence.
    * @param params The parameters to pass to the callback.
    * @param scope The context scope of the callback.
    */
  def setCallback(`type`: java.lang.String, callback: js.Function): this.type = js.native
  def setCallback(`type`: java.lang.String, callback: js.Function, params: js.Array[_]): this.type = js.native
  def setCallback(`type`: java.lang.String, callback: js.Function, params: js.Array[_], scope: js.Object): this.type = js.native
  /**
    * Sets the value of the time scale applied to this Timeline. A value of 1 runs in real-time.
    * A value of 0.5 runs 50% slower, and so on.
    * 
    * The value isn't used when calculating total duration of the tween, it's a run-time delta adjustment only.
    * @param value The time scale value to set.
    */
  def setTimeScale(value: scala.Double): this.type = js.native
  /**
    * Stops the Timeline immediately, whatever stage of progress it is at and flags it for removal by the TweenManager.
    */
  def stop(): scala.Unit = js.native
  /**
    * Returns 'true' if this Timeline has finished and should be removed from the Tween Manager.
    * Otherwise, returns false.
    * @param timestamp The current time. Either a High Resolution Timer value if it comes from Request Animation Frame, or Date.now if using SetTimeout.
    * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
    */
  def update(timestamp: scala.Double, delta: scala.Double): scala.Boolean = js.native
}

