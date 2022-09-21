package typings.peculiarJsonSchema

import typings.peculiarJsonSchema.schemaMod.IJsonSchema
import typings.peculiarJsonSchema.transformErrorMod.TransformError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserErrorMod {
  
  @JSImport("@peculiar/json-schema/build/types/errors/parser_error", "ParserError")
  @js.native
  open class ParserError protected () extends TransformError {
    def this(schema: IJsonSchema, message: String) = this()
    def this(schema: IJsonSchema, message: String, innerError: js.Error) = this()
  }
}
