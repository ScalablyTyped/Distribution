package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError
  extends stdLib.Error {
  var data: js.UndefOr[ErrorHash | js.Any] = js.undefined
  var statusCode: scala.Double
  var `type`: ValidationErrorType
}

object ValidationError {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: java.lang.String,
    statusCode: scala.Double,
    `type`: ValidationErrorType,
    data: ErrorHash | js.Any = null,
    stack: java.lang.String = null
  ): ValidationError = {
    val __obj = js.Dynamic.literal(message = message, name = name, statusCode = statusCode)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ValidationError]
  }
}

