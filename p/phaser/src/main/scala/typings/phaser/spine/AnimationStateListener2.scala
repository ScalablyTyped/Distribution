package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationStateListener2 extends StObject {
  
  def complete(entry: TrackEntry): Unit = js.native
  
  def dispose(entry: TrackEntry): Unit = js.native
  
  def end(entry: TrackEntry): Unit = js.native
  
  def event(entry: TrackEntry, event: Event): Unit = js.native
  
  def interrupt(entry: TrackEntry): Unit = js.native
  
  def start(entry: TrackEntry): Unit = js.native
}
object AnimationStateListener2 {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class AnimationStateListener2MutableBuilder[Self <: AnimationStateListener2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: TrackEntry => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDispose(value: TrackEntry => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnd(value: TrackEntry => Unit): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEvent(value: (TrackEntry, Event) => Unit): Self = StObject.set(x, "event", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInterrupt(value: TrackEntry => Unit): Self = StObject.set(x, "interrupt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStart(value: TrackEntry => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
  }
}
