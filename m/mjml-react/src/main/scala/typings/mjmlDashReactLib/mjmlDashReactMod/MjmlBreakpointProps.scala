package typings
package mjmlDashReactLib.mjmlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlBreakpointProps extends js.Object {
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object MjmlBreakpointProps {
  @scala.inline
  def apply(width: java.lang.String | scala.Double = null): MjmlBreakpointProps = {
    val __obj = js.Dynamic.literal()
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MjmlBreakpointProps]
  }
}

