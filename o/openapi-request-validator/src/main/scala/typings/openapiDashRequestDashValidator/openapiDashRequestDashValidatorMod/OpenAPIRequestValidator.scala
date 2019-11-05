package typings.openapiDashRequestDashValidator.openapiDashRequestDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIRequestValidator extends IOpenAPIRequestValidator {
  var bodySchema: js.Any
  var errorMapper: js.Any
  var isBodyRequired: js.Any
  var logger: js.Any
  var loggingKey: js.Any
  var requestBody: js.Any
  var requestBodyValidators: js.Any
  var validateBody: js.Any
  var validateFormData: js.Any
  var validateHeaders: js.Any
  var validatePath: js.Any
  var validateQuery: js.Any
  def validate(request: js.Any): Unit
  def validateRequest(request: js.Any): js.Any
}

object OpenAPIRequestValidator {
  @scala.inline
  def apply(
    bodySchema: js.Any,
    errorMapper: js.Any,
    isBodyRequired: js.Any,
    logger: js.Any,
    loggingKey: js.Any,
    requestBody: js.Any,
    requestBodyValidators: js.Any,
    validate: js.Any => Unit,
    validateBody: js.Any,
    validateFormData: js.Any,
    validateHeaders: js.Any,
    validatePath: js.Any,
    validateQuery: js.Any,
    validateRequest: js.Any => js.Any
  ): OpenAPIRequestValidator = {
    val __obj = js.Dynamic.literal(bodySchema = bodySchema, errorMapper = errorMapper, isBodyRequired = isBodyRequired, logger = logger, loggingKey = loggingKey, requestBody = requestBody, requestBodyValidators = requestBodyValidators, validate = js.Any.fromFunction1(validate), validateBody = validateBody, validateFormData = validateFormData, validateHeaders = validateHeaders, validatePath = validatePath, validateQuery = validateQuery, validateRequest = js.Any.fromFunction1(validateRequest))
  
    __obj.asInstanceOf[OpenAPIRequestValidator]
  }
}

