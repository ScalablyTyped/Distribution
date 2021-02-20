package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationStateListener extends StObject {
  
  var complete: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.native
  
  var dispose: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.native
  
  var end: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.native
  
  var event: js.UndefOr[js.Function2[/* entry */ TrackEntry, /* event */ Event, Unit]] = js.native
  
  var interrupt: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.native
  
  var start: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.native
}
object AnimationStateListener {
  
  @scala.inline
  def apply(): AnimationStateListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationStateListener]
  }
  
  @scala.inline
  implicit class AnimationStateListenerMutableBuilder[Self <: AnimationStateListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* entry */ TrackEntry => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setDispose(value: /* entry */ TrackEntry => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
    
    @scala.inline
    def setEnd(value: /* entry */ TrackEntry => Unit): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setEvent(value: (/* entry */ TrackEntry, /* event */ Event) => Unit): Self = StObject.set(x, "event", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setInterrupt(value: /* entry */ TrackEntry => Unit): Self = StObject.set(x, "interrupt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInterruptUndefined: Self = StObject.set(x, "interrupt", js.undefined)
    
    @scala.inline
    def setStart(value: /* entry */ TrackEntry => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
