package typings.mobservable

import typings.mobservable.interfacesMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleeventemitterMod {
  
  @JSImport("mobservable/lib/simpleeventemitter", JSImport.Default)
  @js.native
  class default () extends SimpleEventEmitter
  
  @js.native
  trait SimpleEventEmitter extends StObject {
    
    def emit(data: js.Any*): js.Any = js.native
    
    var listeners: js.Array[js.Function1[/* repeated */ _, Unit]] = js.native
    
    def on(listener: js.Function1[/* repeated */ js.Any, Unit]): Lambda = js.native
    
    def once(listener: js.Function1[/* repeated */ js.Any, Unit]): Lambda = js.native
  }
  object SimpleEventEmitter {
    
    @scala.inline
    def apply(
      emit: /* repeated */ js.Any => js.Any,
      listeners: js.Array[js.Function1[/* repeated */ _, Unit]],
      on: js.Function1[/* repeated */ js.Any, Unit] => Lambda,
      once: js.Function1[/* repeated */ js.Any, Unit] => Lambda
    ): SimpleEventEmitter = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction1(emit), listeners = listeners.asInstanceOf[js.Any], on = js.Any.fromFunction1(on), once = js.Any.fromFunction1(once))
      __obj.asInstanceOf[SimpleEventEmitter]
    }
    
    @scala.inline
    implicit class SimpleEventEmitterMutableBuilder[Self <: SimpleEventEmitter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmit(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "emit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListeners(value: js.Array[js.Function1[/* repeated */ _, Unit]]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenersVarargs(value: (js.Function1[js.Any, Unit])*): Self = StObject.set(x, "listeners", js.Array(value :_*))
      
      @scala.inline
      def setOn(value: js.Function1[/* repeated */ js.Any, Unit] => Lambda): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnce(value: js.Function1[/* repeated */ js.Any, Unit] => Lambda): Self = StObject.set(x, "once", js.Any.fromFunction1(value))
    }
  }
}
