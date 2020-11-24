package typings.openui5.global.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.core.ws")
@js.native
object ws extends js.Object {
  
  @js.native
  object ReadyState extends js.Object {
    
    /**
      * The connection has been closed or could not be opened.
      */
    var CLOSED: js.Any = js.native
    
    /**
      * The connection is going through the closing handshake.
      */
    var CLOSING: js.Any = js.native
    
    /**
      * The connection has not yet been established.
      */
    var CONNECTING: js.Any = js.native
    
    /**
      * The WebSocket connection is established and communication is possible.
      */
    var OPEN: js.Any = js.native
  }
  
  @js.native
  class SapPcpWebSocket protected ()
    extends typings.openui5.sap.ui.core.ws.SapPcpWebSocket {
    /**
      * Creates a new WebSocket connection and uses the pcp-protocol for communication.
      * @param sUrl relative or absolute URL for WebSocket connection.
      * @param aProtocols array of protocols as strings, a single protocol as a string.Protocol(s) should be
      * selected from {@link sap.ui.core.ws.SapPcpWebSocket.SUPPORTED_PROTOCOLS}.
      */
    def this(sUrl: String) = this()
    def this(sUrl: String, aProtocols: js.Array[_]) = this()
  }
  @js.native
  object SapPcpWebSocket extends js.Object {
    
    @js.native
    object SUPPORTED_PROTOCOLS extends js.Object {
      
      /**
        * Protocol v10.pcp.sap.com
        */
      var v10: js.Any = js.native
    }
  }
  
  @js.native
  class WebSocket protected ()
    extends typings.openui5.sap.ui.core.ws.WebSocket {
    /**
      * Creates a new WebSocket connection.
      * @param sUrl relative or absolute URL for WebSocket connection.
      * @param aProtocols array of protocols as strings, a single protocol as a string
      */
    def this(sUrl: String) = this()
    def this(sUrl: String, aProtocols: js.Array[_]) = this()
  }
}
