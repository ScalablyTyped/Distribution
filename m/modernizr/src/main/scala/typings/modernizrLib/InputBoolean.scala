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
    val __obj = js.Dynamic.literal(autocomplete = autocomplete, autofocus = autofocus, list = list, max = max, min = min, multiple = multiple, pattern = pattern, placeholder = placeholder, required = required, step = step)
  
    __obj.asInstanceOf[InputBoolean]
  }
}

