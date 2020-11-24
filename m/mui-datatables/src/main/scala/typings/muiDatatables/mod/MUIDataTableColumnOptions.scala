package typings.muiDatatables.mod

import typings.muiDatatables.anon.DataAny
import typings.muiDatatables.muiDatatablesStrings.asc
import typings.muiDatatables.muiDatatablesStrings.desc
import typings.muiDatatables.muiDatatablesStrings.none
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableColumnOptions extends js.Object {
  
  /**
    * Function that returns a string or React component.
    * Used to display data within all table cells of a given column.
    * The value returned from this function will be used for filtering in the filter dialog.
    * If this isn't need, you may want to consider customBodyRenderLite instead.
    *
    * [Example](https://github.com/gregnb/mui-datatables/blob/master/examples/component/index.js)
    */
  var customBodyRender: js.UndefOr[
    js.Function3[
      /* value */ js.Any, 
      /* tableMeta */ MUIDataTableMeta, 
      /* updateValue */ js.Function1[/* value */ String, Unit], 
      String | ReactNode
    ]
  ] = js.native
  
  /**
    * Similar to and performing better than `customBodyRender`, however with the following caveats:
    * 1. The value returned from this function is not used for filtering, so the filter dialog will use the raw data from the data array.
    * 2. This method only gives you the dataIndex and rowIndex, leaving you to lookup the column value.
    *
    * [Example](https://github.com/gregnb/mui-datatables/blob/master/examples/large-data-set/index.js)
    */
  var customBodyRenderLite: js.UndefOr[js.Function2[/* dataIndex */ Double, /* rowIndex */ Double, String | ReactNode]] = js.native
  
  /**
    * These options only affect the filter chips that display after filter are selected.
    * To modify the filters themselves, see filterOptions.
    */
  var customFilterListOptions: js.UndefOr[MUIDataTableCustomFilterListOptions] = js.native
  
  /** @deprecated use customFilterListOptions.render */
  var customFilterListRender: js.UndefOr[js.Function1[/* value */ js.Any, String]] = js.native
  
  /**
    * Function that returns a string or React component.
    * Used for creating a custom header to a column.
    * This method only affects the display in the table's header, other areas of the table (such as the View Columns popover), will use the column's label.
    */
  var customHeadLabelRender: js.UndefOr[js.Function2[/* dataIndex */ Double, /* rowIndex */ Double, String | ReactNode]] = js.native
  
  /** Function that returns a string or React component. Used as display for column header. */
  var customHeadRender: js.UndefOr[
    js.Function3[
      /* columnMeta */ MUIDataTableCustomHeadRenderer, 
      /* handleToggleColumn */ js.Function1[/* columnIndex */ Double, Unit], 
      /* sortOrder */ MUISortOptions, 
      String | ReactNode
    ]
  ] = js.native
  
  /**
    * Display the column.
    * Possible values:
    * - true: Column is visible and toggleable via the View Columns Popover
    * - false: Column is not visible but can be made so in the View Columns Popover
    * - 'excluded': Column is not visible and not toggleable in the View Column Popover
    *
    * @default true
    */
  var display: js.UndefOr[Display] = js.native
  
  /**
    * Display column in the CSV download file.
    * @default true
    */
  var download: js.UndefOr[Boolean] = js.native
  
  /**
    * Determines if the column can be dragged.
    * The draggableColumns.enabled option must also be true.
    * @default true
    */
  var draggable: js.UndefOr[Boolean] = js.native
  
  /**
    * This denote whether the column has data or not.
    * For use with intentionally empty columns.
    * @default false
    */
  var empty: js.UndefOr[Boolean] = js.native
  
  /**
    * Display column in filter list
    * @default true
    */
  var filter: js.UndefOr[Boolean] = js.native
  
  /**
    * Filter value list.
    *
    * [Example](https://github.com/gregnb/mui-datatables/blob/master/examples/column-filters/index.js)
    */
  var filterList: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * These options affect the filter display and functionality from the filter dialog.
    * To modify the filter chip that display after selecting filters, see customFilterListOptions
    */
  var filterOptions: js.UndefOr[MUIDataTableFilterOptions] = js.native
  
  /**
    * Choice of filtering view. Takes priority over global filterType option.
    * Use 'custom' is you are supplying your own rendering via filterOptions.
    * @default dropdown
    */
  var filterType: js.UndefOr[FilterType] = js.native
  
  /** Display hint icon with string as tooltip on hover. */
  var hint: js.UndefOr[String] = js.native
  
  /**
    * Display column when printing.
    * @default true
    */
  var print: js.UndefOr[Boolean] = js.native
  
  /**
    * Exclude/include column from search results.
    * @default true
    */
  var searchable: js.UndefOr[Boolean] = js.native
  
  /**
    * Is called for each header cell and allows you to return custom props for the header cell based on its data.
    *
    * [Example](https://github.com/gregnb/mui-datatables/blob/master/examples/customize-styling/index.js)
    */
  var setCellHeaderProps: js.UndefOr[js.Function1[/* columnMeta */ MUIDataTableCustomHeadRenderer, js.Object]] = js.native
  
  /**
    * Is called for each cell and allows to you return custom props for this cell based on its data.
    *
    * [Example](https://github.com/gregnb/mui-datatables/blob/master/examples/customize-styling/index.js)
    */
  var setCellProps: js.UndefOr[
    js.Function3[/* cellValue */ String, /* rowIndex */ Double, /* columnIndex */ Double, js.Object]
  ] = js.native
  
  /**
    * Enable/disable sorting on column.
    * @default true
    */
  var sort: js.UndefOr[Boolean] = js.native
  
  /**
    * Custom sort function for the column. Takes in an order string and returns a function that compares the two column values.
    * If this method and options.customSort are both defined, this method will take precedence.
    *
    * [Example](https://github.com/gregnb/mui-datatables/blob/master/examples/column-sort/index.js)
    */
  var sortCompare: js.UndefOr[
    js.Function1[
      /* order */ asc | desc, 
      js.Function2[/* obj1 */ DataAny, /* obj2 */ DataAny, Double]
    ]
  ] = js.native
  
  /**
    * Causes the first click on a column to sort by desc rather than asc.
    *
    * [Example](https://github.com/gregnb/mui-datatables/blob/master/examples/customize-columns/index.js)
    *
    * @default false
    */
  var sortDescFirst: js.UndefOr[Boolean] = js.native
  
  /** @deprecated use `sortOrder` instead */
  var sortDirection: js.UndefOr[asc | desc | none] = js.native
  
  /**
    * Allows for a third click on a column header to undo any sorting on the column.
    *
    * [Example](https://github.com/gregnb/mui-datatables/blob/master/examples/customize-columns/index.js)
    *
    * @default false
    */
  var sortThirdClickReset: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow user to toggle column visibility through 'View Column' list.
    * @default true
    */
  var viewColumns: js.UndefOr[Boolean] = js.native
}
object MUIDataTableColumnOptions {
  
