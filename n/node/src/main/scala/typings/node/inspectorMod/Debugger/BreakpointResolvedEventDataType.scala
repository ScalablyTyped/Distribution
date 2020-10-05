package typings.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreakpointResolvedEventDataType extends js.Object {
  /**
    * Breakpoint unique identifier.
    */
  var breakpointId: BreakpointId = js.native
  /**
    * Actual breakpoint location.
    */
  var location: Location = js.native
}

object BreakpointResolvedEventDataType {
  @scala.inline
  def apply(breakpointId: BreakpointId, location: Location): BreakpointResolvedEventDataType = {
    val __obj = js.Dynamic.literal(breakpointId = breakpointId.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakpointResolvedEventDataType]
  }
  @scala.inline
  implicit class BreakpointResolvedEventDataTypeOps[Self <: BreakpointResolvedEventDataType] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
  }
  
}

