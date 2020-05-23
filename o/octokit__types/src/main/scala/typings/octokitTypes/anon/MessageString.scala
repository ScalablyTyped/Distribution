package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageString extends js.Object {
  var message: String
}

object MessageString {
  @scala.inline
  def apply(message: String): MessageString = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageString]
  }
}

