package typings.muiDatatables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRowIndex extends js.Object {
  var dataIndex: Double
  var rowIndex: Double
}

object AnonRowIndex {
  @scala.inline
  def apply(dataIndex: Double, rowIndex: Double): AnonRowIndex = {
    val __obj = js.Dynamic.literal(dataIndex = dataIndex.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRowIndex]
  }
}

