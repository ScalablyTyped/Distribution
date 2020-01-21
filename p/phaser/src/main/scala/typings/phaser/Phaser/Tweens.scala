package typings.phaser.Phaser

import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.Phaser.Scenes.Systems
import typings.phaser.Phaser.Types.Tweens.Event
import typings.phaser.Phaser.Types.Tweens.NumberTweenBuilderConfig
import typings.phaser.Phaser.Types.Tweens.StaggerConfig
import typings.phaser.Phaser.Types.Tweens.TimelineBuilderConfig
import typings.phaser.Phaser.Types.Tweens.TweenBuilderConfig
import typings.phaser.Phaser.Types.Tweens.TweenConfigDefaults
import typings.phaser.Phaser.Types.Tweens.TweenDataConfig
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Tweens")
@js.native
object Tweens extends js.Object {
  /**
    * A Timeline combines multiple Tweens into one. Its overall behavior is otherwise similar to a single Tween.
    * 
    * The Timeline updates all of its Tweens simultaneously. Its methods allow you to easily build a sequence
    * of Tweens (each one starting after the previous one) or run multiple Tweens at once during given parts of the Timeline.
    */
  @js.native
  class Timeline protected () extends EventEmitter {
    /**
      * 
      * @param manager The Tween Manager which owns this Timeline.
      */
    def this(manager: TweenManager) = this()
    /**
      * The context in which all callbacks are invoked.
      */
    var callbackScope: js.Any = js.native
    /**
      * An object containing the different Tween callback functions.
      * 
      * You can either set these in the Tween config, or by calling the `Tween.setCallback` method.
      * 
      * `onComplete` When the Timeline finishes playback fully or `Timeline.stop` is called. Never invoked if timeline is set to repeat infinitely.
      * `onLoop` When a Timeline loops.
      * `onStart` When the Timeline starts playing.
      * `onUpdate` When a Timeline updates a child Tween.
      * `onYoyo` When a Timeline starts a yoyo.
      */
    var callbacks: js.Object = js.native
    /**
      * Time in ms/frames before the 'onComplete' event fires. This never fires if loop = true (as it never completes)
      */
    var completeDelay: Double = js.native
    /**
      * Countdown timer value, as used by `loopDelay` and `completeDelay`.
      */
    var countdown: Double = js.native
    /**
      * An array of Tween objects, each containing a unique property and target being tweened.
      */
    var data: js.Array[_] = js.native
    /**
      * Time in ms/frames for the whole Timeline to play through once, excluding loop amounts and loop delays.
      */
    var duration: Double = js.native
    /**
      * Elapsed time in ms/frames of this run through of the Timeline.
      */
    var elapsed: Double = js.native
    /**
      * A constant value which allows this Timeline to be easily identified as one.
      */
    var isTimeline: Boolean = js.native
    /**
      * Loop this Timeline? Can be -1 for an infinite loop, or an integer.
      * When enabled it will play through ALL Tweens again (use Tween.repeat to loop a single tween)
      */
    var loop: Double = js.native
    /**
      * How many loops are left to run?
      */
    var loopCounter: Double = js.native
    /**
      * Time in ms/frames before this Timeline loops.
      */
    var loopDelay: Double = js.native
    /**
      * The Tween Manager which owns this Timeline.
      */
    var manager: TweenManager = js.native
    /**
      * Does the Timeline start off paused? (if so it needs to be started with Timeline.play)
      */
    var paused: Boolean = js.native
    /**
      * Value between 0 and 1. The amount of progress through the Timeline, _excluding loops_.
      */
    var progress: Double = js.native
    /**
      * The current state of the Timeline.
      */
    var state: integer = js.native
    /**
      * Scales the time applied to this Timeline. A value of 1 runs in real-time. A value of 0.5 runs 50% slower, and so on.
      * Value isn't used when calculating total duration of the Timeline, it's a run-time delta adjustment only.
      */
    var timeScale: Double = js.native
    /**
      * The cached size of the data array.
      */
    var totalData: Double = js.native
    /**
      * Time in ms/frames for all Tweens in this Timeline to complete (including looping)
      */
    var totalDuration: Double = js.native
    /**
      * Total elapsed time in ms/frames of the entire Timeline, including looping.
      */
    var totalElapsed: Double = js.native
    /**
      * Value between 0 and 1. The amount through the entire Timeline, including looping.
      */
    var totalProgress: Double = js.native
    /**
      * If true then duration, delay, etc values are all frame totals, rather than ms.
      */
    var useFrames: Boolean = js.native
    def add(config: js.Object): this.type = js.native
    /**
      * Creates a new Tween, based on the given Tween Config, and adds it to this Timeline.
      * @param config The configuration object for the Tween.
      */
    def add(config: TweenBuilderConfig): this.type = js.native
    /**
      * Calculates the total duration of the timeline.
      * 
      * Computes all tween durations and returns the full duration of the timeline.
      * 
      * The resulting number is stored in the timeline, not as a return value.
      */
    def calcDuration(): Unit = js.native
    /**
      * Internal method that will emit a Timeline based Event and invoke the given callback.
      * @param event The Event to be dispatched.
      * @param callback The callback to be invoked. Can be `null` or `undefined` to skip invocation.
      */
    def dispatchTimelineEvent(event: Event, callback: js.Function): Unit = js.native
    /**
      * Parses the relative offset value, returning a positive or negative number.
      * @param value The relative offset, in the format of '-=500', for example. The first character determines whether it will be a positive or negative number. Spacing matters here.
      * @param base The value to use as the offset.
      */
    def getRelativeOffset(value: String, base: Double): Double = js.native
    /**
      * Gets the value of the time scale applied to this Timeline. A value of 1 runs in real-time.
      * A value of 0.5 runs 50% slower, and so on.
      */
    def getTimeScale(): Double = js.native
    /**
      * Checks whether a Tween has an offset value.
      * @param tween The Tween to check.
      */
    def hasOffset(tween: Tween): Boolean = js.native
    /**
      * Checks if any of the Tweens in this Timeline as operating on the target object.
      * 
      * Returns `false` if no Tweens operate on the target object.
      * @param target The target to check all Tweens against.
      */
    def hasTarget(target: js.Object): Boolean = js.native
    /**
      * Initializes the timeline, which means all Tweens get their init() called, and the total duration will be computed.
      * Returns a boolean indicating whether the timeline is auto-started or not.
      */
    def init(): Boolean = js.native
    /**
      * Checks whether the offset value is a number or a directive that is relative to previous tweens.
      * @param value The offset value to be evaluated.
      */
    def isOffsetAbsolute(value: Double): Boolean = js.native
    /**
      * Checks if the offset is a relative value rather than an absolute one.
      * If the value is just a number, this returns false.
      * @param value The offset value to be evaluated.
      */
    def isOffsetRelative(value: String): Boolean = js.native
    /**
      * Check whether or not the Timeline is playing.
      */
    def isPlaying(): Boolean = js.native
    /**
      * Passed a Tween to the Tween Manager and requests it be made active.
      * @param tween The tween object to make active.
      */
    def makeActive(tween: Tween): TweenManager = js.native
    /**
      * Updates the Timeline's `state` and fires callbacks and events.
      */
    def nextState(): Unit = js.native
    /**
      * Pauses the Timeline, retaining its internal state.
      * 
      * Calling this on a Timeline that is already paused has no effect and fires no event.
      */
    def pause(): this.type = js.native
    /**
      * Starts playing the Timeline.
      */
    def play(): Unit = js.native
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
    def resetTweens(resetFromLoop: Boolean): Unit = js.native
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
    def setCallback(`type`: String, callback: js.Function): this.type = js.native
    def setCallback(`type`: String, callback: js.Function, params: js.Array[_]): this.type = js.native
    def setCallback(`type`: String, callback: js.Function, params: js.Array[_], scope: js.Object): this.type = js.native
    /**
      * Sets the value of the time scale applied to this Timeline. A value of 1 runs in real-time.
      * A value of 0.5 runs 50% slower, and so on.
      * 
      * The value isn't used when calculating total duration of the tween, it's a run-time delta adjustment only.
      * @param value The time scale value to set.
      */
    def setTimeScale(value: Double): this.type = js.native
    /**
      * Stops the Timeline immediately, whatever stage of progress it is at and flags it for removal by the TweenManager.
      */
    def stop(): Unit = js.native
    /**
      * Returns 'true' if this Timeline has finished and should be removed from the Tween Manager.
      * Otherwise, returns false.
      * @param timestamp The current time. Either a High Resolution Timer value if it comes from Request Animation Frame, or Date.now if using SetTimeout.
      * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
      */
    def update(timestamp: Double, delta: Double): Boolean = js.native
  }
  
