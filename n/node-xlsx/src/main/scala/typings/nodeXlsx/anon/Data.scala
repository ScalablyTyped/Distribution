package typings.nodeXlsx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.Array[js.Array[js.Any]]
  var name: String
}

object Data {
  @scala.inline
  def apply(data: js.Array[js.Array[js.Any]], name: String): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

