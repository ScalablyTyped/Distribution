package typings.officeJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRowHeight extends js.Object {
  var rowHeight: js.UndefOr[Boolean] = js.undefined
}

object AnonRowHeight {
  @scala.inline
  def apply(rowHeight: js.UndefOr[Boolean] = js.undefined): AnonRowHeight = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rowHeight)) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRowHeight]
  }
}

