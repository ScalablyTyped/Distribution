package typings
package ngDashGridLib.ngGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDomAccessProvider extends js.Object {
  var grid: IGridInstance
  var previousColumn: IColumn
  def changeUserSelect(elm: angularLib.angularMod.angularNs.IAugmentedJQuery, value: java.lang.String): scala.Unit
  def focusCellElement($scope: IGridScope, index: scala.Double): scala.Unit
  def selectionHandlers($scope: IGridScope, elm: angularLib.angularMod.angularNs.IAugmentedJQuery): scala.Unit
}

object IDomAccessProvider {
  @scala.inline
  def apply(
    changeUserSelect: js.Function2[angularLib.angularMod.angularNs.IAugmentedJQuery, java.lang.String, scala.Unit],
    focusCellElement: js.Function2[IGridScope, scala.Double, scala.Unit],
    grid: IGridInstance,
    previousColumn: IColumn,
    selectionHandlers: js.Function2[IGridScope, angularLib.angularMod.angularNs.IAugmentedJQuery, scala.Unit]
  ): IDomAccessProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeUserSelect")(changeUserSelect)
    __obj.updateDynamic("focusCellElement")(focusCellElement)
    __obj.updateDynamic("grid")(grid)
    __obj.updateDynamic("previousColumn")(previousColumn)
    __obj.updateDynamic("selectionHandlers")(selectionHandlers)
    __obj.asInstanceOf[IDomAccessProvider]
  }
}

