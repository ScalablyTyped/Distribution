package typings.officeDashJsDashPreview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RowHeight extends js.Object {
  var rowHeight: js.UndefOr[Boolean] = js.undefined
}

object Anon_RowHeight {
  @scala.inline
  def apply(rowHeight: js.UndefOr[Boolean] = js.undefined): Anon_RowHeight = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rowHeight)) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RowHeight]
  }
}

