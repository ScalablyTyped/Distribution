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
    afterSelectionChangeCallback: js.Function0[scala.Unit],
    beforeSelectionChangeCallback: js.Function0[scala.Unit],
    enableCellSelection: scala.Boolean,
    enableRowSelection: scala.Boolean,
    jqueryUITheme: scala.Boolean,
    rowClasses: js.Array[java.lang.String],
    rowHeight: scala.Double,
    selectWithCheckboxOnly: scala.Boolean,
    selectedItems: js.Array[_]
  ): IRowConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("afterSelectionChangeCallback")(afterSelectionChangeCallback)
    __obj.updateDynamic("beforeSelectionChangeCallback")(beforeSelectionChangeCallback)
    __obj.updateDynamic("enableCellSelection")(enableCellSelection)
    __obj.updateDynamic("enableRowSelection")(enableRowSelection)
    __obj.updateDynamic("jqueryUITheme")(jqueryUITheme)
    __obj.updateDynamic("rowClasses")(rowClasses)
    __obj.updateDynamic("rowHeight")(rowHeight)
    __obj.updateDynamic("selectWithCheckboxOnly")(selectWithCheckboxOnly)
    __obj.updateDynamic("selectedItems")(selectedItems)
    __obj.asInstanceOf[IRowConfig]
  }
}

