package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Score extends js.Object {
  /**
    *   Loop playback of the score.
    */
  def loop(): scala.Unit
  /**
    *   Stop looping playback of the score. If it is
    *   currently playing, this will go into effect after
    *   the current round of playback completes.
    */
  def noLoop(): scala.Unit
  /**
    *   Pause playback of the score.
    */
  def pause(): scala.Unit
  /**
    *   Set the tempo for all parts in the score
    *   @param BPM Beats Per Minute
    *   @param rampTime Seconds from now
    */
  def setBPM(BPM: scala.Double, rampTime: scala.Double): scala.Unit
  /**
    *   Start playback of the score.
    */
  def start(): scala.Unit
  /**
    *   Stop playback of the score.
    */
  def stop(): scala.Unit
}

object Score {
  @scala.inline
  def apply(
    loop: () => scala.Unit,
    noLoop: () => scala.Unit,
    pause: () => scala.Unit,
    setBPM: (scala.Double, scala.Double) => scala.Unit,
    start: () => scala.Unit,
    stop: () => scala.Unit
  ): Score = {
    val __obj = js.Dynamic.literal(loop = js.Any.fromFunction0(loop), noLoop = js.Any.fromFunction0(noLoop), pause = js.Any.fromFunction0(pause), setBPM = js.Any.fromFunction2(setBPM), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[Score]
  }
}

