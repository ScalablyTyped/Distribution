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

