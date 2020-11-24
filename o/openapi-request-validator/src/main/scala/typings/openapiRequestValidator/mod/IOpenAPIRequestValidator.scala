package typings.openapiRequestValidator.mod

import typings.openapiTypes.mod.OpenAPI.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOpenAPIRequestValidator extends js.Object {
  
  def validateRequest(request: Request): js.Any = js.native
}
object IOpenAPIRequestValidator {
  
  @scala.inline
  def apply(validateRequest: Request => js.Any): IOpenAPIRequestValidator = {
    val __obj = js.Dynamic.literal(validateRequest = js.Any.fromFunction1(validateRequest))
    __obj.asInstanceOf[IOpenAPIRequestValidator]
  }
  
  @scala.inline
  implicit class IOpenAPIRequestValidatorOps[Self <: IOpenAPIRequestValidator] (val x: Self) extends AnyVal {
    
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
    def setValidateRequest(value: Request => js.Any): Self = this.set("validateRequest", js.Any.fromFunction1(value))
  }
}
