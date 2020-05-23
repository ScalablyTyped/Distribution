package typings.openapiResponseValidator.anon

import typings.openapiTypes.mod.OpenAPIV3.SchemaObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  var schema: typings.openapiTypes.mod.OpenAPIV2.Schema | SchemaObject
}

object Schema {
  @scala.inline
  def apply(schema: typings.openapiTypes.mod.OpenAPIV2.Schema | SchemaObject): Schema = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
}

