package typings.peculiarJsonSchema

import typings.peculiarJsonSchema.keyErrorMod.IKeyErrors
import typings.peculiarJsonSchema.schemaMod.IJsonSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("@peculiar/json-schema/build/types/errors", "JsonError")
  @js.native
  open class JsonError protected ()
    extends typings.peculiarJsonSchema.jsonErrorMod.JsonError {
    def this(message: String) = this()
    def this(message: String, innerError: js.Error) = this()
  }
  
  @JSImport("@peculiar/json-schema/build/types/errors", "KeyError")
  @js.native
  open class KeyError protected ()
    extends typings.peculiarJsonSchema.keyErrorMod.KeyError {
    def this(schema: IJsonSchema, keys: js.Array[String]) = this()
    def this(schema: IJsonSchema, keys: js.Array[String], errors: IKeyErrors) = this()
  }
  
  @JSImport("@peculiar/json-schema/build/types/errors", "ParserError")
  @js.native
  open class ParserError protected ()
    extends typings.peculiarJsonSchema.parserErrorMod.ParserError {
    def this(schema: IJsonSchema, message: String) = this()
    def this(schema: IJsonSchema, message: String, innerError: js.Error) = this()
  }
  
  @JSImport("@peculiar/json-schema/build/types/errors", "SerializerError")
  @js.native
  open class SerializerError protected ()
    extends typings.peculiarJsonSchema.serializerErrorMod.SerializerError {
    def this(schemaName: String, message: String) = this()
    def this(schemaName: String, message: String, innerError: js.Error) = this()
  }
  
  @JSImport("@peculiar/json-schema/build/types/errors", "TransformError")
  @js.native
  open class TransformError protected ()
    extends typings.peculiarJsonSchema.transformErrorMod.TransformError {
    def this(schema: IJsonSchema, message: String) = this()
    def this(schema: IJsonSchema, message: String, innerError: js.Error) = this()
  }
  
  @JSImport("@peculiar/json-schema/build/types/errors", "ValidationError")
  @js.native
  open class ValidationError protected ()
    extends typings.peculiarJsonSchema.validationErrorMod.ValidationError {
    def this(message: String) = this()
    def this(message: String, innerError: js.Error) = this()
  }
}
