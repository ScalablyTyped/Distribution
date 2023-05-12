package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMTablePersoProviderMod {
  
  @JSImport("sap/m/TablePersoProvider", JSImport.Default)
  @js.native
  /**
    * This is an abstract TablePersoProvider, describing the interface for a real TablePersoProvider.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    *
    * This class does not have its own settings, but all settings applicable to the base type {@link sap.ui.base.ManagedObject#constructor
    * sap.ui.base.ManagedObject} can be used.
    */
  open class default () extends TablePersoProvider
  /* static members */
  object default {
    
    @JSImport("sap/m/TablePersoProvider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.TablePersoProvider with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.ManagedObject.extend}.
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
    oClassInfo: ClassInfo[T, TablePersoProvider]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, TablePersoProvider],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.TablePersoProvider.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait TablePersoProvider
    extends typings.openui5.sapUiBaseManagedObjectMod.default {
    
    /**
      * Removes the personalization bundle.
      *  This must return a {@link http://api.jquery.com/promise/ jQuery promise}.
      */
    def delPersData(): Unit = js.native
    
    /**
      * Callback function which can be used to determine the title of a given column within the TablePersoDialog.
      * As a default, the column header controls are asked for their 'text' or 'title' property. This works in
      * most cases, for example if the header control is an sap.m.Label (has 'text' property) or an sap.m.ObjectListItem
      * (has 'title' property).
      *
      * If the header control used in a column has neither 'text' nor 'title' property, or if you would like
      * to display a modified column name for a certain column, this callback function can be used.
      *
      * If the callback delivers null for a column (which is the default implementation), the default texts described
      * above are displayed for that column in the TablePersoDialog.
      *
      * In case neither the callback delivers null and neither 'text' nor ' title' property are at hand, the
      * TablePersoDialog will display the column id and a warning message is logged.
      */
    def getCaption(
      /**
      * column whose caption shall be determined
      */
    oColumn: typings.openui5.sapMColumnMod.default
    ): Unit = js.native
    
    /**
      * Callback function which can be used to determine the group of a given column within the TablePersoDialog.
      * As a default, the columns are not assigned to a group.
      *
      * This information is used to group the columns within the TablePersoDialog if the TablePersoController's
      * 'group' flag is set, otherwise, the groups are ignored.
      */
    def getGroup(/**
      * column whose group shall be determined
      */
    oColumn: typings.openui5.sapMColumnMod.default): Unit = js.native
    
    /**
      * Retrieves the personalization bundle.
      *  This must return a {@link http://api.jquery.com/promise/ jQuery Promise}, which resolves in the desired
      * table state.
      */
    def getPersData(): Unit = js.native
    
    /**
      * @SINCE 1.88
      *
      * Retrieves the desired reset state. This getter is used by the `TablePersoController` if the `resetAllMode`
      * is `ServiceReset`.
      *
      *
      * This must return a {@link http://api.jquery.com/promise/ jQuery promise}.
      */
    def getResetPersData(): Unit = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Initializes the TablePersoProvider instance after creation.
      */
    def init(): Unit = js.native
    
    /**
      * Resets user’s personalization for a given table so that ‘getPersData’ will deliver its initial state.
      * If no table is specified, all personalizations of the currently logged on user are reset.
      *
      *
      * This must return a {@link http://api.jquery.com/promise/ jQuery promise}.
      */
    def resetPersData(): Unit = js.native
    
    /**
      * Stores the personalization bundle, overwriting any previous bundle completely.
      *  This must return a {@link http://api.jquery.com/promise/ jQuery promise}.
      */
    def setPersData(oBundle: js.Object): Unit = js.native
  }
  
  type TablePersoProviderSettings = ManagedObjectSettings
}
