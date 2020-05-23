package typings.peculiarJsonSchema

import org.scalablytyped.runtime.StringDictionary
import typings.peculiarJsonSchema.parserErrorMod.ParserError
import typings.peculiarJsonSchema.schemaMod.IJsonSchema
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/json-schema/build/types/errors/key_error", JSImport.Namespace)
@js.native
object keyErrorMod extends js.Object {
  @js.native
  class KeyError protected () extends ParserError {
    def this(schema: IJsonSchema, keys: js.Array[String]) = this()
    def this(schema: IJsonSchema, keys: js.Array[String], errors: IKeyErrors) = this()
    var errors: IKeyErrors = js.native
    var keys: js.Array[String] = js.native
  }
  
  type IKeyErrors = StringDictionary[Error]
}

