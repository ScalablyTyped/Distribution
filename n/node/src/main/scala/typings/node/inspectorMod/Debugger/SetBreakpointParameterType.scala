package typings.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetBreakpointParameterType extends js.Object {
  /**
    * Expression to use as a breakpoint condition. When specified, debugger will only stop on the breakpoint if this expression evaluates to true.
    */
  var condition: js.UndefOr[String] = js.undefined
  /**
    * Location to set breakpoint in.
    */
  var location: Location
}

object SetBreakpointParameterType {
  @scala.inline
  def apply(location: Location, condition: String = null): SetBreakpointParameterType = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBreakpointParameterType]
  }
}

