package typings.ngDashGrid.ngGridNs

import typings.angular.angularMod.ICompiledExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectionProvider extends js.Object {
  var ignoreSelectedItemChanges: Boolean = js.native
  var lastClickedRow: js.Any = js.native
  var multi: Boolean = js.native
  @JSName("pKeyParser")
  var pKeyParser_Original: ICompiledExpression = js.native
  var selectedIndex: Double = js.native
  var selectedItems: js.Array[_] = js.native
  def ChangeSelection(rowItem: js.Any, event: js.Any): Unit = js.native
  def getSelection(entity: js.Any): Double = js.native
  def getSelectionIndex(entity: js.Any): Double = js.native
  def pKeyParser(context: js.Any): js.Any = js.native
  def pKeyParser(context: js.Any, locals: js.Any): js.Any = js.native
  def setSelection(rowItem: IRow, isSelected: Boolean): Unit = js.native
  def toggleSelectAll(checkAll: Boolean, bypass: Boolean, selectFiltered: Boolean): Unit = js.native
}

