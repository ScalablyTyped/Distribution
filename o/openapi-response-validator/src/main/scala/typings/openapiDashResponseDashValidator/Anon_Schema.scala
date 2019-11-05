package typings.openapiDashResponseDashValidator

import typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV2.Schema
import typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3.SchemaObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Schema extends js.Object {
  var schema: Schema | SchemaObject
}

object Anon_Schema {
  @scala.inline
  def apply(schema: Schema | SchemaObject): Anon_Schema = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Schema]
  }
}

