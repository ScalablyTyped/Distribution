package typings
package phaserLib.PhaserNs.TimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Clock is a Scene plugin which creates and updates Timer Events for its Scene.
  */
@JSGlobal("Phaser.Time.Clock")
@js.native
class Clock protected () extends js.Object {
  /**
    * 
    * @param scene The Scene which owns this Clock.
    */
  def this(scene: phaserLib.PhaserNs.Scene) = this()
  /**
    * The current time of the Clock, in milliseconds.
    * 
    * If accessed externally, this is equivalent to the `time` parameter normally passed to a Scene's `update` method.
    */
  var now: scala.Double = js.native
  /**
    * Whether the Clock is paused (`true`) or active (`false`).
    * 
    * When paused, the Clock will not update any of its Timer Events, thus freezing time.
    */
  var paused: scala.Boolean = js.native
  /**
    * The Scene which owns this Clock.
    */
  var scene: phaserLib.PhaserNs.Scene = js.native
  /**
    * The Scene Systems object of the Scene which owns this Clock.
    */
  var systems: phaserLib.PhaserNs.ScenesNs.Systems = js.native
  /**
    * The scale of the Clock's time delta.
    * 
    * The time delta is the time elapsed between two consecutive frames and influences the speed of time for this Clock and anything which uses it, such as its Timer Events. Values higher than 1 increase the speed of time, while values smaller than 1 decrease it. A value of 0 freezes time and is effectively equivalent to pausing the Clock.
    */
  var timeScale: scala.Double = js.native
  /**
    * Creates a Timer Event and adds it to the Clock at the start of the frame.
    * @param config The configuration for the Timer Event.
    */
  def addEvent(config: phaserLib.PhaserNs.TypesNs.TimeNs.TimerEventConfig): TimerEvent = js.native
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
  def delayedCall(delay: scala.Double, callback: js.Function, args: js.Array[_], callbackScope: js.Any): TimerEvent = js.native
  /**
    * Updates the arrays of active and pending Timer Events. Called at the start of the frame.
    * @param time The current time. Either a High Resolution Timer value if it comes from Request Animation Frame, or Date.now if using SetTimeout.
    * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
    */
  def preUpdate(time: scala.Double, delta: scala.Double): scala.Unit = js.native
  /**
    * Schedules all active Timer Events for removal at the start of the frame.
    */
  def removeAllEvents(): Clock = js.native
  /**
    * Updates the Clock's internal time and all of its Timer Events.
    * @param time The current time. Either a High Resolution Timer value if it comes from Request Animation Frame, or Date.now if using SetTimeout.
    * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
    */
  def update(time: scala.Double, delta: scala.Double): scala.Unit = js.native
}

