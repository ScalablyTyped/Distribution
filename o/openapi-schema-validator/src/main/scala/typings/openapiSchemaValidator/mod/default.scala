package typings.openapiSchemaValidator.mod

import typings.openapiTypes.mod.OpenAPI.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openapi-schema-validator", JSImport.Default)
@js.native
class default protected () extends OpenAPISchemaValidator {
  def this(args: OpenAPISchemaValidatorArgs) = this()
  /* CompleteClass */
  override var validator: js.Any = js.native
  /**
    * Validate the provided OpenAPI doc against this validator's schema version and
    * return the results.
    */
  /* CompleteClass */
  override def validate(doc: Document): OpenAPISchemaValidatorResult = js.native
}

