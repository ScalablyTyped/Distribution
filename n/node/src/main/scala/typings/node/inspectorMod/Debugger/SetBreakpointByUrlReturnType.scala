package typings.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetBreakpointByUrlReturnType extends js.Object {
  /**
    * Id of the created breakpoint for further reference.
    */
  var breakpointId: BreakpointId = js.native
  /**
    * List of the locations this breakpoint resolved into upon addition.
    */
  var locations: js.Array[Location] = js.native
}

object SetBreakpointByUrlReturnType {
  @scala.inline
  def apply(breakpointId: BreakpointId, locations: js.Array[Location]): SetBreakpointByUrlReturnType = {
    val __obj = js.Dynamic.literal(breakpointId = breakpointId.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBreakpointByUrlReturnType]
  }
  @scala.inline
  implicit class SetBreakpointByUrlReturnTypeOps[Self <: SetBreakpointByUrlReturnType] (val x: Self) extends AnyVal {
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
    def setLocationsVarargs(value: Location*): Self = this.set("locations", js.Array(value :_*))
    @scala.inline
    def setLocations(value: js.Array[Location]): Self = this.set("locations", value.asInstanceOf[js.Any])
  }
  
}

