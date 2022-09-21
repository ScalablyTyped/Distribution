package typings.nats

import typings.nats.anon.HostnamePort
import typings.nats.anon.Port
import typings.nats.transportMod.Transport
import typings.nats.typesMod.ConnectionOptions
import typings.nats.typesMod.ServerInfo
import typings.nats.utilMod.Deferred_
import typings.node.bufferMod.global.Buffer
import typings.node.netMod.Socket
import typings.node.tlsMod.TLSSocket
import typings.node.tlsMod.TlsOptions
import typings.std.AsyncIterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeTransportMod {
  
  @JSImport("nats/lib/src/node_transport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nats/lib/src/node_transport", "NodeTransport")
  @js.native
  open class NodeTransport ()
    extends StObject
       with Transport {
    
    /* private */ var _closed: Any = js.native
    
    def _send(frame: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    
    var closedNotification: Deferred_[Unit | js.Error] = js.native
    
    def connect(hp: Port, options: ConnectionOptions): js.Promise[Unit] = js.native
    
    var connected: Boolean = js.native
    
    def dial(hp: HostnamePort): js.Promise[Socket] = js.native
    
    var done: Boolean = js.native
    
    @JSName("isClosed")
    def isClosed_MNodeTransport: Boolean = js.native
    
    def iterate(): AsyncIterableIterator[js.typedarray.Uint8Array] = js.native
    
    def loadClientCerts(): js.Promise[TlsOptions | Unit] = js.native
    
    def loadFile(fn: String): js.Promise[Buffer | Unit] = js.native
    
    var options: ConnectionOptions = js.native
    
    def peekInfo(): js.Promise[ServerInfo] = js.native
    
    def setupHandlers(): Unit = js.native
    
    var signal: Deferred_[Unit] = js.native
    
    var socket: Socket = js.native
    
    def startTLS(): js.Promise[TLSSocket] = js.native
    
    var tlsName: String = js.native
    
    var yields: js.Array[js.typedarray.Uint8Array] = js.native
  }
  
  inline def nodeResolveHost(s: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeResolveHost")(s.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
}
