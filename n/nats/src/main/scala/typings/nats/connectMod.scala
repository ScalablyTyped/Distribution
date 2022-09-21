package typings.nats

import typings.nats.typesMod.ConnectionOptions
import typings.nats.typesMod.NatsConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectMod {
  
  @JSImport("nats/lib/src/connect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect(): js.Promise[NatsConnection] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")().asInstanceOf[js.Promise[NatsConnection]]
  inline def connect(opts: ConnectionOptions): js.Promise[NatsConnection] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[NatsConnection]]
}
