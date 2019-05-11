package typings
package phaserLib.PhaserNs.TweensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Timeline combines multiple Tweens into one. Its overall behavior is otherwise similar to a single Tween.
  * 
  * The Timeline updates all of its Tweens simultaneously. Its methods allow you to easily build a sequence of Tweens (each one starting after the previous one) or run multiple Tweens at once during given parts of the Timeline.
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
    * Countdown timer (used by loopDelay and completeDelay)
    */
  var countdown: scala.Double = js.native
  /**
    * An array of Tween objects, each containing a unique property and target being tweened.
    */
  var data: js.Array[_] = js.native
  /**
    * Time in ms/frames for the whole Tween to play through once, excluding loop amounts and loop delays.
    */
  var duration: scala.Double = js.native
  /**
    * Elapsed time in ms/frames of this run through the Tween.
    */
  var elapsed: scala.Double = js.native
  /**
    * A constant value which allows this Timeline to be easily identified as one.
    */
  var isTimeline: scala.Boolean = js.native
  /**
    * Loop this tween? Can be -1 for an infinite loop, or an integer.
    * When enabled it will play through ALL TweenDatas again (use TweenData.repeat to loop a single TD)
    */
  var loop: scala.Double = js.native
  /**
    * How many loops are left to run?
    */
  var loopCounter: scala.Double = js.native
  /**
    * Time in ms/frames before the tween loops.
    */
  var loopDelay: scala.Double = js.native
  /**
    * The Tween Manager which owns this Timeline.
    */
  var manager: TweenManager = js.native
  /**
    * Does the Tween start off paused? (if so it needs to be started with Tween.play)
    */
  var paused: scala.Boolean = js.native
  /**
    * Value between 0 and 1. The amount through the Tween, excluding loops.
    */
  var progress: scala.Double = js.native
  /**
    * The current state of the tween
    */
  var state: phaserLib.integer = js.native
  /**
    * Scales the time applied to this Tween. A value of 1 runs in real-time. A value of 0.5 runs 50% slower, and so on.
    * Value isn't used when calculating total duration of the tween, it's a run-time delta adjustment only.
    */
  var timeScale: scala.Double = js.native
  /**
    * data array doesn't usually change, so we can cache the length
    */
  var totalData: scala.Double = js.native
  /**
    * Time in ms/frames for all Tweens to complete (including looping)
    */
  var totalDuration: scala.Double = js.native
  /**
    * Total elapsed time in ms/frames of the entire Tween, including looping.
    */
  var totalElapsed: scala.Double = js.native
  /**
    * Value between 0 and 1. The amount through the entire Tween, including looping.
    */
  var totalProgress: scala.Double = js.native
  /**
    * If true then duration, delay, etc values are all frame totals.
    */
  var useFrames: scala.Boolean = js.native
  /**
    * [description]
    * @param config [description]
    */
  def add(config: js.Object): Timeline = js.native
  /**
    * Calculates the total duration of the timeline.  Computes all tween's durations and returns the full duration of the timeline. The resulting number is stored in the timeline, not as a return value.
    */
  def calcDuration(): scala.Unit = js.native
  /**
    * Parses the relative offset value, returning a positive or negative number.
    * @param value The relative offset, in the format of '-=500', for example. The first character determines whether it will be a positive or negative number. Spacing matters here.
    * @param base The value to use as the offset.
    */
  def getRelativeOffset(value: java.lang.String, base: scala.Double): scala.Double = js.native
  /**
    * Gets the value of the time scale applied to this Timeline. A value of 1 runs in real-time. A value of 0.5 runs 50% slower, and so on.
    */
  def getTimeScale(): scala.Double = js.native
  /**
    * [description]
    * @param tween [description]
    */
  def hasOffset(tween: Tween): scala.Boolean = js.native
  /**
    * Checks if any of the tweens has the target as the object they are operating on. Retuns false if no tweens operate on the target object.
    * @param target The target to check all tweens against.
    */
  def hasTarget(target: js.Object): scala.Boolean = js.native
  /**
    * Initializes the timeline, which means all Tweens get their init() called, and the total duration will be computed. Returns a boolean indicating whether the timeline is auto-started or not.
    */
  def init(): scala.Boolean = js.native
  /**
    * Checks whether the offset value is a number or a directive that is relative to previous tweens.
    * @param value The offset value to be evaluated
    */
  def isOffsetAbsolute(value: scala.Double): scala.Boolean = js.native
  /**
    * Checks if the offset is a relative value rather than an absolute one. If the value is just a number, this returns false.
    * @param value The offset value to be evaluated
    */
  def isOffsetRelative(value: java.lang.String): scala.Boolean = js.native
  /**
    * Check whether or not the Timeline is playing.
    */
  def isPlaying(): scala.Boolean = js.native
  /**
    * Delegates #makeActive to the Tween manager.
    * @param tween The tween object to make active.
    */
  def makeActive(tween: Tween): TweenManager = js.native
  /**
    * [description]
    */
  def nextState(): scala.Unit = js.native
  /**
    * Pauses the timeline, retaining its internal state.
    */
  def pause(): Timeline = js.native
  /**
    * Starts playing the timeline.
    */
  def play(): scala.Unit = js.native
  /**
    * [description]
    * @param tween [description]
    */
  def queue(tween: Tween): Timeline = js.native
  /**
    * Resets all of the timeline's tweens back to their initial states.  The boolean parameter indicates whether tweens that are looping should reset as well, or not.
    * @param resetFromLoop If true, resets all looping tweens to their initial values.
    */
  def resetTweens(resetFromLoop: scala.Boolean): scala.Unit = js.native
  /**
    * Resumes the timeline from where it was when it was paused.
    */
  def resume(): Timeline = js.native
  /**
    * Sets a callback for the Timeline.
    * @param type The internal type of callback to set.
    * @param callback Timeline allows multiple tweens to be linked together to create a streaming sequence.
    * @param params The parameters to pass to the callback.
    * @param scope The context scope of the callback.
    */
  def setCallback(`type`: java.lang.String, callback: js.Function): Timeline = js.native
  def setCallback(`type`: java.lang.String, callback: js.Function, params: js.Array[_]): Timeline = js.native
  def setCallback(`type`: java.lang.String, callback: js.Function, params: js.Array[_], scope: js.Object): Timeline = js.native
  /**
    * Sets the value of the time scale applied to this Timeline. A value of 1 runs in real-time. A value of 0.5 runs 50% slower, and so on.
    * Value isn't used when calculating total duration of the tween, it's a run-time delta adjustment only.
    * @param value The time scale value to set.
    */
  def setTimeScale(value: scala.Double): Timeline = js.native
  /**
    * Stops the Tween immediately, whatever stage of progress it is at and flags it for removal by the TweenManager.
    */
  def stop(): scala.Unit = js.native
  /**
    * Returns 'true' if this Timeline has finished and should be removed from the Tween Manager.
    * Otherwise, returns false.
    * @param timestamp [description]
    * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
    */
  def update(timestamp: scala.Double, delta: scala.Double): scala.Boolean = js.native
}

