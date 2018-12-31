package typings
package p5Lib.p5Mod.p5Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Part extends js.Object {
  /**
    *   Add a p5.Phrase to this Part.
    *   @param phrase reference to a p5.Phrase
    */
  def addPhrase(phrase: p5Lib.p5Mod.Phrase): scala.Unit = js.native
  /**
    *   Returns the Beats Per Minute of this currently
    *   part.
    */
  def getBPM(): scala.Double = js.native
  /**
    *   Get a phrase from this part, based on the name it
    *   was given when it was created. Now you can modify
    *   its array.
    */
  def getPhrase(phraseName: java.lang.String): scala.Unit = js.native
  /**
    *   Loop playback of this part. It will begin looping
    *   through all of its phrases at a speed determined
    *   by setBPM.
    *   @param [time] seconds from now
    */
  def loop(): scala.Unit = js.native
  def loop(time: scala.Double): scala.Unit = js.native
  /**
    *   Tell the part to stop looping.
    */
  def noLoop(): scala.Unit = js.native
  /**
    *   Fire a callback function at every step.
    *   @param callback The name of the callback you want
    *   to fire on every beat/tatum.
    */
  def onStep(callback: js.Function1[/* repeated */ js.Any, _]): scala.Unit = js.native
  /**
    *   Pause the part. Playback will resume from the
    *   current step.
    *   @param time seconds from now
    */
  def pause(time: scala.Double): scala.Unit = js.native
  /**
    *   Remove a phrase from this part, based on the name
    *   it was given when it was created.
    */
  def removePhrase(phraseName: java.lang.String): scala.Unit = js.native
  /**
    *   Get a phrase from this part, based on the name it
    *   was given when it was created. Now you can modify
    *   its array.
    *   @param sequence Array of values to pass into the
    *   callback at each step of the phrase.
    */
  def replaceSequence(phraseName: java.lang.String, sequence: js.Array[_]): scala.Unit = js.native
  /**
    *   Set the tempo of this part, in Beats Per Minute.
    *   @param BPM Beats Per Minute
    *   @param [rampTime] Seconds from now
    */
  def setBPM(BPM: scala.Double): scala.Unit = js.native
  def setBPM(BPM: scala.Double, rampTime: scala.Double): scala.Unit = js.native
  /**
    *   Start playback of this part. It will play through
    *   all of its phrases at a speed determined by
    *   setBPM.
    *   @param [time] seconds from now
    */
  def start(): scala.Unit = js.native
  def start(time: scala.Double): scala.Unit = js.native
  /**
    *   Stop the part and cue it to step 0.
    *   @param [time] seconds from now
    */
  def stop(): scala.Unit = js.native
  def stop(time: scala.Double): scala.Unit = js.native
}

