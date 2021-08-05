package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.MapBrowserPointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerOptions extends StObject {
  
  var handleDownEvent: js.UndefOr[js.Function1[/* event */ MapBrowserPointerEvent, Boolean]] = js.undefined
  
  var handleDragEvent: js.UndefOr[js.Function1[/* event */ MapBrowserPointerEvent, Boolean]] = js.undefined
  
  var handleEvent: js.UndefOr[js.Function1[/* event */ MapBrowserPointerEvent, Boolean]] = js.undefined
  
  var handleMoveEvent: js.UndefOr[js.Function1[/* event */ MapBrowserPointerEvent, Boolean]] = js.undefined
  
  var handleUpEvent: js.UndefOr[js.Function1[/* event */ MapBrowserPointerEvent, Boolean]] = js.undefined
}
object PointerOptions {
  
  inline def apply(): PointerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointerOptions]
  }
  
  extension [Self <: PointerOptions](x: Self) {
    
    inline def setHandleDownEvent(value: /* event */ MapBrowserPointerEvent => Boolean): Self = StObject.set(x, "handleDownEvent", js.Any.fromFunction1(value))
    
    inline def setHandleDownEventUndefined: Self = StObject.set(x, "handleDownEvent", js.undefined)
    
    inline def setHandleDragEvent(value: /* event */ MapBrowserPointerEvent => Boolean): Self = StObject.set(x, "handleDragEvent", js.Any.fromFunction1(value))
    
    inline def setHandleDragEventUndefined: Self = StObject.set(x, "handleDragEvent", js.undefined)
    
    inline def setHandleEvent(value: /* event */ MapBrowserPointerEvent => Boolean): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
    
    inline def setHandleEventUndefined: Self = StObject.set(x, "handleEvent", js.undefined)
    
    inline def setHandleMoveEvent(value: /* event */ MapBrowserPointerEvent => Boolean): Self = StObject.set(x, "handleMoveEvent", js.Any.fromFunction1(value))
    
    inline def setHandleMoveEventUndefined: Self = StObject.set(x, "handleMoveEvent", js.undefined)
    
    inline def setHandleUpEvent(value: /* event */ MapBrowserPointerEvent => Boolean): Self = StObject.set(x, "handleUpEvent", js.Any.fromFunction1(value))
    
    inline def setHandleUpEventUndefined: Self = StObject.set(x, "handleUpEvent", js.undefined)
  }
}
