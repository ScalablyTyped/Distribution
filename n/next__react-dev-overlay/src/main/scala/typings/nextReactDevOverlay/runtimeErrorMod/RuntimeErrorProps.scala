package typings.nextReactDevOverlay.runtimeErrorMod

import typings.nextReactDevOverlay.errorsMod.ReadyRuntimeError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuntimeErrorProps extends js.Object {
  var error: ReadyRuntimeError = js.native
}

object RuntimeErrorProps {
  @scala.inline
  def apply(error: ReadyRuntimeError): RuntimeErrorProps = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeErrorProps]
  }
  @scala.inline
  implicit class RuntimeErrorPropsOps[Self <: RuntimeErrorProps] (val x: Self) extends AnyVal {
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
    def setError(value: ReadyRuntimeError): Self = this.set("error", value.asInstanceOf[js.Any])
  }
  
}

