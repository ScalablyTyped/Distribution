package typings.nextServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorError extends js.Object {
  var error: typings.std.Error
}

object ErrorError {
  @scala.inline
  def apply(error: typings.std.Error): ErrorError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorError]
  }
}

