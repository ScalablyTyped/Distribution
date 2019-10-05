package typings.ngDashGrid.ngGrid

import typings.angular.angularMod.IRootScopeService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridScope extends IRootScopeService {
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
  var headerRow: js.Any = js.native
  var i18n: js.Any = js.native
  var jqueryUITheme: js.Any = js.native
  var multiSelect: Boolean = js.native
  var pagingOptions: IPagingOptions = js.native
  var renderedColumns: js.Array[_] = js.native
  var renderedRows: js.Array[_] = js.native
  var rowHeight: Double = js.native
  var selectedItems: js.Array[_] = js.native
  var selectionProvider: ISelectionProvider = js.native
  var showColumnMenu: Boolean = js.native
  var showFooter: Boolean = js.native
  var showMenu: Boolean = js.native
  var showSelectionCheckbox: Boolean = js.native
  def adjustScrollLeft(scrollLeft: Double): Unit = js.native
  def adjustScrollTop(scrollTop: Double, force: Boolean): Unit = js.native
  def groupBy(col: IColumn): Unit = js.native
  def headerScrollerDim(): js.Any = js.native
  def removeGroup(index: Double): Unit = js.native
  def showGroupPanel(): js.Any = js.native
  def togglePin(col: IColumn): Unit = js.native
  def toggleSelectAll(): Unit = js.native
  def toggleShowMenu(): Unit = js.native
  def topPanelHeight(): Double = js.native
  def totalFilteredItemsLength(): Double = js.native
  def totalRowWidth(): Double = js.native
  def viewportDimHeight(): Double = js.native
}

