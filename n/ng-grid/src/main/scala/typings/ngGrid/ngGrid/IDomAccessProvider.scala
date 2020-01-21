package typings.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDomAccessProvider extends js.Object {
  var grid: IGridInstance
  var previousColumn: IColumn
  def changeUserSelect(
    elm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any,
    value: String
  ): Unit
  def focusCellElement($scope: IGridScope, index: Double): Unit
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
}

