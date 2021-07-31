package typings.muiDatatables.mod

import typings.muiDatatables.anon.DataAny
import typings.muiDatatables.muiDatatablesStrings.asc
import typings.muiDatatables.muiDatatablesStrings.desc
import typings.muiDatatables.muiDatatablesStrings.none
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableColumnOptions extends StObject {
  
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
  ] = js.undefined
  
  /**
    * Similar to and performing better than `customBodyRender`, however with the following caveats:
    * 1. The value returned from this function is not used for filtering, so the filter dialog will use the raw data from the data array.
    * 2. This method only gives you the dataIndex and rowIndex, leaving you to lookup the column value.
    *
    * [Example](https://github.com/gregnb/mui-datatables/blob/master/examples/large-data-set/index.js)
    */
  var customBodyRenderLite: js.UndefOr[js.Function2[/* dataIndex */ Double, /* rowIndex */ Double, String | ReactNode]] = js.undefined
  
  /**
    * These options only affect the filter chips that display after filter are selected.
    * To modify the filters themselves, see filterOptions.
    */
  var customFilterListOptions: js.UndefOr[MUIDataTableCustomFilterListOptions] = js.undefined
  
  /** @deprecated use customFilterListOptions.render */
  var customFilterListRender: js.UndefOr[js.Function1[/* value */ js.Any, String]] = js.undefined
  
  /**
    * Function that returns a string or React component.
    * Used for creating a custom header to a column.
    * This method only affects the display in the table's header, other areas of the table (such as the View Columns popover), will use the column's label.
    */
  var customHeadLabelRender: js.UndefOr[js.Function2[/* dataIndex */ Double, /* rowIndex */ Double, String | ReactNode]] = js.undefined
  
  /** Function that returns a string or React component. Used as display for column header. */
  var customHeadRender: js.UndefOr[
    js.Function3[
      /* columnMeta */ MUIDataTableCustomHeadRenderer, 
      /* handleToggleColumn */ js.Function1[/* columnIndex */ Double, Unit], 
      /* sortOrder */ MUISortOptions, 
      String | ReactNode
    ]
  ] = js.undefined
  
  /**
    * Display the column.
    * Possible values:
    * - true: Column is visible and toggleable via the View Columns Popover
    * - false: Column is not visible but can be made so in the View Columns Popover
    * - 'excluded': Column is not visible and not toggleable in the View Column Popover
    *
    * @default true
    */
  var display: js.UndefOr[Display] = js.undefined
  
  /**
    * Display column in the CSV download file.
    * @default true
    */
  var download: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines if the column can be dragged.
    * The draggableColumns.enabled option must also be true.
    * @default true
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This denote whether the column has data or not.
    * For use with intentionally empty columns.
    * @default false
    */
  var empty: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Display column in filter list
    * @default true
    */
  var filter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Filter value list.
    *
    * [Example](https://github.com/gregnb/mui-datatables/blob/master/examples/column-filters/index.js)
    */
  var filterList: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * These options affect the filter display and functionality from the filter dialog.
    * To modify the filter chip that display after selecting filters, see customFilterListOptions
    */
  var filterOptions: js.UndefOr[MUIDataTableFilterOptions] = js.undefined
  
  /**
    * Choice of filtering view. Takes priority over global filterType option.
    * Use 'custom' is you are supplying your own rendering via filterOptions.
    * @default dropdown
    */
  var filterType: js.UndefOr[FilterType] = js.undefined
  
  /** Display hint icon with string as tooltip on hover. */
  var hint: js.UndefOr[String] = js.undefined
  
  /**
    * Display column when printing.
    * @default true
    */
  var print: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Exclude/include column from search results.
    * @default true
    */
  var searchable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Is called for each header cell and allows you to return custom props for the header cell based on its data.
    *
    * [Example](https://github.com/gregnb/mui-datatables/blob/master/examples/customize-styling/index.js)
    */
  var setCellHeaderProps: js.UndefOr[js.Function1[/* columnMeta */ MUIDataTableCustomHeadRenderer, js.Object]] = js.undefined
  
  /**
    * Is called for each cell and allows to you return custom props for this cell based on its data.
    *
    * [Example](https://github.com/gregnb/mui-datatables/blob/master/examples/customize-styling/index.js)
    */
  var setCellProps: js.UndefOr[
    js.Function3[/* cellValue */ String, /* rowIndex */ Double, /* columnIndex */ Double, js.Object]
  ] = js.undefined
  
  /**
    * Enable/disable sorting on column.
    * @default true
    */
  var sort: js.UndefOr[Boolean] = js.undefined
  
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
  ] = js.undefined
  
  /**
    * Causes the first click on a column to sort by desc rather than asc.
    *
    * [Example](https://github.com/gregnb/mui-datatables/blob/master/examples/customize-columns/index.js)
    *
    * @default false
    */
  var sortDescFirst: js.UndefOr[Boolean] = js.undefined
  
  /** @deprecated use `sortOrder` instead */
  var sortDirection: js.UndefOr[asc | desc | none] = js.undefined
  
  /**
    * Allows for a third click on a column header to undo any sorting on the column.
    *
    * [Example](https://github.com/gregnb/mui-datatables/blob/master/examples/customize-columns/index.js)
    *
    * @default false
    */
  var sortThirdClickReset: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allow user to toggle column visibility through 'View Column' list.
    * @default true
    */
  var viewColumns: js.UndefOr[Boolean] = js.undefined
}
object MUIDataTableColumnOptions {
  
