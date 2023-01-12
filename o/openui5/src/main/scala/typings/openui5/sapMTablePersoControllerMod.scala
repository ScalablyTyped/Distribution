package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.ResetAllMode
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMTablePersoControllerMod {
  
  @JSImport("sap/m/TablePersoController", JSImport.Default)
  @js.native
  /**
    * The TablePersoController can be used to connect a table that you want to provide a personalization dialog
    * for, with a persistence service such as one provided by the unified shell.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends TablePersoController {
    def this(/**
      * optional map/JSON-object with initial settings for the new component instance
      */
    mSettings: TablePersoControllerSettings) = this()
    def this(/**
      * optional id for the new control; generated automatically if no non-empty id is given Note: this can be
      * omitted, no matter whether `mSettings` will be given or not!
      */
    sId: String) = this()
    def this(
      /**
      * optional id for the new control; generated automatically if no non-empty id is given Note: this can be
      * omitted, no matter whether `mSettings` will be given or not!
      */
    sId: String,
      /**
      * optional map/JSON-object with initial settings for the new component instance
      */
    mSettings: TablePersoControllerSettings
    ) = this()
    def this(
      /**
      * optional id for the new control; generated automatically if no non-empty id is given Note: this can be
      * omitted, no matter whether `mSettings` will be given or not!
      */
    sId: Unit,
      /**
      * optional map/JSON-object with initial settings for the new component instance
      */
    mSettings: TablePersoControllerSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/TablePersoController", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.TablePersoController with name `sClassName` and enriches it with
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
      * Returns a metadata object for class sap.m.TablePersoController.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait TablePersoController
    extends typings.openui5.sapUiBaseManagedObjectMod.default {
    
    /**
      * Activates the controller, i.e. tries to retrieve existing persisted personalizations, creates a TablePersoDialog
      * for the associated table and attaches a close handler to apply the personalizations to the table and
      * persist them.
      *
      * This method should be called when the table to be personalized knows its columns. Usually, this is when
      * that table's view has set its model, which is typically done in the corresponding controller's init method.
      * For example
      * ```javascript
      *
      *  onInit: function () {
      *
      * 		// set explored app's demo model on this sample
      * 		var oModel = new JSONModel(sap.ui.require.toUrl("sap/ui/demo/mock/products.json"));
      * 		var oGroupingModel = new JSONModel({ hasGrouping: false});
      * 		this.getView().setModel(oModel);
      * 		this.getView().setModel(oGroupingModel, 'Grouping');
      *
      * 		// init and activate controller
      * 		this._oTPC = new TablePersoController({
      * 			table: this.getView().byId("productsTable"),
      * 			//specify the first part of persistence ids e.g. 'demoApp-productsTable-dimensionsCol'
      * 			componentName: "demoApp",
      * 			persoService: DemoPersoService,
      * 		}).activate();
      * 	}
      * ```
      *
      *
      * @returns the TablePersoController instance.
      */
    def activate(): this.type = js.native
    
    def addTable(
      /**
      * The tables to add; if empty, nothing is inserted
      */
    vTable: typings.openui5.sapMTableMod.default
    ): this.type = js.native
    /**
      * Adds some table into the association {@link #getTables tables}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addTable(/**
      * The tables to add; if empty, nothing is inserted
      */
    vTable: ID): this.type = js.native
    
    /**
      * Applies the personalizations by getting the existing personalizations and adjusting to the table.
      */
    def applyPersonalizations(/**
      * the table to be personalized.
      */
    oTable: typings.openui5.sapMTableMod.default): Unit = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:personalizationsDone personalizationsDone} event
      * of this `sap.m.TablePersoController`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TablePersoController` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPersonalizationsDone(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPersonalizationsDone(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.TablePersoController` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:personalizationsDone personalizationsDone} event
      * of this `sap.m.TablePersoController`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TablePersoController` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPersonalizationsDone(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPersonalizationsDone(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.TablePersoController` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys the persoService in the aggregation {@link #getPersoService persoService}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyPersoService(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:personalizationsDone personalizationsDone}
      * event of this `sap.m.TablePersoController`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPersonalizationsDone(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachPersonalizationsDone(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Do some clean up: remove event delegates, etc
      */
    def exit(): Unit = js.native
    
    /**
      * Fires event {@link #event:personalizationsDone personalizationsDone} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePersonalizationsDone(): this.type = js.native
    def firePersonalizationsDone(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getComponentName componentName}.
      *
      * Available options for the text direction are LTR and RTL. By default the control inherits the text direction
      * from its parent control.
      *
      * @returns Value of property `componentName`
      */
    def getComponentName(): String = js.native
    
    /**
      * Gets current value of property {@link #getContentHeight contentHeight}.
      *
      * @returns Value of property `contentHeight`
      */
    def getContentHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getContentWidth contentWidth}.
      *
      * @returns Value of property `contentWidth`
      */
    def getContentWidth(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getHasGrouping hasGrouping}.
      *
      * Default value is `false`.
      *
      * @returns Value of property `hasGrouping`
      */
    def getHasGrouping(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getPersoService persoService}.
      */
    def getPersoService(): js.Object = js.native
    
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
      * Gets current value of property {@link #getShowSelectAll showSelectAll}.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showSelectAll`
      */
    def getShowSelectAll(): Boolean = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getTable table}, or `null`.
      */
    def getTable(): ID = js.native
    
    /**
      * Returns a _tablePersoDialog instance if available. It can be NULL if the controller has not been activated
      * yet.
      *
      * This function makes a private aggregate publicly accessable. This is necessary for downward compatibility
      * reasons: in the first versions of the tablePersoProvider developers still worked with the TablePersoDialog
      * directly, which is now not necessary any longer.
      *
      * @returns the TablePersoDialog instance.
      */
    def getTablePersoDialog(): typings.openui5.sapMTablePersoDialogMod.default = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getTables
      * tables}.
      */
    def getTables(): js.Array[ID] = js.native
    
    /**
      * Initializes the TablePersoController instance after creation.
      */
    def init(): Unit = js.native
    
    /**
      * Opens the TablePersoDialog, stores the personalized settings on close, modifies the table columns, and
      * sends them to the persistence service
      */
    def openDialog(): Unit = js.native
    
    /**
      * Refresh the personalizations: reloads the personalization information from the table perso provider,
      * applies it to the controller's table and updates the controller's table perso dialog.
      *
      * Use case for a 'refresh' call would be that the table which is personalized changed its columns during
      * runtime, after personalization has been activated.
      */
    def refresh(): Unit = js.native
    
    /**
      * Removes all the controls in the association named {@link #getTables tables}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllTables(): js.Array[ID] = js.native
    
    /**
      * Removes an table from the association named {@link #getTables tables}.
      *
      * @returns The removed table or `null`
      */
    def removeTable(/**
      * The table to be removed or its index or ID
      */
    vTable: int): ID | Null = js.native
    def removeTable(
      /**
      * The table to be removed or its index or ID
      */
    vTable: typings.openui5.sapMTableMod.default
    ): ID | Null = js.native
    def removeTable(/**
      * The table to be removed or its index or ID
      */
    vTable: ID): ID | Null = js.native
    
    /**
      * Persist the personalizations
      */
    def savePersonalizations(): Unit = js.native
    
    /**
      * Using this method, the first part of tablePerso persistence ids can be provided, in case the table's
      * app does not provide that part itself.
      *
      * If a component name is set using this method, it will be used, regardless of whether the table's app
      * has a different component name or not.
      *
      * @returns the TablePersoController instance.
      */
    def setComponentName(/**
      * the new component name.
      */
    sCompName: String): this.type = js.native
    
    /**
      * Reflector for the controller's 'contentHeight' property.
      *
      * @returns the TablePersoController instance.
      */
    def setContentHeight(/**
      * the new height of the TablePersoDialog.
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Reflector for the controller's 'contentWidth' property.
      *
      * @returns the TablePersoController instance.
      */
    def setContentWidth(/**
      * the new width of the tablePersoDialog
      */
    sWidth: CSSSize): this.type = js.native
    
    /**
      * Reflector for the controller's 'hasGrouping' property.
      *
      * @returns the TablePersoController instance.
      */
    def setHasGrouping(/**
      * is the tablePersoDialog displayed in grouping mode or not.
      */
    bHasGrouping: Boolean): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getPersoService persoService}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPersoService(/**
      * The persoService to set
      */
    oPersoService: js.Object): this.type = js.native
    
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
      * Reflector for the controller's 'showResetAll' property.
      *
      * @returns the TablePersoController instance.
      */
    def setShowResetAll(
      /**
      * is the tablePersoDialog's 'UndoPersonalization' button displayed or not.
      */
    bShowResetAll: Boolean
    ): this.type = js.native
    
    /**
      * Reflector for the controller's 'showSelectAll' property.
      *
      * @returns the TablePersoController instance.
      */
    def setShowSelectAll(
      /**
      * is the tablePersoDialog's 'Display All' checkbox displayed or not.
      */
    bShowSelectAll: Boolean
    ): this.type = js.native
    
    def setTable(
      /**
      * ID of an element which becomes the new target of this table association; alternatively, an element instance
      * may be given
      */
    oTable: typings.openui5.sapMTableMod.default
    ): this.type = js.native
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
  }
  
  trait TablePersoControllerSettings
    extends StObject
       with ManagedObjectSettings {
    
    /**
      * Available options for the text direction are LTR and RTL. By default the control inherits the text direction
      * from its parent control.
      */
    var componentName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    var contentHeight: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    var contentWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    var hasGrouping: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    var persoService: js.UndefOr[js.Object] = js.undefined
    
    var personalizationsDone: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
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
    
    var showSelectAll: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    var table: js.UndefOr[typings.openui5.sapMTableMod.default | String] = js.undefined
    
    /**
      * Also several tables may be personalized at once given they have same columns.
      */
    var tables: js.UndefOr[js.Array[typings.openui5.sapMTableMod.default | String]] = js.undefined
  }
  object TablePersoControllerSettings {
    
    inline def apply(): TablePersoControllerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TablePersoControllerSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TablePersoControllerSettings] (val x: Self) extends AnyVal {
      
      inline def setComponentName(value: String | PropertyBindingInfo): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      inline def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
      
      inline def setContentHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "contentHeight", value.asInstanceOf[js.Any])
      
      inline def setContentHeightUndefined: Self = StObject.set(x, "contentHeight", js.undefined)
      
      inline def setContentWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
      
      inline def setContentWidthUndefined: Self = StObject.set(x, "contentWidth", js.undefined)
      
      inline def setHasGrouping(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hasGrouping", value.asInstanceOf[js.Any])
      
      inline def setHasGroupingUndefined: Self = StObject.set(x, "hasGrouping", js.undefined)
      
      inline def setPersoService(value: js.Object): Self = StObject.set(x, "persoService", value.asInstanceOf[js.Any])
      
      inline def setPersoServiceUndefined: Self = StObject.set(x, "persoService", js.undefined)
      
      inline def setPersonalizationsDone(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "personalizationsDone", js.Any.fromFunction1(value))
      
      inline def setPersonalizationsDoneUndefined: Self = StObject.set(x, "personalizationsDone", js.undefined)
      
      inline def setResetAllMode(
        value: ResetAllMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ResetAllMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "resetAllMode", value.asInstanceOf[js.Any])
      
      inline def setResetAllModeUndefined: Self = StObject.set(x, "resetAllMode", js.undefined)
      
      inline def setShowResetAll(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showResetAll", value.asInstanceOf[js.Any])
      
      inline def setShowResetAllUndefined: Self = StObject.set(x, "showResetAll", js.undefined)
      
      inline def setShowSelectAll(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showSelectAll", value.asInstanceOf[js.Any])
      
      inline def setShowSelectAllUndefined: Self = StObject.set(x, "showSelectAll", js.undefined)
      
      inline def setTable(value: typings.openui5.sapMTableMod.default | String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      inline def setTables(value: js.Array[typings.openui5.sapMTableMod.default | String]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
      
      inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
      
      inline def setTablesVarargs(value: (typings.openui5.sapMTableMod.default | String)*): Self = StObject.set(x, "tables", js.Array(value*))
    }
  }
}
