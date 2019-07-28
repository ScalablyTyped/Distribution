package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookTableSort extends Entity {
  // Represents the current conditions used to last sort the table. Read-only.
  var fields: js.UndefOr[js.Array[WorkbookSortField]] = js.undefined
  // Represents whether the casing impacted the last sort of the table. Read-only.
  var matchCase: js.UndefOr[Boolean] = js.undefined
  /**
    * Represents Chinese character ordering method last used to sort the table. The possible values are: PinYin, StrokeCount.
    * Read-only.
    */
  var method: js.UndefOr[String] = js.undefined
}

object WorkbookTableSort {
  @scala.inline
  def apply(
    fields: js.Array[WorkbookSortField] = null,
    id: String = null,
    matchCase: js.UndefOr[Boolean] = js.undefined,
    method: String = null
  ): WorkbookTableSort = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(matchCase)) __obj.updateDynamic("matchCase")(matchCase)
    if (method != null) __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[WorkbookTableSort]
  }
}

