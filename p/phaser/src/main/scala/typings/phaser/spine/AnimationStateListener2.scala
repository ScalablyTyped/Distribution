package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationStateListener2 extends StObject {
  
  def complete(entry: TrackEntry): Unit
  
  def dispose(entry: TrackEntry): Unit
  
  def end(entry: TrackEntry): Unit
  
  def event(entry: TrackEntry, event: Event): Unit
  
  def interrupt(entry: TrackEntry): Unit
  
  def start(entry: TrackEntry): Unit
}
object AnimationStateListener2 {
  
  inline def apply(
    complete: TrackEntry => Unit,
    dispose: TrackEntry => Unit,
    end: TrackEntry => Unit,
    event: (TrackEntry, Event) => Unit,
    interrupt: TrackEntry => Unit,
    start: TrackEntry => Unit
  ): AnimationStateListener2 = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), dispose = js.Any.fromFunction1(dispose), end = js.Any.fromFunction1(end), event = js.Any.fromFunction2(event), interrupt = js.Any.fromFunction1(interrupt), start = js.Any.fromFunction1(start))
    __obj.asInstanceOf[AnimationStateListener2]
  }
  
  extension [Self <: AnimationStateListener2](x: Self) {
    
    inline def setComplete(value: TrackEntry => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setDispose(value: TrackEntry => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction1(value))
    
    inline def setEnd(value: TrackEntry => Unit): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
    
    inline def setEvent(value: (TrackEntry, Event) => Unit): Self = StObject.set(x, "event", js.Any.fromFunction2(value))
    
    inline def setInterrupt(value: TrackEntry => Unit): Self = StObject.set(x, "interrupt", js.Any.fromFunction1(value))
    
    inline def setStart(value: TrackEntry => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
  }
}
