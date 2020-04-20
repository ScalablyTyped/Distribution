package typings.nivoBar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.Array[js.Object]
}

object Data {
  @scala.inline
  def apply(data: js.Array[js.Object]): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

