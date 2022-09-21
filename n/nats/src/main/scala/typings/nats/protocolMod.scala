package typings.nats

import typings.nats.anon.Lang
import typings.nats.anon.Reply
import typings.nats.databufferMod.DataBuffer
import typings.nats.errorMod.NatsError
import typings.nats.heartbeatsMod.Heartbeat
import typings.nats.muxsubscriptionMod.MuxSubscription
import typings.nats.parserMod.MsgArg
import typings.nats.parserMod.Parser
import typings.nats.parserMod.ParserEvent
import typings.nats.queuedIteratorMod.Dispatcher
import typings.nats.queuedIteratorMod.QueuedIterator
import typings.nats.requestMod.Request
import typings.nats.serversMod.ServerImpl
import typings.nats.serversMod.Servers
import typings.nats.subscriptionMod.SubscriptionImpl
import typings.nats.subscriptionsMod.Subscriptions
import typings.nats.transportMod.Transport
import typings.nats.typesMod.ConnectionOptions
import typings.nats.typesMod.PublishOptions
import typings.nats.typesMod.Server
import typings.nats.typesMod.ServerInfo
import typings.nats.typesMod.Status
import typings.nats.typesMod.Subscription
import typings.nats.utilMod.Deferred_
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolMod {
  
  @JSImport("nats/lib/nats-base-client/protocol", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nats/lib/nats-base-client/protocol", "Connect")
  @js.native
  open class Connect protected () extends StObject {
    def this(transport: Lang, opts: ConnectionOptions) = this()
    def this(transport: Lang, opts: ConnectionOptions, nonce: String) = this()
    
    var auth_token: js.UndefOr[String] = js.native
    
    var echo: js.UndefOr[Boolean] = js.native
    
    var headers: js.UndefOr[Boolean] = js.native
    
    var jwt: js.UndefOr[String] = js.native
    
    var lang: String = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var nkey: js.UndefOr[String] = js.native
    
    var no_responders: js.UndefOr[Boolean] = js.native
    
    var pass: js.UndefOr[String] = js.native
    
    var pedantic: js.UndefOr[Boolean] = js.native
    
    var protocol: Double = js.native
    
    var sig: js.UndefOr[String] = js.native
    
    var tls_required: js.UndefOr[Boolean] = js.native
    
    var user: js.UndefOr[String] = js.native
    
    var verbose: js.UndefOr[Boolean] = js.native
    
    var version: String = js.native
  }
  
  @JSImport("nats/lib/nats-base-client/protocol", "INFO")
  @js.native
  val INFO: js.RegExp = js.native
  
  @JSImport("nats/lib/nats-base-client/protocol", "ProtocolHandler")
  @js.native
  open class ProtocolHandler protected ()
    extends StObject
       with Dispatcher[ParserEvent] {
    def this(options: ConnectionOptions, publisher: Publisher) = this()
    
    /* private */ var _close: Any = js.native
    
    var _closed: Boolean = js.native
    
    def _doDial(srv: Server): js.Promise[Unit] = js.native
    
    def _sub(s: SubscriptionImpl): Unit = js.native
    
    def _subunsub(s: SubscriptionImpl): SubscriptionImpl = js.native
    
    var abortReconnect: Boolean = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    var closed: Deferred_[js.Error | Unit] = js.native
    
    var connectError: js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Error], Unit]] = js.native
    
    var connected: Boolean = js.native
    
    var connectedOnce: Boolean = js.native
    
    def dial(srv: Server): js.Promise[Unit] = js.native
    
    def dialLoop(): js.Promise[Unit] = js.native
    
    def disconnect(): Unit = js.native
    
    def disconnected(): js.Promise[Unit] = js.native
    def disconnected(_err: js.Error): js.Promise[Unit] = js.native
    
    def dispatchStatus(status: Status): Unit = js.native
    
    def drain(): js.Promise[Unit] = js.native
    
    def flush(): js.Promise[Unit] = js.native
    def flush(p: Deferred_[Unit]): js.Promise[Unit] = js.native
    
    /* private */ var flushPending: Any = js.native
    
    def getServer(): js.UndefOr[ServerImpl] = js.native
    
    def handleAuthError(err: NatsError): Unit = js.native
    
    def handleError(err: NatsError): js.Promise[Unit] = js.native
    
    var heartbeats: Heartbeat = js.native
    
    var inBytes: Double = js.native
    
    var inMsgs: Double = js.native
    
    var info: js.UndefOr[ServerInfo] = js.native
    
    var infoReceived: Boolean = js.native
    
    /* private */ var initMux: Any = js.native
    
    def isClosed(): Boolean = js.native
    
    var lastError: js.UndefOr[NatsError] = js.native
    
    var listeners: js.Array[QueuedIterator[Status]] = js.native
    
    var muxSubscriptions: MuxSubscription = js.native
    
    var noMorePublishing: Boolean = js.native
    
    var options: ConnectionOptions = js.native
    
    var outBytes: Double = js.native
    
    var outMsgs: Double = js.native
    
    var outbound: DataBuffer = js.native
    
    var parser: Parser = js.native
    
    var pendingLimit: Double = js.native
    
    var pongs: js.Array[Deferred_[Unit]] = js.native
    
    /* private */ var prepare: Any = js.native
    
    def processError(m: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    
    def processInfo(m: js.typedarray.Uint8Array): Unit = js.native
    
    def processMsg(msg: MsgArg, data: js.typedarray.Uint8Array): Unit = js.native
    
    def processPing(): Unit = js.native
    
    def processPong(): Unit = js.native
    
    def publish(subject: String, data: js.typedarray.Uint8Array): Unit = js.native
    def publish(subject: String, data: js.typedarray.Uint8Array, options: PublishOptions): Unit = js.native
    
    var publisher: Publisher = js.native
    
    /* CompleteClass */
    override def push(v: ParserEvent): Unit = js.native
    
    def request(r: Request): Request = js.native
    
    def resetOutbound(): Unit = js.native
    
    def resub(s: SubscriptionImpl, subject: String): Unit = js.native
    
    /* private */ var selectServer: Any = js.native
    
    def sendCommand(cmd: String, payloads: js.typedarray.Uint8Array*): Unit = js.native
    def sendCommand(cmd: js.typedarray.Uint8Array, payloads: js.typedarray.Uint8Array*): Unit = js.native
    
    def sendSubscriptions(): Unit = js.native
    
    var server: ServerImpl = js.native
    
    var servers: Servers = js.native
    
    def status(): AsyncIterable[Status] = js.native
    
    def subscribe(s: SubscriptionImpl): Subscription = js.native
    
    var subscriptions: Subscriptions = js.native
    
    var transport: Transport = js.native
    
    def unsub(s: SubscriptionImpl): Unit = js.native
    def unsub(s: SubscriptionImpl, max: Double): Unit = js.native
    
    def unsubscribe(s: SubscriptionImpl): Unit = js.native
    def unsubscribe(s: SubscriptionImpl, max: Double): Unit = js.native
  }
  /* static members */
  object ProtocolHandler {
    
    @JSImport("nats/lib/nats-base-client/protocol", "ProtocolHandler")
    @js.native
    val ^ : js.Any = js.native
    
    inline def connect(options: ConnectionOptions, publisher: Publisher): js.Promise[ProtocolHandler] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any], publisher.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProtocolHandler]]
    
    inline def toError(s: String): NatsError = ^.asInstanceOf[js.Dynamic].applyDynamic("toError")(s.asInstanceOf[js.Any]).asInstanceOf[NatsError]
  }
  
  inline def createInbox(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createInbox")().asInstanceOf[String]
  inline def createInbox(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createInbox")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @js.native
  trait Publisher extends StObject {
    
    def publish(subject: String, data: js.typedarray.Uint8Array): Unit = js.native
    def publish(subject: String, data: js.typedarray.Uint8Array, options: Reply): Unit = js.native
  }
}
