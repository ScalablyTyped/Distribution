package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiCoreWsWebSocketMod.WebSocket$MessageEventParameters
import typings.std.Blob
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreWsSapPcpWebSocketMod {
  
  @JSImport("sap/ui/core/ws/SapPcpWebSocket", JSImport.Default)
  @js.native
  open class default protected () extends SapPcpWebSocket {
    /**
      * Creates a new WebSocket connection and uses the pcp-protocol for communication.
      */
    def this(/**
      * relative or absolute URL for WebSocket connection.
      */
    sUrl: String) = this()
    def this(
      /**
      * relative or absolute URL for WebSocket connection.
      */
    sUrl: String,
      /**
      * array of protocols as strings, a single protocol as a string. Protocol(s) should be selected from {@link sap.ui.core.ws.SapPcpWebSocket.SUPPORTED_PROTOCOLS}.
      */
    aProtocols: js.Array[Any]
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/ws/SapPcpWebSocket", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Protocol versions.
      *
      * One (or more) of these have to be selected to create an SapPcpWebSocket connection (or no protocol at
      * all).
      */
    @JSImport("sap/ui/core/ws/SapPcpWebSocket", "default.SUPPORTED_PROTOCOLS")
    @js.native
    def SUPPORTED_PROTOCOLS: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SUPPORTED_PROTOCOLS */ Any = js.native
    inline def SUPPORTED_PROTOCOLS_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SUPPORTED_PROTOCOLS */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUPPORTED_PROTOCOLS")(x.asInstanceOf[js.Any])
    
    /**
      * Creates a new subclass of class sap.ui.core.ws.SapPcpWebSocket with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.ws.WebSocket.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SapPcpWebSocket]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SapPcpWebSocket],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.ws.SapPcpWebSocket.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  sealed trait SUPPORTED_PROTOCOLS extends StObject
  /**
    * Protocol versions.
    *
    * One (or more) of these have to be selected to create an SapPcpWebSocket connection (or no protocol at
    * all).
    */
  @JSImport("sap/ui/core/ws/SapPcpWebSocket", "SUPPORTED_PROTOCOLS")
  @js.native
  object SUPPORTED_PROTOCOLS extends StObject {
    
    @js.native
    sealed trait v10
      extends StObject
         with SUPPORTED_PROTOCOLS
  }
  
  @js.native
  trait SapPcpWebSocket
    extends typings.openui5.sapUiCoreWsWebSocketMod.default {
    
    def fireMessage(
      /**
      * Parameters to pass along with the event
      */
    oParameters: SapPcpWebSocket$MessageEventParameters
    ): this.type = js.native
    
    def send(
      /**
      * message to send
      */
    message: String,
      /**
      * additional pcp-fields as key-value map
      */
    oPcpFields: js.Object
    ): this.type = js.native
    def send(/**
      * message to send
      */
    message: js.typedarray.ArrayBuffer): this.type = js.native
    def send(
      /**
      * message to send
      */
    message: js.typedarray.ArrayBuffer,
      /**
      * additional pcp-fields as key-value map
      */
    oPcpFields: js.Object
    ): this.type = js.native
    def send(/**
      * message to send
      */
    message: Blob): this.type = js.native
    def send(
      /**
      * message to send
      */
    message: Blob,
      /**
      * additional pcp-fields as key-value map
      */
    oPcpFields: js.Object
    ): this.type = js.native
  }
  
  trait SapPcpWebSocket$MessageEventParameters
    extends StObject
       with WebSocket$MessageEventParameters {
    
    /**
      * Received pcpFields as a key-value map.
      */
    var pcpFields: js.UndefOr[String] = js.undefined
  }
  object SapPcpWebSocket$MessageEventParameters {
    
    inline def apply(): SapPcpWebSocket$MessageEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SapPcpWebSocket$MessageEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SapPcpWebSocket$MessageEventParameters] (val x: Self) extends AnyVal {
      
      inline def setPcpFields(value: String): Self = StObject.set(x, "pcpFields", value.asInstanceOf[js.Any])
      
      inline def setPcpFieldsUndefined: Self = StObject.set(x, "pcpFields", js.undefined)
    }
  }
  
  type SapPcpWebSocketMessageEvent = typings.openui5.sapUiBaseEventMod.default[SapPcpWebSocket$MessageEventParameters]
  
  type SapPcpWebSocketMessageEventParameters = SapPcpWebSocket$MessageEventParameters
}
