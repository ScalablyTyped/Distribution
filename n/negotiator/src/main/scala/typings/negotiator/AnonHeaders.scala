package typings.negotiator

import typings.negotiator.mod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeaders extends js.Object {
  var headers: Headers
}

object AnonHeaders {
  @scala.inline
  def apply(headers: Headers): AnonHeaders = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeaders]
  }
}

