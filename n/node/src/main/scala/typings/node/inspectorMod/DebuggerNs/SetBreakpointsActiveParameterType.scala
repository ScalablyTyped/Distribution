package typings.node.inspectorMod.DebuggerNs

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
    val __obj = js.Dynamic.literal(active = active)
  
    __obj.asInstanceOf[SetBreakpointsActiveParameterType]
  }
}

