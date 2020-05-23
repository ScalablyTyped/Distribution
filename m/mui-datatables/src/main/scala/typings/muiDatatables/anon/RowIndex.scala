package typings.muiDatatables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowIndex extends js.Object {
  var dataIndex: Double
  var rowIndex: Double
}

object RowIndex {
  @scala.inline
  def apply(dataIndex: Double, rowIndex: Double): RowIndex = {
    val __obj = js.Dynamic.literal(dataIndex = dataIndex.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowIndex]
  }
}

