package typings.openapiSchemaValidator.mod

import typings.openapiTypes.mod.OpenAPI.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOpenAPISchemaValidator extends js.Object {
  
  /**
    * Validate the provided OpenAPI doc against this validator's schema version and
    * return the results.
    */
  def validate(doc: Document): OpenAPISchemaValidatorResult = js.native
}
object IOpenAPISchemaValidator {
  
  @scala.inline
  def apply(validate: Document => OpenAPISchemaValidatorResult): IOpenAPISchemaValidator = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[IOpenAPISchemaValidator]
  }
  
  @scala.inline
  implicit class IOpenAPISchemaValidatorOps[Self <: IOpenAPISchemaValidator] (val x: Self) extends AnyVal {
    
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
    def setValidate(value: Document => OpenAPISchemaValidatorResult): Self = this.set("validate", js.Any.fromFunction1(value))
  }
}
