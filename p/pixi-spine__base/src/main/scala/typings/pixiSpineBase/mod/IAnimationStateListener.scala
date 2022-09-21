package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnimationStateListener extends StObject {
  
  var complete: js.UndefOr[js.Function1[/* entry */ ITrackEntry, Unit]] = js.undefined
  
  var dispose: js.UndefOr[js.Function1[/* entry */ ITrackEntry, Unit]] = js.undefined
  
  var end: js.UndefOr[js.Function1[/* entry */ ITrackEntry, Unit]] = js.undefined
  
  var event: js.UndefOr[js.Function2[/* entry */ ITrackEntry, /* event */ IEvent, Unit]] = js.undefined
  
  var interrupt: js.UndefOr[js.Function1[/* entry */ ITrackEntry, Unit]] = js.undefined
  
  var start: js.UndefOr[js.Function1[/* entry */ ITrackEntry, Unit]] = js.undefined
}
object IAnimationStateListener {
  
  inline def apply(): IAnimationStateListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAnimationStateListener]
  }
  
  extension [Self <: IAnimationStateListener](x: Self) {
    
    inline def setComplete(value: /* entry */ ITrackEntry => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDispose(value: /* entry */ ITrackEntry => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction1(value))
    
    inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
    
    inline def setEnd(value: /* entry */ ITrackEntry => Unit): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setEvent(value: (/* entry */ ITrackEntry, /* event */ IEvent) => Unit): Self = StObject.set(x, "event", js.Any.fromFunction2(value))
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setInterrupt(value: /* entry */ ITrackEntry => Unit): Self = StObject.set(x, "interrupt", js.Any.fromFunction1(value))
    
    inline def setInterruptUndefined: Self = StObject.set(x, "interrupt", js.undefined)
    
    inline def setStart(value: /* entry */ ITrackEntry => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
