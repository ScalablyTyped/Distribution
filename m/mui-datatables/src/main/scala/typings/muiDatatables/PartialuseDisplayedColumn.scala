package typings.muiDatatables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  useDisplayedColumnsOnly  :boolean,   useDisplayedRowsOnly  :boolean}> */
trait PartialuseDisplayedColumn extends js.Object {
  var useDisplayedColumnsOnly: js.UndefOr[Boolean] = js.undefined
  var useDisplayedRowsOnly: js.UndefOr[Boolean] = js.undefined
}

object PartialuseDisplayedColumn {
  @scala.inline
  def apply(
    useDisplayedColumnsOnly: js.UndefOr[Boolean] = js.undefined,
    useDisplayedRowsOnly: js.UndefOr[Boolean] = js.undefined
  ): PartialuseDisplayedColumn = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useDisplayedColumnsOnly)) __obj.updateDynamic("useDisplayedColumnsOnly")(useDisplayedColumnsOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(useDisplayedRowsOnly)) __obj.updateDynamic("useDisplayedRowsOnly")(useDisplayedRowsOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialuseDisplayedColumn]
  }
}

