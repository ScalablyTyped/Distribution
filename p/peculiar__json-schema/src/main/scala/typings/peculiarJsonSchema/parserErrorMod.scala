package typings.peculiarJsonSchema

import typings.peculiarJsonSchema.schemaMod.IJsonSchema
import typings.peculiarJsonSchema.transformErrorMod.TransformError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/json-schema/build/types/errors/parser_error", JSImport.Namespace)
@js.native
object parserErrorMod extends js.Object {
  @js.native
  class ParserError protected () extends TransformError {
    def this(schema: IJsonSchema, message: String) = this()
    def this(schema: IJsonSchema, message: String, innerError: Error) = this()
  }
  
}

