package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesSelectionInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelection extends js.Object {
  var count: scala.Double = js.native
  var isModal: js.UndefOr[js.Function0[scala.Boolean]] = js.native
  var mode: SelectionMode = js.native
  var setModal: js.UndefOr[js.Function1[/* isModal */ scala.Boolean, scala.Unit]] = js.native
  def canSelectItem(item: IObjectWithKey): scala.Boolean = js.native
  def canSelectItem(item: IObjectWithKey, index: scala.Double): scala.Boolean = js.native
  def getItems(): js.Array[IObjectWithKey] = js.native
  def getSelectedCount(): scala.Double = js.native
  def getSelectedIndices(): js.Array[scala.Double] = js.native
  def getSelection(): js.Array[IObjectWithKey] = js.native
  def isAllSelected(): scala.Boolean = js.native
  def isIndexSelected(index: scala.Double): scala.Boolean = js.native
  def isKeySelected(key: java.lang.String): scala.Boolean = js.native
  def isRangeSelected(fromIndex: scala.Double, count: scala.Double): scala.Boolean = js.native
  def selectToIndex(index: scala.Double): scala.Unit = js.native
  def selectToIndex(index: scala.Double, clearSelection: scala.Boolean): scala.Unit = js.native
  def selectToKey(key: java.lang.String): scala.Unit = js.native
  def selectToKey(key: java.lang.String, clearSelection: scala.Boolean): scala.Unit = js.native
  def setAllSelected(isAllSelected: scala.Boolean): scala.Unit = js.native
  def setChangeEvents(isEnabled: scala.Boolean): scala.Unit = js.native
  def setChangeEvents(isEnabled: scala.Boolean, suppressChange: scala.Boolean): scala.Unit = js.native
  def setIndexSelected(index: scala.Double, isSelected: scala.Boolean, shouldAnchor: scala.Boolean): scala.Unit = js.native
  def setItems(items: js.Array[IObjectWithKey], shouldClear: scala.Boolean): scala.Unit = js.native
  def setKeySelected(key: java.lang.String, isSelected: scala.Boolean, shouldAnchor: scala.Boolean): scala.Unit = js.native
  def toggleAllSelected(): scala.Unit = js.native
  def toggleIndexSelected(index: scala.Double): scala.Unit = js.native
  def toggleKeySelected(key: java.lang.String): scala.Unit = js.native
  def toggleRangeSelected(fromIndex: scala.Double, count: scala.Double): scala.Unit = js.native
}

