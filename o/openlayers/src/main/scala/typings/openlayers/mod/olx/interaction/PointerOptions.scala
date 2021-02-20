package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.MapBrowserPointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointerOptions extends StObject {
  
  var handleDownEvent: js.UndefOr[js.Function1[/* event */ MapBrowserPointerEvent, Boolean]] = js.native
  
  var handleDragEvent: js.UndefOr[js.Function1[/* event */ MapBrowserPointerEvent, Boolean]] = js.native
  
  var handleEvent: js.UndefOr[js.Function1[/* event */ MapBrowserPointerEvent, Boolean]] = js.native
  
  var handleMoveEvent: js.UndefOr[js.Function1[/* event */ MapBrowserPointerEvent, Boolean]] = js.native
  
  var handleUpEvent: js.UndefOr[js.Function1[/* event */ MapBrowserPointerEvent, Boolean]] = js.native
}
object PointerOptions {
  
  @scala.inline
  def apply(): PointerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointerOptions]
  }
  
  @scala.inline
  implicit class PointerOptionsMutableBuilder[Self <: PointerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandleDownEvent(value: /* event */ MapBrowserPointerEvent => Boolean): Self = StObject.set(x, "handleDownEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleDownEventUndefined: Self = StObject.set(x, "handleDownEvent", js.undefined)
    
    @scala.inline
    def setHandleDragEvent(value: /* event */ MapBrowserPointerEvent => Boolean): Self = StObject.set(x, "handleDragEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleDragEventUndefined: Self = StObject.set(x, "handleDragEvent", js.undefined)
    
    @scala.inline
    def setHandleEvent(value: /* event */ MapBrowserPointerEvent => Boolean): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleEventUndefined: Self = StObject.set(x, "handleEvent", js.undefined)
    
    @scala.inline
    def setHandleMoveEvent(value: /* event */ MapBrowserPointerEvent => Boolean): Self = StObject.set(x, "handleMoveEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleMoveEventUndefined: Self = StObject.set(x, "handleMoveEvent", js.undefined)
    
    @scala.inline
    def setHandleUpEvent(value: /* event */ MapBrowserPointerEvent => Boolean): Self = StObject.set(x, "handleUpEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleUpEventUndefined: Self = StObject.set(x, "handleUpEvent", js.undefined)
  }
}
