package typings.openfin

import typings.openfin.wireMod.Wire
import typings.ws.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object websocketMod {
  
  @JSImport("openfin/_v2/transport/websocket", JSImport.Default)
  @js.native
  class default protected () extends WebSocketTransport {
    def this(onmessage: js.Function1[/* data */ js.Any, Unit]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("openfin/_v2/transport/websocket", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("openfin/_v2/transport/websocket", "default.READY_STATE")
    @js.native
    def READY_STATE: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof READY_STATE */ js.Any = js.native
    @scala.inline
    def READY_STATE_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof READY_STATE */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("READY_STATE")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait WebSocketTransport extends Wire {
    
    def onmessage(data: js.Any): Unit = js.native
    
    def send(data: js.Any, flags: js.Any): js.Promise[js.Any] = js.native
    
    var wire: ^ = js.native
  }
}
