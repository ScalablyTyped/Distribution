package typings.officeJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRowHeightNumber extends js.Object {
  var rowHeight: js.UndefOr[Double] = js.undefined
}

object AnonRowHeightNumber {
  @scala.inline
  def apply(rowHeight: Int | Double = null): AnonRowHeightNumber = {
    val __obj = js.Dynamic.literal()
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRowHeightNumber]
  }
}

