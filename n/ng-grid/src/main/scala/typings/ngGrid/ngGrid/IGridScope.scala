package typings.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IScope * / any */ trait IGridScope extends js.Object {
  var columns: js.Array[_]
  var configGroups: js.Array[_]
  var elementsNeedMeasuring: Boolean
  var enableCellEditOnFocus: Boolean
  var enableCellSelection: Boolean
  var enablePaging: Boolean
  var footer: IFooter
  var footerRowHeight: Double
  var forceSyncScrolling: Boolean
  var gridId: String
  var headerRow: js.Any
  var i18n: js.Any
  var jqueryUITheme: js.Any
  var multiSelect: Boolean
  var pagingOptions: IPagingOptions
  var renderedColumns: js.Array[_]
  var renderedRows: js.Array[_]
  var rowHeight: Double
  var selectedItems: js.Array[_]
  var selectionProvider: ISelectionProvider
  var showColumnMenu: Boolean
  var showFooter: Boolean
  var showMenu: Boolean
  var showSelectionCheckbox: Boolean
  def adjustScrollLeft(scrollLeft: Double): Unit
  def adjustScrollTop(scrollTop: Double, force: Boolean): Unit
  def groupBy(col: IColumn): Unit
  def headerScrollerDim(): js.Any
  def removeGroup(index: Double): Unit
  def showGroupPanel(): js.Any
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
}

