package typings.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowConfig extends js.Object {
  var enableCellSelection: Boolean
  var enableRowSelection: Boolean
  var jqueryUITheme: Boolean
  var rowClasses: js.Array[String]
  var rowHeight: Double
  var selectWithCheckboxOnly: Boolean
  var selectedItems: js.Array[_]
  def afterSelectionChangeCallback(): Unit
  def beforeSelectionChangeCallback(): Unit
}

object IRowConfig {
  @scala.inline
  def apply(
    afterSelectionChangeCallback: () => Unit,
    beforeSelectionChangeCallback: () => Unit,
    enableCellSelection: Boolean,
    enableRowSelection: Boolean,
    jqueryUITheme: Boolean,
    rowClasses: js.Array[String],
    rowHeight: Double,
    selectWithCheckboxOnly: Boolean,
    selectedItems: js.Array[_]
  ): IRowConfig = {
    val __obj = js.Dynamic.literal(afterSelectionChangeCallback = js.Any.fromFunction0(afterSelectionChangeCallback), beforeSelectionChangeCallback = js.Any.fromFunction0(beforeSelectionChangeCallback), enableCellSelection = enableCellSelection.asInstanceOf[js.Any], enableRowSelection = enableRowSelection.asInstanceOf[js.Any], jqueryUITheme = jqueryUITheme.asInstanceOf[js.Any], rowClasses = rowClasses.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], selectWithCheckboxOnly = selectWithCheckboxOnly.asInstanceOf[js.Any], selectedItems = selectedItems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRowConfig]
  }
}

