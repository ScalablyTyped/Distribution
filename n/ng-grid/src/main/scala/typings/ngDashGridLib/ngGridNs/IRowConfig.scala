package typings
package ngDashGridLib.ngGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowConfig extends js.Object {
  var enableCellSelection: scala.Boolean
  var enableRowSelection: scala.Boolean
  var jqueryUITheme: scala.Boolean
  var rowClasses: js.Array[java.lang.String]
  var rowHeight: scala.Double
  var selectWithCheckboxOnly: scala.Boolean
  var selectedItems: js.Array[_]
  def afterSelectionChangeCallback(): scala.Unit
  def beforeSelectionChangeCallback(): scala.Unit
}

object IRowConfig {
  @scala.inline
  def apply(
    afterSelectionChangeCallback: () => scala.Unit,
    beforeSelectionChangeCallback: () => scala.Unit,
    enableCellSelection: scala.Boolean,
    enableRowSelection: scala.Boolean,
    jqueryUITheme: scala.Boolean,
    rowClasses: js.Array[java.lang.String],
    rowHeight: scala.Double,
    selectWithCheckboxOnly: scala.Boolean,
    selectedItems: js.Array[_]
  ): IRowConfig = {
    val __obj = js.Dynamic.literal(afterSelectionChangeCallback = js.Any.fromFunction0(afterSelectionChangeCallback), beforeSelectionChangeCallback = js.Any.fromFunction0(beforeSelectionChangeCallback), enableCellSelection = enableCellSelection, enableRowSelection = enableRowSelection, jqueryUITheme = jqueryUITheme, rowClasses = rowClasses, rowHeight = rowHeight, selectWithCheckboxOnly = selectWithCheckboxOnly, selectedItems = selectedItems)
  
    __obj.asInstanceOf[IRowConfig]
  }
}

