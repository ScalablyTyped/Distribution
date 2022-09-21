package typings.peculiarJsonSchema

import typings.peculiarJsonSchema.jsonErrorMod.JsonError
import typings.peculiarJsonSchema.schemaMod.IJsonSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformErrorMod {
  
  @JSImport("@peculiar/json-schema/build/types/errors/transform_error", "TransformError")
  @js.native
  open class TransformError protected () extends JsonError {
    def this(schema: IJsonSchema, message: String) = this()
    def this(schema: IJsonSchema, message: String, innerError: js.Error) = this()
    
    var schema: IJsonSchema = js.native
  }
}
