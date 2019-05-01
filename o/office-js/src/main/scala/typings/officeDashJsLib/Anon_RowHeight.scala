package typings
package officeDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RowHeight extends js.Object {
  var rowHeight: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_RowHeight {
  @scala.inline
  def apply(rowHeight: js.UndefOr[scala.Boolean] = js.undefined): Anon_RowHeight = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rowHeight)) __obj.updateDynamic("rowHeight")(rowHeight)
    __obj.asInstanceOf[Anon_RowHeight]
  }
}

