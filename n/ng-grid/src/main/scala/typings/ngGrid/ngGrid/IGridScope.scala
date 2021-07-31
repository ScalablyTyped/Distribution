package typings.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IScope * / any */ trait IGridScope extends StObject {
  
  def adjustScrollLeft(scrollLeft: Double): Unit
  
  def adjustScrollTop(scrollTop: Double, force: Boolean): Unit
  
  var columns: js.Array[js.Any]
  
  var configGroups: js.Array[js.Any]
  
  var elementsNeedMeasuring: Boolean
  
  var enableCellEditOnFocus: Boolean
  
  var enableCellSelection: Boolean
  
  var enablePaging: Boolean
  
  var footer: IFooter
  
  var footerRowHeight: Double
  
  var forceSyncScrolling: Boolean
  
  var gridId: String
  
  def groupBy(col: IColumn): Unit
  
  var headerRow: js.Any
  
  def headerScrollerDim(): js.Any
  
  var i18n: js.Any
  
  var jqueryUITheme: js.Any
  
  var multiSelect: Boolean
  
  var pagingOptions: IPagingOptions
  
  def removeGroup(index: Double): Unit
  
  var renderedColumns: js.Array[js.Any]
  
  var renderedRows: js.Array[js.Any]
  
  var rowHeight: Double
  
  var selectedItems: js.Array[js.Any]
  
  var selectionProvider: ISelectionProvider
  
  var showColumnMenu: Boolean
  
  var showFooter: Boolean
  
  def showGroupPanel(): js.Any
  
  var showMenu: Boolean
  
  var showSelectionCheckbox: Boolean
  
  def togglePin(col: IColumn): Unit
  
  def toggleSelectAll(): Unit
  
  def toggleShowMenu(): Unit
  
  def topPanelHeight(): Double
  
  def totalFilteredItemsLength(): Double
  
  def totalRowWidth(): Double
  
  def viewportDimHeight(): Double
}
object IGridScope {
  
  @scala.inline
  def apply(
    adjustScrollLeft: Double => Unit,
    adjustScrollTop: (Double, Boolean) => Unit,
    columns: js.Array[js.Any],
    configGroups: js.Array[js.Any],
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
    renderedColumns: js.Array[js.Any],
    renderedRows: js.Array[js.Any],
    rowHeight: Double,
    selectedItems: js.Array[js.Any],
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
  implicit class IGridScopeMutableBuilder[Self <: IGridScope] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjustScrollLeft(value: Double => Unit): Self = StObject.set(x, "adjustScrollLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAdjustScrollTop(value: (Double, Boolean) => Unit): Self = StObject.set(x, "adjustScrollTop", js.Any.fromFunction2(value))
    
    @scala.inline
    def setColumns(value: js.Array[js.Any]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: js.Any*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setConfigGroups(value: js.Array[js.Any]): Self = StObject.set(x, "configGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigGroupsVarargs(value: js.Any*): Self = StObject.set(x, "configGroups", js.Array(value :_*))
    
    @scala.inline
    def setElementsNeedMeasuring(value: Boolean): Self = StObject.set(x, "elementsNeedMeasuring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCellEditOnFocus(value: Boolean): Self = StObject.set(x, "enableCellEditOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCellSelection(value: Boolean): Self = StObject.set(x, "enableCellSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePaging(value: Boolean): Self = StObject.set(x, "enablePaging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooter(value: IFooter): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterRowHeight(value: Double): Self = StObject.set(x, "footerRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceSyncScrolling(value: Boolean): Self = StObject.set(x, "forceSyncScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridId(value: String): Self = StObject.set(x, "gridId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupBy(value: IColumn => Unit): Self = StObject.set(x, "groupBy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderRow(value: js.Any): Self = StObject.set(x, "headerRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderScrollerDim(value: () => js.Any): Self = StObject.set(x, "headerScrollerDim", js.Any.fromFunction0(value))
    
    @scala.inline
    def setI18n(value: js.Any): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJqueryUITheme(value: js.Any): Self = StObject.set(x, "jqueryUITheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiSelect(value: Boolean): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagingOptions(value: IPagingOptions): Self = StObject.set(x, "pagingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveGroup(value: Double => Unit): Self = StObject.set(x, "removeGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderedColumns(value: js.Array[js.Any]): Self = StObject.set(x, "renderedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderedColumnsVarargs(value: js.Any*): Self = StObject.set(x, "renderedColumns", js.Array(value :_*))
    
    @scala.inline
    def setRenderedRows(value: js.Array[js.Any]): Self = StObject.set(x, "renderedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderedRowsVarargs(value: js.Any*): Self = StObject.set(x, "renderedRows", js.Array(value :_*))
    
    @scala.inline
    def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItems(value: js.Array[js.Any]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemsVarargs(value: js.Any*): Self = StObject.set(x, "selectedItems", js.Array(value :_*))
    
    @scala.inline
    def setSelectionProvider(value: ISelectionProvider): Self = StObject.set(x, "selectionProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowColumnMenu(value: Boolean): Self = StObject.set(x, "showColumnMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFooter(value: Boolean): Self = StObject.set(x, "showFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowGroupPanel(value: () => js.Any): Self = StObject.set(x, "showGroupPanel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowMenu(value: Boolean): Self = StObject.set(x, "showMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSelectionCheckbox(value: Boolean): Self = StObject.set(x, "showSelectionCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTogglePin(value: IColumn => Unit): Self = StObject.set(x, "togglePin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggleSelectAll(value: () => Unit): Self = StObject.set(x, "toggleSelectAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggleShowMenu(value: () => Unit): Self = StObject.set(x, "toggleShowMenu", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTopPanelHeight(value: () => Double): Self = StObject.set(x, "topPanelHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTotalFilteredItemsLength(value: () => Double): Self = StObject.set(x, "totalFilteredItemsLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTotalRowWidth(value: () => Double): Self = StObject.set(x, "totalRowWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setViewportDimHeight(value: () => Double): Self = StObject.set(x, "viewportDimHeight", js.Any.fromFunction0(value))
  }
}
