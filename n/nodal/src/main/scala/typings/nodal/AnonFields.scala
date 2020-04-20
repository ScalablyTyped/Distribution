package typings.nodal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFields extends js.Object {
  var fields: js.Array[_]
  var name: String
}

object AnonFields {
  @scala.inline
  def apply(fields: js.Array[_], name: String): AnonFields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFields]
  }
}

