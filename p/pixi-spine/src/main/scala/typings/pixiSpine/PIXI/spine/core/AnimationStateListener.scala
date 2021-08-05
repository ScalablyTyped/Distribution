package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationStateListener extends StObject {
  
  var complete: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.undefined
  
  var dispose: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.undefined
  
  var end: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.undefined
  
  var event: js.UndefOr[js.Function2[/* entry */ TrackEntry, /* event */ Event, Unit]] = js.undefined
  
  var interrupt: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.undefined
  
  var start: js.UndefOr[js.Function1[/* entry */ TrackEntry, Unit]] = js.undefined
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
    
    inline def setEvent(value: (/* entry */ TrackEntry, /* event */ Event) => Unit): Self = StObject.set(x, "event", js.Any.fromFunction2(value))
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setInterrupt(value: /* entry */ TrackEntry => Unit): Self = StObject.set(x, "interrupt", js.Any.fromFunction1(value))
    
    inline def setInterruptUndefined: Self = StObject.set(x, "interrupt", js.undefined)
    
    inline def setStart(value: /* entry */ TrackEntry => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
