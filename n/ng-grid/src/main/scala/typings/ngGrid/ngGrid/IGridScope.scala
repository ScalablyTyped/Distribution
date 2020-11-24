package typings.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IScope * / any */ @js.native
trait IGridScope extends js.Object {
  
  def adjustScrollLeft(scrollLeft: Double): Unit = js.native
  
  def adjustScrollTop(scrollTop: Double, force: Boolean): Unit = js.native
  
  var columns: js.Array[_] = js.native
  
  var configGroups: js.Array[_] = js.native
  
  var elementsNeedMeasuring: Boolean = js.native
  
  var enableCellEditOnFocus: Boolean = js.native
  
  var enableCellSelection: Boolean = js.native
  
  var enablePaging: Boolean = js.native
  
  var footer: IFooter = js.native
  
  var footerRowHeight: Double = js.native
  
  var forceSyncScrolling: Boolean = js.native
  
  var gridId: String = js.native
  
  def groupBy(col: IColumn): Unit = js.native
  
  var headerRow: js.Any = js.native
  
  def headerScrollerDim(): js.Any = js.native
  
  var i18n: js.Any = js.native
  
  var jqueryUITheme: js.Any = js.native
  
  var multiSelect: Boolean = js.native
  
  var pagingOptions: IPagingOptions = js.native
  
  def removeGroup(index: Double): Unit = js.native
  
  var renderedColumns: js.Array[_] = js.native
  
  var renderedRows: js.Array[_] = js.native
  
  var rowHeight: Double = js.native
  
  var selectedItems: js.Array[_] = js.native
  
  var selectionProvider: ISelectionProvider = js.native
  
  var showColumnMenu: Boolean = js.native
  
  var showFooter: Boolean = js.native
  
  def showGroupPanel(): js.Any = js.native
  
  var showMenu: Boolean = js.native
  
  var showSelectionCheckbox: Boolean = js.native
  
  def togglePin(col: IColumn): Unit = js.native
  
  def toggleSelectAll(): Unit = js.native
  
  def toggleShowMenu(): Unit = js.native
  
  def topPanelHeight(): Double = js.native
  
  def totalFilteredItemsLength(): Double = js.native
  
  def totalRowWidth(): Double = js.native
  
  def viewportDimHeight(): Double = js.native
}
object IGridScope {
  
