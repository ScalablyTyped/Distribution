package typings.nats

import typings.nats.anon.Hostname
import typings.nats.anon.PartialfnDnsResolveFnrand
import typings.nats.anon.PartialfnDnsResolveFnrandFn
import typings.nats.anon.Partialrandomizeboolean
import typings.nats.typesMod.Server
import typings.nats.typesMod.ServerInfo
import typings.nats.typesMod.ServersChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serversMod {
  
  @JSImport("nats/lib/nats-base-client/servers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nats/lib/nats-base-client/servers", "ServerImpl")
  @js.native
  open class ServerImpl protected ()
    extends StObject
       with Server {
    def this(u: String) = this()
    def this(u: String, gossiped: Boolean) = this()
    
    var didConnect: Boolean = js.native
    
    var gossiped: Boolean = js.native
    
    /* CompleteClass */
    var hostname: String = js.native
    
    var lastConnect: Double = js.native
    
    /* CompleteClass */
    var listen: String = js.native
    
    /* CompleteClass */
    var port: Double = js.native
    
    var reconnects: Double = js.native
    
    def resolve(opts: PartialfnDnsResolveFnrand): js.Promise[js.Array[Server]] = js.native
    /* CompleteClass */
    override def resolve(opts: PartialfnDnsResolveFnrandFn): js.Promise[js.Array[Server]] = js.native
    
    var resolves: js.UndefOr[js.Array[Server]] = js.native
    
    /* CompleteClass */
    var src: String = js.native
    
    /* CompleteClass */
    var tlsName: String = js.native
  }
  
  @JSImport("nats/lib/nats-base-client/servers", "Servers")
  @js.native
  open class Servers () extends StObject {
    def this(listens: js.Array[String]) = this()
    def this(listens: js.Array[String], opts: Partialrandomizeboolean) = this()
    def this(listens: Unit, opts: Partialrandomizeboolean) = this()
    
    def addServer(u: String): Unit = js.native
    def addServer(u: String, `implicit`: Boolean): Unit = js.native
    
    /* private */ var currentServer: Any = js.native
    
    /* private */ var firstSelect: Any = js.native
    
    def getCurrentServer(): ServerImpl = js.native
    
    def getServers(): js.Array[ServerImpl] = js.native
    
    def length(): Double = js.native
    
    def next(): js.UndefOr[ServerImpl] = js.native
    
    /* private */ var randomize: Any = js.native
    
    def removeCurrentServer(): Unit = js.native
    
    def removeServer(): Unit = js.native
    def removeServer(server: ServerImpl): Unit = js.native
    
    def selectServer(): js.UndefOr[ServerImpl] = js.native
    
    /* private */ val servers: Any = js.native
    
    /* private */ var tlsName: Any = js.native
    
    def update(info: ServerInfo): ServersChanged = js.native
    
    def updateTLSName(): Unit = js.native
  }
  
  inline def hostPort(u: String): Hostname = ^.asInstanceOf[js.Dynamic].applyDynamic("hostPort")(u.asInstanceOf[js.Any]).asInstanceOf[Hostname]
  
  inline def isIPV4OrHostname(hp: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPV4OrHostname")(hp.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
