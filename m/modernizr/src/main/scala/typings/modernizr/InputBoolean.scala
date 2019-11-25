package typings.modernizr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputBoolean extends js.Object {
  var autocomplete: Boolean
  var autofocus: Boolean
  var list: Boolean
  var max: Boolean
  var min: Boolean
  var multiple: Boolean
  var pattern: Boolean
  var placeholder: Boolean
  var required: Boolean
  var step: Boolean
}

object InputBoolean {
  @scala.inline
  def apply(
    autocomplete: Boolean,
    autofocus: Boolean,
    list: Boolean,
    max: Boolean,
    min: Boolean,
    multiple: Boolean,
    pattern: Boolean,
    placeholder: Boolean,
    required: Boolean,
    step: Boolean
  ): InputBoolean = {
    val __obj = js.Dynamic.literal(autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InputBoolean]
  }
}

