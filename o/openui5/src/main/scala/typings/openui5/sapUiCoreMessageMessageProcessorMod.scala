package typings.openui5

import typings.openui5.anon.NewMessages
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreMessageMessageProcessorMod {
  
  @JSImport("sap/ui/core/message/MessageProcessor", JSImport.Default)
  @js.native
  /**
    * Constructor for a new MessageProcessor
    */
  open class default () extends MessageProcessor
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/message/MessageProcessor", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.message.MessageProcessor with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, MessageProcessor]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MessageProcessor],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.message.MessageProcessor.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait MessageProcessor
    extends typings.openui5.sapUiBaseEventProviderMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:messageChange messageChange} event of this `sap.ui.core.message.MessageProcessor`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.message.MessageProcessor` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMessageChange(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachMessageChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with, defaults to this `MessageProcessor` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:messageChange messageChange} event of this `sap.ui.core.message.MessageProcessor`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.message.MessageProcessor` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMessageChange(
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
    def attachMessageChange(
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
      * Context object to call the event handler with, defaults to this `MessageProcessor` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Implement in inheriting classes
      */
    def checkMessages(): Unit = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:messageChange messageChange} event of this
      * `sap.ui.core.message.MessageProcessor`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachMessageChange(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachMessageChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Fires event {@link #event:messageChange messageChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireMessageChange(/**
      * Parameters to pass along with the event
      */
    mParameters: NewMessages): this.type = js.native
    
    /**
      * Returns the ID of the MessageProcessor instance
      *
      * @returns sId The MessageProcessor ID
      */
    def getId(): String = js.native
    
    /**
      * Implement in inheriting classes
      */
    def setMessages(
      /**
      * map of messages: {'target': [sap.ui.core.message.Message],...}
      */
    mMessages: Record[String, js.Array[typings.openui5.sapUiCoreMessageMessageMod.default]]
    ): Unit = js.native
  }
}
