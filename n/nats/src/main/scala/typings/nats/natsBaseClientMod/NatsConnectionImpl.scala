package typings.nats.natsBaseClientMod

import typings.nats.typesMod.ConnectionOptions
import typings.nats.typesMod.NatsConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/src/nats-base-client", "NatsConnectionImpl")
@js.native
/* private */ open class NatsConnectionImpl ()
  extends typings.nats.internalModMod.NatsConnectionImpl
/* static members */
object NatsConnectionImpl {
  
  @JSImport("nats/lib/src/nats-base-client", "NatsConnectionImpl")
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect(): js.Promise[NatsConnection] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")().asInstanceOf[js.Promise[NatsConnection]]
  inline def connect(opts: ConnectionOptions): js.Promise[NatsConnection] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[NatsConnection]]
}
