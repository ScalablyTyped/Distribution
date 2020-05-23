package typings.peculiarJsonSchema

import typings.peculiarJsonSchema.keyErrorMod.IKeyErrors
import typings.peculiarJsonSchema.schemaMod.IJsonSchema
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/json-schema/build/types/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  @js.native
  class JsonError protected ()
    extends typings.peculiarJsonSchema.jsonErrorMod.JsonError {
    def this(message: String) = this()
    def this(message: String, innerError: Error) = this()
  }
  
  @js.native
  class KeyError protected ()
    extends typings.peculiarJsonSchema.keyErrorMod.KeyError {
    def this(schema: IJsonSchema, keys: js.Array[String]) = this()
    def this(schema: IJsonSchema, keys: js.Array[String], errors: IKeyErrors) = this()
  }
  
  @js.native
  class ParserError protected ()
    extends typings.peculiarJsonSchema.parserErrorMod.ParserError {
    def this(schema: IJsonSchema, message: String) = this()
    def this(schema: IJsonSchema, message: String, innerError: Error) = this()
  }
  
  @js.native
  class SerializerError protected ()
    extends typings.peculiarJsonSchema.serializerErrorMod.SerializerError {
    def this(schemaName: String, message: String) = this()
    def this(schemaName: String, message: String, innerError: Error) = this()
  }
  
  @js.native
  class TransformError protected ()
    extends typings.peculiarJsonSchema.transformErrorMod.TransformError {
    def this(schema: IJsonSchema, message: String) = this()
    def this(schema: IJsonSchema, message: String, innerError: Error) = this()
  }
  
  @js.native
  class ValidationError ()
    extends typings.peculiarJsonSchema.jsonErrorMod.JsonError
  
}

