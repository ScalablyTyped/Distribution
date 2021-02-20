package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mittMod {
  
  @JSImport("next/dist/next-server/lib/mitt", JSImport.Default)
  @js.native
  def default(): MittEmitter = js.native
  
  type Handler = js.Function1[/* repeated */ js.Any, Unit]
  
  @js.native
  trait MittEmitter extends StObject {
    
    def emit(`type`: String, evts: js.Any*): Unit = js.native
    
    def off(`type`: String, handler: Handler): Unit = js.native
    
    def on(`type`: String, handler: Handler): Unit = js.native
  }
  object MittEmitter {
    
    @scala.inline
    def apply(
      emit: (String, /* repeated */ js.Any) => Unit,
      off: (String, Handler) => Unit,
      on: (String, Handler) => Unit
    ): MittEmitter = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on))
      __obj.asInstanceOf[MittEmitter]
    }
    
    @scala.inline
    implicit class MittEmitterMutableBuilder[Self <: MittEmitter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmit(value: (String, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOff(value: (String, Handler) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOn(value: (String, Handler) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    }
  }
}
