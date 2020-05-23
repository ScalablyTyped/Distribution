package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: js.UndefOr[js.Any] = js.undefined
  var userId: String
}

object Error {
  @scala.inline
  def apply(userId: String, error: js.Any = null): Error = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

