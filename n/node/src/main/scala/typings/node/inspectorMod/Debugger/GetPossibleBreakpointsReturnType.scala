package typings.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPossibleBreakpointsReturnType extends js.Object {
  /**
    * List of the possible breakpoint locations.
    */
  var locations: js.Array[BreakLocation]
}

object GetPossibleBreakpointsReturnType {
  @scala.inline
  def apply(locations: js.Array[BreakLocation]): GetPossibleBreakpointsReturnType = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetPossibleBreakpointsReturnType]
  }
}

