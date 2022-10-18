package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelContextMod {
  
  @JSImport("sap/ui/model/Context", JSImport.Default)
  @js.native
  open class default protected () extends Context {
    /**
      * Constructor for Context class.
      */
    def this(
      /**
      * the model
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * the binding path
      */
    sPath: String
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/Context", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.Context with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, Context]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Context],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.Context.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Context
    extends typings.openui5.sapUiBaseObjectMod.default {
    
    /**
      * @SINCE 1.76.0
      *
      * Returns messages associated with this context, that is messages belonging to the object referred to by
      * this context or a child object of that object. The messages are sorted by their {@link sap.ui.core.message.Message#getType
      * type} according to the type's severity in a way that messages with highest severity come first.
      * See:
      * 	sap.ui.model.Model#getMessages
      *
      * @returns The messages associated with this context sorted by severity; empty array in case no messages
      * exist
      */
    def getMessages(): js.Array[typings.openui5.sapUiCoreMessageMessageMod.default] = js.native
    
    /**
      * Getter for model
      *
      * @returns the model
      */
    def getModel(): typings.openui5.sapUiModelModelMod.default = js.native
    
    /**
      * Gets the (model dependent) object the context points to or the object with the given relative binding
      * path
      *
      * @returns the context object
      */
    def getObject(): js.Object = js.native
    def getObject(/**
      * the binding path
      */
    sPath: String): js.Object = js.native
    def getObject(
      /**
      * the binding path
      */
    sPath: String,
      /**
      * additional model specific parameters (optional)
      */
    mParameters: js.Object
    ): js.Object = js.native
    def getObject(
      /**
      * the binding path
      */
    sPath: Unit,
      /**
      * additional model specific parameters (optional)
      */
    mParameters: js.Object
    ): js.Object = js.native
    
    /**
      * Getter for path of the context itself or a subpath
      *
      * @returns the binding path
      */
    def getPath(): String = js.native
    def getPath(/**
      * the binding path (optional)
      */
    sPath: String): String = js.native
    
    /**
      * Gets the property with the given relative binding path
      *
      * @returns the property value
      */
    def getProperty(/**
      * the binding path
      */
    sPath: String): Any = js.native
  }
}
