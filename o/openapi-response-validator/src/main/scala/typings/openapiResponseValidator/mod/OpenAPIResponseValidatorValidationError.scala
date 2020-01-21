package typings.openapiResponseValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIResponseValidatorValidationError extends js.Object {
  var errors: js.UndefOr[js.Array[_]] = js.undefined
  var message: String
}

object OpenAPIResponseValidatorValidationError {
  @scala.inline
  def apply(message: String, errors: js.Array[_] = null): OpenAPIResponseValidatorValidationError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIResponseValidatorValidationError]
  }
}

