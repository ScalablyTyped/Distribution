package typings.mjmlDashReact.mjmlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlBreakpointProps extends js.Object {
  var width: js.UndefOr[String | Double] = js.undefined
}

object MjmlBreakpointProps {
  @scala.inline
  def apply(width: String | Double = null): MjmlBreakpointProps = {
    val __obj = js.Dynamic.literal()
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MjmlBreakpointProps]
  }
}

