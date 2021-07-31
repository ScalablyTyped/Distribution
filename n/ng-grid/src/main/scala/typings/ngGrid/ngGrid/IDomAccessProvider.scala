package typings.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDomAccessProvider extends StObject {
  
  def changeUserSelect(
    elm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any,
    value: String
  ): Unit
  
  def focusCellElement($scope: IGridScope, index: Double): Unit
  
  var grid: IGridInstance
  
  var previousColumn: IColumn
  
  def selectionHandlers(
    $scope: IGridScope,
    elm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
  ): Unit
}
object IDomAccessProvider {
  
  @scala.inline
  def apply(
    changeUserSelect: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any, String) => Unit,
    focusCellElement: (IGridScope, Double) => Unit,
    grid: IGridInstance,
    previousColumn: IColumn,
    selectionHandlers: (IGridScope, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any) => Unit
  ): IDomAccessProvider = {
    val __obj = js.Dynamic.literal(changeUserSelect = js.Any.fromFunction2(changeUserSelect), focusCellElement = js.Any.fromFunction2(focusCellElement), grid = grid.asInstanceOf[js.Any], previousColumn = previousColumn.asInstanceOf[js.Any], selectionHandlers = js.Any.fromFunction2(selectionHandlers))
    __obj.asInstanceOf[IDomAccessProvider]
  }
  
  @scala.inline
  implicit class IDomAccessProviderMutableBuilder[Self <: IDomAccessProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeUserSelect(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any, String) => Unit
    ): Self = StObject.set(x, "changeUserSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFocusCellElement(value: (IGridScope, Double) => Unit): Self = StObject.set(x, "focusCellElement", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGrid(value: IGridInstance): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousColumn(value: IColumn): Self = StObject.set(x, "previousColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionHandlers(
      value: (IGridScope, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any) => Unit
    ): Self = StObject.set(x, "selectionHandlers", js.Any.fromFunction2(value))
  }
}
