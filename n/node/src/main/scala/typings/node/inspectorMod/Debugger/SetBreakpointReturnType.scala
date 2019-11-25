package typings.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetBreakpointReturnType extends js.Object {
  /**
    * Location this breakpoint resolved into.
    */
  var actualLocation: Location
  /**
    * Id of the created breakpoint for further reference.
    */
  var breakpointId: BreakpointId
}

object SetBreakpointReturnType {
  @scala.inline
  def apply(actualLocation: Location, breakpointId: BreakpointId): SetBreakpointReturnType = {
    val __obj = js.Dynamic.literal(actualLocation = actualLocation.asInstanceOf[js.Any], breakpointId = breakpointId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SetBreakpointReturnType]
  }
}

