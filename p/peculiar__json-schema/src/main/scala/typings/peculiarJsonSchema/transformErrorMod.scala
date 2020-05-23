package typings.peculiarJsonSchema

import typings.peculiarJsonSchema.jsonErrorMod.JsonError
import typings.peculiarJsonSchema.schemaMod.IJsonSchema
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/json-schema/build/types/errors/transform_error", JSImport.Namespace)
@js.native
object transformErrorMod extends js.Object {
  @js.native
  class TransformError protected () extends JsonError {
    def this(schema: IJsonSchema, message: String) = this()
    def this(schema: IJsonSchema, message: String, innerError: Error) = this()
    var schema: IJsonSchema = js.native
  }
  
}

