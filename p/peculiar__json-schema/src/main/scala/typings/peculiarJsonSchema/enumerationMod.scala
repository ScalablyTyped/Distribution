package typings.peculiarJsonSchema

import typings.peculiarJsonSchema.typesMod.IValidation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/json-schema/build/types/validations/enumeration", JSImport.Namespace)
@js.native
object enumerationMod extends js.Object {
  @js.native
  class EnumerationValidation protected () extends IValidation {
    def this(enumeration: js.Array[String]) = this()
    var enumeration: js.Any = js.native
    /* CompleteClass */
    override def validate(value: js.Any): Unit = js.native
  }
  
}

