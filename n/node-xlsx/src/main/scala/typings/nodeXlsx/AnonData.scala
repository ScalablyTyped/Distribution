package typings.nodeXlsx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: js.Array[js.Array[js.Any]]
  var name: String
}

object AnonData {
  @scala.inline
  def apply(data: js.Array[js.Array[js.Any]], name: String): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

