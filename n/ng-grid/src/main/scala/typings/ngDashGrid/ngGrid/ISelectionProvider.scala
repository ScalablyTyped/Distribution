package typings.ngDashGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectionProvider extends js.Object {
  var ignoreSelectedItemChanges: Boolean
  var lastClickedRow: js.Any
  var multi: Boolean
  var pKeyParser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ICompiledExpression */ js.Any
  var selectedIndex: Double
  var selectedItems: js.Array[_]
  def ChangeSelection(rowItem: js.Any, event: js.Any): Unit
  def getSelection(entity: js.Any): Double
  def getSelectionIndex(entity: js.Any): Double
  def setSelection(rowItem: IRow, isSelected: Boolean): Unit
  def toggleSelectAll(checkAll: Boolean, bypass: Boolean, selectFiltered: Boolean): Unit
}

object ISelectionProvider {
  @scala.inline
  def apply(
    ChangeSelection: (js.Any, js.Any) => Unit,
    getSelection: js.Any => Double,
    getSelectionIndex: js.Any => Double,
    ignoreSelectedItemChanges: Boolean,
    lastClickedRow: js.Any,
    multi: Boolean,
    pKeyParser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ICompiledExpression */ js.Any,
    selectedIndex: Double,
    selectedItems: js.Array[_],
    setSelection: (IRow, Boolean) => Unit,
    toggleSelectAll: (Boolean, Boolean, Boolean) => Unit
  ): ISelectionProvider = {
    val __obj = js.Dynamic.literal(ChangeSelection = js.Any.fromFunction2(ChangeSelection), getSelection = js.Any.fromFunction1(getSelection), getSelectionIndex = js.Any.fromFunction1(getSelectionIndex), ignoreSelectedItemChanges = ignoreSelectedItemChanges.asInstanceOf[js.Any], lastClickedRow = lastClickedRow.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any], pKeyParser = pKeyParser.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], selectedItems = selectedItems.asInstanceOf[js.Any], setSelection = js.Any.fromFunction2(setSelection), toggleSelectAll = js.Any.fromFunction3(toggleSelectAll))
  
    __obj.asInstanceOf[ISelectionProvider]
  }
}

