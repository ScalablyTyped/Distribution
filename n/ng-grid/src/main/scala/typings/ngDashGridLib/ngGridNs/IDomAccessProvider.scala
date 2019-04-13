package typings
package ngDashGridLib.ngGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDomAccessProvider extends js.Object {
  var grid: IGridInstance
  var previousColumn: IColumn
  def changeUserSelect(elm: angularLib.angularMod.IAugmentedJQuery, value: java.lang.String): scala.Unit
  def focusCellElement($scope: IGridScope, index: scala.Double): scala.Unit
  def selectionHandlers($scope: IGridScope, elm: angularLib.angularMod.IAugmentedJQuery): scala.Unit
}

object IDomAccessProvider {
  @scala.inline
  def apply(
    changeUserSelect: (angularLib.angularMod.IAugmentedJQuery, java.lang.String) => scala.Unit,
    focusCellElement: (IGridScope, scala.Double) => scala.Unit,
    grid: IGridInstance,
    previousColumn: IColumn,
    selectionHandlers: (IGridScope, angularLib.angularMod.IAugmentedJQuery) => scala.Unit
  ): IDomAccessProvider = {
    val __obj = js.Dynamic.literal(changeUserSelect = js.Any.fromFunction2(changeUserSelect), focusCellElement = js.Any.fromFunction2(focusCellElement), grid = grid, previousColumn = previousColumn, selectionHandlers = js.Any.fromFunction2(selectionHandlers))
  
    __obj.asInstanceOf[IDomAccessProvider]
  }
}

