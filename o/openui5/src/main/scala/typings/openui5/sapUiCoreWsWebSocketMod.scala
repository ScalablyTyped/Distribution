package typings.openui5

import typings.openui5.anon.Code
import typings.openui5.anon.`39`
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiCoreWsReadyStateMod.ReadyState
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreWsWebSocketMod {
  
  @JSImport("sap/ui/core/ws/WebSocket", JSImport.Default)
  @js.native
  open class default protected () extends WebSocket {
    /**
      * Creates a new WebSocket connection.
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
      * array of protocols as strings, a single protocol as a string
      */
    aProtocols: js.Array[Any]
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/ws/WebSocket", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.ws.WebSocket with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.EventProvider.extend}.
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
    oClassInfo: ClassInfo[T, WebSocket]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, WebSocket],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.ws.WebSocket.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait WebSocket
    extends typings.openui5.sapUiBaseEventProviderMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:close close} event of this `sap.ui.core.ws.WebSocket`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.ws.WebSocket` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClose(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `WebSocket` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:close close} event of this `sap.ui.core.ws.WebSocket`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.ws.WebSocket` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClose(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function
    ): this.type = js.native
    def attachClose(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `WebSocket` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:error error} event of this `sap.ui.core.ws.WebSocket`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.ws.WebSocket` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachError(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachError(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `WebSocket` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:error error} event of this `sap.ui.core.ws.WebSocket`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.ws.WebSocket` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachError(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function
    ): this.type = js.native
    def attachError(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `WebSocket` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:message message} event of this `sap.ui.core.ws.WebSocket`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.ws.WebSocket` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMessage(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachMessage(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `WebSocket` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:message message} event of this `sap.ui.core.ws.WebSocket`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.ws.WebSocket` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMessage(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function
    ): this.type = js.native
    def attachMessage(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `WebSocket` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:open open} event of this `sap.ui.core.ws.WebSocket`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.ws.WebSocket` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOpen(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `WebSocket` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:open open} event of this `sap.ui.core.ws.WebSocket`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.ws.WebSocket` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOpen(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function
    ): this.type = js.native
    def attachOpen(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `WebSocket` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Closes the connection.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def close(): this.type = js.native
    def close(
      /**
      * Status code that explains why the connection is closed. Must either be 1000, or between 3000 and 4999
      */
    iCode: Unit,
      /**
      * Closing reason as a string
      */
    sReason: String
    ): this.type = js.native
    def close(
      /**
      * Status code that explains why the connection is closed. Must either be 1000, or between 3000 and 4999
      */
    iCode: int
    ): this.type = js.native
    def close(
      /**
      * Status code that explains why the connection is closed. Must either be 1000, or between 3000 and 4999
      */
    iCode: int,
      /**
      * Closing reason as a string
      */
    sReason: String
    ): this.type = js.native
    def close(/**
      * Closing reason as a string
      */
    sReason: String): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:close close} event of this `sap.ui.core.ws.WebSocket`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachClose(/**
      * The function to call, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachClose(
      /**
      * The function to call, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:error error} event of this `sap.ui.core.ws.WebSocket`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachError(/**
      * The function to call, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachError(
      /**
      * The function to call, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:message message} event of this `sap.ui.core.ws.WebSocket`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachMessage(/**
      * The function to call, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachMessage(
      /**
      * The function to call, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:open open} event of this `sap.ui.core.ws.WebSocket`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachOpen(/**
      * The function to call, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachOpen(
      /**
      * The function to call, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:close close} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireClose(): this.type = js.native
    def fireClose(/**
      * Parameters to pass along with the event
      */
    oParameters: Code): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:error error} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireError(): this.type = js.native
    def fireError(/**
      * Parameters to pass along with the event
      */
    oParameters: js.Object): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:message message} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireMessage(): this.type = js.native
    def fireMessage(/**
      * Parameters to pass along with the event
      */
    oParameters: `39`): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:open open} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireOpen(): this.type = js.native
    def fireOpen(/**
      * Parameters to pass along with the event
      */
    oParameters: js.Object): this.type = js.native
    
    /**
      * Getter for the protocol selected by the server once the connection is open.
      *
      * @returns protocol
      */
    def getProtocol(): String = js.native
    
    /**
      * Getter for WebSocket readyState.
      *
      * @returns readyState
      */
    def getReadyState(): ReadyState = js.native
    
    /**
      * Sends a message.
      *
      * If the connection is not yet opened, the message will be queued and sent when the connection is established.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def send(/**
      * Message to send
      */
    sMessage: String): this.type = js.native
  }
}
