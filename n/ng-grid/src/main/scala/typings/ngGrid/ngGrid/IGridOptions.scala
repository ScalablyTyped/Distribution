package typings.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGridOptions extends js.Object {
  
  /** Callback for when you want to validate something after selection. */
  var afterSelectionChange: js.UndefOr[
    js.Function2[/* rowItem */ js.UndefOr[IRow], /* event */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** Define an aggregate template to customize the rows when grouped. See github wiki for more details. */
  var aggregateTemplate: js.UndefOr[String] = js.native
  
  /** Callback if you want to inspect something before selection,
    return false if you want to cancel the selection. return true otherwise.
    If you need to wait for an async call to proceed with selection you can
    use rowItem.changeSelection(event) method after returning false initially.
    Note: when shift+ Selecting multiple items in the grid this will only get called
    once and the rowItem will be an array of items that are queued to be selected. */
  var beforeSelectionChange: js.UndefOr[
    js.Function2[/* rowItem */ js.UndefOr[IRow], /* event */ js.UndefOr[js.Any], Boolean]
  ] = js.native
  
  /** checkbox templates. */
  var checkboxCellTemplate: js.UndefOr[String] = js.native
  
  /** checkbox templates. */
  var checkboxHeaderTemplate: js.UndefOr[String] = js.native
  
  /** definitions of columns as an array [], if not defined columns are auto-generated. See github wiki for more details. */
  var columnDefs: js.UndefOr[js.Array[IColumnDef]] = js.native
  
  /** Data being displayed in the grid. This can be either a string of object ID or object reference.
    Using string is preferred, as this turns on change tracking in ng-grid
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /** Data updated callback, fires every time the data is modified from outside the grid. */
  var dataUpdated: js.UndefOr[js.Function] = js.native
  
  /** Enables cell editing. */
  var enableCellEdit: js.UndefOr[Boolean] = js.native
  
  /** Enables cell selection. */
  var enableCellSelection: js.UndefOr[Boolean] = js.native
  
  /** Enable or disable HEAVY column virtualization. This turns off selection checkboxes and column pinning and is designed for spreadsheet-like data. */
  var enableColumnHeavyVirt: js.UndefOr[Boolean] = js.native
  
  /** Enable or disable reordering of columns */
  var enableColumnReordering: js.UndefOr[Boolean] = js.native
  
  /** Enable or disable resizing of columns */
  var enableColumnResize: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables text highlighting in grid by adding the "unselectable" class (See CSS file) */
  var enableHighlighting: js.UndefOr[Boolean] = js.native
  
  /** Enables the server-side paging feature */
  var enablePaging: js.UndefOr[Boolean] = js.native
  
  /** Enable column pinning */
  var enablePinning: js.UndefOr[Boolean] = js.native
  
  /** Enable drag and drop row reordering. Only works in HTML5 compliant browsers. */
  var enableRowReordering: js.UndefOr[Boolean] = js.native
  
  /** To be able to have selectable rows in grid. */
  var enableRowSelection: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables sorting in grid. */
  var enableSorting: js.UndefOr[Boolean] = js.native
  
  /**  string list of properties to exclude when auto-generating columns. */
  var excludeProperties: js.UndefOr[js.Any] = js.native
  
  /** filterOptions -
    filterText: The text bound to the built-in search box.
    useExternalFilter: Bypass internal filtering if you want to roll your own filtering mechanism but want to use builtin search box.
    */
  var filterOptions: js.UndefOr[IFilterOptions] = js.native
  
  /** Defining the height of the footer in pixels. */
  var footerRowHeight: js.UndefOr[Double] = js.native
  
  /** Initial fields to group data by. Array of field names, not displayName. */
  var groups: js.UndefOr[js.Array[String]] = js.native
  
  /** The height of the header row in pixels. */
  var headerRowHeight: js.UndefOr[Double] = js.native
  
  /** Define a header row template for further customization. See github wiki for more details. */
  var headerRowTemplate: js.UndefOr[String] = js.native
  
  /** i18n language support. choose from the installed or included languages, en, fr, sp, etc...*/
  var i18n: js.UndefOr[String] = js.native
  
  /** Enables the use of jquery UI reaggable/droppable plugin. requires jqueryUI to work if enabled.
    Useful if you want drag + drop but your users insist on crappy browsers. */
  var jqueryUIDraggable: js.UndefOr[Boolean] = js.native
  
  /** Enable the use jqueryUIThemes */
  var jqueryUITheme: js.UndefOr[Boolean] = js.native
  
  /** Prevent unselections when in single selection mode. */
  var keepLastSelected: js.UndefOr[Boolean] = js.native
  
  /** Maintains the column widths while resizing.
    Defaults to true when using *'s or undefined widths. Can be ovverriden by setting to false. */
  var maintainColumnRatios: js.UndefOr[Boolean] = js.native
  
  /** Set this to false if you only want one item selected at a time */
  var multiSelect: js.UndefOr[Boolean] = js.native
  
  /**  pagingOptions - */
  var pagingOptions: js.UndefOr[IPagingOptions] = js.native
  
  /** Array of plugin functions to register in ng-grid */
  var pinSelectionCheckbox: js.UndefOr[Boolean] = js.native
  
  /** Array of plugin functions to register in ng-grid */
  var plugins: js.UndefOr[js.Array[_]] = js.native
  
  /** Row height of rows in grid. */
  var rowHeight: js.UndefOr[Double] = js.native
  
  /** Define a row template to customize output. See github wiki for more details. */
  var rowTemplate: js.UndefOr[String] = js.native
  
  /** Select deselect an item by index. */
  var selectItem: js.UndefOr[js.Function2[/* idx */ Double, /* state */ Boolean, _]] = js.native
  
  /** Disable row selections by clicking on the row and only when the checkbox is clicked. */
  var selectWithCheckboxOnly: js.UndefOr[Boolean] = js.native
  
  /** all of the items selected in the grid. In single select mode there will only be one item in the array. */
  var selectedItems: js.UndefOr[js.Array[_]] = js.native
  
  /** Enables menu to choose which columns to display and group by.
    If both showColumnMenu and showFilter are false the menu button will not display.*/
  var showColumnMenu: js.UndefOr[Boolean] = js.native
  
  /** Enables display of the filterbox in the column menu.
    If both showColumnMenu and showFilter are false the menu button will not display.*/
  var showFilter: js.UndefOr[Boolean] = js.native
  
  /** Show or hide the footer alltogether the footer is enabled by default */
  var showFooter: js.UndefOr[Boolean] = js.native
  
  /** Show the dropzone for drag and drop grouping */
  var showGroupPanel: js.UndefOr[Boolean] = js.native
  
  /** Row selection check boxes appear as the first column. */
  var showSelectionCheckbox: js.UndefOr[Boolean] = js.native
  
  /** Define a sortInfo object to specify a default sorting state.
    You can also observe this variable to utilize server-side sorting (see useExternalSorting).
    Syntax is sortinfo: { fields: ['fieldName1',' fieldName2'], direction: 'ASC'/'asc' || 'desc'/'DESC'}*/
  var sortInfo: js.UndefOr[js.Any] = js.native
  
  /** Set the tab index of the Vieport. */
  var tabIndex: js.UndefOr[Double] = js.native
  
  /** Prevents the internal sorting from executing.
    The sortInfo object will be updated with the sorting information so you can handle sorting (see sortInfo)*/
  var useExternalSorting: js.UndefOr[Boolean] = js.native
  
  /** the threshold in rows to force virtualization on  */
  var virtualizationThreshold: js.UndefOr[Double] = js.native
}
object IGridOptions {
  
  @scala.inline
  def apply(): IGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGridOptions]
  }
  
  @scala.inline
  implicit class IGridOptionsOps[Self <: IGridOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAfterSelectionChange(value: (/* rowItem */ js.UndefOr[IRow], /* event */ js.UndefOr[js.Any]) => Unit): Self = this.set("afterSelectionChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAfterSelectionChange: Self = this.set("afterSelectionChange", js.undefined)
    
    @scala.inline
    def setAggregateTemplate(value: String): Self = this.set("aggregateTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregateTemplate: Self = this.set("aggregateTemplate", js.undefined)
    
    @scala.inline
    def setBeforeSelectionChange(value: (/* rowItem */ js.UndefOr[IRow], /* event */ js.UndefOr[js.Any]) => Boolean): Self = this.set("beforeSelectionChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeSelectionChange: Self = this.set("beforeSelectionChange", js.undefined)
    
    @scala.inline
    def setCheckboxCellTemplate(value: String): Self = this.set("checkboxCellTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckboxCellTemplate: Self = this.set("checkboxCellTemplate", js.undefined)
    
    @scala.inline
    def setCheckboxHeaderTemplate(value: String): Self = this.set("checkboxHeaderTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckboxHeaderTemplate: Self = this.set("checkboxHeaderTemplate", js.undefined)
    
    @scala.inline
    def setColumnDefsVarargs(value: IColumnDef*): Self = this.set("columnDefs", js.Array(value :_*))
    
    @scala.inline
    def setColumnDefs(value: js.Array[IColumnDef]): Self = this.set("columnDefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnDefs: Self = this.set("columnDefs", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDataUpdated(value: js.Function): Self = this.set("dataUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataUpdated: Self = this.set("dataUpdated", js.undefined)
    
    @scala.inline
    def setEnableCellEdit(value: Boolean): Self = this.set("enableCellEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCellEdit: Self = this.set("enableCellEdit", js.undefined)
    
    @scala.inline
    def setEnableCellSelection(value: Boolean): Self = this.set("enableCellSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCellSelection: Self = this.set("enableCellSelection", js.undefined)
    
    @scala.inline
    def setEnableColumnHeavyVirt(value: Boolean): Self = this.set("enableColumnHeavyVirt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableColumnHeavyVirt: Self = this.set("enableColumnHeavyVirt", js.undefined)
    
    @scala.inline
    def setEnableColumnReordering(value: Boolean): Self = this.set("enableColumnReordering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableColumnReordering: Self = this.set("enableColumnReordering", js.undefined)
    
    @scala.inline
    def setEnableColumnResize(value: Boolean): Self = this.set("enableColumnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableColumnResize: Self = this.set("enableColumnResize", js.undefined)
    
    @scala.inline
    def setEnableHighlighting(value: Boolean): Self = this.set("enableHighlighting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableHighlighting: Self = this.set("enableHighlighting", js.undefined)
    
    @scala.inline
    def setEnablePaging(value: Boolean): Self = this.set("enablePaging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePaging: Self = this.set("enablePaging", js.undefined)
    
    @scala.inline
    def setEnablePinning(value: Boolean): Self = this.set("enablePinning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePinning: Self = this.set("enablePinning", js.undefined)
    
    @scala.inline
    def setEnableRowReordering(value: Boolean): Self = this.set("enableRowReordering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRowReordering: Self = this.set("enableRowReordering", js.undefined)
    
    @scala.inline
    def setEnableRowSelection(value: Boolean): Self = this.set("enableRowSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRowSelection: Self = this.set("enableRowSelection", js.undefined)
    
    @scala.inline
    def setEnableSorting(value: Boolean): Self = this.set("enableSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSorting: Self = this.set("enableSorting", js.undefined)
    
    @scala.inline
    def setExcludeProperties(value: js.Any): Self = this.set("excludeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeProperties: Self = this.set("excludeProperties", js.undefined)
    
    @scala.inline
    def setFilterOptions(value: IFilterOptions): Self = this.set("filterOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterOptions: Self = this.set("filterOptions", js.undefined)
    
    @scala.inline
    def setFooterRowHeight(value: Double): Self = this.set("footerRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterRowHeight: Self = this.set("footerRowHeight", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    
    @scala.inline
    def setHeaderRowHeight(value: Double): Self = this.set("headerRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderRowHeight: Self = this.set("headerRowHeight", js.undefined)
    
    @scala.inline
    def setHeaderRowTemplate(value: String): Self = this.set("headerRowTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderRowTemplate: Self = this.set("headerRowTemplate", js.undefined)
    
    @scala.inline
    def setI18n(value: String): Self = this.set("i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteI18n: Self = this.set("i18n", js.undefined)
    
    @scala.inline
    def setJqueryUIDraggable(value: Boolean): Self = this.set("jqueryUIDraggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJqueryUIDraggable: Self = this.set("jqueryUIDraggable", js.undefined)
    
    @scala.inline
    def setJqueryUITheme(value: Boolean): Self = this.set("jqueryUITheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJqueryUITheme: Self = this.set("jqueryUITheme", js.undefined)
    
    @scala.inline
    def setKeepLastSelected(value: Boolean): Self = this.set("keepLastSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepLastSelected: Self = this.set("keepLastSelected", js.undefined)
    
    @scala.inline
    def setMaintainColumnRatios(value: Boolean): Self = this.set("maintainColumnRatios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintainColumnRatios: Self = this.set("maintainColumnRatios", js.undefined)
    
    @scala.inline
    def setMultiSelect(value: Boolean): Self = this.set("multiSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiSelect: Self = this.set("multiSelect", js.undefined)
    
    @scala.inline
    def setPagingOptions(value: IPagingOptions): Self = this.set("pagingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagingOptions: Self = this.set("pagingOptions", js.undefined)
    
    @scala.inline
    def setPinSelectionCheckbox(value: Boolean): Self = this.set("pinSelectionCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinSelectionCheckbox: Self = this.set("pinSelectionCheckbox", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: js.Any*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[_]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHeight: Self = this.set("rowHeight", js.undefined)
    
    @scala.inline
    def setRowTemplate(value: String): Self = this.set("rowTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowTemplate: Self = this.set("rowTemplate", js.undefined)
    
    @scala.inline
    def setSelectItem(value: (/* idx */ Double, /* state */ Boolean) => _): Self = this.set("selectItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSelectItem: Self = this.set("selectItem", js.undefined)
    
    @scala.inline
    def setSelectWithCheckboxOnly(value: Boolean): Self = this.set("selectWithCheckboxOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectWithCheckboxOnly: Self = this.set("selectWithCheckboxOnly", js.undefined)
    
    @scala.inline
    def setSelectedItemsVarargs(value: js.Any*): Self = this.set("selectedItems", js.Array(value :_*))
    
    @scala.inline
    def setSelectedItems(value: js.Array[_]): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedItems: Self = this.set("selectedItems", js.undefined)
    
    @scala.inline
    def setShowColumnMenu(value: Boolean): Self = this.set("showColumnMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowColumnMenu: Self = this.set("showColumnMenu", js.undefined)
    
    @scala.inline
    def setShowFilter(value: Boolean): Self = this.set("showFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFilter: Self = this.set("showFilter", js.undefined)
    
    @scala.inline
    def setShowFooter(value: Boolean): Self = this.set("showFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFooter: Self = this.set("showFooter", js.undefined)
    
    @scala.inline
    def setShowGroupPanel(value: Boolean): Self = this.set("showGroupPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowGroupPanel: Self = this.set("showGroupPanel", js.undefined)
    
    @scala.inline
    def setShowSelectionCheckbox(value: Boolean): Self = this.set("showSelectionCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSelectionCheckbox: Self = this.set("showSelectionCheckbox", js.undefined)
    
    @scala.inline
    def setSortInfo(value: js.Any): Self = this.set("sortInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortInfo: Self = this.set("sortInfo", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setUseExternalSorting(value: Boolean): Self = this.set("useExternalSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseExternalSorting: Self = this.set("useExternalSorting", js.undefined)
    
    @scala.inline
    def setVirtualizationThreshold(value: Double): Self = this.set("virtualizationThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualizationThreshold: Self = this.set("virtualizationThreshold", js.undefined)
  }
}
