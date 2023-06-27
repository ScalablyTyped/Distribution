package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreMessageMessageParserMod {
  
  @JSImport("sap/ui/core/message/MessageParser", JSImport.Default)
  @js.native
  /**
    * Abstract MessageParser class to be inherited in back-end specific implementations.
    */
  open class default () extends MessageParser
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/message/MessageParser", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.message.MessageParser with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.Object.extend}.
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
    oClassInfo: ClassInfo[T, MessageParser]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MessageParser],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.message.MessageParser.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait MessageParser
    extends typings.openui5.sapUiBaseObjectMod.default {
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns the registered processor on which the events for message handling can be fired
      *
      * @returns The currently set MessageProcessor or `null` if none is set
      */
    def getProcessor(): typings.openui5.sapUiCoreMessageMessageProcessorMod.default | Null = js.native
    
    /**
      * Abstract parse method must be implemented in the inheriting class.
      */
    def parse(
      /**
      * The response from the server containing body and headers
      */
    oResponse: js.Object,
      /**
      * The original request that lead to this response
      */
    oRequest: js.Object
    ): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * This method is used by the model to register itself as MessageProcessor for this parser
      *
      * @returns Instance reference for method chaining
      */
    def setProcessor(
      /**
      * The MessageProcessor that can be used to fire events
      */
    oProcessor: typings.openui5.sapUiCoreMessageMessageProcessorMod.default
    ): this.type = js.native
  }
}
