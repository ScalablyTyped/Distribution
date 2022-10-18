package typings.nextServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibMittMod {
  
  @JSImport("next-server/dist/lib/mitt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): MittEmitter = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[MittEmitter]
  
  @js.native
  trait Handler extends StObject {
    
    def apply(evts: Any*): Unit = js.native
  }
  
  trait MittEmitter extends StObject {
    
    def emit(`type`: String, evts: Any*): Unit
    
    def off(`type`: String, handler: Handler): Unit
    
    def on(`type`: String, handler: Handler): Unit
  }
  object MittEmitter {
    
    inline def apply(
      emit: (String, /* repeated */ Any) => Unit,
      off: (String, Handler) => Unit,
      on: (String, Handler) => Unit
    ): MittEmitter = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on))
      __obj.asInstanceOf[MittEmitter]
    }
    
    extension [Self <: MittEmitter](x: Self) {
      
      inline def setEmit(value: (String, /* repeated */ Any) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      inline def setOff(value: (String, Handler) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      inline def setOn(value: (String, Handler) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    }
  }
}
