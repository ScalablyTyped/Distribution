package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiMdcTableGridTableTypeMod.GridTableTypeSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcTableTreeTableTypeMod {
  
  @JSImport("sap/ui/mdc/table/TreeTableType", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `TreeTableType`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    *
    * This class does not have its own settings, but all settings applicable to the base type {@link sap.ui.mdc.table.GridTableType#constructor sap.ui.mdc.table.GridTableType }
    * can be used.
    */
  open class default ()
    extends typings.openui5.sapUiMdcTableGridTableTypeMod.default {
    def this(/**
      * Initial settings for the new object
      */
    mSettings: TreeTableTypeSettings) = this()
    def this(/**
      * Optional ID for the new object; generated automatically if no non-empty ID is given
      */
    sId: String) = this()
    def this(
      /**
      * Optional ID for the new object; generated automatically if no non-empty ID is given
      */
    sId: String,
      /**
      * Initial settings for the new object
      */
    mSettings: TreeTableTypeSettings
    ) = this()
    def this(
      /**
      * Optional ID for the new object; generated automatically if no non-empty ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new object
      */
    mSettings: TreeTableTypeSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/table/TreeTableType", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.table.TreeTableType with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.mdc.table.GridTableType.extend}.
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
    oClassInfo: ClassInfo[T, TreeTableType]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, TreeTableType],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.table.TreeTableType.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  type TreeTableType = typings.openui5.sapUiMdcTableGridTableTypeMod.default
  
  type TreeTableTypeSettings = GridTableTypeSettings
}
