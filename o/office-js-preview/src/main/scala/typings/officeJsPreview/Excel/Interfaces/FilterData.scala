package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.FilterCriteria
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `filter.toJSON()`. */
trait FilterData extends js.Object {
  /**
    *
    * The currently applied filter on the given column. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  var criteria: js.UndefOr[FilterCriteria] = js.undefined
}

object FilterData {
  @scala.inline
  def apply(criteria: FilterCriteria = null): FilterData = {
    val __obj = js.Dynamic.literal()
    if (criteria != null) __obj.updateDynamic("criteria")(criteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterData]
  }
}

