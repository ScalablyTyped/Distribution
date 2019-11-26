package typings.officeDashJsDashPreview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnWidth extends js.Object {
  var columnWidth: js.UndefOr[Boolean] = js.undefined
}

object Anon_ColumnWidth {
  @scala.inline
  def apply(columnWidth: js.UndefOr[Boolean] = js.undefined): Anon_ColumnWidth = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnWidth)) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColumnWidth]
  }
}

