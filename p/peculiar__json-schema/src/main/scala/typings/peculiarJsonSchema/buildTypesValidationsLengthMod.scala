package typings.peculiarJsonSchema

import typings.peculiarJsonSchema.buildTypesTypesMod.IValidation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesValidationsLengthMod {
  
  @JSImport("@peculiar/json-schema/build/types/validations/length", "LengthValidation")
  @js.native
  open class LengthValidation ()
    extends StObject
       with IValidation {
    def this(length: Double) = this()
    def this(length: Double, minLength: Double) = this()
    def this(length: Unit, minLength: Double) = this()
    def this(length: Double, minLength: Double, maxLength: Double) = this()
    def this(length: Double, minLength: Unit, maxLength: Double) = this()
    def this(length: Unit, minLength: Double, maxLength: Double) = this()
    def this(length: Unit, minLength: Unit, maxLength: Double) = this()
    
    /* private */ var length: Any = js.native
    
    /* private */ var maxLength: Any = js.native
    
    /* private */ var minLength: Any = js.native
    
    /* CompleteClass */
    override def validate(value: Any): Unit = js.native
  }
}
