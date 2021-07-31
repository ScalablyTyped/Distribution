package typings.openui5.global.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ws {
  
  object ReadyState {
    
    @JSGlobal("sap.ui.core.ws.ReadyState")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The connection has been closed or could not be opened.
      */
    @JSGlobal("sap.ui.core.ws.ReadyState.CLOSED")
    @js.native
    def CLOSED: js.Any = js.native
    @scala.inline
    def CLOSED_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSED")(x.asInstanceOf[js.Any])
    
    /**
      * The connection is going through the closing handshake.
      */
    @JSGlobal("sap.ui.core.ws.ReadyState.CLOSING")
    @js.native
    def CLOSING: js.Any = js.native
    @scala.inline
    def CLOSING_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSING")(x.asInstanceOf[js.Any])
    
    /**
      * The connection has not yet been established.
      */
    @JSGlobal("sap.ui.core.ws.ReadyState.CONNECTING")
    @js.native
    def CONNECTING: js.Any = js.native
    @scala.inline
    def CONNECTING_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTING")(x.asInstanceOf[js.Any])
    
    /**
      * The WebSocket connection is established and communication is possible.
      */
    @JSGlobal("sap.ui.core.ws.ReadyState.OPEN")
    @js.native
    def OPEN: js.Any = js.native
    @scala.inline
    def OPEN_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("sap.ui.core.ws.SapPcpWebSocket")
  @js.native
  class SapPcpWebSocket protected ()
    extends StObject
       with typings.openui5.sap.ui.core.ws.SapPcpWebSocket {
    /**
      * Creates a new WebSocket connection and uses the pcp-protocol for communication.
      * @param sUrl relative or absolute URL for WebSocket connection.
      * @param aProtocols array of protocols as strings, a single protocol as a string.Protocol(s) should be
      * selected from {@link sap.ui.core.ws.SapPcpWebSocket.SUPPORTED_PROTOCOLS}.
      */
    def this(sUrl: String) = this()
    def this(sUrl: String, aProtocols: js.Array[js.Any]) = this()
  }
  object SapPcpWebSocket {
    
    object SUPPORTED_PROTOCOLS {
      
      @JSGlobal("sap.ui.core.ws.SapPcpWebSocket.SUPPORTED_PROTOCOLS")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Protocol v10.pcp.sap.com
        */
      @JSGlobal("sap.ui.core.ws.SapPcpWebSocket.SUPPORTED_PROTOCOLS.v10")
      @js.native
      def v10: js.Any = js.native
      @scala.inline
      def v10_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v10")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSGlobal("sap.ui.core.ws.WebSocket")
  @js.native
  class WebSocket protected ()
    extends StObject
       with typings.openui5.sap.ui.core.ws.WebSocket {
    /**
      * Creates a new WebSocket connection.
      * @param sUrl relative or absolute URL for WebSocket connection.
      * @param aProtocols array of protocols as strings, a single protocol as a string
      */
    def this(sUrl: String) = this()
    def this(sUrl: String, aProtocols: js.Array[js.Any]) = this()
  }
}
