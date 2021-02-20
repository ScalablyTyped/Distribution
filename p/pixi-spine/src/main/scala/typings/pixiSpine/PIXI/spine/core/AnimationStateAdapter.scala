package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationStateAdapter extends AnimationStateListener {
  
  @JSName("complete")
  def complete_MAnimationStateAdapter(entry: TrackEntry): Unit = js.native
  
  @JSName("dispose")
  def dispose_MAnimationStateAdapter(entry: TrackEntry): Unit = js.native
  
  @JSName("end")
  def end_MAnimationStateAdapter(entry: TrackEntry): Unit = js.native
  
  @JSName("event")
  def event_MAnimationStateAdapter(entry: TrackEntry, event: Event): Unit = js.native
  
  @JSName("interrupt")
  def interrupt_MAnimationStateAdapter(entry: TrackEntry): Unit = js.native
  
  @JSName("start")
  def start_MAnimationStateAdapter(entry: TrackEntry): Unit = js.native
}
object AnimationStateAdapter {
  
  @scala.inline
  def apply(
    complete: TrackEntry => Unit,
    dispose: TrackEntry => Unit,
    end: TrackEntry => Unit,
    event: (TrackEntry, Event) => Unit,
    interrupt: TrackEntry => Unit,
    start: TrackEntry => Unit
  ): AnimationStateAdapter = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), dispose = js.Any.fromFunction1(dispose), end = js.Any.fromFunction1(end), event = js.Any.fromFunction2(event), interrupt = js.Any.fromFunction1(interrupt), start = js.Any.fromFunction1(start))
    __obj.asInstanceOf[AnimationStateAdapter]
  }
  
  @scala.inline
  implicit class AnimationStateAdapterMutableBuilder[Self <: AnimationStateAdapter] (val x: Self) extends AnyVal {
    
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
