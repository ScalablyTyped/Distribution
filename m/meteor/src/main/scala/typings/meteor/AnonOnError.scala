package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnError extends js.Object {
  var onError: js.UndefOr[js.Function] = js.undefined
}

object AnonOnError {
  @scala.inline
  def apply(onError: js.Function = null): AnonOnError = {
    val __obj = js.Dynamic.literal()
    if (onError != null) __obj.updateDynamic("onError")(onError.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnError]
  }
}

