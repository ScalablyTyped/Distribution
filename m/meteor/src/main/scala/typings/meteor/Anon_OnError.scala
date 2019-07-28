package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnError extends js.Object {
  var onError: js.UndefOr[js.Function] = js.undefined
}

object Anon_OnError {
  @scala.inline
  def apply(onError: js.Function = null): Anon_OnError = {
    val __obj = js.Dynamic.literal()
    if (onError != null) __obj.updateDynamic("onError")(onError)
    __obj.asInstanceOf[Anon_OnError]
  }
}

