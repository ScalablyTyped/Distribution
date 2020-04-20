package typings.openapiRequestValidator.mod

import typings.openapiTypes.mod.OpenAPI.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOpenAPIRequestValidator extends js.Object {
  def validateRequest(request: Request): js.Any
}

object IOpenAPIRequestValidator {
  @scala.inline
  def apply(validateRequest: Request => js.Any): IOpenAPIRequestValidator = {
    val __obj = js.Dynamic.literal(validateRequest = js.Any.fromFunction1(validateRequest))
    __obj.asInstanceOf[IOpenAPIRequestValidator]
  }
}

