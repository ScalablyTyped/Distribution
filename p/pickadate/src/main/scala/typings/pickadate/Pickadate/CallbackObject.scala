package typings.pickadate.Pickadate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallbackObject extends StObject {
  
  var close: js.UndefOr[js.Function0[Unit]] = js.native
  
  var open: js.UndefOr[js.Function0[Unit]] = js.native
  
  var render: js.UndefOr[js.Function0[Unit]] = js.native
  
  var set: js.UndefOr[js.Function1[/* thingSet */ js.Any, Unit]] = js.native
  
  var start: js.UndefOr[js.Function0[Unit]] = js.native
  
  var stop: js.UndefOr[js.Function0[Unit]] = js.native
}
object CallbackObject {
  
  @scala.inline
  def apply(): CallbackObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbackObject]
  }
  
  @scala.inline
  implicit class CallbackObjectMutableBuilder[Self <: CallbackObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setRender(value: () => Unit): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    @scala.inline
    def setSet(value: /* thingSet */ js.Any => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    @scala.inline
    def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
