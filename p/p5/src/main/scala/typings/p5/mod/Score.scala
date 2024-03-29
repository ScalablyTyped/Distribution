package typings.p5.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Score extends StObject {
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Score] (val x: Self) extends AnyVal {
    
    inline def setLoop(value: () => Unit): Self = StObject.set(x, "loop", js.Any.fromFunction0(value))
    
    inline def setNoLoop(value: () => Unit): Self = StObject.set(x, "noLoop", js.Any.fromFunction0(value))
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setSetBPM(value: (Double, Double) => Unit): Self = StObject.set(x, "setBPM", js.Any.fromFunction2(value))
    
    inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
