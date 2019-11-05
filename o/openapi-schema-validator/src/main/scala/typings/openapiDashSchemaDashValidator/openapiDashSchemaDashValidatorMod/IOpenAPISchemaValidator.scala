package typings.openapiDashSchemaDashValidator.openapiDashSchemaDashValidatorMod

import typings.openapiDashTypes.openapiDashTypesMod.OpenAPI.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOpenAPISchemaValidator extends js.Object {
  /**
    * Validate the provided OpenAPI doc against this validator's schema version and
    * return the results.
    */
  def validate(doc: Document): OpenAPISchemaValidatorResult
}

object IOpenAPISchemaValidator {
  @scala.inline
  def apply(validate: Document => OpenAPISchemaValidatorResult): IOpenAPISchemaValidator = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
  
    __obj.asInstanceOf[IOpenAPISchemaValidator]
  }
}

