package typings.ndnJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportMod {
  
  @JSImport("ndn-js/transport", "TcpTransport")
  @js.native
  open class TcpTransport () extends Transport
  object TcpTransport {
    
    @JSImport("ndn-js/transport", "TcpTransport.ConnectionInfo")
    @js.native
    open class ConnectionInfo protected () extends TransportConnectionInfo {
      def this(host: String, port: Double) = this()
      
      def equals(other: ConnectionInfo): Boolean = js.native
    }
  }
  
  /* note: abstract class */ @JSImport("ndn-js/transport", "Transport")
  @js.native
  open class Transport () extends StObject {
    
    def isLocal(): Boolean = js.native
  }
  /* static members */
  object Transport {
    
    @JSImport("ndn-js/transport", "Transport")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ndn-js/transport", "Transport.ConnectionInfo")
    @js.native
    def ConnectionInfo: TransportConnectionInfo = js.native
    inline def ConnectionInfo_=(x: TransportConnectionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConnectionInfo")(x.asInstanceOf[js.Any])
  }
  
  /* note: abstract class */ @JSImport("ndn-js/transport", "TransportConnectionInfo")
  @js.native
  open class TransportConnectionInfo () extends StObject
  
  @JSImport("ndn-js/transport", "UnixTransport")
  @js.native
  open class UnixTransport () extends Transport
  object UnixTransport {
    
    @JSImport("ndn-js/transport", "UnixTransport.ConnectionInfo")
    @js.native
    open class ConnectionInfo protected () extends TransportConnectionInfo {
      def this(filePath: String) = this()
      
      def equals(other: ConnectionInfo): Boolean = js.native
    }
  }
  
  @JSImport("ndn-js/transport", "WebSocketTransport")
  @js.native
  open class WebSocketTransport () extends Transport
  object WebSocketTransport {
    
    @JSImport("ndn-js/transport", "WebSocketTransport.ConnectionInfo")
    @js.native
    open class ConnectionInfo protected () extends TransportConnectionInfo {
      def this(hostOrUri: String) = this()
      def this(hostOrUri: String, port: Double) = this()
      
      def equals(other: ConnectionInfo): Boolean = js.native
    }
  }
}