  /**
    * A Tween is able to manipulate the properties of one or more objects to any given value, based
    * on a duration and type of ease. They are rarely instantiated directly and instead should be
    * created via the TweenManager.
    */
  @js.native
  class Tween protected () extends EventEmitter {
    def this(parent: Timeline, data: js.Array[TweenDataConfig], targets: js.Array[_]) = this()
    /**
      * 
      * @param parent A reference to the parent of this Tween. Either the Tween Manager or a Tween Timeline instance.
      * @param data An array of TweenData objects, each containing a unique property to be tweened.
      * @param targets An array of targets to be tweened.
      */
    def this(parent: TweenManager, data: js.Array[TweenDataConfig], targets: js.Array[_]) = this()
    /**
      * Set only if this Tween is part of a Timeline. The calculated offset amount.
      */
    var calculatedOffset: Double = js.native
    /**
      * The context in which all callbacks are invoked.
      */
    var callbackScope: js.Any = js.native
    /**
      * An object containing the different Tween callback functions.
      * 
      * You can either set these in the Tween config, or by calling the `Tween.setCallback` method.
      * 
      * `onActive` When the Tween is moved from the pending to the active list in the Tween Manager, even if playback paused.
      * `onStart` When the Tween starts playing after a delayed state. Will happen at the same time as `onActive` if it has no delay.
      * `onYoyo` When a TweenData starts a yoyo. This happens _after_ the `hold` delay expires, if set.
      * `onRepeat` When a TweenData repeats playback. This happens _after_ the `repeatDelay` expires, if set.
      * `onComplete` When the Tween finishes playback fully or `Tween.stop` is called. Never invoked if tween is set to repeat infinitely.
      * `onUpdate` When a TweenData updates a property on a source target during playback.
      * `onLoop` When a Tween loops. This happens _after_ the `loopDelay` expires, if set.
      */
    var callbacks: js.Object = js.native
    /**
      * Time in ms/frames before the 'onComplete' event fires. This never fires if loop = -1 (as it never completes)
      */
    var completeDelay: Double = js.native
    /**
      * Countdown timer (used by timeline offset, loopDelay and completeDelay)
      */
    var countdown: Double = js.native
    /**
      * An array of TweenData objects, each containing a unique property and target being tweened.
      */
    var data: js.Array[TweenDataConfig] = js.native
    /**
      * Time in ms/frames for the whole Tween to play through once, excluding loop amounts and loop delays.
      */
    var duration: Double = js.native
    /**
      * Elapsed time in ms/frames of this run through the Tween.
      */
    var elapsed: Double = js.native
    /**
      * Has this Tween started playback yet?
      * This boolean is toggled when the Tween leaves the 'delayed' state and starts running.
      */
    val hasStarted: Boolean = js.native
    /**
      * Is this Tween currently seeking?
      * This boolean is toggled in the `Tween.seek` method.
      * When a tween is seeking it will not dispatch any events or callbacks.
      */
    val isSeeking: Boolean = js.native
    /**
      * Loop this tween? Can be -1 for an infinite loop, or an integer.
      * When enabled it will play through ALL TweenDatas again. Use TweenData.repeat to loop a single element.
      */
    var loop: Double = js.native
    /**
      * How many loops are left to run?
      */
    var loopCounter: Double = js.native
    /**
      * Time in ms/frames before the tween loops.
      */
    var loopDelay: Double = js.native
    /**
      * Set only if this Tween is part of a Timeline.
      */
    var offset: Double = js.native
    /**
      * A reference to the parent of this Tween.
      * Either the Tween Manager or a Tween Timeline instance.
      */
    var parent: TweenManager | Timeline = js.native
    /**
      * Is the parent of this Tween a Timeline?
      */
    var parentIsTimeline: Boolean = js.native
    /**
      * Does the Tween start off paused? (if so it needs to be started with Tween.play)
      */
    var paused: Boolean = js.native
    /**
      * Value between 0 and 1. The amount through the Tween, excluding loops.
      */
    var progress: Double = js.native
    /**
      * Time in ms/frames before the 'onStart' event fires.
      * This is the shortest `delay` value across all of the TweenDatas of this Tween.
      */
    var startDelay: Double = js.native
    /**
      * The current state of the tween
      */
    var state: integer = js.native
    /**
      * An array of references to the target/s this Tween is operating on.
      */
    var targets: js.Array[js.Object] = js.native
    /**
      * Scales the time applied to this Tween. A value of 1 runs in real-time. A value of 0.5 runs 50% slower, and so on.
      * Value isn't used when calculating total duration of the tween, it's a run-time delta adjustment only.
      */
    var timeScale: Double = js.native
    /**
      * The cached length of the data array.
      */
    var totalData: integer = js.native
    /**
      * Time in ms/frames for the Tween to complete (including looping)
      */
    var totalDuration: Double = js.native
    /**
      * Total elapsed time in ms/frames of the entire Tween, including looping.
      */
    var totalElapsed: Double = js.native
    /**
      * Value between 0 and 1. The amount through the entire Tween, including looping.
      */
    var totalProgress: Double = js.native
    /**
      * Cached target total (not necessarily the same as the data total)
      */
    var totalTargets: integer = js.native
    /**
      * If `true` then duration, delay, etc values are all frame totals.
      */
    var useFrames: Boolean = js.native
    /**
      * Internal method that calculates the overall duration of the Tween.
      */
    def calcDuration(): Unit = js.native
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
    def complete(delay: Double): this.type = js.native
    /**
      * Internal method that will emit a TweenData based Event and invoke the given callback.
      * @param event The Event to be dispatched.
      * @param callback The callback to be invoked. Can be `null` or `undefined` to skip invocation.
      * @param tweenData The TweenData object that caused this event.
      */
    def dispatchTweenDataEvent(event: Event, callback: js.Function, tweenData: TweenDataConfig): Unit = js.native
    /**
      * Internal method that will emit a Tween based Event and invoke the given callback.
      * @param event The Event to be dispatched.
      * @param callback The callback to be invoked. Can be `null` or `undefined` to skip invocation.
      */
    def dispatchTweenEvent(event: Event, callback: js.Function): Unit = js.native
    /**
      * Returns the scale of the time applied to this Tween.
      */
    def getTimeScale(): Double = js.native
    /**
      * Returns the current value of the specified Tween Data.
      * @param index The Tween Data to return the value from. Default 0.
      */
    def getValue(): Double = js.native
    def getValue(index: integer): Double = js.native
    /**
      * See if this Tween is currently acting upon the given target.
      * @param target The target to check against this Tween.
      */
    def hasTarget(target: js.Object): Boolean = js.native
    /**
      * Called by TweenManager.preUpdate as part of its loop to check pending and active tweens.
      * Should not be called directly.
      */
    def init(): Boolean = js.native
    /**
      * Checks if the Tween is currently paused.
      */
    def isPaused(): Boolean = js.native
    /**
      * Checks if the Tween is currently active.
      */
    def isPlaying(): Boolean = js.native
    /**
      * Internal method that makes this Tween active within the TweenManager
      * and emits the onActive event and callback.
      */
    def makeActive(): Unit = js.native
    /**
      * Internal method that advances to the next state of the Tween during playback.
      */
    def nextState(): Unit = js.native
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
    def play(resetFromTimeline: Boolean): this.type = js.native
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
    def resetTweenData(resetFromLoop: Boolean): Unit = js.native
    /**
      * Restarts the tween from the beginning.
      */
    def restart(): this.type = js.native
    /**
      * Resumes the playback of a previously paused Tween.
      */
    def resume(): this.type = js.native
    /**
      * Seeks to a specific point in the Tween.
      * 
      * **Note:** You cannot seek a Tween that repeats or loops forever, or that has an unusually long total duration.
      * 
      * The given position is a value between 0 and 1 which represents how far through the Tween to seek to.
      * A value of 0.5 would seek to half-way through the Tween, where-as a value of zero would seek to the start.
      * 
      * Note that the seek takes the entire duration of the Tween into account, including delays, loops and repeats.
      * For example, a Tween that lasts for 2 seconds, but that loops 3 times, would have a total duration of 6 seconds,
      * so seeking to 0.5 would seek to 3 seconds into the Tween, as that's half-way through its _entire_ duration.
      * 
      * Seeking works by resetting the Tween to its initial values and then iterating through the Tween at `delta`
      * jumps per step. The longer the Tween, the longer this can take.
      * @param toPosition A value between 0 and 1 which represents the progress point to seek to.
      * @param delta The size of each step when seeking through the Tween. A higher value completes faster but at a cost of less precision. Default 16.6.
      */
    def seek(toPosition: Double): this.type = js.native
    def seek(toPosition: Double, delta: Double): this.type = js.native
    /**
      * Sets an event based callback to be invoked during playback.
      * 
      * Calling this method will replace a previously set callback for the given type, if any exists.
      * 
      * The types available are:
      * 
      * `onActive` When the Tween is moved from the pending to the active list in the Tween Manager, even if playback paused.
      * `onStart` When the Tween starts playing after a delayed state. Will happen at the same time as `onActive` if it has no delay.
      * `onYoyo` When a TweenData starts a yoyo. This happens _after_ the `hold` delay expires, if set.
      * `onRepeat` When a TweenData repeats playback. This happens _after_ the `repeatDelay` expires, if set.
      * `onComplete` When the Tween finishes playback fully or `Tween.stop` is called. Never invoked if tween is set to repeat infinitely.
      * `onUpdate` When a TweenData updates a property on a source target during playback.
      * `onLoop` When a Tween loops. This happens _after_ the `loopDelay` expires, if set.
      * @param type Type of the callback to set.
      * @param callback The function to invoke when this callback happens.
      * @param params An array of parameters for specified callbacks types.
      * @param scope The context the callback will be invoked in.
      */
    def setCallback(`type`: String, callback: js.Function): this.type = js.native
    def setCallback(`type`: String, callback: js.Function, params: js.Array[_]): this.type = js.native
    def setCallback(`type`: String, callback: js.Function, params: js.Array[_], scope: js.Any): this.type = js.native
    /**
      * Internal method used as part of the playback process that sets a tween to play in reverse.
      * @param tween The Tween to update.
      * @param tweenData The TweenData property to update.
      * @param diff Any extra time that needs to be accounted for in the elapsed and progress values.
      */
    def setStateFromEnd(tween: Tween, tweenData: TweenDataConfig, diff: Double): integer = js.native
    /**
      * Internal method used as part of the playback process that sets a tween to play from the start.
      * @param tween The Tween to update.
      * @param tweenData The TweenData property to update.
      * @param diff Any extra time that needs to be accounted for in the elapsed and progress values.
      */
    def setStateFromStart(tween: Tween, tweenData: TweenDataConfig, diff: Double): integer = js.native
    /**
      * Set the scale the time applied to this Tween. A value of 1 runs in real-time. A value of 0.5 runs 50% slower, and so on.
      * @param value The scale factor for timescale.
      */
    def setTimeScale(value: Double): this.type = js.native
    /**
      * Stops the Tween immediately, whatever stage of progress it is at and flags it for removal by the TweenManager.
      * @param resetTo If you want to seek the tween, provide a value between 0 and 1.
      */
    def stop(): this.type = js.native
    def stop(resetTo: Double): this.type = js.native
    /**
      * Internal method that advances the Tween based on the time values.
      * @param timestamp The current time. Either a High Resolution Timer value if it comes from Request Animation Frame, or Date.now if using SetTimeout.
      * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
      */
    def update(timestamp: Double, delta: Double): Boolean = js.native
    /**
      * Updates the 'end' value of the given property across all matching targets.
      * 
      * Calling this does not adjust the duration of the tween, or the current progress.
      * 
      * You can optionally tell it to set the 'start' value to be the current value (before the change).
      * @param key The property to set the new value for.
      * @param value The new value of the property.
      * @param startToCurrent Should this change set the start value to be the current value? Default false.
      */
    def updateTo(key: String, value: js.Any): this.type = js.native
    def updateTo(key: String, value: js.Any, startToCurrent: Boolean): this.type = js.native
    /**
      * Internal method that advances the TweenData based on the time value given.
      * @param tween The Tween to update.
      * @param tweenData The TweenData property to update.
      * @param delta Either a value in ms, or 1 if Tween.useFrames is true.
      */
    def updateTweenData(tween: Tween, tweenData: TweenDataConfig, delta: Double): Boolean = js.native
  }
  
