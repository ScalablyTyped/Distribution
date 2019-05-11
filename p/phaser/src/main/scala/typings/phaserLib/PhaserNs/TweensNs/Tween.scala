package typings
package phaserLib.PhaserNs.TweensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Tween is able to manipulate the properties of one or more objects to any given value, based
  * on a duration and type of ease. They are rarely instantiated directly and instead should be
  * created via the TweenManager.
  */
@JSGlobal("Phaser.Tweens.Tween")
@js.native
class Tween protected () extends js.Object {
  def this(parent: Timeline, data: js.Array[phaserLib.PhaserNs.TypesNs.TweensNs.TweenDataConfig], targets: js.Array[_]) = this()
  /**
    * 
    * @param parent A reference to the parent of this Tween. Either the Tween Manager or a Tween Timeline instance.
    * @param data An array of TweenData objects, each containing a unique property to be tweened.
    * @param targets An array of targets to be tweened.
    */
  def this(parent: TweenManager, data: js.Array[phaserLib.PhaserNs.TypesNs.TweensNs.TweenDataConfig], targets: js.Array[_]) = this()
  /**
    * Set only if this Tween is part of a Timeline. The calculated offset amount.
    */
  var calculatedOffset: scala.Double = js.native
  /**
    * An object containing the various Tween callback references.
    */
  var callbacks: js.Object = js.native
  /**
    * Time in ms/frames before the 'onComplete' event fires. This never fires if loop = -1 (as it never completes)
    */
  var completeDelay: scala.Double = js.native
  /**
    * Countdown timer (used by timeline offset, loopDelay and completeDelay)
    */
  var countdown: scala.Double = js.native
  /**
    * An array of TweenData objects, each containing a unique property and target being tweened.
    */
  var data: js.Array[phaserLib.PhaserNs.TypesNs.TweensNs.TweenDataConfig] = js.native
  /**
    * Time in ms/frames for the whole Tween to play through once, excluding loop amounts and loop delays.
    */
  var duration: scala.Double = js.native
  /**
    * Elapsed time in ms/frames of this run through the Tween.
    */
  var elapsed: scala.Double = js.native
  /**
    * Loop this tween? Can be -1 for an infinite loop, or an integer.
    * When enabled it will play through ALL TweenDatas again. Use TweenData.repeat to loop a single element.
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
    * Set only if this Tween is part of a Timeline.
    */
  var offset: scala.Double = js.native
  /**
    * A reference to the parent of this Tween.
    * Either the Tween Manager or a Tween Timeline instance.
    */
  var parent: TweenManager | Timeline = js.native
  /**
    * Is the parent of this Tween a Timeline?
    */
  var parentIsTimeline: scala.Boolean = js.native
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
    * An array of references to the target/s this Tween is operating on.
    */
  var targets: js.Array[js.Object] = js.native
  /**
    * Scales the time applied to this Tween. A value of 1 runs in real-time. A value of 0.5 runs 50% slower, and so on.
    * Value isn't used when calculating total duration of the tween, it's a run-time delta adjustment only.
    */
  var timeScale: scala.Double = js.native
  /**
    * The cached length of the data array.
    */
  var totalData: phaserLib.integer = js.native
  /**
    * Time in ms/frames for the Tween to complete (including looping)
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
    * Cached target total (not necessarily the same as the data total)
    */
  var totalTargets: phaserLib.integer = js.native
  /**
    * If `true` then duration, delay, etc values are all frame totals.
    */
  var useFrames: scala.Boolean = js.native
  /**
    * Internal method that calculates the overall duration of the Tween.
    */
  def calcDuration(): scala.Unit = js.native
  /**
    * Flags the Tween as being complete, whatever stage of progress it is at.
    * 
    * If an onComplete callback has been defined it will automatically invoke it, unless a `delay`
    * argument is provided, in which case the Tween will delay for that period of time before calling the callback.
    * 
    * If you don't need a delay, or have an onComplete callback, then call `Tween.stop` instead.
    * @param delay The time to wait before invoking the complete callback. If zero it will fire immediately. Default 0.
    */
  def complete(): this.type = js.native
  def complete(delay: scala.Double): this.type = js.native
  /**
    * Returns the scale of the time applied to this Tween.
    */
  def getTimeScale(): scala.Double = js.native
  /**
    * Returns the current value of the Tween.
    */
  def getValue(): scala.Double = js.native
  /**
    * See if this Tween is currently acting upon the given target.
    * @param target The target to check against this Tween.
    */
  def hasTarget(target: js.Object): scala.Boolean = js.native
  /**
    * Called by TweenManager.preUpdate as part of its loop to check pending and active tweens.
    * Should not be called directly.
    */
  def init(): scala.Boolean = js.native
  /**
    * Checks if the Tween is currently paused.
    */
  def isPaused(): scala.Boolean = js.native
  /**
    * Checks if the Tween is currently active.
    */
  def isPlaying(): scala.Boolean = js.native
  /**
    * Internal method that advances to the next state of the Tween during playback.
    */
  def nextState(): scala.Unit = js.native
  /**
    * Pauses the Tween immediately. Use `resume` to continue playback.
    */
  def pause(): this.type = js.native
  /**
    * Starts a Tween playing.
    * 
    * You only need to call this method if you have configured the tween to be paused on creation.
    * 
    * If the Tween is already playing, calling this method again will have no effect. If you wish to
    * restart the Tween, use `Tween.restart` instead.
    * 
    * Calling this method after the Tween has completed will start the Tween playing again from the start.
    * This is the same as calling `Tween.seek(0)` and then `Tween.play()`.
    * @param resetFromTimeline Is this Tween being played as part of a Timeline? Default false.
    */
  def play(): this.type = js.native
  def play(resetFromTimeline: scala.Boolean): this.type = js.native
  /**
    * Immediately removes this Tween from the TweenManager and all of its internal arrays,
    * no matter what stage it as it. Then sets the tween state to `REMOVED`.
    * 
    * You should dispose of your reference to this tween after calling this method, to
    * free it from memory.
    */
  def remove(): this.type = js.native
  /**
    * Internal method that resets all of the Tween Data, including the progress and elapsed values.
    * @param resetFromLoop Has this method been called as part of a loop?
    */
  def resetTweenData(resetFromLoop: scala.Boolean): scala.Unit = js.native
  /**
    * Restarts the tween from the beginning.
    */
  def restart(): this.type = js.native
  /**
    * Resumes the playback of a previously paused Tween.
    */
  def resume(): this.type = js.native
  /**
    * Attempts to seek to a specific position in a Tween.
    * @param toPosition A value between 0 and 1 which represents the progress point to seek to.
    */
  def seek(toPosition: scala.Double): this.type = js.native
  /**
    * Sets an event based callback to be invoked during playback.
    * @param type Type of the callback.
    * @param callback Callback function.
    * @param params An array of parameters for specified callbacks types.
    * @param scope The context the callback will be invoked in.
    */
  def setCallback(`type`: java.lang.String, callback: js.Function): this.type = js.native
  def setCallback(`type`: java.lang.String, callback: js.Function, params: js.Array[_]): this.type = js.native
  def setCallback(`type`: java.lang.String, callback: js.Function, params: js.Array[_], scope: js.Object): this.type = js.native
  /**
    * Internal method used as part of the playback process that sets a tween to play in reverse.
    * @param tween The Tween to update.
    * @param tweenData The TweenData property to update.
    * @param diff Any extra time that needs to be accounted for in the elapsed and progress values.
    */
  def setStateFromEnd(tween: Tween, tweenData: phaserLib.PhaserNs.TypesNs.TweensNs.TweenDataConfig, diff: scala.Double): phaserLib.integer = js.native
  /**
    * Internal method used as part of the playback process that sets a tween to play from the start.
    * @param tween The Tween to update.
    * @param tweenData The TweenData property to update.
    * @param diff Any extra time that needs to be accounted for in the elapsed and progress values.
    */
  def setStateFromStart(tween: Tween, tweenData: phaserLib.PhaserNs.TypesNs.TweensNs.TweenDataConfig, diff: scala.Double): phaserLib.integer = js.native
  /**
    * Set the scale the time applied to this Tween. A value of 1 runs in real-time. A value of 0.5 runs 50% slower, and so on.
    * @param value The scale factor for timescale.
    */
  def setTimeScale(value: scala.Double): this.type = js.native
  /**
    * Stops the Tween immediately, whatever stage of progress it is at and flags it for removal by the TweenManager.
    * @param resetTo If you want to seek the tween, provide a value between 0 and 1.
    */
  def stop(): this.type = js.native
  def stop(resetTo: scala.Double): this.type = js.native
  /**
    * Internal method that advances the Tween based on the time values.
    * @param timestamp The current time. Either a High Resolution Timer value if it comes from Request Animation Frame, or Date.now if using SetTimeout.
    * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
    */
  def update(timestamp: scala.Double, delta: scala.Double): scala.Boolean = js.native
  /**
    * Updates the value of a property of this Tween to a new value, without adjusting the
    * Tween duration or current progress.
    * 
    * You can optionally tell it to set the 'start' value to be the current value (before the change).
    * @param key The property to set the new value for.
    * @param value The new value of the property.
    * @param startToCurrent Should this change set the start value to be the current value? Default false.
    */
  def updateTo(key: java.lang.String, value: js.Any): this.type = js.native
  def updateTo(key: java.lang.String, value: js.Any, startToCurrent: scala.Boolean): this.type = js.native
  /**
    * Internal method that advances the TweenData based on the time value given.
    * @param tween The Tween to update.
    * @param tweenData The TweenData property to update.
    * @param delta Either a value in ms, or 1 if Tween.useFrames is true
    */
  def updateTweenData(tween: Tween, tweenData: phaserLib.PhaserNs.TypesNs.TweensNs.TweenDataConfig, delta: scala.Double): scala.Boolean = js.native
}

