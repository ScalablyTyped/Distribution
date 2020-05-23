package typings.openapiResponseValidator.mod

import typings.openapiResponseValidator.anon.Errors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIResponseValidator extends IOpenAPIResponseValidator {
  var errorMapper: js.Any
  var validators: js.Any
  def validateResponse(statusCode: js.Any, response: js.Any): Errors
}

object OpenAPIResponseValidator {
  @scala.inline
  def apply(errorMapper: js.Any, validateResponse: (js.Any, js.Any) => Errors, validators: js.Any): OpenAPIResponseValidator = {
    val __obj = js.Dynamic.literal(errorMapper = errorMapper.asInstanceOf[js.Any], validateResponse = js.Any.fromFunction2(validateResponse), validators = validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIResponseValidator]
  }
}

