package typings.nats

import typings.nats.anon.Hostname
import typings.nats.anon.Port
import typings.node.bufferMod.global.Buffer
import typings.node.netMod.Socket
import typings.node.tlsMod.TLSSocket
import typings.node.tlsMod.TlsOptions
import typings.std.AsyncIterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcNodeTransportMod {
  
  @JSImport("nats/lib/src/node_transport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Transport * / any */ @JSImport("nats/lib/src/node_transport", "NodeTransport")
  @js.native
  open class NodeTransport () extends StObject {
    
    /* private */ var _closed: Any = js.native
    
    def _send(frame: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    
    def close(): js.Promise[Unit] = js.native
    def close(err: js.Error): js.Promise[Unit] = js.native
    
    def closed(): js.Promise[Unit | js.Error] = js.native
    
    var closedNotification: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Deferred<void | Error> */ Any = js.native
    
    def connect(
      hp: Hostname,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConnectionOptions */ Any
    ): js.Promise[Unit] = js.native
    
    var connected: Boolean = js.native
    
    def dial(hp: Port): js.Promise[Socket] = js.native
    
    def disconnect(): Unit = js.native
    
    var done: Boolean = js.native
    
    def isClosed: Boolean = js.native
    
    def isEncrypted(): Boolean = js.native
    
    def iterate(): AsyncIterableIterator[js.typedarray.Uint8Array] = js.native
    
    var lang: String = js.native
    
    def loadClientCerts(): js.Promise[TlsOptions | Unit] = js.native
    
    def loadFile(fn: String): js.Promise[Buffer | Unit] = js.native
    
    var options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConnectionOptions */ Any = js.native
    
    def peekInfo(): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServerInfo */ Any
      ] = js.native
    
    def send(frame: js.typedarray.Uint8Array): Unit = js.native
    
    def setupHandlers(): Unit = js.native
    
    var signal: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Deferred<void> */ Any = js.native
    
    var socket: Socket = js.native
    
    def startTLS(): js.Promise[TLSSocket] = js.native
    
    var tlsName: String = js.native
    
    var version: String = js.native
    
    var yields: js.Array[js.typedarray.Uint8Array] = js.native
  }
  
  inline def nodeResolveHost(s: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeResolveHost")(s.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
}
