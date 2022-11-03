package typings.openui5

import typings.openui5.jQuery.Promise
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiTableLibraryMod.ResetAllMode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTableTablePersoControllerMod {
  
  @JSImport("sap/ui/table/TablePersoController", JSImport.Default)
  @js.native
  /**
    * Constructor for a new TablePersoController.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends TablePersoController {
    def this(/**
      * initial settings for the new control
      */
    mSettings: TablePersoControllerSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: TablePersoControllerSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: TablePersoControllerSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/table/TablePersoController", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.table.TablePersoController with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, TablePersoController]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, TablePersoController],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.table.TablePersoController.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait TablePersoController
    extends typings.openui5.sapUiBaseManagedObjectMod.default {
    
    /**
      * Gets current value of property {@link #getAutoSave autoSave}.
      *
      * Auto save state
      *
      * Default value is `true`.
      *
      * @returns Value of property `autoSave`
      */
    def getAutoSave(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getCustomDataKey customDataKey}.
      *
      * By defining a custom data key the `TablePersoController` will try to get the key for saving the perso
      * data from the custom data of the Table and Column instead of creating it by concatenating the ID of the
      * Table and the Column. Basically this will be more stable than using the auto IDs.
      *
      * Default value is `"persoKey"`.
      *
      * @returns Value of property `customDataKey`
      */
    def getCustomDataKey(): String = js.native
    
    /**
      * Gets current value of property {@link #getPersoService persoService}.
      *
      * Personalization Service object. Needs to have the following methods:
      * 	 - getPersData() : `jQuery Promise` (http://api.jquery.com/promise/)
      * 	 - setPersData(oBundle) : `jQuery Promise` (http://api.jquery.com/promise/)
      * 	 - delPersData() : `jQuery Promise` (http://api.jquery.com/promise/)
      *
      * @returns Value of property `persoService`
      */
    def getPersoService(): Any = js.native
    
    /**
      * Gets current value of property {@link #getResetAllMode resetAllMode}.
      *
      * Controls the behavior of the Reset button of the `TablePersoDialog`.
      *  The value must be specified in the constructor and cannot be set or modified later.
      *  If set to `Default`, the Reset button sets the table back to the initial state of the attached table
      * when the controller is activated.
      *  If set to `ServiceDefault`, the Reset button goes back to the initial settings of `persoService`.
      *  If set to `ServiceReset`, the Reset button calls the `getResetPersData` of the attached `persoService`
      * and uses it to reset the table.
      *
      *
      * Default value is `Default`.
      *
      * @returns Value of property `resetAllMode`
      */
    def getResetAllMode(): ResetAllMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ResetAllMode * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getShowResetAll showResetAll}.
      *
      * Controls the visibility of the Reset button of the `TablePersoDialog`.
      *
      *
      * Default value is `true`.
      *
      * @returns Value of property `showResetAll`
      */
    def getShowResetAll(): Boolean = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getTable table}, or `null`.
      */
    def getTable(): ID = js.native
    
    /**
      * @EXPERIMENTAL (since 1.21.2) - API might change / feature requires the sap.m library!
      *
      * Opens the personalization dialog for the Table to modify the visibility and the order of the columns.
      *
      * Using this functionality will require to load the sap.m library because the personalization dialog
      * is only available in this library for now.
      */
    def openDialog(mSettings: js.Object): Unit = js.native
    
    /**
      * Refresh the personalizations (reloads data from service).
      *
      * @returns `jQuery Promise` which is resolved once the refresh is finished
      */
    def refresh(): Promise[Any] = js.native
    
    /**
      * Saves the current personalization state.
      *
      * @returns `jQuery Promise` which is resolved once the save is finished
      */
    def savePersonalizations(): Promise[Any] = js.native
    
    /**
      * Sets a new value for property {@link #getAutoSave autoSave}.
      *
      * Auto save state
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAutoSave(): this.type = js.native
    def setAutoSave(/**
      * New value for property `autoSave`
      */
    bAutoSave: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getCustomDataKey customDataKey}.
      *
      * By defining a custom data key the `TablePersoController` will try to get the key for saving the perso
      * data from the custom data of the Table and Column instead of creating it by concatenating the ID of the
      * Table and the Column. Basically this will be more stable than using the auto IDs.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"persoKey"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCustomDataKey(): this.type = js.native
    def setCustomDataKey(/**
      * New value for property `customDataKey`
      */
    sCustomDataKey: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPersoService persoService}.
      *
      * Personalization Service object. Needs to have the following methods:
      * 	 - getPersData() : `jQuery Promise` (http://api.jquery.com/promise/)
      * 	 - setPersData(oBundle) : `jQuery Promise` (http://api.jquery.com/promise/)
      * 	 - delPersData() : `jQuery Promise` (http://api.jquery.com/promise/)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPersoService(/**
      * New value for property `persoService`
      */
    oPersoService: Any): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getResetAllMode resetAllMode}.
      *
      * Controls the behavior of the Reset button of the `TablePersoDialog`.
      *  The value must be specified in the constructor and cannot be set or modified later.
      *  If set to `Default`, the Reset button sets the table back to the initial state of the attached table
      * when the controller is activated.
      *  If set to `ServiceDefault`, the Reset button goes back to the initial settings of `persoService`.
      *  If set to `ServiceReset`, the Reset button calls the `getResetPersData` of the attached `persoService`
      * and uses it to reset the table.
      *
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Default`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setResetAllMode(): this.type = js.native
    def setResetAllMode(
      /**
      * New value for property `resetAllMode`
      */
    sResetAllMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ResetAllMode * / any */ String
    ): this.type = js.native
    def setResetAllMode(/**
      * New value for property `resetAllMode`
      */
    sResetAllMode: ResetAllMode): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowResetAll showResetAll}.
      *
      * Controls the visibility of the Reset button of the `TablePersoDialog`.
      *
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowResetAll(): this.type = js.native
    def setShowResetAll(/**
      * New value for property `showResetAll`
      */
    bShowResetAll: Boolean): this.type = js.native
    
    /**
      * Sets the associated {@link #getTable table}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTable(
      /**
      * ID of an element which becomes the new target of this table association; alternatively, an element instance
      * may be given
      */
    oTable: ID
    ): this.type = js.native
    def setTable(
      /**
      * ID of an element which becomes the new target of this table association; alternatively, an element instance
      * may be given
      */
    oTable: typings.openui5.sapUiTableTableMod.default
    ): this.type = js.native
  }
  
  trait TablePersoControllerSettings
    extends StObject
       with ManagedObjectSettings {
    
    /**
      * Auto save state
      */
    var autoSave: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * By defining a custom data key the `TablePersoController` will try to get the key for saving the perso
      * data from the custom data of the Table and Column instead of creating it by concatenating the ID of the
      * Table and the Column. Basically this will be more stable than using the auto IDs.
      */
    var customDataKey: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Personalization Service object. Needs to have the following methods:
      * 	 - getPersData() : `jQuery Promise` (http://api.jquery.com/promise/)
      * 	 - setPersData(oBundle) : `jQuery Promise` (http://api.jquery.com/promise/)
      * 	 - delPersData() : `jQuery Promise` (http://api.jquery.com/promise/)
      */
    var persoService: js.UndefOr[Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Controls the behavior of the Reset button of the `TablePersoDialog`.
      *  The value must be specified in the constructor and cannot be set or modified later.
      *  If set to `Default`, the Reset button sets the table back to the initial state of the attached table
      * when the controller is activated.
      *  If set to `ServiceDefault`, the Reset button goes back to the initial settings of `persoService`.
      *  If set to `ServiceReset`, the Reset button calls the `getResetPersData` of the attached `persoService`
      * and uses it to reset the table.
      */
    var resetAllMode: js.UndefOr[
        ResetAllMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ResetAllMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Controls the visibility of the Reset button of the `TablePersoDialog`.
      */
    var showResetAll: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The target table of this controller.
      */
    var table: js.UndefOr[typings.openui5.sapUiTableTableMod.default | String] = js.undefined
  }
  object TablePersoControllerSettings {
    
    inline def apply(): TablePersoControllerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TablePersoControllerSettings]
    }
    
    extension [Self <: TablePersoControllerSettings](x: Self) {
      
      inline def setAutoSave(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setCustomDataKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "customDataKey", value.asInstanceOf[js.Any])
      
      inline def setCustomDataKeyUndefined: Self = StObject.set(x, "customDataKey", js.undefined)
      
      inline def setPersoService(value: Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "persoService", value.asInstanceOf[js.Any])
      
      inline def setPersoServiceUndefined: Self = StObject.set(x, "persoService", js.undefined)
      
      inline def setResetAllMode(
        value: ResetAllMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ResetAllMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "resetAllMode", value.asInstanceOf[js.Any])
      
      inline def setResetAllModeUndefined: Self = StObject.set(x, "resetAllMode", js.undefined)
      
      inline def setShowResetAll(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showResetAll", value.asInstanceOf[js.Any])
      
      inline def setShowResetAllUndefined: Self = StObject.set(x, "showResetAll", js.undefined)
      
      inline def setTable(value: typings.openui5.sapUiTableTableMod.default | String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    }
  }
}
