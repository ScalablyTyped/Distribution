package typings.modernizr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputBoolean extends js.Object {
  var autocomplete: Boolean = js.native
  var autofocus: Boolean = js.native
  var list: Boolean = js.native
  var max: Boolean = js.native
  var min: Boolean = js.native
  var multiple: Boolean = js.native
  var pattern: Boolean = js.native
  var placeholder: Boolean = js.native
  var required: Boolean = js.native
  var step: Boolean = js.native
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
  @scala.inline
  implicit class InputBooleanOps[Self <: InputBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutocomplete(value: Boolean): Self = this.set("autocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutofocus(value: Boolean): Self = this.set("autofocus", value.asInstanceOf[js.Any])
    @scala.inline
    def setList(value: Boolean): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Boolean): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Boolean): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def setPattern(value: Boolean): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaceholder(value: Boolean): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def setStep(value: Boolean): Self = this.set("step", value.asInstanceOf[js.Any])
  }
  
}

