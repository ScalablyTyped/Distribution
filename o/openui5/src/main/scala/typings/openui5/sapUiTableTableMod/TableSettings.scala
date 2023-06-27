package typings.openui5.sapUiTableTableMod

import typings.openui5.int
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.IContextMenu
import typings.openui5.sapUiCoreLibraryMod.Toolbar
import typings.openui5.sapUiTableLibraryMod.NavigationMode
import typings.openui5.sapUiTableLibraryMod.SelectionBehavior
import typings.openui5.sapUiTableLibraryMod.SelectionMode
import typings.openui5.sapUiTableLibraryMod.VisibleRowCountMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableSettings
  extends StObject
     with ControlSettings {
  
  /**
    * @since 1.52
    *
    * Enables alternating table row colors. Alternate row coloring is not available for the tree mode.
    */
  var alternateRowColors: js.UndefOr[
    Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * Association to controls / ids which label this control (see WAI-ARIA attribute aria-labelledby).
    */
  var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
  
  /**
    * @since 1.54
    *
    * Fired when the user requests the context menu for a table cell.
    */
  var beforeOpenContextMenu: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$BeforeOpenContextMenuEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @since 1.37.0
    *
    * This event gets fired when the busy state of the table changes. It should only be used by composite controls.
    */
  var busyStateChanged: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$BusyStateChangedEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @since 1.21.0
    *
    * fired when the user clicks a cell of the table (experimental!).
    */
  var cellClick: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$CellClickEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @since 1.21.0
    * @deprecated (since 1.54) - replaced by `beforeOpenContextMenu`.
    *
    * fired when the user clicks a cell of the table.
    */
  var cellContextmenu: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$CellContextmenuEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @since 1.21.0
    *
    * fired when a column of the table should be freezed
    */
  var columnFreeze: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$ColumnFreezeEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Header row height in pixel. If a value greater than 0 is set, it overrides the height defined in the
    * `rowHeight` property for the rows in the table's header. The value defines the minimum height, but it
    * cannot be less than the default height based on the content density configuration. The actual height
    * can increase based on the content.
    *
    * **Note**: In a {@link sap.ui.table.Column#getMultiLabels MultiLabel} scenario, the height is applied
    * to each individual row of the table's header.
    */
  var columnHeaderHeight: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  
  /**
    * Flag whether the column header is visible or not.
    *
    * **Caution:** Please be aware that when setting this property to `false`, a 100% accessibility of the
    * table can't be guaranteed any more.
    */
  var columnHeaderVisible: js.UndefOr[
    Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * fired when a table column is moved.
    */
  var columnMove: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$ColumnMoveEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * fired when a table column is resized.
    */
  var columnResize: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$ColumnResizeEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * fired when a column of the table has been selected
    */
  var columnSelect: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$ColumnSelectEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * fired when the visibility of a table column is changed.
    */
  var columnVisibility: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$ColumnVisibilityEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Columns of the Table
    */
  var columns: js.UndefOr[
    js.Array[typings.openui5.sapUiTableColumnMod.default] | typings.openui5.sapUiTableColumnMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * @since 1.54
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
  var contextMenu: js.UndefOr[IContextMenu] = js.undefined
  
  /**
    * @since 1.23.0
    *
    * This event is triggered when the custom filter item of the column menu is pressed. The column on which
    * the event was triggered is passed as parameter.
    */
  var customFilter: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$CustomFilterEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @deprecated (since 1.115)
    *
    * Flag whether the controls of the Table are editable or not (currently this only controls the background
    * color in certain themes!)
    */
  var editable: js.UndefOr[
    Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * @since 1.27.0
    *
    * If set to `true`, the table changes its busy state, resulting in showing or hiding the busy indicator.
    * The table will switch to busy as soon as data is retrieved to be displayed in the currently visible rows.
    * This happens, for example, during scrolling, filtering, or sorting. As soon as the data has been retrieved,
    * the table switches back to not busy. The busy state of the table can still be set manually by calling
    * {@link sap.ui.core.Control#setBusy}.
    */
  var enableBusyIndicator: js.UndefOr[
    Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * @since 1.21.0
    *
    * Flag whether to enable or disable the context menu on cells to trigger a filtering with the cell value.
    */
  var enableCellFilter: js.UndefOr[
    Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * @since 1.21.0
    *
    * Flag whether to show or hide the column menu item to freeze or unfreeze a column.
    */
  var enableColumnFreeze: js.UndefOr[
    Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * Flag to enable or disable column reordering
    */
  var enableColumnReordering: js.UndefOr[
    Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * @since 1.23.0
    *
    * Set this parameter to true to implement your own filter behaviour. Instead of the filter input box a
    * button will be rendered for which' press event (customFilter) you can register an event handler.
    */
  var enableCustomFilter: js.UndefOr[
    Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * @deprecated (since 1.110) - this feature has a limited functionality and should not be used anymore.
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
    */
  var enableGrouping: js.UndefOr[
    Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * @since 1.23.0
    *
    * Specifies if a select all button should be displayed in the top left corner. This button is only displayed
    * if the row selector is visible and the selection mode is set to any kind of multi selection.
    */
  var enableSelectAll: js.UndefOr[
    Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * Extension section of the Table. If not set, no extension area will be rendered. Note: In case a `sap.m.Toolbar`
    * is used as header the CSS class sapMTBHeader-CTX should be applied on this toolbar.
    */
  var `extension`: js.UndefOr[
    js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * This event is fired before a filter is applied to a column, if the table is filtered via {@link sap.ui.table.Table#filter }
    * call or user interaction with the column header.
    *
    * Filters that are directly applied to the table binding will not fire this event.
    */
  var filter: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$FilterEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * First visible row.
    */
  var firstVisibleRow: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  
  /**
    * @since 1.37.0
    *
    * This event gets fired when the first visible row is changed. It should only be used by composite controls.
    * The event even is fired when setFirstVisibleRow is called programmatically.
    */
  var firstVisibleRowChanged: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$FirstVisibleRowChangedEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @since 1.18.7
    *
    * Number of rows that are fix on the bottom. When you use a vertical scrollbar, only the rows which are
    * not fixed, will scroll.
    *
    * This property is only supported if the `rows` aggregation is bound to a {@link sap.ui.model.ClientModel client model}.
    */
  var fixedBottomRowCount: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  
  /**
    * Number of columns that are fixed on the left. Only columns which are not fixed can be scrolled horizontally.
    *
    * **Note**
    * 	 - Fixed columns need a defined width for the feature to work.
    * 	 - The aggregated width of all fixed columns must not exceed the table width. Otherwise the table ignores
    *     the value of the property and adapts the behavior in an appropriate way to ensure that the user is still
    *     able to scroll horizontally.
    */
  var fixedColumnCount: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  
  /**
    * Number of rows that are fix on the top. When you use a vertical scrollbar, only the rows which are not
    * fixed, will scroll.
    *
    * This property is only supported if the `rows` aggregation is bound to a {@link sap.ui.model.ClientModel client model}.
    */
  var fixedRowCount: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  
  /**
    * Control or text of footer section of the Table (if not set it will be hidden)
    */
  var footer: js.UndefOr[String | typings.openui5.sapUiCoreControlMod.default | PropertyBindingInfo] = js.undefined
  
  /**
    * fired when the table is grouped (experimental!).
    */
  var group: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$GroupEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @experimental (since 1.28) - This feature has a limited functionality.
    *
    * The column by which the table is grouped. Grouping will only be performed if `enableGrouping` is set
    * to `true`. Setting `groupBy` in the view does not work and throws an error. It can only be set if the
    * column by which the table is grouped is already part of the `columns` aggregation of the table.
    */
  var groupBy: js.UndefOr[typings.openui5.sapUiTableColumnMod.default | String] = js.undefined
  
  /**
    * This property is used to set the minimum count of visible rows when the property visibleRowCountMode
    * is set to Auto or Interactive. For any other visibleRowCountMode, it is ignored.
    */
  var minAutoRowCount: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  
  /**
    * @deprecated (since 1.38)
    *
    * This property has been deprecated and must not be used anymore, since `Scrollbar` is the only supported
    * option.
    */
  var navigationMode: js.UndefOr[
    NavigationMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NavigationMode * / any */ String) | PropertyBindingInfo
  ] = js.undefined
  
  /**
    * The value for the noData aggregation can be either a string value or a control instance. The control
    * is shown, in case there is no data for the Table available. In case of a string value this will simply
    * replace the no data text.
    */
  var noData: js.UndefOr[String | typings.openui5.sapUiCoreControlMod.default | PropertyBindingInfo] = js.undefined
  
  /**
    * @since 1.60
    *
    * This event gets fired when the user pastes content from the clipboard to the table. Pasting can be done
    * with the standard keyboard shortcut, if the focus is inside the table.
    */
  var paste: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$PasteEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @since 1.64
    *
    * Plugin section of the table. Multiple plugins are possible, but always only **one** of a certain type.
    *
    * The following restrictions apply:
    * 	 - If a selection plugin is applied to the table, the table's selection API must not be used. Instead,
    *     use the API of the plugin.
    * 	 - Only one MultiSelectionPlugin can be applied. No other plugins can be applied.
    */
  var plugins: js.UndefOr[
    js.Array[typings.openui5.sapUiTablePluginsSelectionPluginMod.default] | typings.openui5.sapUiTablePluginsSelectionPluginMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * @since 1.45.0
    *
    * Number of row actions made visible which determines the width of the row action column. The values `0`,
    * `1` and `2` are possible.
    */
  var rowActionCount: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  
  /**
    * Template for row actions. A template is decoupled from the row or table. Each time the template's properties
    * or aggregations are changed, the template has to be applied again via `setRowActionTemplate` for the
    * changes to take effect.
    */
  var rowActionTemplate: js.UndefOr[typings.openui5.sapUiTableRowActionMod.default] = js.undefined
  
  /**
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
    */
  var rowHeight: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  
  /**
    * fired when the row selection of the table has been changed (the event parameters can be used to determine
    * selection changes - to find out the selected rows you should better use the table selection API)
    *
    * **Note:** If a selection plugin is applied to the table, this event won't be fired.
    */
  var rowSelectionChange: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$RowSelectionChangeEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Template for row settings. A template is decoupled from the row or table. Each time the template's properties
    * or aggregations are changed, the template has to be applied again via `setRowSettingsTemplate` for the
    * changes to take effect.
    */
  var rowSettingsTemplate: js.UndefOr[typings.openui5.sapUiTableRowSettingsMod.default] = js.undefined
  
  /**
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
  var rows: js.UndefOr[
    js.Array[typings.openui5.sapUiTableRowMod.default] | typings.openui5.sapUiTableRowMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * @since 1.86
    *
    * This event is fired after the table rows have been updated due to rendering, a model update, or a user
    * interaction, for example.
    *
    * **Note**: This event is fired often and must not be used for performance-critical tasks.
    */
  var rowsUpdated: js.UndefOr[
    js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
  ] = js.undefined
  
  /**
    * @deprecated (since 1.69) - replaced by {@link sap.ui.table.Table#getSelectedIndices} and {@link sap.ui.table.Table#setSelectedIndex}
    *
    * Zero-based index of selected item. Index value for no selection is -1. When multi-selection is enabled
    * and multiple items are selected, the method returns the lead selected item. Sets the zero-based index
    * of the currently selected item. This method removes any previous selections. When the given index is
    * invalid, the call is ignored. **Note:** If the rows of the table are bound, the value of the property
    * is reset to -1. If a selection plugin is applied to the table, the property is not bindable.
    */
  var selectedIndex: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  
  /**
    * Selection behavior of the Table. This property defines whether the row selector is displayed and whether
    * the row, the row selector or both can be clicked to select a row. **Note:** Since the group header visualization
    * relies on the row selectors, the row selectors are always shown if the grouping functionality (depends
    * on table type) is enabled, even if `sap.ui.table.SelectionBehavior.RowOnly` is set.
    */
  var selectionBehavior: js.UndefOr[
    SelectionBehavior | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionBehavior * / any */ String) | PropertyBindingInfo
  ] = js.undefined
  
  /**
    * Selection mode of the Table. This property controls whether single or multiple rows can be selected and
    * how the selection can be extended. It may also influence the visual appearance. When the selection mode
    * is changed, the current selection is removed. **Note:** Since the group header visualization relies on
    * the row selectors, the row selectors are always shown if the grouping functionality (depends on table
    * type) is enabled, even if `sap.ui.table.SelectionMode.None` is set. **Note:** If a selection plugin is
    * applied to the table, the selection mode is controlled by the plugin.
    */
  var selectionMode: js.UndefOr[
    SelectionMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionMode * / any */ String) | PropertyBindingInfo
  ] = js.undefined
  
  /**
    * Flag to show or hide the column visibility menu. This menu will get displayed in each generated column
    * header menu. It allows to show or hide columns
    */
  var showColumnVisibilityMenu: js.UndefOr[
    Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * Flag whether to show the no data overlay or not once the table is empty. If set to false the table will
    * just show a grid of empty cells
    */
  var showNoData: js.UndefOr[
    Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * @since 1.21.2
    *
    * Setting this property to true will show an overlay on top of the Table content and users cannot click
    * anymore on the Table content.
    */
  var showOverlay: js.UndefOr[
    Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
  ] = js.undefined
  
  /**
    * This event is fired before a sort order is applied to a column, if the table is sorted via {@link sap.ui.table.Table#sort }
    * call or user interaction with the column header.
    *
    * Sorters that are directly applied to the table binding will not fire this event.
    */
  var sort: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$SortEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Defines how many additional (not yet visible) data records from the back-end system are pre-fetched to
    * enable smooth scrolling. The threshold is always added to the `visibleRowCount`. If the `visibleRowCount`
    * is 10 and the `threshold` is 100, there will be 110 records fetched with the initial load. If the `threshold`
    * is lower than the number of rows in the scrollable area (`visibleRowCount` minus number of fixed rows),
    * this number is used as the `threshold`. If the value is 0, thresholding is disabled.
    */
  var threshold: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  
  /**
    * @deprecated (since 1.72) - Use, for example, a `sap.m.Title` control in the `extension` aggregation instead.
    *
    * Control or text of title section of the Table (if not set it will be hidden)
    */
  var title: js.UndefOr[String | typings.openui5.sapUiCoreControlMod.default | PropertyBindingInfo] = js.undefined
  
  /**
    * @deprecated (since 1.38) - This aggregation is deprecated, use the `extension` aggregation instead.
    *
    * Toolbar of the Table If not set, no toolbar area will be rendered. Note: The CSS class sapMTBHeader-CTX
    * is applied on the given toolbar.
    */
  var toolbar: js.UndefOr[Toolbar] = js.undefined
  
  /**
    * Number of visible rows of the table.
    */
  var visibleRowCount: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  
  /**
    * @since 1.9.2
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
    */
  var visibleRowCountMode: js.UndefOr[
    VisibleRowCountMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VisibleRowCountMode * / any */ String) | PropertyBindingInfo
  ] = js.undefined
  
  /**
    * Width of the Table.
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
    
    inline def setAlternateRowColors(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "alternateRowColors", value.asInstanceOf[js.Any])
    
    inline def setAlternateRowColorsUndefined: Self = StObject.set(x, "alternateRowColors", js.undefined)
    
    inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
    
    inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
    
    inline def setBeforeOpenContextMenu(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$BeforeOpenContextMenuEventParameters] => Unit
    ): Self = StObject.set(x, "beforeOpenContextMenu", js.Any.fromFunction1(value))
    
    inline def setBeforeOpenContextMenuUndefined: Self = StObject.set(x, "beforeOpenContextMenu", js.undefined)
    
    inline def setBusyStateChanged(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$BusyStateChangedEventParameters] => Unit
    ): Self = StObject.set(x, "busyStateChanged", js.Any.fromFunction1(value))
    
    inline def setBusyStateChangedUndefined: Self = StObject.set(x, "busyStateChanged", js.undefined)
    
    inline def setCellClick(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$CellClickEventParameters] => Unit
    ): Self = StObject.set(x, "cellClick", js.Any.fromFunction1(value))
    
    inline def setCellClickUndefined: Self = StObject.set(x, "cellClick", js.undefined)
    
    inline def setCellContextmenu(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$CellContextmenuEventParameters] => Unit
    ): Self = StObject.set(x, "cellContextmenu", js.Any.fromFunction1(value))
    
    inline def setCellContextmenuUndefined: Self = StObject.set(x, "cellContextmenu", js.undefined)
    
    inline def setColumnFreeze(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$ColumnFreezeEventParameters] => Unit
    ): Self = StObject.set(x, "columnFreeze", js.Any.fromFunction1(value))
    
    inline def setColumnFreezeUndefined: Self = StObject.set(x, "columnFreeze", js.undefined)
    
    inline def setColumnHeaderHeight(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "columnHeaderHeight", value.asInstanceOf[js.Any])
    
    inline def setColumnHeaderHeightUndefined: Self = StObject.set(x, "columnHeaderHeight", js.undefined)
    
    inline def setColumnHeaderVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "columnHeaderVisible", value.asInstanceOf[js.Any])
    
    inline def setColumnHeaderVisibleUndefined: Self = StObject.set(x, "columnHeaderVisible", js.undefined)
    
    inline def setColumnMove(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$ColumnMoveEventParameters] => Unit
    ): Self = StObject.set(x, "columnMove", js.Any.fromFunction1(value))
    
    inline def setColumnMoveUndefined: Self = StObject.set(x, "columnMove", js.undefined)
    
    inline def setColumnResize(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$ColumnResizeEventParameters] => Unit
    ): Self = StObject.set(x, "columnResize", js.Any.fromFunction1(value))
    
    inline def setColumnResizeUndefined: Self = StObject.set(x, "columnResize", js.undefined)
    
    inline def setColumnSelect(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$ColumnSelectEventParameters] => Unit
    ): Self = StObject.set(x, "columnSelect", js.Any.fromFunction1(value))
    
    inline def setColumnSelectUndefined: Self = StObject.set(x, "columnSelect", js.undefined)
    
    inline def setColumnVisibility(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$ColumnVisibilityEventParameters] => Unit
    ): Self = StObject.set(x, "columnVisibility", js.Any.fromFunction1(value))
    
    inline def setColumnVisibilityUndefined: Self = StObject.set(x, "columnVisibility", js.undefined)
    
    inline def setColumns(
      value: js.Array[typings.openui5.sapUiTableColumnMod.default] | typings.openui5.sapUiTableColumnMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
    ): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: typings.openui5.sapUiTableColumnMod.default*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setContextMenu(value: IContextMenu): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    inline def setCustomFilter(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$CustomFilterEventParameters] => Unit
    ): Self = StObject.set(x, "customFilter", js.Any.fromFunction1(value))
    
    inline def setCustomFilterUndefined: Self = StObject.set(x, "customFilter", js.undefined)
    
    inline def setEditable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setEnableBusyIndicator(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableBusyIndicator", value.asInstanceOf[js.Any])
    
    inline def setEnableBusyIndicatorUndefined: Self = StObject.set(x, "enableBusyIndicator", js.undefined)
    
    inline def setEnableCellFilter(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableCellFilter", value.asInstanceOf[js.Any])
    
    inline def setEnableCellFilterUndefined: Self = StObject.set(x, "enableCellFilter", js.undefined)
    
    inline def setEnableColumnFreeze(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableColumnFreeze", value.asInstanceOf[js.Any])
    
    inline def setEnableColumnFreezeUndefined: Self = StObject.set(x, "enableColumnFreeze", js.undefined)
    
    inline def setEnableColumnReordering(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableColumnReordering", value.asInstanceOf[js.Any])
    
    inline def setEnableColumnReorderingUndefined: Self = StObject.set(x, "enableColumnReordering", js.undefined)
    
    inline def setEnableCustomFilter(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableCustomFilter", value.asInstanceOf[js.Any])
    
    inline def setEnableCustomFilterUndefined: Self = StObject.set(x, "enableCustomFilter", js.undefined)
    
    inline def setEnableGrouping(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableGrouping", value.asInstanceOf[js.Any])
    
    inline def setEnableGroupingUndefined: Self = StObject.set(x, "enableGrouping", js.undefined)
    
    inline def setEnableSelectAll(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableSelectAll", value.asInstanceOf[js.Any])
    
    inline def setEnableSelectAllUndefined: Self = StObject.set(x, "enableSelectAll", js.undefined)
    
    inline def setExtension(
      value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
    ): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setExtensionVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "extension", js.Array(value*))
    
    inline def setFilter(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$FilterEventParameters] => Unit): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFirstVisibleRow(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "firstVisibleRow", value.asInstanceOf[js.Any])
    
    inline def setFirstVisibleRowChanged(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$FirstVisibleRowChangedEventParameters] => Unit
    ): Self = StObject.set(x, "firstVisibleRowChanged", js.Any.fromFunction1(value))
    
    inline def setFirstVisibleRowChangedUndefined: Self = StObject.set(x, "firstVisibleRowChanged", js.undefined)
    
    inline def setFirstVisibleRowUndefined: Self = StObject.set(x, "firstVisibleRow", js.undefined)
    
    inline def setFixedBottomRowCount(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "fixedBottomRowCount", value.asInstanceOf[js.Any])
    
    inline def setFixedBottomRowCountUndefined: Self = StObject.set(x, "fixedBottomRowCount", js.undefined)
    
    inline def setFixedColumnCount(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "fixedColumnCount", value.asInstanceOf[js.Any])
    
    inline def setFixedColumnCountUndefined: Self = StObject.set(x, "fixedColumnCount", js.undefined)
    
    inline def setFixedRowCount(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "fixedRowCount", value.asInstanceOf[js.Any])
    
    inline def setFixedRowCountUndefined: Self = StObject.set(x, "fixedRowCount", js.undefined)
    
    inline def setFooter(value: String | typings.openui5.sapUiCoreControlMod.default | PropertyBindingInfo): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setGroup(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$GroupEventParameters] => Unit): Self = StObject.set(x, "group", js.Any.fromFunction1(value))
    
    inline def setGroupBy(value: typings.openui5.sapUiTableColumnMod.default | String): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
    
    inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setMinAutoRowCount(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minAutoRowCount", value.asInstanceOf[js.Any])
    
    inline def setMinAutoRowCountUndefined: Self = StObject.set(x, "minAutoRowCount", js.undefined)
    
    inline def setNavigationMode(
      value: NavigationMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NavigationMode * / any */ String) | PropertyBindingInfo
    ): Self = StObject.set(x, "navigationMode", value.asInstanceOf[js.Any])
    
    inline def setNavigationModeUndefined: Self = StObject.set(x, "navigationMode", js.undefined)
    
    inline def setNoData(value: String | typings.openui5.sapUiCoreControlMod.default | PropertyBindingInfo): Self = StObject.set(x, "noData", value.asInstanceOf[js.Any])
    
    inline def setNoDataUndefined: Self = StObject.set(x, "noData", js.undefined)
    
    inline def setPaste(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$PasteEventParameters] => Unit): Self = StObject.set(x, "paste", js.Any.fromFunction1(value))
    
    inline def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
    
    inline def setPlugins(
      value: js.Array[typings.openui5.sapUiTablePluginsSelectionPluginMod.default] | typings.openui5.sapUiTablePluginsSelectionPluginMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
    ): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: typings.openui5.sapUiTablePluginsSelectionPluginMod.default*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setRowActionCount(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "rowActionCount", value.asInstanceOf[js.Any])
    
    inline def setRowActionCountUndefined: Self = StObject.set(x, "rowActionCount", js.undefined)
    
    inline def setRowActionTemplate(value: typings.openui5.sapUiTableRowActionMod.default): Self = StObject.set(x, "rowActionTemplate", value.asInstanceOf[js.Any])
    
    inline def setRowActionTemplateUndefined: Self = StObject.set(x, "rowActionTemplate", js.undefined)
    
    inline def setRowHeight(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    
    inline def setRowSelectionChange(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$RowSelectionChangeEventParameters] => Unit
    ): Self = StObject.set(x, "rowSelectionChange", js.Any.fromFunction1(value))
    
    inline def setRowSelectionChangeUndefined: Self = StObject.set(x, "rowSelectionChange", js.undefined)
    
    inline def setRowSettingsTemplate(value: typings.openui5.sapUiTableRowSettingsMod.default): Self = StObject.set(x, "rowSettingsTemplate", value.asInstanceOf[js.Any])
    
    inline def setRowSettingsTemplateUndefined: Self = StObject.set(x, "rowSettingsTemplate", js.undefined)
    
    inline def setRows(
      value: js.Array[typings.openui5.sapUiTableRowMod.default] | typings.openui5.sapUiTableRowMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
    ): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsUpdated(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "rowsUpdated", js.Any.fromFunction1(value))
    
    inline def setRowsUpdatedUndefined: Self = StObject.set(x, "rowsUpdated", js.undefined)
    
    inline def setRowsVarargs(value: typings.openui5.sapUiTableRowMod.default*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setSelectedIndex(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
    
    inline def setSelectionBehavior(
      value: SelectionBehavior | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionBehavior * / any */ String) | PropertyBindingInfo
    ): Self = StObject.set(x, "selectionBehavior", value.asInstanceOf[js.Any])
    
    inline def setSelectionBehaviorUndefined: Self = StObject.set(x, "selectionBehavior", js.undefined)
    
    inline def setSelectionMode(
      value: SelectionMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionMode * / any */ String) | PropertyBindingInfo
    ): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setShowColumnVisibilityMenu(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showColumnVisibilityMenu", value.asInstanceOf[js.Any])
    
    inline def setShowColumnVisibilityMenuUndefined: Self = StObject.set(x, "showColumnVisibilityMenu", js.undefined)
    
    inline def setShowNoData(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showNoData", value.asInstanceOf[js.Any])
    
    inline def setShowNoDataUndefined: Self = StObject.set(x, "showNoData", js.undefined)
    
    inline def setShowOverlay(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showOverlay", value.asInstanceOf[js.Any])
    
    inline def setShowOverlayUndefined: Self = StObject.set(x, "showOverlay", js.undefined)
    
    inline def setSort(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Table$SortEventParameters] => Unit): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setThreshold(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    inline def setTitle(value: String | typings.openui5.sapUiCoreControlMod.default | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setToolbar(value: Toolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    inline def setVisibleRowCount(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visibleRowCount", value.asInstanceOf[js.Any])
    
    inline def setVisibleRowCountMode(
      value: VisibleRowCountMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VisibleRowCountMode * / any */ String) | PropertyBindingInfo
    ): Self = StObject.set(x, "visibleRowCountMode", value.asInstanceOf[js.Any])
    
    inline def setVisibleRowCountModeUndefined: Self = StObject.set(x, "visibleRowCountMode", js.undefined)
    
    inline def setVisibleRowCountUndefined: Self = StObject.set(x, "visibleRowCount", js.undefined)
    
    inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
