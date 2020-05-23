package typings.peculiarJsonSchema

import typings.peculiarJsonSchema.typesMod.IValidation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/json-schema/build/types/validations/exclusive", JSImport.Namespace)
@js.native
object exclusiveMod extends js.Object {
  @js.native
  class ExclusiveValidation () extends IValidation {
    def this(min: Double) = this()
    def this(min: Double, max: Double) = this()
    var max: js.Any = js.native
    var min: js.Any = js.native
    /* CompleteClass */
    override def validate(value: js.Any): Unit = js.native
  }
  
}

