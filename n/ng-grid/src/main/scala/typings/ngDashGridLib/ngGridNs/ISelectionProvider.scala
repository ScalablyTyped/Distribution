package typings
package ngDashGridLib.ngGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectionProvider extends js.Object {
  var ignoreSelectedItemChanges: scala.Boolean = js.native
  var lastClickedRow: js.Any = js.native
  var multi: scala.Boolean = js.native
  @JSName("pKeyParser")
  var pKeyParser_Original: angularLib.angularMod.ICompiledExpression = js.native
  var selectedIndex: scala.Double = js.native
  var selectedItems: js.Array[_] = js.native
  def ChangeSelection(rowItem: js.Any, event: js.Any): scala.Unit = js.native
  def getSelection(entity: js.Any): scala.Double = js.native
  def getSelectionIndex(entity: js.Any): scala.Double = js.native
  def pKeyParser(context: js.Any): js.Any = js.native
  def pKeyParser(context: js.Any, locals: js.Any): js.Any = js.native
  def setSelection(rowItem: IRow, isSelected: scala.Boolean): scala.Unit = js.native
  def toggleSelectAll(checkAll: scala.Boolean, bypass: scala.Boolean, selectFiltered: scala.Boolean): scala.Unit = js.native
}

