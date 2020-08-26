package typings.openapiResponseValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOpenAPIResponseValidator extends js.Object {
  def validateResponse(statusCode: String, response: js.Any): Unit | OpenAPIResponseValidatorValidationError = js.native
}

object IOpenAPIResponseValidator {
  @scala.inline
  def apply(validateResponse: (String, js.Any) => Unit | OpenAPIResponseValidatorValidationError): IOpenAPIResponseValidator = {
    val __obj = js.Dynamic.literal(validateResponse = js.Any.fromFunction2(validateResponse))
    __obj.asInstanceOf[IOpenAPIResponseValidator]
  }
  @scala.inline
  implicit class IOpenAPIResponseValidatorOps[Self <: IOpenAPIResponseValidator] (val x: Self) extends AnyVal {
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
    def setValidateResponse(value: (String, js.Any) => Unit | OpenAPIResponseValidatorValidationError): Self = this.set("validateResponse", js.Any.fromFunction2(value))
  }
  
}

