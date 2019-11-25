package typings.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPossibleBreakpointsParameterType extends js.Object {
  /**
    * End of range to search possible breakpoint locations in (excluding). When not specified, end of scripts is used as end of range.
    */
  var end: js.UndefOr[Location] = js.undefined
  /**
    * Only consider locations which are in the same (non-nested) function as start.
    */
  var restrictToFunction: js.UndefOr[Boolean] = js.undefined
  /**
    * Start of range to search possible breakpoint locations in.
    */
  var start: Location
}

object GetPossibleBreakpointsParameterType {
  @scala.inline
  def apply(start: Location, end: Location = null, restrictToFunction: js.UndefOr[Boolean] = js.undefined): GetPossibleBreakpointsParameterType = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(restrictToFunction)) __obj.updateDynamic("restrictToFunction")(restrictToFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPossibleBreakpointsParameterType]
  }
}

