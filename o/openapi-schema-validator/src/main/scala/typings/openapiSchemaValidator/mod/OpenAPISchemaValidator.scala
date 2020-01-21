package typings.openapiSchemaValidator.mod

import typings.openapiTypes.mod.OpenAPI.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPISchemaValidator extends IOpenAPISchemaValidator {
  var validator: js.Any
}

object OpenAPISchemaValidator {
  @scala.inline
  def apply(validate: Document => OpenAPISchemaValidatorResult, validator: js.Any): OpenAPISchemaValidator = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate), validator = validator.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpenAPISchemaValidator]
  }
}

