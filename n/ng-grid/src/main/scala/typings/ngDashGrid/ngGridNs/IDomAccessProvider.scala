package typings.ngDashGrid.ngGridNs

import typings.angular.angularMod.IAugmentedJQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDomAccessProvider extends js.Object {
  var grid: IGridInstance
  var previousColumn: IColumn
  def changeUserSelect(elm: IAugmentedJQuery, value: String): Unit
  def focusCellElement($scope: IGridScope, index: Double): Unit
  def selectionHandlers($scope: IGridScope, elm: IAugmentedJQuery): Unit
}

object IDomAccessProvider {
  @scala.inline
  def apply(
    changeUserSelect: (IAugmentedJQuery, String) => Unit,
    focusCellElement: (IGridScope, Double) => Unit,
    grid: IGridInstance,
    previousColumn: IColumn,
    selectionHandlers: (IGridScope, IAugmentedJQuery) => Unit
  ): IDomAccessProvider = {
    val __obj = js.Dynamic.literal(changeUserSelect = js.Any.fromFunction2(changeUserSelect), focusCellElement = js.Any.fromFunction2(focusCellElement), grid = grid, previousColumn = previousColumn, selectionHandlers = js.Any.fromFunction2(selectionHandlers))
  
    __obj.asInstanceOf[IDomAccessProvider]
  }
}

