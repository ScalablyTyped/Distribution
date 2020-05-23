package typings.peculiarJsonSchema

import typings.peculiarJsonSchema.typesMod.IValidation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/json-schema/build/types/validations/length", JSImport.Namespace)
@js.native
object lengthMod extends js.Object {
  @js.native
  class LengthValidation () extends IValidation {
    def this(length: Double) = this()
    def this(length: Double, minLength: Double) = this()
    def this(length: Double, minLength: Double, maxLength: Double) = this()
    var length: js.UndefOr[js.Any] = js.native
    var maxLength: js.UndefOr[js.Any] = js.native
    var minLength: js.UndefOr[js.Any] = js.native
    /* CompleteClass */
    override def validate(value: js.Any): Unit = js.native
  }
  
}

