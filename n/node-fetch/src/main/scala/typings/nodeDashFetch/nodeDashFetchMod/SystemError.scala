package typings.nodeDashFetch.nodeDashFetchMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemError extends Error {
  var code: js.UndefOr[String] = js.undefined
}

object SystemError {
  @scala.inline
  def apply(message: String, name: String, code: String = null, stack: String = null): SystemError = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (code != null) __obj.updateDynamic("code")(code)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[SystemError]
  }
}

