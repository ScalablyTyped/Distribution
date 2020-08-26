package typings.nextReactDevOverlay.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorsProps extends js.Object {
  var errors: js.Array[SupportedErrorEvent] = js.native
}

object ErrorsProps {
  @scala.inline
  def apply(errors: js.Array[SupportedErrorEvent]): ErrorsProps = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorsProps]
  }
  @scala.inline
  implicit class ErrorsPropsOps[Self <: ErrorsProps] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: SupportedErrorEvent*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[SupportedErrorEvent]): Self = this.set("errors", value.asInstanceOf[js.Any])
  }
  
}

