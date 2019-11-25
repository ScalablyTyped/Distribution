package typings.openapiDashResponseDashValidator.openapiDashResponseDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIResponseValidatorError extends js.Object {
  var errorCode: String
  var message: String
  var path: js.UndefOr[String] = js.undefined
}

object OpenAPIResponseValidatorError {
  @scala.inline
  def apply(errorCode: String, message: String, path: String = null): OpenAPIResponseValidatorError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIResponseValidatorError]
  }
}

