package typings.mobservable

import typings.mobservable.libInterfacesMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSimpleeventemitterMod {
  
  @JSImport("mobservable/lib/simpleeventemitter", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with SimpleEventEmitter {
    
    /* CompleteClass */
    override def emit(data: Any*): Any = js.native
    
    /* CompleteClass */
    var listeners: js.Array[js.Function1[/* repeated */ Any, Unit]] = js.native
    
    /* CompleteClass */
    override def on(listener: js.Function1[/* repeated */ Any, Unit]): Lambda = js.native
    
    /* CompleteClass */
    override def once(listener: js.Function1[/* repeated */ Any, Unit]): Lambda = js.native
  }
  
  trait SimpleEventEmitter extends StObject {
    
    def emit(data: Any*): Any
    
    var listeners: js.Array[js.Function1[/* repeated */ Any, Unit]]
    
    def on(listener: js.Function1[/* repeated */ Any, Unit]): Lambda
    
    def once(listener: js.Function1[/* repeated */ Any, Unit]): Lambda
  }
  object SimpleEventEmitter {
    
    inline def apply(
      emit: /* repeated */ Any => Any,
      listeners: js.Array[js.Function1[/* repeated */ Any, Unit]],
      on: js.Function1[/* repeated */ Any, Unit] => Lambda,
      once: js.Function1[/* repeated */ Any, Unit] => Lambda
    ): SimpleEventEmitter = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction1(emit), listeners = listeners.asInstanceOf[js.Any], on = js.Any.fromFunction1(on), once = js.Any.fromFunction1(once))
      __obj.asInstanceOf[SimpleEventEmitter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimpleEventEmitter] (val x: Self) extends AnyVal {
      
      inline def setEmit(value: /* repeated */ Any => Any): Self = StObject.set(x, "emit", js.Any.fromFunction1(value))
      
      inline def setListeners(value: js.Array[js.Function1[/* repeated */ Any, Unit]]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      inline def setListenersVarargs(value: (js.Function1[/* repeated */ Any, Unit])*): Self = StObject.set(x, "listeners", js.Array(value*))
      
      inline def setOn(value: js.Function1[/* repeated */ Any, Unit] => Lambda): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
      
      inline def setOnce(value: js.Function1[/* repeated */ Any, Unit] => Lambda): Self = StObject.set(x, "once", js.Any.fromFunction1(value))
    }
  }
}
