package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.P13nConditionOperation
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMP13nConditionPanelMod {
  
  @JSImport("sap/m/P13nConditionPanel", JSImport.Default)
  @js.native
  /**
    * Constructor for a new P13nConditionPanel.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends P13nConditionPanel {
    def this(/**
      * initial settings for the new control
      */
    mSettings: P13nConditionPanelSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: P13nConditionPanelSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: P13nConditionPanelSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/P13nConditionPanel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.P13nConditionPanel with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
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
    oClassInfo: ClassInfo[T, P13nConditionPanel]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, P13nConditionPanel],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * creates and returns a formatted text for the specified condition
      *
      * @returns the range token text. An empty string when no operation matches or the values for the operation
      * are wrong
      */
    inline def getFormatedConditionText(
      /**
      * the operation type sap.m.P13nConditionOperation
      */
    sOperation: String,
      /**
      * value of the first range field
      */
    sValue1: String,
      /**
      * value of the second range field
      */
    sValue2: String,
      /**
      * indicates if the range is an Exclude range
      */
    bExclude: Boolean
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatedConditionText")(sOperation.asInstanceOf[js.Any], sValue1.asInstanceOf[js.Any], sValue2.asInstanceOf[js.Any], bExclude.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Returns a metadata object for class sap.m.P13nConditionPanel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait P13nConditionPanel
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * add a single condition.
      */
    def addCondition(
      /**
      * the new condition of type `{ "key": "007", "operation": sap.m.P13nConditionOperation.Ascending, "keyField":
      * "keyFieldKey", "value1": "", "value2": ""};`
      */
    oCondition: js.Object
    ): Unit = js.native
    
    /**
      * add a single KeyField
      */
    def addKeyField(/**
      * {key: "CompanyCode", text: "ID"}
      */
    oKeyField: js.Object): Unit = js.native
    
    def addOperation(
      oOperation: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof P13nConditionOperation * / any */ String,
      /**
      * defines the type for which this operations will be used.
      */
    sType: String
    ): Unit = js.native
    /**
      * add a single operation
      */
    def addOperation(
      oOperation: P13nConditionOperation,
      /**
      * defines the type for which this operations will be used.
      */
    sType: String
    ): Unit = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:dataChange dataChange} event of this `sap.m.P13nConditionPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nConditionPanel` itself.
      *
      * Workaround for updating the binding
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDataChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachDataChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.P13nConditionPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:dataChange dataChange} event of this `sap.m.P13nConditionPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nConditionPanel` itself.
      *
      * Workaround for updating the binding
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDataChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachDataChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.P13nConditionPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:dataChange dataChange} event of this `sap.m.P13nConditionPanel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachDataChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachDataChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:dataChange dataChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireDataChange(): this.type = js.native
    def fireDataChange(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAlwaysShowAddIcon alwaysShowAddIcon}.
      *
      * makes the Add icon visible on each condition row. If is set to false the Add is only visible at the end
      * and you can only append a new condition.
      *
      * Default value is `true`.
      *
      * @returns Value of property `alwaysShowAddIcon`
      */
    def getAlwaysShowAddIcon(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getAutoAddNewRow autoAddNewRow}.
      *
      * adds initial a new empty condition row
      *
      * Default value is `false`.
      *
      * @returns Value of property `autoAddNewRow`
      */
    def getAutoAddNewRow(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getAutoReduceKeyFieldItems autoReduceKeyFieldItems}.
      *
      * KeyField value can only be selected once. When you set the property to `true` the ConditionPanel will
      * automatically offers on the KeyField drop down only the keyFields which are not used. The default behavior
      * is that in each keyField dropdown all keyfields are listed.
      *
      * Default value is `false`.
      *
      * @returns Value of property `autoReduceKeyFieldItems`
      */
    def getAutoReduceKeyFieldItems(): Boolean = js.native
    
    /**
      * returns array of all defined conditions.
      *
      * @returns array of Conditions
      */
    def getConditions(): js.Array[js.Object] = js.native
    
    /**
      * Gets current value of property {@link #getContainerQuery containerQuery}.
      *
      * defines if the mediaQuery or a ContainerResize will be used for layout update. When the `P13nConditionPanel`
      * is used on a dialog the property should be set to `true`!
      *
      * Default value is `false`.
      *
      * @returns Value of property `containerQuery`
      */
    def getContainerQuery(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getDisableFirstRemoveIcon disableFirstRemoveIcon}.
      *
      * makes the remove icon on the first condition row disabled when only one condition exist.
      *
      * Default value is `false`.
      *
      * @returns Value of property `disableFirstRemoveIcon`
      */
    def getDisableFirstRemoveIcon(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getDisplayFormat displayFormat}.
      *
      * This represents the displayFormat of the condition Values. With the value "UpperCase" the entered value
      * of the condition will be converted to upperCase.
      *
      * @returns Value of property `displayFormat`
      */
    def getDisplayFormat(): String = js.native
    
    /**
      * Gets current value of property {@link #getExclude exclude}.
      *
      * exclude options for filter
      *
      * Default value is `false`.
      *
      * @returns Value of property `exclude`
      */
    def getExclude(): Boolean = js.native
    
    /**
      * getter for KeyFields array
      *
      * @returns array of KeyFields `[{key: "CompanyCode", text: "ID"}, {key:"CompanyName", text : "Name"}]`
      */
    def getKeyFields(): js.Array[js.Object] = js.native
    
    /**
      * Gets current value of property {@link #getLayoutMode layoutMode}.
      *
      * can be used to control the layout behavior. Default is "" which will automatically change the layout.
      * With "Desktop", "Table" or "Phone" you can set a fixed layout.
      *
      * @returns Value of property `layoutMode`
      */
    def getLayoutMode(): String = js.native
    
    /**
      * Gets current value of property {@link #getMaxConditions maxConditions}.
      *
      * defines the max number of conditions on the ConditionPanel
      *
      * Default value is `'-1'`.
      *
      * @returns Value of property `maxConditions`
      */
    def getMaxConditions(): String = js.native
    
    /**
      * returns the default array of operations
      *
      * @returns array of operations
      */
    def getOperations(): js.Array[
        P13nConditionOperation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof P13nConditionOperation * / any */ String)
      ] = js.native
    def getOperations(/**
      * defines the type for which the operations should be returned.
      */
    sType: String): js.Array[
        P13nConditionOperation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof P13nConditionOperation * / any */ String)
      ] = js.native
    
    /**
      * Gets current value of property {@link #getShowLabel showLabel}.
      *
      * show additional labels in the condition
      *
      * Default value is `false`.
      *
      * @returns Value of property `showLabel`
      */
    def getShowLabel(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getUsePrevConditionSetting usePrevConditionSetting}.
      *
      * new added condition use the settings from the previous condition as default.
      *
      * Default value is `true`.
      *
      * @returns Value of property `usePrevConditionSetting`
      */
    def getUsePrevConditionSetting(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getValidationExecutor validationExecutor}.
      *
      * Calls the validation listener tbd...
      *
      * @returns Value of property `validationExecutor`
      */
    def getValidationExecutor(): js.Object = js.native
    
    /**
      * insert a single condition.
      */
    def insertCondition(
      /**
      * the new condition of type `{ "key": "007", "operation": sap.m.P13nConditionOperation.Ascending, "keyField":
      * "keyFieldKey", "value1": "", "value2": ""};`
      */
    oCondition: js.Object,
      /**
      * of the new condition
      */
    index: int
    ): Unit = js.native
    
    /**
      * remove all conditions.
      */
    def removeAllConditions(): Unit = js.native
    
    /**
      * removes all KeyFields
      */
    def removeAllKeyFields(): Unit = js.native
    
    /**
      * remove all operations
      */
    def removeAllOperations(/**
      * defines the type for which all operations should be removed
      */
    sType: String): Unit = js.native
    
    /**
      * remove a single condition.
      */
    def removeCondition(
      /**
      * is the condition which should be removed. can be either a string with the key of the condition of the
      * condition object itself.
      */
    vCondition: js.Object
    ): Unit = js.native
    
    /**
      * @since 1.28.0
      *
      * removes all invalid conditions.
      */
    def removeInvalidConditions(): Unit = js.native
    
    /**
      * @since 1.28.0
      *
      * removes all errors/warning states from the value1/2 fields of all conditions.
      */
    def removeValidationErrors(): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getAutoAddNewRow autoAddNewRow}.
      *
      * adds initial a new empty condition row
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAutoAddNewRow(): this.type = js.native
    def setAutoAddNewRow(/**
      * New value for property `autoAddNewRow`
      */
    bAutoAddNewRow: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAutoReduceKeyFieldItems autoReduceKeyFieldItems}.
      *
      * KeyField value can only be selected once. When you set the property to `true` the ConditionPanel will
      * automatically offers on the KeyField drop down only the keyFields which are not used. The default behavior
      * is that in each keyField dropdown all keyfields are listed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAutoReduceKeyFieldItems(): this.type = js.native
    def setAutoReduceKeyFieldItems(/**
      * New value for property `autoReduceKeyFieldItems`
      */
    bAutoReduceKeyFieldItems: Boolean): this.type = js.native
    
    /**
      * This method must be used to assign a list of conditions.
      */
    def setConditions(/**
      * array of Conditions.
      */
    aConditions: js.Array[js.Object]): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getDisableFirstRemoveIcon disableFirstRemoveIcon}.
      *
      * makes the remove icon on the first condition row disabled when only one condition exist.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisableFirstRemoveIcon(): this.type = js.native
    def setDisableFirstRemoveIcon(/**
      * New value for property `disableFirstRemoveIcon`
      */
    bDisableFirstRemoveIcon: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDisplayFormat displayFormat}.
      *
      * This represents the displayFormat of the condition Values. With the value "UpperCase" the entered value
      * of the condition will be converted to upperCase.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisplayFormat(): this.type = js.native
    def setDisplayFormat(/**
      * New value for property `displayFormat`
      */
    sDisplayFormat: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getExclude exclude}.
      *
      * exclude options for filter
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setExclude(): this.type = js.native
    def setExclude(/**
      * New value for property `exclude`
      */
    bExclude: Boolean): this.type = js.native
    
    /**
      * This method allows you to specify the KeyFields for the conditions. You can set an array of object with
      * Key and Text properties to define the keyfields.
      */
    def setKeyFields(
      /**
      * array of KeyFields `[{key: "CompanyCode", text: "ID"}, {key:"CompanyName", text : "Name"}]`
      */
    aKeyFields: js.Array[Any]
    ): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getMaxConditions maxConditions}.
      *
      * defines the max number of conditions on the ConditionPanel
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'-1'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxConditions(): this.type = js.native
    def setMaxConditions(/**
      * New value for property `maxConditions`
      */
    sMaxConditions: String): this.type = js.native
    
    /**
      * setter for the supported operations which we show per condition row. This array of "default" operations
      * will only be used when we do not have on the keyfield itself some specific operations and a keyfield
      * is of not of type date or numeric.
      */
    def setOperations(
      /**
      * array of operations `[sap.m.P13nConditionOperation.BT, sap.m.P13nConditionOperation.EQ]`
      */
    aOperations: js.Array[
          P13nConditionOperation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof P13nConditionOperation * / any */ String)
        ],
      /**
      * defines the type for which this operations will be used. is `sType` is not defined the operations will
      * be used as default operations.
      */
    sType: String
    ): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getShowLabel showLabel}.
      *
      * show additional labels in the condition
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowLabel(): this.type = js.native
    def setShowLabel(/**
      * New value for property `showLabel`
      */
    bShowLabel: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUsePrevConditionSetting usePrevConditionSetting}.
      *
      * new added condition use the settings from the previous condition as default.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUsePrevConditionSetting(): this.type = js.native
    def setUsePrevConditionSetting(/**
      * New value for property `usePrevConditionSetting`
      */
    bUsePrevConditionSetting: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValidationExecutor validationExecutor}.
      *
      * Calls the validation listener tbd...
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValidationExecutor(): this.type = js.native
    def setValidationExecutor(/**
      * New value for property `validationExecutor`
      */
    oValidationExecutor: js.Object): this.type = js.native
  }
  
  trait P13nConditionPanel$DataChangeEventParameters extends StObject
  
  type P13nConditionPanelDataChangeEvent = typings.openui5.sapUiBaseEventMod.default[P13nConditionPanel$DataChangeEventParameters]
  
  type P13nConditionPanelDataChangeEventParameters = P13nConditionPanel$DataChangeEventParameters
  
  trait P13nConditionPanelSettings
    extends StObject
       with ControlSettings {
    
    /**
      * makes the Add icon visible on each condition row. If is set to false the Add is only visible at the end
      * and you can only append a new condition.
      */
    var alwaysShowAddIcon: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * adds initial a new empty condition row
      */
    var autoAddNewRow: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * KeyField value can only be selected once. When you set the property to `true` the ConditionPanel will
      * automatically offers on the KeyField drop down only the keyFields which are not used. The default behavior
      * is that in each keyField dropdown all keyfields are listed.
      */
    var autoReduceKeyFieldItems: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * defines if the mediaQuery or a ContainerResize will be used for layout update. When the `P13nConditionPanel`
      * is used on a dialog the property should be set to `true`!
      */
    var containerQuery: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Workaround for updating the binding
      */
    var dataChange: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * makes the remove icon on the first condition row disabled when only one condition exist.
      */
    var disableFirstRemoveIcon: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This represents the displayFormat of the condition Values. With the value "UpperCase" the entered value
      * of the condition will be converted to upperCase.
      */
    var displayFormat: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * exclude options for filter
      */
    var exclude: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * can be used to control the layout behavior. Default is "" which will automatically change the layout.
      * With "Desktop", "Table" or "Phone" you can set a fixed layout.
      */
    var layoutMode: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * defines the max number of conditions on the ConditionPanel
      */
    var maxConditions: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * show additional labels in the condition
      */
    var showLabel: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * new added condition use the settings from the previous condition as default.
      */
    var usePrevConditionSetting: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Calls the validation listener tbd...
      */
    var validationExecutor: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object P13nConditionPanelSettings {
    
    inline def apply(): P13nConditionPanelSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[P13nConditionPanelSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: P13nConditionPanelSettings] (val x: Self) extends AnyVal {
      
      inline def setAlwaysShowAddIcon(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "alwaysShowAddIcon", value.asInstanceOf[js.Any])
      
      inline def setAlwaysShowAddIconUndefined: Self = StObject.set(x, "alwaysShowAddIcon", js.undefined)
      
      inline def setAutoAddNewRow(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "autoAddNewRow", value.asInstanceOf[js.Any])
      
      inline def setAutoAddNewRowUndefined: Self = StObject.set(x, "autoAddNewRow", js.undefined)
      
      inline def setAutoReduceKeyFieldItems(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "autoReduceKeyFieldItems", value.asInstanceOf[js.Any])
      
      inline def setAutoReduceKeyFieldItemsUndefined: Self = StObject.set(x, "autoReduceKeyFieldItems", js.undefined)
      
      inline def setContainerQuery(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "containerQuery", value.asInstanceOf[js.Any])
      
      inline def setContainerQueryUndefined: Self = StObject.set(x, "containerQuery", js.undefined)
      
      inline def setDataChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "dataChange", js.Any.fromFunction1(value))
      
      inline def setDataChangeUndefined: Self = StObject.set(x, "dataChange", js.undefined)
      
      inline def setDisableFirstRemoveIcon(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "disableFirstRemoveIcon", value.asInstanceOf[js.Any])
      
      inline def setDisableFirstRemoveIconUndefined: Self = StObject.set(x, "disableFirstRemoveIcon", js.undefined)
      
      inline def setDisplayFormat(value: String | PropertyBindingInfo): Self = StObject.set(x, "displayFormat", value.asInstanceOf[js.Any])
      
      inline def setDisplayFormatUndefined: Self = StObject.set(x, "displayFormat", js.undefined)
      
      inline def setExclude(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setLayoutMode(value: String | PropertyBindingInfo): Self = StObject.set(x, "layoutMode", value.asInstanceOf[js.Any])
      
      inline def setLayoutModeUndefined: Self = StObject.set(x, "layoutMode", js.undefined)
      
      inline def setMaxConditions(value: String | PropertyBindingInfo): Self = StObject.set(x, "maxConditions", value.asInstanceOf[js.Any])
      
      inline def setMaxConditionsUndefined: Self = StObject.set(x, "maxConditions", js.undefined)
      
      inline def setShowLabel(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showLabel", value.asInstanceOf[js.Any])
      
      inline def setShowLabelUndefined: Self = StObject.set(x, "showLabel", js.undefined)
      
      inline def setUsePrevConditionSetting(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "usePrevConditionSetting", value.asInstanceOf[js.Any])
      
      inline def setUsePrevConditionSettingUndefined: Self = StObject.set(x, "usePrevConditionSetting", js.undefined)
      
      inline def setValidationExecutor(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "validationExecutor", value.asInstanceOf[js.Any])
      
      inline def setValidationExecutorUndefined: Self = StObject.set(x, "validationExecutor", js.undefined)
    }
  }
}
