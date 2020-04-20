package typings.openapiResponseValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOpenAPIResponseValidator extends js.Object {
  def validateResponse(statusCode: String, response: js.Any): Unit | OpenAPIResponseValidatorValidationError
}

object IOpenAPIResponseValidator {
  @scala.inline
  def apply(validateResponse: (String, js.Any) => Unit | OpenAPIResponseValidatorValidationError): IOpenAPIResponseValidator = {
    val __obj = js.Dynamic.literal(validateResponse = js.Any.fromFunction2(validateResponse))
    __obj.asInstanceOf[IOpenAPIResponseValidator]
  }
}

