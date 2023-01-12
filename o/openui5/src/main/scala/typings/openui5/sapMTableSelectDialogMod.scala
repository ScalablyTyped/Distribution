package typings.openui5

import typings.openui5.anon.ClearButtonPressedItemsBinding
import typings.openui5.anon.ItemsBinding
import typings.openui5.anon.SelectedContextsSelectedItem
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.TitleAlignment
import typings.openui5.sapMSelectDialogBaseMod.SelectDialogBaseSettings
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMTableSelectDialogMod {
  
  @JSImport("sap/m/TableSelectDialog", JSImport.Default)
  @js.native
  /**
    * Constructor for a new TableSelectDialog.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/table-select-dialog/ Table Select Dialog}
    */
  open class default () extends TableSelectDialog {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: TableSelectDialogSettings) = this()
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
      * Initial settings for the new control
      */
    mSettings: TableSelectDialogSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: TableSelectDialogSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/TableSelectDialog", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.TableSelectDialog with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.SelectDialogBase.extend}.
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
    oClassInfo: ClassInfo[T, TableSelectDialog]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, TableSelectDialog],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.TableSelectDialog.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait TableSelectDialog
    extends typings.openui5.sapMSelectDialogBaseMod.default {
    
    /**
      * Adds some column to the aggregation {@link #getColumns columns}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addColumn(
      /**
      * The column to add; if empty, nothing is inserted
      */
    oColumn: typings.openui5.sapMColumnMod.default
    ): this.type = js.native
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(
      /**
      * The item to add; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapMColumnListItemMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:cancel cancel} event of this `sap.m.TableSelectDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TableSelectDialog` itself.
      *
      * Fires when the Cancel button is clicked.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCancel(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachCancel(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.TableSelectDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:cancel cancel} event of this `sap.m.TableSelectDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TableSelectDialog` itself.
      *
      * Fires when the Cancel button is clicked.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCancel(
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
    def attachCancel(
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
      * Context object to call the event handler with. Defaults to this `sap.m.TableSelectDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:confirm confirm} event of this `sap.m.TableSelectDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TableSelectDialog` itself.
      *
      * Fires when the dialog is confirmed by selecting an item in single-selection mode or by pressing the confirmation
      * button in multi-selection mode. The items being selected are returned as event parameters.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachConfirm(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachConfirm(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.TableSelectDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:confirm confirm} event of this `sap.m.TableSelectDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TableSelectDialog` itself.
      *
      * Fires when the dialog is confirmed by selecting an item in single-selection mode or by pressing the confirmation
      * button in multi-selection mode. The items being selected are returned as event parameters.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachConfirm(
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
    def attachConfirm(
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
      * Context object to call the event handler with. Defaults to this `sap.m.TableSelectDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.m.TableSelectDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TableSelectDialog` itself.
      *
      * Fires when the value of the search field is changed by a user (for example at each key press).
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLiveChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachLiveChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.TableSelectDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.m.TableSelectDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TableSelectDialog` itself.
      *
      * Fires when the value of the search field is changed by a user (for example at each key press).
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLiveChange(
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
    def attachLiveChange(
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
      * Context object to call the event handler with. Defaults to this `sap.m.TableSelectDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:search search} event of this `sap.m.TableSelectDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TableSelectDialog` itself.
      *
      * Fires when the search button has been clicked on dialog.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSearch(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSearch(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.TableSelectDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:search search} event of this `sap.m.TableSelectDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TableSelectDialog` itself.
      *
      * Fires when the search button has been clicked on dialog.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSearch(
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
    def attachSearch(
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
      * Context object to call the event handler with. Defaults to this `sap.m.TableSelectDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Binds aggregation {@link #getColumns columns} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindColumns(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Binds aggregation {@link #getItems items} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindItems(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Destroys all the columns in the aggregation {@link #getColumns columns}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyColumns(): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:cancel cancel} event of this `sap.m.TableSelectDialog`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachCancel(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachCancel(
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
      * Detaches event handler `fnFunction` from the {@link #event:confirm confirm} event of this `sap.m.TableSelectDialog`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachConfirm(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachConfirm(
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
      * Detaches event handler `fnFunction` from the {@link #event:liveChange liveChange} event of this `sap.m.TableSelectDialog`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachLiveChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachLiveChange(
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
      * Detaches event handler `fnFunction` from the {@link #event:search search} event of this `sap.m.TableSelectDialog`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSearch(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSearch(
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
      * Fires event {@link #event:cancel cancel} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireCancel(): this.type = js.native
    def fireCancel(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:confirm confirm} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireConfirm(): this.type = js.native
    def fireConfirm(/**
      * Parameters to pass along with the event
      */
    mParameters: SelectedContextsSelectedItem): this.type = js.native
    
    /**
      * Fires event {@link #event:liveChange liveChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLiveChange(): this.type = js.native
    def fireLiveChange(/**
      * Parameters to pass along with the event
      */
    mParameters: ItemsBinding): this.type = js.native
    
    /**
      * Fires event {@link #event:search search} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSearch(): this.type = js.native
    def fireSearch(/**
      * Parameters to pass along with the event
      */
    mParameters: ClearButtonPressedItemsBinding): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getColumns columns}.
      *
      * The columns bindings.
      */
    def getColumns(): js.Array[typings.openui5.sapMColumnMod.default] = js.native
    
    /**
      * @SINCE 1.68
      *
      * Gets current value of property {@link #getConfirmButtonText confirmButtonText}.
      *
      * Overwrites the default text for the confirmation button. Note: This property applies only when the property
      * `multiSelect` is set to `true`.
      *
      * @returns Value of property `confirmButtonText`
      */
    def getConfirmButtonText(): String = js.native
    
    /**
      * Retrieves content height of the select dialog {@link sap.m.Dialog}
      *
      * @returns sHeight the content height of the internal dialog
      */
    def getContentHeight(): CSSSize = js.native
    
    /**
      * Retrieves content width of the select dialog {@link sap.m.Dialog}
      *
      * @returns sWidth the content width of the internal dialog
      */
    def getContentWidth(): CSSSize = js.native
    
    /**
      * @SINCE 1.71
      *
      * Gets current value of property {@link #getDraggable draggable}.
      *
      * When set to `true`, the TableSelectDialog is draggable by its header. The default value is `false`. **Note**:
      * The TableSelectDialog can be draggable only in desktop mode.
      *
      * Default value is `false`.
      *
      * @returns Value of property `draggable`
      */
    def getDraggable(): Boolean = js.native
    
    /**
      * @SINCE 1.56
      *
      * Gets current value of property {@link #getGrowing growing}.
      *
      * Determines the progressive loading. When set to `true`, enables the growing feature of the control to
      * load more items by requesting from the bound model. **Note:** This feature only works when an `items`
      * aggregation is bound. Growing must not be used together with two-way binding. **Note:** If the property
      * is set to `true`, selected count (if present) and search, will work for currently loaded items only.
      * To make sure that all items in the table are loaded at once and the above features work properly, we
      * recommend setting the `growing` property to `false`.
      *
      * Default value is `true`.
      *
      * @returns Value of property `growing`
      */
    def getGrowing(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getGrowingThreshold growingThreshold}.
      *
      * Determines the number of items initially displayed in the table and defines the number of items to be
      * requested from the model for each grow. This property can only be used if the property `growing` is set
      * to `true`.
      *
      * @returns Value of property `growingThreshold`
      */
    def getGrowingThreshold(): int = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * The items of the table.
      */
    def getItems(): js.Array[typings.openui5.sapMColumnListItemMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getMultiSelect multiSelect}.
      *
      * Enables the user to select several options from the table.
      *
      * Default value is `false`.
      *
      * @returns Value of property `multiSelect`
      */
    def getMultiSelect(): Boolean = js.native
    
    /**
      * Retrieves the internal List's no data text property
      *
      * @returns the current no data text
      */
    def getNoDataText(): String = js.native
    
    /**
      * @SINCE 1.18
      *
      * Gets current value of property {@link #getRememberSelections rememberSelections}.
      *
      * Controls whether the dialog clears the selection or not. When the dialog is opened multiple times in
      * the same context to allow for corrections of previous user inputs, set this flag to `true`. When the
      * dialog should reset the selection to allow for a new selection each time set it to `false` Note: This
      * property must be set before the Dialog is opened to have an effect.
      *
      * Default value is `false`.
      *
      * @returns Value of property `rememberSelections`
      */
    def getRememberSelections(): Boolean = js.native
    
    /**
      * @SINCE 1.71
      *
      * Gets current value of property {@link #getResizable resizable}.
      *
      * When set to `true`, the TableSelectDialog will have a resize handler in its bottom right corner. The
      * default value is `false`. **Note**: The TableSelectDialog can be resizable only in desktop mode.
      *
      * Default value is `false`.
      *
      * @returns Value of property `resizable`
      */
    def getResizable(): Boolean = js.native
    
    /**
      * @SINCE 1.58
      *
      * Gets current value of property {@link #getShowClearButton showClearButton}.
      *
      * This flag controls whether the Clear button is shown. When set to `true`, it provides a way to clear
      * a selection made in Table Select Dialog.
      *
      * We recommend enabling of the Clear button in the following cases, where a mechanism to clear the value
      * is needed: In case the Table Select Dialog is in single-selection mode (default mode) and `rememberSelections`
      * is set to `true`. The Clear button needs to be enabled in order to allow users to clear the selection.
      * In case of using `sap.m.Input` with `valueHelpOnly` set to `true`, the Clear button can be used for clearing
      * the selection. In case the application stores a value and uses only Table Select Dialog to edit/maintain
      * it.
      *
      * Optional: In case `multiSelect` is set to `true`, the selection can be easily cleared with one click.
      *
      * **Note:** When used with OData, only the loaded selections will be cleared.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showClearButton`
      */
    def getShowClearButton(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Specifies the title text in the dialog header.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * @SINCE 1.72
      *
      * Gets current value of property {@link #getTitleAlignment titleAlignment}.
      *
      * Specifies the Title alignment (theme specific). If set to `TitleAlignment.Auto`, the Title will be aligned
      * as it is set in the theme (if not set, the default value is `center`); Other possible values are `TitleAlignment.Start`
      * (left or right depending on LTR/RTL), and `TitleAlignment.Center` (centered)
      *
      * Default value is `Auto`.
      *
      * @returns Value of property `titleAlignment`
      */
    def getTitleAlignment(): TitleAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleAlignment * / any */ String) = js.native
    
    /**
      * Transfers method to the inner dialog: hasStyleClass
      *
      * @returns true if the class is set, false otherwise
      */
    def hasStyleClass(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.m.Column` in the aggregation {@link #getColumns columns}. and returns its
      * index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfColumn(/**
      * The column whose index is looked for
      */
    oColumn: typings.openui5.sapMColumnMod.default): int = js.native
    
    /**
      * Checks for the provided `sap.m.ColumnListItem` in the aggregation {@link #getItems items}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(
      /**
      * The item whose index is looked for
      */
    oItem: typings.openui5.sapMColumnListItemMod.default
    ): int = js.native
    
    /**
      * Inserts a column into the aggregation {@link #getColumns columns}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertColumn(
      /**
      * The column to insert; if empty, nothing is inserted
      */
    oColumn: typings.openui5.sapMColumnMod.default,
      /**
      * The `0`-based index the column should be inserted at; for a negative value of `iIndex`, the column is
      * inserted at position 0; for a value greater than the current size of the aggregation, the column is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapMColumnListItemMod.default,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Shows the busy state and is called after the renderer is finished.
      *
      * @returns this pointer for chaining
      */
    def onAfterRendering(): this.type = js.native
    
    /**
      * Opens the internal dialog with a searchfield and a table.
      *
      * @returns `this` to allow method chaining
      */
    def open(
      /**
      * Value for the search. The table will be automatically trigger the search event if this parameter is set.
      */
    sSearchValue: String
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getColumns columns}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllColumns(): js.Array[typings.openui5.sapMColumnMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[typings.openui5.sapMColumnListItemMod.default] = js.native
    
    def removeColumn(/**
      * The column to remove or its index or id
      */
    vColumn: String): typings.openui5.sapMColumnMod.default | Null = js.native
    /**
      * Removes a column from the aggregation {@link #getColumns columns}.
      *
      * @returns The removed column or `null`
      */
    def removeColumn(/**
      * The column to remove or its index or id
      */
    vColumn: int): typings.openui5.sapMColumnMod.default | Null = js.native
    def removeColumn(
      /**
      * The column to remove or its index or id
      */
    vColumn: typings.openui5.sapMColumnMod.default
    ): typings.openui5.sapMColumnMod.default | Null = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): typings.openui5.sapMColumnListItemMod.default | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): typings.openui5.sapMColumnListItemMod.default | Null = js.native
    def removeItem(
      /**
      * The item to remove or its index or id
      */
    vItem: typings.openui5.sapMColumnListItemMod.default
    ): typings.openui5.sapMColumnListItemMod.default | Null = js.native
    
    /**
      * Sets the text of the confirmation button.
      *
      * @returns `this` pointer for chaining
      */
    def setConfirmButtonText(/**
      * The text for the confirm button
      */
    sText: String): this.type = js.native
    
    /**
      * Sets content height of the select dialog {@link sap.m.Dialog}
      *
      * @returns this pointer for chaining
      */
    def setContentHeight(/**
      * the new content height value for the dialog
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets content width of the select dialog {@link sap.m.Dialog}
      *
      * @returns this pointer for chaining
      */
    def setContentWidth(/**
      * the new content width value for the dialog
      */
    sWidth: CSSSize): this.type = js.native
    
    /**
      * Sets the draggable property.
      *
      * @returns `this` pointer for chaining
      */
    def setDraggable(/**
      * Value for the draggable property
      */
    bValue: Boolean): typings.openui5.sapMSelectDialogMod.default = js.native
    
    /**
      * Sets the growing to the internal table
      *
      * @returns this pointer for chaining
      */
    def setGrowing(/**
      * Value for the table's growing.
      */
    bValue: Boolean): this.type = js.native
    
    /**
      * Sets the growing threshold to the internal table
      *
      * @returns this pointer for chaining
      */
    def setGrowingThreshold(/**
      * Value for the table's growing threshold.
      */
    iValue: int): this.type = js.native
    
    /**
      * Enables/Disables multi selection mode.
      *
      * @returns this pointer for chaining
      */
    def setMultiSelect(/**
      * flag for multi selection mode
      */
    bMulti: Boolean): this.type = js.native
    
    /**
      * Sets the no data text of the internal table
      */
    def setNoDataText(/**
      * the no data text for the table
      */
    sNoDataText: String): Unit = js.native
    
    /**
      * @SINCE 1.18
      *
      * Sets a new value for property {@link #getRememberSelections rememberSelections}.
      *
      * Controls whether the dialog clears the selection or not. When the dialog is opened multiple times in
      * the same context to allow for corrections of previous user inputs, set this flag to `true`. When the
      * dialog should reset the selection to allow for a new selection each time set it to `false` Note: This
      * property must be set before the Dialog is opened to have an effect.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRememberSelections(): this.type = js.native
    def setRememberSelections(/**
      * New value for property `rememberSelections`
      */
    bRememberSelections: Boolean): this.type = js.native
    
    /**
      * Sets the resizable property.
      *
      * @returns `this` pointer for chaining
      */
    def setResizable(/**
      * Value for the resizable property
      */
    bValue: Boolean): typings.openui5.sapMSelectDialogMod.default = js.native
    
    /**
      * Sets the Clear button visible state
      *
      * @returns this pointer for chaining
      */
    def setShowClearButton(/**
      * Value for the Clear button visible state.
      */
    bVisible: Boolean): this.type = js.native
    
    /**
      * Sets the title of the internal dialog
      *
      * @returns this pointer for chaining
      */
    def setTitle(/**
      * the title text for the dialog
      */
    sTitle: String): this.type = js.native
    
    /**
      * @SINCE 1.72
      *
      * Sets a new value for property {@link #getTitleAlignment titleAlignment}.
      *
      * Specifies the Title alignment (theme specific). If set to `TitleAlignment.Auto`, the Title will be aligned
      * as it is set in the theme (if not set, the default value is `center`); Other possible values are `TitleAlignment.Start`
      * (left or right depending on LTR/RTL), and `TitleAlignment.Center` (centered)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Auto`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleAlignment(): this.type = js.native
    def setTitleAlignment(
      /**
      * New value for property `titleAlignment`
      */
    sTitleAlignment: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleAlignment * / any */ String
    ): this.type = js.native
    def setTitleAlignment(/**
      * New value for property `titleAlignment`
      */
    sTitleAlignment: TitleAlignment): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getColumns columns} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindColumns(): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getItems items} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindItems(): this.type = js.native
  }
  
  trait TableSelectDialogSettings
    extends StObject
       with SelectDialogBaseSettings {
    
    /**
      * Fires when the Cancel button is clicked.
      */
    var cancel: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The columns bindings.
      */
    var columns: js.UndefOr[
        js.Array[typings.openui5.sapMColumnMod.default] | typings.openui5.sapMColumnMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fires when the dialog is confirmed by selecting an item in single-selection mode or by pressing the confirmation
      * button in multi-selection mode. The items being selected are returned as event parameters.
      */
    var confirm: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.68
      *
      * Overwrites the default text for the confirmation button. Note: This property applies only when the property
      * `multiSelect` is set to `true`.
      */
    var confirmButtonText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Specifies the content height of the inner dialog. For more information, see the Dialog documentation.
      */
    var contentHeight: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.18
      *
      * Determines the content width of the inner dialog. For more information, see the Dialog documentation.
      */
    var contentWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.71
      *
      * When set to `true`, the TableSelectDialog is draggable by its header. The default value is `false`. **Note**:
      * The TableSelectDialog can be draggable only in desktop mode.
      */
    var draggable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.56
      *
      * Determines the progressive loading. When set to `true`, enables the growing feature of the control to
      * load more items by requesting from the bound model. **Note:** This feature only works when an `items`
      * aggregation is bound. Growing must not be used together with two-way binding. **Note:** If the property
      * is set to `true`, selected count (if present) and search, will work for currently loaded items only.
      * To make sure that all items in the table are loaded at once and the above features work properly, we
      * recommend setting the `growing` property to `false`.
      */
    var growing: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the number of items initially displayed in the table and defines the number of items to be
      * requested from the model for each grow. This property can only be used if the property `growing` is set
      * to `true`.
      */
    var growingThreshold: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The items of the table.
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapMColumnListItemMod.default] | typings.openui5.sapMColumnListItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fires when the value of the search field is changed by a user (for example at each key press).
      */
    var liveChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Enables the user to select several options from the table.
      */
    var multiSelect: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies the text displayed when the table has no data.
      */
    var noDataText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.18
      *
      * Controls whether the dialog clears the selection or not. When the dialog is opened multiple times in
      * the same context to allow for corrections of previous user inputs, set this flag to `true`. When the
      * dialog should reset the selection to allow for a new selection each time set it to `false` Note: This
      * property must be set before the Dialog is opened to have an effect.
      */
    var rememberSelections: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.71
      *
      * When set to `true`, the TableSelectDialog will have a resize handler in its bottom right corner. The
      * default value is `false`. **Note**: The TableSelectDialog can be resizable only in desktop mode.
      */
    var resizable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fires when the search button has been clicked on dialog.
      */
    var search: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.58
      *
      * This flag controls whether the Clear button is shown. When set to `true`, it provides a way to clear
      * a selection made in Table Select Dialog.
      *
      * We recommend enabling of the Clear button in the following cases, where a mechanism to clear the value
      * is needed: In case the Table Select Dialog is in single-selection mode (default mode) and `rememberSelections`
      * is set to `true`. The Clear button needs to be enabled in order to allow users to clear the selection.
      * In case of using `sap.m.Input` with `valueHelpOnly` set to `true`, the Clear button can be used for clearing
      * the selection. In case the application stores a value and uses only Table Select Dialog to edit/maintain
      * it.
      *
      * Optional: In case `multiSelect` is set to `true`, the selection can be easily cleared with one click.
      *
      * **Note:** When used with OData, only the loaded selections will be cleared.
      */
    var showClearButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies the title text in the dialog header.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.72
      *
      * Specifies the Title alignment (theme specific). If set to `TitleAlignment.Auto`, the Title will be aligned
      * as it is set in the theme (if not set, the default value is `center`); Other possible values are `TitleAlignment.Start`
      * (left or right depending on LTR/RTL), and `TitleAlignment.Center` (centered)
      */
    var titleAlignment: js.UndefOr[
        TitleAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleAlignment * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object TableSelectDialogSettings {
    
    inline def apply(): TableSelectDialogSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableSelectDialogSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableSelectDialogSettings] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setColumns(
        value: js.Array[typings.openui5.sapMColumnMod.default] | typings.openui5.sapMColumnMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: typings.openui5.sapMColumnMod.default*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setConfirm(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "confirm", js.Any.fromFunction1(value))
      
      inline def setConfirmButtonText(value: String | PropertyBindingInfo): Self = StObject.set(x, "confirmButtonText", value.asInstanceOf[js.Any])
      
      inline def setConfirmButtonTextUndefined: Self = StObject.set(x, "confirmButtonText", js.undefined)
      
      inline def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
      
      inline def setContentHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "contentHeight", value.asInstanceOf[js.Any])
      
      inline def setContentHeightUndefined: Self = StObject.set(x, "contentHeight", js.undefined)
      
      inline def setContentWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
      
      inline def setContentWidthUndefined: Self = StObject.set(x, "contentWidth", js.undefined)
      
      inline def setDraggable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setGrowing(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "growing", value.asInstanceOf[js.Any])
      
      inline def setGrowingThreshold(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "growingThreshold", value.asInstanceOf[js.Any])
      
      inline def setGrowingThresholdUndefined: Self = StObject.set(x, "growingThreshold", js.undefined)
      
      inline def setGrowingUndefined: Self = StObject.set(x, "growing", js.undefined)
      
      inline def setItems(
        value: js.Array[typings.openui5.sapMColumnListItemMod.default] | typings.openui5.sapMColumnListItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapMColumnListItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLiveChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "liveChange", js.Any.fromFunction1(value))
      
      inline def setLiveChangeUndefined: Self = StObject.set(x, "liveChange", js.undefined)
      
      inline def setMultiSelect(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectUndefined: Self = StObject.set(x, "multiSelect", js.undefined)
      
      inline def setNoDataText(value: String | PropertyBindingInfo): Self = StObject.set(x, "noDataText", value.asInstanceOf[js.Any])
      
      inline def setNoDataTextUndefined: Self = StObject.set(x, "noDataText", js.undefined)
      
      inline def setRememberSelections(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "rememberSelections", value.asInstanceOf[js.Any])
      
      inline def setRememberSelectionsUndefined: Self = StObject.set(x, "rememberSelections", js.undefined)
      
      inline def setResizable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      inline def setSearch(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setShowClearButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showClearButton", value.asInstanceOf[js.Any])
      
      inline def setShowClearButtonUndefined: Self = StObject.set(x, "showClearButton", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleAlignment(
        value: TitleAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleAlignment * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "titleAlignment", value.asInstanceOf[js.Any])
      
      inline def setTitleAlignmentUndefined: Self = StObject.set(x, "titleAlignment", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
