package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreMessageMessageManagerMod {
  
  @JSImport("sap/ui/core/message/MessageManager", JSImport.Default)
  @js.native
  /**
    * Constructor for a new MessageManager.
    */
  open class default () extends MessageManager
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/message/MessageManager", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.message.MessageManager with name `sClassName` and enriches
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
    oClassInfo: ClassInfo[T, MessageManager]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MessageManager],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.message.MessageManager.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait MessageManager
    extends typings.openui5.sapUiBaseEventProviderMod.default {
    
    def addMessages(
      /**
      * Array of sap.ui.core.message.Message or single sap.ui.core.message.Message
      */
    vMessages: js.Array[typings.openui5.sapUiCoreMessageMessageMod.default]
    ): Unit = js.native
    /**
      * Add messages to MessageManager
      */
    def addMessages(
      /**
      * Array of sap.ui.core.message.Message or single sap.ui.core.message.Message
      */
    vMessages: typings.openui5.sapUiCoreMessageMessageMod.default
    ): Unit = js.native
    
    /**
      * Get the MessageModel
      *
      * @returns oMessageModel The Message Model
      */
    def getMessageModel(): typings.openui5.sapUiModelMessageMessageModelMod.default = js.native
    
    /**
      * Register MessageProcessor
      */
    def registerMessageProcessor(
      /**
      * The MessageProcessor
      */
    oProcessor: typings.openui5.sapUiCoreMessageMessageProcessorMod.default
    ): Unit = js.native
    
    /**
      * When using the databinding type system, the validation/parsing of a new property value could fail. In
      * this case, a validationError/parseError event is fired. These events bubble up to the core. For registered
      * ManagedObjects, the MessageManager attaches to these events and creates a `sap.ui.core.message.Message`
      * (bHandleValidation=true) for each of these errors and cancels the event bubbling.
      */
    def registerObject(
      /**
      * The sap.ui.base.ManagedObject
      */
    oObject: typings.openui5.sapUiBaseManagedObjectMod.default,
      /**
      * Handle validationError/parseError events for this object. If set to true, the MessageManager creates
      * a Message for each validation/parse error. The event bubbling is canceled in every case.
      */
    bHandleValidation: Boolean
    ): Unit = js.native
    
    /**
      * Remove all messages
      */
    def removeAllMessages(): Unit = js.native
    
    def removeMessages(
      /**
      * The message(s) to be removed.
      */
    vMessages: js.Array[typings.openui5.sapUiCoreMessageMessageMod.default]
    ): Unit = js.native
    /**
      * Remove given Messages
      */
    def removeMessages(
      /**
      * The message(s) to be removed.
      */
    vMessages: typings.openui5.sapUiCoreMessageMessageMod.default
    ): Unit = js.native
    
    /**
      * Deregister MessageProcessor
      */
    def unregisterMessageProcessor(
      /**
      * The MessageProcessor
      */
    oProcessor: typings.openui5.sapUiCoreMessageMessageProcessorMod.default
    ): Unit = js.native
    
    /**
      * Unregister ManagedObject
      */
    def unregisterObject(
      /**
      * The sap.ui.base.ManagedObject
      */
    oObject: typings.openui5.sapUiBaseManagedObjectMod.default
    ): Unit = js.native
  }
}
