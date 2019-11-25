package typings.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetBreakpointsActiveParameterType extends js.Object {
  /**
    * New value for breakpoints active state.
    */
  var active: Boolean
}

object SetBreakpointsActiveParameterType {
  @scala.inline
  def apply(active: Boolean): SetBreakpointsActiveParameterType = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SetBreakpointsActiveParameterType]
  }
}

