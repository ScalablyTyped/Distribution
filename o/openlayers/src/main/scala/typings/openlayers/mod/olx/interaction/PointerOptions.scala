package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.MapBrowserPointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointerOptions extends js.Object {
  
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
  implicit class PointerOptionsOps[Self <: PointerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHandleDownEvent(value: /* event */ MapBrowserPointerEvent => Boolean): Self = this.set("handleDownEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHandleDownEvent: Self = this.set("handleDownEvent", js.undefined)
    
    @scala.inline
    def setHandleDragEvent(value: /* event */ MapBrowserPointerEvent => Boolean): Self = this.set("handleDragEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHandleDragEvent: Self = this.set("handleDragEvent", js.undefined)
    
    @scala.inline
    def setHandleEvent(value: /* event */ MapBrowserPointerEvent => Boolean): Self = this.set("handleEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHandleEvent: Self = this.set("handleEvent", js.undefined)
    
    @scala.inline
    def setHandleMoveEvent(value: /* event */ MapBrowserPointerEvent => Boolean): Self = this.set("handleMoveEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHandleMoveEvent: Self = this.set("handleMoveEvent", js.undefined)
    
    @scala.inline
    def setHandleUpEvent(value: /* event */ MapBrowserPointerEvent => Boolean): Self = this.set("handleUpEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHandleUpEvent: Self = this.set("handleUpEvent", js.undefined)
  }
}
