package typings
package officeDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnWidth extends js.Object {
  var columnWidth: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ColumnWidth {
  @scala.inline
  def apply(columnWidth: js.UndefOr[scala.Boolean] = js.undefined): Anon_ColumnWidth = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnWidth)) __obj.updateDynamic("columnWidth")(columnWidth)
    __obj.asInstanceOf[Anon_ColumnWidth]
  }
}

