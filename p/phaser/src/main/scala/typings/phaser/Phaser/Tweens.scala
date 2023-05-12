package typings.phaser.Phaser

import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.Phaser.Types.Tweens.Event
import typings.phaser.Phaser.Types.Tweens.GetActiveCallback
import typings.phaser.Phaser.Types.Tweens.GetEndCallback
import typings.phaser.Phaser.Types.Tweens.GetStartCallback
import typings.phaser.Phaser.Types.Tweens.NumberTweenBuilderConfig
import typings.phaser.Phaser.Types.Tweens.StaggerConfig
import typings.phaser.Phaser.Types.Tweens.TweenBuilderConfig
import typings.phaser.Phaser.Types.Tweens.TweenCallbackTypes
import typings.phaser.Phaser.Types.Tweens.TweenCallbacks
import typings.phaser.Phaser.Types.Tweens.TweenChainBuilderConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tweens {
  
  @js.native
  sealed trait States extends StObject
  /**
    * Phaser Tween States.
    */
  @JSGlobal("Phaser.Tweens.States")
  @js.native
  object States extends StObject {
    
    /**
      * Tween state. The Tween is active within the Tween Manager. This means it is either playing,
      * or was playing and is currently paused, but in both cases it's still being processed by
      * the Tween Manager, so is considered 'active'.
      */
    @js.native
    sealed trait ACTIVE
      extends StObject
         with States
    
    /**
      * TweenData state.
      */
    @js.native
    sealed trait COMPLETE
      extends StObject
         with States
    
    /**
      * Tween state. The Tween is waiting for a complete delay to elapse.
      */
    @js.native
    sealed trait COMPLETE_DELAY
      extends StObject
         with States
    
    /**
      * TweenData state.
      */
    @js.native
    sealed trait CREATED
      extends StObject
         with States
    
    /**
      * TweenData state.
      */
    @js.native
    sealed trait DELAY
      extends StObject
         with States
    
    /**
      * Tween state. The Tween has been destroyed and can no longer be played by a Tween Manager.
      */
    @js.native
    sealed trait DESTROYED
      extends StObject
         with States
    
    /**
      * Tween state. The Tween has finished playback but was flagged as 'persistent' during creation,
      * so will not be automatically removed by the Tween Manager.
      */
    @js.native
    sealed trait FINISHED
      extends StObject
         with States
    
    /**
      * TweenData state.
      */
    @js.native
    sealed trait HOLD_DELAY
      extends StObject
         with States
    
    /**
      * Tween state. The Tween is waiting for a loop countdown to elapse.
      */
    @js.native
    sealed trait LOOP_DELAY
      extends StObject
         with States
    
    /**
      * A large integer value used for 'infinite' style countdowns.
      * 
      * Similar use-case to Number.MAX_SAFE_INTEGER but we cannot use that because it's not
      * supported on IE.
      */
    @js.native
    sealed trait MAX
      extends StObject
         with States
    
    /**
      * Tween state. The Tween has been created but has not yet been added to the Tween Manager.
      */
    @js.native
    sealed trait PENDING
      extends StObject
         with States
    
    /**
      * Tween state. The Tween has finished playback and is waiting to be removed from the Tween Manager.
      */
    @js.native
    sealed trait PENDING_REMOVE
      extends StObject
         with States
    
    /**
      * TweenData state.
      */
    @js.native
    sealed trait PENDING_RENDER
      extends StObject
         with States
    
    /**
      * TweenData state.
      */
    @js.native
    sealed trait PLAYING_BACKWARD
      extends StObject
         with States
    
    /**
      * TweenData state.
      */
    @js.native
    sealed trait PLAYING_FORWARD
      extends StObject
         with States
    
    /**
      * Tween state. The Tween has been removed from the Tween Manager.
      */
    @js.native
    sealed trait REMOVED
      extends StObject
         with States
    
    /**
      * TweenData state.
      */
    @js.native
    sealed trait REPEAT_DELAY
      extends StObject
         with States
    
    /**
      * Tween state. The Tween is waiting for a starting delay to elapse.
      */
    @js.native
    sealed trait START_DELAY
      extends StObject
         with States
  }
  
  /**
    * As the name implies, this is the base Tween class that both the Tween and TweenChain
    * inherit from. It contains shared properties and methods common to both types of Tween.
    * 
    * Typically you would never instantiate this class directly, although you could certainly
    * use it to create your own variation of Tweens from.
    */
  @js.native
  trait BaseTween
    extends StObject
       with EventEmitter {
    
    /**
      * The scope (or context) in which all of the callbacks are invoked.
      * 
      * This defaults to be this Tween, but you can override this property
      * to set it to whatever object you require.
      */
    var callbackScope: Any = js.native
    
    /**
      * An object containing the different Tween callback functions.
      * 
      * You can either set these in the Tween config, or by calling the `Tween.setCallback` method.
      * 
      * The types available are:
      * 
      * `onActive` - When the Tween is first created it moves to an 'active' state when added to the Tween Manager. 'Active' does not mean 'playing'.
      * `onStart` - When the Tween starts playing after a delayed or paused state. This will happen at the same time as `onActive` if the tween has no delay and isn't paused.
      * `onLoop` - When a Tween loops, if it has been set to do so. This happens _after_ the `loopDelay` expires, if set.
      * `onComplete` - When the Tween finishes playback fully. Never invoked if the Tween is set to repeat infinitely.
      * `onStop` - Invoked only if the `Tween.stop` method is called.
      * `onPause` - Invoked only if the `Tween.pause` method is called. Not invoked if the Tween Manager is paused.
      * `onResume` - Invoked only if the `Tween.resume` method is called. Not invoked if the Tween Manager is resumed.
      * 
      * The following types are also available and are invoked on a `TweenData` level - that is per-object, per-property, being tweened.
      * 
      * `onYoyo` - When a TweenData starts a yoyo. This happens _after_ the `hold` delay expires, if set.
      * `onRepeat` - When a TweenData repeats playback. This happens _after_ the `repeatDelay` expires, if set.
      * `onUpdate` - When a TweenData updates a property on a source target during playback.
      */
    var callbacks: TweenCallbacks = js.native
    
    /**
      * Flags the Tween as being complete, whatever stage of progress it is at.
      * 
      * If an `onComplete` callback has been defined it will automatically invoke it, unless a `delay`
      * argument is provided, in which case the Tween will delay for that period of time before calling the callback.
      * 
      * If you don't need a delay or don't have an `onComplete` callback then call `Tween.stop` instead.
      * @param delay The time to wait before invoking the complete callback. If zero it will fire immediately. Default 0.
      */
    def complete(): this.type = js.native
    def complete(delay: Double): this.type = js.native
    
    /**
      * Flags the Tween as being complete only once the current loop has finished.
      * 
      * This is a useful way to stop an infinitely looping tween once a complete cycle is over,
      * rather than abruptly.
      * 
      * If you don't have a loop then call `Tween.stop` instead.
      * @param loops The number of loops that should finish before this tween completes. Zero means complete just the current loop. Default 0.
      */
    def completeAfterLoop(): this.type = js.native
    def completeAfterLoop(loops: Double): this.type = js.native
    
    /**
      * The time in milliseconds before the 'onComplete' event fires.
      * 
      * This never fires if `loop = -1` as it never completes because it has been
      * set to loop forever.
      */
    var completeDelay: Double = js.native
    
    /**
      * An internal countdown timer (used by loopDelay and completeDelay)
      */
    var countdown: Double = js.native
    
    /**
      * The main data array. For a Tween, this contains all of the `TweenData` objects, each
      * containing a unique property and target that is being tweened.
      * 
      * For a TweenChain, this contains an array of `Tween` instances, which are being played
      * through in sequence.
      */
    var data: js.Array[Tween | TweenData] = js.native
    
    /**
      * Gets the value of the time scale applied to this Tween. A value of 1 runs in real-time.
      * A value of 0.5 runs 50% slower, and so on.
      */
    def getTimeScale(): Double = js.native
    
    /**
      * Has this Tween started playback yet?
      * 
      * This boolean is toggled when the Tween leaves the 'start delayed' state and begins running.
      */
    val hasStarted: Boolean = js.native
    
    /**
      * Returns `true` if this Tween has a _current_ state of ACTIVE, otherwise `false`.
      */
    def isActive(): Boolean = js.native
    
    /**
      * Returns `true` if this Tween has a _current_ state of COMPLETE_DELAY, otherwise `false`.
      */
    def isCompleteDelayed(): Boolean = js.native
    
    /**
      * Returns `true` if this Tween has a _current_ state of DESTROYED, otherwise `false`.
      */
    def isDestroyed(): Boolean = js.native
    
    /**
      * Returns `true` if this Tween has a _current_ state of FINISHED, otherwise `false`.
      */
    def isFinished(): Boolean = js.native
    
    /**
      * Returns `true` if this Tween has a _current_ state of LOOP_DELAY, otherwise `false`.
      */
    def isLoopDelayed(): Boolean = js.native
    
    /**
      * Checks if the Tween is currently paused.
      * 
      * This is the same as inspecting the `BaseTween.paused` property directly.
      */
    def isPaused(): Boolean = js.native
    
    /**
      * Returns `true` if this Tween has a _current_ state of PENDING, otherwise `false`.
      */
    def isPending(): Boolean = js.native
    
    /**
      * Returns `true` if this Tween has a _current_ state of PENDING_REMOVE, otherwise `false`.
      */
    def isPendingRemove(): Boolean = js.native
    
    /**
      * Checks if this Tween is currently playing.
      * 
      * If this Tween is paused, or not active, this method will return false.
      */
    def isPlaying(): Boolean = js.native
    
    /**
      * Returns `true` if this Tween has a _current_ state of REMOVED, otherwise `false`.
      */
    def isRemoved(): Boolean = js.native
    
    /**
      * Returns `true` if this Tween has a _current_ state of START_DELAY, otherwise `false`.
      */
    def isStartDelayed(): Boolean = js.native
    
    /**
      * The number of times this Tween will loop.
      * 
      * Can be -1 for an infinite loop, zero for none, or a positive integer.
      * 
      * Typically this is set in the configuration object, but can also be set directly
      * as long as this Tween is paused and hasn't started playback.
      * 
      * When enabled it will play through ALL Tweens again.
      * 
      * Use TweenData.repeat to loop a single element.
      */
    var loop: Double = js.native
    
    /**
      * Internal counter recording how many loops are left to run.
      */
    var loopCounter: Double = js.native
    
    /**
      * The time in milliseconds before the Tween loops.
      * 
      * Only used if `loop` is > 0.
      */
    var loopDelay: Double = js.native
    
    /**
      * Internal method that makes this Tween active within the TweenManager
      * and emits the onActive event and callback.
      */
    def makeActive(): Unit = js.native
    
    /**
      * Internal method that handles this tween completing and emitting the onComplete event
      * and callback.
      */
    def onCompleteHandler(): Unit = js.native
    
    /**
      * A reference to the Tween Manager, or Tween Chain, that owns this Tween.
      */
    var parent: TweenManager | TweenChain = js.native
    
    /**
      * Pauses the Tween immediately. Use `resume` to continue playback.
      * 
      * You can also toggle the `Tween.paused` boolean property, but doing so will not trigger the PAUSE event.
      */
    def pause(): this.type = js.native
    
    /**
      * Is the Tween currently paused?
      * 
      * A paused Tween needs to be started with the `play` method, or resumed with the `resume` method.
      * 
      * This property can be toggled at runtime if required.
      */
    var paused: Boolean = js.native
    
    /**
      * Will this Tween persist after playback? A Tween that persists will _not_ be destroyed by the
      * Tween Manager, or when calling `Tween.stop`, and can be re-played as required. You can either
      * set this property when creating the tween in the tween config, or set it _prior_ to playback.
      * 
      * However, it's up to you to ensure you destroy persistent tweens when you are finished with them,
      * or they will retain references you may no longer require and waste memory.
      * 
      * By default, `Tweens` are set to _not_ persist, so they are automatically cleaned-up by
      * the Tween Manager. But `TweenChains` _do_ persist by default, unless overridden in their
      * config. This is because the type of situations you use a chain for is far more likely to
      * need to be replayed again in the future, rather than disposed of.
      */
    var persist: Boolean = js.native
    
    /**
      * Immediately removes this Tween from the TweenManager and all of its internal arrays,
      * no matter what stage it is at. Then sets the tween state to `REMOVED`.
      * 
      * You should dispose of your reference to this tween after calling this method, to
      * free it from memory. If you no longer require it, call `Tween.destroy()` on it.
      */
    def remove(): this.type = js.native
    
    /**
      * Resumes the playback of a previously paused Tween.
      * 
      * You can also toggle the `Tween.paused` boolean property, but doing so will not trigger the RESUME event.
      */
    def resume(): this.type = js.native
    
    /**
      * Sets this Tween state to ACTIVE.
      */
    def setActiveState(): Unit = js.native
    
    /**
      * Sets an event based callback to be invoked during playback.
      * 
      * Calling this method will replace a previously set callback for the given type, if any exists.
      * 
      * The types available are:
      * 
      * `onActive` - When the Tween is first created it moves to an 'active' state when added to the Tween Manager. 'Active' does not mean 'playing'.
      * `onStart` - When the Tween starts playing after a delayed or paused state. This will happen at the same time as `onActive` if the tween has no delay and isn't paused.
      * `onLoop` - When a Tween loops, if it has been set to do so. This happens _after_ the `loopDelay` expires, if set.
      * `onComplete` - When the Tween finishes playback fully. Never invoked if the Tween is set to repeat infinitely.
      * `onStop` - Invoked only if the `Tween.stop` method is called.
      * `onPause` - Invoked only if the `Tween.pause` method is called. Not invoked if the Tween Manager is paused.
      * `onResume` - Invoked only if the `Tween.resume` method is called. Not invoked if the Tween Manager is resumed.
      * 
      * The following types are also available and are invoked on a `TweenData` level - that is per-object, per-property, being tweened.
      * 
      * `onYoyo` - When a TweenData starts a yoyo. This happens _after_ the `hold` delay expires, if set.
      * `onRepeat` - When a TweenData repeats playback. This happens _after_ the `repeatDelay` expires, if set.
      * `onUpdate` - When a TweenData updates a property on a source target during playback.
      * @param type The type of callback to set. One of: `onActive`, `onComplete`, `onLoop`, `onPause`, `onRepeat`, `onResume`, `onStart`, `onStop`, `onUpdate` or `onYoyo`.
      * @param callback Your callback that will be invoked.
      * @param params The parameters to pass to the callback. Pass an empty array if you don't want to define any, but do wish to set the scope.
      */
    def setCallback(`type`: TweenCallbackTypes, callback: js.Function): this.type = js.native
    def setCallback(`type`: TweenCallbackTypes, callback: js.Function, params: js.Array[Any]): this.type = js.native
    
    /**
      * Sets this Tween state to COMPLETE_DELAY.
      */
    def setCompleteDelayState(): Unit = js.native
    
    /**
      * Sets this Tween state to DESTROYED.
      */
    def setDestroyedState(): Unit = js.native
    
    /**
      * Sets this Tween state to FINISHED.
      */
    def setFinishedState(): Unit = js.native
    
    /**
      * Sets this Tween state to LOOP_DELAY.
      */
    def setLoopDelayState(): Unit = js.native
    
    /**
      * Sets this Tween state to PENDING_REMOVE.
      */
    def setPendingRemoveState(): Unit = js.native
    
    /**
      * Sets this Tween state to PENDING.
      */
    def setPendingState(): Unit = js.native
    
    /**
      * Sets this Tween state to REMOVED.
      */
    def setRemovedState(): Unit = js.native
    
    /**
      * Sets this Tween state to START_DELAY.
      */
    def setStartDelayState(): Unit = js.native
    
    /**
      * Sets the value of the time scale applied to this Tween. A value of 1 runs in real-time.
      * A value of 0.5 runs 50% slower, and so on.
      * 
      * The value isn't used when calculating total duration of the tween, it's a run-time delta adjustment only.
      * 
      * This value is multiplied by the `TweenManager.timeScale`.
      * @param value The time scale value to set.
      */
    def setTimeScale(value: Double): this.type = js.native
    
    /**
      * The time in milliseconds before the 'onStart' event fires.
      * 
      * For a Tween, this is the shortest `delay` value across all of the TweenDatas it owns.
      * For a TweenChain, it is whatever delay value was given in the configuration.
      */
    var startDelay: Double = js.native
    
    /**
      * The current state of the Tween.
      */
    var state: StateType = js.native
    
    /**
      * Stops the Tween immediately, whatever stage of progress it is at.
      * 
      * If not a part of a Tween Chain it is also flagged for removal by the Tween Manager.
      * 
      * If an `onStop` callback has been defined it will automatically invoke it.
      * 
      * The Tween will be removed during the next game frame, but should be considered 'destroyed' from this point on.
      * 
      * Typically, you cannot play a Tween that has been stopped. If you just wish to pause the tween, not destroy it,
      * then call the `pause` method instead and use `resume` to continue playback. If you wish to restart the Tween,
      * use the `restart` or `seek` methods.
      */
    def stop(): this.type = js.native
    
    /**
      * Scales the time applied to this Tween. A value of 1 runs in real-time. A value of 0.5 runs 50% slower, and so on.
      * 
      * The value isn't used when calculating total duration of the tween, it's a run-time delta adjustment only.
      * 
      * This value is multiplied by the `TweenManager.timeScale`.
      */
    var timeScale: Double = js.native
    
    /**
      * The cached size of the data array.
      */
    var totalData: Double = js.native
    
    /**
      * Internal method that handles the processing of the complete delay countdown timer and
      * the dispatch of related events. Called automatically by `Tween.update`.
      * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
      */
    def updateCompleteDelay(delta: Double): Unit = js.native
    
    /**
      * Internal method that handles the processing of the loop delay countdown timer and
      * the dispatch of related events. Called automatically by `Tween.update`.
      * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
      */
    def updateLoopCountdown(delta: Double): Unit = js.native
    
    /**
      * Internal method that handles the processing of the start delay countdown timer and
      * the dispatch of related events. Called automatically by `Tween.update`.
      * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
      */
    def updateStartCountdown(delta: Double): Unit = js.native
  }
  
  /**
    * BaseTweenData is the class that the TweenData and TweenFrameData classes
    * extend from. You should not typically instantiate this class directly, but instead
    * use it to form your own tween data classes from, should you require it.
    * 
    * Prior to Phaser 3.60 the TweenData was just an object, but was refactored to a class,
    * to make it responsible for its own state and updating.
    */
  @js.native
  trait BaseTweenData extends StObject {
    
    /**
      * The time, in milliseconds, before this tween will start playing.
      * 
      * This value is generated by the `getDelay` function.
      */
    var delay: Double = js.native
    
    /**
      * Immediately destroys this TweenData, nulling of all its references.
      */
    def destroy(): Unit = js.native
    
    /**
      * The duration of the tween in milliseconds, excluding any time required
      * for yoyo or repeats.
      */
    var duration: Double = js.native
    
    /**
      * The amount of time, in milliseconds, that has elapsed since this
      * TweenData was made active.
      */
    var elapsed: Double = js.native
    
    /**
      * If `true` this Tween will call `toggleFlipX` on the Tween target
      * whenever it yoyo's or repeats. It will only be called if the target
      * has a function matching this name, like most Phaser GameObjects do.
      */
    var flipX: Boolean = js.native
    
    /**
      * If `true` this Tween will call `toggleFlipY` on the Tween target
      * whenever it yoyo's or repeats. It will only be called if the target
      * has a function matching this name, like most Phaser GameObjects do.
      */
    var flipY: Boolean = js.native
    
    /**
      * This function returns the value to be used for `TweenData.delay`.
      */
    var getDelay: js.Function = js.native
    
    /**
      * Returns a reference to the target object belonging to this TweenData.
      */
    def getTarget(): js.Object = js.native
    
    /**
      * The time, in milliseconds, before this tween will start a yoyo to repeat.
      */
    var hold: Double = js.native
    
    /**
      * Returns `true` if this TweenData has a _current_ state of COMPLETE, otherwise `false`.
      */
    def isComplete(): Boolean = js.native
    
    /**
      * Is this Tween Data currently waiting for a countdown to elapse, or not?
      */
    var isCountdown: Boolean = js.native
    
    /**
      * Returns `true` if this TweenData has a _current_ state of CREATED, otherwise `false`.
      */
    def isCreated(): Boolean = js.native
    
    /**
      * Returns `true` if this TweenData has a _current_ state of DELAY, otherwise `false`.
      */
    def isDelayed(): Boolean = js.native
    
    /**
      * Returns `true` if this TweenData has a _current_ state of HOLD_DELAY, otherwise `false`.
      */
    def isHolding(): Boolean = js.native
    
    /**
      * Returns `true` if this TweenData has a _current_ state of PENDING_RENDER, otherwise `false`.
      */
    def isPendingRender(): Boolean = js.native
    
    /**
      * Returns `true` if this TweenData has a _current_ state of PLAYING_BACKWARD, otherwise `false`.
      */
    def isPlayingBackward(): Boolean = js.native
    
    /**
      * Returns `true` if this TweenData has a _current_ state of PLAYING_FORWARD, otherwise `false`.
      */
    def isPlayingForward(): Boolean = js.native
    
    /**
      * Returns `true` if this TweenData has a _current_ state of REPEAT_DELAY, otherwise `false`.
      */
    def isRepeating(): Boolean = js.native
    
    /**
      * Internal method that handles repeating or yoyo'ing this TweenData.
      * 
      * Called automatically by `setStateFromStart` and `setStateFromEnd`.
      * @param diff Any extra time that needs to be accounted for in the elapsed and progress values.
      * @param setStart Set the TweenData start values?
      * @param isYoyo Is this call a Yoyo check?
      */
    def onRepeat(diff: Double, setStart: Boolean, isYoyo: Boolean): Unit = js.native
    
    /**
      * A value between 0 and 1 holding the progress of this TweenData.
      */
    var progress: Double = js.native
    
    /**
      * The number of times this tween will repeat.
      * 
      * The tween will always run once regardless of this value,
      * so a repeat value of '1' will play the tween twice: I.e. the original
      * play-through and then it repeats that once (1).
      * 
      * If this value is set to -1 this tween will repeat forever.
      */
    var repeat: Double = js.native
    
    /**
      * How many repeats are left to run?
      */
    var repeatCounter: Double = js.native
    
    /**
      * The time, in milliseconds, before the repeat will start.
      */
    var repeatDelay: Double = js.native
    
    /**
      * Internal method that resets this Tween Data entirely, including the progress and elapsed values.
      * 
      * Called automatically by the parent Tween. Should not be called directly.
      */
    def reset(): Unit = js.native
    
    /**
      * Sets this TweenData state to COMPLETE.
      */
    def setCompleteState(): Unit = js.native
    
    /**
      * Sets this TweenData state to CREATED.
      */
    def setCreatedState(): Unit = js.native
    
    /**
      * Sets this TweenData state to DELAY.
      */
    def setDelayState(): Unit = js.native
    
    /**
      * Sets this TweenData state to HOLD_DELAY.
      */
    def setHoldState(): Unit = js.native
    
    /**
      * Sets this TweenData state to PENDING_RENDER.
      */
    def setPendingRenderState(): Unit = js.native
    
    /**
      * Sets this TweenData state to PLAYING_BACKWARD.
      */
    def setPlayingBackwardState(): Unit = js.native
    
    /**
      * Sets this TweenData state to PLAYING_FORWARD.
      */
    def setPlayingForwardState(): Unit = js.native
    
    /**
      * Sets this TweenData state to REPEAT_DELAY.
      */
    def setRepeatState(): Unit = js.native
    
    /**
      * Internal method used as part of the playback process that checks if this
      * TweenData should yoyo, repeat, or has completed.
      * @param diff Any extra time that needs to be accounted for in the elapsed and progress values.
      */
    def setStateFromEnd(diff: Double): Unit = js.native
    
    /**
      * Internal method used as part of the playback process that checks if this
      * TweenData should repeat or has completed.
      * @param diff Any extra time that needs to be accounted for in the elapsed and progress values.
      */
    def setStateFromStart(diff: Double): Unit = js.native
    
    /**
      * Sets this TweenData's target object property to be the given value.
      * @param value The value to set on the target. If not given, sets it to the last `current` value.
      */
    def setTargetValue(): Unit = js.native
    def setTargetValue(value: Double): Unit = js.native
    
    /**
      * The state of this TweenData.
      */
    var state: StateType = js.native
    
    /**
      * The index of the target within the Tween `targets` array.
      */
    var targetIndex: Double = js.native
    
    /**
      * The total calculated duration, in milliseconds, of this TweenData.
      * Factoring in the duration, repeats, delays and yoyos.
      */
    var totalDuration: Double = js.native
    
    /**
      * A reference to the Tween that this TweenData instance belongs to.
      */
    var tween: Tween = js.native
    
    /**
      * Will the Tween ease back to its starting values, after reaching the end
      * and any `hold` value that may be set?
      */
    var yoyo: Boolean = js.native
  }
  
  /**
    * Phaser Tween state constants.
    */
  type StateType = States
  
  /**
    * A Tween is able to manipulate the properties of one or more objects to any given value, based
    * on a duration and type of ease. They are rarely instantiated directly and instead should be
    * created via the TweenManager.
    * 
    * Please note that a Tween will not manipulate any property that begins with an underscore.
    */
  @js.native
  trait Tween
    extends StObject
       with BaseTween {
    
    def add(
      targetIndex: Double,
      key: String,
      getEnd: GetEndCallback,
      getStart: GetStartCallback,
      getActive: Unit,
      ease: js.Function,
      delay: js.Function,
      duration: Double,
      yoyo: Boolean,
      hold: Double,
      repeat: Double,
      repeatDelay: Double,
      flipX: Boolean,
      flipY: Boolean
    ): TweenData = js.native
    def add(
      targetIndex: Double,
      key: String,
      getEnd: GetEndCallback,
      getStart: GetStartCallback,
      getActive: Unit,
      ease: js.Function,
      delay: js.Function,
      duration: Double,
      yoyo: Boolean,
      hold: Double,
      repeat: Double,
      repeatDelay: Double,
      flipX: Boolean,
      flipY: Boolean,
      interpolation: js.Function
    ): TweenData = js.native
    def add(
      targetIndex: Double,
      key: String,
      getEnd: GetEndCallback,
      getStart: GetStartCallback,
      getActive: Unit,
      ease: js.Function,
      delay: js.Function,
      duration: Double,
      yoyo: Boolean,
      hold: Double,
      repeat: Double,
      repeatDelay: Double,
      flipX: Boolean,
      flipY: Boolean,
      interpolation: js.Function,
      interpolationData: js.Array[Double]
    ): TweenData = js.native
    def add(
      targetIndex: Double,
      key: String,
      getEnd: GetEndCallback,
      getStart: GetStartCallback,
      getActive: Unit,
      ease: js.Function,
      delay: js.Function,
      duration: Double,
      yoyo: Boolean,
      hold: Double,
      repeat: Double,
      repeatDelay: Double,
      flipX: Boolean,
      flipY: Boolean,
      interpolation: Unit,
      interpolationData: js.Array[Double]
    ): TweenData = js.native
    /**
      * Adds a new TweenData to this Tween. Typically, this method is called
      * automatically by the TweenBuilder, however you can also invoke it
      * yourself.
      * @param targetIndex The target index within the Tween targets array.
      * @param key The property of the target to tween.
      * @param getEnd What the property will be at the END of the Tween.
      * @param getStart What the property will be at the START of the Tween.
      * @param getActive If not null, is invoked _immediately_ as soon as the TweenData is running, and is set on the target property.
      * @param ease The ease function this tween uses.
      * @param delay Function that returns the time in milliseconds before tween will start.
      * @param duration The duration of the tween in milliseconds.
      * @param yoyo Determines whether the tween should return back to its start value after hold has expired.
      * @param hold Function that returns the time in milliseconds the tween will pause before repeating or returning to its starting value if yoyo is set to true.
      * @param repeat Function that returns the number of times to repeat the tween. The tween will always run once regardless, so a repeat value of '1' will play the tween twice.
      * @param repeatDelay Function that returns the time in milliseconds before the repeat will start.
      * @param flipX Should toggleFlipX be called when yoyo or repeat happens?
      * @param flipY Should toggleFlipY be called when yoyo or repeat happens?
      * @param interpolation The interpolation function to be used for arrays of data. Defaults to 'null'.
      * @param interpolationData The array of interpolation data to be set. Defaults to 'null'.
      */
    def add(
      targetIndex: Double,
      key: String,
      getEnd: GetEndCallback,
      getStart: GetStartCallback,
      getActive: GetActiveCallback,
      ease: js.Function,
      delay: js.Function,
      duration: Double,
      yoyo: Boolean,
      hold: Double,
      repeat: Double,
      repeatDelay: Double,
      flipX: Boolean,
      flipY: Boolean
    ): TweenData = js.native
    def add(
      targetIndex: Double,
      key: String,
      getEnd: GetEndCallback,
      getStart: GetStartCallback,
      getActive: GetActiveCallback,
      ease: js.Function,
      delay: js.Function,
      duration: Double,
      yoyo: Boolean,
      hold: Double,
      repeat: Double,
      repeatDelay: Double,
      flipX: Boolean,
      flipY: Boolean,
      interpolation: js.Function
    ): TweenData = js.native
    def add(
      targetIndex: Double,
      key: String,
      getEnd: GetEndCallback,
      getStart: GetStartCallback,
      getActive: GetActiveCallback,
      ease: js.Function,
      delay: js.Function,
      duration: Double,
      yoyo: Boolean,
      hold: Double,
      repeat: Double,
      repeatDelay: Double,
      flipX: Boolean,
      flipY: Boolean,
      interpolation: js.Function,
      interpolationData: js.Array[Double]
    ): TweenData = js.native
    def add(
      targetIndex: Double,
      key: String,
      getEnd: GetEndCallback,
      getStart: GetStartCallback,
      getActive: GetActiveCallback,
      ease: js.Function,
      delay: js.Function,
      duration: Double,
      yoyo: Boolean,
      hold: Double,
      repeat: Double,
      repeatDelay: Double,
      flipX: Boolean,
      flipY: Boolean,
      interpolation: Unit,
      interpolationData: js.Array[Double]
    ): TweenData = js.native
    
    /**
      * Adds a new TweenFrameData to this Tween. Typically, this method is called
      * automatically by the TweenBuilder, however you can also invoke it
      * yourself.
      * @param targetIndex The target index within the Tween targets array.
      * @param texture The texture to set on the target at the end of the tween.
      * @param frame The texture frame to set on the target at the end of the tween.
      * @param delay Function that returns the time in milliseconds before tween will start.
      * @param duration The duration of the tween in milliseconds.
      * @param hold Function that returns the time in milliseconds the tween will pause before repeating or returning to its starting value if yoyo is set to true.
      * @param repeat Function that returns the number of times to repeat the tween. The tween will always run once regardless, so a repeat value of '1' will play the tween twice.
      * @param repeatDelay Function that returns the time in milliseconds before the repeat will start.
      * @param flipX Should toggleFlipX be called when yoyo or repeat happens?
      * @param flipY Should toggleFlipY be called when yoyo or repeat happens?
      */
    def addFrame(
      targetIndex: Double,
      texture: String,
      frame: String,
      delay: js.Function,
      duration: Double,
      hold: Double,
      repeat: Double,
      repeatDelay: Double,
      flipX: Boolean,
      flipY: Boolean
    ): TweenFrameData = js.native
    def addFrame(
      targetIndex: Double,
      texture: String,
      frame: Double,
      delay: js.Function,
      duration: Double,
      hold: Double,
      repeat: Double,
      repeatDelay: Double,
      flipX: Boolean,
      flipY: Boolean
    ): TweenFrameData = js.native
    
    /**
      * Internal method that will emit a Tween based Event and invoke the given callback.
      * @param event The Event to be dispatched.
      * @param callback The name of the callback to be invoked. Can be `null` or `undefined` to skip invocation.
      */
    def dispatchEvent(event: Event): Unit = js.native
    def dispatchEvent(event: Event, callback: TweenCallbackTypes): Unit = js.native
    
    /**
      * Time in milliseconds for the whole Tween to play through once, excluding loop amounts and loop delays.
      * 
      * This value is set in the `Tween.initTweenData` method and is zero before that point.
      */
    var duration: Double = js.native
    
    /**
      * Elapsed time in milliseconds of this run through of the Tween.
      */
    var elapsed: Double = js.native
    
    /**
      * Moves this Tween forward by the given amount of milliseconds.
      * 
      * It will only advance through the current loop of the Tween. For example, if the
      * Tween is set to repeat or yoyo, it can only fast forward through a single
      * section of the sequence. Use `Tween.seek` for more complex playhead control.
      * 
      * If the Tween is paused or has already finished, calling this will have no effect.
      * @param ms The number of milliseconds to advance this Tween by.
      */
    def forward(ms: Double): this.type = js.native
    
    /**
      * Returns the current value of the specified Tween Data.
      * 
      * If this Tween has been destroyed, it will return `null`.
      * @param index The Tween Data to return the value from. Default 0.
      */
    def getValue(): Double = js.native
    def getValue(index: Double): Double = js.native
    
    /**
      * See if this Tween is currently acting upon the given target.
      * @param target The target to check against this Tween.
      */
    def hasTarget(target: js.Object): Boolean = js.native
    
    /**
      * Initialises all of the Tween Data and Tween values.
      * 
      * This is called automatically and should not typically be invoked directly.
      * @param isSeeking Is the Tween Data being reset as part of a seek? Default false.
      */
    def initTweenData(): Unit = js.native
    def initTweenData(isSeeking: Boolean): Unit = js.native
    
    /**
      * Does this Tween loop or repeat infinitely?
      */
    val isInfinite: Boolean = js.native
    
    /**
      * Is this Tween currently seeking?
      * 
      * This boolean is toggled in the `Tween.seek` method.
      * 
      * When a tween is seeking, by default it will not dispatch any events or callbacks.
      */
    val isSeeking: Boolean = js.native
    
    /**
      * Internal method that advances to the next state of the Tween during playback.
      */
    def nextState(): Boolean = js.native
    
    /**
      * Starts a Tween playing.
      * 
      * You only need to call this method if you have configured the tween to be paused on creation.
      * 
      * If the Tween is already playing, calling this method again will have no effect. If you wish to
      * restart the Tween, use `Tween.restart` instead.
      * 
      * Calling this method after the Tween has completed will start the Tween playing again from the beginning.
      * This is the same as calling `Tween.seek(0)` and then `Tween.play()`.
      */
    def play(): this.type = js.native
    
    /**
      * Value between 0 and 1. The amount of progress through the Tween, excluding loops.
      */
    var progress: Double = js.native
    
    /**
      * Resets this Tween ready for another play-through.
      * 
      * This is called automatically from the Tween Manager, or from the parent TweenChain,
      * and should not typically be invoked directly.
      * 
      * If you wish to restart this Tween, use the `Tween.restart` or `Tween.seek` methods instead.
      * @param skipInit Skip resetting the TweenData and Active State? Default false.
      */
    def reset(): this.type = js.native
    def reset(skipInit: Boolean): this.type = js.native
    
    /**
      * Restarts the Tween from the beginning.
      * 
      * If the Tween has already finished and been destroyed, restarting it will throw an error.
      * 
      * If you wish to restart the Tween from a specific point, use the `Tween.seek` method instead.
      */
    def restart(): this.type = js.native
    
    /**
      * Moves this Tween backward by the given amount of milliseconds.
      * 
      * It will only rewind through the current loop of the Tween. For example, if the
      * Tween is set to repeat or yoyo, it can only fast forward through a single
      * section of the sequence. Use `Tween.seek` for more complex playhead control.
      * 
      * If the Tween is paused or has already finished, calling this will have no effect.
      * @param ms The number of milliseconds to rewind this Tween by.
      */
    def rewind(ms: Double): this.type = js.native
    
    /**
      * Seeks to a specific point in the Tween.
      * 
      * The given amount is a value in milliseconds that represents how far into the Tween
      * you wish to seek, based on the start of the Tween.
      * 
      * Note that the seek amount takes the entire duration of the Tween into account, including delays, loops and repeats.
      * For example, a Tween that lasts for 2 seconds, but that loops 3 times, would have a total duration of 6 seconds,
      * so seeking to 3000 ms would seek to the Tweens half-way point based on its _entire_ duration.
      * 
      * Prior to Phaser 3.60 this value was given as a number between 0 and 1 and didn't
      * work for Tweens had an infinite repeat. This new method works for all Tweens.
      * 
      * Seeking works by resetting the Tween to its initial values and then iterating through the Tween at `delta`
      * jumps per step. The longer the Tween, the longer this can take. If you need more precision you can
      * reduce the delta value. If you need a faster seek, you can increase it. When the Tween is
      * reset it will refresh the starting and ending values. If these are coming from a dynamic function,
      * or a random array, it will be called for each seek.
      * 
      * While seeking the Tween will _not_ emit any of its events or callbacks unless
      * the 3rd parameter is set to `true`.
      * 
      * If this Tween is paused, seeking will not change this fact. It will advance the Tween
      * to the desired point and then pause it again.
      * @param amount The number of milliseconds to seek into the Tween from the beginning. Default 0.
      * @param delta The size of each step when seeking through the Tween. A higher value completes faster but at the cost of less precision. Default 16.6.
      * @param emit While seeking, should the Tween emit any of its events or callbacks? The default is 'false', i.e. to seek silently. Default false.
      */
    def seek(): this.type = js.native
    def seek(amount: Double): this.type = js.native
    def seek(amount: Double, delta: Double): this.type = js.native
    def seek(amount: Double, delta: Double, emit: Boolean): this.type = js.native
    def seek(amount: Double, delta: Unit, emit: Boolean): this.type = js.native
    def seek(amount: Unit, delta: Double): this.type = js.native
    def seek(amount: Unit, delta: Double, emit: Boolean): this.type = js.native
    def seek(amount: Unit, delta: Unit, emit: Boolean): this.type = js.native
    
    /**
      * An array of references to the target/s this Tween is operating on.
      * 
      * This array should not be manipulated outside of this Tween.
      */
    var targets: js.Array[js.Object] = js.native
    
    /**
      * Time in milliseconds it takes for the Tween to complete a full playthrough (including looping)
      * 
      * For an infinite Tween, this value is a very large integer.
      */
    var totalDuration: Double = js.native
    
    /**
      * Total elapsed time in milliseconds of the entire Tween, including looping.
      */
    var totalElapsed: Double = js.native
    
    /**
      * The amount of progress that has been made through the entire Tween, including looping.
      * 
      * A value between 0 and 1.
      */
    var totalProgress: Double = js.native
    
    /**
      * Cached target total.
      * 
      * Used internally and should be treated as read-only.
      * 
      * This is not necessarily the same as the data total.
      */
    var totalTargets: Double = js.native
    
    /**
      * Internal method that advances the Tween based on the time values.
      * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
      */
    def update(delta: Double): Boolean = js.native
    
    /**
      * Updates the 'end' value of the given property across all matching targets, as long
      * as this Tween is currently playing (either forwards or backwards).
      * 
      * Calling this does not adjust the duration of the Tween, or the current progress.
      * 
      * You can optionally tell it to set the 'start' value to be the current value.
      * 
      * If this Tween is in any other state other than playing then calling this method has no effect.
      * 
      * Additionally, if the Tween repeats, is reset, or is seeked, it will revert to the original
      * starting and ending values.
      * @param key The property to set the new value for. You cannot update the 'texture' property via this method.
      * @param value The new value of the property.
      * @param startToCurrent Should this change set the start value to be the current value? Default false.
      */
    def updateTo(key: String, value: Double): this.type = js.native
    def updateTo(key: String, value: Double, startToCurrent: Boolean): this.type = js.native
  }
  
  /**
    * A TweenChain is a special type of Tween that allows you to create a sequence of Tweens, chained to one-another,
    * and add them to the Tween Manager.
    * 
    * The tweens are played in order, from start to finish. You can optionally set the chain
    * to repeat as many times as you like. Once the chain has finished playing, or repeating if set,
    * all tweens in the chain will be destroyed automatically. To override this, set the 'persists'
    * argument to 'true'.
    * 
    * Playback will start immediately unless the _first_ Tween has been configured to be paused.
    * 
    * Please note that Tweens will not manipulate any target property that begins with an underscore.
    */
  @js.native
  trait TweenChain
    extends StObject
       with BaseTween {
    
    /**
      * Create a sequence of Tweens, chained to one-another, and add them to this Tween Manager.
      * 
      * The tweens are played in order, from start to finish. You can optionally set the chain
      * to repeat as many times as you like. Once the chain has finished playing, or repeating if set,
      * all tweens in the chain will be destroyed automatically. To override this, set the 'persists'
      * argument to 'true'.
      * 
      * Playback will start immediately unless the _first_ Tween has been configured to be paused.
      * 
      * Please note that Tweens will not manipulate any target property that begins with an underscore.
      * @param tweens An array of Tween configuration objects for the Tweens in this chain.
      */
    def add(tweens: js.Array[js.Object | TweenBuilderConfig]): this.type = js.native
    
    /**
      * A reference to the data array index of the currently playing tween.
      */
    var currentIndex: Double = js.native
    
    /**
      * A reference to the Tween that this TweenChain is currently playing.
      */
    var currentTween: Tween = js.native
    
    /**
      * Internal method that will emit a TweenChain based Event and invoke the given callback.
      * @param event The Event to be dispatched.
      * @param callback The name of the callback to be invoked. Can be `null` or `undefined` to skip invocation.
      */
    def dispatchEvent(event: Event): Unit = js.native
    def dispatchEvent(event: Event, callback: TweenCallbackTypes): Unit = js.native
    
    /**
      * See if any of the tweens in this Tween Chain is currently acting upon the given target.
      * @param target The target to check against this TweenChain.
      */
    def hasTarget(target: js.Object): Boolean = js.native
    
    /**
      * Prepares this TweenChain for playback.
      * 
      * Called automatically by the TweenManager. Should not be called directly.
      */
    def init(): this.type = js.native
    
    /**
      * Internal method that advances to the next state of the TweenChain playback.
      */
    def nextState(): Boolean = js.native
    
    /**
      * Immediately advances to the next Tween in the chain.
      * 
      * This is typically called internally, but can be used if you need to
      * advance playback for some reason.
      */
    def nextTween(): Boolean = js.native
    
    /**
      * Starts this TweenChain playing.
      * 
      * You only need to call this method if you have configured this TweenChain to be paused on creation.
      * 
      * If the TweenChain is already playing, calling this method again will have no effect. If you wish to
      * restart the chain, use `TweenChain.restart` instead.
      * 
      * Calling this method after the TweenChain has completed will start the chain playing again from the beginning.
      */
    def play(): this.type = js.native
    
    /**
      * Resets the given Tween.
      * 
      * It will seek to position 0 and playback will start on the next frame.
      * @param tween The Tween to be reset.
      */
    def reset(tween: Tween): this.type = js.native
    
    /**
      * Internal method that resets all of the Tweens and the current index pointer.
      */
    def resetTweens(): Unit = js.native
    
    /**
      * Restarts the TweenChain from the beginning.
      * 
      * If this TweenChain was configured to have a loop, or start delay, those
      * are reset to their initial values as well. It will also dispatch the
      * `onActive` callback and event again.
      */
    def restart(): this.type = js.native
    
    /**
      * Sets the current active Tween to the given index, based on its
      * entry in the TweenChain data array.
      * @param index The index of the Tween to be made current.
      */
    def setCurrentTween(index: Double): Unit = js.native
    
    /**
      * Internal method that advances the TweenChain based on the time values.
      * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
      */
    def update(delta: Double): Boolean = js.native
  }
  
  /**
    * The TweenData is a class that contains a single target and property that is being tweened.
    * 
    * Tweens create TweenData instances when they are created, with one TweenData instance per
    * target, per property. A Tween can own multiple TweenData instances, but a TweenData only
    * ever belongs to a single Tween.
    * 
    * You should not typically create these yourself, but rather use the TweenBuilder,
    * or the `Tween.add` method.
    * 
    * Prior to Phaser 3.60 the TweenData was just an object, but was refactored to a class,
    * to make it responsible for its own state and updating.
    */
  @js.native
  trait TweenData
    extends StObject
       with BaseTweenData {
    
    /**
      * The targets current value, as recorded in the most recent step.
      */
    var current: Double = js.native
    
    /**
      * Internal method that will emit a TweenData based Event on the
      * parent Tween and also invoke the given callback, if provided.
      * @param event The Event to be dispatched.
      * @param callback The name of the callback to be invoked. Can be `null` or `undefined` to skip invocation.
      */
    def dispatchEvent(event: Event): Unit = js.native
    def dispatchEvent(event: Event, callback: TweenCallbackTypes): Unit = js.native
    
    /**
      * The ease function this Tween uses to calculate the target value.
      */
    var ease: js.Function = js.native
    
    /**
      * The targets ending value, as returned by `getEndValue`.
      */
    var end: Double = js.native
    
    /**
      * A function that returns what to set the target property to,
      * the moment the TweenData is invoked.
      * 
      * This is called when this TweenData is inititalised or reset.
      */
    var getActiveValue: GetActiveCallback | Null = js.native
    
    /**
      * A function that returns what to set the target property to
      * at the end of the tween.
      * 
      * This is called when the tween starts playing, after any initial
      * start delay, or if the tween is reset, or is set to repeat.
      */
    def getEndValue(target: Any, key: String, value: Double, targetIndex: Double, totalTargets: Double, tween: Tween): Double = js.native
    /**
      * A function that returns what to set the target property to
      * at the end of the tween.
      * 
      * This is called when the tween starts playing, after any initial
      * start delay, or if the tween is reset, or is set to repeat.
      */
    @JSName("getEndValue")
    var getEndValue_Original: GetEndCallback = js.native
    
    /**
      * A function that returns what to set the target property to
      * at the start of the tween.
      * 
      * This is called when the tween starts playing, after any initial
      * start delay, or if the tween is reset, or is set to repeat.
      */
    def getStartValue(target: Any, key: String, value: Double, targetIndex: Double, totalTargets: Double, tween: Tween): Double = js.native
    /**
      * A function that returns what to set the target property to
      * at the start of the tween.
      * 
      * This is called when the tween starts playing, after any initial
      * start delay, or if the tween is reset, or is set to repeat.
      */
    @JSName("getStartValue")
    var getStartValue_Original: GetStartCallback = js.native
    
    /**
      * The interpolation function to be used for arrays of data.
      */
    var interpolation: js.Function | Null = js.native
    
    /**
      * The array of data to interpolate, if interpolation is being used.
      */
    var interpolationData: js.Array[Double] | Null = js.native
    
    /**
      * The property of the target to be tweened.
      */
    val key: String = js.native
    
    /**
      * The target value from the previous step.
      */
    var previous: Double = js.native
    
    def reset(isSeeking: Boolean): Unit = js.native
    
    /**
      * The targets starting value, as returned by `getStartValue`.
      */
    var start: Double = js.native
    
    /**
      * Internal method that advances this TweenData based on the delta value given.
      * @param delta The elapsed delta time in ms.
      */
    def update(delta: Double): Boolean = js.native
  }
  
  /**
    * The TweenFrameData is a class that contains a single target that will change the texture frame
    * at the conclusion of the Tween.
    * 
    * TweenFrameData instances are typically created by the TweenBuilder automatically, when it
    * detects the prescence of a 'texture' property as the key being tweened.
    * 
    * A Tween can own multiple TweenFrameData instances, but a TweenFrameData only
    * ever belongs to a single Tween.
    * 
    * You should not typically create these yourself, but rather use the TweenBuilder,
    * or the `Tween.addFrame` method.
    */
  @js.native
  trait TweenFrameData
    extends StObject
       with BaseTweenData {
    
    /**
      * Internal method that will emit a TweenData based Event on the
      * parent Tween and also invoke the given callback, if provided.
      * @param event The Event to be dispatched.
      * @param callback The name of the callback to be invoked. Can be `null` or `undefined` to skip invocation.
      */
    def dispatchEvent(event: Event): Unit = js.native
    def dispatchEvent(event: Event, callback: TweenCallbackTypes): Unit = js.native
    
    /**
      * The frame to be set at the end of the tween.
      */
    var endFrame: String | Double = js.native
    
    /**
      * The texture to be set at the end of the tween.
      */
    var endTexture: String = js.native
    
    /**
      * The property of the target to be tweened.
      * 
      * Always 'texture' for a TweenFrameData object.
      */
    val key: String = js.native
    
    def reset(isSeeking: Boolean): Unit = js.native
    
    /**
      * The frame to be set at the start of the tween.
      */
    var startFrame: String | Double = js.native
    
    /**
      * The texture to be set at the start of the tween.
      */
    var startTexture: String = js.native
    
    /**
      * Internal method that advances this TweenData based on the delta value given.
      * @param delta The elapsed delta time in ms.
      */
    def update(delta: Double): Boolean = js.native
  }
  
  /**
    * The Tween Manager is a default Scene Plugin which controls and updates Tweens.
    * 
    * A tween is a way to alter one or more properties of a target object over a defined period of time.
    * 
    * Tweens are created by calling the `add` method and passing in the configuration object.
    * 
    * ```js
    * const logo = this.add.image(100, 100, 'logo');
    * 
    * this.tweens.add({
    *   targets: logo,
    *   x: 600,
    *   ease: 'Power1',
    *   duration: 2000
    * });
    * ```
    * 
    * See the `TweenBuilderConfig` for all of the options you have available.
    * 
    * Playback will start immediately unless the tween has been configured to be paused.
    * 
    * Please note that a Tween will not manipulate any target property that begins with an underscore.
    * 
    * Tweens are designed to be 'fire-and-forget'. They automatically destroy themselves once playback
    * is complete, to free-up memory and resources. If you wish to keep a tween after playback, i.e. to
    * play it again at a later time, then you should set the `persist` property to `true` in the config.
    * However, doing so means it's entirely up to _you_ to destroy the tween when you're finished with it,
    * otherwise it will linger in memory forever.
    * 
    * If you wish to chain Tweens together for sequential playback, see the `TweenManager.chain` method.
    */
  @js.native
  trait TweenManager extends StObject {
    
    def add(config: Tween): Tween = js.native
    def add(config: TweenChain): Tween = js.native
    /**
      * Create a Tween and add it to this Tween Manager by passing a Tween Configuration object.
      * 
      * Example, run from within a Scene:
      * 
      * ```js
      * const logo = this.add.image(100, 100, 'logo');
      * 
      * this.tweens.add({
      *   targets: logo,
      *   x: 600,
      *   ease: 'Power1',
      *   duration: 2000
      * });
      * ```
      * 
      * See the `TweenBuilderConfig` for all of the options you have available.
      * 
      * Playback will start immediately unless the tween has been configured to be paused.
      * 
      * Please note that a Tween will not manipulate any target property that begins with an underscore.
      * 
      * Tweens are designed to be 'fire-and-forget'. They automatically destroy themselves once playback
      * is complete, to free-up memory and resources. If you wish to keep a tween after playback, i.e. to
      * play it again at a later time, then you should set the `persist` property to `true` in the config.
      * However, doing so means it's entirely up to _you_ to destroy the tween when you're finished with it,
      * otherwise it will linger in memory forever.
      * 
      * If you wish to chain Tweens together for sequential playback, see the `TweenManager.chain` method.
      * @param config A Tween Configuration object, or a Tween or TweenChain instance.
      */
    def add(config: TweenBuilderConfig): Tween = js.native
    def add(config: TweenChainBuilderConfig): Tween = js.native
    
    /**
      * Create a Number Tween and add it to the active Tween list.
      * 
      * A Number Tween is a special kind of tween that doesn't have a target. Instead,
      * it allows you to tween between 2 numeric values. The default values are
      * `0` and `1`, but you can change them via the `from` and `to` properties.
      * 
      * You can get the current tweened value via the `Tween.getValue()` method.
      * 
      * Playback will start immediately unless the tween has been configured to be paused.
      * 
      * Please note that a Tween will not manipulate any target property that begins with an underscore.
      * @param config The configuration object for the Number Tween.
      */
    def addCounter(config: NumberTweenBuilderConfig): Tween = js.native
    
    /**
      * Create multiple Tweens and add them all to this Tween Manager, by passing an array of Tween Configuration objects.
      * 
      * See the `TweenBuilderConfig` for all of the options you have available.
      * 
      * Playback will start immediately unless the tweens have been configured to be paused.
      * 
      * Please note that a Tween will not manipulate any target property that begins with an underscore.
      * 
      * Tweens are designed to be 'fire-and-forget'. They automatically destroy themselves once playback
      * is complete, to free-up memory and resources. If you wish to keep a tween after playback, i.e. to
      * play it again at a later time, then you should set the `persist` property to `true` in the config.
      * However, doing so means it's entirely up to _you_ to destroy the tween when you're finished with it,
      * otherwise it will linger in memory forever.
      * 
      * If you wish to chain Tweens together for sequential playback, see the `TweenManager.chain` method.
      * @param configs An array of Tween Configuration objects.
      */
    def addMultiple(configs: js.Array[js.Object | TweenBuilderConfig]): js.Array[Tween] = js.native
    
    def chain(tweens: js.Object): TweenChain = js.native
    /**
      * Create a sequence of Tweens, chained to one-another, and add them to this Tween Manager.
      * 
      * The tweens are played in order, from start to finish. You can optionally set the chain
      * to repeat as many times as you like. Once the chain has finished playing, or repeating if set,
      * all tweens in the chain will be destroyed automatically. To override this, set the 'persists'
      * argument to 'true'.
      * 
      * Playback will start immediately unless the _first_ Tween has been configured to be paused.
      * 
      * Please note that Tweens will not manipulate any target property that begins with an underscore.
      * @param tweens A Tween Chain configuration object.
      */
    def chain(tweens: TweenChainBuilderConfig): TweenChain = js.native
    
    def create(config: js.Array[js.Object | TweenBuilderConfig]): Tween | js.Array[Tween] = js.native
    def create(config: js.Object): Tween | js.Array[Tween] = js.native
    /**
      * Create a Tween and return it, but does not add it to this Tween Manager.
      * 
      * Please note that a Tween will not manipulate any target property that begins with an underscore.
      * 
      * In order to play this tween, you'll need to add it to a Tween Manager via
      * the `TweenManager.existing` method.
      * 
      * You can optionally pass an **array** of Tween Configuration objects to this method and it will create
      * one Tween per entry in the array. If an array is given, an array of tweens is returned.
      * @param config A Tween Configuration object. Or an array of Tween Configuration objects.
      */
    def create(config: TweenBuilderConfig): Tween | js.Array[Tween] = js.native
    
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
    def each(callback: js.Function, scope: js.Object, args: Any*): this.type = js.native
    def each(callback: js.Function, scope: Unit, args: Any*): this.type = js.native
    
    /**
      * The Scene Systems Event Emitter.
      */
    var events: EventEmitter = js.native
    
    /**
      * Add an existing Tween to this Tween Manager.
      * 
      * Playback will start immediately unless the tween has been configured to be paused.
      * @param tween The Tween to add.
      */
    def existing(tween: Tween): this.type = js.native
    
    /**
      * An internal value that holds the fps rate.
      */
    var gap: Double = js.native
    
    /**
      * Returns an array containing this Tween and all Tweens chained to it,
      * in the order in which they will be played.
      * 
      * If there are no chained Tweens an empty array is returned.
      * @param tween The Tween to return the chain from.
      */
    def getChainedTweens(tween: Tween): js.Array[Tween] = js.native
    
    /**
      * Internal method that calculates the delta value, along with the other timing values,
      * and returns the new delta.
      * 
      * You should not typically call this method directly.
      * @param tick Is this a manual tick, or an automated tick? Default false.
      */
    def getDelta(): Double = js.native
    def getDelta(tick: Boolean): Double = js.native
    
    /**
      * Returns the scale of the time delta for all Tweens owned by this Tween Manager.
      */
    def getGlobalTimeScale(): Double = js.native
    
    /**
      * Returns an array containing references to all Tweens in this Tween Manager.
      * 
      * It is safe to mutate the returned array. However, acting upon any of the Tweens
      * within it, will adjust those stored in this Tween Manager, as they are passed
      * by reference and not cloned.
      * 
      * If you wish to get tweens for a specific target, see `getTweensOf`.
      */
    def getTweens(): js.Array[Tween] = js.native
    
    def getTweensOf(target: js.Array[js.Object]): js.Array[Tween] = js.native
    /**
      * Returns an array of all Tweens in the Tween Manager which affect the given target, or array of targets.
      * 
      * It's possible for this method to return tweens that are about to be removed from
      * the Tween Manager. You should check the state of the returned tween before acting
      * upon it.
      * @param target The target to look for. Provide an array to look for multiple targets.
      */
    def getTweensOf(target: js.Object): js.Array[Tween] = js.native
    
    /**
      * Check to see if the given Tween instance exists within this Tween Manager.
      * 
      * Will return `true` as long as the Tween is being processed by this Tween Manager.
      * 
      * Will return `false` if not present, or has a state of `REMOVED` or `DESTROYED`.
      * @param tween The Tween instance to check.
      */
    def has(tween: Tween): Boolean = js.native
    
    /**
      * Checks if the given object is being affected by a _playing_ Tween.
      * 
      * If the Tween is paused, this method will return false.
      * @param target The object to check if a tween is active for it, or not.
      */
    def isTweening(target: js.Object): Boolean = js.native
    
    /**
      * Destroys all Tweens in this Tween Manager.
      * 
      * The tweens will erase all references to any targets they hold
      * and be stopped immediately.
      * 
      * If this method is called while the Tween Manager is running its
      * update process, then the tweens will be removed at the start of
      * the next frame. Outside of this, they are removed immediately.
      */
    def killAll(): this.type = js.native
    
    def killTweensOf(target: js.Array[Any]): this.type = js.native
    /**
      * Stops all Tweens which affect the given target or array of targets.
      * 
      * The tweens will erase all references to any targets they hold
      * and be stopped immediately.
      * 
      * If this method is called while the Tween Manager is running its
      * update process, then the tweens will be removed at the start of
      * the next frame. Outside of this, they are removed immediately.
      * @param target The target to kill the tweens of. Provide an array to use multiple targets.
      */
    def killTweensOf(target: js.Object): this.type = js.native
    
    /**
      * The amount of time, in milliseconds, that is used to set the
      * delta when lag smoothing is applied.
      * 
      * See the `TweenManager.setLagSmooth` method for further details.
      */
    var lagSkip: Double = js.native
    
    /**
      * Checks if a Tween is active and adds it to the Tween Manager at the start of the frame if it isn't.
      * @param tween The Tween to check.
      */
    def makeActive(tween: Tween): this.type = js.native
    
    /**
      * The maximum amount of time, in milliseconds, the browser can
      * lag for, before lag smoothing is applied.
      * 
      * See the `TweenManager.setLagSmooth` method for further details.
      */
    var maxLag: Double = js.native
    
    /**
      * The time the Tween Manager should next update.
      */
    var nextTime: Double = js.native
    
    /**
      * Pauses this Tween Manager. No Tweens will update while paused.
      * 
      * This includes tweens created after this method was called.
      * 
      * See `TweenManager#resumeAll` to resume the playback.
      * 
      * As of Phaser 3.60 you can also toggle the boolean property `TweenManager.paused`.
      */
    def pauseAll(): this.type = js.native
    
    /**
      * This toggles the updating state of this Tween Manager.
      * 
      * Setting `paused` to `true` (or calling the `pauseAll` method) will
      * stop this Tween Manager from updating any of its tweens, including
      * newly created ones. Set back to `false` to resume playback.
      */
    var paused: Boolean = js.native
    
    /**
      * The time the Tween Manager previously updated.
      */
    var prevTime: Double = js.native
    
    /**
      * Is this Tween Manager currently processing the tweens as part of
      * its 'update' loop? This is set to 'true' at the start of 'update'
      * and reset to 'false' at the end of the function. Allows you to trap
      * Tween Manager status during tween callbacks.
      */
    var processing: Boolean = js.native
    
    /**
      * Removes the given Tween from this Tween Manager, even if it hasn't started
      * playback yet. If this method is called while the Tween Manager is processing
      * an update loop, then the tween will be flagged for removal at the start of
      * the next frame. Otherwise, it is removed immediately.
      * 
      * The removed tween is _not_ destroyed. It is just removed from this Tween Manager.
      * @param tween The Tween to be removed.
      */
    def remove(tween: Tween): this.type = js.native
    
    /**
      * Resets the given Tween.
      * 
      * If the Tween does not belong to this Tween Manager, it will first be added.
      * 
      * Then it will seek to position 0 and playback will start on the next frame.
      * @param tween The Tween to be reset.
      */
    def reset(tween: Tween): this.type = js.native
    
    /**
      * Resumes playback of this Tween Manager.
      * 
      * All active Tweens will continue updating.
      * 
      * See `TweenManager#pauseAll` to pause the playback.
      * 
      * As of Phaser 3.60 you can also toggle the boolean property `TweenManager.paused`.
      */
    def resumeAll(): this.type = js.native
    
    /**
      * The Scene which owns this Tween Manager.
      */
    var scene: Scene = js.native
    
    /**
      * Limits the Tween system to run at a particular frame rate.
      * 
      * You should not set this _above_ the frequency of the browser,
      * but instead can use it to throttle the frame rate lower, should
      * you need to in certain situations.
      * @param fps The frame rate to tick at. Default 240.
      */
    def setFps(): this.type = js.native
    def setFps(fps: Double): this.type = js.native
    
    /**
      * Sets a new scale of the time delta for this Tween Manager.
      * 
      * The time delta is the time elapsed between two consecutive frames and influences the speed of time for this Tween Manager and all Tweens it owns. Values higher than 1 increase the speed of time, while values smaller than 1 decrease it. A value of 0 freezes time and is effectively equivalent to pausing all Tweens.
      * @param value The new scale of the time delta, where 1 is the normal speed.
      */
    def setGlobalTimeScale(value: Double): this.type = js.native
    
    /**
      * Set the limits that are used when a browser encounters lag, or delays that cause the elapsed
      * time between two frames to exceed the expected amount. If this occurs, the Tween Manager will
      * act as if the 'skip' amount of times has passed, in order to maintain strict tween sequencing.
      * 
      * This is enabled by default with the values 500ms for the lag limit and 33ms for the skip.
      * 
      * You should not set these to low values, as it won't give time for the browser to ever
      * catch-up with itself and reclaim sync.
      * 
      * Call this method with no arguments to disable smoothing.
      * 
      * Call it with the arguments `500` and `33` to reset to the defaults.
      * @param limit If the browser exceeds this amount, in milliseconds, it will act as if the 'skip' amount has elapsed instead. Default 0.
      * @param skip The amount, in milliseconds, to use as the step delta should the browser lag beyond the 'limit'. Default 0.
      */
    def setLagSmooth(): this.type = js.native
    def setLagSmooth(limit: Double): this.type = js.native
    def setLagSmooth(limit: Double, skip: Double): this.type = js.native
    def setLagSmooth(limit: Unit, skip: Double): this.type = js.native
    
    /**
      * The Scene that owns this plugin is shutting down.
      * 
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
      * The time the Tween Manager was started.
      */
    var startTime: Double = js.native
    
    /**
      * Updates all Tweens belonging to this Tween Manager.
      * 
      * Called automatically by `update` and `tick`.
      * @param tick Is this a manual tick, or an automated tick? Default false.
      */
    def step(): Unit = js.native
    def step(tick: Boolean): Unit = js.native
    
    /**
      * Manually advance the Tween system by one step.
      * 
      * This will update all Tweens even if the Tween Manager is currently
      * paused.
      */
    def tick(): this.type = js.native
    
    /**
      * The time the Tween Manager was updated.
      */
    var time: Double = js.native
    
    /**
      * The time scale of the Tween Manager.
      * 
      * This value scales the time delta between two frames, thus influencing the speed of time for all Tweens owned by this Tween Manager.
      */
    var timeScale: Double = js.native
    
    /**
      * An array of Tweens which are actively being processed by the Tween Manager.
      */
    var tweens: js.Array[Tween] = js.native
    
    /**
      * Internal update handler.
      * 
      * Calls `TweenManager.step` as long as the Tween Manager has not
      * been paused.
      */
    def update(): Unit = js.native
  }
}
