package typings.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Part extends js.Object {
  /**
    *   Add a p5.Phrase to this Part.
    *   @param phrase reference to a p5.Phrase
    */
  def addPhrase(phrase: Phrase): Unit = js.native
  /**
    *   Returns the tempo, in Beats Per Minute, of this
    *   part.
    */
  def getBPM(): Double = js.native
  /**
    *   Get a phrase from this part, based on the name it
    *   was given when it was created. Now you can modify
    *   its array.
    */
  def getPhrase(phraseName: String): Unit = js.native
  /**
    *   Loop playback of this part. It will begin looping
    *   through all of its phrases at a speed determined
    *   by setBPM.
    *   @param [time] seconds from now
    */
  def loop(): Unit = js.native
  def loop(time: Double): Unit = js.native
  /**
    *   Tell the part to stop looping.
    */
  def noLoop(): Unit = js.native
  /**
    *   Set the function that will be called at every
    *   step. This will clear the previous function.
    *   @param callback The name of the callback you want
    *   to fire on every beat/tatum.
    */
  def onStep(callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  /**
    *   Pause the part. Playback will resume from the
    *   current step.
    *   @param time seconds from now
    */
  def pause(time: Double): Unit = js.native
  /**
    *   Remove a phrase from this part, based on the name
    *   it was given when it was created.
    */
  def removePhrase(phraseName: String): Unit = js.native
  /**
    *   Find all sequences with the specified name, and
    *   replace their patterns with the specified array.
    *   @param sequence Array of values to pass into the
    *   callback at each step of the phrase.
    */
  def replaceSequence(phraseName: String, sequence: js.Array[_]): Unit = js.native
  /**
    *   Set the tempo of this part, in Beats Per Minute.
    *   @param BPM Beats Per Minute
    *   @param [rampTime] Seconds from now
    */
  def setBPM(BPM: Double): Unit = js.native
  def setBPM(BPM: Double, rampTime: Double): Unit = js.native
  /**
    *   Start playback of this part. It will play through
    *   all of its phrases at a speed determined by
    *   setBPM.
    *   @param [time] seconds from now
    */
  def start(): Unit = js.native
  def start(time: Double): Unit = js.native
  /**
    *   Stop the part and cue it to step 0. Playback will
    *   resume from the begining of the Part when it is
    *   played again.
    *   @param [time] seconds from now
    */
  def stop(): Unit = js.native
  def stop(time: Double): Unit = js.native
}

