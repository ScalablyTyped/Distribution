package typings.openapiResponseValidator

import typings.openapiTypes.mod.OpenAPIV2.Schema
import typings.openapiTypes.mod.OpenAPIV3.SchemaObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSchema extends js.Object {
  var schema: Schema | SchemaObject
}

object AnonSchema {
  @scala.inline
  def apply(schema: Schema | SchemaObject): AnonSchema = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSchema]
  }
}

