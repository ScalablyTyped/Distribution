package typings.peculiarJsonSchema

import typings.peculiarJsonSchema.buildTypesErrorsJsonErrorMod.JsonError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesErrorsValidationErrorMod {
  
  @JSImport("@peculiar/json-schema/build/types/errors/validation_error", "ValidationError")
  @js.native
  open class ValidationError protected () extends JsonError {
    def this(message: String) = this()
    def this(message: String, innerError: js.Error) = this()
  }
}
