package typings.peculiarJsonSchema

import typings.peculiarJsonSchema.buildTypesTypesMod.IValidation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesValidationsEnumerationMod {
  
  @JSImport("@peculiar/json-schema/build/types/validations/enumeration", "EnumerationValidation")
  @js.native
  open class EnumerationValidation protected ()
    extends StObject
       with IValidation {
    def this(enumeration: js.Array[String]) = this()
    
    /* private */ var enumeration: Any = js.native
    
    /* CompleteClass */
    override def validate(value: Any): Unit = js.native
  }
}
