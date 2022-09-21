package typings.openfin

import typings.openfin.wireMod.Wire
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elipcMod {
  
  @JSImport("openfin/_v2/transport/elipc", JSImport.Default)
  @js.native
  open class default protected () extends ElIPCTransport {
    def this(onmessage: js.Function1[/* data */ Any, Unit]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("openfin/_v2/transport/elipc", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("openfin/_v2/transport/elipc", "default.READY_STATE")
    @js.native
    def READY_STATE: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof READY_STATE */ Any = js.native
    inline def READY_STATE_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof READY_STATE */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("READY_STATE")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ElIPCTransport extends Wire {
    
    def onmessage(data: Any): Unit = js.native
    
    def send(data: Any, flags: Any): js.Promise[Any] = js.native
    
    /* protected */ var wire: Any = js.native
  }
}
