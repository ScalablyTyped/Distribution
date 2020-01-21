package typings.openapiRequestValidator.mod

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
    val __obj = js.Dynamic.literal(bodySchema = bodySchema.asInstanceOf[js.Any], errorMapper = errorMapper.asInstanceOf[js.Any], isBodyRequired = isBodyRequired.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], loggingKey = loggingKey.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], requestBodyValidators = requestBodyValidators.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate), validateBody = validateBody.asInstanceOf[js.Any], validateFormData = validateFormData.asInstanceOf[js.Any], validateHeaders = validateHeaders.asInstanceOf[js.Any], validatePath = validatePath.asInstanceOf[js.Any], validateQuery = validateQuery.asInstanceOf[js.Any], validateRequest = js.Any.fromFunction1(validateRequest))
  
    __obj.asInstanceOf[OpenAPIRequestValidator]
  }
}

