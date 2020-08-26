package typings.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetBreakpointReturnType extends js.Object {
  /**
    * Location this breakpoint resolved into.
    */
  var actualLocation: Location = js.native
  /**
    * Id of the created breakpoint for further reference.
    */
  var breakpointId: BreakpointId = js.native
}

object SetBreakpointReturnType {
  @scala.inline
  def apply(actualLocation: Location, breakpointId: BreakpointId): SetBreakpointReturnType = {
    val __obj = js.Dynamic.literal(actualLocation = actualLocation.asInstanceOf[js.Any], breakpointId = breakpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBreakpointReturnType]
  }
  @scala.inline
  implicit class SetBreakpointReturnTypeOps[Self <: SetBreakpointReturnType] (val x: Self) extends AnyVal {
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
    def setActualLocation(value: Location): Self = this.set("actualLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setBreakpointId(value: BreakpointId): Self = this.set("breakpointId", value.asInstanceOf[js.Any])
  }
  
}

