package typings.openfin

import typings.openfin.wireMod.Wire
import typings.ws.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/transport/websocket", JSImport.Namespace)
@js.native
object websocketMod extends js.Object {
  @js.native
  trait WebSocketTransport extends Wire {
    var wire: ^ = js.native
    def onmessage(data: js.Any): Unit = js.native
    def send(data: js.Any, flags: js.Any): js.Promise[_] = js.native
  }
  
  @js.native
  class default protected () extends WebSocketTransport {
    def this(onmessage: js.Function1[/* data */ js.Any, Unit]) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var READY_STATE: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof READY_STATE */ js.Any = js.native
  }
  
}

