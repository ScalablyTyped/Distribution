package typings.peculiarJsonSchema

import typings.peculiarJsonSchema.typesMod.IValidation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patternMod {
  
  @JSImport("@peculiar/json-schema/build/types/validations/pattern", "PatternValidation")
  @js.native
  open class PatternValidation protected ()
    extends StObject
       with IValidation {
    def this(pattern: String) = this()
    def this(pattern: js.RegExp) = this()
    
    /* private */ var pattern: Any = js.native
    
    /* CompleteClass */
    override def validate(value: Any): Unit = js.native
  }
}
