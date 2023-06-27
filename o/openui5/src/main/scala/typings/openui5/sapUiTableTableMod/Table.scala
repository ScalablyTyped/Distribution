package typings.openui5.sapUiTableTableMod

import typings.openui5.int
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.IContextMenu
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.Toolbar
import typings.openui5.sapUiTableLibraryMod.NavigationMode
import typings.openui5.sapUiTableLibraryMod.SelectionBehavior
import typings.openui5.sapUiTableLibraryMod.SelectionMode
import typings.openui5.sapUiTableLibraryMod.SortOrder
import typings.openui5.sapUiTableLibraryMod.VisibleRowCountMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Table
  extends typings.openui5.sapUiCoreControlMod.default {
  
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
  def addColumn(
    /**
    * The column to add; if empty, nothing is inserted
    */
  oColumn: typings.openui5.sapUiTableColumnMod.default
  ): this.type = js.native
  
  /**
    * Adds some extension to the aggregation {@link #getExtension extension}.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def addExtension(
    /**
    * The extension to add; if empty, nothing is inserted
    */
  oExtension: typings.openui5.sapUiCoreControlMod.default
  ): this.type = js.native
  
  /**
    * @since 1.64
    *
    * Adds some plugin to the aggregation {@link #getPlugins plugins}.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def addPlugin(
    /**
    * The plugin to add; if empty, nothing is inserted
    */
  oPlugin: typings.openui5.sapUiTablePluginsSelectionPluginMod.default
  ): this.type = js.native
  
  /**
    * Adds some row to the aggregation {@link #getRows rows}.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def addRow(
    /**
    * The row to add; if empty, nothing is inserted
    */
  oRow: typings.openui5.sapUiTableRowMod.default
  ): this.type = js.native
  
  /**
    * Adds the given selection interval to the selection. In case of a single selection, only `iIndexTo` is
    * added to the selection.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def addSelectionInterval(
    /**
    * Index from which the selection starts
    */
  iIndexFrom: int,
    /**
    * Index up to which to select
    */
  iIndexTo: int
  ): this.type = js.native
  
  /**
    * @since 1.54
    *
    * Attaches event handler `fnFunction` to the {@link #event:beforeOpenContextMenu beforeOpenContextMenu }
    * event of this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * Fired when the user requests the context menu for a table cell.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachBeforeOpenContextMenu(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableBeforeOpenContextMenuEvent, Unit]
  ): this.type = js.native
  def attachBeforeOpenContextMenu(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableBeforeOpenContextMenuEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * @since 1.54
    *
    * Attaches event handler `fnFunction` to the {@link #event:beforeOpenContextMenu beforeOpenContextMenu }
    * event of this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * Fired when the user requests the context menu for a table cell.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachBeforeOpenContextMenu(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableBeforeOpenContextMenuEvent, Unit]
  ): this.type = js.native
  def attachBeforeOpenContextMenu(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableBeforeOpenContextMenuEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * @since 1.37.0
    *
    * Attaches event handler `fnFunction` to the {@link #event:busyStateChanged busyStateChanged} event of
    * this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * This event gets fired when the busy state of the table changes. It should only be used by composite controls.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachBusyStateChanged(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableBusyStateChangedEvent, Unit]
  ): this.type = js.native
  def attachBusyStateChanged(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableBusyStateChangedEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * @since 1.37.0
    *
    * Attaches event handler `fnFunction` to the {@link #event:busyStateChanged busyStateChanged} event of
    * this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * This event gets fired when the busy state of the table changes. It should only be used by composite controls.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachBusyStateChanged(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableBusyStateChangedEvent, Unit]
  ): this.type = js.native
  def attachBusyStateChanged(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableBusyStateChangedEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * @since 1.21.0
    *
    * Attaches event handler `fnFunction` to the {@link #event:cellClick cellClick} event of this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * fired when the user clicks a cell of the table (experimental!).
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachCellClick(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableCellClickEvent, Unit]
  ): this.type = js.native
  def attachCellClick(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableCellClickEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * @since 1.21.0
    *
    * Attaches event handler `fnFunction` to the {@link #event:cellClick cellClick} event of this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * fired when the user clicks a cell of the table (experimental!).
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachCellClick(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableCellClickEvent, Unit]
  ): this.type = js.native
  def attachCellClick(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableCellClickEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * @since 1.21.0
    * @deprecated (since 1.54) - replaced by `beforeOpenContextMenu`.
    *
    * Attaches event handler `fnFunction` to the {@link #event:cellContextmenu cellContextmenu} event of this
    * `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * fired when the user clicks a cell of the table.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachCellContextmenu(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableCellContextmenuEvent, Unit]
  ): this.type = js.native
  def attachCellContextmenu(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableCellContextmenuEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * @since 1.21.0
    * @deprecated (since 1.54) - replaced by `beforeOpenContextMenu`.
    *
    * Attaches event handler `fnFunction` to the {@link #event:cellContextmenu cellContextmenu} event of this
    * `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * fired when the user clicks a cell of the table.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachCellContextmenu(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableCellContextmenuEvent, Unit]
  ): this.type = js.native
  def attachCellContextmenu(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableCellContextmenuEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * @since 1.21.0
    *
    * Attaches event handler `fnFunction` to the {@link #event:columnFreeze columnFreeze} event of this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * fired when a column of the table should be freezed
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachColumnFreeze(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnFreezeEvent, Unit]
  ): this.type = js.native
  def attachColumnFreeze(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnFreezeEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * @since 1.21.0
    *
    * Attaches event handler `fnFunction` to the {@link #event:columnFreeze columnFreeze} event of this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * fired when a column of the table should be freezed
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachColumnFreeze(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnFreezeEvent, Unit]
  ): this.type = js.native
  def attachColumnFreeze(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnFreezeEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Attaches event handler `fnFunction` to the {@link #event:columnMove columnMove} event of this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * fired when a table column is moved.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachColumnMove(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnMoveEvent, Unit]
  ): this.type = js.native
  def attachColumnMove(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnMoveEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * Attaches event handler `fnFunction` to the {@link #event:columnMove columnMove} event of this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * fired when a table column is moved.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachColumnMove(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnMoveEvent, Unit]
  ): this.type = js.native
  def attachColumnMove(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnMoveEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Attaches event handler `fnFunction` to the {@link #event:columnResize columnResize} event of this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * fired when a table column is resized.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachColumnResize(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnResizeEvent, Unit]
  ): this.type = js.native
  def attachColumnResize(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnResizeEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * Attaches event handler `fnFunction` to the {@link #event:columnResize columnResize} event of this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * fired when a table column is resized.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachColumnResize(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnResizeEvent, Unit]
  ): this.type = js.native
  def attachColumnResize(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnResizeEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Attaches event handler `fnFunction` to the {@link #event:columnSelect columnSelect} event of this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * fired when a column of the table has been selected
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachColumnSelect(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnSelectEvent, Unit]
  ): this.type = js.native
  def attachColumnSelect(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnSelectEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * Attaches event handler `fnFunction` to the {@link #event:columnSelect columnSelect} event of this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * fired when a column of the table has been selected
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachColumnSelect(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnSelectEvent, Unit]
  ): this.type = js.native
  def attachColumnSelect(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnSelectEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Attaches event handler `fnFunction` to the {@link #event:columnVisibility columnVisibility} event of
    * this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * fired when the visibility of a table column is changed.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachColumnVisibility(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnVisibilityEvent, Unit]
  ): this.type = js.native
  def attachColumnVisibility(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnVisibilityEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * Attaches event handler `fnFunction` to the {@link #event:columnVisibility columnVisibility} event of
    * this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * fired when the visibility of a table column is changed.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachColumnVisibility(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnVisibilityEvent, Unit]
  ): this.type = js.native
  def attachColumnVisibility(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnVisibilityEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * @since 1.23.0
    *
    * Attaches event handler `fnFunction` to the {@link #event:customFilter customFilter} event of this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * This event is triggered when the custom filter item of the column menu is pressed. The column on which
    * the event was triggered is passed as parameter.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachCustomFilter(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableCustomFilterEvent, Unit]
  ): this.type = js.native
  def attachCustomFilter(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableCustomFilterEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * @since 1.23.0
    *
    * Attaches event handler `fnFunction` to the {@link #event:customFilter customFilter} event of this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * This event is triggered when the custom filter item of the column menu is pressed. The column on which
    * the event was triggered is passed as parameter.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachCustomFilter(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableCustomFilterEvent, Unit]
  ): this.type = js.native
  def attachCustomFilter(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableCustomFilterEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Attaches event handler `fnFunction` to the {@link #event:filter filter} event of this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * This event is fired before a filter is applied to a column, if the table is filtered via {@link sap.ui.table.Table#filter }
    * call or user interaction with the column header.
    *
    * Filters that are directly applied to the table binding will not fire this event.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachFilter(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableFilterEvent, Unit]
  ): this.type = js.native
  def attachFilter(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableFilterEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * Attaches event handler `fnFunction` to the {@link #event:filter filter} event of this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * This event is fired before a filter is applied to a column, if the table is filtered via {@link sap.ui.table.Table#filter }
    * call or user interaction with the column header.
    *
    * Filters that are directly applied to the table binding will not fire this event.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachFilter(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableFilterEvent, Unit]
  ): this.type = js.native
  def attachFilter(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableFilterEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * @since 1.37.0
    *
    * Attaches event handler `fnFunction` to the {@link #event:firstVisibleRowChanged firstVisibleRowChanged }
    * event of this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * This event gets fired when the first visible row is changed. It should only be used by composite controls.
    * The event even is fired when setFirstVisibleRow is called programmatically.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachFirstVisibleRowChanged(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableFirstVisibleRowChangedEvent, Unit]
  ): this.type = js.native
  def attachFirstVisibleRowChanged(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableFirstVisibleRowChangedEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * @since 1.37.0
    *
    * Attaches event handler `fnFunction` to the {@link #event:firstVisibleRowChanged firstVisibleRowChanged }
    * event of this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * This event gets fired when the first visible row is changed. It should only be used by composite controls.
    * The event even is fired when setFirstVisibleRow is called programmatically.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachFirstVisibleRowChanged(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableFirstVisibleRowChangedEvent, Unit]
  ): this.type = js.native
  def attachFirstVisibleRowChanged(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableFirstVisibleRowChangedEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Attaches event handler `fnFunction` to the {@link #event:group group} event of this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * fired when the table is grouped (experimental!).
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachGroup(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableGroupEvent, Unit]
  ): this.type = js.native
  def attachGroup(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableGroupEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * Attaches event handler `fnFunction` to the {@link #event:group group} event of this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * fired when the table is grouped (experimental!).
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachGroup(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableGroupEvent, Unit]
  ): this.type = js.native
  def attachGroup(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableGroupEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * @since 1.60
    *
    * Attaches event handler `fnFunction` to the {@link #event:paste paste} event of this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * This event gets fired when the user pastes content from the clipboard to the table. Pasting can be done
    * with the standard keyboard shortcut, if the focus is inside the table.
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
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * @since 1.60
    *
    * Attaches event handler `fnFunction` to the {@link #event:paste paste} event of this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * This event gets fired when the user pastes content from the clipboard to the table. Pasting can be done
    * with the standard keyboard shortcut, if the focus is inside the table.
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
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Attaches event handler `fnFunction` to the {@link #event:rowSelectionChange rowSelectionChange} event
    * of this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * fired when the row selection of the table has been changed (the event parameters can be used to determine
    * selection changes - to find out the selected rows you should better use the table selection API)
    *
    * **Note:** If a selection plugin is applied to the table, this event won't be fired.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachRowSelectionChange(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableRowSelectionChangeEvent, Unit]
  ): this.type = js.native
  def attachRowSelectionChange(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableRowSelectionChangeEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * Attaches event handler `fnFunction` to the {@link #event:rowSelectionChange rowSelectionChange} event
    * of this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * fired when the row selection of the table has been changed (the event parameters can be used to determine
    * selection changes - to find out the selected rows you should better use the table selection API)
    *
    * **Note:** If a selection plugin is applied to the table, this event won't be fired.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachRowSelectionChange(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableRowSelectionChangeEvent, Unit]
  ): this.type = js.native
  def attachRowSelectionChange(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableRowSelectionChangeEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * @since 1.86
    *
    * Attaches event handler `fnFunction` to the {@link #event:rowsUpdated rowsUpdated} event of this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * This event is fired after the table rows have been updated due to rendering, a model update, or a user
    * interaction, for example.
    *
    * **Note**: This event is fired often and must not be used for performance-critical tasks.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachRowsUpdated(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
  ): this.type = js.native
  def attachRowsUpdated(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * @since 1.86
    *
    * Attaches event handler `fnFunction` to the {@link #event:rowsUpdated rowsUpdated} event of this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * This event is fired after the table rows have been updated due to rendering, a model update, or a user
    * interaction, for example.
    *
    * **Note**: This event is fired often and must not be used for performance-critical tasks.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachRowsUpdated(
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
  def attachRowsUpdated(
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
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Attaches event handler `fnFunction` to the {@link #event:sort sort} event of this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * This event is fired before a sort order is applied to a column, if the table is sorted via {@link sap.ui.table.Table#sort }
    * call or user interaction with the column header.
    *
    * Sorters that are directly applied to the table binding will not fire this event.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachSort(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableSortEvent, Unit]
  ): this.type = js.native
  def attachSort(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableSortEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * Attaches event handler `fnFunction` to the {@link #event:sort sort} event of this `sap.ui.table.Table`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.table.Table` itself.
    *
    * This event is fired before a sort order is applied to a column, if the table is sorted via {@link sap.ui.table.Table#sort }
    * call or user interaction with the column header.
    *
    * Sorters that are directly applied to the table binding will not fire this event.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachSort(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableSortEvent, Unit]
  ): this.type = js.native
  def attachSort(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableSortEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.table.Table` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * @experimental - Experimental! Presently implemented to only work with a very limited set of controls
    * (e.g. sap.m.Text).
    *
    * Triggers automatic resizing of a column to the widest content.
    */
  def autoResizeColumn(/**
    * The index of the column in the list of visible columns.
    */
  iColIndex: int): Unit = js.native
  
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
    * Binds aggregation {@link #getRows rows} to model data.
    *
    * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of `oBindingInfo`.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def bindRows(/**
    * The binding information
    */
  oBindingInfo: AggregationBindingInfo): this.type = js.native
  
  /**
    * Removes complete selection.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def clearSelection(): this.type = js.native
  
  /**
    * Destroys all the columns in the aggregation {@link #getColumns columns}.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def destroyColumns(): this.type = js.native
  
  /**
    * @since 1.54
    *
    * Destroys the contextMenu in the aggregation {@link #getContextMenu contextMenu}.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def destroyContextMenu(): this.type = js.native
  
  /**
    * Destroys all the extension in the aggregation {@link #getExtension extension}.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def destroyExtension(): this.type = js.native
  
  /**
    * Destroys the footer in the aggregation {@link #getFooter footer}.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def destroyFooter(): this.type = js.native
  
  /**
    * Destroys the noData in the aggregation {@link #getNoData noData}.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def destroyNoData(): this.type = js.native
  
  /**
    * @since 1.64
    *
    * Destroys all the plugins in the aggregation {@link #getPlugins plugins}.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def destroyPlugins(): this.type = js.native
  
  /**
    * Destroys the rowActionTemplate in the aggregation {@link #getRowActionTemplate rowActionTemplate}.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def destroyRowActionTemplate(): this.type = js.native
  
  /**
    * Destroys the rowSettingsTemplate in the aggregation {@link #getRowSettingsTemplate rowSettingsTemplate}.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def destroyRowSettingsTemplate(): this.type = js.native
  
  /**
    * Destroys all the rows in the aggregation {@link #getRows rows}.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def destroyRows(): this.type = js.native
  
  /**
    * @deprecated (since 1.72) - Use, for example, a `sap.m.Title` control in the `extension` aggregation instead.
    *
    * Destroys the title in the aggregation {@link #getTitle title}.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def destroyTitle(): this.type = js.native
  
  /**
    * @deprecated (since 1.38) - This aggregation is deprecated, use the `extension` aggregation instead.
    *
    * Destroys the toolbar in the aggregation {@link #getToolbar toolbar}.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def destroyToolbar(): this.type = js.native
  
  /**
    * @since 1.54
    *
    * Detaches event handler `fnFunction` from the {@link #event:beforeOpenContextMenu beforeOpenContextMenu }
    * event of this `sap.ui.table.Table`.
    *
    * The passed function and listener object must match the ones used for event registration.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def detachBeforeOpenContextMenu(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableBeforeOpenContextMenuEvent, Unit]
  ): this.type = js.native
  def detachBeforeOpenContextMenu(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableBeforeOpenContextMenuEvent, Unit],
    /**
    * Context object on which the given function had to be called
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * @since 1.37.0
    *
    * Detaches event handler `fnFunction` from the {@link #event:busyStateChanged busyStateChanged} event of
    * this `sap.ui.table.Table`.
    *
    * The passed function and listener object must match the ones used for event registration.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def detachBusyStateChanged(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableBusyStateChangedEvent, Unit]
  ): this.type = js.native
  def detachBusyStateChanged(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableBusyStateChangedEvent, Unit],
    /**
    * Context object on which the given function had to be called
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * @since 1.21.0
    *
    * Detaches event handler `fnFunction` from the {@link #event:cellClick cellClick} event of this `sap.ui.table.Table`.
    *
    * The passed function and listener object must match the ones used for event registration.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def detachCellClick(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableCellClickEvent, Unit]
  ): this.type = js.native
  def detachCellClick(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableCellClickEvent, Unit],
    /**
    * Context object on which the given function had to be called
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * @since 1.21.0
    * @deprecated (since 1.54) - replaced by `beforeOpenContextMenu`.
    *
    * Detaches event handler `fnFunction` from the {@link #event:cellContextmenu cellContextmenu} event of
    * this `sap.ui.table.Table`.
    *
    * The passed function and listener object must match the ones used for event registration.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def detachCellContextmenu(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableCellContextmenuEvent, Unit]
  ): this.type = js.native
  def detachCellContextmenu(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableCellContextmenuEvent, Unit],
    /**
    * Context object on which the given function had to be called
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * @since 1.21.0
    *
    * Detaches event handler `fnFunction` from the {@link #event:columnFreeze columnFreeze} event of this `sap.ui.table.Table`.
    *
    * The passed function and listener object must match the ones used for event registration.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def detachColumnFreeze(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnFreezeEvent, Unit]
  ): this.type = js.native
  def detachColumnFreeze(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnFreezeEvent, Unit],
    /**
    * Context object on which the given function had to be called
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Detaches event handler `fnFunction` from the {@link #event:columnMove columnMove} event of this `sap.ui.table.Table`.
    *
    * The passed function and listener object must match the ones used for event registration.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def detachColumnMove(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnMoveEvent, Unit]
  ): this.type = js.native
  def detachColumnMove(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnMoveEvent, Unit],
    /**
    * Context object on which the given function had to be called
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Detaches event handler `fnFunction` from the {@link #event:columnResize columnResize} event of this `sap.ui.table.Table`.
    *
    * The passed function and listener object must match the ones used for event registration.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def detachColumnResize(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnResizeEvent, Unit]
  ): this.type = js.native
  def detachColumnResize(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnResizeEvent, Unit],
    /**
    * Context object on which the given function had to be called
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Detaches event handler `fnFunction` from the {@link #event:columnSelect columnSelect} event of this `sap.ui.table.Table`.
    *
    * The passed function and listener object must match the ones used for event registration.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def detachColumnSelect(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnSelectEvent, Unit]
  ): this.type = js.native
  def detachColumnSelect(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnSelectEvent, Unit],
    /**
    * Context object on which the given function had to be called
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Detaches event handler `fnFunction` from the {@link #event:columnVisibility columnVisibility} event of
    * this `sap.ui.table.Table`.
    *
    * The passed function and listener object must match the ones used for event registration.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def detachColumnVisibility(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnVisibilityEvent, Unit]
  ): this.type = js.native
  def detachColumnVisibility(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableColumnVisibilityEvent, Unit],
    /**
    * Context object on which the given function had to be called
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * @since 1.23.0
    *
    * Detaches event handler `fnFunction` from the {@link #event:customFilter customFilter} event of this `sap.ui.table.Table`.
    *
    * The passed function and listener object must match the ones used for event registration.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def detachCustomFilter(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableCustomFilterEvent, Unit]
  ): this.type = js.native
  def detachCustomFilter(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableCustomFilterEvent, Unit],
    /**
    * Context object on which the given function had to be called
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Detaches event handler `fnFunction` from the {@link #event:filter filter} event of this `sap.ui.table.Table`.
    *
    * The passed function and listener object must match the ones used for event registration.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def detachFilter(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableFilterEvent, Unit]
  ): this.type = js.native
  def detachFilter(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableFilterEvent, Unit],
    /**
    * Context object on which the given function had to be called
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * @since 1.37.0
    *
    * Detaches event handler `fnFunction` from the {@link #event:firstVisibleRowChanged firstVisibleRowChanged }
    * event of this `sap.ui.table.Table`.
    *
    * The passed function and listener object must match the ones used for event registration.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def detachFirstVisibleRowChanged(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableFirstVisibleRowChangedEvent, Unit]
  ): this.type = js.native
  def detachFirstVisibleRowChanged(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableFirstVisibleRowChangedEvent, Unit],
    /**
    * Context object on which the given function had to be called
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Detaches event handler `fnFunction` from the {@link #event:group group} event of this `sap.ui.table.Table`.
    *
    * The passed function and listener object must match the ones used for event registration.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def detachGroup(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableGroupEvent, Unit]
  ): this.type = js.native
  def detachGroup(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableGroupEvent, Unit],
    /**
    * Context object on which the given function had to be called
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * @since 1.60
    *
    * Detaches event handler `fnFunction` from the {@link #event:paste paste} event of this `sap.ui.table.Table`.
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
    * Detaches event handler `fnFunction` from the {@link #event:rowSelectionChange rowSelectionChange} event
    * of this `sap.ui.table.Table`.
    *
    * The passed function and listener object must match the ones used for event registration.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def detachRowSelectionChange(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableRowSelectionChangeEvent, Unit]
  ): this.type = js.native
  def detachRowSelectionChange(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableRowSelectionChangeEvent, Unit],
    /**
    * Context object on which the given function had to be called
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * @since 1.86
    *
    * Detaches event handler `fnFunction` from the {@link #event:rowsUpdated rowsUpdated} event of this `sap.ui.table.Table`.
    *
    * The passed function and listener object must match the ones used for event registration.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def detachRowsUpdated(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
  ): this.type = js.native
  def detachRowsUpdated(
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
    * Detaches event handler `fnFunction` from the {@link #event:sort sort} event of this `sap.ui.table.Table`.
    *
    * The passed function and listener object must match the ones used for event registration.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def detachSort(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableSortEvent, Unit]
  ): this.type = js.native
  def detachSort(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ TableSortEvent, Unit],
    /**
    * Context object on which the given function had to be called
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * @deprecated (since 1.56) - replaced by the `sap.ui.export` library.
    * @experimental - Experimental because the property for the column/cell definitions (sortProperty) could
    * change in future.
    *
    * Creates a new {@link sap.ui.core.util.Export} object and fills row/column information from the table
    * if not provided. For the cell content, the column's "sortProperty" will be used (experimental!)
    *
    * **Please note: This method uses synchronous requests. Support and functioning ends with the support
    * for synchronous requests in browsers.**
    *
    * @returns Export object
    */
  def exportData(): typings.openui5.sapUiCoreUtilExportMod.default = js.native
  def exportData(
    /**
    * settings for the new Export, see {@link sap.ui.core.util.Export} `constructor`
    */
  mSettings: js.Object
  ): typings.openui5.sapUiCoreUtilExportMod.default = js.native
  
  /**
    * Filters a column by a value. If no filter value is passed, the filter value equals an empty string, and
    * the filter for this column is removed.
    */
  def filter(/**
    * Column to be filtered
    */
  oColumn: typings.openui5.sapUiTableColumnMod.default): Unit = js.native
  def filter(
    /**
    * Column to be filtered
    */
  oColumn: typings.openui5.sapUiTableColumnMod.default,
    /**
    * Filter value as string (will be converted)
    */
  sValue: String
  ): Unit = js.native
  
  /**
    * @since 1.54
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:beforeOpenContextMenu beforeOpenContextMenu} to attached listeners.
    *
    * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
    * event object. The return value of this method indicates whether the default action should be executed.
    *
    * @returns Whether or not to prevent the default action
    */
  def fireBeforeOpenContextMenu(): Boolean = js.native
  def fireBeforeOpenContextMenu(
    /**
    * Parameters to pass along with the event
    */
  mParameters: Table$BeforeOpenContextMenuEventParameters
  ): Boolean = js.native
  
  /**
    * @since 1.37.0
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:busyStateChanged busyStateChanged} to attached listeners.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def fireBusyStateChanged(): this.type = js.native
  def fireBusyStateChanged(
    /**
    * Parameters to pass along with the event
    */
  mParameters: Table$BusyStateChangedEventParameters
  ): this.type = js.native
  
  /**
    * @since 1.21.0
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:cellClick cellClick} to attached listeners.
    *
    * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
    * event object. The return value of this method indicates whether the default action should be executed.
    *
    * @returns Whether or not to prevent the default action
    */
  def fireCellClick(): Boolean = js.native
  def fireCellClick(/**
    * Parameters to pass along with the event
    */
  mParameters: Table$CellClickEventParameters): Boolean = js.native
  
  /**
    * @since 1.21.0
    * @deprecated (since 1.54) - replaced by `beforeOpenContextMenu`.
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:cellContextmenu cellContextmenu} to attached listeners.
    *
    * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
    * event object. The return value of this method indicates whether the default action should be executed.
    *
    * @returns Whether or not to prevent the default action
    */
  def fireCellContextmenu(): Boolean = js.native
  def fireCellContextmenu(
    /**
    * Parameters to pass along with the event
    */
  mParameters: Table$CellContextmenuEventParameters
  ): Boolean = js.native
  
  /**
    * @since 1.21.0
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:columnFreeze columnFreeze} to attached listeners.
    *
    * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
    * event object. The return value of this method indicates whether the default action should be executed.
    *
    * @returns Whether or not to prevent the default action
    */
  def fireColumnFreeze(): Boolean = js.native
  def fireColumnFreeze(
    /**
    * Parameters to pass along with the event
    */
  mParameters: Table$ColumnFreezeEventParameters
  ): Boolean = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:columnMove columnMove} to attached listeners.
    *
    * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
    * event object. The return value of this method indicates whether the default action should be executed.
    *
    * @returns Whether or not to prevent the default action
    */
  def fireColumnMove(): Boolean = js.native
  def fireColumnMove(/**
    * Parameters to pass along with the event
    */
  mParameters: Table$ColumnMoveEventParameters): Boolean = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:columnResize columnResize} to attached listeners.
    *
    * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
    * event object. The return value of this method indicates whether the default action should be executed.
    *
    * @returns Whether or not to prevent the default action
    */
  def fireColumnResize(): Boolean = js.native
  def fireColumnResize(
    /**
    * Parameters to pass along with the event
    */
  mParameters: Table$ColumnResizeEventParameters
  ): Boolean = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:columnSelect columnSelect} to attached listeners.
    *
    * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
    * event object. The return value of this method indicates whether the default action should be executed.
    *
    * @returns Whether or not to prevent the default action
    */
  def fireColumnSelect(): Boolean = js.native
  def fireColumnSelect(
    /**
    * Parameters to pass along with the event
    */
  mParameters: Table$ColumnSelectEventParameters
  ): Boolean = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:columnVisibility columnVisibility} to attached listeners.
    *
    * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
    * event object. The return value of this method indicates whether the default action should be executed.
    *
    * @returns Whether or not to prevent the default action
    */
  def fireColumnVisibility(): Boolean = js.native
  def fireColumnVisibility(
    /**
    * Parameters to pass along with the event
    */
  mParameters: Table$ColumnVisibilityEventParameters
  ): Boolean = js.native
  
  /**
    * @since 1.23.0
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:customFilter customFilter} to attached listeners.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def fireCustomFilter(): this.type = js.native
  def fireCustomFilter(
    /**
    * Parameters to pass along with the event
    */
  mParameters: Table$CustomFilterEventParameters
  ): this.type = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:filter filter} to attached listeners.
    *
    * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
    * event object. The return value of this method indicates whether the default action should be executed.
    *
    * @returns Whether or not to prevent the default action
    */
  def fireFilter(): Boolean = js.native
  def fireFilter(/**
    * Parameters to pass along with the event
    */
  mParameters: Table$FilterEventParameters): Boolean = js.native
  
  /**
    * @since 1.37.0
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:firstVisibleRowChanged firstVisibleRowChanged} to attached listeners.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def fireFirstVisibleRowChanged(): this.type = js.native
  def fireFirstVisibleRowChanged(
    /**
    * Parameters to pass along with the event
    */
  mParameters: Table$FirstVisibleRowChangedEventParameters
  ): this.type = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:group group} to attached listeners.
    *
    * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
    * event object. The return value of this method indicates whether the default action should be executed.
    *
    * @returns Whether or not to prevent the default action
    */
  def fireGroup(): Boolean = js.native
  def fireGroup(/**
    * Parameters to pass along with the event
    */
  mParameters: Table$GroupEventParameters): Boolean = js.native
  
  /**
    * @since 1.60
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:paste paste} to attached listeners.
    *
    * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
    * event object. The return value of this method indicates whether the default action should be executed.
    *
    * @returns Whether or not to prevent the default action
    */
  def firePaste(): Boolean = js.native
  def firePaste(/**
    * Parameters to pass along with the event
    */
  mParameters: Table$PasteEventParameters): Boolean = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:rowSelectionChange rowSelectionChange} to attached listeners.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def fireRowSelectionChange(): this.type = js.native
  def fireRowSelectionChange(
    /**
    * Parameters to pass along with the event
    */
  mParameters: Table$RowSelectionChangeEventParameters
  ): this.type = js.native
  
  /**
    * @since 1.86
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:rowsUpdated rowsUpdated} to attached listeners.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def fireRowsUpdated(): this.type = js.native
  def fireRowsUpdated(/**
    * Parameters to pass along with the event
    */
  mParameters: js.Object): this.type = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:sort sort} to attached listeners.
    *
    * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
    * event object. The return value of this method indicates whether the default action should be executed.
    *
    * @returns Whether or not to prevent the default action
    */
  def fireSort(): Boolean = js.native
  def fireSort(/**
    * Parameters to pass along with the event
    */
  mParameters: Table$SortEventParameters): Boolean = js.native
  
  /**
    * @since 1.52
    *
    * Gets current value of property {@link #getAlternateRowColors alternateRowColors}.
    *
    * Enables alternating table row colors. Alternate row coloring is not available for the tree mode.
    *
    * Default value is `false`.
    *
    * @returns Value of property `alternateRowColors`
    */
  def getAlternateRowColors(): Boolean = js.native
  
  /**
    * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy ariaLabelledBy}.
    */
  def getAriaLabelledBy(): js.Array[ID] = js.native
  
  /**
    * Get the binding object for a specific aggregation/property.
    *
    * @returns The binding for the given name
    */
  def getBinding(): typings.openui5.sapUiModelBindingMod.default = js.native
  
  /**
    * Gets current value of property {@link #getColumnHeaderHeight columnHeaderHeight}.
    *
    * Header row height in pixel. If a value greater than 0 is set, it overrides the height defined in the
    * `rowHeight` property for the rows in the table's header. The value defines the minimum height, but it
    * cannot be less than the default height based on the content density configuration. The actual height
    * can increase based on the content.
    *
    * **Note**: In a {@link sap.ui.table.Column#getMultiLabels MultiLabel} scenario, the height is applied
    * to each individual row of the table's header.
    *
    * @returns Value of property `columnHeaderHeight`
    */
  def getColumnHeaderHeight(): int = js.native
  
  /**
    * Gets current value of property {@link #getColumnHeaderVisible columnHeaderVisible}.
    *
    * Flag whether the column header is visible or not.
    *
    * **Caution:** Please be aware that when setting this property to `false`, a 100% accessibility of the
    * table can't be guaranteed any more.
    *
    * Default value is `true`.
    *
    * @returns Value of property `columnHeaderVisible`
    */
  def getColumnHeaderVisible(): Boolean = js.native
  
  /**
    * Gets content of aggregation {@link #getColumns columns}.
    *
    * Columns of the Table
    */
  def getColumns(): js.Array[typings.openui5.sapUiTableColumnMod.default] = js.native
  
  /**
    * Returns the context of a row by its index. Please note that for server-based models like OData, the supplied
    * index might not have been loaded yet. If the context is not available at the client, the binding will
    * trigger a backend request and request this single context. Although this API looks synchronous it may
    * not return a context but load it and fire a change event on the binding.
    *
    * For server-based models you should consider to only make this API call when the index is within the currently
    * visible scroll area.
    *
    * @returns The context at this index or `null`
    */
  def getContextByIndex(/**
    * Index of the row to return the context from.
    */
  iIndex: int): typings.openui5.sapUiModelContextMod.default | Null = js.native
  
  /**
    * @since 1.54
    *
    * Gets content of aggregation {@link #getContextMenu contextMenu}.
    *
    * Defines the context menu for the table.
    *
    * **Note:** The context menu will also be available for the row selectors as well as in the row actions
    * cell of the table control.
    *
    * The custom context menu will not be shown in group header and summary rows.
    *
    * If this aggregation is set, then the `enableCellFilter` property will have no effect.
    */
  def getContextMenu(): IContextMenu = js.native
  
  /**
    * @deprecated (since 1.115)
    *
    * Gets current value of property {@link #getEditable editable}.
    *
    * Flag whether the controls of the Table are editable or not (currently this only controls the background
    * color in certain themes!)
    *
    * Default value is `true`.
    *
    * @returns Value of property `editable`
    */
  def getEditable(): Boolean = js.native
  
  /**
    * @since 1.27.0
    *
    * Gets current value of property {@link #getEnableBusyIndicator enableBusyIndicator}.
    *
    * If set to `true`, the table changes its busy state, resulting in showing or hiding the busy indicator.
    * The table will switch to busy as soon as data is retrieved to be displayed in the currently visible rows.
    * This happens, for example, during scrolling, filtering, or sorting. As soon as the data has been retrieved,
    * the table switches back to not busy. The busy state of the table can still be set manually by calling
    * {@link sap.ui.core.Control#setBusy}.
    *
    * Default value is `false`.
    *
    * @returns Value of property `enableBusyIndicator`
    */
  def getEnableBusyIndicator(): Boolean = js.native
  
  /**
    * @since 1.21.0
    *
    * Gets current value of property {@link #getEnableCellFilter enableCellFilter}.
    *
    * Flag whether to enable or disable the context menu on cells to trigger a filtering with the cell value.
    *
    * Default value is `false`.
    *
    * @returns Value of property `enableCellFilter`
    */
  def getEnableCellFilter(): Boolean = js.native
  
  /**
    * @since 1.21.0
    *
    * Gets current value of property {@link #getEnableColumnFreeze enableColumnFreeze}.
    *
    * Flag whether to show or hide the column menu item to freeze or unfreeze a column.
    *
    * Default value is `false`.
    *
    * @returns Value of property `enableColumnFreeze`
    */
  def getEnableColumnFreeze(): Boolean = js.native
  
  /**
    * Gets current value of property {@link #getEnableColumnReordering enableColumnReordering}.
    *
    * Flag to enable or disable column reordering
    *
    * Default value is `true`.
    *
    * @returns Value of property `enableColumnReordering`
    */
  def getEnableColumnReordering(): Boolean = js.native
  
  /**
    * @since 1.23.0
    *
    * Gets current value of property {@link #getEnableCustomFilter enableCustomFilter}.
    *
    * Set this parameter to true to implement your own filter behaviour. Instead of the filter input box a
    * button will be rendered for which' press event (customFilter) you can register an event handler.
    *
    * Default value is `false`.
    *
    * @returns Value of property `enableCustomFilter`
    */
  def getEnableCustomFilter(): Boolean = js.native
  
  /**
    * @deprecated (since 1.110) - this feature has a limited functionality and should not be used anymore.
    *
    * Gets current value of property {@link #getEnableGrouping enableGrouping}.
    *
    * Enables or disables grouping. If grouping is enabled, the table is grouped by the column which is defined
    * in the `groupBy` association.
    *
    * The following restrictions apply:
    * 	 - Only client models are supported (e.g. {@link sap.ui.model.json.JSONModel}). Grouping does not work
    *     with OData models.
    * 	 - The table can only be grouped by **one** column at a time. Grouping by another column will remove
    *     the current grouping.
    * 	 - For the grouping to work correctly, {@link sap.ui.table.Column#getSortProperty sortProperty} must
    *     be set for the grouped column.
    * 	 - If grouping has been done, sorting and filtering is not possible. Any existing sorting and filtering
    *     rules do no longer apply. The UI is not updated accordingly (e.g. menu items, sort and filter icons).
    *
    * 	 - The column, by which the table is grouped, is not visible. It will become visible again only if the
    *     table is grouped by another column or grouping is disabled.
    *
    * Default value is `false`.
    *
    * @returns Value of property `enableGrouping`
    */
  def getEnableGrouping(): Boolean = js.native
  
  /**
    * @since 1.23.0
    *
    * Gets current value of property {@link #getEnableSelectAll enableSelectAll}.
    *
    * Specifies if a select all button should be displayed in the top left corner. This button is only displayed
    * if the row selector is visible and the selection mode is set to any kind of multi selection.
    *
    * Default value is `true`.
    *
    * @returns Value of property `enableSelectAll`
    */
  def getEnableSelectAll(): Boolean = js.native
  
  /**
    * Gets content of aggregation {@link #getExtension extension}.
    *
    * Extension section of the Table. If not set, no extension area will be rendered. Note: In case a `sap.m.Toolbar`
    * is used as header the CSS class sapMTBHeader-CTX should be applied on this toolbar.
    */
  def getExtension(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
  
  /**
    * Gets current value of property {@link #getFirstVisibleRow firstVisibleRow}.
    *
    * First visible row.
    *
    * Default value is `0`.
    *
    * @returns Value of property `firstVisibleRow`
    */
  def getFirstVisibleRow(): int = js.native
  
  /**
    * @since 1.18.7
    *
    * Gets current value of property {@link #getFixedBottomRowCount fixedBottomRowCount}.
    *
    * Number of rows that are fix on the bottom. When you use a vertical scrollbar, only the rows which are
    * not fixed, will scroll.
    *
    * This property is only supported if the `rows` aggregation is bound to a {@link sap.ui.model.ClientModel client model}.
    *
    * Default value is `0`.
    *
    * @returns Value of property `fixedBottomRowCount`
    */
  def getFixedBottomRowCount(): int = js.native
  
  /**
    * Gets current value of property {@link #getFixedColumnCount fixedColumnCount}.
    *
    * Number of columns that are fixed on the left. Only columns which are not fixed can be scrolled horizontally.
    *
    * **Note**
    * 	 - Fixed columns need a defined width for the feature to work.
    * 	 - The aggregated width of all fixed columns must not exceed the table width. Otherwise the table ignores
    *     the value of the property and adapts the behavior in an appropriate way to ensure that the user is still
    *     able to scroll horizontally.
    *
    * Default value is `0`.
    *
    * @returns Value of property `fixedColumnCount`
    */
  def getFixedColumnCount(): int = js.native
  
  /**
    * Gets current value of property {@link #getFixedRowCount fixedRowCount}.
    *
    * Number of rows that are fix on the top. When you use a vertical scrollbar, only the rows which are not
    * fixed, will scroll.
    *
    * This property is only supported if the `rows` aggregation is bound to a {@link sap.ui.model.ClientModel client model}.
    *
    * Default value is `0`.
    *
    * @returns Value of property `fixedRowCount`
    */
  def getFixedRowCount(): int = js.native
  
  /**
    * Gets content of aggregation {@link #getFooter footer}.
    *
    * Control or text of footer section of the Table (if not set it will be hidden)
    */
  def getFooter(): typings.openui5.sapUiCoreControlMod.default | String = js.native
  
  /**
    * @experimental (since 1.28) - This feature has a limited functionality.
    *
    * ID of the element which is the current target of the association {@link #getGroupBy groupBy}, or `null`.
    */
  def getGroupBy(): ID = js.native
  
  /**
    * Gets current value of property {@link #getMinAutoRowCount minAutoRowCount}.
    *
    * This property is used to set the minimum count of visible rows when the property visibleRowCountMode
    * is set to Auto or Interactive. For any other visibleRowCountMode, it is ignored.
    *
    * Default value is `5`.
    *
    * @returns Value of property `minAutoRowCount`
    */
  def getMinAutoRowCount(): int = js.native
  
  /**
    * @deprecated (since 1.38)
    *
    * Gets current value of property {@link #getNavigationMode navigationMode}.
    *
    * This property has been deprecated and must not be used anymore, since `Scrollbar` is the only supported
    * option.
    *
    * Default value is `Scrollbar`.
    *
    * @returns Value of property `navigationMode`
    */
  def getNavigationMode(): NavigationMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NavigationMode * / any */ String) = js.native
  
  /**
    * Gets content of aggregation {@link #getNoData noData}.
    *
    * The value for the noData aggregation can be either a string value or a control instance. The control
    * is shown, in case there is no data for the Table available. In case of a string value this will simply
    * replace the no data text.
    */
  def getNoData(): typings.openui5.sapUiCoreControlMod.default | String = js.native
  
  /**
    * @since 1.64
    *
    * Gets content of aggregation {@link #getPlugins plugins}.
    *
    * Plugin section of the table. Multiple plugins are possible, but always only **one** of a certain type.
    *
    * The following restrictions apply:
    * 	 - If a selection plugin is applied to the table, the table's selection API must not be used. Instead,
    *     use the API of the plugin.
    * 	 - Only one MultiSelectionPlugin can be applied. No other plugins can be applied.
    */
  def getPlugins(): js.Array[typings.openui5.sapUiTablePluginsSelectionPluginMod.default] = js.native
  
  /**
    * @since 1.45.0
    *
    * Gets current value of property {@link #getRowActionCount rowActionCount}.
    *
    * Number of row actions made visible which determines the width of the row action column. The values `0`,
    * `1` and `2` are possible.
    *
    * Default value is `0`.
    *
    * @returns Value of property `rowActionCount`
    */
  def getRowActionCount(): int = js.native
  
  /**
    * Gets content of aggregation {@link #getRowActionTemplate rowActionTemplate}.
    *
    * Template for row actions. A template is decoupled from the row or table. Each time the template's properties
    * or aggregations are changed, the template has to be applied again via `setRowActionTemplate` for the
    * changes to take effect.
    */
  def getRowActionTemplate(): typings.openui5.sapUiTableRowActionMod.default = js.native
  
  /**
    * Gets current value of property {@link #getRowHeight rowHeight}.
    *
    * Row height in pixel.
    *
    * In the table's header, it defines the minimum height of the row, but it cannot be less than the default
    * height based on the content density configuration. The actual height can increase based on the content.
    *
    * In the table's body, it defines the height of the row content. The actual row height is also influenced
    * by other factors, such as the border width. If the `visibleRowCountMode` property is set to {@link sap.ui.table.VisibleRowCountMode Fixed }
    * or {@link sap.ui.table.VisibleRowCountMode Interactive}, the value defines the minimum height, and the
    * actual height can increase based on the content. If the mode is {@link sap.ui.table.VisibleRowCountMode Auto},
    * the value defines the actual height, and any content that doesn't fit is cut off.
    *
    * If no value is set (includes 0), a default height is applied based on the content density configuration.
    * In any `visibleRowCountMode`, the actual height can increase based on the content.
    *
    * @returns Value of property `rowHeight`
    */
  def getRowHeight(): int = js.native
  
  /**
    * Gets content of aggregation {@link #getRowSettingsTemplate rowSettingsTemplate}.
    *
    * Template for row settings. A template is decoupled from the row or table. Each time the template's properties
    * or aggregations are changed, the template has to be applied again via `setRowSettingsTemplate` for the
    * changes to take effect.
    */
  def getRowSettingsTemplate(): typings.openui5.sapUiTableRowSettingsMod.default = js.native
  
  /**
    * Gets content of aggregation {@link #getRows rows}.
    *
    * This aggregation is managed by the table itself. It can only be used with data binding, is read-only,
    * and does not support templates or factories.
    *
    * Rows are created and rendered only for a subset of the available data and reused for performance reasons.
    * When scrolling, only the binding contexts are updated to show the correct section of the data. This makes
    * it possible to bind the rows to large data sets. But you must not change rows and their children programmatically,
    * as these changes might get lost when the table updates the rows the next time. Also, properties must
    * not be set to static values, as these would not change when scrolling.
    *
    * The cells of rows can be defined with the {@link sap.ui.table.Column#setTemplate template} aggregation
    * of the columns in the {@link sap.ui.table.Table#getColumns columns} aggregation of the table. The actions
    * of rows can be defined with the {@link sap.ui.table.Table#setRowActionTemplate rowActionTemplate} aggregation
    * of the table. Furthermore, row-specific settings can be defined with the {@link sap.ui.table.Table#setRowSettingsTemplate rowSettingsTemplate }
    * aggregation of the table.
    *
    * **Note:** During the binding of rows, the (exact) count needs to be available in the table and has to
    * be requested. If the count is not requested, this may lead to unexpected behavior in the table, such
    * as scrolling, accessibility, or keyboard issues. Please refer to the documentation of the used model
    * for information on requesting the count, for example, {@link sap.ui.model.odata.v2.ODataModel} or {@link sap.ui.model.odata.v4.ODataModel}.
    */
  def getRows(): js.Array[typings.openui5.sapUiTableRowMod.default] = js.native
  
  /**
    * @deprecated (since 1.69) - replaced by {@link sap.ui.table.Table#getSelectedIndices}
    *
    * Retrieves the lead selection index.
    *
    * @returns Currently Selected Index.
    */
  def getSelectedIndex(): int = js.native
  
  /**
    * Zero-based indices of selected items, wrapped in an array. An empty array means "no selection".
    *
    * @returns Selected indices
    */
  def getSelectedIndices(): js.Array[int] = js.native
  
  /**
    * Gets current value of property {@link #getSelectionBehavior selectionBehavior}.
    *
    * Selection behavior of the Table. This property defines whether the row selector is displayed and whether
    * the row, the row selector or both can be clicked to select a row. **Note:** Since the group header visualization
    * relies on the row selectors, the row selectors are always shown if the grouping functionality (depends
    * on table type) is enabled, even if `sap.ui.table.SelectionBehavior.RowOnly` is set.
    *
    * Default value is `RowSelector`.
    *
    * @returns Value of property `selectionBehavior`
    */
  def getSelectionBehavior(): SelectionBehavior | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionBehavior * / any */ String) = js.native
  
  /**
    * Gets current value of property {@link #getSelectionMode selectionMode}.
    *
    * Selection mode of the Table. This property controls whether single or multiple rows can be selected and
    * how the selection can be extended. It may also influence the visual appearance. When the selection mode
    * is changed, the current selection is removed. **Note:** Since the group header visualization relies on
    * the row selectors, the row selectors are always shown if the grouping functionality (depends on table
    * type) is enabled, even if `sap.ui.table.SelectionMode.None` is set. **Note:** If a selection plugin is
    * applied to the table, the selection mode is controlled by the plugin.
    *
    * Default value is `MultiToggle`.
    *
    * @returns Value of property `selectionMode`
    */
  def getSelectionMode(): SelectionMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionMode * / any */ String) = js.native
  
  /**
    * Gets current value of property {@link #getShowColumnVisibilityMenu showColumnVisibilityMenu}.
    *
    * Flag to show or hide the column visibility menu. This menu will get displayed in each generated column
    * header menu. It allows to show or hide columns
    *
    * Default value is `false`.
    *
    * @returns Value of property `showColumnVisibilityMenu`
    */
  def getShowColumnVisibilityMenu(): Boolean = js.native
  
  /**
    * Gets current value of property {@link #getShowNoData showNoData}.
    *
    * Flag whether to show the no data overlay or not once the table is empty. If set to false the table will
    * just show a grid of empty cells
    *
    * Default value is `true`.
    *
    * @returns Value of property `showNoData`
    */
  def getShowNoData(): Boolean = js.native
  
  /**
    * @since 1.21.2
    *
    * Gets current value of property {@link #getShowOverlay showOverlay}.
    *
    * Setting this property to true will show an overlay on top of the Table content and users cannot click
    * anymore on the Table content.
    *
    * Default value is `false`.
    *
    * @returns Value of property `showOverlay`
    */
  def getShowOverlay(): Boolean = js.native
  
  /**
    * Gets the sorted columns in the order in which sorting was performed through the {@link sap.ui.table.Table#sort }
    * method and menus. Does not reflect sorting at binding level or the columns sort visualization set with
    * {@link sap.ui.table.Column#setSorted} and {@link sap.ui.table.Column#setSortOrder}.
    * See:
    * 	sap.ui.table.Table#sort
    *
    * @returns Array of sorted columns
    */
  def getSortedColumns(): js.Array[typings.openui5.sapUiTableColumnMod.default] = js.native
  
  /**
    * Gets current value of property {@link #getThreshold threshold}.
    *
    * Defines how many additional (not yet visible) data records from the back-end system are pre-fetched to
    * enable smooth scrolling. The threshold is always added to the `visibleRowCount`. If the `visibleRowCount`
    * is 10 and the `threshold` is 100, there will be 110 records fetched with the initial load. If the `threshold`
    * is lower than the number of rows in the scrollable area (`visibleRowCount` minus number of fixed rows),
    * this number is used as the `threshold`. If the value is 0, thresholding is disabled.
    *
    * Default value is `100`.
    *
    * @returns Value of property `threshold`
    */
  def getThreshold(): int = js.native
  
  /**
    * @deprecated (since 1.72) - Use, for example, a `sap.m.Title` control in the `extension` aggregation instead.
    *
    * Gets content of aggregation {@link #getTitle title}.
    *
    * Control or text of title section of the Table (if not set it will be hidden)
    */
  def getTitle(): typings.openui5.sapUiCoreControlMod.default | String = js.native
  
  /**
    * @deprecated (since 1.38) - This aggregation is deprecated, use the `extension` aggregation instead.
    *
    * Gets content of aggregation {@link #getToolbar toolbar}.
    *
    * Toolbar of the Table If not set, no toolbar area will be rendered. Note: The CSS class sapMTBHeader-CTX
    * is applied on the given toolbar.
    */
  def getToolbar(): Toolbar = js.native
  
  /**
    * Gets current value of property {@link #getVisibleRowCount visibleRowCount}.
    *
    * Number of visible rows of the table.
    *
    * Default value is `10`.
    *
    * @returns Value of property `visibleRowCount`
    */
  def getVisibleRowCount(): int = js.native
  
  /**
    * @since 1.9.2
    *
    * Gets current value of property {@link #getVisibleRowCountMode visibleRowCountMode}.
    *
    * Defines how the table handles the visible rows in the table.
    *
    * In the `"Fixed"` mode, the table always has as many rows as defined in the `visibleRowCount` property.
    *
    * In the `"Auto"` mode, the `visibleRowCount` property is changed by the table automatically. It will then
    * adjust its row count to the space it is allowed to cover (limited by the surrounding container), but
    * it cannot have less than defined in the `minAutoRowCount` property. The `visibleRowCount` property cannot
    * be set manually. Restrictions:
    * 	 - All rows need to have the same height.
    * 	 - The table must be rendered without siblings in its parent DOM element. The only exception is if the
    *     parent element is a CSS flex container, and the table is a CSS flex item allowed to grow and shrink.
    *
    *
    * In the `"Interactive"` mode, the table has as many rows as defined in the `visibleRowCount` property
    * after rendering. The user can change the `visibleRowCount` by dragging a resizer.
    *
    * Default value is `Fixed`.
    *
    * @returns Value of property `visibleRowCountMode`
    */
  def getVisibleRowCountMode(): VisibleRowCountMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VisibleRowCountMode * / any */ String) = js.native
  
  /**
    * Gets current value of property {@link #getWidth width}.
    *
    * Width of the Table.
    *
    * Default value is `'auto'`.
    *
    * @returns Value of property `width`
    */
  def getWidth(): CSSSize = js.native
  
  /**
    * Checks for the provided `sap.ui.table.Column` in the aggregation {@link #getColumns columns}. and returns
    * its index if found or -1 otherwise.
    *
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfColumn(
    /**
    * The column whose index is looked for
    */
  oColumn: typings.openui5.sapUiTableColumnMod.default
  ): int = js.native
  
  /**
    * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getExtension extension}. and
    * returns its index if found or -1 otherwise.
    *
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfExtension(
    /**
    * The extension whose index is looked for
    */
  oExtension: typings.openui5.sapUiCoreControlMod.default
  ): int = js.native
  
  /**
    * @since 1.64
    *
    * Checks for the provided `sap.ui.table.plugins.SelectionPlugin` in the aggregation {@link #getPlugins plugins}.
    * and returns its index if found or -1 otherwise.
    *
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfPlugin(
    /**
    * The plugin whose index is looked for
    */
  oPlugin: typings.openui5.sapUiTablePluginsSelectionPluginMod.default
  ): int = js.native
  
  /**
    * Checks for the provided `sap.ui.table.Row` in the aggregation {@link #getRows rows}. and returns its
    * index if found or -1 otherwise.
    *
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfRow(/**
    * The row whose index is looked for
    */
  oRow: typings.openui5.sapUiTableRowMod.default): int = js.native
  
  /**
    * Inserts a column into the aggregation {@link #getColumns columns}.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def insertColumn(
    /**
    * The column to insert; if empty, nothing is inserted
    */
  oColumn: typings.openui5.sapUiTableColumnMod.default,
    /**
    * The `0`-based index the column should be inserted at; for a negative value of `iIndex`, the column is
    * inserted at position 0; for a value greater than the current size of the aggregation, the column is inserted
    * at the last position
    */
  iIndex: int
  ): this.type = js.native
  
  /**
    * Inserts a extension into the aggregation {@link #getExtension extension}.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def insertExtension(
    /**
    * The extension to insert; if empty, nothing is inserted
    */
  oExtension: typings.openui5.sapUiCoreControlMod.default,
    /**
    * The `0`-based index the extension should be inserted at; for a negative value of `iIndex`, the extension
    * is inserted at position 0; for a value greater than the current size of the aggregation, the extension
    * is inserted at the last position
    */
  iIndex: int
  ): this.type = js.native
  
  /**
    * @since 1.64
    *
    * Inserts a plugin into the aggregation {@link #getPlugins plugins}.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def insertPlugin(
    /**
    * The plugin to insert; if empty, nothing is inserted
    */
  oPlugin: typings.openui5.sapUiTablePluginsSelectionPluginMod.default,
    /**
    * The `0`-based index the plugin should be inserted at; for a negative value of `iIndex`, the plugin is
    * inserted at position 0; for a value greater than the current size of the aggregation, the plugin is inserted
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
  oRow: typings.openui5.sapUiTableRowMod.default,
    /**
    * The `0`-based index the row should be inserted at; for a negative value of `iIndex`, the row is inserted
    * at position 0; for a value greater than the current size of the aggregation, the row is inserted at the
    * last position
    */
  iIndex: int
  ): this.type = js.native
  
  /**
    * Checks whether an index is selected.
    *
    * @returns Whether the index is selected
    */
  def isIndexSelected(/**
    * Index to check for selection
    */
  iIndex: int): Boolean = js.native
  
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
  def removeAllColumns(): js.Array[typings.openui5.sapUiTableColumnMod.default] = js.native
  
  /**
    * Removes all the controls from the aggregation {@link #getExtension extension}.
    *
    * Additionally, it unregisters them from the hosting UIArea.
    *
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllExtension(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
  
  /**
    * @since 1.64
    *
    * Removes all the controls from the aggregation {@link #getPlugins plugins}.
    *
    * Additionally, it unregisters them from the hosting UIArea.
    *
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllPlugins(): js.Array[typings.openui5.sapUiTablePluginsSelectionPluginMod.default] = js.native
  
  /**
    * Removes all the controls from the aggregation {@link #getRows rows}.
    *
    * Additionally, it unregisters them from the hosting UIArea.
    *
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllRows(): js.Array[typings.openui5.sapUiTableRowMod.default] = js.native
  
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
  vColumn: String): typings.openui5.sapUiTableColumnMod.default | Null = js.native
  /**
    * Removes a column from the aggregation {@link #getColumns columns}.
    *
    * @returns The removed column or `null`
    */
  def removeColumn(/**
    * The column to remove or its index or id
    */
  vColumn: int): typings.openui5.sapUiTableColumnMod.default | Null = js.native
  def removeColumn(
    /**
    * The column to remove or its index or id
    */
  vColumn: typings.openui5.sapUiTableColumnMod.default
  ): typings.openui5.sapUiTableColumnMod.default | Null = js.native
  
  def removeExtension(/**
    * The extension to remove or its index or id
    */
  vExtension: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
  /**
    * Removes a extension from the aggregation {@link #getExtension extension}.
    *
    * @returns The removed extension or `null`
    */
  def removeExtension(/**
    * The extension to remove or its index or id
    */
  vExtension: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
  def removeExtension(
    /**
    * The extension to remove or its index or id
    */
  vExtension: typings.openui5.sapUiCoreControlMod.default
  ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
  
  def removePlugin(/**
    * The plugin to remove or its index or id
    */
  vPlugin: String): typings.openui5.sapUiTablePluginsSelectionPluginMod.default | Null = js.native
  /**
    * @since 1.64
    *
    * Removes a plugin from the aggregation {@link #getPlugins plugins}.
    *
    * @returns The removed plugin or `null`
    */
  def removePlugin(/**
    * The plugin to remove or its index or id
    */
  vPlugin: int): typings.openui5.sapUiTablePluginsSelectionPluginMod.default | Null = js.native
  def removePlugin(
    /**
    * The plugin to remove or its index or id
    */
  vPlugin: typings.openui5.sapUiTablePluginsSelectionPluginMod.default
  ): typings.openui5.sapUiTablePluginsSelectionPluginMod.default | Null = js.native
  
  def removeRow(/**
    * The row to remove or its index or id
    */
  vRow: String): typings.openui5.sapUiTableRowMod.default | Null = js.native
  /**
    * Removes a row from the aggregation {@link #getRows rows}.
    *
    * @returns The removed row or `null`
    */
  def removeRow(/**
    * The row to remove or its index or id
    */
  vRow: int): typings.openui5.sapUiTableRowMod.default | Null = js.native
  def removeRow(/**
    * The row to remove or its index or id
    */
  vRow: typings.openui5.sapUiTableRowMod.default): typings.openui5.sapUiTableRowMod.default | Null = js.native
  
  /**
    * Removes the given selection interval from the selection. In case of single selection, only `iIndexTo`
    * is removed from the selection.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def removeSelectionInterval(
    /**
    * Index from which the deselection should start
    */
  iIndexFrom: int,
    /**
    * Index up to which to deselect
    */
  iIndexTo: int
  ): this.type = js.native
  
  /**
    * Adds all rows to the selection. Please note that for server based models like OData the indices which
    * are considered to be selected might not be available at the client yet. Calling getContextByIndex might
    * not return a result but trigger a roundtrip to request this single entity.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def selectAll(): this.type = js.native
  
  /**
    * @since 1.52
    *
    * Sets a new value for property {@link #getAlternateRowColors alternateRowColors}.
    *
    * Enables alternating table row colors. Alternate row coloring is not available for the tree mode.
    *
    * When called with a value of `null` or `undefined`, the default value of the property will be restored.
    *
    * Default value is `false`.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setAlternateRowColors(): this.type = js.native
  def setAlternateRowColors(/**
    * New value for property `alternateRowColors`
    */
  bAlternateRowColors: Boolean): this.type = js.native
  
  /**
    * Sets a new value for property {@link #getColumnHeaderHeight columnHeaderHeight}.
    *
    * Header row height in pixel. If a value greater than 0 is set, it overrides the height defined in the
    * `rowHeight` property for the rows in the table's header. The value defines the minimum height, but it
    * cannot be less than the default height based on the content density configuration. The actual height
    * can increase based on the content.
    *
    * **Note**: In a {@link sap.ui.table.Column#getMultiLabels MultiLabel} scenario, the height is applied
    * to each individual row of the table's header.
    *
    * When called with a value of `null` or `undefined`, the default value of the property will be restored.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setColumnHeaderHeight(): this.type = js.native
  def setColumnHeaderHeight(/**
    * New value for property `columnHeaderHeight`
    */
  iColumnHeaderHeight: int): this.type = js.native
  
  /**
    * Sets a new value for property {@link #getColumnHeaderVisible columnHeaderVisible}.
    *
    * Flag whether the column header is visible or not.
    *
    * **Caution:** Please be aware that when setting this property to `false`, a 100% accessibility of the
    * table can't be guaranteed any more.
    *
    * When called with a value of `null` or `undefined`, the default value of the property will be restored.
    *
    * Default value is `true`.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setColumnHeaderVisible(): this.type = js.native
  def setColumnHeaderVisible(/**
    * New value for property `columnHeaderVisible`
    */
  bColumnHeaderVisible: Boolean): this.type = js.native
  
  /**
    * @since 1.54
    *
    * Sets the aggregated {@link #getContextMenu contextMenu}.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setContextMenu(/**
    * The contextMenu to set
    */
  oContextMenu: IContextMenu): this.type = js.native
  
  /**
    * @deprecated (since 1.115)
    *
    * Sets a new value for property {@link #getEditable editable}.
    *
    * Flag whether the controls of the Table are editable or not (currently this only controls the background
    * color in certain themes!)
    *
    * When called with a value of `null` or `undefined`, the default value of the property will be restored.
    *
    * Default value is `true`.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setEditable(): this.type = js.native
  def setEditable(/**
    * New value for property `editable`
    */
  bEditable: Boolean): this.type = js.native
  
  /**
    * @since 1.27.0
    *
    * Sets a new value for property {@link #getEnableBusyIndicator enableBusyIndicator}.
    *
    * If set to `true`, the table changes its busy state, resulting in showing or hiding the busy indicator.
    * The table will switch to busy as soon as data is retrieved to be displayed in the currently visible rows.
    * This happens, for example, during scrolling, filtering, or sorting. As soon as the data has been retrieved,
    * the table switches back to not busy. The busy state of the table can still be set manually by calling
    * {@link sap.ui.core.Control#setBusy}.
    *
    * When called with a value of `null` or `undefined`, the default value of the property will be restored.
    *
    * Default value is `false`.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setEnableBusyIndicator(): this.type = js.native
  def setEnableBusyIndicator(/**
    * New value for property `enableBusyIndicator`
    */
  bEnableBusyIndicator: Boolean): this.type = js.native
  
  /**
    * @since 1.21.0
    *
    * Sets a new value for property {@link #getEnableCellFilter enableCellFilter}.
    *
    * Flag whether to enable or disable the context menu on cells to trigger a filtering with the cell value.
    *
    * When called with a value of `null` or `undefined`, the default value of the property will be restored.
    *
    * Default value is `false`.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setEnableCellFilter(): this.type = js.native
  def setEnableCellFilter(/**
    * New value for property `enableCellFilter`
    */
  bEnableCellFilter: Boolean): this.type = js.native
  
  /**
    * @since 1.21.0
    *
    * Sets a new value for property {@link #getEnableColumnFreeze enableColumnFreeze}.
    *
    * Flag whether to show or hide the column menu item to freeze or unfreeze a column.
    *
    * When called with a value of `null` or `undefined`, the default value of the property will be restored.
    *
    * Default value is `false`.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setEnableColumnFreeze(): this.type = js.native
  def setEnableColumnFreeze(/**
    * New value for property `enableColumnFreeze`
    */
  bEnableColumnFreeze: Boolean): this.type = js.native
  
  /**
    * Sets a new value for property {@link #getEnableColumnReordering enableColumnReordering}.
    *
    * Flag to enable or disable column reordering
    *
    * When called with a value of `null` or `undefined`, the default value of the property will be restored.
    *
    * Default value is `true`.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setEnableColumnReordering(): this.type = js.native
  def setEnableColumnReordering(/**
    * New value for property `enableColumnReordering`
    */
  bEnableColumnReordering: Boolean): this.type = js.native
  
  /**
    * @since 1.23.0
    *
    * Sets a new value for property {@link #getEnableCustomFilter enableCustomFilter}.
    *
    * Set this parameter to true to implement your own filter behaviour. Instead of the filter input box a
    * button will be rendered for which' press event (customFilter) you can register an event handler.
    *
    * When called with a value of `null` or `undefined`, the default value of the property will be restored.
    *
    * Default value is `false`.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setEnableCustomFilter(): this.type = js.native
  def setEnableCustomFilter(/**
    * New value for property `enableCustomFilter`
    */
  bEnableCustomFilter: Boolean): this.type = js.native
  
  /**
    * @deprecated (since 1.110) - this feature has a limited functionality and should not be used anymore.
    *
    * Sets a new value for property {@link #getEnableGrouping enableGrouping}.
    *
    * Enables or disables grouping. If grouping is enabled, the table is grouped by the column which is defined
    * in the `groupBy` association.
    *
    * The following restrictions apply:
    * 	 - Only client models are supported (e.g. {@link sap.ui.model.json.JSONModel}). Grouping does not work
    *     with OData models.
    * 	 - The table can only be grouped by **one** column at a time. Grouping by another column will remove
    *     the current grouping.
    * 	 - For the grouping to work correctly, {@link sap.ui.table.Column#getSortProperty sortProperty} must
    *     be set for the grouped column.
    * 	 - If grouping has been done, sorting and filtering is not possible. Any existing sorting and filtering
    *     rules do no longer apply. The UI is not updated accordingly (e.g. menu items, sort and filter icons).
    *
    * 	 - The column, by which the table is grouped, is not visible. It will become visible again only if the
    *     table is grouped by another column or grouping is disabled.
    *
    * When called with a value of `null` or `undefined`, the default value of the property will be restored.
    *
    * Default value is `false`.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setEnableGrouping(): this.type = js.native
  def setEnableGrouping(/**
    * New value for property `enableGrouping`
    */
  bEnableGrouping: Boolean): this.type = js.native
  
  /**
    * @since 1.23.0
    *
    * Sets a new value for property {@link #getEnableSelectAll enableSelectAll}.
    *
    * Specifies if a select all button should be displayed in the top left corner. This button is only displayed
    * if the row selector is visible and the selection mode is set to any kind of multi selection.
    *
    * When called with a value of `null` or `undefined`, the default value of the property will be restored.
    *
    * Default value is `true`.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setEnableSelectAll(): this.type = js.native
  def setEnableSelectAll(/**
    * New value for property `enableSelectAll`
    */
  bEnableSelectAll: Boolean): this.type = js.native
  
  /**
    * Sets a new value for property {@link #getFirstVisibleRow firstVisibleRow}.
    *
    * First visible row.
    *
    * When called with a value of `null` or `undefined`, the default value of the property will be restored.
    *
    * Default value is `0`.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setFirstVisibleRow(): this.type = js.native
  def setFirstVisibleRow(/**
    * New value for property `firstVisibleRow`
    */
  iFirstVisibleRow: int): this.type = js.native
  
  /**
    * @since 1.18.7
    *
    * Sets a new value for property {@link #getFixedBottomRowCount fixedBottomRowCount}.
    *
    * Number of rows that are fix on the bottom. When you use a vertical scrollbar, only the rows which are
    * not fixed, will scroll.
    *
    * This property is only supported if the `rows` aggregation is bound to a {@link sap.ui.model.ClientModel client model}.
    *
    * When called with a value of `null` or `undefined`, the default value of the property will be restored.
    *
    * Default value is `0`.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setFixedBottomRowCount(): this.type = js.native
  def setFixedBottomRowCount(/**
    * New value for property `fixedBottomRowCount`
    */
  iFixedBottomRowCount: int): this.type = js.native
  
  /**
    * Sets a new value for property {@link #getFixedColumnCount fixedColumnCount}.
    *
    * Number of columns that are fixed on the left. Only columns which are not fixed can be scrolled horizontally.
    *
    * **Note**
    * 	 - Fixed columns need a defined width for the feature to work.
    * 	 - The aggregated width of all fixed columns must not exceed the table width. Otherwise the table ignores
    *     the value of the property and adapts the behavior in an appropriate way to ensure that the user is still
    *     able to scroll horizontally.
    *
    * When called with a value of `null` or `undefined`, the default value of the property will be restored.
    *
    * Default value is `0`.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setFixedColumnCount(): this.type = js.native
  def setFixedColumnCount(/**
    * New value for property `fixedColumnCount`
    */
  iFixedColumnCount: int): this.type = js.native
  
  /**
    * Sets a new value for property {@link #getFixedRowCount fixedRowCount}.
    *
    * Number of rows that are fix on the top. When you use a vertical scrollbar, only the rows which are not
    * fixed, will scroll.
    *
    * This property is only supported if the `rows` aggregation is bound to a {@link sap.ui.model.ClientModel client model}.
    *
    * When called with a value of `null` or `undefined`, the default value of the property will be restored.
    *
    * Default value is `0`.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setFixedRowCount(): this.type = js.native
  def setFixedRowCount(/**
    * New value for property `fixedRowCount`
    */
  iFixedRowCount: int): this.type = js.native
  
  def setFooter(/**
    * The footer to set
    */
  vFooter: String): this.type = js.native
  /**
    * Sets the aggregated {@link #getFooter footer}.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setFooter(/**
    * The footer to set
    */
  vFooter: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
  
  /**
    * @experimental (since 1.28) - This feature has a limited functionality.
    *
    * Sets the associated {@link #getGroupBy groupBy}.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setGroupBy(
    /**
    * ID of an element which becomes the new target of this groupBy association; alternatively, an element
    * instance may be given
    */
  oGroupBy: ID
  ): this.type = js.native
  def setGroupBy(
    /**
    * ID of an element which becomes the new target of this groupBy association; alternatively, an element
    * instance may be given
    */
  oGroupBy: typings.openui5.sapUiTableColumnMod.default
  ): this.type = js.native
  
  /**
    * Sets a new value for property {@link #getMinAutoRowCount minAutoRowCount}.
    *
    * This property is used to set the minimum count of visible rows when the property visibleRowCountMode
    * is set to Auto or Interactive. For any other visibleRowCountMode, it is ignored.
    *
    * When called with a value of `null` or `undefined`, the default value of the property will be restored.
    *
    * Default value is `5`.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setMinAutoRowCount(): this.type = js.native
  def setMinAutoRowCount(/**
    * New value for property `minAutoRowCount`
    */
  iMinAutoRowCount: int): this.type = js.native
  
  /**
    * @deprecated (since 1.38)
    *
    * Sets a new value for property {@link #getNavigationMode navigationMode}.
    *
    * This property has been deprecated and must not be used anymore, since `Scrollbar` is the only supported
    * option.
    *
    * When called with a value of `null` or `undefined`, the default value of the property will be restored.
    *
    * Default value is `Scrollbar`.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setNavigationMode(): this.type = js.native
  def setNavigationMode(
    /**
    * New value for property `navigationMode`
    */
  sNavigationMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NavigationMode * / any */ String
  ): this.type = js.native
  def setNavigationMode(/**
    * New value for property `navigationMode`
    */
  sNavigationMode: NavigationMode): this.type = js.native
  
  def setNoData(/**
    * The noData to set
    */
  vNoData: String): this.type = js.native
  /**
    * Sets the aggregated {@link #getNoData noData}.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setNoData(/**
    * The noData to set
    */
  vNoData: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
  
  /**
    * @since 1.45.0
    *
    * Sets a new value for property {@link #getRowActionCount rowActionCount}.
    *
    * Number of row actions made visible which determines the width of the row action column. The values `0`,
    * `1` and `2` are possible.
    *
    * When called with a value of `null` or `undefined`, the default value of the property will be restored.
    *
    * Default value is `0`.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setRowActionCount(): this.type = js.native
  def setRowActionCount(/**
    * New value for property `rowActionCount`
    */
  iRowActionCount: int): this.type = js.native
  
  /**
    * Sets the aggregated {@link #getRowActionTemplate rowActionTemplate}.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setRowActionTemplate(
    /**
    * The rowActionTemplate to set
    */
  oRowActionTemplate: typings.openui5.sapUiTableRowActionMod.default
  ): this.type = js.native
  
  /**
    * Sets a new value for property {@link #getRowHeight rowHeight}.
    *
    * Row height in pixel.
    *
    * In the table's header, it defines the minimum height of the row, but it cannot be less than the default
    * height based on the content density configuration. The actual height can increase based on the content.
    *
    * In the table's body, it defines the height of the row content. The actual row height is also influenced
    * by other factors, such as the border width. If the `visibleRowCountMode` property is set to {@link sap.ui.table.VisibleRowCountMode Fixed }
    * or {@link sap.ui.table.VisibleRowCountMode Interactive}, the value defines the minimum height, and the
    * actual height can increase based on the content. If the mode is {@link sap.ui.table.VisibleRowCountMode Auto},
    * the value defines the actual height, and any content that doesn't fit is cut off.
    *
    * If no value is set (includes 0), a default height is applied based on the content density configuration.
    * In any `visibleRowCountMode`, the actual height can increase based on the content.
    *
    * When called with a value of `null` or `undefined`, the default value of the property will be restored.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setRowHeight(): this.type = js.native
  def setRowHeight(/**
    * New value for property `rowHeight`
    */
  iRowHeight: int): this.type = js.native
  
  /**
    * Sets the aggregated {@link #getRowSettingsTemplate rowSettingsTemplate}.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setRowSettingsTemplate(
    /**
    * The rowSettingsTemplate to set
    */
  oRowSettingsTemplate: typings.openui5.sapUiTableRowSettingsMod.default
  ): this.type = js.native
  
  /**
    * Sets the selected index. The previous selection is removed.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setSelectedIndex(/**
    * The index to select
    */
  iIndex: int): this.type = js.native
  
  /**
    * Sets a new value for property {@link #getSelectionBehavior selectionBehavior}.
    *
    * Selection behavior of the Table. This property defines whether the row selector is displayed and whether
    * the row, the row selector or both can be clicked to select a row. **Note:** Since the group header visualization
    * relies on the row selectors, the row selectors are always shown if the grouping functionality (depends
    * on table type) is enabled, even if `sap.ui.table.SelectionBehavior.RowOnly` is set.
    *
    * When called with a value of `null` or `undefined`, the default value of the property will be restored.
    *
    * Default value is `RowSelector`.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setSelectionBehavior(): this.type = js.native
  def setSelectionBehavior(
    /**
    * New value for property `selectionBehavior`
    */
  sSelectionBehavior: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionBehavior * / any */ String
  ): this.type = js.native
  def setSelectionBehavior(/**
    * New value for property `selectionBehavior`
    */
  sSelectionBehavior: SelectionBehavior): this.type = js.native
  
  /**
    * Sets the given selection interval as selection. In case of a single selection, only `iIndexTo` is selected.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setSelectionInterval(
    /**
    * Index from which the selection starts
    */
  iIndexFrom: int,
    /**
    * Index up to which to select
    */
  iIndexTo: int
  ): this.type = js.native
  
  def setSelectionMode(
    /**
    * the selection mode, see sap.ui.table.SelectionMode
    */
  sSelectionMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionMode * / any */ String
  ): this.type = js.native
  /**
    * Sets the selection mode. The current selection is lost.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setSelectionMode(/**
    * the selection mode, see sap.ui.table.SelectionMode
    */
  sSelectionMode: SelectionMode): this.type = js.native
  
  /**
    * Sets a new value for property {@link #getShowColumnVisibilityMenu showColumnVisibilityMenu}.
    *
    * Flag to show or hide the column visibility menu. This menu will get displayed in each generated column
    * header menu. It allows to show or hide columns
    *
    * When called with a value of `null` or `undefined`, the default value of the property will be restored.
    *
    * Default value is `false`.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setShowColumnVisibilityMenu(): this.type = js.native
  def setShowColumnVisibilityMenu(/**
    * New value for property `showColumnVisibilityMenu`
    */
  bShowColumnVisibilityMenu: Boolean): this.type = js.native
  
  /**
    * Sets a new value for property {@link #getShowNoData showNoData}.
    *
    * Flag whether to show the no data overlay or not once the table is empty. If set to false the table will
    * just show a grid of empty cells
    *
    * When called with a value of `null` or `undefined`, the default value of the property will be restored.
    *
    * Default value is `true`.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setShowNoData(): this.type = js.native
  def setShowNoData(/**
    * New value for property `showNoData`
    */
  bShowNoData: Boolean): this.type = js.native
  
  /**
    * @since 1.21.2
    *
    * Sets a new value for property {@link #getShowOverlay showOverlay}.
    *
    * Setting this property to true will show an overlay on top of the Table content and users cannot click
    * anymore on the Table content.
    *
    * When called with a value of `null` or `undefined`, the default value of the property will be restored.
    *
    * Default value is `false`.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setShowOverlay(): this.type = js.native
  def setShowOverlay(/**
    * New value for property `showOverlay`
    */
  bShowOverlay: Boolean): this.type = js.native
  
  /**
    * Sets the threshold value, which will be added to all data requests in case the Table is bound against
    * an OData service.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setThreshold(/**
    * The threshold
    */
  iThreshold: int): this.type = js.native
  
  def setTitle(/**
    * The title to set
    */
  vTitle: String): this.type = js.native
  /**
    * @deprecated (since 1.72) - Use, for example, a `sap.m.Title` control in the `extension` aggregation instead.
    *
    * Sets the aggregated {@link #getTitle title}.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setTitle(/**
    * The title to set
    */
  vTitle: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
  
  /**
    * @deprecated (since 1.38) - This aggregation is deprecated, use the `extension` aggregation instead.
    *
    * Sets the aggregated {@link #getToolbar toolbar}.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setToolbar(/**
    * The toolbar to set
    */
  oToolbar: Toolbar): this.type = js.native
  
  /**
    * Sets a new value for property {@link #getVisibleRowCount visibleRowCount}.
    *
    * Number of visible rows of the table.
    *
    * When called with a value of `null` or `undefined`, the default value of the property will be restored.
    *
    * Default value is `10`.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setVisibleRowCount(): this.type = js.native
  def setVisibleRowCount(/**
    * New value for property `visibleRowCount`
    */
  iVisibleRowCount: int): this.type = js.native
  
  /**
    * @since 1.9.2
    *
    * Sets a new value for property {@link #getVisibleRowCountMode visibleRowCountMode}.
    *
    * Defines how the table handles the visible rows in the table.
    *
    * In the `"Fixed"` mode, the table always has as many rows as defined in the `visibleRowCount` property.
    *
    * In the `"Auto"` mode, the `visibleRowCount` property is changed by the table automatically. It will then
    * adjust its row count to the space it is allowed to cover (limited by the surrounding container), but
    * it cannot have less than defined in the `minAutoRowCount` property. The `visibleRowCount` property cannot
    * be set manually. Restrictions:
    * 	 - All rows need to have the same height.
    * 	 - The table must be rendered without siblings in its parent DOM element. The only exception is if the
    *     parent element is a CSS flex container, and the table is a CSS flex item allowed to grow and shrink.
    *
    *
    * In the `"Interactive"` mode, the table has as many rows as defined in the `visibleRowCount` property
    * after rendering. The user can change the `visibleRowCount` by dragging a resizer.
    *
    * When called with a value of `null` or `undefined`, the default value of the property will be restored.
    *
    * Default value is `Fixed`.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setVisibleRowCountMode(): this.type = js.native
  def setVisibleRowCountMode(
    /**
    * New value for property `visibleRowCountMode`
    */
  sVisibleRowCountMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VisibleRowCountMode * / any */ String
  ): this.type = js.native
  def setVisibleRowCountMode(
    /**
    * New value for property `visibleRowCountMode`
    */
  sVisibleRowCountMode: VisibleRowCountMode
  ): this.type = js.native
  
  /**
    * Sets a new value for property {@link #getWidth width}.
    *
    * Width of the Table.
    *
    * When called with a value of `null` or `undefined`, the default value of the property will be restored.
    *
    * Default value is `'auto'`.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def setWidth(): this.type = js.native
  def setWidth(/**
    * New value for property `width`
    */
  sWidth: CSSSize): this.type = js.native
  
  def sort(
    /**
    * Column to be sorted or undefined to clear sorting
    */
  oColumn: Unit,
    /**
    * Sort order of the column (if undefined the default will be ascending)
    */
  oSortOrder: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SortOrder * / any */ String,
    /**
    * Set to true to add the new sort criterion to the existing sort criteria
    */
  bAdd: Boolean
  ): Unit = js.native
  def sort(
    /**
    * Column to be sorted or undefined to clear sorting
    */
  oColumn: Unit,
    /**
    * Sort order of the column (if undefined the default will be ascending)
    */
  oSortOrder: SortOrder,
    /**
    * Set to true to add the new sort criterion to the existing sort criteria
    */
  bAdd: Boolean
  ): Unit = js.native
  def sort(
    /**
    * Column to be sorted or undefined to clear sorting
    */
  oColumn: typings.openui5.sapUiTableColumnMod.default,
    /**
    * Sort order of the column (if undefined the default will be ascending)
    */
  oSortOrder: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SortOrder * / any */ String,
    /**
    * Set to true to add the new sort criterion to the existing sort criteria
    */
  bAdd: Boolean
  ): Unit = js.native
  /**
    * Sorts the given column ascending or descending.
    */
  def sort(
    /**
    * Column to be sorted or undefined to clear sorting
    */
  oColumn: typings.openui5.sapUiTableColumnMod.default,
    /**
    * Sort order of the column (if undefined the default will be ascending)
    */
  oSortOrder: SortOrder,
    /**
    * Set to true to add the new sort criterion to the existing sort criteria
    */
  bAdd: Boolean
  ): Unit = js.native
  
  /**
    * Unbinds aggregation {@link #getColumns columns} from model data.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def unbindColumns(): this.type = js.native
  
  /**
    * Unbinds aggregation {@link #getRows rows} from model data.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def unbindRows(): this.type = js.native
}
