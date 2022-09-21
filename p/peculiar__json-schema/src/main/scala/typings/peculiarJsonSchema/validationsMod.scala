package typings.peculiarJsonSchema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationsMod {
  
  @JSImport("@peculiar/json-schema/build/types/validations", "EnumerationValidation")
  @js.native
  open class EnumerationValidation protected ()
    extends typings.peculiarJsonSchema.enumerationMod.EnumerationValidation {
    def this(enumeration: js.Array[String]) = this()
  }
  
  @JSImport("@peculiar/json-schema/build/types/validations", "ExclusiveValidation")
  @js.native
  open class ExclusiveValidation ()
    extends typings.peculiarJsonSchema.exclusiveMod.ExclusiveValidation {
    def this(min: Double) = this()
    def this(min: Double, max: Double) = this()
    def this(min: Unit, max: Double) = this()
  }
  
  @JSImport("@peculiar/json-schema/build/types/validations", "InclusiveValidation")
  @js.native
  open class InclusiveValidation ()
    extends typings.peculiarJsonSchema.inclusiveMod.InclusiveValidation {
    def this(min: Double) = this()
    def this(min: Double, max: Double) = this()
    def this(min: Unit, max: Double) = this()
  }
  
  @JSImport("@peculiar/json-schema/build/types/validations", "LengthValidation")
  @js.native
  open class LengthValidation ()
    extends typings.peculiarJsonSchema.lengthMod.LengthValidation {
    def this(length: Double) = this()
    def this(length: Double, minLength: Double) = this()
    def this(length: Unit, minLength: Double) = this()
    def this(length: Double, minLength: Double, maxLength: Double) = this()
    def this(length: Double, minLength: Unit, maxLength: Double) = this()
    def this(length: Unit, minLength: Double, maxLength: Double) = this()
    def this(length: Unit, minLength: Unit, maxLength: Double) = this()
  }
  
  @JSImport("@peculiar/json-schema/build/types/validations", "PatternValidation")
  @js.native
  open class PatternValidation protected ()
    extends typings.peculiarJsonSchema.patternMod.PatternValidation {
    def this(pattern: String) = this()
    def this(pattern: js.RegExp) = this()
  }
}
