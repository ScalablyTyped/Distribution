package typings
package ngDashGridLib.ngGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridScope
  extends angularLib.angularMod.angularNs.IRootScopeService {
  var columns: js.Array[_] = js.native
  var configGroups: js.Array[_] = js.native
  var elementsNeedMeasuring: scala.Boolean = js.native
  var enableCellEditOnFocus: scala.Boolean = js.native
  var enableCellSelection: scala.Boolean = js.native
  var enablePaging: scala.Boolean = js.native
  var footer: IFooter = js.native
  var footerRowHeight: scala.Double = js.native
  var forceSyncScrolling: scala.Boolean = js.native
  var gridId: java.lang.String = js.native
  var headerRow: js.Any = js.native
  var i18n: js.Any = js.native
  var jqueryUITheme: js.Any = js.native
  var multiSelect: scala.Boolean = js.native
  var pagingOptions: IPagingOptions = js.native
  var renderedColumns: js.Array[_] = js.native
  var renderedRows: js.Array[_] = js.native
  var rowHeight: scala.Double = js.native
  var selectedItems: js.Array[_] = js.native
  var selectionProvider: ISelectionProvider = js.native
  var showColumnMenu: scala.Boolean = js.native
  var showFooter: scala.Boolean = js.native
  var showMenu: scala.Boolean = js.native
  var showSelectionCheckbox: scala.Boolean = js.native
  def adjustScrollLeft(scrollLeft: scala.Double): scala.Unit = js.native
  def adjustScrollTop(scrollTop: scala.Double, force: scala.Boolean): scala.Unit = js.native
  def groupBy(col: IColumn): scala.Unit = js.native
  def headerScrollerDim(): js.Any = js.native
  def removeGroup(index: scala.Double): scala.Unit = js.native
  def showGroupPanel(): js.Any = js.native
  def togglePin(col: IColumn): scala.Unit = js.native
  def toggleSelectAll(): scala.Unit = js.native
  def toggleShowMenu(): scala.Unit = js.native
  def topPanelHeight(): scala.Double = js.native
  def totalFilteredItemsLength(): scala.Double = js.native
  def totalRowWidth(): scala.Double = js.native
  def viewportDimHeight(): scala.Double = js.native
}

