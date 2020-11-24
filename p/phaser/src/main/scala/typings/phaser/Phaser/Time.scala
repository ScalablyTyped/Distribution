package typings.phaser.Phaser

import typings.phaser.Phaser.Scenes.Systems
import typings.phaser.Phaser.Types.Time.TimerEventConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Phaser.Time")
@js.native
object Time extends js.Object {
  
  /**
    * The Clock is a Scene plugin which creates and updates Timer Events for its Scene.
    */
  @js.native
  trait Clock extends js.Object {
    
    /**
      * Creates a Timer Event and adds it to the Clock at the start of the frame.
      * @param config The configuration for the Timer Event.
      */
    def addEvent(config: TimerEventConfig): TimerEvent = js.native
    
    /**
      * Clears and recreates the array of pending Timer Events.
      */
    def clearPendingEvents(): Clock = js.native
    
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
    def delayedCall(delay: Double, callback: js.Function, args: js.UndefOr[scala.Nothing], callbackScope: js.Any): TimerEvent = js.native
    def delayedCall(delay: Double, callback: js.Function, args: js.Array[_]): TimerEvent = js.native
    def delayedCall(delay: Double, callback: js.Function, args: js.Array[_], callbackScope: js.Any): TimerEvent = js.native
    
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
    def removeAllEvents(): Clock = js.native
    
    /**
      * The Scene which owns this Clock.
      */
    var scene: Scene = js.native
    
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
    * A Timer Event represents a delayed function call. It's managed by a Scene's {@link Clock} and will call its function after a set amount of time has passed. The Timer Event can optionally repeat - i.e. call its function multiple times before finishing, or loop indefinitely.
    * 
    * Because it's managed by a Clock, a Timer Event is based on game time, will be affected by its Clock's time scale, and will pause if its Clock pauses.
    */
  @js.native
  trait TimerEvent extends js.Object {
    
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
