package typings.peculiarJsonSchema.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidationEvent extends js.Object {
  var propName: String
  var value: js.Any
}

object IValidationEvent {
  @scala.inline
  def apply(propName: String, value: js.Any): IValidationEvent = {
    val __obj = js.Dynamic.literal(propName = propName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidationEvent]
  }
}

