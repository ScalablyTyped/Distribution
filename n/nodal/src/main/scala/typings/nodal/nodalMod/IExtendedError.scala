package typings.nodal.nodalMod

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
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (details != null) __obj.updateDynamic("details")(details)
    if (!js.isUndefined(notFound)) __obj.updateDynamic("notFound")(notFound)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[IExtendedError]
  }
}

