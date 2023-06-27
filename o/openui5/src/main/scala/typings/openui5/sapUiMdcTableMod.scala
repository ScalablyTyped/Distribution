package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.TitleLevel
import typings.openui5.sapUiMdcControlMod.ControlSettings
import typings.openui5.sapUiMdcEnumsTableP13nModeMod.TableP13nMode
import typings.openui5.sapUiMdcEnumsTableSelectionModeMod.TableSelectionMode
import typings.openui5.sapUiMdcEnumsTableTypeMod.TableType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcTableMod {
  
  @JSImport("sap/ui/mdc/Table", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `MDCTable`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Table {
    def this(/**
      * Object with initial settings for the new control
      */
    mSettings: TableSettings) = this()
    def this(/**
      * Optional ID for the new control; generated automatically if no non-empty ID is given **Note:** The optional
      * ID can be omitted, no matter whether `mSettings` is given or not.
      */
    sId: String) = this()
    def this(
      /**
      * Optional ID for the new control; generated automatically if no non-empty ID is given **Note:** The optional
      * ID can be omitted, no matter whether `mSettings` is given or not.
      */
    sId: String,
      /**
      * Object with initial settings for the new control
      */
    mSettings: TableSettings
    ) = this()
    def this(
      /**
      * Optional ID for the new control; generated automatically if no non-empty ID is given **Note:** The optional
      * ID can be omitted, no matter whether `mSettings` is given or not.
      */
    sId: Unit,
      /**
      * Object with initial settings for the new control
      */
    mSettings: TableSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/Table", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.Table with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.mdc.Control.extend}.
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
      * Returns a metadata object for class sap.ui.mdc.Table.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Table
    extends typings.openui5.sapUiMdcControlMod.default {
    
    /**
      * Adds some action to the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAction(
      /**
      * The action to add; if empty, nothing is inserted
      */
    oAction: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some column to the aggregation {@link #getColumns columns}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addColumn(
      /**
      * The column to add; if empty, nothing is inserted
      */
    oColumn: typings.openui5.sapUiMdcTableColumnMod.default
    ): this.type = js.native
    
    /**
      * @since 1.75
      *
      * Attaches event handler `fnFunction` to the {@link #event:beforeExport beforeExport} event of this `sap.ui.mdc.Table`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.Table` itself.
      *
      * This event is fired right before the export is triggered.
      *
      * For more information about the export settings, see {@link sap.ui.export.Spreadsheet} or {@link https://ui5.sap.com/#/topic/7e12e6b9154a4607be9d6072c72d609c Spreadsheet Export Configuration}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeExport(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TableBeforeExportEvent, Unit]
    ): this.type = js.native
    def attachBeforeExport(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TableBeforeExportEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.Table` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.75
      *
      * Attaches event handler `fnFunction` to the {@link #event:beforeExport beforeExport} event of this `sap.ui.mdc.Table`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.Table` itself.
      *
      * This event is fired right before the export is triggered.
      *
      * For more information about the export settings, see {@link sap.ui.export.Spreadsheet} or {@link https://ui5.sap.com/#/topic/7e12e6b9154a4607be9d6072c72d609c Spreadsheet Export Configuration}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeExport(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TableBeforeExportEvent, Unit]
    ): this.type = js.native
    def attachBeforeExport(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TableBeforeExportEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.Table` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:paste paste} event of this `sap.ui.mdc.Table`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.Table` itself.
      *
      * This event is fired when the user pastes content from the clipboard to the table.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPaste(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TablePasteEvent, Unit]
    ): this.type = js.native
    def attachPaste(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TablePasteEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.Table` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:paste paste} event of this `sap.ui.mdc.Table`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.Table` itself.
      *
      * This event is fired when the user pastes content from the clipboard to the table.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPaste(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TablePasteEvent, Unit]
    ): this.type = js.native
    def attachPaste(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TablePasteEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.Table` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:rowPress rowPress} event of this `sap.ui.mdc.Table`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.Table` itself.
      *
      * This event is fired when a row in the table is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRowPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TableRowPressEvent, Unit]
    ): this.type = js.native
    def attachRowPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TableRowPressEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.Table` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:rowPress rowPress} event of this `sap.ui.mdc.Table`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.Table` itself.
      *
      * This event is fired when a row in the table is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRowPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TableRowPressEvent, Unit]
    ): this.type = js.native
    def attachRowPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TableRowPressEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.Table` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.ui.mdc.Table`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.Table` itself.
      *
      * This event is fired when the selection in the table is changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TableSelectionChangeEvent, Unit]
    ): this.type = js.native
    def attachSelectionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TableSelectionChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.Table` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.ui.mdc.Table`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.Table` itself.
      *
      * This event is fired when the selection in the table is changed.
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
    fnFunction: js.Function1[/* p1 */ TableSelectionChangeEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ TableSelectionChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.Table` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Clears the selection.
      */
    def clearSelection(): Unit = js.native
    
    /**
      * Destroys all the actions in the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyActions(): this.type = js.native
    
    /**
      * Destroys all the columns in the aggregation {@link #getColumns columns}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyColumns(): this.type = js.native
    
    /**
      * @since 1.114
      *
      * Destroys the copyProvider in the aggregation {@link #getCopyProvider copyProvider}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCopyProvider(): this.type = js.native
    
    /**
      * @experimental - Do not use
      *
      * Destroys the creationRow in the aggregation {@link #getCreationRow creationRow}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCreationRow(): this.type = js.native
    
    /**
      * @since 1.89
      *
      * Destroys the dataStateIndicator in the aggregation {@link #getDataStateIndicator dataStateIndicator}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyDataStateIndicator(): this.type = js.native
    
    /**
      * @since 1.106
      *
      * Destroys the noData in the aggregation {@link #getNoData noData}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyNoData(): this.type = js.native
    
    /**
      * Destroys the quickFilter in the aggregation {@link #getQuickFilter quickFilter}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyQuickFilter(): this.type = js.native
    
    /**
      * Destroys the rowSettings in the aggregation {@link #getRowSettings rowSettings}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyRowSettings(): this.type = js.native
    
    /**
      * Destroys the type in the aggregation {@link #getType type}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyType(): this.type = js.native
    
    /**
      * Destroys the variant in the aggregation {@link #getVariant variant}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyVariant(): this.type = js.native
    
    /**
      * @since 1.75
      *
      * Detaches event handler `fnFunction` from the {@link #event:beforeExport beforeExport} event of this `sap.ui.mdc.Table`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeExport(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TableBeforeExportEvent, Unit]
    ): this.type = js.native
    def detachBeforeExport(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TableBeforeExportEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:paste paste} event of this `sap.ui.mdc.Table`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPaste(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TablePasteEvent, Unit]
    ): this.type = js.native
    def detachPaste(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TablePasteEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:rowPress rowPress} event of this `sap.ui.mdc.Table`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachRowPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TableRowPressEvent, Unit]
    ): this.type = js.native
    def detachRowPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TableRowPressEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:selectionChange selectionChange} event of
      * this `sap.ui.mdc.Table`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelectionChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TableSelectionChangeEvent, Unit]
    ): this.type = js.native
    def detachSelectionChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TableSelectionChangeEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.75
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:beforeExport beforeExport} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireBeforeExport(): this.type = js.native
    def fireBeforeExport(
      /**
      * Parameters to pass along with the event
      */
    mParameters: Table$BeforeExportEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:paste paste} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePaste(): this.type = js.native
    def firePaste(/**
      * Parameters to pass along with the event
      */
    mParameters: Table$PasteEventParameters): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:rowPress rowPress} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireRowPress(): this.type = js.native
    def fireRowPress(/**
      * Parameters to pass along with the event
      */
    mParameters: Table$RowPressEventParameters): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:selectionChange selectionChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelectionChange(): this.type = js.native
    def fireSelectionChange(
      /**
      * Parameters to pass along with the event
      */
    mParameters: Table$SelectionChangeEventParameters
    ): this.type = js.native
    
    /**
      * @since 1.86
      *
      * Sets the focus on the row. If `bFirstInteractiveElement` is `true`, and there are interactive elements
      * inside the row, sets the focus on the first interactive element. Otherwise sets the focus on the first
      * data cell, if the type is `GridTableType`, and on the entire row, if the type is `ResponsiveTableType`.
      * If the given index is not visible, the table scrolls to it automatically. In this case the same rules
      * apply as in {@link #scrollToIndex}.
      *
      * @returns A `Promise` that resolves after the focus has been set
      */
    def focusRow(/**
      * The index of the row that is to be focused
      */
    iIndex: Double): js.Promise[Any] = js.native
    def focusRow(
      /**
      * The index of the row that is to be focused
      */
    iIndex: Double,
      /**
      * Indicates whether to set the focus on the first interactive element inside the row
      */
    bFirstInteractiveElement: Boolean
    ): js.Promise[Any] = js.native
    
    /**
      * Gets content of aggregation {@link #getActions actions}.
      *
      * Additional/external actions available for the table.
      */
    def getActions(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @since 1.87
      *
      * Gets current value of property {@link #getAggregateConditions aggregateConditions}.
      *
      * Defines the aggregate conditions.
      *
      * **Note**: This property must not be bound.
      *  **Note:** This property is exclusively used for handling SAPUI5 flexibility changes.
      *
      * @returns Value of property `aggregateConditions`
      */
    def getAggregateConditions(): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getAutoBindOnInit autoBindOnInit}.
      *
      * Determines whether to bind the table automatically after the initial creation or re-creation of the table.
      *
      * Default value is `true`.
      *
      * @returns Value of property `autoBindOnInit`
      */
    def getAutoBindOnInit(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getColumns columns}.
      *
      * Columns of the table.
      */
    def getColumns(): js.Array[typings.openui5.sapUiMdcTableColumnMod.default] = js.native
    
    /**
      * @since 1.114
      *
      * Gets content of aggregation {@link #getCopyProvider copyProvider}.
      *
      * Defines an aggregation for the `CopyProvider` plugin that provides copy to clipboard capabilities for
      * the selected rows of the table and creates a Copy button for the toolbar of the table. To disable the
      * copy function of the table, including the Copy button in the toolbar, the `enabled` property of the `CopyProvider`
      * must be set to `false`. To hide the Copy button from the toolbar, the `visible` property of the `CopyProvider`
      * must be set to `false`.
      *
      * **Note:** The {@link sap.m.plugins.CopyProvider#extractData extractData} property of the `CopyProvider`
      * must not be managed by the application.
      */
    def getCopyProvider(): typings.openui5.sapMPluginsCopyProviderMod.default = js.native
    
    /**
      * @experimental - Do not use
      *
      * Gets content of aggregation {@link #getCreationRow creationRow}.
      *
      * This row can be used for user input to create new data if {@link sap.ui.mdc.enums.TableType TableType }
      * is "`Table`". **Note:** Once the binding supports creating transient records, this aggregation will be
      * removed.
      */
    def getCreationRow(): Any = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fetches the current state of the table (as a JSON) **Note:** This API may return attributes corresponding
      * to the `p13nMode` property configuration.
      *
      * @returns Current state of the table
      */
    def getCurrentState(): js.Object = js.native
    
    /**
      * @since 1.89
      *
      * Gets content of aggregation {@link #getDataStateIndicator dataStateIndicator}.
      *
      * `DataStateIndicator` plugin that can be used to show binding-related messages.
      *
      * **Note:** The message filtering is not yet supported for this control. Therefore the {@link sap.m.plugins.DataStateIndicator#getEnableFiltering enableFiltering }
      * property of the `DataStateIndicator` plugin must not be set to `true`.
      */
    def getDataStateIndicator(): typings.openui5.sapMPluginsDataStateIndicatorMod.default = js.native
    
    /**
      * @since 1.95
      *
      * Gets current value of property {@link #getEnableAutoColumnWidth enableAutoColumnWidth}.
      *
      * Enables automatic column width calculation based on metadata information if set to `true`. The column
      * width calculation takes the type, column label, referenced properties, and many other metadata parameters
      * into account. Providing a more precise `maxLength` value for the `String` type or `precision` value for
      * numeric types can help this algorithm to produce better results. The calculated column widths can have
      * a minimum of 3rem and a maximum of 20rem.
      *
      * **Note:** To customize the automatic column width calculation, the `visualSettings.widthSettings` key
      * of the `PropertyInfo` can be used. To avoid the heuristic column width calculation for a particular column,
      * the `visualSettings.widthSettings` key of the `PropertyInfo` must be set to `null`. This feature has
      * no effect if the `width` property of the column is bound or its value is set.
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableAutoColumnWidth`
      */
    def getEnableAutoColumnWidth(): Boolean = js.native
    
    /**
      * @since 1.90
      *
      * Gets current value of property {@link #getEnableColumnResize enableColumnResize}.
      *
      * Determines whether column resizing is enabled.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enableColumnResize`
      */
    def getEnableColumnResize(): Boolean = js.native
    
    /**
      * @since 1.75
      *
      * Gets current value of property {@link #getEnableExport enableExport}.
      *
      * Determines whether the table data export is enabled. To use the export functionality, the {@link sap.ui.export }
      * library is required.
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableExport`
      */
    def getEnableExport(): Boolean = js.native
    
    /**
      * @since 1.96
      *
      * Gets current value of property {@link #getEnablePaste enablePaste}.
      *
      * Determines whether the Paste button is enabled.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enablePaste`
      */
    def getEnablePaste(): Boolean = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getFilter filter}, or `null`.
      */
    def getFilter(): ID = js.native
    
    /**
      * @since 1.80.0
      *
      * Gets current value of property {@link #getFilterConditions filterConditions}.
      *
      * Defines the filter conditions.
      *
      * **Note**: This property must not be bound.
      *  **Note:** This property is used exclusively for handling SAPUI5 flexibility changes. Do not use it otherwise.
      *
      * Default value is `{}`.
      *
      * @returns Value of property `filterConditions`
      */
    def getFilterConditions(): js.Object = js.native
    
    /**
      * @since 1.87
      *
      * Gets current value of property {@link #getGroupConditions groupConditions}.
      *
      * Defines the group conditions.
      *
      * **Note**: This property must not be bound.
      *  **Note:** This property is used exclusively for handling SAPUI5 flexibility changes. Do not use it otherwise.
      *
      * @returns Value of property `groupConditions`
      */
    def getGroupConditions(): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getHeader header}.
      *
      * Header text that is shown in the table.
      *
      * @returns Value of property `header`
      */
    def getHeader(): String = js.native
    
    /**
      * @since 1.84
      *
      * Gets current value of property {@link #getHeaderLevel headerLevel}.
      *
      * Semantic level of the header. For more information, see {@link sap.m.Title#setLevel}.
      *
      * Default value is `Auto`.
      *
      * @returns Value of property `headerLevel`
      */
    def getHeaderLevel(): TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) = js.native
    
    /**
      * @since 1.63
      *
      * Gets current value of property {@link #getHeaderVisible headerVisible}.
      *
      * Determines whether the header text is shown in the table. Regardless of its value, the given header text
      * is used to label the table correctly for accessibility purposes.
      *
      * Default value is `true`.
      *
      * @returns Value of property `headerVisible`
      */
    def getHeaderVisible(): Boolean = js.native
    
    /**
      * @deprecated - Do not use.
      *
      * Gets current value of property {@link #getHeight height}.
      *
      * This property has no effect and will be rmoved soon.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * @since 1.93
      *
      * Gets current value of property {@link #getMultiSelectMode multiSelectMode}.
      *
      * Defines the multi-selection mode for the control. If this property is set to the `Default` value, the
      * `ResponsiveTable` type control renders the Select All checkbox in the column header, otherwise the Deselect
      * All icon is rendered.
      *
      * This property is used with the `selectionMode="Multi"`.
      *
      * **Note:** This property has currently no effect for table types other than `ResponsiveTable` type. This
      * is subject to change in future.
      *
      * Default value is `Default`.
      *
      * @returns Value of property `multiSelectMode`
      */
    def getMultiSelectMode(): Any = js.native
    
    /**
      * @since 1.106
      *
      * Gets content of aggregation {@link #getNoData noData}.
      *
      * Defines the custom visualization if there is no data to show in the table.
      *
      * **Note:** If {@link sap.m.IllustratedMessage} control is set for the `noData` aggregation and its {@link sap.m.IllustratedMessage#getTitle title }
      * property is not set then the table automatically offers a no data text with fitting {@link sap.m.IllustratedMessage.IllustratedMessageType illustration}.
      */
    def getNoData(): typings.openui5.sapUiCoreControlMod.default | String = js.native
    
    /**
      * @since 1.62
      *
      * Gets current value of property {@link #getP13nMode p13nMode}.
      *
      * Personalization options for the table.
      *  **Note:** The order of the options does not influence the position on the UI.
      *
      * Default value is `[]`.
      *
      * @returns Value of property `p13nMode`
      */
    def getP13nMode(): js.Array[
        TableP13nMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableP13nMode * / any */ String)
      ] = js.native
    
    /**
      * @since 1.111
      *
      * Gets current value of property {@link #getPropertyInfo propertyInfo}.
      *
      * Specifies the table metadata.
      *
      * Whenever the `TableDelegate` needs to wait for, for example, server-side information to provide the `PropertyInfo`
      * objects, specifying an array of {@link sap.ui.mdc.table.PropertyInfo PropertyInfo} objects here enables
      * the table to speed up the initial setup.
      *
      * Instead of requesting the `PropertyInfo` objects from the `TableDelegate` and waiting for them, the table
      * will use the `PropertyInfo` objects specified here for rendering-specific tasks, e.g. automatic column
      * width calculation, and to trigger the initial data request.
      *
      * To enable the table for these tasks, certain attributes of a `PropertyInfo` must be specified. You can
      * find the list of required attributes in the documentation of the `PropertyInfo`, for example, in {@link sap.ui.mdc.table.PropertyInfo}.
      *
      * This property is processed only once during the instantiation of the table. Any subsequent changes have
      * no effect.
      *
      * **Note**: This property must not be bound. **Note**: This property is used exclusively for SAPUI5 flexibility
      * / Fiori Elements. Do not use it otherwise.
      *
      * Default value is `[]`.
      *
      * @returns Value of property `propertyInfo`
      */
    def getPropertyInfo(): js.Array[js.Object] = js.native
    
    /**
      * Gets content of aggregation {@link #getQuickFilter quickFilter}.
      *
      * Additional `Filter` for the table.
      */
    def getQuickFilter(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getRowSettings rowSettings}.
      *
      * Settings for the table rows.
      *
      * **Note:** Each time the properties of the settings are changed, they have to be applied again via `setRowSettings`
      * for the changes to take effect.
      */
    def getRowSettings(): typings.openui5.sapUiMdcTableRowSettingsMod.default = js.native
    
    /**
      * Gets contexts that have been selected by the user.
      *
      * @returns The selected contexts
      */
    def getSelectedContexts(): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getSelectionMode selectionMode}.
      *
      * Selection mode of the table. Specifies whether single or multiple rows can be selected and how the selection
      * can be extended. It may also influence the visual appearance.
      *
      * With the {@link sap.ui.mdc.table.GridTableType GridTableType} and server-side models, range selections,
      * including Select All, only work properly if the count is known. Make sure the model/binding is configured
      * to request the count from the service.
      *
      * Default value is `None`.
      *
      * @returns Value of property `selectionMode`
      */
    def getSelectionMode(): TableSelectionMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableSelectionMode * / any */ String) = js.native
    
    /**
      * @since 1.91
      *
      * Gets current value of property {@link #getShowPasteButton showPasteButton}.
      *
      * Determines whether the Paste button is visible.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showPasteButton`
      */
    def getShowPasteButton(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowRowCount showRowCount}.
      *
      * Determines whether the number of rows is shown along with the header text. If set to `false`, the number
      * of rows is not shown on the user interface.
      *  **Note:**
      *  For better performance dedicated OData requests should not be sent. The count mode must be configured
      * either in the model or in the binding of the table.
      *  This property can only be used if the back-end service supports row count.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showRowCount`
      */
    def getShowRowCount(): Boolean = js.native
    
    /**
      * @since 1.73
      *
      * Gets current value of property {@link #getSortConditions sortConditions}.
      *
      * Defines the sort conditions.
      *
      * **Note**: This property must not be bound.
      *  **Note:** This property is used exclusively for handling SAPUI5 flexibility changes. Do not use it otherwise.
      *
      * @returns Value of property `sortConditions`
      */
    def getSortConditions(): js.Object = js.native
    
    /**
      * @since 1.63
      *
      * Gets current value of property {@link #getThreshold threshold}.
      *
      * Number of records to be requested from the model. If the `type` property is set to `ResponsiveTable`,
      * then it refers to the {@link sap.m.ListBase#getGrowingThreshold growingThreshold} property of `ResponsiveTable`.
      * If the `type` property is set to `Table`, then it refers to the {@link sap.ui.table.Table#getThreshold threshold }
      * property of `GridTable`.
      *  **Note:** This property only takes effect if it is set to a positive integer value. Otherwise the table
      * uses the default value of the corresponding table types.
      *
      * Default value is `-1`.
      *
      * @returns Value of property `threshold`
      */
    def getThreshold(): int = js.native
    
    /**
      * Gets content of aggregation {@link #getType type}.
      *
      * Type of the table.
      */
    def getType(): typings.openui5.sapUiMdcTableTableTypeBaseMod.default | TableType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableType * / any */ String) = js.native
    
    /**
      * @since 1.115
      *
      * Gets current value of property {@link #getUseColumnLabelsAsTooltips useColumnLabelsAsTooltips}.
      *
      * If no tooltip has been provided for a column, the column header text will automatically be applied as
      * a tooltip for the column.
      *
      * Default value is `false`.
      *
      * @returns Value of property `useColumnLabelsAsTooltips`
      */
    def getUseColumnLabelsAsTooltips(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getVariant variant}.
      *
      * VariantManagement control for the table.
      */
    def getVariant(): typings.openui5.sapUiFlVariantsVariantManagementMod.default = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Width of the table.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getActions actions}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfAction(
      /**
      * The action whose index is looked for
      */
    oAction: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.mdc.table.Column` in the aggregation {@link #getColumns columns}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfColumn(
      /**
      * The column whose index is looked for
      */
    oColumn: typings.openui5.sapUiMdcTableColumnMod.default
    ): int = js.native
    
    /**
      * Returns a `Promise` that resolves once the table has been initialized after the creation and changing
      * of its type.
      *
      * @returns A `Promise` that resolves after the table has been initialized
      */
    def initialized(): js.Promise[Any] = js.native
    
    /**
      * Inserts a action into the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertAction(
      /**
      * The action to insert; if empty, nothing is inserted
      */
    oAction: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the action should be inserted at; for a negative value of `iIndex`, the action is
      * inserted at position 0; for a value greater than the current size of the aggregation, the action is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a column into the aggregation {@link #getColumns columns}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertColumn(
      /**
      * The column to insert; if empty, nothing is inserted
      */
    oColumn: typings.openui5.sapUiMdcTableColumnMod.default,
      /**
      * The `0`-based index the column should be inserted at; for a negative value of `iIndex`, the column is
      * inserted at position 0; for a value greater than the current size of the aggregation, the column is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Checks whether aggregation personalization is enabled.
      *
      * @returns Whether aggregation personalization is enabled
      */
    def isAggregationEnabled(): Boolean = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Checks whether filter personalization is enabled.
      *
      * @returns Whether filter personalization is enabled
      */
    def isFilteringEnabled(): Boolean = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Checks whether group personalization is enabled.
      *
      * @returns Whether group personalization is enabled
      */
    def isGroupingEnabled(): Boolean = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Checks whether sort personalization is enabled.
      *
      * @returns Whether sort personalization is enabled
      */
    def isSortingEnabled(): Boolean = js.native
    
    /**
      * Checks whether the table is bound.
      *
      * @returns Whether the table is bound
      */
    def isTableBound(): Boolean = js.native
    
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a action from the aggregation {@link #getActions actions}.
      *
      * @returns The removed action or `null`
      */
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeAction(
      /**
      * The action to remove or its index or id
      */
    vAction: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getActions actions}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllActions(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getColumns columns}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllColumns(): js.Array[typings.openui5.sapUiMdcTableColumnMod.default] = js.native
    
    def removeColumn(/**
      * The column to remove or its index or id
      */
    vColumn: String): typings.openui5.sapUiMdcTableColumnMod.default | Null = js.native
    /**
      * Removes a column from the aggregation {@link #getColumns columns}.
      *
      * @returns The removed column or `null`
      */
    def removeColumn(/**
      * The column to remove or its index or id
      */
    vColumn: int): typings.openui5.sapUiMdcTableColumnMod.default | Null = js.native
    def removeColumn(
      /**
      * The column to remove or its index or id
      */
    vColumn: typings.openui5.sapUiMdcTableColumnMod.default
    ): typings.openui5.sapUiMdcTableColumnMod.default | Null = js.native
    
    /**
      * @since 1.76
      *
      * Scrolls the table to the row with the given index. Depending on the table type, this might cause additional
      * requests. If the given index is -1, it will scroll to the end of the table based on the length of the
      * underlying binding. If the length is not final, it will only scroll to the end of the current binding
      * and might trigger a request for additional entries. This also applies in case of a responsive table with
      * growing enabled.
      *
      * @returns A `Promise` that resolves after the table scrolls to the row with the given index
      */
    def scrollToIndex(/**
      * The index of the row that should be scrolled into the visible area
      */
    iIndex: Double): js.Promise[Any] = js.native
    
    /**
      * @since 1.87
      *
      * Sets a new value for property {@link #getAggregateConditions aggregateConditions}.
      *
      * Defines the aggregate conditions.
      *
      * **Note**: This property must not be bound.
      *  **Note:** This property is exclusively used for handling SAPUI5 flexibility changes.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAggregateConditions(/**
      * New value for property `aggregateConditions`
      */
    oAggregateConditions: js.Object): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAutoBindOnInit autoBindOnInit}.
      *
      * Determines whether to bind the table automatically after the initial creation or re-creation of the table.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAutoBindOnInit(): this.type = js.native
    def setAutoBindOnInit(/**
      * New value for property `autoBindOnInit`
      */
    bAutoBindOnInit: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getBusyIndicatorDelay busyIndicatorDelay}.
      *
      * The delay in milliseconds after which the busy indicator is shown.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `100`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBusyIndicatorDelay(): this.type = js.native
    
    /**
      * @since 1.114
      *
      * Sets the aggregated {@link #getCopyProvider copyProvider}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCopyProvider(
      /**
      * The copyProvider to set
      */
    oCopyProvider: typings.openui5.sapMPluginsCopyProviderMod.default
    ): this.type = js.native
    
    /**
      * @experimental - Do not use
      *
      * Sets the aggregated {@link #getCreationRow creationRow}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCreationRow(/**
      * The creationRow to set
      */
    oCreationRow: /* was: sap.ui.mdc.table.CreationRow */ Any): this.type = js.native
    
    /**
      * @since 1.89
      *
      * Sets the aggregated {@link #getDataStateIndicator dataStateIndicator}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDataStateIndicator(
      /**
      * The dataStateIndicator to set
      */
    oDataStateIndicator: typings.openui5.sapMPluginsDataStateIndicatorMod.default
    ): this.type = js.native
    
    /**
      * @experimental
      *
      * Sets a new value for property {@link #getDelegate delegate}.
      *
      * Path to `TableDelegate` module that provides the required APIs to create table content.
      *  **Note:** Ensure that the related file can be requested (any required library has to be loaded before
      * that).
      *  Do not bind or modify the module. Once the required module is associated, this property might not be
      * needed any longer.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `...see text or source`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDelegate(): this.type = js.native
    
    /**
      * @since 1.95
      *
      * Sets a new value for property {@link #getEnableAutoColumnWidth enableAutoColumnWidth}.
      *
      * Enables automatic column width calculation based on metadata information if set to `true`. The column
      * width calculation takes the type, column label, referenced properties, and many other metadata parameters
      * into account. Providing a more precise `maxLength` value for the `String` type or `precision` value for
      * numeric types can help this algorithm to produce better results. The calculated column widths can have
      * a minimum of 3rem and a maximum of 20rem.
      *
      * **Note:** To customize the automatic column width calculation, the `visualSettings.widthSettings` key
      * of the `PropertyInfo` can be used. To avoid the heuristic column width calculation for a particular column,
      * the `visualSettings.widthSettings` key of the `PropertyInfo` must be set to `null`. This feature has
      * no effect if the `width` property of the column is bound or its value is set.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableAutoColumnWidth(): this.type = js.native
    def setEnableAutoColumnWidth(/**
      * New value for property `enableAutoColumnWidth`
      */
    bEnableAutoColumnWidth: Boolean): this.type = js.native
    
    /**
      * @since 1.90
      *
      * Sets a new value for property {@link #getEnableColumnResize enableColumnResize}.
      *
      * Determines whether column resizing is enabled.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableColumnResize(): this.type = js.native
    def setEnableColumnResize(/**
      * New value for property `enableColumnResize`
      */
    bEnableColumnResize: Boolean): this.type = js.native
    
    /**
      * @since 1.75
      *
      * Sets a new value for property {@link #getEnableExport enableExport}.
      *
      * Determines whether the table data export is enabled. To use the export functionality, the {@link sap.ui.export }
      * library is required.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableExport(): this.type = js.native
    def setEnableExport(/**
      * New value for property `enableExport`
      */
    bEnableExport: Boolean): this.type = js.native
    
    /**
      * @since 1.96
      *
      * Sets a new value for property {@link #getEnablePaste enablePaste}.
      *
      * Determines whether the Paste button is enabled.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnablePaste(): this.type = js.native
    def setEnablePaste(/**
      * New value for property `enablePaste`
      */
    bEnablePaste: Boolean): this.type = js.native
    
    def setFilter(
      /**
      * ID of an element which becomes the new target of this filter association; alternatively, an element instance
      * may be given
      */
    oFilter: /* was: sap.ui.mdc.IFilter */ Any
    ): this.type = js.native
    /**
      * Sets the associated {@link #getFilter filter}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFilter(
      /**
      * ID of an element which becomes the new target of this filter association; alternatively, an element instance
      * may be given
      */
    oFilter: ID
    ): this.type = js.native
    
    /**
      * @since 1.80.0
      *
      * Sets a new value for property {@link #getFilterConditions filterConditions}.
      *
      * Defines the filter conditions.
      *
      * **Note**: This property must not be bound.
      *  **Note:** This property is used exclusively for handling SAPUI5 flexibility changes. Do not use it otherwise.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `{}`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFilterConditions(): this.type = js.native
    def setFilterConditions(/**
      * New value for property `filterConditions`
      */
    oFilterConditions: js.Object): this.type = js.native
    
    /**
      * @since 1.87
      *
      * Sets a new value for property {@link #getGroupConditions groupConditions}.
      *
      * Defines the group conditions.
      *
      * **Note**: This property must not be bound.
      *  **Note:** This property is used exclusively for handling SAPUI5 flexibility changes. Do not use it otherwise.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGroupConditions(/**
      * New value for property `groupConditions`
      */
    oGroupConditions: js.Object): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeader header}.
      *
      * Header text that is shown in the table.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeader(): this.type = js.native
    def setHeader(/**
      * New value for property `header`
      */
    sHeader: String): this.type = js.native
    
    /**
      * @since 1.84
      *
      * Sets a new value for property {@link #getHeaderLevel headerLevel}.
      *
      * Semantic level of the header. For more information, see {@link sap.m.Title#setLevel}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Auto`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderLevel(): this.type = js.native
    def setHeaderLevel(
      /**
      * New value for property `headerLevel`
      */
    sHeaderLevel: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String
    ): this.type = js.native
    def setHeaderLevel(/**
      * New value for property `headerLevel`
      */
    sHeaderLevel: TitleLevel): this.type = js.native
    
    /**
      * @since 1.63
      *
      * Sets a new value for property {@link #getHeaderVisible headerVisible}.
      *
      * Determines whether the header text is shown in the table. Regardless of its value, the given header text
      * is used to label the table correctly for accessibility purposes.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderVisible(): this.type = js.native
    def setHeaderVisible(/**
      * New value for property `headerVisible`
      */
    bHeaderVisible: Boolean): this.type = js.native
    
    /**
      * @deprecated - Do not use.
      *
      * Sets a new value for property {@link #getHeight height}.
      *
      * This property has no effect and will be rmoved soon.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * @since 1.93
      *
      * Sets a new value for property {@link #getMultiSelectMode multiSelectMode}.
      *
      * Defines the multi-selection mode for the control. If this property is set to the `Default` value, the
      * `ResponsiveTable` type control renders the Select All checkbox in the column header, otherwise the Deselect
      * All icon is rendered.
      *
      * This property is used with the `selectionMode="Multi"`.
      *
      * **Note:** This property has currently no effect for table types other than `ResponsiveTable` type. This
      * is subject to change in future.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Default`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMultiSelectMode(): this.type = js.native
    def setMultiSelectMode(
      /**
      * New value for property `multiSelectMode`
      */
    sMultiSelectMode: /* was: sap.ui.mdc.enums.TableMultiSelectMode */ Any
    ): this.type = js.native
    
    def setNoData(/**
      * The noData to set
      */
    vNoData: String): this.type = js.native
    /**
      * @since 1.106
      *
      * Sets the aggregated {@link #getNoData noData}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNoData(/**
      * The noData to set
      */
    vNoData: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * @since 1.62
      *
      * Sets a new value for property {@link #getP13nMode p13nMode}.
      *
      * Personalization options for the table.
      *  **Note:** The order of the options does not influence the position on the UI.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `[]`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setP13nMode(): this.type = js.native
    def setP13nMode(
      /**
      * New value for property `p13nMode`
      */
    sP13nMode: js.Array[
          TableP13nMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableP13nMode * / any */ String)
        ]
    ): this.type = js.native
    
    /**
      * @since 1.111
      *
      * Sets a new value for property {@link #getPropertyInfo propertyInfo}.
      *
      * Specifies the table metadata.
      *
      * Whenever the `TableDelegate` needs to wait for, for example, server-side information to provide the `PropertyInfo`
      * objects, specifying an array of {@link sap.ui.mdc.table.PropertyInfo PropertyInfo} objects here enables
      * the table to speed up the initial setup.
      *
      * Instead of requesting the `PropertyInfo` objects from the `TableDelegate` and waiting for them, the table
      * will use the `PropertyInfo` objects specified here for rendering-specific tasks, e.g. automatic column
      * width calculation, and to trigger the initial data request.
      *
      * To enable the table for these tasks, certain attributes of a `PropertyInfo` must be specified. You can
      * find the list of required attributes in the documentation of the `PropertyInfo`, for example, in {@link sap.ui.mdc.table.PropertyInfo}.
      *
      * This property is processed only once during the instantiation of the table. Any subsequent changes have
      * no effect.
      *
      * **Note**: This property must not be bound. **Note**: This property is used exclusively for SAPUI5 flexibility
      * / Fiori Elements. Do not use it otherwise.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `[]`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPropertyInfo(): this.type = js.native
    def setPropertyInfo(/**
      * New value for property `propertyInfo`
      */
    sPropertyInfo: js.Array[js.Object]): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getQuickFilter quickFilter}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setQuickFilter(/**
      * The quickFilter to set
      */
    oQuickFilter: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getRowSettings rowSettings}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRowSettings(
      /**
      * The rowSettings to set
      */
    oRowSettings: typings.openui5.sapUiMdcTableRowSettingsMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSelectionMode selectionMode}.
      *
      * Selection mode of the table. Specifies whether single or multiple rows can be selected and how the selection
      * can be extended. It may also influence the visual appearance.
      *
      * With the {@link sap.ui.mdc.table.GridTableType GridTableType} and server-side models, range selections,
      * including Select All, only work properly if the count is known. Make sure the model/binding is configured
      * to request the count from the service.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelectionMode(): this.type = js.native
    def setSelectionMode(
      /**
      * New value for property `selectionMode`
      */
    sSelectionMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableSelectionMode * / any */ String
    ): this.type = js.native
    def setSelectionMode(/**
      * New value for property `selectionMode`
      */
    sSelectionMode: TableSelectionMode): this.type = js.native
    
    /**
      * @since 1.91
      *
      * Sets a new value for property {@link #getShowPasteButton showPasteButton}.
      *
      * Determines whether the Paste button is visible.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowPasteButton(): this.type = js.native
    def setShowPasteButton(/**
      * New value for property `showPasteButton`
      */
    bShowPasteButton: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowRowCount showRowCount}.
      *
      * Determines whether the number of rows is shown along with the header text. If set to `false`, the number
      * of rows is not shown on the user interface.
      *  **Note:**
      *  For better performance dedicated OData requests should not be sent. The count mode must be configured
      * either in the model or in the binding of the table.
      *  This property can only be used if the back-end service supports row count.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowRowCount(): this.type = js.native
    def setShowRowCount(/**
      * New value for property `showRowCount`
      */
    bShowRowCount: Boolean): this.type = js.native
    
    /**
      * @since 1.73
      *
      * Sets a new value for property {@link #getSortConditions sortConditions}.
      *
      * Defines the sort conditions.
      *
      * **Note**: This property must not be bound.
      *  **Note:** This property is used exclusively for handling SAPUI5 flexibility changes. Do not use it otherwise.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSortConditions(/**
      * New value for property `sortConditions`
      */
    oSortConditions: js.Object): this.type = js.native
    
    /**
      * @since 1.63
      *
      * Sets a new value for property {@link #getThreshold threshold}.
      *
      * Number of records to be requested from the model. If the `type` property is set to `ResponsiveTable`,
      * then it refers to the {@link sap.m.ListBase#getGrowingThreshold growingThreshold} property of `ResponsiveTable`.
      * If the `type` property is set to `Table`, then it refers to the {@link sap.ui.table.Table#getThreshold threshold }
      * property of `GridTable`.
      *  **Note:** This property only takes effect if it is set to a positive integer value. Otherwise the table
      * uses the default value of the corresponding table types.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `-1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setThreshold(): this.type = js.native
    def setThreshold(/**
      * New value for property `threshold`
      */
    iThreshold: int): this.type = js.native
    
    def setType(
      /**
      * The type to set
      */
    vType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableType * / any */ String
    ): this.type = js.native
    def setType(/**
      * The type to set
      */
    vType: TableType): this.type = js.native
    /**
      * Sets the aggregated {@link #getType type}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setType(/**
      * The type to set
      */
    vType: typings.openui5.sapUiMdcTableTableTypeBaseMod.default): this.type = js.native
    
    /**
      * @since 1.115
      *
      * Sets a new value for property {@link #getUseColumnLabelsAsTooltips useColumnLabelsAsTooltips}.
      *
      * If no tooltip has been provided for a column, the column header text will automatically be applied as
      * a tooltip for the column.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUseColumnLabelsAsTooltips(): this.type = js.native
    def setUseColumnLabelsAsTooltips(
      /**
      * New value for property `useColumnLabelsAsTooltips`
      */
    bUseColumnLabelsAsTooltips: Boolean
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getVariant variant}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVariant(
      /**
      * The variant to set
      */
    oVariant: typings.openui5.sapUiFlVariantsVariantManagementMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Width of the table.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait Table$BeforeExportEventParameters extends StObject {
    
    /**
      * Contains `workbook.columns, dataSource`, and other export-related information.
      *
      * **Note:** The `exportSettings` parameter can be modified by the listener. Thus the parameter can be different
      * if multiple listeners are registered which manipulate the parameter.
      */
    var exportSettings: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Contains an array of {@link sap.ui.export.util.Filter} objects.
      */
    var filterSettings: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    /**
      * Contains the export settings defined by the user.
      */
    var userExportSettings: js.UndefOr[js.Object] = js.undefined
  }
  object Table$BeforeExportEventParameters {
    
    inline def apply(): Table$BeforeExportEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Table$BeforeExportEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Table$BeforeExportEventParameters] (val x: Self) extends AnyVal {
      
      inline def setExportSettings(value: js.Object): Self = StObject.set(x, "exportSettings", value.asInstanceOf[js.Any])
      
      inline def setExportSettingsUndefined: Self = StObject.set(x, "exportSettings", js.undefined)
      
      inline def setFilterSettings(value: js.Array[js.Object]): Self = StObject.set(x, "filterSettings", value.asInstanceOf[js.Any])
      
      inline def setFilterSettingsUndefined: Self = StObject.set(x, "filterSettings", js.undefined)
      
      inline def setFilterSettingsVarargs(value: js.Object*): Self = StObject.set(x, "filterSettings", js.Array(value*))
      
      inline def setUserExportSettings(value: js.Object): Self = StObject.set(x, "userExportSettings", value.asInstanceOf[js.Any])
      
      inline def setUserExportSettingsUndefined: Self = StObject.set(x, "userExportSettings", js.undefined)
    }
  }
  
  trait Table$PasteEventParameters extends StObject {
    
    /**
      * 2D array of strings with data from the clipboard. The first dimension represents the rows, and the second
      * dimension represents the cells of the tabular data.
      */
    var data: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  }
  object Table$PasteEventParameters {
    
    inline def apply(): Table$PasteEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Table$PasteEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Table$PasteEventParameters] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Array[js.Array[String]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: js.Array[String]*): Self = StObject.set(x, "data", js.Array(value*))
    }
  }
  
  trait Table$RowPressEventParameters extends StObject {
    
    /**
      * The binding context
      */
    var bindingContext: js.UndefOr[typings.openui5.sapUiModelContextMod.default] = js.undefined
  }
  object Table$RowPressEventParameters {
    
    inline def apply(): Table$RowPressEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Table$RowPressEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Table$RowPressEventParameters] (val x: Self) extends AnyVal {
      
      inline def setBindingContext(value: typings.openui5.sapUiModelContextMod.default): Self = StObject.set(x, "bindingContext", value.asInstanceOf[js.Any])
      
      inline def setBindingContextUndefined: Self = StObject.set(x, "bindingContext", js.undefined)
    }
  }
  
  trait Table$SelectionChangeEventParameters extends StObject {
    
    /**
      * Identifies whether the Select All checkbox was pressed
      */
    var selectAll: js.UndefOr[Boolean] = js.undefined
  }
  object Table$SelectionChangeEventParameters {
    
    inline def apply(): Table$SelectionChangeEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Table$SelectionChangeEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Table$SelectionChangeEventParameters] (val x: Self) extends AnyVal {
      
      inline def setSelectAll(value: Boolean): Self = StObject.set(x, "selectAll", value.asInstanceOf[js.Any])
      
      inline def setSelectAllUndefined: Self = StObject.set(x, "selectAll", js.undefined)
    }
  }
  
  type TableBeforeExportEvent = typings.openui5.sapUiBaseEventMod.default[Table$BeforeExportEventParameters]
  
  type TableBeforeExportEventParameters = Table$BeforeExportEventParameters
  
  type TablePasteEvent = typings.openui5.sapUiBaseEventMod.default[Table$PasteEventParameters]
  
  type TablePasteEventParameters = Table$PasteEventParameters
  
  type TableRowPressEvent = typings.openui5.sapUiBaseEventMod.default[Table$RowPressEventParameters]
  
  type TableRowPressEventParameters = Table$RowPressEventParameters
  
  type TableSelectionChangeEvent = typings.openui5.sapUiBaseEventMod.default[Table$SelectionChangeEventParameters]
  
  type TableSelectionChangeEventParameters = Table$SelectionChangeEventParameters
  
  trait TableSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Additional/external actions available for the table.
      */
    var actions: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.87
      *
      * Defines the aggregate conditions.
      *
      * **Note**: This property must not be bound.
      *  **Note:** This property is exclusively used for handling SAPUI5 flexibility changes.
      */
    var aggregateConditions: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether to bind the table automatically after the initial creation or re-creation of the table.
      */
    var autoBindOnInit: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.75
      *
      * This event is fired right before the export is triggered.
      *
      * For more information about the export settings, see {@link sap.ui.export.Spreadsheet} or {@link https://ui5.sap.com/#/topic/7e12e6b9154a4607be9d6072c72d609c Spreadsheet Export Configuration}.
      */
    var beforeExport: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$BeforeExportEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Columns of the table.
      */
    var columns: js.UndefOr[
        js.Array[typings.openui5.sapUiMdcTableColumnMod.default] | typings.openui5.sapUiMdcTableColumnMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.114
      *
      * Defines an aggregation for the `CopyProvider` plugin that provides copy to clipboard capabilities for
      * the selected rows of the table and creates a Copy button for the toolbar of the table. To disable the
      * copy function of the table, including the Copy button in the toolbar, the `enabled` property of the `CopyProvider`
      * must be set to `false`. To hide the Copy button from the toolbar, the `visible` property of the `CopyProvider`
      * must be set to `false`.
      *
      * **Note:** The {@link sap.m.plugins.CopyProvider#extractData extractData} property of the `CopyProvider`
      * must not be managed by the application.
      */
    var copyProvider: js.UndefOr[typings.openui5.sapMPluginsCopyProviderMod.default] = js.undefined
    
    /**
      * @experimental - Do not use
      *
      * This row can be used for user input to create new data if {@link sap.ui.mdc.enums.TableType TableType }
      * is "`Table`". **Note:** Once the binding supports creating transient records, this aggregation will be
      * removed.
      */
    var creationRow: js.UndefOr[/* was: sap.ui.mdc.table.CreationRow */ Any] = js.undefined
    
    /**
      * @since 1.89
      *
      * `DataStateIndicator` plugin that can be used to show binding-related messages.
      *
      * **Note:** The message filtering is not yet supported for this control. Therefore the {@link sap.m.plugins.DataStateIndicator#getEnableFiltering enableFiltering }
      * property of the `DataStateIndicator` plugin must not be set to `true`.
      */
    var dataStateIndicator: js.UndefOr[typings.openui5.sapMPluginsDataStateIndicatorMod.default] = js.undefined
    
    /**
      * @since 1.95
      *
      * Enables automatic column width calculation based on metadata information if set to `true`. The column
      * width calculation takes the type, column label, referenced properties, and many other metadata parameters
      * into account. Providing a more precise `maxLength` value for the `String` type or `precision` value for
      * numeric types can help this algorithm to produce better results. The calculated column widths can have
      * a minimum of 3rem and a maximum of 20rem.
      *
      * **Note:** To customize the automatic column width calculation, the `visualSettings.widthSettings` key
      * of the `PropertyInfo` can be used. To avoid the heuristic column width calculation for a particular column,
      * the `visualSettings.widthSettings` key of the `PropertyInfo` must be set to `null`. This feature has
      * no effect if the `width` property of the column is bound or its value is set.
      */
    var enableAutoColumnWidth: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.90
      *
      * Determines whether column resizing is enabled.
      */
    var enableColumnResize: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.75
      *
      * Determines whether the table data export is enabled. To use the export functionality, the {@link sap.ui.export }
      * library is required.
      */
    var enableExport: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.96
      *
      * Determines whether the Paste button is enabled.
      */
    var enablePaste: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Control or object that enables the table to do filtering, such as {@link sap.ui.mdc.FilterBar}. See also
      * {@link sap.ui.mdc.IFilter}.
      *
      * Automatic filter generation only works in combination with a `sap.ui.mdc.FilterBar`.
      */
    var filter: js.UndefOr[(/* was: sap.ui.mdc.IFilter */ Any) | String] = js.undefined
    
    /**
      * @since 1.80.0
      *
      * Defines the filter conditions.
      *
      * **Note**: This property must not be bound.
      *  **Note:** This property is used exclusively for handling SAPUI5 flexibility changes. Do not use it otherwise.
      */
    var filterConditions: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.87
      *
      * Defines the group conditions.
      *
      * **Note**: This property must not be bound.
      *  **Note:** This property is used exclusively for handling SAPUI5 flexibility changes. Do not use it otherwise.
      */
    var groupConditions: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Header text that is shown in the table.
      */
    var header: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.84
      *
      * Semantic level of the header. For more information, see {@link sap.m.Title#setLevel}.
      */
    var headerLevel: js.UndefOr[
        TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @since 1.63
      *
      * Determines whether the header text is shown in the table. Regardless of its value, the given header text
      * is used to label the table correctly for accessibility purposes.
      */
    var headerVisible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated - Do not use.
      *
      * This property has no effect and will be rmoved soon.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.93
      *
      * Defines the multi-selection mode for the control. If this property is set to the `Default` value, the
      * `ResponsiveTable` type control renders the Select All checkbox in the column header, otherwise the Deselect
      * All icon is rendered.
      *
      * This property is used with the `selectionMode="Multi"`.
      *
      * **Note:** This property has currently no effect for table types other than `ResponsiveTable` type. This
      * is subject to change in future.
      */
    var multiSelectMode: js.UndefOr[Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @since 1.106
      *
      * Defines the custom visualization if there is no data to show in the table.
      *
      * **Note:** If {@link sap.m.IllustratedMessage} control is set for the `noData` aggregation and its {@link sap.m.IllustratedMessage#getTitle title }
      * property is not set then the table automatically offers a no data text with fitting {@link sap.m.IllustratedMessage.IllustratedMessageType illustration}.
      */
    var noData: js.UndefOr[String | typings.openui5.sapUiCoreControlMod.default | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.62
      *
      * Personalization options for the table.
      *  **Note:** The order of the options does not influence the position on the UI.
      */
    var p13nMode: js.UndefOr[
        (js.Array[
          TableP13nMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableP13nMode * / any */ String)
        ]) | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This event is fired when the user pastes content from the clipboard to the table.
      */
    var paste: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$PasteEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @since 1.111
      *
      * Specifies the table metadata.
      *
      * Whenever the `TableDelegate` needs to wait for, for example, server-side information to provide the `PropertyInfo`
      * objects, specifying an array of {@link sap.ui.mdc.table.PropertyInfo PropertyInfo} objects here enables
      * the table to speed up the initial setup.
      *
      * Instead of requesting the `PropertyInfo` objects from the `TableDelegate` and waiting for them, the table
      * will use the `PropertyInfo` objects specified here for rendering-specific tasks, e.g. automatic column
      * width calculation, and to trigger the initial data request.
      *
      * To enable the table for these tasks, certain attributes of a `PropertyInfo` must be specified. You can
      * find the list of required attributes in the documentation of the `PropertyInfo`, for example, in {@link sap.ui.mdc.table.PropertyInfo}.
      *
      * This property is processed only once during the instantiation of the table. Any subsequent changes have
      * no effect.
      *
      * **Note**: This property must not be bound. **Note**: This property is used exclusively for SAPUI5 flexibility
      * / Fiori Elements. Do not use it otherwise.
      */
    var propertyInfo: js.UndefOr[
        js.Array[js.Object] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Additional `Filter` for the table.
      */
    var quickFilter: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * This event is fired when a row in the table is pressed.
      */
    var rowPress: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$RowPressEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Settings for the table rows.
      *
      * **Note:** Each time the properties of the settings are changed, they have to be applied again via `setRowSettings`
      * for the changes to take effect.
      */
    var rowSettings: js.UndefOr[typings.openui5.sapUiMdcTableRowSettingsMod.default] = js.undefined
    
    /**
      * This event is fired when the selection in the table is changed.
      */
    var selectionChange: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$SelectionChangeEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Selection mode of the table. Specifies whether single or multiple rows can be selected and how the selection
      * can be extended. It may also influence the visual appearance.
      *
      * With the {@link sap.ui.mdc.table.GridTableType GridTableType} and server-side models, range selections,
      * including Select All, only work properly if the count is known. Make sure the model/binding is configured
      * to request the count from the service.
      */
    var selectionMode: js.UndefOr[
        TableSelectionMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableSelectionMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @since 1.91
      *
      * Determines whether the Paste button is visible.
      */
    var showPasteButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the number of rows is shown along with the header text. If set to `false`, the number
      * of rows is not shown on the user interface.
      *  **Note:**
      *  For better performance dedicated OData requests should not be sent. The count mode must be configured
      * either in the model or in the binding of the table.
      *  This property can only be used if the back-end service supports row count.
      */
    var showRowCount: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.73
      *
      * Defines the sort conditions.
      *
      * **Note**: This property must not be bound.
      *  **Note:** This property is used exclusively for handling SAPUI5 flexibility changes. Do not use it otherwise.
      */
    var sortConditions: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.63
      *
      * Number of records to be requested from the model. If the `type` property is set to `ResponsiveTable`,
      * then it refers to the {@link sap.m.ListBase#getGrowingThreshold growingThreshold} property of `ResponsiveTable`.
      * If the `type` property is set to `Table`, then it refers to the {@link sap.ui.table.Table#getThreshold threshold }
      * property of `GridTable`.
      *  **Note:** This property only takes effect if it is set to a positive integer value. Otherwise the table
      * uses the default value of the corresponding table types.
      */
    var threshold: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Type of the table.
      */
    var `type`: js.UndefOr[
        TableType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableType * / any */ String) | typings.openui5.sapUiMdcTableTableTypeBaseMod.default | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @since 1.115
      *
      * If no tooltip has been provided for a column, the column header text will automatically be applied as
      * a tooltip for the column.
      */
    var useColumnLabelsAsTooltips: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * VariantManagement control for the table.
      */
    var variant: js.UndefOr[typings.openui5.sapUiFlVariantsVariantManagementMod.default] = js.undefined
    
    /**
      * Width of the table.
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
      
      inline def setActions(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setAggregateConditions(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "aggregateConditions", value.asInstanceOf[js.Any])
      
      inline def setAggregateConditionsUndefined: Self = StObject.set(x, "aggregateConditions", js.undefined)
      
      inline def setAutoBindOnInit(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "autoBindOnInit", value.asInstanceOf[js.Any])
      
      inline def setAutoBindOnInitUndefined: Self = StObject.set(x, "autoBindOnInit", js.undefined)
      
      inline def setBeforeExport(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$BeforeExportEventParameters] => Unit
      ): Self = StObject.set(x, "beforeExport", js.Any.fromFunction1(value))
      
      inline def setBeforeExportUndefined: Self = StObject.set(x, "beforeExport", js.undefined)
      
      inline def setColumns(
        value: js.Array[typings.openui5.sapUiMdcTableColumnMod.default] | typings.openui5.sapUiMdcTableColumnMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: typings.openui5.sapUiMdcTableColumnMod.default*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setCopyProvider(value: typings.openui5.sapMPluginsCopyProviderMod.default): Self = StObject.set(x, "copyProvider", value.asInstanceOf[js.Any])
      
      inline def setCopyProviderUndefined: Self = StObject.set(x, "copyProvider", js.undefined)
      
      inline def setCreationRow(value: /* was: sap.ui.mdc.table.CreationRow */ Any): Self = StObject.set(x, "creationRow", value.asInstanceOf[js.Any])
      
      inline def setCreationRowUndefined: Self = StObject.set(x, "creationRow", js.undefined)
      
      inline def setDataStateIndicator(value: typings.openui5.sapMPluginsDataStateIndicatorMod.default): Self = StObject.set(x, "dataStateIndicator", value.asInstanceOf[js.Any])
      
      inline def setDataStateIndicatorUndefined: Self = StObject.set(x, "dataStateIndicator", js.undefined)
      
      inline def setEnableAutoColumnWidth(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableAutoColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setEnableAutoColumnWidthUndefined: Self = StObject.set(x, "enableAutoColumnWidth", js.undefined)
      
      inline def setEnableColumnResize(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableColumnResize", value.asInstanceOf[js.Any])
      
      inline def setEnableColumnResizeUndefined: Self = StObject.set(x, "enableColumnResize", js.undefined)
      
      inline def setEnableExport(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableExport", value.asInstanceOf[js.Any])
      
      inline def setEnableExportUndefined: Self = StObject.set(x, "enableExport", js.undefined)
      
      inline def setEnablePaste(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enablePaste", value.asInstanceOf[js.Any])
      
      inline def setEnablePasteUndefined: Self = StObject.set(x, "enablePaste", js.undefined)
      
      inline def setFilter(value: (/* was: sap.ui.mdc.IFilter */ Any) | String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterConditions(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "filterConditions", value.asInstanceOf[js.Any])
      
      inline def setFilterConditionsUndefined: Self = StObject.set(x, "filterConditions", js.undefined)
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setGroupConditions(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "groupConditions", value.asInstanceOf[js.Any])
      
      inline def setGroupConditionsUndefined: Self = StObject.set(x, "groupConditions", js.undefined)
      
      inline def setHeader(value: String | PropertyBindingInfo): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderLevel(
        value: TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "headerLevel", value.asInstanceOf[js.Any])
      
      inline def setHeaderLevelUndefined: Self = StObject.set(x, "headerLevel", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeaderVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "headerVisible", value.asInstanceOf[js.Any])
      
      inline def setHeaderVisibleUndefined: Self = StObject.set(x, "headerVisible", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMultiSelectMode(value: Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "multiSelectMode", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectModeUndefined: Self = StObject.set(x, "multiSelectMode", js.undefined)
      
      inline def setNoData(value: String | typings.openui5.sapUiCoreControlMod.default | PropertyBindingInfo): Self = StObject.set(x, "noData", value.asInstanceOf[js.Any])
      
      inline def setNoDataUndefined: Self = StObject.set(x, "noData", js.undefined)
      
      inline def setP13nMode(
        value: (js.Array[
              TableP13nMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableP13nMode * / any */ String)
            ]) | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "p13nMode", value.asInstanceOf[js.Any])
      
      inline def setP13nModeUndefined: Self = StObject.set(x, "p13nMode", js.undefined)
      
      inline def setP13nModeVarargs(
        value: (TableP13nMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableP13nMode * / any */ String))*
      ): Self = StObject.set(x, "p13nMode", js.Array(value*))
      
      inline def setPaste(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$PasteEventParameters] => Unit): Self = StObject.set(x, "paste", js.Any.fromFunction1(value))
      
      inline def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
      
      inline def setPropertyInfo(
        value: js.Array[js.Object] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "propertyInfo", value.asInstanceOf[js.Any])
      
      inline def setPropertyInfoUndefined: Self = StObject.set(x, "propertyInfo", js.undefined)
      
      inline def setPropertyInfoVarargs(value: js.Object*): Self = StObject.set(x, "propertyInfo", js.Array(value*))
      
      inline def setQuickFilter(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "quickFilter", value.asInstanceOf[js.Any])
      
      inline def setQuickFilterUndefined: Self = StObject.set(x, "quickFilter", js.undefined)
      
      inline def setRowPress(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$RowPressEventParameters] => Unit
      ): Self = StObject.set(x, "rowPress", js.Any.fromFunction1(value))
      
      inline def setRowPressUndefined: Self = StObject.set(x, "rowPress", js.undefined)
      
      inline def setRowSettings(value: typings.openui5.sapUiMdcTableRowSettingsMod.default): Self = StObject.set(x, "rowSettings", value.asInstanceOf[js.Any])
      
      inline def setRowSettingsUndefined: Self = StObject.set(x, "rowSettings", js.undefined)
      
      inline def setSelectionChange(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$SelectionChangeEventParameters] => Unit
      ): Self = StObject.set(x, "selectionChange", js.Any.fromFunction1(value))
      
      inline def setSelectionChangeUndefined: Self = StObject.set(x, "selectionChange", js.undefined)
      
      inline def setSelectionMode(
        value: TableSelectionMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableSelectionMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      inline def setShowPasteButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showPasteButton", value.asInstanceOf[js.Any])
      
      inline def setShowPasteButtonUndefined: Self = StObject.set(x, "showPasteButton", js.undefined)
      
      inline def setShowRowCount(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showRowCount", value.asInstanceOf[js.Any])
      
      inline def setShowRowCountUndefined: Self = StObject.set(x, "showRowCount", js.undefined)
      
      inline def setSortConditions(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "sortConditions", value.asInstanceOf[js.Any])
      
      inline def setSortConditionsUndefined: Self = StObject.set(x, "sortConditions", js.undefined)
      
      inline def setThreshold(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setType(
        value: TableType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableType * / any */ String) | typings.openui5.sapUiMdcTableTableTypeBaseMod.default | PropertyBindingInfo
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUseColumnLabelsAsTooltips(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "useColumnLabelsAsTooltips", value.asInstanceOf[js.Any])
      
      inline def setUseColumnLabelsAsTooltipsUndefined: Self = StObject.set(x, "useColumnLabelsAsTooltips", js.undefined)
      
      inline def setVariant(value: typings.openui5.sapUiFlVariantsVariantManagementMod.default): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