  @scala.inline
  def apply(): MUIDataTableColumnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableColumnOptions]
  }
  
  @scala.inline
  implicit class MUIDataTableColumnOptionsOps[Self <: MUIDataTableColumnOptions] (val x: Self) extends AnyVal {
    
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
    def setCustomBodyRender(
      value: (/* value */ js.Any, /* tableMeta */ MUIDataTableMeta, /* updateValue */ js.Function1[/* value */ String, Unit]) => String | ReactNode
    ): Self = this.set("customBodyRender", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCustomBodyRender: Self = this.set("customBodyRender", js.undefined)
    
    @scala.inline
    def setCustomBodyRenderLite(value: (/* dataIndex */ Double, /* rowIndex */ Double) => String | ReactNode): Self = this.set("customBodyRenderLite", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCustomBodyRenderLite: Self = this.set("customBodyRenderLite", js.undefined)
    
    @scala.inline
    def setCustomFilterListOptions(value: MUIDataTableCustomFilterListOptions): Self = this.set("customFilterListOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomFilterListOptions: Self = this.set("customFilterListOptions", js.undefined)
    
    @scala.inline
    def setCustomFilterListRender(value: /* value */ js.Any => String): Self = this.set("customFilterListRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomFilterListRender: Self = this.set("customFilterListRender", js.undefined)
    
    @scala.inline
    def setCustomHeadLabelRender(value: (/* dataIndex */ Double, /* rowIndex */ Double) => String | ReactNode): Self = this.set("customHeadLabelRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCustomHeadLabelRender: Self = this.set("customHeadLabelRender", js.undefined)
    
    @scala.inline
    def setCustomHeadRender(
      value: (/* columnMeta */ MUIDataTableCustomHeadRenderer, /* handleToggleColumn */ js.Function1[/* columnIndex */ Double, Unit], /* sortOrder */ MUISortOptions) => String | ReactNode
    ): Self = this.set("customHeadRender", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCustomHeadRender: Self = this.set("customHeadRender", js.undefined)
    
    @scala.inline
    def setDisplay(value: Display): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setDownload(value: Boolean): Self = this.set("download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setEmpty(value: Boolean): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    
    @scala.inline
    def setFilter(value: Boolean): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFilterListVarargs(value: String*): Self = this.set("filterList", js.Array(value :_*))
    
    @scala.inline
    def setFilterList(value: js.Array[String]): Self = this.set("filterList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterList: Self = this.set("filterList", js.undefined)
    
    @scala.inline
    def setFilterOptions(value: MUIDataTableFilterOptions): Self = this.set("filterOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterOptions: Self = this.set("filterOptions", js.undefined)
    
    @scala.inline
    def setFilterType(value: FilterType): Self = this.set("filterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterType: Self = this.set("filterType", js.undefined)
    
    @scala.inline
    def setHint(value: String): Self = this.set("hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    
    @scala.inline
    def setPrint(value: Boolean): Self = this.set("print", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrint: Self = this.set("print", js.undefined)
    
    @scala.inline
    def setSearchable(value: Boolean): Self = this.set("searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchable: Self = this.set("searchable", js.undefined)
    
    @scala.inline
    def setSetCellHeaderProps(value: /* columnMeta */ MUIDataTableCustomHeadRenderer => js.Object): Self = this.set("setCellHeaderProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetCellHeaderProps: Self = this.set("setCellHeaderProps", js.undefined)
    
    @scala.inline
    def setSetCellProps(value: (/* cellValue */ String, /* rowIndex */ Double, /* columnIndex */ Double) => js.Object): Self = this.set("setCellProps", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSetCellProps: Self = this.set("setCellProps", js.undefined)
    
    @scala.inline
    def setSort(value: Boolean): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setSortCompare(value: /* order */ asc | desc => js.Function2[/* obj1 */ DataAny, /* obj2 */ DataAny, Double]): Self = this.set("sortCompare", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSortCompare: Self = this.set("sortCompare", js.undefined)
    
    @scala.inline
    def setSortDescFirst(value: Boolean): Self = this.set("sortDescFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortDescFirst: Self = this.set("sortDescFirst", js.undefined)
    
    @scala.inline
    def setSortDirection(value: asc | desc | none): Self = this.set("sortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortDirection: Self = this.set("sortDirection", js.undefined)
    
    @scala.inline
    def setSortThirdClickReset(value: Boolean): Self = this.set("sortThirdClickReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortThirdClickReset: Self = this.set("sortThirdClickReset", js.undefined)
    
    @scala.inline
    def setViewColumns(value: Boolean): Self = this.set("viewColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewColumns: Self = this.set("viewColumns", js.undefined)
  }
}