  @scala.inline
  def apply(
    adjustScrollLeft: Double => Unit,
    adjustScrollTop: (Double, Boolean) => Unit,
    columns: js.Array[_],
    configGroups: js.Array[_],
    elementsNeedMeasuring: Boolean,
    enableCellEditOnFocus: Boolean,
    enableCellSelection: Boolean,
    enablePaging: Boolean,
    footer: IFooter,
    footerRowHeight: Double,
    forceSyncScrolling: Boolean,
    gridId: String,
    groupBy: IColumn => Unit,
    headerRow: js.Any,
    headerScrollerDim: () => js.Any,
    i18n: js.Any,
    jqueryUITheme: js.Any,
    multiSelect: Boolean,
    pagingOptions: IPagingOptions,
    removeGroup: Double => Unit,
    renderedColumns: js.Array[_],
    renderedRows: js.Array[_],
    rowHeight: Double,
    selectedItems: js.Array[_],
    selectionProvider: ISelectionProvider,
    showColumnMenu: Boolean,
    showFooter: Boolean,
    showGroupPanel: () => js.Any,
    showMenu: Boolean,
    showSelectionCheckbox: Boolean,
    togglePin: IColumn => Unit,
    toggleSelectAll: () => Unit,
    toggleShowMenu: () => Unit,
    topPanelHeight: () => Double,
    totalFilteredItemsLength: () => Double,
    totalRowWidth: () => Double,
    viewportDimHeight: () => Double
  ): IGridScope = {
    val __obj = js.Dynamic.literal(adjustScrollLeft = js.Any.fromFunction1(adjustScrollLeft), adjustScrollTop = js.Any.fromFunction2(adjustScrollTop), columns = columns.asInstanceOf[js.Any], configGroups = configGroups.asInstanceOf[js.Any], elementsNeedMeasuring = elementsNeedMeasuring.asInstanceOf[js.Any], enableCellEditOnFocus = enableCellEditOnFocus.asInstanceOf[js.Any], enableCellSelection = enableCellSelection.asInstanceOf[js.Any], enablePaging = enablePaging.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], footerRowHeight = footerRowHeight.asInstanceOf[js.Any], forceSyncScrolling = forceSyncScrolling.asInstanceOf[js.Any], gridId = gridId.asInstanceOf[js.Any], groupBy = js.Any.fromFunction1(groupBy), headerRow = headerRow.asInstanceOf[js.Any], headerScrollerDim = js.Any.fromFunction0(headerScrollerDim), i18n = i18n.asInstanceOf[js.Any], jqueryUITheme = jqueryUITheme.asInstanceOf[js.Any], multiSelect = multiSelect.asInstanceOf[js.Any], pagingOptions = pagingOptions.asInstanceOf[js.Any], removeGroup = js.Any.fromFunction1(removeGroup), renderedColumns = renderedColumns.asInstanceOf[js.Any], renderedRows = renderedRows.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], selectedItems = selectedItems.asInstanceOf[js.Any], selectionProvider = selectionProvider.asInstanceOf[js.Any], showColumnMenu = showColumnMenu.asInstanceOf[js.Any], showFooter = showFooter.asInstanceOf[js.Any], showGroupPanel = js.Any.fromFunction0(showGroupPanel), showMenu = showMenu.asInstanceOf[js.Any], showSelectionCheckbox = showSelectionCheckbox.asInstanceOf[js.Any], togglePin = js.Any.fromFunction1(togglePin), toggleSelectAll = js.Any.fromFunction0(toggleSelectAll), toggleShowMenu = js.Any.fromFunction0(toggleShowMenu), topPanelHeight = js.Any.fromFunction0(topPanelHeight), totalFilteredItemsLength = js.Any.fromFunction0(totalFilteredItemsLength), totalRowWidth = js.Any.fromFunction0(totalRowWidth), viewportDimHeight = js.Any.fromFunction0(viewportDimHeight))
    __obj.asInstanceOf[IGridScope]
  }
  
  @scala.inline
  implicit class IGridScopeOps[Self <: IGridScope] (val x: Self) extends AnyVal {
    
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
    def setAdjustScrollLeft(value: Double => Unit): Self = this.set("adjustScrollLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAdjustScrollTop(value: (Double, Boolean) => Unit): Self = this.set("adjustScrollTop", js.Any.fromFunction2(value))
    
    @scala.inline
    def setColumnsVarargs(value: js.Any*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[_]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigGroupsVarargs(value: js.Any*): Self = this.set("configGroups", js.Array(value :_*))
    
    @scala.inline
    def setConfigGroups(value: js.Array[_]): Self = this.set("configGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsNeedMeasuring(value: Boolean): Self = this.set("elementsNeedMeasuring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCellEditOnFocus(value: Boolean): Self = this.set("enableCellEditOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCellSelection(value: Boolean): Self = this.set("enableCellSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePaging(value: Boolean): Self = this.set("enablePaging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooter(value: IFooter): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterRowHeight(value: Double): Self = this.set("footerRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceSyncScrolling(value: Boolean): Self = this.set("forceSyncScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridId(value: String): Self = this.set("gridId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupBy(value: IColumn => Unit): Self = this.set("groupBy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderRow(value: js.Any): Self = this.set("headerRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderScrollerDim(value: () => js.Any): Self = this.set("headerScrollerDim", js.Any.fromFunction0(value))
    
    @scala.inline
    def setI18n(value: js.Any): Self = this.set("i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJqueryUITheme(value: js.Any): Self = this.set("jqueryUITheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiSelect(value: Boolean): Self = this.set("multiSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagingOptions(value: IPagingOptions): Self = this.set("pagingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveGroup(value: Double => Unit): Self = this.set("removeGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderedColumnsVarargs(value: js.Any*): Self = this.set("renderedColumns", js.Array(value :_*))
    
    @scala.inline
    def setRenderedColumns(value: js.Array[_]): Self = this.set("renderedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderedRowsVarargs(value: js.Any*): Self = this.set("renderedRows", js.Array(value :_*))
    
    @scala.inline
    def setRenderedRows(value: js.Array[_]): Self = this.set("renderedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemsVarargs(value: js.Any*): Self = this.set("selectedItems", js.Array(value :_*))
    
    @scala.inline
    def setSelectedItems(value: js.Array[_]): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionProvider(value: ISelectionProvider): Self = this.set("selectionProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowColumnMenu(value: Boolean): Self = this.set("showColumnMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFooter(value: Boolean): Self = this.set("showFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowGroupPanel(value: () => js.Any): Self = this.set("showGroupPanel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowMenu(value: Boolean): Self = this.set("showMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSelectionCheckbox(value: Boolean): Self = this.set("showSelectionCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTogglePin(value: IColumn => Unit): Self = this.set("togglePin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggleSelectAll(value: () => Unit): Self = this.set("toggleSelectAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggleShowMenu(value: () => Unit): Self = this.set("toggleShowMenu", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTopPanelHeight(value: () => Double): Self = this.set("topPanelHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTotalFilteredItemsLength(value: () => Double): Self = this.set("totalFilteredItemsLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTotalRowWidth(value: () => Double): Self = this.set("totalRowWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setViewportDimHeight(value: () => Double): Self = this.set("viewportDimHeight", js.Any.fromFunction0(value))
  }
}
