package typings.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISelectionProvider extends js.Object {
  
  def ChangeSelection(rowItem: js.Any, event: js.Any): Unit = js.native
  
  def getSelection(entity: js.Any): Double = js.native
  
  def getSelectionIndex(entity: js.Any): Double = js.native
  
  var ignoreSelectedItemChanges: Boolean = js.native
  
  var lastClickedRow: js.Any = js.native
  
  var multi: Boolean = js.native
  
  var pKeyParser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ICompiledExpression */ js.Any = js.native
  
  var selectedIndex: Double = js.native
  
  var selectedItems: js.Array[_] = js.native
  
  def setSelection(rowItem: IRow, isSelected: Boolean): Unit = js.native
  
  def toggleSelectAll(checkAll: Boolean, bypass: Boolean, selectFiltered: Boolean): Unit = js.native
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
  
  @scala.inline
  implicit class ISelectionProviderOps[Self <: ISelectionProvider] (val x: Self) extends AnyVal {
    
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
    def setChangeSelection(value: (js.Any, js.Any) => Unit): Self = this.set("ChangeSelection", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetSelection(value: js.Any => Double): Self = this.set("getSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSelectionIndex(value: js.Any => Double): Self = this.set("getSelectionIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIgnoreSelectedItemChanges(value: Boolean): Self = this.set("ignoreSelectedItemChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastClickedRow(value: js.Any): Self = this.set("lastClickedRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMulti(value: Boolean): Self = this.set("multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPKeyParser(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ICompiledExpression */ js.Any
    ): Self = this.set("pKeyParser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIndex(value: Double): Self = this.set("selectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemsVarargs(value: js.Any*): Self = this.set("selectedItems", js.Array(value :_*))
    
    @scala.inline
    def setSelectedItems(value: js.Array[_]): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetSelection(value: (IRow, Boolean) => Unit): Self = this.set("setSelection", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToggleSelectAll(value: (Boolean, Boolean, Boolean) => Unit): Self = this.set("toggleSelectAll", js.Any.fromFunction3(value))
  }
}
