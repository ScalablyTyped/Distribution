package typings.atOracleOraclejet.ojmenuMod.ojMenuNs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait OpenOptions extends js.Object {
  var display: js.UndefOr[String] = js.undefined
  var initialFocus: js.UndefOr[String] = js.undefined
  var launcher: js.UndefOr[String | Element] = js.undefined
  var position: js.UndefOr[Position] = js.undefined
}

object OpenOptions {
  @scala.inline
  def apply(
    display: String = null,
    initialFocus: String = null,
    launcher: String | Element = null,
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

