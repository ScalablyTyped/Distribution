package typings.nodeSlack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextResponse extends js.Object {
  var text: String
}

object TextResponse {
  @scala.inline
  def apply(text: String): TextResponse = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextResponse]
  }
}

