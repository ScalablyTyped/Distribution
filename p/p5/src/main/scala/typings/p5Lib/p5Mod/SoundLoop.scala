package typings
package p5Lib.p5Mod

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
  var bpm: scala.Double = js.native
  /**
    *   length of the loops interval
    */
  var interval: scala.Double | java.lang.String = js.native
  /**
    *   how many times the callback has been called so far
    */
  var iterations: scala.Double = js.native
  /**
    *   Set a limit to the number of loops to play.
    *   defaults to Infinity
    */
  var maxIterations: scala.Double = js.native
  /**
    *   musicalTimeMode uses Tone.Time convention true if
    *   string, false if number
    */
  var musicalTimeMode: scala.Boolean = js.native
  /**
    *   number of quarter notes in a measure (defaults to
    *   4)
    */
  var timeSignature: scala.Double = js.native
  /**
    *   Pause the loop
    *   @param [timeFromNow] schedule a pausing time
    */
  def pause(): scala.Unit = js.native
  def pause(timeFromNow: scala.Double): scala.Unit = js.native
  /**
    *   Start the loop
    *   @param [timeFromNow] schedule a starting time
    */
  def start(): scala.Unit = js.native
  def start(timeFromNow: scala.Double): scala.Unit = js.native
  /**
    *   Stop the loop
    *   @param [timeFromNow] schedule a stopping time
    */
  def stop(): scala.Unit = js.native
  def stop(timeFromNow: scala.Double): scala.Unit = js.native
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
  def syncedStart(otherLoop: js.Object): scala.Unit = js.native
  def syncedStart(otherLoop: js.Object, timeFromNow: scala.Double): scala.Unit = js.native
}

