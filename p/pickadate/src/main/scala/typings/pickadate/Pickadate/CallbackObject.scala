package typings.pickadate.Pickadate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbackObject extends StObject {
  
  var close: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var open: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var render: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var set: js.UndefOr[js.Function1[/* thingSet */ Any, Unit]] = js.undefined
  
  var start: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var stop: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object CallbackObject {
  
  inline def apply(): CallbackObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbackObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallbackObject] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setRender(value: () => Unit): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setSet(value: /* thingSet */ Any => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
