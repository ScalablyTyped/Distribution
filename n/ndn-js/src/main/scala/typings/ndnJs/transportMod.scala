package typings.ndnJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/transport", JSImport.Namespace)
@js.native
object transportMod extends js.Object {
  @js.native
  class TcpTransport () extends Transport
  
  @js.native
  abstract class Transport () extends js.Object {
    def isLocal(): Boolean = js.native
  }
  
  @js.native
  abstract class TransportConnectionInfo () extends js.Object
  
  @js.native
  class UnixTransport () extends Transport
  
  @js.native
  class WebSocketTransport () extends Transport
  
  @js.native
  object TcpTransport extends js.Object {
    @js.native
    class ConnectionInfo protected () extends TransportConnectionInfo {
      def this(host: String, port: Double) = this()
      def equals(other: ConnectionInfo): Boolean = js.native
    }
    
  }
  
  /* static members */
  @js.native
  object Transport extends js.Object {
    var ConnectionInfo: TransportConnectionInfo = js.native
  }
  
  @js.native
  object UnixTransport extends js.Object {
    @js.native
    class ConnectionInfo protected () extends TransportConnectionInfo {
      def this(filePath: String) = this()
      def equals(other: ConnectionInfo): Boolean = js.native
    }
    
  }
  
  @js.native
  object WebSocketTransport extends js.Object {
    @js.native
    class ConnectionInfo protected () extends TransportConnectionInfo {
      def this(hostOrUri: String) = this()
      def this(hostOrUri: String, port: Double) = this()
      def equals(other: ConnectionInfo): Boolean = js.native
    }
    
  }
  
}

