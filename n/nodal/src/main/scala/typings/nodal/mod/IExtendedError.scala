package typings.nodal.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExtendedError extends Error {
  var details: js.UndefOr[js.Object] = js.undefined
  var notFound: js.UndefOr[Boolean] = js.undefined
}

object IExtendedError {
  @scala.inline
  def apply(
    message: String,
    name: String,
    details: js.Object = null,
    notFound: js.UndefOr[Boolean] = js.undefined,
    stack: String = null
  ): IExtendedError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (!js.isUndefined(notFound)) __obj.updateDynamic("notFound")(notFound.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtendedError]
  }
}

