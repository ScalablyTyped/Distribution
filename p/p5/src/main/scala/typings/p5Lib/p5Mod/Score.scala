package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "Score")
@js.native
class Score ()
  extends p5Lib.p5Mod.p5Ns.Score {
  /**
       *   A Score consists of a series of Parts. The parts
       *   will be played back in order. For example, you
       *   could have an A part, a B part, and a C part, and
       *   play them back in this order new p5.Score(a, a, b,
       *   a, c)
       *
       *   @param [parts] One or multiple parts, to be played
       *   in sequence.
       */
  def this(parts: Part) = this()
  /**
       *   Loop playback of the score.
       */
  /* CompleteClass */
  override def loop(): scala.Unit = js.native
  /**
       *   Stop looping playback of the score. If it is
       *   currently playing, this will go into effect after
       *   the current round of playback completes.
       */
  /* CompleteClass */
  override def noLoop(): scala.Unit = js.native
  /**
       *   Pause playback of the score.
       */
  /* CompleteClass */
  override def pause(): scala.Unit = js.native
  /**
       *   Set the tempo for all parts in the score
       *   @param BPM Beats Per Minute
       *   @param rampTime Seconds from now
       */
  /* CompleteClass */
  override def setBPM(BPM: scala.Double, rampTime: scala.Double): scala.Unit = js.native
  /**
       *   Start playback of the score.
       */
  /* CompleteClass */
  override def start(): scala.Unit = js.native
  /**
       *   Stop playback of the score.
       */
  /* CompleteClass */
  override def stop(): scala.Unit = js.native
}

