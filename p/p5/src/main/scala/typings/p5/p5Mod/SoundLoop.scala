package typings.p5.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoundLoop extends js.Object {
  /**
    *   Getters and Setters, setting any paramter will
    *   result in a change in the clock's frequency, that
    *   will be reflected after the next callback beats
    *   per minute (defaults to 60)
    */
  var bpm: Double = js.native
  /**
    *   length of the loops interval
    */
  var interval: Double | String = js.native
  /**
    *   how many times the callback has been called so far
    */
  var iterations: Double = js.native
  /**
    *   Set a limit to the number of loops to play.
    *   defaults to Infinity
    */
  var maxIterations: Double = js.native
  /**
    *   musicalTimeMode uses Tone.Time convention true if
    *   string, false if number
    */
  var musicalTimeMode: Boolean = js.native
  /**
    *   number of quarter notes in a measure (defaults to
    *   4)
    */
  var timeSignature: Double = js.native
  /**
    *   Pause the loop
    *   @param [timeFromNow] schedule a pausing time
    */
  def pause(): Unit = js.native
  def pause(timeFromNow: Double): Unit = js.native
  /**
    *   Start the loop
    *   @param [timeFromNow] schedule a starting time
    */
  def start(): Unit = js.native
  def start(timeFromNow: Double): Unit = js.native
  /**
    *   Stop the loop
    *   @param [timeFromNow] schedule a stopping time
    */
  def stop(): Unit = js.native
  def stop(timeFromNow: Double): Unit = js.native
  /**
    *   Synchronize loops. Use this method to start two
    *   more more loops in synchronization or to start a
    *   loop in synchronization with a loop that is
    *   already playing This method will schedule the
    *   implicit loop in sync with the explicit master
    *   loop i.e. loopToStart.syncedStart(loopToSyncWith)
    *   @param otherLoop a p5.SoundLoop to sync with
    *   @param [timeFromNow] Start the loops in sync after
    *   timeFromNow seconds
    */
  def syncedStart(otherLoop: js.Object): Unit = js.native
  def syncedStart(otherLoop: js.Object, timeFromNow: Double): Unit = js.native
}

