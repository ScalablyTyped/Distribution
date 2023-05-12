package typings.phaser.Phaser

import typings.phaser.Phaser.Scenes.Systems
import typings.phaser.Phaser.Types.Time.TimelineEvent
import typings.phaser.Phaser.Types.Time.TimelineEventConfig
import typings.phaser.Phaser.Types.Time.TimerEventConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Time {
  
  /**
    * The Clock is a Scene plugin which creates and updates Timer Events for its Scene.
    */
  @js.native
  trait Clock extends StObject {
    
    /**
      * Creates a Timer Event and adds it to this Clock at the start of the next frame.
      * 
      * You can pass in either a `TimerEventConfig` object, from with a new `TimerEvent` will
      * be created, or you can pass in a `TimerEvent` instance.
      * 
      * If passing an instance please make sure that this instance hasn't been used before.
      * If it has ever entered a 'completed' state then it will no longer be suitable to
      * run again.
      * 
      * Also, if the `TimerEvent` instance is being used by _another_ Clock (in another Scene)
      * it will still be updated by that Clock as well, so be careful when using this feature.
      * @param config The configuration for the Timer Event, or an existing Timer Event object.
      */
    def addEvent(config: TimerEvent): TimerEvent = js.native
    def addEvent(config: TimerEventConfig): TimerEvent = js.native
    
    /**
      * Clears and recreates the array of pending Timer Events.
      */
    def clearPendingEvents(): this.type = js.native
    
    /**
      * Creates a Timer Event and adds it to the Clock at the start of the frame.
      * 
      * This is a shortcut for {@link #addEvent} which can be shorter and is compatible with the syntax of the GreenSock Animation Platform (GSAP).
      * @param delay The delay of the function call, in milliseconds.
      * @param callback The function to call after the delay expires.
      * @param args The arguments to call the function with.
      * @param callbackScope The scope (`this` object) to call the function with.
      */
    def delayedCall(delay: Double, callback: js.Function): TimerEvent = js.native
    def delayedCall(delay: Double, callback: js.Function, args: js.Array[Any]): TimerEvent = js.native
    def delayedCall(delay: Double, callback: js.Function, args: js.Array[Any], callbackScope: Any): TimerEvent = js.native
    def delayedCall(delay: Double, callback: js.Function, args: Unit, callbackScope: Any): TimerEvent = js.native
    
    /**
      * The current time of the Clock, in milliseconds.
      * 
      * If accessed externally, this is equivalent to the `time` parameter normally passed to a Scene's `update` method.
      */
    var now: Double = js.native
    
    /**
      * Whether the Clock is paused (`true`) or active (`false`).
      * 
      * When paused, the Clock will not update any of its Timer Events, thus freezing time.
      */
    var paused: Boolean = js.native
    
    /**
      * Updates the arrays of active and pending Timer Events. Called at the start of the frame.
      * @param time The current time. Either a High Resolution Timer value if it comes from Request Animation Frame, or Date.now if using SetTimeout.
      * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
      */
    def preUpdate(time: Double, delta: Double): Unit = js.native
    
    /**
      * Schedules all active Timer Events for removal at the start of the frame.
      */
    def removeAllEvents(): this.type = js.native
    
    def removeEvent(events: js.Array[TimerEvent]): this.type = js.native
    /**
      * Removes the given Timer Event, or an array of Timer Events, from this Clock.
      * 
      * The events are removed from all internal lists (active, pending and removal),
      * freeing the event up to be re-used.
      * @param events The Timer Event, or an array of Timer Events, to remove from this Clock.
      */
    def removeEvent(events: TimerEvent): this.type = js.native
    
    /**
      * The Scene which owns this Clock.
      */
    var scene: Scene = js.native
    
    /**
      * The time the Clock (and Scene) started, in milliseconds.
      * 
      * This can be compared to the `time` parameter passed to a Scene's `update` method.
      */
    var startTime: Double = js.native
    
    /**
      * The Scene Systems object of the Scene which owns this Clock.
      */
    var systems: Systems = js.native
    
    /**
      * The scale of the Clock's time delta.
      * 
      * The time delta is the time elapsed between two consecutive frames and influences the speed of time for this Clock and anything which uses it, such as its Timer Events. Values higher than 1 increase the speed of time, while values smaller than 1 decrease it. A value of 0 freezes time and is effectively equivalent to pausing the Clock.
      */
    var timeScale: Double = js.native
    
    /**
      * Updates the Clock's internal time and all of its Timer Events.
      * @param time The current time. Either a High Resolution Timer value if it comes from Request Animation Frame, or Date.now if using SetTimeout.
      * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
      */
    def update(time: Double, delta: Double): Unit = js.native
  }
  
  /**
    * A Timeline is a way to schedule events to happen at specific times in the future.
    * 
    * You can think of it as an event sequencer for your game, allowing you to schedule the
    * running of callbacks, events and other actions at specific times in the future.
    * 
    * A Timeline is a Scene level system, meaning you can have as many Timelines as you like, each
    * belonging to a different Scene. You can also have multiple Timelines running at the same time.
    * 
    * If the Scene is paused, the Timeline will also pause. If the Scene is destroyed, the Timeline
    * will be automatically destroyed. However, you can control the Timeline directly, pausing,
    * resuming and stopping it at any time.
    * 
    * Create an instance of a Timeline via the Game Object Factory:
    * 
    * ```js
    * const timeline = this.add.timeline();
    * ```
    * 
    * The Timeline always starts paused. You must call `play` on it to start it running.
    * 
    * You can also pass in a configuration object on creation, or an array of them:
    * 
    * ```js
    * const timeline = this.add.timeline({
    *     at: 1000,
    *     run: () => {
    *         this.add.sprite(400, 300, 'logo');
    *     }
    * });
    * 
    * timeline.play();
    * ```
    * 
    * In this example we sequence a few different events:
    * 
    * ```js
    * const timeline = this.add.timeline([
    *     {
    *         at: 1000,
    *         run: () => { this.logo = this.add.sprite(400, 300, 'logo'); },
    *         sound: 'TitleMusic'
    *     },
    *     {
    *         at: 2500,
    *         tween: {
    *             targets: this.logo,
    *             y: 600,
    *             yoyo: true
    *         },
    *         sound: 'Explode'
    *     },
    *     {
    *         at: 8000,
    *         event: 'HURRY_PLAYER',
    *         target: this.background,
    *         set: {
    *             tint: 0xff0000
    *         }
    *     }
    * ]);
    * 
    * timeline.play();
    * ```
    * 
    * There are lots of options available to you via the configuration object. See the
    * {@link Phaser.Types.Time.TimelineEventConfig} typedef for more details.
    */
  @js.native
  trait Timeline extends StObject {
    
    def add(config: js.Array[TimelineEventConfig]): this.type = js.native
    /**
      * Adds one or more events to this Timeline.
      * 
      * You can pass in a single configuration object, or an array of them:
      * 
      * ```js
      * const timeline = this.add.timeline({
      *     at: 1000,
      *     run: () => {
      *         this.add.sprite(400, 300, 'logo');
      *     }
      * });
      * ```
      * @param config The configuration object for this Timeline Event, or an array of them.
      */
    def add(config: TimelineEventConfig): this.type = js.native
    
    /**
      * Removes all events from this Timeline, resets the elapsed time to zero
      * and pauses the Timeline.
      */
    def clear(): this.type = js.native
    
    /**
      * Whether the Timeline is complete (`true`) or not (`false`).
      * 
      * A Timeline is considered complete when all of its events have been run.
      * 
      * If you wish to restart a Timeline after it has completed, you can do so
      * by calling the `Timeline.restart` method.
      * 
      * You can also use the `Timeline.stop` method to stop a running Timeline,
      * at any point, without resetting it.
      */
    var complete: Boolean = js.native
    
    /**
      * Destroys this Timeline.
      * 
      * This will remove all events from the Timeline and stop it from processing.
      * 
      * This method is called automatically when the Scene shuts down, but you may
      * also call it directly should you need to destroy the Timeline earlier.
      */
    def destroy(): Unit = js.native
    
    /**
      * The elapsed time counter.
      * 
      * Treat this as read-only.
      */
    var elapsed: Double = js.native
    
    /**
      * An array of all the Timeline Events.
      */
    var events: js.Array[TimelineEvent] = js.native
    
    /**
      * Returns a number between 0 and 1 representing the progress of this Timeline.
      * 
      * A value of 0 means the Timeline has just started, 0.5 means it's half way through,
      * and 1 means it's complete.
      * 
      * If the Timeline has no events, or all events have been removed, this will return 1.
      * 
      * If the Timeline is paused, this will return the progress value at the time it was paused.
      * 
      * Note that the value returned is based on the number of events that have been completed,
      * not the 'duration' of the events (as this is unknown to the Timeline).
      */
    def getProgress(): Double = js.native
    
    /**
      * Returns `true` if this Timeline is currently playing.
      * 
      * A Timeline is playing if it is not paused or not complete.
      */
    def isPlaying(): Boolean = js.native
    
    /**
      * Pauses this Timeline.
      * 
      * To resume it again, call the `Timeline.resume` method or set the `Timeline.paused` property to `false`.
      * 
      * If the Timeline is paused while processing the current game step, then it
      * will carry on with all events that are due to run during that step and pause
      * from the next game step.
      */
    def pause(): this.type = js.native
    
    /**
      * Whether the Timeline is running (`true`) or active (`false`).
      * 
      * When paused, the Timeline will not run any of its actions.
      * 
      * By default a Timeline is always paused and should be started by
      * calling the `Timeline.play` method.
      * 
      * You can use the `Timeline.pause` and `Timeline.resume` methods to control
      * this value in a chainable way.
      */
    var paused: Boolean = js.native
    
    /**
      * Starts this Timeline running.
      * 
      * If the Timeline is already running and the `fromStart` parameter is `true`,
      * then calling this method will reset the Timeline events as incomplete.
      * 
      * If you wish to resume a paused Timeline, then use the `Timeline.resume` method instead.
      * @param fromStart Reset this Timeline back to the start before playing. Default true.
      */
    def play(): this.type = js.native
    def play(fromStart: Boolean): this.type = js.native
    
    /**
      * Updates the elapsed time counter, if this Timeline is not paused.
      * @param time The current time. Either a High Resolution Timer value if it comes from Request Animation Frame, or Date.now if using SetTimeout.
      * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
      */
    def preUpdate(time: Double, delta: Double): Unit = js.native
    
    /**
      * Resets this Timeline back to the start.
      * 
      * This will set the elapsed time to zero and set all events to be incomplete.
      * 
      * If the Timeline had any events that were set to `once` that have already
      * been removed, they will **not** be present again after calling this method.
      * 
      * If the Timeline isn't currently running (i.e. it's paused or complete) then
      * calling this method resets those states, the same as calling `Timeline.play(true)`.
      */
    def reset(): this.type = js.native
    
    /**
      * Resumes this Timeline from a paused state.
      * 
      * The Timeline will carry on from where it left off.
      * 
      * If you need to reset the Timeline to the start, then call the `Timeline.reset` method.
      */
    def resume(): this.type = js.native
    
    /**
      * The Scene to which this Timeline belongs.
      */
    var scene: Scene = js.native
    
    /**
      * Stops this Timeline.
      * 
      * This will set the `paused` and `complete` properties to `true`.
      * 
      * If you wish to reset the Timeline to the start, then call the `Timeline.reset` method.
      */
    def stop(): this.type = js.native
    
    /**
      * A reference to the Scene Systems.
      */
    var systems: Systems = js.native
    
    /**
      * The total number of events that have been run.
      * 
      * This value is reset to zero if the Timeline is restarted.
      * 
      * Treat this as read-only.
      */
    var totalComplete: Double = js.native
    
    /**
      * Called automatically by the Scene update step.
      * 
      * Iterates through all of the Timeline Events and checks to see if they should be run.
      * 
      * If they should be run, then the `TimelineEvent.action` callback is invoked.
      * 
      * If the `TimelineEvent.once` property is `true` then the event is removed from the Timeline.
      * 
      * If the `TimelineEvent.event` property is set then the Timeline emits that event.
      * 
      * If the `TimelineEvent.run` property is set then the Timeline invokes that method.
      * 
      * If the `TimelineEvent.target` property is set then the Timeline invokes the `run` method on that target.
      * @param time The current time. Either a High Resolution Timer value if it comes from Request Animation Frame, or Date.now if using SetTimeout.
      * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
      */
    def update(time: Double, delta: Double): Unit = js.native
  }
  
  /**
    * A Timer Event represents a delayed function call. It's managed by a Scene's {@link Clock} and will call its function after a set amount of time has passed. The Timer Event can optionally repeat - i.e. call its function multiple times before finishing, or loop indefinitely.
    * 
    * Because it's managed by a Clock, a Timer Event is based on game time, will be affected by its Clock's time scale, and will pause if its Clock pauses.
    */
  @js.native
  trait TimerEvent extends StObject {
    
    /**
      * Additional arguments to be passed to the callback.
      */
    var args: js.Array[Any] = js.native
    
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
      * Destroys all object references in the Timer Event, i.e. its callback, scope, and arguments.
      * 
      * Normally, this method is only called by the Clock when it shuts down. As such, it doesn't stop the Timer Event. If called manually, the Timer Event will still be updated by the Clock, but it won't do anything when it fires.
      */
    def destroy(): Unit = js.native
    
    /**
      * The time in milliseconds which has elapsed since the Timer Event's creation.
      * 
      * This value is local for the Timer Event and is relative to its Clock. As such, it's influenced by the Clock's time scale and paused state, the Timer Event's initial {@link #startAt} property, and the Timer Event's {@link #timeScale} and {@link #paused} state.
      */
    var elapsed: Double = js.native
    
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
      * Returns the time interval until the last iteration of the Timer Event.
      */
    def getOverallRemaining(): Double = js.native
    
    /**
      * Returns the time interval until the last iteration of the Timer Event in seconds.
      */
    def getOverallRemainingSeconds(): Double = js.native
    
    /**
      * Gets the progress of the current iteration, not factoring in repeats.
      */
    def getProgress(): Double = js.native
    
    /**
      * Returns the time interval until the next iteration of the Timer Event.
      */
    def getRemaining(): Double = js.native
    
    /**
      * Returns the time interval until the next iteration of the Timer Event in seconds.
      */
    def getRemainingSeconds(): Double = js.native
    
    /**
      * Returns the number of times this Timer Event will repeat before finishing.
      * 
      * This should not be confused with the number of times the Timer Event will fire before finishing. A return value of 0 doesn't indicate that the Timer Event has finished running - it indicates that it will not repeat after the next time it fires.
      */
    def getRepeatCount(): Double = js.native
    
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
      * Forces the Timer Event to immediately expire, thus scheduling its removal in the next frame.
      * @param dispatchCallback If `true`, the function of the Timer Event will be called before its removal. Default false.
      */
    def remove(): Unit = js.native
    def remove(dispatchCallback: Boolean): Unit = js.native
    
    /**
      * The total number of times this TimerEvent will repeat before finishing.
      */
    val repeat: Double = js.native
    
    /**
      * If repeating this contains the current repeat count.
      */
    var repeatCount: Double = js.native
    
    /**
      * Completely reinitializes the Timer Event, regardless of its current state, according to a configuration object.
      * @param config The new state for the Timer Event.
      */
    def reset(config: TimerEventConfig): TimerEvent = js.native
    
    /**
      * Start this many MS into the elapsed (useful if you want a long duration with repeat, but for the first loop to fire quickly)
      */
    var startAt: Double = js.native
    
    /**
      * Scale the time causing this TimerEvent to update.
      */
    var timeScale: Double = js.native
  }
}
