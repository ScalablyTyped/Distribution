package typings.mitm

import typings.mitm.mitmStrings.connect
import typings.mitm.mitmStrings.connection
import typings.mitm.mitmStrings.request
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Mitm = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Mitm]
  
  @JSImport("mitm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait BypassableSocket extends Socket {
    
    def bypass(): Unit = js.native
  }
  
  type Callback = SocketConnectCallback | SocketConnectionCallback | HttpCallback
  
  /* Rewritten from type alias, can be one of: 
    - typings.mitm.mitmStrings.connect
    - typings.mitm.mitmStrings.connection
    - typings.mitm.mitmStrings.request
  */
  trait Event extends StObject
  object Event {
    
    inline def connect: typings.mitm.mitmStrings.connect = "connect".asInstanceOf[typings.mitm.mitmStrings.connect]
    
    inline def connection: typings.mitm.mitmStrings.connection = "connection".asInstanceOf[typings.mitm.mitmStrings.connection]
    
    inline def request: typings.mitm.mitmStrings.request = "request".asInstanceOf[typings.mitm.mitmStrings.request]
  }
  
  type HttpCallback = js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse[IncomingMessage], Unit]
  
  @js.native
  trait Mitm extends StObject {
    
    def disable(): Unit = js.native
    
    def on(event: Event, callback: Callback): Unit = js.native
    @JSName("on")
    def on_connect(event: connect, callback: SocketConnectCallback): Unit = js.native
    @JSName("on")
    def on_connection(event: connection, callback: SocketConnectionCallback): Unit = js.native
    @JSName("on")
    def on_request(event: request, callback: HttpCallback): Unit = js.native
  }
  
  type SocketConnectCallback = js.Function2[/* socket */ BypassableSocket, /* opts */ SocketOptions, Unit]
  
  type SocketConnectionCallback = js.Function2[/* socket */ Socket, /* opts */ SocketOptions, Unit]
  
  trait SocketOptions extends StObject {
    
    var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
    
    var family: js.UndefOr[Double] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var localAddress: js.UndefOr[String] = js.undefined
    
    var localPort: js.UndefOr[String] = js.undefined
    
    var port: Double
  }
  object SocketOptions {
    
    inline def apply(port: Double): SocketOptions = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketOptions]
    }
    
    extension [Self <: SocketOptions](x: Self) {
      
      inline def setAllowHalfOpen(value: Boolean): Self = StObject.set(x, "allowHalfOpen", value.asInstanceOf[js.Any])
      
      inline def setAllowHalfOpenUndefined: Self = StObject.set(x, "allowHalfOpen", js.undefined)
      
      inline def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setLocalPort(value: String): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
      
      inline def setLocalPortUndefined: Self = StObject.set(x, "localPort", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
}
