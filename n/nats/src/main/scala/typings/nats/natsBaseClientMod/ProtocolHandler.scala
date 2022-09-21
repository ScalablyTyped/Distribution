package typings.nats.natsBaseClientMod

import typings.nats.protocolMod.Publisher
import typings.nats.typesMod.ConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/src/nats-base-client", "ProtocolHandler")
@js.native
open class ProtocolHandler protected ()
  extends typings.nats.internalModMod.ProtocolHandler {
  def this(options: ConnectionOptions, publisher: Publisher) = this()
}
/* static members */
object ProtocolHandler {
  
  @JSImport("nats/lib/src/nats-base-client", "ProtocolHandler")
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect(options: ConnectionOptions, publisher: Publisher): js.Promise[typings.nats.protocolMod.ProtocolHandler] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any], publisher.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nats.protocolMod.ProtocolHandler]]
  
  inline def toError(s: String): typings.nats.errorMod.NatsError = ^.asInstanceOf[js.Dynamic].applyDynamic("toError")(s.asInstanceOf[js.Any]).asInstanceOf[typings.nats.errorMod.NatsError]
}
