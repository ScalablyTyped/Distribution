package typings.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Score extends js.Object {
  /**
    *   Loop playback of the score.
    */
  def loop(): Unit
  /**
    *   Stop looping playback of the score. If it is
    *   currently playing, this will go into effect after
    *   the current round of playback completes.
    */
  def noLoop(): Unit
  /**
    *   Pause playback of the score.
    */
  def pause(): Unit
  /**
    *   Set the tempo for all parts in the score
    *   @param BPM Beats Per Minute
    *   @param rampTime Seconds from now
    */
  def setBPM(BPM: Double, rampTime: Double): Unit
  /**
    *   Start playback of the score.
    */
  def start(): Unit
  /**
    *   Stop playback of the score.
    */
  def stop(): Unit
}

object Score {
  @scala.inline
  def apply(
    loop: () => Unit,
    noLoop: () => Unit,
    pause: () => Unit,
    setBPM: (Double, Double) => Unit,
    start: () => Unit,
    stop: () => Unit
  ): Score = {
    val __obj = js.Dynamic.literal(loop = js.Any.fromFunction0(loop), noLoop = js.Any.fromFunction0(noLoop), pause = js.Any.fromFunction0(pause), setBPM = js.Any.fromFunction2(setBPM), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[Score]
  }
}

