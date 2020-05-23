package typings.peculiarJsonSchema

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/json-schema/build/types/validations", JSImport.Namespace)
@js.native
object validationsMod extends js.Object {
  @js.native
  class EnumerationValidation protected ()
    extends typings.peculiarJsonSchema.enumerationMod.EnumerationValidation {
    def this(enumeration: js.Array[String]) = this()
  }
  
  @js.native
  class ExclusiveValidation ()
    extends typings.peculiarJsonSchema.exclusiveMod.ExclusiveValidation {
    def this(min: Double) = this()
    def this(min: Double, max: Double) = this()
  }
  
  @js.native
  class InclusiveValidation ()
    extends typings.peculiarJsonSchema.inclusiveMod.InclusiveValidation {
    def this(min: Double) = this()
    def this(min: Double, max: Double) = this()
  }
  
  @js.native
  class LengthValidation ()
    extends typings.peculiarJsonSchema.lengthMod.LengthValidation {
    def this(length: Double) = this()
    def this(length: Double, minLength: Double) = this()
    def this(length: Double, minLength: Double, maxLength: Double) = this()
  }
  
  @js.native
  class PatternValidation protected ()
    extends typings.peculiarJsonSchema.patternMod.PatternValidation {
    def this(pattern: String) = this()
    def this(pattern: RegExp) = this()
  }
  
}