  /**
    * The Tween Manager is a default Scene Plugin which controls and updates Tweens and Timelines.
    */
  @js.native
  class TweenManager protected () extends js.Object {
    /**
      * 
      * @param scene The Scene which owns this Tween Manager.
      */
    def this(scene: Scene) = this()
    /**
      * The Scene which owns this Tween Manager.
      */
    var scene: Scene = js.native
    /**
      * The Systems object of the Scene which owns this Tween Manager.
      */
    var systems: Systems = js.native
    /**
      * The time scale of the Tween Manager.
      * 
      * This value scales the time delta between two frames, thus influencing the speed of time for all Tweens owned by this Tween Manager.
      */
    var timeScale: Double = js.native
    def add(config: js.Object): Tween = js.native
    /**
      * Create a Tween and add it to the active Tween list.
      * @param config The configuration object for the Tween.
      */
    def add(config: TweenBuilderConfig): Tween = js.native
    /**
      * Create a Number Tween and add it to the active Tween list.
      * @param config The configuration object for the Number Tween.
      */
    def addCounter(config: NumberTweenBuilderConfig): Tween = js.native
    def create(config: js.Object): Tween = js.native
    /**
      * Create a Tween and return it, but do NOT add it to the active or pending Tween lists.
      * @param config The configuration object for the Tween.
      */
    def create(config: TweenBuilderConfig): Tween = js.native
    /**
      * Create a Tween Timeline and return it, but do NOT add it to the active or pending Tween lists.
      * @param config The configuration object for the Timeline and its Tweens.
      */
    def createTimeline(): Timeline = js.native
    def createTimeline(config: TimelineBuilderConfig): Timeline = js.native
    /**
      * The Scene that owns this plugin is being destroyed.
      * We need to shutdown and then kill off all external references.
      */
    def destroy(): Unit = js.native
    /**
      * Passes all Tweens to the given callback.
      * @param callback The function to call.
      * @param scope The scope (`this` object) to call the function with.
      * @param args The arguments to pass into the function. Its first argument will always be the Tween currently being iterated.
      */
    def each(callback: js.Function): Unit = js.native
    def each(callback: js.Function, scope: js.Object, args: js.Any*): Unit = js.native
    /**
      * Add an existing tween into the active Tween list.
      * @param tween The Tween to add.
      */
    def existing(tween: Tween): TweenManager = js.native
    /**
      * Returns an array of all active Tweens and Timelines in the Tween Manager.
      */
    def getAllTweens(): js.Array[Tween] = js.native
    /**
      * Returns the scale of the time delta for all Tweens and Timelines owned by this Tween Manager.
      */
    def getGlobalTimeScale(): Double = js.native
    def getTweensOf(target: js.Array[_]): js.Array[Tween] = js.native
    /**
      * Returns an array of all Tweens or Timelines in the Tween Manager which affect the given target or array of targets.
      * @param target The target to look for. Provide an array to look for multiple targets.
      */
    def getTweensOf(target: js.Object): js.Array[Tween] = js.native
    /**
      * Checks if the given object is being affected by a playing Tween.
      * @param target target Phaser.Tweens.Tween object
      */
    def isTweening(target: js.Object): Boolean = js.native
    /**
      * Stops all Tweens in this Tween Manager. They will be removed at the start of the frame.
      */
    def killAll(): TweenManager = js.native
    def killTweensOf(target: js.Array[_]): TweenManager = js.native
    /**
      * Stops all Tweens which affect the given target or array of targets. The Tweens will be removed from the Tween Manager at the start of the frame.
      * @param target The target to look for. Provide an array to look for multiple targets.
      */
    def killTweensOf(target: js.Object): TweenManager = js.native
    /**
      * Checks if a Tween or Timeline is active and adds it to the Tween Manager at the start of the frame if it isn't.
      * @param tween The Tween to check.
      */
    def makeActive(tween: Tween): TweenManager = js.native
    /**
      * Pauses all Tweens in this Tween Manager.
      */
    def pauseAll(): TweenManager = js.native
    /**
      * Updates the Tween Manager's internal lists at the start of the frame.
      * 
      * This method will return immediately if no changes have been indicated.
      */
    def preUpdate(): Unit = js.native
    /**
      * Removes the given tween from the Tween Manager, regardless of its state (pending or active).
      * @param tween The Tween to be removed.
      */
    def remove(tween: Tween): TweenManager = js.native
    /**
      * Resumes all Tweens in this Tween Manager.
      */
    def resumeAll(): TweenManager = js.native
    /**
      * Sets a new scale of the time delta for this Tween Manager.
      * 
      * The time delta is the time elapsed between two consecutive frames and influences the speed of time for this Tween Manager and all Tweens it owns. Values higher than 1 increase the speed of time, while values smaller than 1 decrease it. A value of 0 freezes time and is effectively equivalent to pausing all Tweens.
      * @param value The new scale of the time delta, where 1 is the normal speed.
      */
    def setGlobalTimeScale(value: Double): TweenManager = js.native
    /**
      * The Scene that owns this plugin is shutting down.
      * We need to kill and reset all internal properties as well as stop listening to Scene events.
      */
    def shutdown(): Unit = js.native
    def stagger(value: js.Array[Double], config: StaggerConfig): js.Function = js.native
    /**
      * Creates a Stagger function to be used by a Tween property.
      * 
      * The stagger function will allow you to stagger changes to the value of the property across all targets of the tween.
      * 
      * This is only worth using if the tween has multiple targets.
      * 
      * The following will stagger the delay by 100ms across all targets of the tween, causing them to scale down to 0.2
      * over the duration specified:
      * 
      * ```javascript
      * this.tweens.add({
      *     targets: [ ... ],
      *     scale: 0.2,
      *     ease: 'linear',
      *     duration: 1000,
      *     delay: this.tweens.stagger(100)
      * });
      * ```
      * 
      * The following will stagger the delay by 500ms across all targets of the tween using a 10 x 6 grid, staggering
      * from the center out, using a cubic ease.
      * 
      * ```javascript
      * this.tweens.add({
      *     targets: [ ... ],
      *     scale: 0.2,
      *     ease: 'linear',
      *     duration: 1000,
      *     delay: this.tweens.stagger(500, { grid: [ 10, 6 ], from: 'center', ease: 'cubic.out' })
      * });
      * ```
      * @param value The amount to stagger by, or an array containing two elements representing the min and max values to stagger between.
      * @param config The configuration object for the Stagger function.
      */
    def stagger(value: Double, config: StaggerConfig): js.Function = js.native
    /**
      * Create a Tween Timeline and add it to the active Tween list/
      * @param config The configuration object for the Timeline and its Tweens.
      */
    def timeline(): Timeline = js.native
    def timeline(config: TimelineBuilderConfig): Timeline = js.native
    /**
      * Updates all Tweens and Timelines of the Tween Manager.
      * @param timestamp The current time in milliseconds.
      * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
      */
    def update(timestamp: Double, delta: Double): Unit = js.native
  }
  
