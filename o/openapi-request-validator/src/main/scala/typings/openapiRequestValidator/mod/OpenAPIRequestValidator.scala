package typings.openapiRequestValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenAPIRequestValidator extends IOpenAPIRequestValidator {
  var bodySchema: js.Any = js.native
  var errorMapper: js.Any = js.native
  var isBodyRequired: js.Any = js.native
  var logger: js.Any = js.native
  var loggingKey: js.Any = js.native
  var requestBody: js.Any = js.native
  var requestBodyValidators: js.Any = js.native
  var validateBody: js.Any = js.native
  var validateFormData: js.Any = js.native
  var validateHeaders: js.Any = js.native
  var validatePath: js.Any = js.native
  var validateQuery: js.Any = js.native
  def validate(request: js.Any): Unit = js.native
  def validateRequest(request: js.Any): js.Any = js.native
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
  @scala.inline
  implicit class OpenAPIRequestValidatorOps[Self <: OpenAPIRequestValidator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBodySchema(value: js.Any): Self = this.set("bodySchema", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorMapper(value: js.Any): Self = this.set("errorMapper", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsBodyRequired(value: js.Any): Self = this.set("isBodyRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogger(value: js.Any): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoggingKey(value: js.Any): Self = this.set("loggingKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestBody(value: js.Any): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestBodyValidators(value: js.Any): Self = this.set("requestBodyValidators", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidate(value: js.Any => Unit): Self = this.set("validate", js.Any.fromFunction1(value))
    @scala.inline
    def setValidateBody(value: js.Any): Self = this.set("validateBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidateFormData(value: js.Any): Self = this.set("validateFormData", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidateHeaders(value: js.Any): Self = this.set("validateHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidatePath(value: js.Any): Self = this.set("validatePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidateQuery(value: js.Any): Self = this.set("validateQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidateRequest(value: js.Any => js.Any): Self = this.set("validateRequest", js.Any.fromFunction1(value))
  }
  
}

