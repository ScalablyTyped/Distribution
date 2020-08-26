package typings.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepIntoParameterType extends js.Object {
  /**
    * Debugger will issue additional Debugger.paused notification if any async task is scheduled before next pause.
    * @experimental
    */
  var breakOnAsyncCall: js.UndefOr[Boolean] = js.native
}

object StepIntoParameterType {
  @scala.inline
  def apply(): StepIntoParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepIntoParameterType]
  }
  @scala.inline
  implicit class StepIntoParameterTypeOps[Self <: StepIntoParameterType] (val x: Self) extends AnyVal {
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
    def setBreakOnAsyncCall(value: Boolean): Self = this.set("breakOnAsyncCall", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakOnAsyncCall: Self = this.set("breakOnAsyncCall", js.undefined)
  }
  
}

