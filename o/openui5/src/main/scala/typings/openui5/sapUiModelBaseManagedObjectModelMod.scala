package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelBaseManagedObjectModelMod {
  
  @JSImport("sap/ui/model/base/ManagedObjectModel", JSImport.Default)
  @js.native
  open class default protected () extends ManagedObjectModel {
    /**
      * The ManagedObjectModel class allows you to bind to properties and aggregations of managed objects.
      */
    def this(/**
      * the managed object models root object
      */
    oObject: typings.openui5.sapUiBaseManagedObjectMod.default) = this()
    def this(
      /**
      * the managed object models root object
      */
    oObject: typings.openui5.sapUiBaseManagedObjectMod.default,
      /**
      * an object for custom data
      */
    oData: js.Object
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/base/ManagedObjectModel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.base.ManagedObjectModel with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.json.JSONModel.extend}.
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
    oClassInfo: ClassInfo[T, ManagedObjectModel]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ManagedObjectModel],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.base.ManagedObjectModel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait ManagedObjectModel
    extends typings.openui5.sapUiModelJsonJsonmodelMod.default {
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Private method iterating the registered bindings of this model instance and initiating their check for
      * update
      */
    def checkUpdate(
      bAsync: Boolean,
      /**
      * an optional test function to filter the binding
      */
    fnFilter: js.Function
    ): Unit = js.native
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Private method iterating the registered bindings of this model instance and initiating their check for
      * update
      */
    def checkUpdate(
      bForceUpdate: Boolean,
      bAsync: Boolean,
      /**
      * an optional test function to filter the binding
      */
    fnFilter: js.Function
    ): Unit = js.native
  }
}
