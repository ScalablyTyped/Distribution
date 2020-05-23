package typings.peculiarJsonSchema.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidation extends js.Object {
  def validate(value: js.Any): Unit
}

object IValidation {
  @scala.inline
  def apply(validate: js.Any => Unit): IValidation = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[IValidation]
  }
}

