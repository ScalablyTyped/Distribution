package typings.openui5

import typings.openui5.anon.ClearButtonPressedItemsBinding
import typings.openui5.anon.ItemsBinding
import typings.openui5.anon.SelectedContexts
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

object sapMSelectDialogMod {
  
  @JSImport("sap/m/SelectDialog", JSImport.Default)
  @js.native
  /**
    * Constructor for a new SelectDialog.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/select-dialog/ Select Dialog}
    */
  open class default () extends SelectDialog {
    def this(/**
      * Initial settings for the new control A dialog that enables users to select one or more items from a comprehensive
      * list.
      */
    mSettings: SelectDialogSettings) = this()
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
      * Initial settings for the new control A dialog that enables users to select one or more items from a comprehensive
      * list.
      */
    mSettings: SelectDialogSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control A dialog that enables users to select one or more items from a comprehensive
      * list.
      */
    mSettings: SelectDialogSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/SelectDialog", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.SelectDialog with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, SelectDialog]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SelectDialog],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.SelectDialog.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait SelectDialog
    extends typings.openui5.sapMSelectDialogBaseMod.default {
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(
      /**
      * The item to add; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapMListItemBaseMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:cancel cancel} event of this `sap.m.SelectDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SelectDialog` itself.
      *
      * This event will be fired when the cancel button is clicked or ESC key is pressed
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
      * Context object to call the event handler with. Defaults to this `sap.m.SelectDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:cancel cancel} event of this `sap.m.SelectDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SelectDialog` itself.
      *
      * This event will be fired when the cancel button is clicked or ESC key is pressed
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
      * Context object to call the event handler with. Defaults to this `sap.m.SelectDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:confirm confirm} event of this `sap.m.SelectDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SelectDialog` itself.
      *
      * This event will be fired when the dialog is confirmed by selecting an item in single selection mode or
      * by pressing the confirmation button in multi selection mode . The items being selected are returned as
      * event parameters.
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
      * Context object to call the event handler with. Defaults to this `sap.m.SelectDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:confirm confirm} event of this `sap.m.SelectDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SelectDialog` itself.
      *
      * This event will be fired when the dialog is confirmed by selecting an item in single selection mode or
      * by pressing the confirmation button in multi selection mode . The items being selected are returned as
      * event parameters.
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
      * Context object to call the event handler with. Defaults to this `sap.m.SelectDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.m.SelectDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SelectDialog` itself.
      *
      * This event will be fired when the value of the search field is changed by a user - e.g. at each key press
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
      * Context object to call the event handler with. Defaults to this `sap.m.SelectDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.m.SelectDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SelectDialog` itself.
      *
      * This event will be fired when the value of the search field is changed by a user - e.g. at each key press
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
      * Context object to call the event handler with. Defaults to this `sap.m.SelectDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:search search} event of this `sap.m.SelectDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SelectDialog` itself.
      *
      * This event will be fired when the search button has been clicked on the searchfield on the visual control
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
      * Context object to call the event handler with. Defaults to this `sap.m.SelectDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:search search} event of this `sap.m.SelectDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SelectDialog` itself.
      *
      * This event will be fired when the search button has been clicked on the searchfield on the visual control
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
      * Context object to call the event handler with. Defaults to this `sap.m.SelectDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.68
      *
      * Clears the selections in the `sap.m.SelectDialog` and its internally used `sap.m.List` control.
      *
      * Use this method whenever the application logic expects changes in the model providing data for the SelectDialog
      * that will modify the position of the items, or will change the set with completely new items.
      *
      * @returns `this` to allow method chaining.
      */
    def clearSelection(): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:cancel cancel} event of this `sap.m.SelectDialog`.
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
      * Detaches event handler `fnFunction` from the {@link #event:confirm confirm} event of this `sap.m.SelectDialog`.
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
      * Detaches event handler `fnFunction` from the {@link #event:liveChange liveChange} event of this `sap.m.SelectDialog`.
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
      * Detaches event handler `fnFunction` from the {@link #event:search search} event of this `sap.m.SelectDialog`.
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
    mParameters: SelectedContexts): this.type = js.native
    
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
      * @SINCE 1.68
      *
      * Gets current value of property {@link #getConfirmButtonText confirmButtonText}.
      *
      * Overwrites the default text for the confirmation button.
      *
      * @returns Value of property `confirmButtonText`
      */
    def getConfirmButtonText(): String = js.native
    
    /**
      * Get the internal Dialog's contentHeight property {@link sap.m.Dialog}
      *
      * @returns sHeight The content width of the internal dialog
      */
    def getContentHeight(): CSSSize = js.native
    
    /**
      * Get the internal Dialog's contentWidth property {@link sap.m.Dialog}
      *
      * @returns sWidth The content width of the internal dialog
      */
    def getContentWidth(): CSSSize = js.native
    
    /**
      * @SINCE 1.70
      *
      * Gets current value of property {@link #getDraggable draggable}.
      *
      * When set to `true`, the SelectDialog is draggable by its header. The default value is `false`. **Note**:
      * The SelectDialog can be draggable only in desktop mode.
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
      * If set to `true`, enables the growing feature of the control to load more items by requesting from the
      * bound model (progressive loading). **Note:** This feature only works when an `items` aggregation is bound.
      * **Note:** Growing property, must not be used together with two-way binding. **Note:** If the property
      * is set to `true`, selected count (if present) and search, will work for currently loaded items only.
      * To make sure that all items in the table are loaded at once and the above features work properly, we
      * recommend setting the `growing` property to false.
      *
      * Default value is `true`.
      *
      * @returns Value of property `growing`
      */
    def getGrowing(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getGrowingThreshold growingThreshold}.
      *
      * Determines the number of items initially displayed in the list. Also defines the number of items to be
      * requested from the model for each grow. **Note:** This property could take affect only be used if the
      * property `growing` is set to `true`.
      *
      * @returns Value of property `growingThreshold`
      */
    def getGrowingThreshold(): int = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * The items of the list shown in the search dialog. It is recommended to use a StandardListItem for the
      * dialog but other combinations are also possible.
      */
    def getItems(): js.Array[typings.openui5.sapMListItemBaseMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getMultiSelect multiSelect}.
      *
      * Determines if the user can select several options from the list
      *
      * Default value is `false`.
      *
      * @returns Value of property `multiSelect`
      */
    def getMultiSelect(): Boolean = js.native
    
    /**
      * Get the internal List's no data text property
      *
      * @returns the current no data text
      */
    def getNoDataText(): String = js.native
    
    /**
      * @SINCE 1.18
      *
      * Gets current value of property {@link #getRememberSelections rememberSelections}.
      *
      * This flag controls whether the dialog clears the selection after the confirm event has been fired. If
      * the dialog needs to be opened multiple times in the same context to allow for corrections of previous
      * user inputs, set this flag to `true`.
      *
      * **Note:** The sap.m.SelectDialog uses {@link sap.m.ListBase#rememberSelections this} property of the
      * ListBase and therefore its behavior and restrictions also apply here.
      *
      * Default value is `false`.
      *
      * @returns Value of property `rememberSelections`
      */
    def getRememberSelections(): Boolean = js.native
    
    /**
      * @SINCE 1.70
      *
      * Gets current value of property {@link #getResizable resizable}.
      *
      * When set to `true`, the SelectDialog will have a resize handler in its bottom right corner. The default
      * value is `false`. **Note**: The SelectDialog can be resizable only in desktop mode.
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
      * selection mode in Select Dialog. We recommended enabling of the Clear button in the following cases,
      * where a mechanism to clear the value is needed: In case of single selection mode(default mode) for Select
      * Dialog and `rememberSelections` is set to `true`. Clear button needs to be enabled in order to allow
      * users to clear the selection. In case of using `sap.m.Input` with `valueHelpOnly` set to `true`, the
      * Clear button could be used for clearing selection. In case the application stores a value and uses only
      * Select Dialog to edit/maintain it. **Note:**When used with oData, only the loaded selections will be
      * cleared.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showClearButton`
      */
    def getShowClearButton(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Determines the title text that appears in the dialog header
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
      * Forward method to the inner dialog: hasStyleClass
      *
      * @returns `true` if the class is set, `false` otherwise
      */
    def hasStyleClass(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.m.ListItemBase` in the aggregation {@link #getItems items}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(/**
      * The item whose index is looked for
      */
    oItem: typings.openui5.sapMListItemBaseMod.default): int = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapMListItemBaseMod.default,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Is called after renderer is finished to show the busy state
      *
      * @returns `this` pointer for chaining
      */
    def onAfterRendering(): this.type = js.native
    
    /**
      * Opens the internal dialog with a searchfield and a list.
      *
      * @returns `this` pointer for chaining
      */
    def open(
      /**
      * A value for the search can be passed to match with the filter applied to the list binding.
      */
    sSearchValue: String
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[typings.openui5.sapMListItemBaseMod.default] = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): typings.openui5.sapMListItemBaseMod.default | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): typings.openui5.sapMListItemBaseMod.default | Null = js.native
    def removeItem(
      /**
      * The item to remove or its index or id
      */
    vItem: typings.openui5.sapMListItemBaseMod.default
    ): typings.openui5.sapMListItemBaseMod.default | Null = js.native
    
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
      * Set the internal Dialog's contentHeight property {@link sap.m.Dialog}
      *
      * @returns `this` pointer for chaining
      */
    def setContentHeight(/**
      * The new content width value for the dialog
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Set the internal Dialog's contentWidth property {@link sap.m.Dialog}
      *
      * @returns `this`s pointer for chaining
      */
    def setContentWidth(/**
      * The new content width value for the dialog
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
    bValue: Boolean): this.type = js.native
    
    /**
      * Sets the growing to the internal list
      *
      * @returns `this` pointer for chaining
      */
    def setGrowing(/**
      * Value for the list's growing.
      */
    bValue: Boolean): this.type = js.native
    
    /**
      * Sets the growing threshold to the internal list
      *
      * @returns `this` pointer for chaining
      */
    def setGrowingThreshold(/**
      * Value for the list's growing threshold.
      */
    iValue: int): this.type = js.native
    
    /**
      * Enable/Disable multi selection mode.
      *
      * @returns `this` pointer for chaining
      */
    def setMultiSelect(/**
      * Flag for multi selection mode
      */
    bMulti: Boolean): this.type = js.native
    
    /**
      * Set the internal List's no data text property
      *
      * @returns `this` pointer for chaining
      */
    def setNoDataText(/**
      * The no data text for the list
      */
    sNoDataText: String): this.type = js.native
    
    /**
      * @SINCE 1.18
      *
      * Sets a new value for property {@link #getRememberSelections rememberSelections}.
      *
      * This flag controls whether the dialog clears the selection after the confirm event has been fired. If
      * the dialog needs to be opened multiple times in the same context to allow for corrections of previous
      * user inputs, set this flag to `true`.
      *
      * **Note:** The sap.m.SelectDialog uses {@link sap.m.ListBase#rememberSelections this} property of the
      * ListBase and therefore its behavior and restrictions also apply here.
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
    bValue: Boolean): this.type = js.native
    
    /**
      * Sets the Clear button visible state
      *
      * @returns `this` pointer for chaining
      */
    def setShowClearButton(/**
      * Value for the Clear button visible state.
      */
    bVisible: Boolean): this.type = js.native
    
    /**
      * Set the title of the internal dialog
      *
      * @returns `this` pointer for chaining
      */
    def setTitle(/**
      * The title text for the dialog
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
  }
  
  trait SelectDialogSettings
    extends StObject
       with SelectDialogBaseSettings {
    
    /**
      * This event will be fired when the cancel button is clicked or ESC key is pressed
      */
    var cancel: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * This event will be fired when the dialog is confirmed by selecting an item in single selection mode or
      * by pressing the confirmation button in multi selection mode . The items being selected are returned as
      * event parameters.
      */
    var confirm: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.68
      *
      * Overwrites the default text for the confirmation button.
      */
    var confirmButtonText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines the content height of the inner dialog. For more information, see the dialog documentation.
      */
    var contentHeight: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.18
      *
      * Determines the content width of the inner dialog. For more information, see the dialog documentation.
      */
    var contentWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.70
      *
      * When set to `true`, the SelectDialog is draggable by its header. The default value is `false`. **Note**:
      * The SelectDialog can be draggable only in desktop mode.
      */
    var draggable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.56
      *
      * If set to `true`, enables the growing feature of the control to load more items by requesting from the
      * bound model (progressive loading). **Note:** This feature only works when an `items` aggregation is bound.
      * **Note:** Growing property, must not be used together with two-way binding. **Note:** If the property
      * is set to `true`, selected count (if present) and search, will work for currently loaded items only.
      * To make sure that all items in the table are loaded at once and the above features work properly, we
      * recommend setting the `growing` property to false.
      */
    var growing: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the number of items initially displayed in the list. Also defines the number of items to be
      * requested from the model for each grow. **Note:** This property could take affect only be used if the
      * property `growing` is set to `true`.
      */
    var growingThreshold: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The items of the list shown in the search dialog. It is recommended to use a StandardListItem for the
      * dialog but other combinations are also possible.
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapMListItemBaseMod.default] | typings.openui5.sapMListItemBaseMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This event will be fired when the value of the search field is changed by a user - e.g. at each key press
      */
    var liveChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Determines if the user can select several options from the list
      */
    var multiSelect: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the text shown when the list has no data
      */
    var noDataText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.18
      *
      * This flag controls whether the dialog clears the selection after the confirm event has been fired. If
      * the dialog needs to be opened multiple times in the same context to allow for corrections of previous
      * user inputs, set this flag to `true`.
      *
      * **Note:** The sap.m.SelectDialog uses {@link sap.m.ListBase#rememberSelections this} property of the
      * ListBase and therefore its behavior and restrictions also apply here.
      */
    var rememberSelections: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.70
      *
      * When set to `true`, the SelectDialog will have a resize handler in its bottom right corner. The default
      * value is `false`. **Note**: The SelectDialog can be resizable only in desktop mode.
      */
    var resizable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This event will be fired when the search button has been clicked on the searchfield on the visual control
      */
    var search: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.58
      *
      * This flag controls whether the Clear button is shown. When set to `true`, it provides a way to clear
      * selection mode in Select Dialog. We recommended enabling of the Clear button in the following cases,
      * where a mechanism to clear the value is needed: In case of single selection mode(default mode) for Select
      * Dialog and `rememberSelections` is set to `true`. Clear button needs to be enabled in order to allow
      * users to clear the selection. In case of using `sap.m.Input` with `valueHelpOnly` set to `true`, the
      * Clear button could be used for clearing selection. In case the application stores a value and uses only
      * Select Dialog to edit/maintain it. **Note:**When used with oData, only the loaded selections will be
      * cleared.
      */
    var showClearButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the title text that appears in the dialog header
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
  object SelectDialogSettings {
    
    inline def apply(): SelectDialogSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectDialogSettings]
    }
    
    extension [Self <: SelectDialogSettings](x: Self) {
      
      inline def setCancel(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
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
        value: js.Array[typings.openui5.sapMListItemBaseMod.default] | typings.openui5.sapMListItemBaseMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapMListItemBaseMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
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
