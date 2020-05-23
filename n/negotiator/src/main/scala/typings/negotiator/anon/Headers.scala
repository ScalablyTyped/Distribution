package typings.negotiator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headers extends js.Object {
  var headers: typings.negotiator.mod.Headers
}

object Headers {
  @scala.inline
  def apply(headers: typings.negotiator.mod.Headers): Headers = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
}

