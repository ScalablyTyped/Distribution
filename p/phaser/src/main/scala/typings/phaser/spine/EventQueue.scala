package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventQueue extends StObject {
  
  var animState: AnimationState
  
  def clear(): Unit
  
  def complete(entry: TrackEntry): Unit
  
  def dispose(entry: TrackEntry): Unit
  
  def drain(): Unit
  
  var drainDisabled: Boolean
  
  def end(entry: TrackEntry): Unit
  
  def event(entry: TrackEntry, event: Event): Unit
  
  def interrupt(entry: TrackEntry): Unit
  
  var objects: js.Array[Any]
  
  def start(entry: TrackEntry): Unit
}
object EventQueue {
  
  inline def apply(
    animState: AnimationState,
    clear: () => Unit,
    complete: TrackEntry => Unit,
    dispose: TrackEntry => Unit,
    drain: () => Unit,
    drainDisabled: Boolean,
    end: TrackEntry => Unit,
    event: (TrackEntry, Event) => Unit,
    interrupt: TrackEntry => Unit,
    objects: js.Array[Any],
    start: TrackEntry => Unit
  ): EventQueue = {
    val __obj = js.Dynamic.literal(animState = animState.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), complete = js.Any.fromFunction1(complete), dispose = js.Any.fromFunction1(dispose), drain = js.Any.fromFunction0(drain), drainDisabled = drainDisabled.asInstanceOf[js.Any], end = js.Any.fromFunction1(end), event = js.Any.fromFunction2(event), interrupt = js.Any.fromFunction1(interrupt), objects = objects.asInstanceOf[js.Any], start = js.Any.fromFunction1(start))
    __obj.asInstanceOf[EventQueue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventQueue] (val x: Self) extends AnyVal {
    
    inline def setAnimState(value: AnimationState): Self = StObject.set(x, "animState", value.asInstanceOf[js.Any])
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setComplete(value: TrackEntry => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setDispose(value: TrackEntry => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction1(value))
    
    inline def setDrain(value: () => Unit): Self = StObject.set(x, "drain", js.Any.fromFunction0(value))
    
    inline def setDrainDisabled(value: Boolean): Self = StObject.set(x, "drainDisabled", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: TrackEntry => Unit): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
    
    inline def setEvent(value: (TrackEntry, Event) => Unit): Self = StObject.set(x, "event", js.Any.fromFunction2(value))
    
    inline def setInterrupt(value: TrackEntry => Unit): Self = StObject.set(x, "interrupt", js.Any.fromFunction1(value))
    
    inline def setObjects(value: js.Array[Any]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsVarargs(value: Any*): Self = StObject.set(x, "objects", js.Array(value*))
    
    inline def setStart(value: TrackEntry => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
  }
}
