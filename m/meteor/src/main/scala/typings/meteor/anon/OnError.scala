package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnError extends js.Object {
  var onError: js.UndefOr[js.Function] = js.undefined
}

object OnError {
  @scala.inline
  def apply(onError: js.Function = null): OnError = {
    val __obj = js.Dynamic.literal()
    if (onError != null) __obj.updateDynamic("onError")(onError.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnError]
  }
}

