package typings.peculiarJsonSchema

import typings.peculiarJsonSchema.jsonErrorMod.JsonError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializerErrorMod {
  
  @JSImport("@peculiar/json-schema/build/types/errors/serializer_error", "SerializerError")
  @js.native
  open class SerializerError protected () extends JsonError {
    def this(schemaName: String, message: String) = this()
    def this(schemaName: String, message: String, innerError: js.Error) = this()
    
    var schemaName: String = js.native
  }
}
