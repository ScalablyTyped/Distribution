package typings.muiDatatables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: js.Array[_]
  var dataIndex: Double
}

object AnonData {
  @scala.inline
  def apply(data: js.Array[_], dataIndex: Double): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataIndex = dataIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

