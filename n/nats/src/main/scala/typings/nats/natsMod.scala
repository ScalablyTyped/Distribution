package typings.nats

import typings.nats.anon.PartialRequestManyOptions
import typings.nats.protocolMod.ProtocolHandler
import typings.nats.queuedIteratorMod.QueuedIterator
import typings.nats.semverMod.SemVer
import typings.nats.typesMod.ConnectionOptions
import typings.nats.typesMod.Msg
import typings.nats.typesMod.NatsConnection
import typings.nats.typesMod.ServerInfo
import typings.nats.typesMod.Status
import typings.nats.typesMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object natsMod {
  
  @JSImport("nats/lib/nats-base-client/nats", "NatsConnectionImpl")
  @js.native
  /* private */ open class NatsConnectionImpl ()
    extends StObject
       with NatsConnection {
    
    def _check(subject: String, sub: Boolean, pub: Boolean): Unit = js.native
    
    def _resub(s: Subscription, subject: String): Unit = js.native
    def _resub(s: Subscription, subject: String, max: Double): Unit = js.native
    
    var draining: Boolean = js.native
    
    def getServerVersion(): js.UndefOr[SemVer] = js.native
    
    @JSName("info")
    def info_MNatsConnectionImpl: js.UndefOr[ServerInfo] = js.native
    
    var listeners: js.Array[QueuedIterator[Status]] = js.native
    
    var options: ConnectionOptions = js.native
    
    var protocol: ProtocolHandler = js.native
    
    def requestMany(subject: String): js.Promise[QueuedIterator[Msg | js.Error]] = js.native
    def requestMany(subject: String, data: js.typedarray.Uint8Array): js.Promise[QueuedIterator[Msg | js.Error]] = js.native
    def requestMany(subject: String, data: js.typedarray.Uint8Array, opts: PartialRequestManyOptions): js.Promise[QueuedIterator[Msg | js.Error]] = js.native
    def requestMany(subject: String, data: Unit, opts: PartialRequestManyOptions): js.Promise[QueuedIterator[Msg | js.Error]] = js.native
  }
  /* static members */
  object NatsConnectionImpl {
    
    @JSImport("nats/lib/nats-base-client/nats", "NatsConnectionImpl")
    @js.native
    val ^ : js.Any = js.native
    
    inline def connect(): js.Promise[NatsConnection] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")().asInstanceOf[js.Promise[NatsConnection]]
    inline def connect(opts: ConnectionOptions): js.Promise[NatsConnection] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[NatsConnection]]
  }
}
