package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.CallArgument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetReturnValueParameterType extends js.Object {
  /**
    * New return value.
    */
  var newValue: CallArgument = js.native
}

object SetReturnValueParameterType {
  @scala.inline
  def apply(newValue: CallArgument): SetReturnValueParameterType = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetReturnValueParameterType]
  }
  @scala.inline
  implicit class SetReturnValueParameterTypeOps[Self <: SetReturnValueParameterType] (val x: Self) extends AnyVal {
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
    def setNewValue(value: CallArgument): Self = this.set("newValue", value.asInstanceOf[js.Any])
  }
  
}

