package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var error: js.UndefOr[js.Any] = js.undefined
  var userId: String
}

object AnonError {
  @scala.inline
  def apply(userId: String, error: js.Any = null): AnonError = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError]
  }
}

