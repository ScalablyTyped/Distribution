package typings
package muiDashDatatablesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataIndex extends js.Object {
  var dataIndex: scala.Double
  var rowIndex: scala.Double
}

object Anon_DataIndex {
  @scala.inline
  def apply(dataIndex: scala.Double, rowIndex: scala.Double): Anon_DataIndex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataIndex")(dataIndex)
    __obj.updateDynamic("rowIndex")(rowIndex)
    __obj.asInstanceOf[Anon_DataIndex]
  }
}

