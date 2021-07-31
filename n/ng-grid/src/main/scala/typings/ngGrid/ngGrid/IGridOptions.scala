package typings.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGridOptions extends StObject {
  
  /** Callback for when you want to validate something after selection. */
  var afterSelectionChange: js.UndefOr[
    js.Function2[/* rowItem */ js.UndefOr[IRow], /* event */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  /** Define an aggregate template to customize the rows when grouped. See github wiki for more details. */
  var aggregateTemplate: js.UndefOr[String] = js.undefined
  
  /** Callback if you want to inspect something before selection,
    return false if you want to cancel the selection. return true otherwise.
    If you need to wait for an async call to proceed with selection you can
    use rowItem.changeSelection(event) method after returning false initially.
    Note: when shift+ Selecting multiple items in the grid this will only get called
    once and the rowItem will be an array of items that are queued to be selected. */
  var beforeSelectionChange: js.UndefOr[
    js.Function2[/* rowItem */ js.UndefOr[IRow], /* event */ js.UndefOr[js.Any], Boolean]
  ] = js.undefined
  
  /** checkbox templates. */
  var checkboxCellTemplate: js.UndefOr[String] = js.undefined
  
  /** checkbox templates. */
  var checkboxHeaderTemplate: js.UndefOr[String] = js.undefined
  
  /** definitions of columns as an array [], if not defined columns are auto-generated. See github wiki for more details. */
  var columnDefs: js.UndefOr[js.Array[IColumnDef]] = js.undefined
  
  /** Data being displayed in the grid. This can be either a string of object ID or object reference.
    Using string is preferred, as this turns on change tracking in ng-grid
    */
  var data: js.UndefOr[js.Any] = js.undefined
  
  /** Data updated callback, fires every time the data is modified from outside the grid. */
  var dataUpdated: js.UndefOr[js.Function] = js.undefined
  
  /** Enables cell editing. */
  var enableCellEdit: js.UndefOr[Boolean] = js.undefined
  
  /** Enables cell selection. */
  var enableCellSelection: js.UndefOr[Boolean] = js.undefined
  
  /** Enable or disable HEAVY column virtualization. This turns off selection checkboxes and column pinning and is designed for spreadsheet-like data. */
  var enableColumnHeavyVirt: js.UndefOr[Boolean] = js.undefined
  
  /** Enable or disable reordering of columns */
  var enableColumnReordering: js.UndefOr[Boolean] = js.undefined
  
  /** Enable or disable resizing of columns */
  var enableColumnResize: js.UndefOr[Boolean] = js.undefined
  
  /** Enables or disables text highlighting in grid by adding the "unselectable" class (See CSS file) */
  var enableHighlighting: js.UndefOr[Boolean] = js.undefined
  
  /** Enables the server-side paging feature */
  var enablePaging: js.UndefOr[Boolean] = js.undefined
  
  /** Enable column pinning */
  var enablePinning: js.UndefOr[Boolean] = js.undefined
  
  /** Enable drag and drop row reordering. Only works in HTML5 compliant browsers. */
  var enableRowReordering: js.UndefOr[Boolean] = js.undefined
  
  /** To be able to have selectable rows in grid. */
  var enableRowSelection: js.UndefOr[Boolean] = js.undefined
  
  /** Enables or disables sorting in grid. */
  var enableSorting: js.UndefOr[Boolean] = js.undefined
  
  /**  string list of properties to exclude when auto-generating columns. */
  var excludeProperties: js.UndefOr[js.Any] = js.undefined
  
  /** filterOptions -
    filterText: The text bound to the built-in search box.
    useExternalFilter: Bypass internal filtering if you want to roll your own filtering mechanism but want to use builtin search box.
    */
  var filterOptions: js.UndefOr[IFilterOptions] = js.undefined
  
  /** Defining the height of the footer in pixels. */
  var footerRowHeight: js.UndefOr[Double] = js.undefined
  
  /** Initial fields to group data by. Array of field names, not displayName. */
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The height of the header row in pixels. */
  var headerRowHeight: js.UndefOr[Double] = js.undefined
  
  /** Define a header row template for further customization. See github wiki for more details. */
  var headerRowTemplate: js.UndefOr[String] = js.undefined
  
  /** i18n language support. choose from the installed or included languages, en, fr, sp, etc...*/
  var i18n: js.UndefOr[String] = js.undefined
  
  /** Enables the use of jquery UI reaggable/droppable plugin. requires jqueryUI to work if enabled.
    Useful if you want drag + drop but your users insist on crappy browsers. */
  var jqueryUIDraggable: js.UndefOr[Boolean] = js.undefined
  
  /** Enable the use jqueryUIThemes */
  var jqueryUITheme: js.UndefOr[Boolean] = js.undefined
  
  /** Prevent unselections when in single selection mode. */
  var keepLastSelected: js.UndefOr[Boolean] = js.undefined
  
  /** Maintains the column widths while resizing.
    Defaults to true when using *'s or undefined widths. Can be ovverriden by setting to false. */
  var maintainColumnRatios: js.UndefOr[Boolean] = js.undefined
  
  /** Set this to false if you only want one item selected at a time */
  var multiSelect: js.UndefOr[Boolean] = js.undefined
  
  /**  pagingOptions - */
  var pagingOptions: js.UndefOr[IPagingOptions] = js.undefined
  
  /** Array of plugin functions to register in ng-grid */
  var pinSelectionCheckbox: js.UndefOr[Boolean] = js.undefined
  
  /** Array of plugin functions to register in ng-grid */
  var plugins: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /** Row height of rows in grid. */
  var rowHeight: js.UndefOr[Double] = js.undefined
  
  /** Define a row template to customize output. See github wiki for more details. */
  var rowTemplate: js.UndefOr[String] = js.undefined
  
  /** Select deselect an item by index. */
  var selectItem: js.UndefOr[js.Function2[/* idx */ Double, /* state */ Boolean, js.Any]] = js.undefined
  
  /** Disable row selections by clicking on the row and only when the checkbox is clicked. */
  var selectWithCheckboxOnly: js.UndefOr[Boolean] = js.undefined
  
  /** all of the items selected in the grid. In single select mode there will only be one item in the array. */
  var selectedItems: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /** Enables menu to choose which columns to display and group by.
    If both showColumnMenu and showFilter are false the menu button will not display.*/
  var showColumnMenu: js.UndefOr[Boolean] = js.undefined
  
  /** Enables display of the filterbox in the column menu.
    If both showColumnMenu and showFilter are false the menu button will not display.*/
  var showFilter: js.UndefOr[Boolean] = js.undefined
  
  /** Show or hide the footer alltogether the footer is enabled by default */
  var showFooter: js.UndefOr[Boolean] = js.undefined
  
  /** Show the dropzone for drag and drop grouping */
  var showGroupPanel: js.UndefOr[Boolean] = js.undefined
  
  /** Row selection check boxes appear as the first column. */
  var showSelectionCheckbox: js.UndefOr[Boolean] = js.undefined
  
  /** Define a sortInfo object to specify a default sorting state.
    You can also observe this variable to utilize server-side sorting (see useExternalSorting).
    Syntax is sortinfo: { fields: ['fieldName1',' fieldName2'], direction: 'ASC'/'asc' || 'desc'/'DESC'}*/
  var sortInfo: js.UndefOr[js.Any] = js.undefined
  
  /** Set the tab index of the Vieport. */
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  /** Prevents the internal sorting from executing.
    The sortInfo object will be updated with the sorting information so you can handle sorting (see sortInfo)*/
  var useExternalSorting: js.UndefOr[Boolean] = js.undefined
  
  /** the threshold in rows to force virtualization on  */
  var virtualizationThreshold: js.UndefOr[Double] = js.undefined
}
object IGridOptions {
  
  @scala.inline
  def apply(): IGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGridOptions]
  }
  
  @scala.inline
  implicit class IGridOptionsMutableBuilder[Self <: IGridOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterSelectionChange(value: (/* rowItem */ js.UndefOr[IRow], /* event */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "afterSelectionChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterSelectionChangeUndefined: Self = StObject.set(x, "afterSelectionChange", js.undefined)
    
    @scala.inline
    def setAggregateTemplate(value: String): Self = StObject.set(x, "aggregateTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateTemplateUndefined: Self = StObject.set(x, "aggregateTemplate", js.undefined)
    
    @scala.inline
    def setBeforeSelectionChange(value: (/* rowItem */ js.UndefOr[IRow], /* event */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "beforeSelectionChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeSelectionChangeUndefined: Self = StObject.set(x, "beforeSelectionChange", js.undefined)
    
    @scala.inline
    def setCheckboxCellTemplate(value: String): Self = StObject.set(x, "checkboxCellTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckboxCellTemplateUndefined: Self = StObject.set(x, "checkboxCellTemplate", js.undefined)
    
    @scala.inline
    def setCheckboxHeaderTemplate(value: String): Self = StObject.set(x, "checkboxHeaderTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckboxHeaderTemplateUndefined: Self = StObject.set(x, "checkboxHeaderTemplate", js.undefined)
    
    @scala.inline
    def setColumnDefs(value: js.Array[IColumnDef]): Self = StObject.set(x, "columnDefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnDefsUndefined: Self = StObject.set(x, "columnDefs", js.undefined)
    
    @scala.inline
    def setColumnDefsVarargs(value: IColumnDef*): Self = StObject.set(x, "columnDefs", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataUpdated(value: js.Function): Self = StObject.set(x, "dataUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUpdatedUndefined: Self = StObject.set(x, "dataUpdated", js.undefined)
    
    @scala.inline
    def setEnableCellEdit(value: Boolean): Self = StObject.set(x, "enableCellEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCellEditUndefined: Self = StObject.set(x, "enableCellEdit", js.undefined)
    
    @scala.inline
    def setEnableCellSelection(value: Boolean): Self = StObject.set(x, "enableCellSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCellSelectionUndefined: Self = StObject.set(x, "enableCellSelection", js.undefined)
    
    @scala.inline
    def setEnableColumnHeavyVirt(value: Boolean): Self = StObject.set(x, "enableColumnHeavyVirt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableColumnHeavyVirtUndefined: Self = StObject.set(x, "enableColumnHeavyVirt", js.undefined)
    
    @scala.inline
    def setEnableColumnReordering(value: Boolean): Self = StObject.set(x, "enableColumnReordering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableColumnReorderingUndefined: Self = StObject.set(x, "enableColumnReordering", js.undefined)
    
    @scala.inline
    def setEnableColumnResize(value: Boolean): Self = StObject.set(x, "enableColumnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableColumnResizeUndefined: Self = StObject.set(x, "enableColumnResize", js.undefined)
    
    @scala.inline
    def setEnableHighlighting(value: Boolean): Self = StObject.set(x, "enableHighlighting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableHighlightingUndefined: Self = StObject.set(x, "enableHighlighting", js.undefined)
    
    @scala.inline
    def setEnablePaging(value: Boolean): Self = StObject.set(x, "enablePaging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePagingUndefined: Self = StObject.set(x, "enablePaging", js.undefined)
    
    @scala.inline
    def setEnablePinning(value: Boolean): Self = StObject.set(x, "enablePinning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePinningUndefined: Self = StObject.set(x, "enablePinning", js.undefined)
    
    @scala.inline
    def setEnableRowReordering(value: Boolean): Self = StObject.set(x, "enableRowReordering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableRowReorderingUndefined: Self = StObject.set(x, "enableRowReordering", js.undefined)
    
    @scala.inline
    def setEnableRowSelection(value: Boolean): Self = StObject.set(x, "enableRowSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableRowSelectionUndefined: Self = StObject.set(x, "enableRowSelection", js.undefined)
    
    @scala.inline
    def setEnableSorting(value: Boolean): Self = StObject.set(x, "enableSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSortingUndefined: Self = StObject.set(x, "enableSorting", js.undefined)
    
    @scala.inline
    def setExcludeProperties(value: js.Any): Self = StObject.set(x, "excludeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludePropertiesUndefined: Self = StObject.set(x, "excludeProperties", js.undefined)
    
    @scala.inline
    def setFilterOptions(value: IFilterOptions): Self = StObject.set(x, "filterOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterOptionsUndefined: Self = StObject.set(x, "filterOptions", js.undefined)
    
    @scala.inline
    def setFooterRowHeight(value: Double): Self = StObject.set(x, "footerRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterRowHeightUndefined: Self = StObject.set(x, "footerRowHeight", js.undefined)
    
    @scala.inline
    def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setHeaderRowHeight(value: Double): Self = StObject.set(x, "headerRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRowHeightUndefined: Self = StObject.set(x, "headerRowHeight", js.undefined)
    
    @scala.inline
    def setHeaderRowTemplate(value: String): Self = StObject.set(x, "headerRowTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRowTemplateUndefined: Self = StObject.set(x, "headerRowTemplate", js.undefined)
    
    @scala.inline
    def setI18n(value: String): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
    
    @scala.inline
    def setJqueryUIDraggable(value: Boolean): Self = StObject.set(x, "jqueryUIDraggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJqueryUIDraggableUndefined: Self = StObject.set(x, "jqueryUIDraggable", js.undefined)
    
    @scala.inline
    def setJqueryUITheme(value: Boolean): Self = StObject.set(x, "jqueryUITheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJqueryUIThemeUndefined: Self = StObject.set(x, "jqueryUITheme", js.undefined)
    
    @scala.inline
    def setKeepLastSelected(value: Boolean): Self = StObject.set(x, "keepLastSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepLastSelectedUndefined: Self = StObject.set(x, "keepLastSelected", js.undefined)
    
    @scala.inline
    def setMaintainColumnRatios(value: Boolean): Self = StObject.set(x, "maintainColumnRatios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintainColumnRatiosUndefined: Self = StObject.set(x, "maintainColumnRatios", js.undefined)
    
    @scala.inline
    def setMultiSelect(value: Boolean): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiSelectUndefined: Self = StObject.set(x, "multiSelect", js.undefined)
    
    @scala.inline
    def setPagingOptions(value: IPagingOptions): Self = StObject.set(x, "pagingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagingOptionsUndefined: Self = StObject.set(x, "pagingOptions", js.undefined)
    
    @scala.inline
    def setPinSelectionCheckbox(value: Boolean): Self = StObject.set(x, "pinSelectionCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinSelectionCheckboxUndefined: Self = StObject.set(x, "pinSelectionCheckbox", js.undefined)
    
    @scala.inline
    def setPlugins(value: js.Array[js.Any]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: js.Any*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    
    @scala.inline
    def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    
    @scala.inline
    def setRowTemplate(value: String): Self = StObject.set(x, "rowTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowTemplateUndefined: Self = StObject.set(x, "rowTemplate", js.undefined)
    
    @scala.inline
    def setSelectItem(value: (/* idx */ Double, /* state */ Boolean) => js.Any): Self = StObject.set(x, "selectItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectItemUndefined: Self = StObject.set(x, "selectItem", js.undefined)
    
    @scala.inline
    def setSelectWithCheckboxOnly(value: Boolean): Self = StObject.set(x, "selectWithCheckboxOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectWithCheckboxOnlyUndefined: Self = StObject.set(x, "selectWithCheckboxOnly", js.undefined)
    
    @scala.inline
    def setSelectedItems(value: js.Array[js.Any]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
    
    @scala.inline
    def setSelectedItemsVarargs(value: js.Any*): Self = StObject.set(x, "selectedItems", js.Array(value :_*))
    
    @scala.inline
    def setShowColumnMenu(value: Boolean): Self = StObject.set(x, "showColumnMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowColumnMenuUndefined: Self = StObject.set(x, "showColumnMenu", js.undefined)
    
    @scala.inline
    def setShowFilter(value: Boolean): Self = StObject.set(x, "showFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFilterUndefined: Self = StObject.set(x, "showFilter", js.undefined)
    
    @scala.inline
    def setShowFooter(value: Boolean): Self = StObject.set(x, "showFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFooterUndefined: Self = StObject.set(x, "showFooter", js.undefined)
    
    @scala.inline
    def setShowGroupPanel(value: Boolean): Self = StObject.set(x, "showGroupPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowGroupPanelUndefined: Self = StObject.set(x, "showGroupPanel", js.undefined)
    
    @scala.inline
    def setShowSelectionCheckbox(value: Boolean): Self = StObject.set(x, "showSelectionCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSelectionCheckboxUndefined: Self = StObject.set(x, "showSelectionCheckbox", js.undefined)
    
    @scala.inline
    def setSortInfo(value: js.Any): Self = StObject.set(x, "sortInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortInfoUndefined: Self = StObject.set(x, "sortInfo", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    @scala.inline
    def setUseExternalSorting(value: Boolean): Self = StObject.set(x, "useExternalSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseExternalSortingUndefined: Self = StObject.set(x, "useExternalSorting", js.undefined)
    
    @scala.inline
    def setVirtualizationThreshold(value: Double): Self = StObject.set(x, "virtualizationThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualizationThresholdUndefined: Self = StObject.set(x, "virtualizationThreshold", js.undefined)
  }
}
