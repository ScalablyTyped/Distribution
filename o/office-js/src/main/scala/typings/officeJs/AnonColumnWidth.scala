package typings.officeJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnWidth extends js.Object {
  var columnWidth: js.UndefOr[Boolean] = js.undefined
}

object AnonColumnWidth {
  @scala.inline
  def apply(columnWidth: js.UndefOr[Boolean] = js.undefined): AnonColumnWidth = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnWidth)) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumnWidth]
  }
}

