package typings.officeDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RowHeightNumber extends js.Object {
  var rowHeight: js.UndefOr[Double] = js.undefined
}

object Anon_RowHeightNumber {
  @scala.inline
  def apply(rowHeight: Int | Double = null): Anon_RowHeightNumber = {
    val __obj = js.Dynamic.literal()
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RowHeightNumber]
  }
}

