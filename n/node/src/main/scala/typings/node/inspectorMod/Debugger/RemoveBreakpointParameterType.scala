package typings.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveBreakpointParameterType extends js.Object {
  var breakpointId: BreakpointId = js.native
}

object RemoveBreakpointParameterType {
  @scala.inline
  def apply(breakpointId: BreakpointId): RemoveBreakpointParameterType = {
    val __obj = js.Dynamic.literal(breakpointId = breakpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveBreakpointParameterType]
  }
  @scala.inline
  implicit class RemoveBreakpointParameterTypeOps[Self <: RemoveBreakpointParameterType] (val x: Self) extends AnyVal {
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
    def setBreakpointId(value: BreakpointId): Self = this.set("breakpointId", value.asInstanceOf[js.Any])
  }
  
}

