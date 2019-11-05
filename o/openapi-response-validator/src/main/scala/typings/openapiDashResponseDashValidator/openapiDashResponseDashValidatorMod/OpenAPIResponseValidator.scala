package typings.openapiDashResponseDashValidator.openapiDashResponseDashValidatorMod

import typings.openapiDashResponseDashValidator.Anon_Errors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIResponseValidator extends IOpenAPIResponseValidator {
  var errorMapper: js.Any
  var validators: js.Any
  def validateResponse(statusCode: js.Any, response: js.Any): Anon_Errors
}

object OpenAPIResponseValidator {
  @scala.inline
  def apply(errorMapper: js.Any, validateResponse: (js.Any, js.Any) => Anon_Errors, validators: js.Any): OpenAPIResponseValidator = {
    val __obj = js.Dynamic.literal(errorMapper = errorMapper, validateResponse = js.Any.fromFunction2(validateResponse), validators = validators)
  
    __obj.asInstanceOf[OpenAPIResponseValidator]
  }
}

