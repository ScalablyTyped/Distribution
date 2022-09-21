package typings.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDomAccessProvider extends StObject {
  
  def changeUserSelect(
    elm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any,
    value: String
  ): Unit
  
  def focusCellElement($scope: IGridScope, index: Double): Unit
  
  var grid: IGridInstance
  
  var previousColumn: IColumn
  
  def selectionHandlers(
    $scope: IGridScope,
    elm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any
  ): Unit
}
object IDomAccessProvider {
  
  inline def apply(
    changeUserSelect: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any, String) => Unit,
    focusCellElement: (IGridScope, Double) => Unit,
    grid: IGridInstance,
    previousColumn: IColumn,
    selectionHandlers: (IGridScope, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any) => Unit
  ): IDomAccessProvider = {
    val __obj = js.Dynamic.literal(changeUserSelect = js.Any.fromFunction2(changeUserSelect), focusCellElement = js.Any.fromFunction2(focusCellElement), grid = grid.asInstanceOf[js.Any], previousColumn = previousColumn.asInstanceOf[js.Any], selectionHandlers = js.Any.fromFunction2(selectionHandlers))
    __obj.asInstanceOf[IDomAccessProvider]
  }
  
  extension [Self <: IDomAccessProvider](x: Self) {
    
    inline def setChangeUserSelect(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any, String) => Unit
    ): Self = StObject.set(x, "changeUserSelect", js.Any.fromFunction2(value))
    
    inline def setFocusCellElement(value: (IGridScope, Double) => Unit): Self = StObject.set(x, "focusCellElement", js.Any.fromFunction2(value))
    
    inline def setGrid(value: IGridInstance): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setPreviousColumn(value: IColumn): Self = StObject.set(x, "previousColumn", value.asInstanceOf[js.Any])
    
    inline def setSelectionHandlers(
      value: (IGridScope, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any) => Unit
    ): Self = StObject.set(x, "selectionHandlers", js.Any.fromFunction2(value))
  }
}
