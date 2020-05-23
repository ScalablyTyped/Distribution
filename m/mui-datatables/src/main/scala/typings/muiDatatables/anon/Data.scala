package typings.muiDatatables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.Array[_]
  var dataIndex: Double
}

object Data {
  @scala.inline
  def apply(data: js.Array[_], dataIndex: Double): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataIndex = dataIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

