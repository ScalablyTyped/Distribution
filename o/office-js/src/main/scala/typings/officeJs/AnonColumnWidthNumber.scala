package typings.officeJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnWidthNumber extends js.Object {
  var columnWidth: js.UndefOr[Double] = js.undefined
}

object AnonColumnWidthNumber {
  @scala.inline
  def apply(columnWidth: Int | Double = null): AnonColumnWidthNumber = {
    val __obj = js.Dynamic.literal()
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumnWidthNumber]
  }
}

