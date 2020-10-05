package typings.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPossibleBreakpointsReturnType extends js.Object {
  /**
    * List of the possible breakpoint locations.
    */
  var locations: js.Array[BreakLocation] = js.native
}

object GetPossibleBreakpointsReturnType {
  @scala.inline
  def apply(locations: js.Array[BreakLocation]): GetPossibleBreakpointsReturnType = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPossibleBreakpointsReturnType]
  }
  @scala.inline
  implicit class GetPossibleBreakpointsReturnTypeOps[Self <: GetPossibleBreakpointsReturnType] (val x: Self) extends AnyVal {
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
    def setLocationsVarargs(value: BreakLocation*): Self = this.set("locations", js.Array(value :_*))
    @scala.inline
    def setLocations(value: js.Array[BreakLocation]): Self = this.set("locations", value.asInstanceOf[js.Any])
  }
  
}

