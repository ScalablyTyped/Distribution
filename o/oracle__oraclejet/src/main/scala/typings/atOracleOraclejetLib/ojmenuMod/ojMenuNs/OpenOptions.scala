package typings
package atOracleOraclejetLib.ojmenuMod.ojMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait OpenOptions extends js.Object {
  var display: js.UndefOr[java.lang.String] = js.undefined
  var initialFocus: js.UndefOr[java.lang.String] = js.undefined
  var launcher: js.UndefOr[java.lang.String | stdLib.Element] = js.undefined
  var position: js.UndefOr[Position] = js.undefined
}

object OpenOptions {
  @scala.inline
  def apply(
    display: java.lang.String = null,
    initialFocus: java.lang.String = null,
    launcher: java.lang.String | stdLib.Element = null,
    position: Position = null
  ): OpenOptions = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display)
    if (initialFocus != null) __obj.updateDynamic("initialFocus")(initialFocus)
    if (launcher != null) __obj.updateDynamic("launcher")(launcher.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[OpenOptions]
  }
}

