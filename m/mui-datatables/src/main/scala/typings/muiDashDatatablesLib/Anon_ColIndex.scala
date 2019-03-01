package typings
package muiDashDatatablesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColIndex extends js.Object {
  var colIndex: scala.Double
  var dataIndex: scala.Double
  var rowIndex: scala.Double
}

object Anon_ColIndex {
  @scala.inline
  def apply(colIndex: scala.Double, dataIndex: scala.Double, rowIndex: scala.Double): Anon_ColIndex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("colIndex")(colIndex)
    __obj.updateDynamic("dataIndex")(dataIndex)
    __obj.updateDynamic("rowIndex")(rowIndex)
    __obj.asInstanceOf[Anon_ColIndex]
  }
}