  /**
    * Tween state.
    */
  var ACTIVE: integer = js.native
  /**
    * TweenData state.
    */
  var COMPLETE: integer = js.native
  /**
    * Tween state.
    */
  var COMPLETE_DELAY: integer = js.native
  /**
    * TweenData state.
    */
  var CREATED: integer = js.native
  /**
    * TweenData state.
    */
  var DELAY: integer = js.native
  /**
    * TweenData state.
    */
  var HOLD_DELAY: integer = js.native
  /**
    * TweenData state.
    */
  var INIT: integer = js.native
  /**
    * Tween state.
    */
  var LOOP_DELAY: integer = js.native
  /**
    * TweenData state.
    */
  var OFFSET_DELAY: integer = js.native
  /**
    * Tween state.
    */
  var PAUSED: integer = js.native
  /**
    * Tween state.
    */
  var PENDING_ADD: integer = js.native
  /**
    * Tween state.
    */
  var PENDING_REMOVE: integer = js.native
  /**
    * TweenData state.
    */
  var PENDING_RENDER: integer = js.native
  /**
    * TweenData state.
    */
  var PLAYING_BACKWARD: integer = js.native
  /**
    * TweenData state.
    */
  var PLAYING_FORWARD: integer = js.native
  /**
    * Tween state.
    */
  var REMOVED: integer = js.native
  /**
    * TweenData state.
    */
  var REPEAT_DELAY: integer = js.native
  /**
    * Returns a TweenDataConfig object that describes the tween data for a unique property of a unique target.
    * A single Tween consists of multiple TweenDatas, depending on how many properties are being changed by the Tween.
    * 
    * This is an internal function used by the TweenBuilder and should not be accessed directly, instead,
    * Tweens should be created using the GameObjectFactory or GameObjectCreator.
    * @param target The target to tween.
    * @param index The target index within the Tween targets array.
    * @param key The property of the target to tween.
    * @param getEnd What the property will be at the END of the Tween.
    * @param getStart What the property will be at the START of the Tween.
    * @param getActive If not null, is invoked _immediately_ as soon as the TweenData is running, and is set on the target property.
    * @param ease The ease function this tween uses.
    * @param delay Time in ms/frames before tween will start.
    * @param duration Duration of the tween in ms/frames.
    * @param yoyo Determines whether the tween should return back to its start value after hold has expired.
    * @param hold Time in ms/frames the tween will pause before repeating or returning to its starting value if yoyo is set to true.
    * @param repeat Number of times to repeat the tween. The tween will always run once regardless, so a repeat value of '1' will play the tween twice.
    * @param repeatDelay Time in ms/frames before the repeat will start.
    * @param flipX Should toggleFlipX be called when yoyo or repeat happens?
    * @param flipY Should toggleFlipY be called when yoyo or repeat happens?
    */
  def TweenData(
    target: js.Any,
    index: integer,
    key: String,
    getEnd: js.Function,
    getStart: js.Function,
    getActive: js.Function,
    ease: js.Function,
    delay: Double,
    duration: Double,
    yoyo: Boolean,
    hold: Double,
    repeat: Double,
    repeatDelay: Double,
    flipX: Boolean,
    flipY: Boolean
  ): TweenDataConfig = js.native
  @js.native
  object Builders extends js.Object {
    /**
      * Retrieves the value of the given key from an object.
      * @param source The object to retrieve the value from.
      * @param key The key to look for in the `source` object.
      * @param defaultValue The default value to return if the `key` doesn't exist or if no `source` object is provided.
      */
    def GetBoolean(source: js.Object, key: String, defaultValue: js.Any): js.Any = js.native
    /**
      * This internal function is used to return the correct ease function for a Tween.
      * 
      * It can take a variety of input, including an EaseMap based string, or a custom function.
      * @param ease The ease to find. This can be either a string from the EaseMap, or a custom function.
      * @param easeParams An optional array of ease parameters to go with the ease.
      */
    def GetEaseFunction(ease: String): js.Function = js.native
    def GetEaseFunction(ease: String, easeParams: js.Array[Double]): js.Function = js.native
    def GetEaseFunction(ease: js.Function): js.Function = js.native
    def GetEaseFunction(ease: js.Function, easeParams: js.Array[Double]): js.Function = js.native
    /**
      * Internal function used by the Tween Builder to create a function that will return
      * the given value from the source.
      * @param source The source object to get the value from.
      * @param key The property to get from the source.
      * @param defaultValue A default value to return should the source not have the property set.
      */
    def GetNewValue(source: js.Any, key: String, defaultValue: js.Any): js.Function = js.native
    /**
      * Internal function used by the Tween Builder to return an array of properties
      * that the Tween will be operating on. It takes a tween configuration object
      * and then checks that none of the `props` entries start with an underscore, or that
      * none of the direct properties are on the Reserved list.
      * @param config The configuration object of the Tween to get the properties from.
      */
    def GetProps(config: TweenBuilderConfig): js.Array[String] = js.native
    /**
      * Extracts an array of targets from a Tween configuration object.
      * 
      * The targets will be looked for in a `targets` property. If it's a function, its return value will be used as the result.
      * @param config The configuration object to use.
      */
    def GetTargets(config: js.Object): js.Array[_] = js.native
    /**
      * Internal function used by the Timeline Builder.
      * 
      * It returns an array of all tweens in the given timeline config.
      * @param config The configuration object for the Timeline.
      */
    def GetTweens(config: TimelineBuilderConfig): js.Array[Tween] = js.native
    /**
      * Returns `getActive`, `getStart` and `getEnd` functions for a TweenData based on a target property and end value.
      * 
      * `getActive` if not null, is invoked _immediately_ as soon as the TweenData is running, and is set on the target property.
      * `getEnd` is invoked once any start delays have expired and returns what the value should tween to.
      * `getStart` is invoked when the tween reaches the end and needs to either repeat or yoyo, it returns the value to go back to.
      * 
      * If the end value is a number, it will be treated as an absolute value and the property will be tweened to it.
      * A string can be provided to specify a relative end value which consists of an operation
      * (`+=` to add to the current value, `-=` to subtract from the current value, `*=` to multiply the current
      * value, or `/=` to divide the current value) followed by its operand.
      * 
      * A function can be provided to allow greater control over the end value; it will receive the target
      * object being tweened, the name of the property being tweened, and the current value of the property
      * as its arguments.
      * 
      * If both the starting and the ending values need to be controlled, an object with `getStart` and `getEnd`
      * callbacks, which will receive the same arguments, can be provided instead. If an object with a `value`
      * property is provided, the property will be used as the effective value under the same rules described here.
      * @param key The name of the property to modify.
      * @param propertyValue The ending value of the property, as described above.
      */
    def GetValueOp(key: String, propertyValue: js.Any): js.Function = js.native
    def NumberTweenBuilder(parent: Timeline, config: NumberTweenBuilderConfig, defaults: TweenConfigDefaults): Tween = js.native
    /**
      * Creates a new Number Tween.
      * @param parent The owner of the new Tween.
      * @param config Configuration for the new Tween.
      * @param defaults Tween configuration defaults.
      */
    def NumberTweenBuilder(parent: TweenManager, config: NumberTweenBuilderConfig, defaults: TweenConfigDefaults): Tween = js.native
    def StaggerBuilder(value: js.Array[Double]): js.Function = js.native
    def StaggerBuilder(value: js.Array[Double], config: StaggerConfig): js.Function = js.native
    /**
      * Creates a Stagger function to be used by a Tween property.
      * 
      * The stagger function will allow you to stagger changes to the value of the property across all targets of the tween.
      * 
      * This is only worth using if the tween has multiple targets.
      * 
      * The following will stagger the delay by 100ms across all targets of the tween, causing them to scale down to 0.2
      * over the duration specified:
      * 
      * ```javascript
      * this.tweens.add({
      *     targets: [ ... ],
      *     scale: 0.2,
      *     ease: 'linear',
      *     duration: 1000,
      *     delay: this.tweens.stagger(100)
      * });
      * ```
      * 
      * The following will stagger the delay by 500ms across all targets of the tween using a 10 x 6 grid, staggering
      * from the center out, using a cubic ease.
      * 
      * ```javascript
      * this.tweens.add({
      *     targets: [ ... ],
      *     scale: 0.2,
      *     ease: 'linear',
      *     duration: 1000,
      *     delay: this.tweens.stagger(500, { grid: [ 10, 6 ], from: 'center', ease: 'cubic.out' })
      * });
      * ```
      * @param value The amount to stagger by, or an array containing two elements representing the min and max values to stagger between.
      * @param config A Stagger Configuration object.
      */
    def StaggerBuilder(value: Double): js.Function = js.native
    def StaggerBuilder(value: Double, config: StaggerConfig): js.Function = js.native
    /**
      * Builds a Timeline of Tweens based on a configuration object.
      * @param manager The Tween Manager to which the Timeline will belong.
      * @param config The configuration object for the Timeline.
      */
    def TimelineBuilder(manager: TweenManager, config: TimelineBuilderConfig): Timeline = js.native
    def TweenBuilder(parent: Timeline, config: js.Object, defaults: TweenConfigDefaults): Tween = js.native
    def TweenBuilder(parent: Timeline, config: TweenBuilderConfig, defaults: TweenConfigDefaults): Tween = js.native
    def TweenBuilder(parent: TweenManager, config: js.Object, defaults: TweenConfigDefaults): Tween = js.native
    /**
      * Creates a new Tween.
      * @param parent The owner of the new Tween.
      * @param config Configuration for the new Tween.
      * @param defaults Tween configuration defaults.
      */
    def TweenBuilder(parent: TweenManager, config: TweenBuilderConfig, defaults: TweenConfigDefaults): Tween = js.native
  }
  
