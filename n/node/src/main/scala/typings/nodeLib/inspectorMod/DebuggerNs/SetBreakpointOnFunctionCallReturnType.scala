package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetBreakpointOnFunctionCallReturnType extends js.Object {
  /**
    * Id of the created breakpoint for further reference.
    */
  var breakpointId: BreakpointId
}

object SetBreakpointOnFunctionCallReturnType {
  @scala.inline
  def apply(breakpointId: BreakpointId): SetBreakpointOnFunctionCallReturnType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("breakpointId")(breakpointId)
    __obj.asInstanceOf[SetBreakpointOnFunctionCallReturnType]
  }
}

