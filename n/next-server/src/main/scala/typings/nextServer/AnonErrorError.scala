package typings.nextServer

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorError extends js.Object {
  var error: Error
}

object AnonErrorError {
  @scala.inline
  def apply(error: Error): AnonErrorError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrorError]
  }
}