  @js.native
  object Events extends js.Object {
    /**
      * The Timeline Complete Event.
      * 
      * This event is dispatched by a Tween Timeline when it completes playback.
      * 
      * Listen to it from a Timeline instance using `Timeline.on('complete', listener)`, i.e.:
      * 
      * ```javascript
      * var timeline = this.tweens.timeline({
      *     targets: image,
      *     ease: 'Power1',
      *     duration: 3000,
      *     tweens: [ { x: 600 }, { y: 500 }, { x: 100 }, { y: 100 } ]
      * });
      * timeline.on('complete', listener);
      * timeline.play();
      * ```
      */
    val TIMELINE_COMPLETE: js.Any = js.native
    /**
      * The Timeline Loop Event.
      * 
      * This event is dispatched by a Tween Timeline every time it loops.
      * 
      * Listen to it from a Timeline instance using `Timeline.on('loop', listener)`, i.e.:
      * 
      * ```javascript
      * var timeline = this.tweens.timeline({
      *     targets: image,
      *     ease: 'Power1',
      *     duration: 3000,
      *     loop: 4,
      *     tweens: [ { x: 600 }, { y: 500 }, { x: 100 }, { y: 100 } ]
      * });
      * timeline.on('loop', listener);
      * timeline.play();
      * ```
      */
    val TIMELINE_LOOP: js.Any = js.native
    /**
      * The Timeline Pause Event.
      * 
      * This event is dispatched by a Tween Timeline when it is paused.
      * 
      * Listen to it from a Timeline instance using `Timeline.on('pause', listener)`, i.e.:
      * 
      * ```javascript
      * var timeline = this.tweens.timeline({
      *     targets: image,
      *     ease: 'Power1',
      *     duration: 3000,
      *     tweens: [ { x: 600 }, { y: 500 }, { x: 100 }, { y: 100 } ]
      * });
      * timeline.on('pause', listener);
      * // At some point later ...
      * timeline.pause();
      * ```
      */
    val TIMELINE_PAUSE: js.Any = js.native
    /**
      * The Timeline Resume Event.
      * 
      * This event is dispatched by a Tween Timeline when it is resumed from a paused state.
      * 
      * Listen to it from a Timeline instance using `Timeline.on('resume', listener)`, i.e.:
      * 
      * ```javascript
      * var timeline = this.tweens.timeline({
      *     targets: image,
      *     ease: 'Power1',
      *     duration: 3000,
      *     tweens: [ { x: 600 }, { y: 500 }, { x: 100 }, { y: 100 } ]
      * });
      * timeline.on('resume', listener);
      * // At some point later ...
      * timeline.resume();
      * ```
      */
    val TIMELINE_RESUME: js.Any = js.native
    /**
      * The Timeline Start Event.
      * 
      * This event is dispatched by a Tween Timeline when it starts.
      * 
      * Listen to it from a Timeline instance using `Timeline.on('start', listener)`, i.e.:
      * 
      * ```javascript
      * var timeline = this.tweens.timeline({
      *     targets: image,
      *     ease: 'Power1',
      *     duration: 3000,
      *     tweens: [ { x: 600 }, { y: 500 }, { x: 100 }, { y: 100 } ]
      * });
      * timeline.on('start', listener);
      * timeline.play();
      * ```
      */
    val TIMELINE_START: js.Any = js.native
    /**
      * The Timeline Update Event.
      * 
      * This event is dispatched by a Tween Timeline every time it updates, which can happen a lot of times per second,
      * so be careful about listening to this event unless you absolutely require it.
      * 
      * Listen to it from a Timeline instance using `Timeline.on('update', listener)`, i.e.:
      * 
      * ```javascript
      * var timeline = this.tweens.timeline({
      *     targets: image,
      *     ease: 'Power1',
      *     duration: 3000,
      *     tweens: [ { x: 600 }, { y: 500 }, { x: 100 }, { y: 100 } ]
      * });
      * timeline.on('update', listener);
      * timeline.play();
      * ```
      */
    val TIMELINE_UPDATE: js.Any = js.native
    /**
      * The Tween Active Event.
      * 
      * This event is dispatched by a Tween when it becomes active within the Tween Manager.
      * 
      * An 'active' Tween is one that is now progressing, although it may not yet be updating
      * any target properties, due to settings such as `delay`. If you need an event for when
      * the Tween starts actually updating its first property, see `TWEEN_START`.
      * 
      * Listen to it from a Tween instance using `Tween.on('active', listener)`, i.e.:
      * 
      * ```javascript
      * var tween = this.tweens.add({
      *     targets: image,
      *     x: 500,
      *     ease: 'Power1',
      *     duration: 3000
      * });
      * tween.on('active', listener);
      * ```
      */
    val TWEEN_ACTIVE: js.Any = js.native
    /**
      * The Tween Complete Event.
      * 
      * This event is dispatched by a Tween when it completes playback entirely, factoring in repeats and loops.
      * 
      * If the Tween has been set to loop or repeat infinitely, this event will not be dispatched
      * unless the `Tween.stop` method is called.
      * 
      * If a Tween has a `completeDelay` set, this event will fire after that delay expires.
      * 
      * Listen to it from a Tween instance using `Tween.on('complete', listener)`, i.e.:
      * 
      * ```javascript
      * var tween = this.tweens.add({
      *     targets: image,
      *     x: 500,
      *     ease: 'Power1',
      *     duration: 3000
      * });
      * tween.on('complete', listener);
      * ```
      */
    val TWEEN_COMPLETE: js.Any = js.native
    /**
      * The Tween Loop Event.
      * 
      * This event is dispatched by a Tween when it loops.
      * 
      * This event will only be dispatched if the Tween has a loop count set.
      * 
      * If a Tween has a `loopDelay` set, this event will fire after that delay expires.
      * 
      * The difference between `loop` and `repeat` is that `repeat` is a property setting,
      * where-as `loop` applies to the entire Tween.
      * 
      * Listen to it from a Tween instance using `Tween.on('loop', listener)`, i.e.:
      * 
      * ```javascript
      * var tween = this.tweens.add({
      *     targets: image,
      *     x: 500,
      *     ease: 'Power1',
      *     duration: 3000,
      *     loop: 6
      * });
      * tween.on('loop', listener);
      * ```
      */
    val TWEEN_LOOP: js.Any = js.native
    /**
      * The Tween Repeat Event.
      * 
      * This event is dispatched by a Tween when one of the properties it is tweening repeats.
      * 
      * This event will only be dispatched if the Tween has a property with a repeat count set.
      * 
      * If a Tween has a `repeatDelay` set, this event will fire after that delay expires.
      * 
      * The difference between `loop` and `repeat` is that `repeat` is a property setting,
      * where-as `loop` applies to the entire Tween.
      * 
      * Listen to it from a Tween instance using `Tween.on('repeat', listener)`, i.e.:
      * 
      * ```javascript
      * var tween = this.tweens.add({
      *     targets: image,
      *     x: 500,
      *     ease: 'Power1',
      *     duration: 3000,
      *     repeat: 4
      * });
      * tween.on('repeat', listener);
      * ```
      */
    val TWEEN_REPEAT: js.Any = js.native
    /**
      * The Tween Start Event.
      * 
      * This event is dispatched by a Tween when it starts tweening its first property.
      * 
      * A Tween will only emit this event once, as it can only start once.
      * 
      * If a Tween has a `delay` set, this event will fire after that delay expires.
      * 
      * Listen to it from a Tween instance using `Tween.on('start', listener)`, i.e.:
      * 
      * ```javascript
      * var tween = this.tweens.add({
      *     targets: image,
      *     x: 500,
      *     ease: 'Power1',
      *     duration: 3000
      * });
      * tween.on('start', listener);
      * ```
      */
    val TWEEN_START: js.Any = js.native
    /**
      * The Tween Update Event.
      * 
      * This event is dispatched by a Tween every time it updates _any_ of the properties it is tweening.
      * 
      * A Tween that is changing 3 properties of a target will emit this event 3 times per change, once per property.
      * 
      * **Note:** This is a very high frequency event and may be dispatched multiple times, every single frame.
      * 
      * Listen to it from a Tween instance using `Tween.on('update', listener)`, i.e.:
      * 
      * ```javascript
      * var tween = this.tweens.add({
      *     targets: image,
      *     x: 500,
      *     ease: 'Power1',
      *     duration: 3000,
      * });
      * tween.on('update', listener);
      * ```
      */
    val TWEEN_UPDATE: js.Any = js.native
    /**
      * The Tween Yoyo Event.
      * 
      * This event is dispatched by a Tween whenever a property it is tweening yoyos.
      * 
      * This event will only be dispatched if the Tween has a property with `yoyo` set.
      * 
      * If the Tween has a `hold` value, this event is dispatched when the hold expires.
      * 
      * This event is dispatched for every property, and for every target, that yoyos.
      * For example, if a Tween was updating 2 properties and had 10 targets, this event
      * would be dispatched 20 times (twice per target). So be careful how you use it!
      * 
      * Listen to it from a Tween instance using `Tween.on('yoyo', listener)`, i.e.:
      * 
      * ```javascript
      * var tween = this.tweens.add({
      *     targets: image,
      *     x: 500,
      *     ease: 'Power1',
      *     duration: 3000,
      *     yoyo: true
      * });
      * tween.on('yoyo', listener);
      * ```
      */
    val TWEEN_YOYO: js.Any = js.native
  }
  
}