  @scala.inline
  def apply(): MUIDataTableColumnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableColumnOptions]
  }
  
  @scala.inline
  implicit class MUIDataTableColumnOptionsMutableBuilder[Self <: MUIDataTableColumnOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomBodyRender(
      value: (/* value */ js.Any, /* tableMeta */ MUIDataTableMeta, /* updateValue */ js.Function1[/* value */ String, Unit]) => String | ReactNode
    ): Self = StObject.set(x, "customBodyRender", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCustomBodyRenderLite(value: (/* dataIndex */ Double, /* rowIndex */ Double) => String | ReactNode): Self = StObject.set(x, "customBodyRenderLite", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCustomBodyRenderLiteUndefined: Self = StObject.set(x, "customBodyRenderLite", js.undefined)
    
    @scala.inline
    def setCustomBodyRenderUndefined: Self = StObject.set(x, "customBodyRender", js.undefined)
    
    @scala.inline
    def setCustomFilterListOptions(value: MUIDataTableCustomFilterListOptions): Self = StObject.set(x, "customFilterListOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFilterListOptionsUndefined: Self = StObject.set(x, "customFilterListOptions", js.undefined)
    
    @scala.inline
    def setCustomFilterListRender(value: /* value */ js.Any => String): Self = StObject.set(x, "customFilterListRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomFilterListRenderUndefined: Self = StObject.set(x, "customFilterListRender", js.undefined)
    
    @scala.inline
    def setCustomHeadLabelRender(value: (/* dataIndex */ Double, /* rowIndex */ Double) => String | ReactNode): Self = StObject.set(x, "customHeadLabelRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCustomHeadLabelRenderUndefined: Self = StObject.set(x, "customHeadLabelRender", js.undefined)
    
    @scala.inline
    def setCustomHeadRender(
      value: (/* columnMeta */ MUIDataTableCustomHeadRenderer, /* handleToggleColumn */ js.Function1[/* columnIndex */ Double, Unit], /* sortOrder */ MUISortOptions) => String | ReactNode
    ): Self = StObject.set(x, "customHeadRender", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCustomHeadRenderUndefined: Self = StObject.set(x, "customHeadRender", js.undefined)
    
    @scala.inline
    def setDisplay(value: Display): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setDownload(value: Boolean): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    @scala.inline
    def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterList(value: js.Array[String]): Self = StObject.set(x, "filterList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterListUndefined: Self = StObject.set(x, "filterList", js.undefined)
    
    @scala.inline
    def setFilterListVarargs(value: String*): Self = StObject.set(x, "filterList", js.Array(value :_*))
    
    @scala.inline
    def setFilterOptions(value: MUIDataTableFilterOptions): Self = StObject.set(x, "filterOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterOptionsUndefined: Self = StObject.set(x, "filterOptions", js.undefined)
    
    @scala.inline
    def setFilterType(value: FilterType): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    @scala.inline
    def setPrint(value: Boolean): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
    
    @scala.inline
    def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
    
    @scala.inline
    def setSetCellHeaderProps(value: /* columnMeta */ MUIDataTableCustomHeadRenderer => js.Object): Self = StObject.set(x, "setCellHeaderProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCellHeaderPropsUndefined: Self = StObject.set(x, "setCellHeaderProps", js.undefined)
    
    @scala.inline
    def setSetCellProps(value: (/* cellValue */ String, /* rowIndex */ Double, /* columnIndex */ Double) => js.Object): Self = StObject.set(x, "setCellProps", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetCellPropsUndefined: Self = StObject.set(x, "setCellProps", js.undefined)
    
    @scala.inline
    def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortCompare(value: /* order */ asc | desc => js.Function2[/* obj1 */ DataAny, /* obj2 */ DataAny, Double]): Self = StObject.set(x, "sortCompare", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSortCompareUndefined: Self = StObject.set(x, "sortCompare", js.undefined)
    
    @scala.inline
    def setSortDescFirst(value: Boolean): Self = StObject.set(x, "sortDescFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortDescFirstUndefined: Self = StObject.set(x, "sortDescFirst", js.undefined)
    
    @scala.inline
    def setSortDirection(value: asc | desc | none): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortDirectionUndefined: Self = StObject.set(x, "sortDirection", js.undefined)
    
    @scala.inline
    def setSortThirdClickReset(value: Boolean): Self = StObject.set(x, "sortThirdClickReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortThirdClickResetUndefined: Self = StObject.set(x, "sortThirdClickReset", js.undefined)
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setViewColumns(value: Boolean): Self = StObject.set(x, "viewColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewColumnsUndefined: Self = StObject.set(x, "viewColumns", js.undefined)
  }
}
