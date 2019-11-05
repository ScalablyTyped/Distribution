package typings.openapiDashRequestDashValidator.openapiDashRequestDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIRequestValidatorError extends js.Object {
  var errorCode: String
  var location: js.UndefOr[String] = js.undefined
  var message: String
  var path: js.UndefOr[String] = js.undefined
  var schema: js.UndefOr[js.Any] = js.undefined
}

object OpenAPIRequestValidatorError {
  @scala.inline
  def apply(
    errorCode: String,
    message: String,
    location: String = null,
    path: String = null,
    schema: js.Any = null
  ): OpenAPIRequestValidatorError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode, message = message)
    if (location != null) __obj.updateDynamic("location")(location)
    if (path != null) __obj.updateDynamic("path")(path)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[OpenAPIRequestValidatorError]
  }
}

