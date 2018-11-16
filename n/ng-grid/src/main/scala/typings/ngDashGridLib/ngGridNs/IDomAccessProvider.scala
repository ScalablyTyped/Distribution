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

