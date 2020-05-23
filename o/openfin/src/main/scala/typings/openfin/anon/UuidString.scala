package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UuidString extends js.Object {
  var uuid: String
}

object UuidString {
  @scala.inline
  def apply(uuid: String): UuidString = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UuidString]
  }
}

