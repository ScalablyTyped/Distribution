package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventQueue extends StObject {
  
  var animState: AnimationState = js.native
  
  def clear(): Unit = js.native
  
  def complete(entry: TrackEntry): Unit = js.native
  
  def deprecateStuff(): Boolean = js.native
  
  def dispose(entry: TrackEntry): Unit = js.native
  
  def drain(): Unit = js.native
  
  var drainDisabled: Boolean = js.native
  
  def end(entry: TrackEntry): Unit = js.native
  
  def event(entry: TrackEntry, event: Event): Unit = js.native
  
  def interrupt(entry: TrackEntry): Unit = js.native
  
  var objects: js.Array[_] = js.native
  
  def start(entry: TrackEntry): Unit = js.native
}
object EventQueue {
  
  @scala.inline
  def apply(
    animState: AnimationState,
    clear: () => Unit,
    complete: TrackEntry => Unit,
    deprecateStuff: () => Boolean,
    dispose: TrackEntry => Unit,
    drain: () => Unit,
    drainDisabled: Boolean,
    end: TrackEntry => Unit,
    event: (TrackEntry, Event) => Unit,
    interrupt: TrackEntry => Unit,
    objects: js.Array[_],
    start: TrackEntry => Unit
  ): EventQueue = {
    val __obj = js.Dynamic.literal(animState = animState.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), complete = js.Any.fromFunction1(complete), deprecateStuff = js.Any.fromFunction0(deprecateStuff), dispose = js.Any.fromFunction1(dispose), drain = js.Any.fromFunction0(drain), drainDisabled = drainDisabled.asInstanceOf[js.Any], end = js.Any.fromFunction1(end), event = js.Any.fromFunction2(event), interrupt = js.Any.fromFunction1(interrupt), objects = objects.asInstanceOf[js.Any], start = js.Any.fromFunction1(start))
    __obj.asInstanceOf[EventQueue]
  }
  
  @scala.inline
  implicit class EventQueueMutableBuilder[Self <: EventQueue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimState(value: AnimationState): Self = StObject.set(x, "animState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComplete(value: TrackEntry => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeprecateStuff(value: () => Boolean): Self = StObject.set(x, "deprecateStuff", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDispose(value: TrackEntry => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDrain(value: () => Unit): Self = StObject.set(x, "drain", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDrainDisabled(value: Boolean): Self = StObject.set(x, "drainDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: TrackEntry => Unit): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEvent(value: (TrackEntry, Event) => Unit): Self = StObject.set(x, "event", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInterrupt(value: TrackEntry => Unit): Self = StObject.set(x, "interrupt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setObjects(value: js.Array[_]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectsVarargs(value: js.Any*): Self = StObject.set(x, "objects", js.Array(value :_*))
    
    @scala.inline
    def setStart(value: TrackEntry => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
  }
}
