package typings.mongorito.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultState extends js.Object {
  var fields: js.Object
  var unset: js.Array[String]
}

object DefaultState {
  @scala.inline
  def apply(fields: js.Object, unset: js.Array[String]): DefaultState = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], unset = unset.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultState]
  }
}

