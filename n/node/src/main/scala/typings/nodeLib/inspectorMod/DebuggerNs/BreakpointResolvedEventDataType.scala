package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreakpointResolvedEventDataType extends js.Object {
  /**
    * Breakpoint unique identifier.
    */
  var breakpointId: BreakpointId
  /**
    * Actual breakpoint location.
    */
  var location: Location
}

object BreakpointResolvedEventDataType {
  @scala.inline
  def apply(breakpointId: BreakpointId, location: Location): BreakpointResolvedEventDataType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("breakpointId")(breakpointId)
    __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[BreakpointResolvedEventDataType]
  }
}

