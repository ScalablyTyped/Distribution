package typings.openapiDashSchemaDashValidator.openapiDashSchemaDashValidatorMod

import typings.ajv.ajvMod.ErrorObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPISchemaValidatorResult extends js.Object {
  var errors: js.Array[ErrorObject]
}

object OpenAPISchemaValidatorResult {
  @scala.inline
  def apply(errors: js.Array[ErrorObject]): OpenAPISchemaValidatorResult = {
    val __obj = js.Dynamic.literal(errors = errors)
  
    __obj.asInstanceOf[OpenAPISchemaValidatorResult]
  }
}

