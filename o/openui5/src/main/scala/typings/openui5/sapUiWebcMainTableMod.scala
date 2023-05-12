package typings.openui5

import typings.openui5.anon.PoppedColumns
import typings.openui5.anon.PreviouslySelectedRows
import typings.openui5.anon.`15`
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiWebcMainLibraryMod.ITableColumn
import typings.openui5.sapUiWebcMainLibraryMod.ITableRow
import typings.openui5.sapUiWebcMainLibraryMod.TableGrowingMode
import typings.openui5.sapUiWebcMainLibraryMod.TableMode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainTableMod {
  
  @JSImport("sap/ui/webc/main/Table", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Table`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Table {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: TableSettings) = this()
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
    mSettings: TableSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: TableSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/main/Table", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.Table with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.webc.common.WebComponent.extend}.
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
    oClassInfo: ClassInfo[T, Table]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Table],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.main.Table.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait Table
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default {
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Adds some ariaLabelledBy into the association {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaLabelledBy(/**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: ID): this.type = js.native
    
    /**
      * Adds some column to the aggregation {@link #getColumns columns}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addColumn(/**
      * The column to add; if empty, nothing is inserted
      */
    oColumn: ITableColumn): this.type = js.native
    
    /**
      * Adds some row to the aggregation {@link #getRows rows}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addRow(/**
      * The row to add; if empty, nothing is inserted
      */
    oRow: ITableRow): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:loadMore loadMore} event of this `sap.ui.webc.main.Table`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Table` itself.
      *
      * Fired when the user presses the `More` button or scrolls to the table's end.
      *
      *
      *
      * **Note:** The event will be fired if `growing` is set to `Button` or `Scroll`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLoadMore(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachLoadMore(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Table` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:loadMore loadMore} event of this `sap.ui.webc.main.Table`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Table` itself.
      *
      * Fired when the user presses the `More` button or scrolls to the table's end.
      *
      *
      *
      * **Note:** The event will be fired if `growing` is set to `Button` or `Scroll`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLoadMore(
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
    def attachLoadMore(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Table` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:popinChange popinChange} event of this `sap.ui.webc.main.Table`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Table` itself.
      *
      * Fired when `sap.ui.webc.main.TableColumn` is shown as a pop-in instead of hiding it.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPopinChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPopinChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Table` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:popinChange popinChange} event of this `sap.ui.webc.main.Table`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Table` itself.
      *
      * Fired when `sap.ui.webc.main.TableColumn` is shown as a pop-in instead of hiding it.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPopinChange(
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
    def attachPopinChange(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Table` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:rowClick rowClick} event of this `sap.ui.webc.main.Table`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Table` itself.
      *
      * Fired when a row in `Active` mode is clicked or `Enter` key is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRowClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachRowClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Table` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:rowClick rowClick} event of this `sap.ui.webc.main.Table`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Table` itself.
      *
      * Fired when a row in `Active` mode is clicked or `Enter` key is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRowClick(
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
    def attachRowClick(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Table` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.ui.webc.main.Table`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Table` itself.
      *
      * Fired when selection is changed by user interaction in `SingleSelect` and `MultiSelect` modes.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSelectionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Table` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.ui.webc.main.Table`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Table` itself.
      *
      * Fired when selection is changed by user interaction in `SingleSelect` and `MultiSelect` modes.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectionChange(
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
    def attachSelectionChange(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Table` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the columns in the aggregation {@link #getColumns columns}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyColumns(): this.type = js.native
    
    /**
      * Destroys all the rows in the aggregation {@link #getRows rows}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyRows(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:loadMore loadMore} event of this `sap.ui.webc.main.Table`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachLoadMore(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachLoadMore(
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
      * Detaches event handler `fnFunction` from the {@link #event:popinChange popinChange} event of this `sap.ui.webc.main.Table`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPopinChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachPopinChange(
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
      * Detaches event handler `fnFunction` from the {@link #event:rowClick rowClick} event of this `sap.ui.webc.main.Table`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachRowClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachRowClick(
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
      * Detaches event handler `fnFunction` from the {@link #event:selectionChange selectionChange} event of
      * this `sap.ui.webc.main.Table`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelectionChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSelectionChange(
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
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:loadMore loadMore} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLoadMore(): this.type = js.native
    def fireLoadMore(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:popinChange popinChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePopinChange(): this.type = js.native
    def firePopinChange(/**
      * Parameters to pass along with the event
      */
    mParameters: PoppedColumns): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:rowClick rowClick} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireRowClick(): this.type = js.native
    def fireRowClick(/**
      * Parameters to pass along with the event
      */
    mParameters: `15`): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:selectionChange selectionChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelectionChange(): this.type = js.native
    def fireSelectionChange(/**
      * Parameters to pass along with the event
      */
    mParameters: PreviouslySelectedRows): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAccessibleName accessibleName}.
      *
      * Defines the accessible aria name of the component.
      *
      * @returns Value of property `accessibleName`
      */
    def getAccessibleName(): String = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getBusyDelay busyDelay}.
      *
      * Defines the delay in milliseconds, after which the busy indicator will show up for this component.
      *
      * Default value is `1000`.
      *
      * @returns Value of property `busyDelay`
      */
    def getBusyDelay(): int = js.native
    
    /**
      * Gets content of aggregation {@link #getColumns columns}.
      *
      * Defines the configuration for the columns of the component.
      *
      *  **Note:** Use `sap.ui.webc.main.TableColumn` for the intended design.
      */
    def getColumns(): js.Array[ITableColumn] = js.native
    
    /**
      * Gets current value of property {@link #getGrowing growing}.
      *
      * Defines whether the table will have growing capability either by pressing a `More` button, or via user
      * scroll. In both cases `load-more` event is fired.
      *
      *
      *
      * Available options:
      *
      *  `Button` - Shows a `More` button at the bottom of the table, pressing of which triggers the `load-more`
      * event.
      *  `Scroll` - The `load-more` event is triggered when the user scrolls to the bottom of the table;
      *  `None` (default) - The growing is off.
      *
      *
      *
      * **Restrictions:** `growing="Scroll"` is not supported for Internet Explorer, and the component will fallback
      * to `growing="Button"`.
      *
      * Default value is `None`.
      *
      * @returns Value of property `growing`
      */
    def getGrowing(): TableGrowingMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableGrowingMode * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getGrowingButtonSubtext growingButtonSubtext}.
      *
      * Defines the subtext that will be displayed under the `growingButtonText`.
      *
      *
      *
      *  **Note:** This property takes effect if `growing` is set to `Button`.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `growingButtonSubtext`
      */
    def getGrowingButtonSubtext(): String = js.native
    
    /**
      * Gets current value of property {@link #getGrowingButtonText growingButtonText}.
      *
      * Defines the text that will be displayed inside the growing button at the bottom of the table, meant for
      * loading more rows upon press.
      *
      *
      *
      *  **Note:** If not specified a built-in text will be displayed.
      *  **Note:** This property takes effect if `growing` is set to `Button`.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `growingButtonText`
      */
    def getGrowingButtonText(): String = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Defines the height of the control
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getHideNoData hideNoData}.
      *
      * Defines if the value of `noDataText` will be diplayed when there is no rows present in the table.
      *
      * Default value is `false`.
      *
      * @returns Value of property `hideNoData`
      */
    def getHideNoData(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getMode mode}.
      *
      * Defines the mode of the component.
      *
      *  Available options are:
      * 	 - `MultiSelect`
      * 	 - `SingleSelect`
      * 	 - `None`
      *
      * Default value is `None`.
      *
      * @returns Value of property `mode`
      */
    def getMode(): TableMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableMode * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getNoDataText noDataText}.
      *
      * Defines the text that will be displayed when there is no data and `hideNoData` is not present.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `noDataText`
      */
    def getNoDataText(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getRows rows}.
      *
      * Defines the component rows.
      *
      *  **Note:** Use `sap.ui.webc.main.TableRow` for the intended design.
      */
    def getRows(): js.Array[ITableRow] = js.native
    
    /**
      * Gets current value of property {@link #getStickyColumnHeader stickyColumnHeader}.
      *
      * Determines whether the column headers remain fixed at the top of the page during vertical scrolling as
      * long as the Web Component is in the viewport.
      *
      *  **Restrictions:**
      * 	 - Browsers that do not support this feature:
      * 	Internet Explorer
      * 	 - Microsoft Edge lower than version 41 (EdgeHTML 16)
      * 	 - Mozilla Firefox lower than version 59
      * 	 - Scrolling behavior:
      * 	If the Web Component is placed in layout containers that have the `overflow: hidden` or `overflow: auto`
      * style definition, this can prevent the sticky elements of the Web Component from becoming fixed at the
      * top of the viewport.
      *
      * Default value is `false`.
      *
      * @returns Value of property `stickyColumnHeader`
      */
    def getStickyColumnHeader(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the control
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.ui.webc.main.ITableColumn` in the aggregation {@link #getColumns columns}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfColumn(/**
      * The column whose index is looked for
      */
    oColumn: ITableColumn): int = js.native
    
    /**
      * Checks for the provided `sap.ui.webc.main.ITableRow` in the aggregation {@link #getRows rows}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfRow(/**
      * The row whose index is looked for
      */
    oRow: ITableRow): int = js.native
    
    /**
      * Inserts a column into the aggregation {@link #getColumns columns}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertColumn(
      /**
      * The column to insert; if empty, nothing is inserted
      */
    oColumn: ITableColumn,
      /**
      * The `0`-based index the column should be inserted at; for a negative value of `iIndex`, the column is
      * inserted at position 0; for a value greater than the current size of the aggregation, the column is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a row into the aggregation {@link #getRows rows}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertRow(
      /**
      * The row to insert; if empty, nothing is inserted
      */
    oRow: ITableRow,
      /**
      * The `0`-based index the row should be inserted at; for a negative value of `iIndex`, the row is inserted
      * at position 0; for a value greater than the current size of the aggregation, the row is inserted at the
      * last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getColumns columns}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllColumns(): js.Array[ITableColumn] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getRows rows}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllRows(): js.Array[ITableRow] = js.native
    
    /**
      * Removes an ariaLabelledBy from the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns The removed ariaLabelledBy or `null`
      */
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: int): ID | Null = js.native
    def removeAriaLabelledBy(
      /**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: ID): ID | Null = js.native
    
    def removeColumn(/**
      * The column to remove or its index or id
      */
    vColumn: String): ITableColumn | Null = js.native
    /**
      * Removes a column from the aggregation {@link #getColumns columns}.
      *
      * @returns The removed column or `null`
      */
    def removeColumn(/**
      * The column to remove or its index or id
      */
    vColumn: int): ITableColumn | Null = js.native
    def removeColumn(/**
      * The column to remove or its index or id
      */
    vColumn: ITableColumn): ITableColumn | Null = js.native
    
    def removeRow(/**
      * The row to remove or its index or id
      */
    vRow: String): ITableRow | Null = js.native
    /**
      * Removes a row from the aggregation {@link #getRows rows}.
      *
      * @returns The removed row or `null`
      */
    def removeRow(/**
      * The row to remove or its index or id
      */
    vRow: int): ITableRow | Null = js.native
    def removeRow(/**
      * The row to remove or its index or id
      */
    vRow: ITableRow): ITableRow | Null = js.native
    
    /**
      * Sets a new value for property {@link #getAccessibleName accessibleName}.
      *
      * Defines the accessible aria name of the component.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAccessibleName(/**
      * New value for property `accessibleName`
      */
    sAccessibleName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getBusy busy}.
      *
      * Defines if the table is in busy state.
      *
      * In this state the component's opacity is reduced and busy indicator is displayed at the bottom of the
      * table.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBusy(): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getBusyDelay busyDelay}.
      *
      * Defines the delay in milliseconds, after which the busy indicator will show up for this component.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1000`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBusyDelay(): this.type = js.native
    def setBusyDelay(/**
      * New value for property `busyDelay`
      */
    iBusyDelay: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGrowing growing}.
      *
      * Defines whether the table will have growing capability either by pressing a `More` button, or via user
      * scroll. In both cases `load-more` event is fired.
      *
      *
      *
      * Available options:
      *
      *  `Button` - Shows a `More` button at the bottom of the table, pressing of which triggers the `load-more`
      * event.
      *  `Scroll` - The `load-more` event is triggered when the user scrolls to the bottom of the table;
      *  `None` (default) - The growing is off.
      *
      *
      *
      * **Restrictions:** `growing="Scroll"` is not supported for Internet Explorer, and the component will fallback
      * to `growing="Button"`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGrowing(): this.type = js.native
    def setGrowing(
      /**
      * New value for property `growing`
      */
    sGrowing: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableGrowingMode * / any */ String
    ): this.type = js.native
    def setGrowing(/**
      * New value for property `growing`
      */
    sGrowing: TableGrowingMode): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGrowingButtonSubtext growingButtonSubtext}.
      *
      * Defines the subtext that will be displayed under the `growingButtonText`.
      *
      *
      *
      *  **Note:** This property takes effect if `growing` is set to `Button`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGrowingButtonSubtext(): this.type = js.native
    def setGrowingButtonSubtext(/**
      * New value for property `growingButtonSubtext`
      */
    sGrowingButtonSubtext: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGrowingButtonText growingButtonText}.
      *
      * Defines the text that will be displayed inside the growing button at the bottom of the table, meant for
      * loading more rows upon press.
      *
      *
      *
      *  **Note:** If not specified a built-in text will be displayed.
      *  **Note:** This property takes effect if `growing` is set to `Button`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGrowingButtonText(): this.type = js.native
    def setGrowingButtonText(/**
      * New value for property `growingButtonText`
      */
    sGrowingButtonText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Defines the height of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHideNoData hideNoData}.
      *
      * Defines if the value of `noDataText` will be diplayed when there is no rows present in the table.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHideNoData(): this.type = js.native
    def setHideNoData(/**
      * New value for property `hideNoData`
      */
    bHideNoData: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMode mode}.
      *
      * Defines the mode of the component.
      *
      *  Available options are:
      * 	 - `MultiSelect`
      * 	 - `SingleSelect`
      * 	 - `None`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMode(): this.type = js.native
    def setMode(
      /**
      * New value for property `mode`
      */
    sMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableMode * / any */ String
    ): this.type = js.native
    def setMode(/**
      * New value for property `mode`
      */
    sMode: TableMode): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getNoDataText noDataText}.
      *
      * Defines the text that will be displayed when there is no data and `hideNoData` is not present.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNoDataText(): this.type = js.native
    def setNoDataText(/**
      * New value for property `noDataText`
      */
    sNoDataText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getStickyColumnHeader stickyColumnHeader}.
      *
      * Determines whether the column headers remain fixed at the top of the page during vertical scrolling as
      * long as the Web Component is in the viewport.
      *
      *  **Restrictions:**
      * 	 - Browsers that do not support this feature:
      * 	Internet Explorer
      * 	 - Microsoft Edge lower than version 41 (EdgeHTML 16)
      * 	 - Mozilla Firefox lower than version 59
      * 	 - Scrolling behavior:
      * 	If the Web Component is placed in layout containers that have the `overflow: hidden` or `overflow: auto`
      * style definition, this can prevent the sticky elements of the Web Component from becoming fixed at the
      * top of the viewport.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStickyColumnHeader(): this.type = js.native
    def setStickyColumnHeader(/**
      * New value for property `stickyColumnHeader`
      */
    bStickyColumnHeader: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the width of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait TableSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the accessible aria name of the component.
      */
    var accessibleName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Receives id(or many ids) of the controls that label this control.
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Defines the delay in milliseconds, after which the busy indicator will show up for this component.
      */
    var busyDelay: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Defines the configuration for the columns of the component.
      *
      *  **Note:** Use `sap.ui.webc.main.TableColumn` for the intended design.
      */
    var columns: js.UndefOr[
        js.Array[ITableColumn] | ITableColumn | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the table will have growing capability either by pressing a `More` button, or via user
      * scroll. In both cases `load-more` event is fired.
      *
      *
      *
      * Available options:
      *
      *  `Button` - Shows a `More` button at the bottom of the table, pressing of which triggers the `load-more`
      * event.
      *  `Scroll` - The `load-more` event is triggered when the user scrolls to the bottom of the table;
      *  `None` (default) - The growing is off.
      *
      *
      *
      * **Restrictions:** `growing="Scroll"` is not supported for Internet Explorer, and the component will fallback
      * to `growing="Button"`.
      */
    var growing: js.UndefOr[
        TableGrowingMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableGrowingMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the subtext that will be displayed under the `growingButtonText`.
      *
      *
      *
      *  **Note:** This property takes effect if `growing` is set to `Button`.
      */
    var growingButtonSubtext: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the text that will be displayed inside the growing button at the bottom of the table, meant for
      * loading more rows upon press.
      *
      *
      *
      *  **Note:** If not specified a built-in text will be displayed.
      *  **Note:** This property takes effect if `growing` is set to `Button`.
      */
    var growingButtonText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the height of the control
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines if the value of `noDataText` will be diplayed when there is no rows present in the table.
      */
    var hideNoData: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the user presses the `More` button or scrolls to the table's end.
      *
      *
      *
      * **Note:** The event will be fired if `growing` is set to `Button` or `Scroll`.
      */
    var loadMore: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the mode of the component.
      *
      *  Available options are:
      * 	 - `MultiSelect`
      * 	 - `SingleSelect`
      * 	 - `None`
      */
    var mode: js.UndefOr[
        TableMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the text that will be displayed when there is no data and `hideNoData` is not present.
      */
    var noDataText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Fired when `sap.ui.webc.main.TableColumn` is shown as a pop-in instead of hiding it.
      */
    var popinChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fired when a row in `Active` mode is clicked or `Enter` key is pressed.
      */
    var rowClick: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the component rows.
      *
      *  **Note:** Use `sap.ui.webc.main.TableRow` for the intended design.
      */
    var rows: js.UndefOr[
        js.Array[ITableRow] | ITableRow | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when selection is changed by user interaction in `SingleSelect` and `MultiSelect` modes.
      */
    var selectionChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Determines whether the column headers remain fixed at the top of the page during vertical scrolling as
      * long as the Web Component is in the viewport.
      *
      *  **Restrictions:**
      * 	 - Browsers that do not support this feature:
      * 	Internet Explorer
      * 	 - Microsoft Edge lower than version 41 (EdgeHTML 16)
      * 	 - Mozilla Firefox lower than version 59
      * 	 - Scrolling behavior:
      * 	If the Web Component is placed in layout containers that have the `overflow: hidden` or `overflow: auto`
      * style definition, this can prevent the sticky elements of the Web Component from becoming fixed at the
      * top of the viewport.
      */
    var stickyColumnHeader: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the width of the control
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object TableSettings {
    
    inline def apply(): TableSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableSettings] (val x: Self) extends AnyVal {
      
      inline def setAccessibleName(value: String | PropertyBindingInfo): Self = StObject.set(x, "accessibleName", value.asInstanceOf[js.Any])
      
      inline def setAccessibleNameUndefined: Self = StObject.set(x, "accessibleName", js.undefined)
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setBusyDelay(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "busyDelay", value.asInstanceOf[js.Any])
      
      inline def setBusyDelayUndefined: Self = StObject.set(x, "busyDelay", js.undefined)
      
      inline def setColumns(
        value: js.Array[ITableColumn] | ITableColumn | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: ITableColumn*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setGrowing(
        value: TableGrowingMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableGrowingMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "growing", value.asInstanceOf[js.Any])
      
      inline def setGrowingButtonSubtext(value: String | PropertyBindingInfo): Self = StObject.set(x, "growingButtonSubtext", value.asInstanceOf[js.Any])
      
      inline def setGrowingButtonSubtextUndefined: Self = StObject.set(x, "growingButtonSubtext", js.undefined)
      
      inline def setGrowingButtonText(value: String | PropertyBindingInfo): Self = StObject.set(x, "growingButtonText", value.asInstanceOf[js.Any])
      
      inline def setGrowingButtonTextUndefined: Self = StObject.set(x, "growingButtonText", js.undefined)
      
      inline def setGrowingUndefined: Self = StObject.set(x, "growing", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHideNoData(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hideNoData", value.asInstanceOf[js.Any])
      
      inline def setHideNoDataUndefined: Self = StObject.set(x, "hideNoData", js.undefined)
      
      inline def setLoadMore(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "loadMore", js.Any.fromFunction1(value))
      
      inline def setLoadMoreUndefined: Self = StObject.set(x, "loadMore", js.undefined)
      
      inline def setMode(
        value: TableMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setNoDataText(value: String | PropertyBindingInfo): Self = StObject.set(x, "noDataText", value.asInstanceOf[js.Any])
      
      inline def setNoDataTextUndefined: Self = StObject.set(x, "noDataText", js.undefined)
      
      inline def setPopinChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "popinChange", js.Any.fromFunction1(value))
      
      inline def setPopinChangeUndefined: Self = StObject.set(x, "popinChange", js.undefined)
      
      inline def setRowClick(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "rowClick", js.Any.fromFunction1(value))
      
      inline def setRowClickUndefined: Self = StObject.set(x, "rowClick", js.undefined)
      
      inline def setRows(
        value: js.Array[ITableRow] | ITableRow | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setRowsVarargs(value: ITableRow*): Self = StObject.set(x, "rows", js.Array(value*))
      
      inline def setSelectionChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "selectionChange", js.Any.fromFunction1(value))
      
      inline def setSelectionChangeUndefined: Self = StObject.set(x, "selectionChange", js.undefined)
      
      inline def setStickyColumnHeader(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "stickyColumnHeader", value.asInstanceOf[js.Any])
      
      inline def setStickyColumnHeaderUndefined: Self = StObject.set(x, "stickyColumnHeader", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
