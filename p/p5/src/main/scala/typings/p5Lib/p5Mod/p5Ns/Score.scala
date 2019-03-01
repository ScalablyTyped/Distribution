package typings
package p5Lib.p5Mod.p5Ns

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
    loop: js.Function0[scala.Unit],
    noLoop: js.Function0[scala.Unit],
    pause: js.Function0[scala.Unit],
    setBPM: js.Function2[scala.Double, scala.Double, scala.Unit],
    start: js.Function0[scala.Unit],
    stop: js.Function0[scala.Unit]
  ): Score = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loop")(loop)
    __obj.updateDynamic("noLoop")(noLoop)
    __obj.updateDynamic("pause")(pause)
    __obj.updateDynamic("setBPM")(setBPM)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[Score]
  }
}

