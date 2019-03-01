package typings
package modernizrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputBoolean extends js.Object {
  var autocomplete: scala.Boolean
  var autofocus: scala.Boolean
  var list: scala.Boolean
  var max: scala.Boolean
  var min: scala.Boolean
  var multiple: scala.Boolean
  var pattern: scala.Boolean
  var placeholder: scala.Boolean
  var required: scala.Boolean
  var step: scala.Boolean
}

object InputBoolean {
  @scala.inline
  def apply(
    autocomplete: scala.Boolean,
    autofocus: scala.Boolean,
    list: scala.Boolean,
    max: scala.Boolean,
    min: scala.Boolean,
    multiple: scala.Boolean,
    pattern: scala.Boolean,
    placeholder: scala.Boolean,
    required: scala.Boolean,
    step: scala.Boolean
  ): InputBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autocomplete")(autocomplete)
    __obj.updateDynamic("autofocus")(autofocus)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("min")(min)
    __obj.updateDynamic("multiple")(multiple)
    __obj.updateDynamic("pattern")(pattern)
    __obj.updateDynamic("placeholder")(placeholder)
    __obj.updateDynamic("required")(required)
    __obj.updateDynamic("step")(step)
    __obj.asInstanceOf[InputBoolean]
  }
}

