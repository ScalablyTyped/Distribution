package typings.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISelectionProvider extends StObject {
  
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
  implicit class ISelectionProviderMutableBuilder[Self <: ISelectionProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeSelection(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "ChangeSelection", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetSelection(value: js.Any => Double): Self = StObject.set(x, "getSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSelectionIndex(value: js.Any => Double): Self = StObject.set(x, "getSelectionIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIgnoreSelectedItemChanges(value: Boolean): Self = StObject.set(x, "ignoreSelectedItemChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastClickedRow(value: js.Any): Self = StObject.set(x, "lastClickedRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPKeyParser(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ICompiledExpression */ js.Any
    ): Self = StObject.set(x, "pKeyParser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItems(value: js.Array[_]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemsVarargs(value: js.Any*): Self = StObject.set(x, "selectedItems", js.Array(value :_*))
    
    @scala.inline
    def setSetSelection(value: (IRow, Boolean) => Unit): Self = StObject.set(x, "setSelection", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToggleSelectAll(value: (Boolean, Boolean, Boolean) => Unit): Self = StObject.set(x, "toggleSelectAll", js.Any.fromFunction3(value))
  }
}
