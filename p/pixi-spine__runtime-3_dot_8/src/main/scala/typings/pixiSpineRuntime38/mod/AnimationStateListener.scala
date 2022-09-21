package typings.pixiSpineRuntime38.mod

import typings.pixiSpineBase.mod.IAnimationStateListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationStateListener
  extends StObject
     with IAnimationStateListener {
  
  /** Invoked every time this entry's animation completes a loop. */
  @JSName("complete")
  var complete_AnimationStateListener: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.undefined
  
  /** Invoked when this entry will be disposed. This may occur without the entry ever being set as the current entry.
    * References to the entry should not be kept after dispose is called, as it may be destroyed or reused. */
  @JSName("dispose")
  var dispose_AnimationStateListener: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.undefined
  
  /** Invoked when this entry is no longer the current entry and will never be applied again. */
  @JSName("end")
  var end_AnimationStateListener: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.undefined
  
  /** Invoked when this entry's animation triggers an event. */
  @JSName("event")
  var event_AnimationStateListener: js.UndefOr[js.Function2[/* entry */ TrackEntry, /* event */ Event2, Unit]] = js.undefined
  
  /** Invoked when another entry has replaced this entry as the current entry. This entry may continue being applied for
    * mixing. */
  @JSName("interrupt")
  var interrupt_AnimationStateListener: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.undefined
  
  /** Invoked when this entry has been set as the current entry. */
  @JSName("start")
  var start_AnimationStateListener: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.undefined
}
object AnimationStateListener {
  
  inline def apply(): AnimationStateListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationStateListener]
  }
  
  extension [Self <: AnimationStateListener](x: Self) {
    
    inline def setComplete(value: /* entry */ TrackEntry => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDispose(value: /* entry */ TrackEntry => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction1(value))
    
    inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
    
    inline def setEnd(value: /* entry */ TrackEntry => Unit): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setEvent(value: (/* entry */ TrackEntry, /* event */ Event2) => Unit): Self = StObject.set(x, "event", js.Any.fromFunction2(value))
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setInterrupt(value: /* entry */ TrackEntry => Unit): Self = StObject.set(x, "interrupt", js.Any.fromFunction1(value))
    
    inline def setInterruptUndefined: Self = StObject.set(x, "interrupt", js.undefined)
    
    inline def setStart(value: /* entry */ TrackEntry => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
