package typings.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Score extends js.Object {
  /**
    *   Loop playback of the score.
    */
  def loop(): Unit = js.native
  /**
    *   Stop looping playback of the score. If it is
    *   currently playing, this will go into effect after
    *   the current round of playback completes.
    */
  def noLoop(): Unit = js.native
  /**
    *   Pause playback of the score.
    */
  def pause(): Unit = js.native
  /**
    *   Set the tempo for all parts in the score
    *   @param BPM Beats Per Minute
    *   @param rampTime Seconds from now
    */
  def setBPM(BPM: Double, rampTime: Double): Unit = js.native
  /**
    *   Start playback of the score.
    */
  def start(): Unit = js.native
  /**
    *   Stop playback of the score.
    */
  def stop(): Unit = js.native
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
  @scala.inline
  implicit class ScoreOps[Self <: Score] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLoop(value: () => Unit): Self = this.set("loop", js.Any.fromFunction0(value))
    @scala.inline
    def setNoLoop(value: () => Unit): Self = this.set("noLoop", js.Any.fromFunction0(value))
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    @scala.inline
    def setSetBPM(value: (Double, Double) => Unit): Self = this.set("setBPM", js.Any.fromFunction2(value))
    @scala.inline
    def setStart(value: () => Unit): Self = this.set("start", js.Any.fromFunction0(value))
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
  }
  
}

