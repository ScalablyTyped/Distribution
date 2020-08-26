package typings.openapiResponseValidator.mod

import typings.openapiResponseValidator.anon.Errors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenAPIResponseValidator extends IOpenAPIResponseValidator {
  var errorMapper: js.Any = js.native
  var validators: js.Any = js.native
  def validateResponse(statusCode: js.Any, response: js.Any): Errors = js.native
}

object OpenAPIResponseValidator {
  @scala.inline
  def apply(errorMapper: js.Any, validateResponse: (js.Any, js.Any) => Errors, validators: js.Any): OpenAPIResponseValidator = {
    val __obj = js.Dynamic.literal(errorMapper = errorMapper.asInstanceOf[js.Any], validateResponse = js.Any.fromFunction2(validateResponse), validators = validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIResponseValidator]
  }
  @scala.inline
  implicit class OpenAPIResponseValidatorOps[Self <: OpenAPIResponseValidator] (val x: Self) extends AnyVal {
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
    def setErrorMapper(value: js.Any): Self = this.set("errorMapper", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidateResponse(value: (js.Any, js.Any) => Errors): Self = this.set("validateResponse", js.Any.fromFunction2(value))
    @scala.inline
    def setValidators(value: js.Any): Self = this.set("validators", value.asInstanceOf[js.Any])
  }
  
}

